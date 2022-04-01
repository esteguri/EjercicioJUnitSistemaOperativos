package com.sistema.operativo.sistemaOperativo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilesTest {

    @Test
    void fixFiles() {
        List<String> files = Arrays.asList( "photo", "postcard", "photo", "photo", "video");
        List<String> expectedFiles = Arrays.asList("photo", "postcard", "photo(1)", "photo(2)", "video");
        assertEquals(expectedFiles,Files.fixFiles(files));
    }

    @Test
    void fixFiles2() {
        List<String> files = Arrays.asList( "file", "file", "file", "game", "game");
        List<String> expectedFiles = Arrays.asList("file", "file(1)", "file(2)", "game", "game(1)");
        assertEquals(expectedFiles,Files.fixFiles(files));
    }

    @Test
    void fixFiles3() {
        List<String> files = Arrays.asList( "file", "file(1)", "icon", "icon(1)", "icon(1)");
        List<String> expectedFiles = Arrays.asList("file", "file(1)", "icon", "icon(1)", "icon(1)(1)");
        assertEquals(expectedFiles,Files.fixFiles(files));
    }
}