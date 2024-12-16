package diegoVSC42.what_the_number.domain.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DigitBasedOperationsInfo {
    private Long digitNumber;
    private Long digitSum;
    private Long digitProduct;
}
