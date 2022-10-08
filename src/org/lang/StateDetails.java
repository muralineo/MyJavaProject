package org.lang;

public class StateDetails {
	public void southIndia() {
		System.out.println("South India");
	}
	public void northIndia() {
		System.out.println("North India");
	}
	
	public static void main(String[] args) {
		LanguageInfo info = new LanguageInfo();
		info.tamilLanguage();
		info.englishLanguage();
		info.hindiLanguage();
		
		StateDetails details = new StateDetails();
		details.southIndia();
		details.northIndia();
		
	}

}
