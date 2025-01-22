import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-basic-num-properties',
  standalone: true,
  imports: [],
  templateUrl: './basic-num-properties.component.html',
  styleUrl: './basic-num-properties.component.scss',
})
export class BasicNumPropertiesComponent {
  @Input() numberInfo: any;
}
