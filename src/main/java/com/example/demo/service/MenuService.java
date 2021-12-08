package com.example.demo.service;

import com.example.demo.dto.MenuDto;
<<<<<<< HEAD
import com.example.demo.model.Menu;
=======
import com.example.demo.dto.ProfilMenu;
import com.example.demo.model.Menu;
import org.springframework.data.domain.Page;
>>>>>>> 8c493b383944aaf7cef5c17ad6eb5d1afec31270

import java.util.List;

public interface MenuService {

    Menu createMenu(MenuDto menuDto);
    Menu updateMenu(Long id, Menu menu);
    List<Menu> getListMenu();
<<<<<<< HEAD
    List<Menu> getMenuByProfil(Long id);
=======
    List<ProfilMenu> getJoinInformation(Long id);
>>>>>>> 8c493b383944aaf7cef5c17ad6eb5d1afec31270
    Menu getMenuById(Long id);
    void deleteMenuById(Long id);
}
