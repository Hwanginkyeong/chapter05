package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception{ //원래는 try catch로 해야함 
		
		InputStream in = new FileInputStream("/Users/hwanginkyeong/javaStudy/file/img.jpg");
		OutputStream out = new FileOutputStream("/Users/hwanginkyeong/javaStudy/file/byteimg.jpg"); //이미 올린 이미지 겹치지 않게
		
		byte[] buff = new byte[1024];
		
		System.out.println("복사시작");
		while(true) {
			
			int data = in.read(buff);
			
			if(data == -1) {
				System.out.println("복사가 완료되었습니다." + -1);
				break;
			}
			out.write(buff);
			
		}
			
		
		
		
		
		
		/* 속도가 느림 
		 
		System.out.println("복사시작");
		while(true) {
			int data = in.read();
			if(data == -1) {
				System.out.println("복사가 완료되었습니다."+ data);
				break;
			}
			
			out.write(data);
		}
		*/

		
		
		
		
	}

}
