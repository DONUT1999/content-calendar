package spring.basic.contentcalendar.model;

import jakarta.validation.constraints.NotEmpty;
import spring.basic.contentcalendar.model.Status;
import java.time.LocalDateTime;

public record Content (
        Integer id,
        @NotEmpty
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreate,
        LocalDateTime dateUpdate,
        String url){
}
