package SS.Spring.spring.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class baseEntity {
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updateBy;

}
