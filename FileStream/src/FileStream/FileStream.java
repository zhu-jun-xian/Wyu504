package FileStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//使用文件流复制myfile.txt文件为myfile_cp.txt
public class FileStream {
	public static void main(String args[]) {
		copyFile("E://myfile.txt","E://myfile_cp.txt");
		
	}
	public static void copyFile(String srcFile,String destFile){

			//判断源文件或者目标文件是否存在（目标文件可不判断），若文件不存在会报FileNotFoundException
			if(srcFile == null || destFile == null){
			  System.out.println("文件不存在");
				   return;
			}
			else {
				System.out.println("文件存在");
			}
			//创建相应的管道流，输入输出流，用于读取和写文件操作
			FileReader fr = null;
			FileWriter fw = null;
			try{
				 fr = new FileReader(srcFile);
				 fw = new FileWriter(destFile);
			}catch(IOException e){
			  e.printStackTrace();
			}
			//读写操作
			//创建一个字符缓冲区
			char [] c = new char[1024];
			//记录文件所读的位置，读有多少字符
			int len = 0;
			try{
				System.out.println("准备copy");
			    while((len = fr.read(c))!= -1){
				//读的同时进行写
				fw.write(c,0,len);
				System.out.println(c);
			    }
			    System.out.println("copy成功");
			}catch (IOException e) {
				e.printStackTrace();
			}
			//关闭相应资源，一般从后往前关，但在关之前先要做个判断，不然可能会发生空指针异常
			if(fw != null){
			try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
			}
		  }
		}
	}


