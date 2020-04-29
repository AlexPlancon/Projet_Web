import { Component, OnInit } from '@angular/core';
import { Livre } from '../livre'
import { LivreService } from '../livre.service'
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import { switchMap } from 'rxjs/operators';

@Component({
  selector: 'app-list-jeunnesse',
  templateUrl: './list-jeunnesse.component.html',
  styleUrls: ['./list-jeunnesse.component.css']
})
export class ListJeunnesseComponent implements OnInit {
   livres : Livre[];
  constructor(private livreService : LivreService,
                  private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.livreService.getJeunesseWithObservable().subscribe(
                res => {
                  this.livres = res;
        });
  }

}
