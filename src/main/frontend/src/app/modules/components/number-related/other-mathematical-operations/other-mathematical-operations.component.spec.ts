import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OtherMathematicalOperationsComponent } from './other-mathematical-operations.component';

describe('OtherMathematicalOperationsComponent', () => {
  let component: OtherMathematicalOperationsComponent;
  let fixture: ComponentFixture<OtherMathematicalOperationsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OtherMathematicalOperationsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OtherMathematicalOperationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
