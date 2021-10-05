package com.victorstevan.Model;

import java.util.List;

public class SortingSystem {
    final String relativePath;
    final List<String> extensions;

    public String getRelativePath() {
        return relativePath;
    }

    public List<String> getExtensions() {
        return extensions;
    }

    public SortingSystem(String relativePath, List<String> extensions) {
        this.relativePath = relativePath;
        this.extensions = extensions;
    }


}
