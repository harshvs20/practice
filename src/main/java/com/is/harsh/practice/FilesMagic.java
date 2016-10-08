package com.is.harsh.practice;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by hshrivastava on 9/28/16.
 */
public class FilesMagic {

    public static void main(String[] args) {
        readMillionFiles();
    }

    private static void readMillionFiles(){
        try{
            Path path = Paths.get("/Users/hshrivastava/Downloads/pg100.txt");
            RandomAccessFile randomAccessFile = new RandomAccessFile("/Users/hshrivastava/Downloads/pg100.txt","rw");
            FileChannel channel = randomAccessFile.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(48);
            int byteRead = channel.read(buffer);
            while (byteRead != -1){
                System.out.println("Read " + byteRead);
                buffer.flip();
                while(buffer.hasRemaining()){
                    System.out.print((char) buffer.get());
                }

                buffer.clear();
                byteRead = channel.read(buffer);
            }
            channel.close();
        }catch (Exception e){
            System.out.print("Exception " + e);
        }
    }

}
