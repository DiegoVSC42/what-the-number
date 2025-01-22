import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-advanced-num-properties',
  standalone: true,
  imports: [],
  templateUrl: './advanced-num-properties.component.html',
  styleUrl: './advanced-num-properties.component.scss',
})
export class AdvancedNumPropertiesComponent {
  @Input() numberInfo: any;
}
