package ma.emsi.gemao.repositories;

import ma.emsi.gemao.entities.Intervention;
import ma.emsi.gemao.entities.Intervention;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterventionRepository extends JpaRepository<Intervention,Long> {
  Page<Intervention> findByNomContains(String Kw, Pageable pageable);

}
