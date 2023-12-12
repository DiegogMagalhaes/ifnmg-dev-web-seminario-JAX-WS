package br.edu.ifnmg.seminario;

import jakarta.xml.ws.Endpoint;
import br.edu.ifnmg.seminario.service.RpgDiceServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	RpgDiceServiceImpl diceServiceImpl =  new RpgDiceServiceImpl();
		Endpoint.publish("http://localhost:8080/service/rpgdice", diceServiceImpl);
    }
}	
