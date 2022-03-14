import { Component, OnInit } from '@angular/core';
import { DemoService } from '../../demo.service';
import { Contact } from '../../gcontact';
import { Search } from '../../gsearch';

@Component({
  selector: 'app-ajouter-contact',
  templateUrl: './ajouter-contact.component.html',
  styleUrls: ['./ajouter-contact.component.css']
})
export class AjouterContactComponent implements OnInit {

  contact: any= new Contact(0,"","","","","");
  contacts: any;
  search : any = new Search(0)
  constructor(private service : DemoService) { }

  ngOnInit(): void {
    let resp = this.service.getContacts();
    resp.subscribe((data)=>this.contacts=data);
  }

  public contactNow(){
    let resp = this.service.postContact(this.contact);
    resp.subscribe((data)=>this.contacts=data);
  }

  public updateContactNow(){
    let resp = this.service.updateContact(this.contact);
    resp.subscribe((data)=>this.contacts=data);
  }

  public searchById(a:number){
    let resp = this.service.getContactById(a);
    resp.subscribe((data)=>this.contact=data);
  }

  public delContact(a: number){
    let resp = this.service.deleteContact(a);
    resp.subscribe((data)=>this.contacts=data);
  }
}
