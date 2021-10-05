package com.victorstevan.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class VictorsSortingSystem {

    public static String myDownloadsDirectory = "C:\\Users\\victor.ribeiro\\Downloads";

    public static Map<String, SortingSystem> myPersonalSystem;
    static {
        myPersonalSystem = new HashMap<>();
        myPersonalSystem.put("Documentos", new SortingSystem("\\Dokumenter", new ArrayList<>(Arrays.asList("txt", "doc", "docx", "pdf"))));
        myPersonalSystem.put("Videos", new SortingSystem("\\Videoer", new ArrayList<>(Arrays.asList("mp4", "mov", "mkv", "webm"))));
        myPersonalSystem.put("Imagens", new SortingSystem("\\Bilder", new ArrayList<>(Arrays.asList("jpg", "jpeg", "png", "pdf", "webp"))));
        myPersonalSystem.put("Comprimidos", new SortingSystem("\\Komprimert", new ArrayList<>(Arrays.asList("zip", "rar", "tar", "gz"))));
        myPersonalSystem.put("Programas", new SortingSystem("\\Programvare", new ArrayList<>(Arrays.asList("exe", "apk", "msi"))));
    }
}
