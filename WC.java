public class WC {

	int countCharacters(String s){
		return s.length();
	}

	int countLines(String s){
		char last_element_of_string = s.charAt(s.length()-1);
		int lines = s.split("\r\n").length;
		if(lines == 1 && last_element_of_string != '\n')
			lines -= 1;
		return lines;
	}

	int countWords(String s){
		int count = 0;
		for (String line: s.split("\r\n")){
			for (String spaces: line.split(" "))
				count++;
      	}
		return count;
	}

	String actual_WC(String s){
		String result;
		result = countLines(s)+"\t"+countWords(s)+"\t"+countCharacters(s);
		return result;
	}
}