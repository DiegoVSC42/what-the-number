import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DigitBasedOperationsComponent } from './digit-based-operations.component';

describe('DigitBasedOperationsComponent', () => {
  let component: DigitBasedOperationsComponent;
  let fixture: ComponentFixture<DigitBasedOperationsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DigitBasedOperationsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DigitBasedOperationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
