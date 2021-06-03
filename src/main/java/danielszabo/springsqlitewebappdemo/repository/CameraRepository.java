package danielszabo.springsqlitewebappdemo.repository;

import danielszabo.springsqlitewebappdemo.entity.Camera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CameraRepository extends JpaRepository<Camera, Long> {
}
