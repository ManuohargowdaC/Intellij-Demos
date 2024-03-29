package com.inter;

public class ZipCompressor implements ICompressor {
    @Override
    public String[] compressorFile(String file1, String file2) {
        String[] ZippedFile = new String[2];
        ZippedFile[0]=file1;
        ZippedFile[1]=file2;
        return ZippedFile;
    }

    @Override
    public void showGames(String type) {

    }

    @Override
    public void showActivity() {

    }
}
