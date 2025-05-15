package org.gestiondestitresimportationbcp.service;

import org.gestiondestitresimportationbcp.entities.Banque;
import org.gestiondestitresimportationbcp.models.BanqueId;
import org.gestiondestitresimportationbcp.models.DemandeDomiciliationMessage;
import org.gestiondestitresimportationbcp.repositories.BanqueRepository;
import org.gestiondestitresimportationbcp.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankServicesDefault  implements BanqueServices{
    @Autowired
    BanqueRepository banqueRepository;


    @Override
    public void insertBank(DemandeDomiciliationMessage demandeDomiciliationMessage) {
         Banque banque = demandeDomiciliationMessage.getBanque();
        BanqueId id = new BanqueId(demandeDomiciliationMessage.getBanque().getCodeBanque(),demandeDomiciliationMessage.getTitre().getNumEnregistrement());
        banque.getTitreImportations().add(demandeDomiciliationMessage.getTitre());
        demandeDomiciliationMessage.getBanque().setIdBanque(id);
         banqueRepository.save(banque);
    }

    @Override
    public List<Banque> selectBanks() {
        return banqueRepository.findAll();
    }
}
