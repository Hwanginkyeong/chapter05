package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneApp {

	public static void main(String[] args) throws IOException  { //IO --> Input Output 
		
		Reader fr = new FileReader("/Users/hwanginkyeong/javaStudy/file/PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String line = br.readLine();	//한줄을 읽어라 
			
			if(line==null) { //문자열은null 이진수로 들어가면-1
				break;
			}
			String[] dataArray = line.split(","); //이제 자름 

			String name = dataArray[0];
			String hp = dataArray[1];
			String company = dataArray[2];
	
			System.out.println("이름: "+ name); //3개의 데이터를 가지고 있음 아직 쪼개지는 않음 
			System.out.println("핸드폰: "+ hp);
			System.out.println("회사: "+ company);
			System.out.println("");
		}
		
		
		br.close();	

	}

}
