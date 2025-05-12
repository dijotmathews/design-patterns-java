package org.prateek.SOLIDPrinciples.LSP.dijo;

public class Main {

    public static void readAnyFile(Readable f){
        f.read();
    }
    public static void main(String[] args){
        ReadableFile rf = new ReadOnlyFile();
        rf.read();

        WritableFile wf = new WritableFile();
        wf.write();
        wf.read();

        readAnyFile(rf);
        readAnyFile(wf);

    }
}
