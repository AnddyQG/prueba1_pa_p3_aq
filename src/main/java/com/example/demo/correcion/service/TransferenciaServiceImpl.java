package com.example.demo.correcion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.correcion.modelo.Cuenta;
import com.example.demo.correcion.modelo.Transferencia;
import com.example.demo.correcion.repository.ICuentaRepo;
import com.example.demo.correcion.repository.ITransferenciaRepo;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{

	@Autowired
	private ICuentaRepo cuentaRepo;
	@Autowired
	private ITransferenciaRepo iTransferenciaRepo;
	
	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		
		Cuenta origen= this.cuentaRepo.buscar(numeroOrigen);
		BigDecimal comision= monto.multiply(new BigDecimal(0.05));
		BigDecimal montoDebitar= monto.add(comision);
		
		BigDecimal saldoActualOrigen= origen.getSaldo();
		
		
	
		
		
	
		if(saldoActualOrigen.compareTo(montoDebitar)<0) {
			System.out.println("MONTO NO PERMITIDOOOO");
		}else {
			//se realiza la transferencia
			//origen
			
			origen.setSaldo(saldoActualOrigen.subtract(montoDebitar));
			this.cuentaRepo.actualizar(origen);
			

			//destinop
			Cuenta destino= this.cuentaRepo.buscar(numeroDestino);
			BigDecimal saldoActualDestino= destino.getSaldo();
			destino.setSaldo(saldoActualDestino.add(monto));
			this.cuentaRepo.actualizar(destino);
		
			
			//transferencia
			Transferencia transfer= new Transferencia();
			transfer.setComision(comision);
			transfer.setFecha(LocalDateTime.now());
			transfer.setMonto(monto);
			transfer.setNumeroDestino(numeroDestino);
			transfer.setNumeroOrigen(numeroOrigen);
			this.iTransferenciaRepo.insertar(transfer);
			
		}
		
		
		
	}

}
