package com.example.demo.service;

import com.example.demo.dto.MenuDto;
import com.example.demo.dto.ProfilMenu;
import com.example.demo.model.Menu;
import org.springframework.data.domain.Page;

import java.util.List;

public interface MenuService {

    Menu createMenu(MenuDto menuDto);
    Menu updateMenu(Long id, Menu menu);
    List<Menu> getListMenu();
    List<ProfilMenu> getJoinInformation(Long id);
    Menu getMenuById(Long id);
    void deleteMenuById(Long id);
}
