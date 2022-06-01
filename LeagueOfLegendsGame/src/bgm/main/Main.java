package bgm.main;
import bgm.main.*;
import bgm.models.*;

public class Main {

	public static void main(String[] args) {
			
		
		ADC cait = new ADC("caitlyn", "severe");
		ADC mf = new ADC ("MF", "middle");
		ADC twitch = new ADC ("twitch", " middle ");
		ADC ezreal = new ADC("ezreal" , "severe");
		
		Support sona = new Support("Sona", "healer");
		Support soraka = new Support ("Soraka", "healer");
		Support lulu = new Support ("lulu", " healer");
		Support yuumi = new Support("yuumi" , "healer");
		
		Jungler lee = new Jungler("lee sin");
		Jungler kha = new Jungler("khazix");
		Jungler rammus = new Jungler("rammuss");
		Jungler viego = new Jungler("viego");
		
		Top morde = new Top("mordekaiser");
		Top irelia = new Top("irelia");
		Top fiora = new Top("fiora");
		Top gwen = new Top("Gwen");
		
		System.out.println(ADC.getAdcs().toString());
		System.out.println(Support.getSups().toString());
		System.out.println(Top.getTops().toString());
		System.out.println(Jungler.getJungs().toString());
	
		
		Team team = new Team();
		
		System.out.println("the team created automatically is : " + team.createTeam() + " enemy team is :" + team.createEnemyTeam());

	}

}