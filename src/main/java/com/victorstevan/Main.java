package com.victorstevan;

import com.victorstevan.Model.SortingSystem;
import com.victorstevan.Model.VictorsSortingSystem;
import com.victorstevan.Services.FileService;
import com.victorstevan.Sorter.Sorter;

/**
 * @author: Victor Stevan Ribeiro | viktor.stevan1999@gmail.com
 *
 */


import java.util.*;

public class Main {
    // Ideally we should keep the main point of entrance even leaner that this
    // but this is fine for me
    public static void main(String[] args) {

        // Setup local environment from my computer and personal file organization system
        String victorDownloadPath = VictorsSortingSystem.myDownloadsDirectory;
        Map<String, SortingSystem> myPersonalSystem =  VictorsSortingSystem.myPersonalSystem;
        FileService fileService = new FileService();

        // Instantiate sorter service
        Sorter sorter = new Sorter(myPersonalSystem, victorDownloadPath, fileService);



        // Execute:
        sorter.sort();

        System.out.println("Done!");
    }
}

