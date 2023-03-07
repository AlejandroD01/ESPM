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
import project.esmp.dto.DtoConnectors;
import project.esmp.service.IServiceConnectors;

/**
 * @author Ale
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/esmp/connectors")
public class ControllerConnectors {

    @Autowired
    IServiceConnectors iServiceConnectors;

    //tiene q ir primero q todos los demas metodos,
    //x el orden de los (Get,post,put,delete)
    @GetMapping
    public ResponseEntity<List<DtoConnectors>> listarConnectors() {
        return ResponseEntity.ok(iServiceConnectors.listar());
    }

    @PostMapping(path = "/{id}")
    public ResponseEntity<DtoConnectors> registrarConnectorsPorChargePoints(@RequestBody DtoConnectors dtoConnectors,
           @PathVariable("id") Integer id ) {
        return new ResponseEntity<>(iServiceConnectors.registrarPorChargePoints(dtoConnectors,id), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<DtoConnectors> actualizarConnectors(@RequestBody DtoConnectors dtoConnectors, @PathVariable("id") Integer id) {
        DtoConnectors dtoConnectorsAct = iServiceConnectors.actualizar(dtoConnectors, id);
        return new ResponseEntity<>(dtoConnectorsAct, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> eliminarConnectors(@PathVariable("id") Integer id) {
        iServiceConnectors.eliminar(id);
        return new ResponseEntity<>(" Conector eliminado con exito ", HttpStatus.OK);
    }
}
