package com.sistema.operativo.sistemaOperativo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Files {

    public static List<String> fixFiles(List<String> files){

        Map<String, Integer> values = new HashMap<>();

        return files.stream().map(file -> {
            int count = values.get(file) != null ? values.get(file) + 1 : 0;
            values.put(file, count);
            return count > 0 ? file + "("+count +")" : file;
        }).collect(Collectors.toList());
    }

}
