package org.prateek.SOLIDPrinciples.LSP.dijo;

public class ReadableFile implements Readable{
    @Override
    public void read() {
        System.out.println("Reading a file");
    }
}
