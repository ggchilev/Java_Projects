package dom2;

import java.util.Scanner;

public class Blank extends UseBlank {

	private String receiver;
	private String sender;
	private String typeOfDocument;
	private String freeText;
	
	
	public void setReceiver(String name) {
		receiver = name;
	}

	public String getReceiver() {
		return receiver;
		
	}

	public void setSender(String name2) {
		sender = name2;
	}

	public String getSender() {
		return sender;
	}

	public void setType(String var3) throws TypeException {
if (var3.equals("gramota1") || var3.equals("gramota2")){
	

		typeOfDocument = var3; 
}
else {
	throw new TypeException();
}
	}

	public String getType() {
		return typeOfDocument;
	}

	public void setFreeText(String text) {
		freeText = text;
	}

	public String getFreeText() {
		return freeText;
	}

	public String display() {
		return String.format(
				"                                                           До %s\n  "
						+ "                          %s\n                    "
						+ "            От %s\n\nУважаеми г-н/г-жо %s,\n%s\n        "
						+ "                                         С Уважение, \n"
						+ "                                           ________________\n    "
						+ "                                            /%s/",
				getReceiver(), getType(), getSender(), getReceiver(),
				getFreeText(), getSender());
	}

	public String toString() {
		return display();
	}
}
    