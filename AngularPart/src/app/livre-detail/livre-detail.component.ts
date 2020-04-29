import { Component, OnInit } from '@angular/core';
import { switchMap } from 'rxjs/operators';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import {LivreService} from '../livre.service'
import {Livre} from '../livre'
import {CartService} from '../cart.service';


@Component({
  selector: 'app-livre-detail',
  templateUrl: './livre-detail.component.html',
  styleUrls: ['./livre-detail.component.css']
})
export class LivreDetailComponent implements OnInit {

  livre : Livre;

  constructor(private livreService: LivreService,
            private cartService : CartService,
                  private route: ActivatedRoute) { }

  ngOnInit(): void {

  this.route.paramMap.pipe(
            switchMap((params: ParamMap) =>
              this.livreService.getLivreWithObservable(params.get('titre')))
          ).subscribe(livre => this.livre = livre );

  }
  addToCart(livre){
      this.cartService.addToCart(livre);
      window.alert('Your product has been added to the cart!');
    }

}
