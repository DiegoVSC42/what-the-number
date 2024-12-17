package diegoVSC42.what_the_number.domain.operations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DigitBasedOperationsInfo {
    private Long numberOfDigits;
    private Long digitSum;
    private Long digitProduct;
}
