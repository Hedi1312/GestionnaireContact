import { Component, OnInit } from '@angular/core';
import { DemoService } from '../../demo.service';
import { User } from '../../models/userModel';
@Component({
  selector: 'app-inscription',
  templateUrl: './inscription.component.html',
  styleUrls: ['./inscription.component.css']
})
export class InscriptionComponent implements OnInit {

  user: any= new User(0,"","","","");

  constructor(private service : DemoService) { }

  ngOnInit(): void {
  }

  public register(){
    let resp = this.service.register(this.user);
    resp.subscribe((data)=>this.user=data);
  }

}
