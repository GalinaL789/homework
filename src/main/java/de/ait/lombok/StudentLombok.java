
package de.ait.lombok;

import lombok.*;
import lombok.extern.slf4j
        .Slf4j;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Slf4j
public class StudentLombok {

    private String firstName;

    private String secondName;

    public void getInfo() {
        log.info("Student {}", firstName);
    }

}
