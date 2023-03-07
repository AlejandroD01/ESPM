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
import project.esmp.dto.DtoReservations;
import project.esmp.service.IServiceReservations;


/**
 * @author Ale
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/esmp/reservations")
public class ControllerReservations {

    @Autowired
    IServiceReservations iServiceReservations;

    //tiene q ir primero q todos los demas metodos,
    //x el orden de los (Get,post,put,delete)
    @GetMapping
    public ResponseEntity<List<DtoReservations>> listarReservations() {
        return ResponseEntity.ok(iServiceReservations.listar());
    }

    @PostMapping(path = "/{id}")
    public ResponseEntity<DtoReservations> registrarReservationPorConnectors(@RequestBody DtoReservations dtoReservations,
           @PathVariable("id") Integer id ) {
        return new ResponseEntity<>(iServiceReservations.registrarPorConector(dtoReservations,id), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<DtoReservations> actualizarReservations(@RequestBody DtoReservations dtoReservations, @PathVariable("id") Integer id) {
        DtoReservations dtoReservationsAct = iServiceReservations.actualizar(dtoReservations, id);
        return new ResponseEntity<>(dtoReservationsAct, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> eliminarReservations(@PathVariable("id") Integer id) {
        iServiceReservations.eliminar(id);
        return new ResponseEntity<>(" Reservacion eliminada con exito ", HttpStatus.OK);
    }
}
