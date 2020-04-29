import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListRomanComponent } from './list-roman.component';

describe('ListRomanComponent', () => {
  let component: ListRomanComponent;
  let fixture: ComponentFixture<ListRomanComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListRomanComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListRomanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
