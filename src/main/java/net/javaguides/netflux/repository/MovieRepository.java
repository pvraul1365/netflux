package net.javaguides.netflux.repository;

import net.javaguides.netflux.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by ij, Spring Framework Guru.
 *
 * @author architecture - raulp
 * @version 05/11/2026 - 10:05
 * @since jdk 1.21
 */
public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
