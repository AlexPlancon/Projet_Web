import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Livre } from './livre';

@Injectable ({
  providedIn : 'root'
})

export class CartService{

  items = [];

  constructor(private http : HttpClient){}

  addToCart(livre){
    this.items.push(livre);
  }
  getItems(){
  return this.items;
  }
  clearCart(){
    this.items = [];
    return this.items;
  }


}
