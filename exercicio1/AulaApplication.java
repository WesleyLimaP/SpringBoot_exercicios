package com.devSuperior.aula.exercicio1;

import com.devSuperior.aula.exercicio1.entities.Pedido;
import com.devSuperior.aula.exercicio1.services.ValorTotal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {
	@Autowired
    private ValorTotal valorTotal;
	public Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("codigo");
		int codigo = scanner.nextInt();
		System.out.println("entre com o valor base ");
		double valorBase = scanner.nextDouble();
		System.out.println("entre com o valor do desconto a ser aplicado");
		double desconto = scanner.nextDouble();

		double total = valorTotal.valorTotoal(new Pedido(valorBase, desconto, codigo));
		System.out.println("codigo do pedido -> " + codigo);
		System.out.println("valor a ser pago -> " + total);

	}
}
