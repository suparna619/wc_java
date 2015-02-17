public class WC {

	int countLength(String s){
		return s.length();
	}

	int countLines(String s){
		return s.split("\r\n").length;
	}

	int countWords(String s){
		int count = 0;
		for (String line: s.split("\r\n")){
			for (String spaces: line.split(" "))
				count++;
      	}
		return count;
	}
}