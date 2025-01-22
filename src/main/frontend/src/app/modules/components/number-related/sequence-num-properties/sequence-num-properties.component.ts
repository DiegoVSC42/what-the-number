import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-sequence-num-properties',
  standalone: true,
  imports: [],
  templateUrl: './sequence-num-properties.component.html',
  styleUrl: './sequence-num-properties.component.scss',
})
export class SequenceNumPropertiesComponent {
  @Input() numberInfo: any;

  ordinalSufix(value: number): string {
    if (value == 1) {
      return 'st';
    } else if (value == 2) {
      return 'nd';
    } else if (value == 3) {
      return 'rd';
    } else {
      return 'th';
    }
  }
}
