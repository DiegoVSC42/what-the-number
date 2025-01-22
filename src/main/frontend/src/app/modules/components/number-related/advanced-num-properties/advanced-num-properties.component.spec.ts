import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdvancedNumPropertiesComponent } from './advanced-num-properties.component';

describe('AdvancedNumPropertiesComponent', () => {
  let component: AdvancedNumPropertiesComponent;
  let fixture: ComponentFixture<AdvancedNumPropertiesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AdvancedNumPropertiesComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdvancedNumPropertiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
