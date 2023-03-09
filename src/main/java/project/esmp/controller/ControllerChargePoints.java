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
import project.esmp.dto.DtoChargePoints;
import project.esmp.service.IServiceChargePoints;

/**
 * @author Ale
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/esmp/chargePoints")
public class ControllerChargePoints {

    @Autowired
    IServiceChargePoints iServiceChargePoints;

    //tiene q ir primero q todos los demas metodos,
    //x el orden de los (Get,post,put,delete)
    @GetMapping
    public ResponseEntity<List<DtoChargePoints>> listarChargePoints() {
        return ResponseEntity.ok(iServiceChargePoints.listar());
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<DtoChargePoints> optenerChargePointsPorId(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(iServiceChargePoints.optenerPuntoCargaPorId(id));
    }

    @PostMapping
    public ResponseEntity<DtoChargePoints> registrarChargePoints(@RequestBody DtoChargePoints dtoChargePoints) {
        return new ResponseEntity<>(iServiceChargePoints.registrar(dtoChargePoints), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<DtoChargePoints> actualizarChargePoints(@RequestBody DtoChargePoints dtoChargePoints, @PathVariable("id") Integer id) {
        DtoChargePoints dtoChargePointsAct = iServiceChargePoints.actualizar(dtoChargePoints, id);
        return new ResponseEntity<>(dtoChargePointsAct, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> eliminarChargePoints(@PathVariable("id") Integer id) {
        iServiceChargePoints.eliminar(id);
        return new ResponseEntity<>(" Punto de carga eliminado con exito ", HttpStatus.OK);
    }
}
