package exam2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Demo {

	public static void main(String[] args) {
		
//		Judge judge = new Judge("Sasho", 7, 1);
//		System.out.println(judge.getAgeOfService());
//
//		
//		 Lawyer l = new Lawyer("Canko", 12, 4);
//		 Lawyer p = new Lawyer("Ger", 15, 42);
//		 Lawyer q = new Lawyer("yure", 12, 14);
//		 Lawyer w = new Lawyer("kiko", 12, 34);
//		 
//		 Accuser pesho = new Accuser("Pesho", "Ivanov", "Todorov", "Pz", 20);
//		 pesho.addLawyers(l);
//		 pesho.addLawyers(p);
//		 pesho.addLawyers(q);
//		 pesho.addLawyers(w);
//		 
//		 Set<Lawyer> accuser1 = pesho.getLawyers();
//		 System.out.println(pesho.getLawyers());
//		 
		 
		Court court = new Court("Veliko Turnovo", "Na centura");
		
		Judge mincho = new Judge("Mincho", 10, 21);
		Judge dinko = new Judge("Dinko", 11, 23);
		Judge cona = new Judge("Cona", 13, 25);
		
		Juror cenko = new Juror("Cenko", 2, 12);
		Juror ancho = new Juror("Ancho", 3, 9);
		Juror kameliq = new Juror("Kameliq", 10, 1);
		Juror ginka = new Juror("Ginka", 12, 2);
		Juror slaveq = new Juror("Slaveq", 9, 3);
		Juror ocko = new Juror("Ocko", 8, 4);
		Juror gaco = new Juror("Gaco", 7, 5);
		Juror silviq = new Juror("Silviq", 6, 6);
		Juror ana = new Juror("Ana", 5, 7);
		Juror petko = new Juror("Petko", 4, 8);
		
		Lawyer avram = new Lawyer("Avram", 13, 12);
		Lawyer ivan = new Lawyer("Ivan", 23, 32);
		Lawyer kortenziq = new Lawyer("Kortenziq", 10, 6);
		Lawyer lukreciq = new Lawyer("Lukreciq", 11, 14);
		Lawyer sashko = new Lawyer("Sashko", 12, 15);
		
		PublicProsecutor toshko = new PublicProsecutor("Toshko", 14, 20);
		PublicProsecutor goshu = new PublicProsecutor("Goshuu", 8, 12);
         
		court.addJurists(mincho);court.addJurists(dinko);court.addJurists(cona);court.addJurists(cenko);
		court.addJurists(ancho);court.addJurists(kameliq);court.addJurists(ginka);court.addJurists(slaveq);
		court.addJurists(ocko);court.addJurists(gaco);court.addJurists(silviq);court.addJurists(ana);
		court.addJurists(petko);court.addJurists(avram);court.addJurists(kortenziq);court.addJurists(lukreciq);
		court.addJurists(sashko);court.addJurists(toshko);court.addJurists(goshu);
		
		Set<Jurist> jurists = court.getJurists();
				
//		   java.util.Iterator<Jurist> it = jurists.iterator();
//		    while( it.hasNext()){
//		    	System.out.println(it.next());
//		    }   
	    
		Accuser peter = new Accuser("Peter", "Ivanov", "Yordanov", "Sofiq", 21);
		Accuser iliq = new Accuser("Iliq", "Angelov", "Badjev", "Plovdiv", 32);
		Accuser kris = new Accuser("Kris", "Ivanov", "Gostev", "Septemvri", 21);
		Accuser muriq = new Accuser("Muriq", "Eftimova", "Ceneva", "Pazardjik", 19);
		Accuser ivo = new Accuser("Ivo", "Georgiev", "Yordanov", "Ivaylo", 45);
		
		Defendant delcho = new Defendant("Delcho", "Ivanov", "Minchev", "Kazablanka", 54);
		Defendant anastas = new Defendant("Anastas", "Petko", "Minchev", "Siriq", 34);
		Defendant penka = new Defendant("Penka", "Pencheva", "Pencheva", "Sinitevo", 75);
		Defendant mirka = new Defendant("Mirka", "Mircheva", "Mircheva", "Maroko", 20);
		Defendant koko = new Defendant("Koko", "Kokov", "Kakaov", "Maroko", 34);
		
		Witness shenka = new Witness("Shenka", "Alinova", "Penova", "Albaniq", 20);
		Witness guedalupe = new Witness("Guedalupe", "Alves", "Suarez", "Argentina", 23);
		Witness carlos = new Witness("Carlos", "Carlitos", "Carlitototonos", "Greece", 24);
		Witness aneliq = new Witness("Aneliq", "Alinova", "Ivanova", "Dinkata", 25);
		Witness krum = new Witness("Krum", "Tyukenov", "Tyukenov", "Albaniq", 26);
		Witness fibi = new Witness("Fibi", "Malinova", "Genova", "USA", 27);
		Witness joey = new Witness("Joey", "Ivanov", "Tribianey", "Italy", 28);
		Witness vili = new Witness("Vili", "Ivanova", "Goergieva", "Vetren Dol", 29);
		Witness badVanka = new Witness("Bad", "Vanka", "Golemece", "Nebeto", 30);
		Witness moshko = new Witness("Moshko", "Moshkov", "Moshkov", "Varvara", 31);
		
		CivilCase civilCase1 = new CivilCase(cona, koko, muriq);
		CivilCase civilCase2 = new CivilCase(dinko, mirka, kris);
		CivilCase civilCase3 = new CivilCase(mincho, anastas, iliq);
		
		civilCase1.addJurors(petko);civilCase1.addJurors(ana);civilCase1.addJurors(gaco);
		civilCase1.addWitnesses(moshko);civilCase1.addWitnesses(badVanka);
		
		 Set<Juror> civCase1Jurors = civilCase1.getJurors();
		 Set<Witness> civCase1Witness = civilCase1.getWitnesses();
		 
		
		civilCase2.addJurors(silviq);civilCase2.addJurors(ocko);civilCase2.addJurors(slaveq);
		civilCase2.addWitnesses(joey);civilCase2.addWitnesses(fibi);civilCase2.addWitnesses(carlos);

		 Set<Juror> civCase2Jurors = civilCase2.getJurors();
		 Set<Witness> civCase2Witness = civilCase2.getWitnesses();
		
		civilCase3.addJurors(ginka);civilCase3.addJurors(kameliq);civilCase3.addJurors(ancho);
		civilCase3.addWitnesses(krum);
		
		 Set<Juror> civCase3Jurors = civilCase3.getJurors();
		 Set<Witness> civCase3Witness = civilCase3.getWitnesses();
		 
		 CriminalCase criminalCase1 = new CriminalCase(mincho, anastas, toshko);
		 CriminalCase criminalCase2 = new CriminalCase(cona, delcho, goshu);
		 CriminalCase criminalCase3 = new CriminalCase(dinko, koko, toshko);
		 
		 criminalCase1.addJurors(cenko);criminalCase1.addJurors(silviq);criminalCase1.addJurors(ocko);
		 criminalCase1.addWitnesses(krum);criminalCase1.addWitnesses(guedalupe);
			
			 Set<Juror> crimCase1Jurors = criminalCase1.getJurors();
			 Set<Witness> crimCase1Witness = criminalCase1.getWitnesses();
		 
		
          civilCase1.conduct();
          civilCase2.conduct();
          civilCase3.conduct();
          
          criminalCase1.conduct();
          
          court.showAllJurists();
		 
	}
	
}
