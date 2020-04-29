import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { LivreListComponent } from './livre-list/livre-list.component';
import { LivreDetailComponent} from './livre-detail/livre-detail.component';
import {TopBarComponent} from './top-bar/top-bar.component';
import {CartComponent } from './cart/cart.component';
import {ListJeunnesseComponent} from './list-jeunnesse/list-jeunnesse.component';
import {ListRomanComponent} from './list-roman/list-roman.component';


const routes: Routes = [
  {
  path: '',
  component : TopBarComponent,
  pathMatch: 'full'
  },
  {
  path : 'livres/:titre',
  component: LivreDetailComponent
  },
  {
  path : 'livres',
  component : LivreListComponent
  },

  {
  path : 'achats',
  component : CartComponent
  },
  {
  path : 'jeunnesse',
  component : ListJeunnesseComponent
  },
  {
  path: 'roman',
  component : ListRomanComponent
  },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
