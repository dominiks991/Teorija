// Komentārs - programmas koda daļa, kas palīdz programmas izstrādātājiem labāk izprast labāk izprast koda darbibas principus.
// Programmas darbības laikā komentāri netiek ņemti vērā.

// - Vienas rindas komentārs

/* Vairāku
 * rindu
 * komentārs
 */
 
package lv.jak.kudrjavcevs.sintakse;  //pakotne - klases atrašanās vieta projektā

// import komanda - komandarinda, kas nodrošina citas klases vai pakotnes piesaisti šai klasei.
// Tādā veidā tiek nodrošinātas dažādu funkciju izmantošanas iespējas šajā klasē, piemēram,
// datu ievade no tastatūras.
/*
 * Iespējamās pieraksta formas:
 * import <pakotne>.<Klase>;
 * import <pakotne>.*;
 */
import java.util.Scanner;

// JAVA klases daļa - galvenā programmēšanas daļa
// Sintakse - Klases nosaukums
/*
 * Sintakses nosacījumi uz klases nosaukumu
 *		1. Klases nosaukums sākas ar lielo burtu
 *		2. Ja klases nosaukums satur vairākus vārdus, katrs vārds sākas ar lielo burty
 *		3. Nosaukums var saturēt TIKAI BURTUS un CIPARUS!!!
 *		4. Ja klases nosaukums satur vairākus vārdus, tos ar atstarpēm NEATDALA!!!
 */
public class Sintakse {
	// Klases ķermenis - šajā daļā aprakstītais koda fragments ir pieejams visai klase,
	// izņēmuma nosacījums - aprakstītās lietas ir redzamas tikai tai daļai koda, kas atrodas zemāk!
	// !!! NEDRĪKST rakstīt funkcionālus procesus, izņemot vērtības piešķiršanu vai objekta izveidi!

	// Maingīgie - programmēšanas valodas pamatelements
	/*
	 * Sintakses nosacījumi uz mainīgā nosaukumu
	 * 		1. Mainīgā nosaukums sākas ar mazo burtu
	 * 		2. Ja mainīgā nosaukums satur vairākus vārdus, 
	 * 		pirmais vārds ar mazo, katrs nākamais vārds šakas ar lielo burtu
	 * 		3. Ja mainīgā nosaukums satur vairākus vārdus, tos ar atstarpēm NEATDALA!!!
	 * 		4. Nosaukums var saturēt TIKAI BURTUS vai CIPARUS!!!
	 * 
	 *  Izņēmuma gadījumi:
	 *		1.
	 *		2.
	 */
	// Mainīgā izveidošana
	/*
	 * Pieraksta forma:
	 * 		--> ja iepriekš mainīgais NAV izveidots:  <datuTips> <mainigaNosaukums>;
	 */
	int veselsSkaitlis;
	
	
	// metode MAIN - galvenā metodi.
	/*
	 * MAIN metode:
	 *  1. Uz projektu jābūt VISMAZ 1 MAIN metodei
	 *  2. Metodes pieraksts ir TIEŠI tāds, kā redzams zemāk pierakstā
	 */
	public static void main(String[] args) {
		//metodes ķermenis - aprakstam algoritmu, kuru vēlamies izpildīt
	}
	
	
// Klases ķermenis ir beidzies
}
// !!! NEKO ŠEIT NEDRĪkst RAKSTĪT.