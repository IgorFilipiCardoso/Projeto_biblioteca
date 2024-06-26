package Controller;

import DTO.UserDTO;
import Model.Entity.User;
import Model.Service.UserService;
import View.IView;
import View.PanelView;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    UserService service;
    IView view;

    public UserController(IView view) {
        service = new UserService();
        this.view = view;
    }

    public void createUser() {
        var user = view.readUser();

        if(user == null) {
            view.showMessage("Operação cancelada", "Operação cancelada");
        } else {
            try{
                view.alertScreen(service.insert(user.toDomain()));
            } catch (Exception e) {
                view.showMessage(e.getMessage(), "Erro ao criar usuário!");
            }
        }
    }

    public void userWithPenaltyes() {
        var user = UserDTO.toDomain(service.getPenalizedUsers());
        view.showUserWithPenality(user);
    }

}
