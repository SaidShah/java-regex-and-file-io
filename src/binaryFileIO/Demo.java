package binaryFileIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException{
		int[] numbers = {2,4,6,8,10,12,14};

		FileOutputStream fos = new FileOutputStream("numbers.dat");//.dat means binary and .txt means text file
																		// the true means you want to append and not replace
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Hello");// this is for writing strings and type
							//is important because it has to know the data type

	//	dos.writeInt(98457);

		for(int num: numbers){
			dos.writeInt(num);
			System.out.println(num + " ");

		}
		dos.writeUTF("Hi");

		System.out.println();
		dos.close();// close the data output stream

		boolean endOfFile = false;
		FileInputStream fis = new FileInputStream("numbers.dat");
		DataInputStream dis = new DataInputStream(fis);

		System.out.println(dis.readUTF());

			for (int i = 0; i < 7; i++) {
				System.out.println(dis.readInt());
			}
		System.out.println(dis.readUTF());
		endOfFile=true;
		dis.close();

	}

}
