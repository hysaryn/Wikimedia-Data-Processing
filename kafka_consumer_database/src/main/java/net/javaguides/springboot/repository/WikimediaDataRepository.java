package net.javaguides.springboot.repository;

import net.javaguides.springboot.entity.WikiMediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikiMediaData, Long> {

}
