package at.muharremoglu.concert.repository;

import at.muharremoglu.concert.domain.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface ConcertRepository extends JpaRepository<Concert, Integer>{
    long countByTeilnehmer(Concert concert);
}
