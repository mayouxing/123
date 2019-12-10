package denglu;

import java.io.File;
import java.io.IOException;

public class Delu {
	public static void main(String[] args) {
		File f = new File("Class.txt");
		if(!f.exists())
		try {
			f.createNewFile();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		Delu1 de = new Delu1();
		Delu2 du = new Delu2();
		ComputerListener com = new ComputerListener();
		Class1 cla = new Class1();
		com.de1 = de;
		com.cla = cla;
		cla.com = com;
		com.du = du;
		de.com = com;
		du.com = com;
		du.Deluwindows(0);
		//du.get_Class();
		//de.windows();
		
	}

}
