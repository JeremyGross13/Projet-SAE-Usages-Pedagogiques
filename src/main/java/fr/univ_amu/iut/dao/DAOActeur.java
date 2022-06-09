package fr.univ_amu.iut.dao;

import fr.univ_amu.iut.model.Acteur;

import java.util.List;

public interface DAOActeur extends DAO<Acteur>{
    List<Acteur> findById(int id);

}
