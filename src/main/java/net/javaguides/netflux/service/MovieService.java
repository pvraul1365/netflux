package net.javaguides.netflux.service;

import net.javaguides.netflux.domain.Movie;
import net.javaguides.netflux.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by ij, Spring Framework Guru.
 *
 * @author architecture - raulp
 * @version 05/11/2026 - 15:33
 * @since jdk 1.21
 */
public interface MovieService {

    Mono<Movie> getMovieById(String id);

    Flux<Movie> getAllMovies();

    Flux<MovieEvent> streamMovieEvents(String id);
}
