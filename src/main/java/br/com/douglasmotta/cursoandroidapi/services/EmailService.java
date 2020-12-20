package br.com.douglasmotta.cursoandroidapi.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.douglasmotta.cursoandroidapi.domain.Cliente;
import br.com.douglasmotta.cursoandroidapi.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
