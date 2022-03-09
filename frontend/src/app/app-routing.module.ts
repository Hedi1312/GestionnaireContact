import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { InscriptionComponent } from './composants/inscription/inscription.component';
import { ContactListComponent } from './composants/contact-list/contact-list.component';
import {ConnexionComponent} from './composants/connexion/connexion.component';
import { AccueilComponent } from './composants/accueil/accueil.component';
import { NotfoundComponent } from './composants/notfound/notfound.component';



const routes: Routes = [
  {
    path: 'inscription',
    component: InscriptionComponent
  },

  {
    path: 'accueil',
    component: AccueilComponent
  },

  {
    path: '',
    component: AccueilComponent
  },

  {
    path: 'connexion',
    component: ConnexionComponent
  },
  {
    path: 'notfound',
    component: NotfoundComponent
  },
  {
    path: 'contact-list',
    component : ContactListComponent
  },
  {
    path: '**',
    component: NotfoundComponent
  }

];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
