package net.javaguides.netflux.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ij, Spring Framework Guru.
 *
 * @author architecture - rperezv
 * @version 05/11/2026 - 10:03
 * @since jdk 1.21
 */
@Document
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Movie {

    private String id;

    @NonNull
    private String title;
}
