import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PizzaAppComponent } from './pizzaapp.component';

describe('PizzaAppComponent', () => {
  let component: PizzaAppComponent;
  let fixture: ComponentFixture<PizzaAppComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PizzaAppComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PizzaAppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
