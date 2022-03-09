import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-accueil',
  templateUrl: './accueil.component.html',
  styleUrls: ['./accueil.component.css']
})
export class AccueilComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  myimage:String = "assets/images/iphone.jpg";
  myimage2:String = "assets/images/bookAdress.jpg";
  contactImg:String = "assets/images/contact.png";
  appleMail:String = "assets/images/AppleMail.png";
  notes:String = "assets/images/notes.png";
  croix:String = "assets/images/croix.png";


}
