import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SequenceNumPropertiesComponent } from './sequence-num-properties.component';

describe('SequenceNumPropertiesComponent', () => {
  let component: SequenceNumPropertiesComponent;
  let fixture: ComponentFixture<SequenceNumPropertiesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SequenceNumPropertiesComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SequenceNumPropertiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
