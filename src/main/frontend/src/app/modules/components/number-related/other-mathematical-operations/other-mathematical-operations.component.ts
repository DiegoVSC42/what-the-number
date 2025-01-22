import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-other-mathematical-operations',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './other-mathematical-operations.component.html',
  styleUrl: './other-mathematical-operations.component.scss',
})
export class OtherMathematicalOperationsComponent {
  @Input() numberInfo: any;
}
