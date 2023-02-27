package com.marina.Progetto7.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CentroControllo {

	private List <Sonda> safe;
	
	private List<Sonda> fires;
	
}
