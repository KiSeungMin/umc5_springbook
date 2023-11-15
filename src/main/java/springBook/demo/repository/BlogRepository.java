package springBook.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springBook.demo.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
