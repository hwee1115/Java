package ch18.exam19;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Example {   //���۸� �� ���ſ� ������ �ð� �� - ���۸� �Ⱦ��� 15��. ���۸� ���� 4�ʸ��� ī�ǰ� ��.

   public static void main(String[] args) throws Exception{
      String filePath = "D:\\MyProject\\Java\\src\\ch18\\exam19\\data.txt";
      OutputStream os = new FileOutputStream(filePath);//�̰� Writer������ �ؿ� PrintWriter�� �;� ��
                                          //�ݴ�� OutputStream�̸� PrintStream,PrintWriter �� �� ����
      String data1 = "�ȳ��ϼ���.";   
      String data2 = "���� ���Ŀ�.";
      
//      os.write(data1.getBytes());
//      os.write("\n".getBytes()); //���� 
//      os.write(data2.getBytes());
//      os.flush();
//      
//      os.close();
      
      
      //�� ���ٴ� �ؿ��� �� �����ϰ� ���� ���
      PrintWriter out = new PrintWriter(os);//PrintStream�� �ᵵ ���� 
      out.println(3);//�⺻ Ÿ��, ���ڿ� �� �� �� ����(�����ε�) - ������ �� �� � Ÿ���̵� �ڡڹ��ڿ��� ������ ��.
      out.println(data2);                        //���� ��Ʈ�� �̷��Ŵ� ����Ʈ�� ������ ��.
      out.flush();
      out.close();
   }

}