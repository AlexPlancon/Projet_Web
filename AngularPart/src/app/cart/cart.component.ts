import { Component, OnInit } from '@angular/core';
import { Livre } from '../livre';
import { CartService } from '../cart.service';
import { FormBuilder,FormGroup,FormControl,Validators } from '@angular/forms';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import { switchMap } from 'rxjs/operators';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  items;
  checkoutForm;
  constructor(private cartService : CartService, private formBuilder : FormBuilder,
               private route: ActivatedRoute) {
    this.checkoutForm = this.formBuilder.group({ID:''});
  }

  ngOnInit(): void {
    this.items = this.cartService.getItems();
  }
   onSubmit(customerData) {

        window.alert('Vos achats ont été enregistrés. Merci et à bientôt !!');
        this.items = this.cartService.clearCart();
        this.checkoutForm.reset();

   }

}
