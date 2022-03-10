import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { User } from 'src/app/models/userModel';

@Component({
  selector: 'app-connexion',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.css']
})
export class  ConnexionComponent implements OnInit {
  user = new User();
  submitted = false;
  loginForm!: FormGroup; 
  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
    this.loginForm = this.fb.group({
      email:['',[Validators.required, Validators.minLength(6)]],
      password:['',[Validators.required,Validators.minLength(3)]]
    })
  }

  onSubmit() {
    this.submitted = true;
    this.user.adresseMail = this.loginForm.value.userData.email;
    this.user.password = this.loginForm.value.userData.password;
    this.loginForm.reset();
  }
}