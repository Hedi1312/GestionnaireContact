import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  public loggedUser : String;
  public isLoggedIn : false;

  constructor() { }

}
