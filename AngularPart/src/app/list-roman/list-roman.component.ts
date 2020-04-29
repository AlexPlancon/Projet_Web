import { Component, OnInit } from '@angular/core';
import { Livre } from '../livre'
import { LivreService } from '../livre.service'
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import { switchMap } from 'rxjs/operators';

@Component({
  selector: 'app-list-roman',
  templateUrl: './list-roman.component.html',
  styleUrls: ['./list-roman.component.css']
})
export class ListRomanComponent implements OnInit {
  livres : Livre[];
  constructor(private livreService : LivreService,
                    private route: ActivatedRoute) { }

  ngOnInit(): void {
      this.livreService.getRomanWithObservable().subscribe(
                  res => {
                    this.livres = res;
          });
    }


}
