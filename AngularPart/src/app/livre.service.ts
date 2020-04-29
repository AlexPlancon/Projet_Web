import { Livre } from './livre'
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable ({
  providedIn : 'root'
})

export class LivreService{
  constructor(private http : HttpClient){}

  getLivresWithObservable(): Observable<any> {
      return this.http.get("http://localhost:8080/livres").pipe(map((response: Response) => response));
  }

  getLivreWithObservable(titre): Observable<any> {
      return this.http.get("http://localhost:8080/livres/"+titre).pipe(map((response: Response) => response));
  }

  getJeunesseWithObservable():Observable<any>{
      return this.http.get("http://localhost:8080/livres/jeunesse").pipe(map((response : Response) => response));
  }
  getRomanWithObservable():Observable<any>{
        return this.http.get("http://localhost:8080/livres/roman").pipe(map((response : Response) => response));
    }

}
