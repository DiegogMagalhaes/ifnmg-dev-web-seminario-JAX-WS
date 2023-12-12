package br.edu.ifnmg.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;

import br.edu.ifnmg.client.service.RpgDiceService;

public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
        URL url = new URL("http://localhost:8080/service/rpgdice?wsdl");
        QName qname = new QName("http://service.rpgdice.ifnmg.edu.br/", "RpgDiceServiceImplService");
        
        Service service = Service.create(url,qname);
        RpgDiceService rpgDiceService = service.getPort(RpgDiceService.class);
        
        System.out.println("dado rolado foi: " + rpgDiceService.roll20(4));
    }
}
