package kz.bitlab.academy.springfirstsprint.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentEntity {

    private Long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;

}
