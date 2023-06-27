package com.AcServiceBackend.AcServiceBackend.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.AcServiceBackend.AcServiceBackend.model.registermodel;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface registerrepo extends JpaRepository<registermodel, Long> {

    registermodel findByEmail(String email);

}
