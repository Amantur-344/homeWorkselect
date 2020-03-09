
package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    private Integer id;
    private String fullName;
    private String course;
    private Boolean isOnline;
    private String email;
    private Boolean isAccepted;
}