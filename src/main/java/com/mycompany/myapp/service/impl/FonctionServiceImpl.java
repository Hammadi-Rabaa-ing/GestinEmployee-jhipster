package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.service.FonctionService;
import com.mycompany.myapp.domain.Fonction;
import com.mycompany.myapp.repository.FonctionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Fonction}.
 */
@Service
@Transactional
public class FonctionServiceImpl implements FonctionService {

    private final Logger log = LoggerFactory.getLogger(FonctionServiceImpl.class);

    private final FonctionRepository fonctionRepository;

    public FonctionServiceImpl(FonctionRepository fonctionRepository) {
        this.fonctionRepository = fonctionRepository;
    }

    @Override
    public Fonction save(Fonction fonction) {
        log.debug("Request to save Fonction : {}", fonction);
        return fonctionRepository.save(fonction);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Fonction> findAll(Pageable pageable) {
        log.debug("Request to get all Fonctions");
        return fonctionRepository.findAll(pageable);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Fonction> findOne(Long id) {
        log.debug("Request to get Fonction : {}", id);
        return fonctionRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Fonction : {}", id);
        fonctionRepository.deleteById(id);
    }
}
