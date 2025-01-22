import { NumberInfo } from './../../../interfaces/NumberInfo';
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-digit-based-operations',
  standalone: true,
  imports: [],
  templateUrl: './digit-based-operations.component.html',
  styleUrl: './digit-based-operations.component.scss',
})
export class DigitBasedOperationsComponent {
  @Input() numberInfo: any;
}
