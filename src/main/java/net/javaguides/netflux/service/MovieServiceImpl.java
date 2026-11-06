package net.javaguides.netflux.service;

import java.time.Duration;
import java.util.Date;
import lombok.RequiredArgsConstructor;
import net.javaguides.netflux.domain.Movie;
import net.javaguides.netflux.domain.MovieEvent;
import net.javaguides.netflux.repository.MovieRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by ij, Spring Framework Guru.
 *
 * @author architecture - rperezv
 * @version 05/11/2026 - 15:34
 * @since jdk 1.21
 */
@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public Mono<Movie> getMovieById(final String id) {
        return movieRepository.findById(id);
    }

    @Override
    public Flux<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Flux<MovieEvent> streamMovieEvents(final String id) {
        return Flux.<MovieEvent>generate(sink ->
                        sink.next(new MovieEvent(id, new Date())))
                .delayElements(Duration.ofSeconds(1));
    }
}
