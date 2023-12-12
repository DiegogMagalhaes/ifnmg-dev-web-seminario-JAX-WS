package br.edu.ifnmg.seminario.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding (style = Style.RPC)
public interface RpgDiceService {

	@WebMethod
	public int roll20(Integer modify);
	
}
