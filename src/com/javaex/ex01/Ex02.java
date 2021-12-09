package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream("/Users/hwanginkyeong/javaStudy/file/img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		OutputStream out = new FileOutputStream("/Users/hwanginkyeong/javaStudy/file/bufferedimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		while(true) {
			
			int data = bin.read();
			if(data == -1) {
				System.out.println("복사가 완료되었습니다."+ data);
				break;
			}
			
			bout.write(data);
		}
		
		
		bin.close();
		bout.close();
	}

}
