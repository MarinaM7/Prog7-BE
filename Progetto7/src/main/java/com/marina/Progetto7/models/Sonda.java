package com.marina.Progetto7.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sonda {

	private String latitudine;

	private String longitudine;
	
	private int fireLevel;
	
	public int checkFireLevel() {
		
		if(this.getFireLevel() > 5){
			return 1;
		}else {
			return 0;
		}
	}
	
}
