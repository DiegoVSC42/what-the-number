import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AlternativeRepresentationsComponent } from './alternative-representations.component';

describe('AlternativeRepresentationsComponent', () => {
  let component: AlternativeRepresentationsComponent;
  let fixture: ComponentFixture<AlternativeRepresentationsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AlternativeRepresentationsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AlternativeRepresentationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
