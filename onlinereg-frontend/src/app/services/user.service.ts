import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Person } from '../models/person';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  options = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  }

  constructor(private http: HttpClient) { }

  getUsers(): Observable<Person[]> {
    return this.http.get<Person[]>("http://localhost:8092/persons");
  }

  addUser(person: Person): Observable<Person> {
    return this.http.post<Person>("http://localhost:8092/persons/save", person, this.options);
  
  }
}
