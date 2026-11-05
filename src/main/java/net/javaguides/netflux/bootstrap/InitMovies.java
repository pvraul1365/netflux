package net.javaguides.netflux.bootstrap;

import lombok.RequiredArgsConstructor;
import net.javaguides.netflux.domain.Movie;
import net.javaguides.netflux.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

/**
 * Created by ij, Spring Framework Guru.
 *
 * @author architecture - rperezv
 * @version 05/11/2026 - 11:52
 * @since jdk 1.21
 */
@Component
@RequiredArgsConstructor
public class InitMovies implements CommandLineRunner {

    private final MovieRepository movieRepository;

    @Override
    public void run(String... args) throws Exception {
        // Initialize movies in the database
        movieRepository.deleteAll()
                .thenMany(
                        Flux.just(
                                        "Silence of the Lambs",
                                        "The Godfather",
                                        "The Dark Knight",
                                        "Pulp Fiction",
                                        "The Shawshank Redemption",
                                        "The Lord of the Rings: The Return of the King",
                                        "Forrest Gump",
                                        "Inception")
                                .map(Movie::new)
                                .flatMap(movieRepository::save)
                )
                .subscribe(null, null, () -> movieRepository.findAll().subscribe(System.out::println));
    }
}
