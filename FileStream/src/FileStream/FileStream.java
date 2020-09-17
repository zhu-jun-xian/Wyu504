package FileStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//ʹ���ļ�������myfile.txt�ļ�Ϊmyfile_cp.txt
public class FileStream {
	public static void main(String args[]) {
		copyFile("E://myfile.txt","E://myfile_cp.txt");
		
	}
	public static void copyFile(String srcFile,String destFile){

			//�ж�Դ�ļ�����Ŀ���ļ��Ƿ���ڣ�Ŀ���ļ��ɲ��жϣ������ļ������ڻᱨFileNotFoundException
			if(srcFile == null || destFile == null){
			  System.out.println("�ļ�������");
				   return;
			}
			else {
				System.out.println("�ļ�����");
			}
			//������Ӧ�Ĺܵ�������������������ڶ�ȡ��д�ļ�����
			FileReader fr = null;
			FileWriter fw = null;
			try{
				 fr = new FileReader(srcFile);
				 fw = new FileWriter(destFile);
			}catch(IOException e){
			  e.printStackTrace();
			}
			//��д����
			//����һ���ַ�������
			char [] c = new char[1024];
			//��¼�ļ�������λ�ã����ж����ַ�
			int len = 0;
			try{
				System.out.println("׼��copy");
			    while((len = fr.read(c))!= -1){
				//����ͬʱ����д
				fw.write(c,0,len);
				System.out.println(c);
			    }
			    System.out.println("copy�ɹ�");
			}catch (IOException e) {
				e.printStackTrace();
			}
			//�ر���Ӧ��Դ��һ��Ӻ���ǰ�أ����ڹ�֮ǰ��Ҫ�����жϣ���Ȼ���ܻᷢ����ָ���쳣
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


