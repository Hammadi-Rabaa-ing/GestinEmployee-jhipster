package com.mycompany.myapp.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * A Employee.
 */
@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "nom", nullable = false)
    private String nom;

    @NotNull
    @Column(name = "prenom", nullable = false)
    private String prenom;

    @NotNull
    @Column(name = "date_naiss", nullable = false)
    private ZonedDateTime date_naiss;

    @NotNull
    @Column(name = "adresse", nullable = false)
    private String adresse;

    @NotNull
    @Column(name = "fonction", nullable = false)
    private String fonction;

    @NotNull
    @Column(name = "entreprise", nullable = false)
    private String entreprise;

    @OneToMany(mappedBy = "Employee_To_entreprise")
    private Set<Entreprise> entreprise_To_Employees = new HashSet<>();

    @OneToMany(mappedBy = "employee_to_fonction")
    private Set<Fonction> fonction_to_employees = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public Employee nom(String nom) {
        this.nom = nom;
        return this;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Employee prenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public ZonedDateTime getDate_naiss() {
        return date_naiss;
    }

    public Employee date_naiss(ZonedDateTime date_naiss) {
        this.date_naiss = date_naiss;
        return this;
    }

    public void setDate_naiss(ZonedDateTime date_naiss) {
        this.date_naiss = date_naiss;
    }

    public String getAdresse() {
        return adresse;
    }

    public Employee adresse(String adresse) {
        this.adresse = adresse;
        return this;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getFonction() {
        return fonction;
    }

    public Employee fonction(String fonction) {
        this.fonction = fonction;
        return this;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public Employee entreprise(String entreprise) {
        this.entreprise = entreprise;
        return this;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public Set<Entreprise> getEntreprise_To_Employees() {
        return entreprise_To_Employees;
    }

    public Employee entreprise_To_Employees(Set<Entreprise> entreprises) {
        this.entreprise_To_Employees = entreprises;
        return this;
    }

    public Employee addEntreprise_To_Employee(Entreprise entreprise) {
        this.entreprise_To_Employees.add(entreprise);
        entreprise.setEmployee_To_entreprise(this);
        return this;
    }

    public Employee removeEntreprise_To_Employee(Entreprise entreprise) {
        this.entreprise_To_Employees.remove(entreprise);
        entreprise.setEmployee_To_entreprise(null);
        return this;
    }

    public void setEntreprise_To_Employees(Set<Entreprise> entreprises) {
        this.entreprise_To_Employees = entreprises;
    }

    public Set<Fonction> getFonction_to_employees() {
        return fonction_to_employees;
    }

    public Employee fonction_to_employees(Set<Fonction> fonctions) {
        this.fonction_to_employees = fonctions;
        return this;
    }

    public Employee addFonction_to_employee(Fonction fonction) {
        this.fonction_to_employees.add(fonction);
        fonction.setEmployee_to_fonction(this);
        return this;
    }

    public Employee removeFonction_to_employee(Fonction fonction) {
        this.fonction_to_employees.remove(fonction);
        fonction.setEmployee_to_fonction(null);
        return this;
    }

    public void setFonction_to_employees(Set<Fonction> fonctions) {
        this.fonction_to_employees = fonctions;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }
        return id != null && id.equals(((Employee) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Employee{" +
            "id=" + getId() +
            ", nom='" + getNom() + "'" +
            ", prenom='" + getPrenom() + "'" +
            ", date_naiss='" + getDate_naiss() + "'" +
            ", adresse='" + getAdresse() + "'" +
            ", fonction='" + getFonction() + "'" +
            ", entreprise='" + getEntreprise() + "'" +
            "}";
    }
}
