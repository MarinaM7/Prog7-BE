package com.marina.Progetto7.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marina.Progetto7.models.CentroControllo;
import com.marina.Progetto7.models.Sonda;

@RestController
@RequestMapping("/app")
public class AppController {
	
	@GetMapping("/controllo/{num}")
	public String sonde(@PathVariable int num) {
		
		Sonda s1_1 = Sonda.builder().latitudine("45.4077172").longitudine("11.8734455").fireLevel(2).build();
		Sonda s1_2 = Sonda.builder().latitudine("45.4641943").longitudine("9.1896346").fireLevel(3).build();
		Sonda s1_3 = Sonda.builder().latitudine("40.8358846").longitudine("14.2487679").fireLevel(6).build();
		
		Sonda s2_1 = Sonda.builder().latitudine("41.3828939").longitudine("2.1774322").fireLevel(1).build();
		Sonda s2_2 = Sonda.builder().latitudine("40.4167047").longitudine("-3.7035825").fireLevel(8).build();
		Sonda s2_3 = Sonda.builder().latitudine("38.7077507").longitudine("-9.1365919").fireLevel(5).build();
		
		Sonda s3_1 = Sonda.builder().latitudine("40.7127281").longitudine("-74.0060152").fireLevel(7).build();
		Sonda s3_2 = Sonda.builder().latitudine("25.7741728").longitudine("-80.19362").fireLevel(9).build();
		Sonda s3_3 = Sonda.builder().latitudine("34.0536909").longitudine("-118.242766").fireLevel(4).build();
		
		List<Sonda> processoControllo_1 = new ArrayList<>() {{
			add(s1_1);
			add(s1_2);
			add(s1_3);
		}};
		
		List<Sonda> processoControllo_2 = new ArrayList<>() {{
			add(s2_1);
			add(s2_2);
			add(s2_3);
		}};
		
		List<Sonda> processoControllo_3 = new ArrayList<>() {{
			add(s3_1);
			add(s3_2);
			add(s3_3);
		}};
		
		CentroControllo c1 = processo(processoControllo_1);
		CentroControllo c2 = processo(processoControllo_2);
		CentroControllo c3 = processo(processoControllo_3);
		
		String sonde = " ";
		
		switch(num) {
		case 0: 
			sonde = "Tutti i Centri di Controllo || ";
			for(Sonda s : c1.getFires()) {
				sonde += "🚨ALLARME --> http://localhost/alarm?=lat=" + s.getLatitudine() + "&lon=" + s.getLongitudine() + "&smokelevel" + s.getFireLevel();
			}
			for(Sonda s : c2.getFires()) {
				sonde += "🚨ALLARME --> http://localhost/alarm?=lat=" + s.getLatitudine() + "&lon=" + s.getLongitudine() + "&smokelevel" + s.getFireLevel();
			}
			for(Sonda s : c3.getFires()) {
				sonde += "🚨ALLARME --> http://localhost/alarm?=lat=" + s.getLatitudine() + "&lon=" + s.getLongitudine() + "&smokelevel" + s.getFireLevel();
			}
				break;
		case 1: 
			sonde = "Centro di Controllo 1 || ";
			for(Sonda s : c1.getFires()) {
				sonde += "🚨ALLARME --> http://localhost/alarm?=lat=" + s.getLatitudine() + "&lon=" + s.getLongitudine() + "&smokelevel" + s.getFireLevel();
			}
			break;
		case 2:
			sonde = "Centro di Controllo 2 || ";
			for(Sonda s : c2.getFires()) {
				sonde += "🚨ALLARME --> http://localhost/alarm?=lat=" + s.getLatitudine() + "&lon=" + s.getLongitudine() + "&smokelevel" + s.getFireLevel();
			}
			break;
		case 3 :
			sonde = "Centro di Controllo 3 || ";
			for(Sonda s : c3.getFires()) {
				sonde += "🚨ALLARME --> http://localhost/alarm?=lat=" + s.getLatitudine() + "&lon=" + s.getLongitudine() + "&smokelevel" + s.getFireLevel();
			}
			break;
			
		default:
			sonde = "I centri di controllo sono solo 3, per visualizzarli tutti inserisci 0";
		
		}
		return sonde;
		
	}
	
	public CentroControllo processo(List<Sonda> sonde) {
		
		List<Sonda> fires = sonde.stream().filter(p -> p.getFireLevel() > 5).toList();		
		List<Sonda> safe = sonde.stream().filter(p -> p.getFireLevel() <= 5).toList();	
		
		return CentroControllo.builder().safe(safe).fires(fires).build();
	}
	
}
