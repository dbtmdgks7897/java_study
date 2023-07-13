package ch13;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// employee 클래스
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp {
    private int employee_id;
    private String firstName;
    private int salary;
}

