package at.muharremoglu.concert.repository;

import at.muharremoglu.concert.domain.Concert;
import at.muharremoglu.concert.domain.Teilnehmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class TeilnehmerRepository {

@Repository
    public interface TeilnehmerRepository extends JpaRepository<Teilnehmer, Integer>{
    long countByConcert(Concert concert);
}

}
