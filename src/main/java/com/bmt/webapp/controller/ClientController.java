package com.bmt.webapp.controller;

import com.bmt.webapp.models.Client;
import com.bmt.webapp.repositories.ClientRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private final ClientRepositories clientRepositories;

    public ClientController(ClientRepositories clientRepositories) {
        this.clientRepositories = clientRepositories;
    }

    @GetMapping({"", "/"})
    public String getClients(Model model) {
        var clients = clientRepositories.findAll(Sort.by(Sort.Direction.DESC, "id"));
        model.addAttribute("clients", clients);
        return "clients/index"; // Ensuring this matches the Thymeleaf template name
    }
}
