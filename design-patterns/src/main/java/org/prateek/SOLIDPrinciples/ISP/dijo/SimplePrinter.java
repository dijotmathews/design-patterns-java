package org.prateek.SOLIDPrinciples.ISP.dijo;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Printing document...");
    }

}
