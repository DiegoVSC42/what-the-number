import { FibonacciSequence } from './sequences/FibonacciSequence';
import { SquareSequence } from './sequences/SquareSequence';
import { TriangularSequence } from './sequences/TriangularSequence';

export interface SequencePropertiesInfo {
  fibonacciSequence: FibonacciSequence;
  triangularSequence: TriangularSequence;
  squareSequence: SquareSequence;
}
