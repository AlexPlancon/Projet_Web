import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListJeunnesseComponent } from './list-jeunnesse.component';

describe('ListJeunnesseComponent', () => {
  let component: ListJeunnesseComponent;
  let fixture: ComponentFixture<ListJeunnesseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListJeunnesseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListJeunnesseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
