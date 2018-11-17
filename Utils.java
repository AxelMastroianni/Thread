package concorrenza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils {
	
	public static String getString(InputStream is) {
		BufferedReader br=null;
		StringBuilder strb=new StringBuilder();
		
		String linea;
		try {
			br=new BufferedReader(new InputStreamReader(is));
			while((linea=br.readLine()) !=null) {
				strb.append(linea);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		return strb.toString();
	}

}
