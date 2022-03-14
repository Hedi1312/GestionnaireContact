import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Contact } from './gcontact';

@Injectable({
  providedIn: 'root'
})
export class DemoService {

  constructor(private http: HttpClient) { }


  public postContact(contact : Contact){
    return this.http.post("http://localhost:8083/postcontact",contact,{responseType: 'text' as 'json'});
  }

  public updateContact(contact : Contact){
    return this.http.put("http://localhost:8083/updatecontact",contact,{responseType: 'text' as 'json'});
  }

  public getContacts(){
    return this.http.get("http://localhost:8083/getallContacts");
  }

  public getContactById(a: number){
    return this.http.get("http://localhost:8083/getcontactbyid?cid="+a);
  }

  public deleteContact(a: number){
    return this.http.delete("http://localhost:8083/deletecontact?cid="+a);
  }
}
