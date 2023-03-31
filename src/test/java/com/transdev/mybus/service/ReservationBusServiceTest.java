package com.transdev.mybus.service;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.transdev.mybus.entities.Facture;

import com.transdev.mybus.repository.FactureRepository;

@SpringBootTest
class ReservationBusServiceTest {

	@Autowired
	ReservationBusService reservationBusService;

	@Autowired
	FactureRepository factureRepository;

	@Test
	void testPayReservation() {

	}

	@Test
	void testSaveFacture() {

		List<Facture> factures = factureRepository.findAll();

		int beforeCallMethode = factures.size();

		reservationBusService.saveFacture();

		int afterCallMethode = factures.size();

		Assertions.assertEquals(beforeCallMethode + 1, afterCallMethode);
	}

	@Test
	void testTrierFacture() {

		List<Facture> factures = new ArrayList<Facture>();
		factures = factureRepository.findAll().stream().sorted(Comparator.comparingLong(Facture::getFactureId))
				.collect(Collectors.toList());

		Assertions.assertEquals(reservationBusService.TrierFacture(), factures);

	}

}
