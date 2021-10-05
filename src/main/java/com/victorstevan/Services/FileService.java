package com.victorstevan.Services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    public void moveFile(String currentPath, String newPath) {
        File file = new File(currentPath);

        String fileName = file.getName();

        /**
         * This is a bit gimmicky, the reason we do this interpolation in the new File name is that
         *the new path is only the directory path, and we use renaming to move a file between directories
         * So, when we rename a file to move it, the need to give the newPath and the name of the file
         *
         * Example:
         * the file is `currentPath = "C:\doc\file.txt`
         * the given new path is `newPath = "C:\doc\docs`
         * for the renaming we need the new name (moving the file) to be: `C:\doc\docs\file.txt`
         *  so we do: `newPath + \ + file.txt`
         */
        boolean didFileMoved = file.renameTo(new File(newPath + "\\" + fileName));

        // Tried to show a message in case some file didn't move. But the logic is flawed in someway
        // since it prints the error even when the file actually moved
        if (!didFileMoved) {
            System.out.println("An error occurred while trying to move the file: " + fileName +"!");

        }

        // If the file moved from one directory to another. Delete the file from the previous directory
        if (didFileMoved) {
            file.delete();
        }
    }

    // Get a list of files from a directory, it returns null if the File instantiated is not a directory
    public List<File> getListOfFilesFromDirectory(String directoryPath){
        var dir = new File(directoryPath);

        if(!dir.isDirectory()){
            System.out.println("Sorry, this doesn't seeem like a directory!");
            return null;
        }else {
            return filterFilesFromDirectory(dir);
        }
    }

    // A directory can have files and other directories, this private function ensures that we
    // pick only files and leave other directories alone.
    private List<File> filterFilesFromDirectory(File dir){
        List<File> fileList = new ArrayList<>();

        for(File file : dir.listFiles()){
            if(file.isFile()){
                fileList.add(file);
            }
        }

        return  fileList;
    }
}
