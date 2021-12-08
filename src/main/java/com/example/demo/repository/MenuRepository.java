package com.example.demo.repository;

import com.example.demo.dto.ProfilMenu;
import com.example.demo.model.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.From;
import java.util.List;
public interface MenuRepository extends JpaRepository<Menu, Long> {

    @Query(nativeQuery = true, value = "SELECT new com.example.demo.dto.ProfilMenu(m.libelle, p.nom) FROM Profil p, Menu m where p.id = m.profil_id")
    List<ProfilMenu> getJoinInformation(@Param("p.id") Long id);
    List<Menu> findAll();
}
