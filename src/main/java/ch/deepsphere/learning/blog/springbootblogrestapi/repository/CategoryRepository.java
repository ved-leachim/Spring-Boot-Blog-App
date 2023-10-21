package ch.deepsphere.learning.blog.springbootblogrestapi.repository;

import ch.deepsphere.learning.blog.springbootblogrestapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
