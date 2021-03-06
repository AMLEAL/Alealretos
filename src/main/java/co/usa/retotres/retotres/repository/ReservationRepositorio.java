package co.usa.retotres.retotres.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.retotres.retotres.model.Reservation;
import co.usa.retotres.retotres.repository.crud.ReservationCrudRepositorio;

@Repository
public class ReservationRepositorio {
    @Autowired
    private ReservationCrudRepositorio reservationCrudRepositorio;
    public List<Reservation>getAll(){
        return(List<Reservation>)reservationCrudRepositorio.findAll();
    }
    public Optional<Reservation>getReservation(int id){
        return reservationCrudRepositorio.findById(id);
    }

    public Reservation save(Reservation reservation){
        return reservationCrudRepositorio.save(reservation);
    }
    public void delete(Reservation reservation){
        reservationCrudRepositorio.delete(reservation);
    }
}
