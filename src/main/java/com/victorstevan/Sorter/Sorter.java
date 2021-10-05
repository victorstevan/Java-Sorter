package com.victorstevan.Sorter;

import com.victorstevan.Model.SortingSystem;
import com.victorstevan.Services.FileService;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Sorter {
    final Map<String, SortingSystem> sortingSystems;
    final String directoryPathToSort;
    final FileService fileService;


    public Sorter(Map<String, SortingSystem> sortingSystems, String directoryPathToSort, FileService fileService) {
        this.sortingSystems = sortingSystems;
        this.directoryPathToSort = directoryPathToSort;
        this.fileService = fileService;
    }

    public void sort(){
        List<File> files = fileService.getListOfFilesFromDirectory(directoryPathToSort);
        for(File file : files){
            String fileExtension = FilenameUtils.getExtension(file.getName());
            for(SortingSystem type : sortingSystems.values()){
                if(type.getExtensions().contains(fileExtension)){
                    File dir = new File(directoryPathToSort + type.getRelativePath());
                    if(!dir.exists()){
                        dir.mkdir();
                    }
                    fileService.moveFile(file.getPath(), directoryPathToSort + type.getRelativePath());
                }
            }


        }
    }
}
