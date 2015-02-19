import java.io.*;

public class WC {

	public static int countCharacters(String s){
		return s.length();
	}

	public static int countLines(String s){
		char last_element_of_string = s.charAt(s.length()-1);
		int lines = s.split("\r\n").length;
		if(last_element_of_string != '\n')
			lines -= 1;
		return lines;
	}

	public static int countWords(String s){
		s = s.trim();
		s = s.replaceAll("\\s+", " ");
		int count = 0;
		for (String line: s.split("\r\n")){
			for (String spaces: line.split(" "))
				count++;
      	}
		return count;
	}

	public static String actual_WC(String s){
		String result;
		result = countLines(s)+"\t"+countWords(s)+"\t"+countCharacters(s);
		return result;
	}

	public static String readFile(String filePath){
		File file = new File(filePath);
		FileReader fr = null;

		try{
			fr = new FileReader(file);
		}catch(IOException e){}

		BufferedReader br = new BufferedReader(fr);
		int length = (int)file.length();
        char cbuf[] = new char[length];


		try{
        	br.read(cbuf,0,length);
		}catch(IOException e){}

		String s = String.valueOf(cbuf);

		return s;
	}

	public static void main(String[] args) {
		String s = readFile(args[0]);
		String result = actual_WC(s);
		System.out.println("\t"+result+" "+args[0]);
	}
}