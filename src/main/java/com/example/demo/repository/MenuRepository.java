package com.example.demo.repository;

<<<<<<< HEAD
import com.example.demo.model.Menu;
=======
import com.example.demo.dto.ProfilMenu;
import com.example.demo.model.Menu;
import org.springframework.data.domain.Page;
>>>>>>> 8c493b383944aaf7cef5c17ad6eb5d1afec31270
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

<<<<<<< HEAD
import java.util.List;
public interface MenuRepository extends JpaRepository<Menu, Long> {

    @Query(nativeQuery = true, value = "SELECT *   FROM tp_menu_item  where profil_id= :profilId ORDER BY priorite ASC ")
    List<Menu> getMenuByProfil(@Param("profilId") Long id);
=======
import javax.persistence.criteria.From;
import java.util.List;
public interface MenuRepository extends JpaRepository<Menu, Long> {

    @Query(nativeQuery = true, value = "SELECT new com.example.demo.dto.ProfilMenu(m.libelle, p.nom) FROM Profil p, Menu m where p.id = m.profil_id")
    List<ProfilMenu> getJoinInformation(@Param("p.id") Long id);
>>>>>>> 8c493b383944aaf7cef5c17ad6eb5d1afec31270
    List<Menu> findAll();
}
