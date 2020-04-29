import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule }    from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LivreListComponent } from './livre-list/livre-list.component';
import { LivreDetailComponent } from './livre-detail/livre-detail.component';
import { TopBarComponent } from './top-bar/top-bar.component';
import { CartComponent } from './cart/cart.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ListJeunnesseComponent } from './list-jeunnesse/list-jeunnesse.component';
import { ListRomanComponent } from './list-roman/list-roman.component';

@NgModule({
  declarations: [
    AppComponent,
    LivreListComponent,
    LivreDetailComponent,
    TopBarComponent,
    CartComponent,
    ListJeunnesseComponent,
    ListRomanComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
