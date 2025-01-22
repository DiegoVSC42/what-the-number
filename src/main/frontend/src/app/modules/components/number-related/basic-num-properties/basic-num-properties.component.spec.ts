import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicNumPropertiesComponent } from './basic-num-properties.component';

describe('BasicNumPropertiesComponent', () => {
  let component: BasicNumPropertiesComponent;
  let fixture: ComponentFixture<BasicNumPropertiesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BasicNumPropertiesComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BasicNumPropertiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
