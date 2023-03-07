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
import project.esmp.dto.DtoChargingSessions;
import project.esmp.service.IServiceChargingSessions;


/**
 * @author Ale
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/esmp/chargingSessions")
public class ControllerChargingSessions {

    @Autowired
    IServiceChargingSessions iServiceChargingSessions;

    //tiene q ir primero q todos los demas metodos,
    //x el orden de los (Get,post,put,delete)
    @GetMapping
    public ResponseEntity<List<DtoChargingSessions>> listarChargingSession() {
        return ResponseEntity.ok(iServiceChargingSessions.listar());
    }

    @PostMapping
    public ResponseEntity<DtoChargingSessions> registrarChargingSession(@RequestBody DtoChargingSessions dtoChargingSessions) {
        return new ResponseEntity<>(iServiceChargingSessions.registrar(dtoChargingSessions), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<DtoChargingSessions> actualizarChargingSession(@RequestBody DtoChargingSessions dtoChargingSessions, @PathVariable("id") Integer id) {
        DtoChargingSessions dtoChargingSessionsAct = iServiceChargingSessions.actualizar(dtoChargingSessions, id);
        return new ResponseEntity<>(dtoChargingSessionsAct, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> eliminarChargingSession(@PathVariable("id") Integer id) {
        iServiceChargingSessions.eliminar(id);
        return new ResponseEntity<>(" Sesion de carga eliminado con exito ", HttpStatus.OK);
    }
}
