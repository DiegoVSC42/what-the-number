import { AdvancedNumPropertiesInfo } from './AdvancedNumPropertiesInfo';
import { AlternativeRepresentationsInfo } from './AlternativeRepresentationsInfo';
import { BasicNumPropertiesInfo } from './BasicNumPropertiesInfo';
import { DigitBasedOperationsInfo } from './DigitBasedOperationsInfo';
import { OtherMathematicalOperationsInfo } from './OtherMathematicalOperationsInfo';
import { SequencePropertiesInfo } from './SequencePropertiesInfo';

export interface NumberInfo {
  value: number;
  basicNumPropertiesInfo: BasicNumPropertiesInfo;
  sequencePropertiesInfo: SequencePropertiesInfo;
  advancedNumPropertiesInfo: AdvancedNumPropertiesInfo;
  digitBasedOperationsInfo: DigitBasedOperationsInfo;
  alternativeRepresentationsInfo: AlternativeRepresentationsInfo;
  otherMathematicalOperationsInfo: OtherMathematicalOperationsInfo;
}
