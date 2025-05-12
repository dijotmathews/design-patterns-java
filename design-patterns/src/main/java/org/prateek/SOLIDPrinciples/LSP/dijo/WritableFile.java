package org.prateek.SOLIDPrinciples.LSP.dijo;

public class WritableFile extends ReadOnlyFile implements Writable{
    @Override
    public void write() {
        System.out.println("Writing a file.");
    }
}
