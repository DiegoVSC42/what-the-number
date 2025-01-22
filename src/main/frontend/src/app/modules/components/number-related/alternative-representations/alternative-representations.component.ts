import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-alternative-representations',
  standalone: true,
  imports: [],
  templateUrl: './alternative-representations.component.html',
  styleUrl: './alternative-representations.component.scss',
})
export class AlternativeRepresentationsComponent {
  @Input() numberInfo: any;
}
