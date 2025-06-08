package at.muharremoglu.concert.repository;

import at.muharremoglu.concert.domain.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

public class ConcertRepository {

public interface ConcertRepository extends JpaRepository<Concert, Integer>{

}

}
