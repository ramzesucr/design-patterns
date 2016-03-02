package pt.kirill.designpatterns;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.nio.channels.Pipe;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Main {
    static int value;
    public static void main(String[] args) {
        System.out.println("State");
        System.out.println();

/*
        final Transaction transaction = new Transaction(1000);
        transaction.setAction(new Runnable() {
            @Override
            public void run() {
                transaction.setBalance(transaction.getBalance() - 100);
                transaction.setBalance(transaction.getBalance() - 200);
                transaction.setBalance(transaction.getBalance() + 300);
                if(Math.round(Math.random()) == 1) {
                    System.out.println("Buggy operation executed!");
                    throw new UnsupportedOperationException("Buggy operation");
                }
                transaction.setBalance(transaction.getBalance() - 800);
            }
        });
        transaction.start();*/
        final PipedReader pipedReader = new PipedReader(1024 * 4);
        PipedWriter writer = null;
        try {
            writer = new PipedWriter(pipedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        final PipedWriter pipedWriter = writer;

        new Thread(new Runnable() {
            @Override
            public void run() {
                int value;
                try {
                    while ((value = pipedReader.read()) != -1) {
                        System.out.println((char)value);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {

                    try {
                        pipedWriter.write((int)Math.round(Math.random() * ('Z' - 'A')) + 'A');
                        pipedWriter.flush();
                        System.out.println("Writing");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Thread2").start();
    }

}
