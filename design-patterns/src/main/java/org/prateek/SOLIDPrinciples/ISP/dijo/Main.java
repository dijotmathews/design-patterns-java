package org.prateek.SOLIDPrinciples.ISP.dijo;

public class Main {
    public static void main(String[] args) {
        Document d = new Document();

        SimplePrinter sp = new SimplePrinter();

        sp.print(d);


        MultiPurposeMachine mpm = new MultiPurposeMachine();

        mpm.scan(d);
    }
}
