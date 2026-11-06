package net.javaguides.netflux.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * MovieEvent
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - raul.perez.vicente@gmail.com
 * @version 06/11/2026 - 18:01
 * @since 1.25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieEvent {

    private String movieId;
    private Date movieDate;

}
