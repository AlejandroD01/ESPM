package project.esmp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.esmp.dto.DtoUsers;
import project.esmp.service.IServiceUsers;


/** @author Ale*/
@RestController
@CrossOrigin("*")
@RequestMapping("/esmp/users")
public class ControllerUsers {

    @Autowired
    IServiceUsers iServiceUsers;

    //tiene q ir primero q todos los demas metodos,
    //x el orden de los (Get,post,put,delete)
    @GetMapping
    public ResponseEntity<List<DtoUsers>> listarUsers() {
        return ResponseEntity.ok(iServiceUsers.listar());
    }

    @PostMapping
    public ResponseEntity<DtoUsers> registrarUsers(@RequestBody DtoUsers dtoUsers) {
        return new ResponseEntity<>(iServiceUsers.registrar(dtoUsers), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<DtoUsers> actualizarUsers(@RequestBody DtoUsers dtoUsers, @PathVariable("id") Integer id) {
        DtoUsers dtoUsersAct = iServiceUsers.actualizar(dtoUsers, id);
        return new ResponseEntity<>(dtoUsersAct, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> eliminarUsers(@PathVariable("id") Integer id) {
        iServiceUsers.eliminar(id);
        return new ResponseEntity<>(" usuario eliminado con exito ", HttpStatus.OK);
    }
}
