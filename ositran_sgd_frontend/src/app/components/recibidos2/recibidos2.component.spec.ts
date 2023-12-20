import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Recibidos2Component } from './recibidos2.component';

describe('Recibidos2Component', () => {
  let component: Recibidos2Component;
  let fixture: ComponentFixture<Recibidos2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Recibidos2Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Recibidos2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
