package br.edu.ifnmg.rpgdice;

import br.edu.ifnmg.rpgdice.service.RpgDiceServiceImpl;
import jakarta.xml.ws.Endpoint;

public class App 
{
    public static void main( String[] args )
    {
    	RpgDiceServiceImpl diceServiceImpl =  new RpgDiceServiceImpl();
		Endpoint.publish("http://localhost:8080/service/rpgdice", diceServiceImpl);
		System.out.println("Service Publicado");
    }
}	
