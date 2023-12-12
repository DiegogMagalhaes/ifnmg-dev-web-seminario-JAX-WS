package br.edu.ifnmg.rpgdice.service;


import java.util.Random;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.edu.ifnmg.rpgdice.service.RpgDiceService")
public class RpgDiceServiceImpl implements RpgDiceService {

	@Override
	public int roll20(Integer modify) {
		Random random = new Random();
		Integer roll = random.nextInt(20) +1;
		return roll + modify;
	}

}