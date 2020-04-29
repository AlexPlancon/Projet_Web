import { Component, OnInit } from '@angular/core';
import { Livre } from '../livre';
import { LivreService } from '../livre.service'
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import { switchMap } from 'rxjs/operators';

@Component({
  selector: 'app-livre-list',
  templateUrl: './livre-list.component.html',
  styleUrls: ['./livre-list.component.css']
})
export class LivreListComponent implements OnInit {

  livres : Livre[];

  constructor(private livreService : LivreService,
    private route: ActivatedRoute) { }

  ngOnInit() : void {
    this.livreService.getLivresWithObservable().subscribe(
              res => {
                this.livres = res;
      });
  }
}





