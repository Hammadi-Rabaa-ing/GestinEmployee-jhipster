package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Fonction;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link Fonction}.
 */
public interface FonctionService {

    /**
     * Save a fonction.
     *
     * @param fonction the entity to save.
     * @return the persisted entity.
     */
    Fonction save(Fonction fonction);

    /**
     * Get all the fonctions.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<Fonction> findAll(Pageable pageable);


    /**
     * Get the "id" fonction.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Fonction> findOne(Long id);

    /**
     * Delete the "id" fonction.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
