import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ConnexionComponent } from './composants/connexion/connexion.component';
import { HeaderComponent } from './composants/header/header.component';
import { FooterComponent } from './composants/footer/footer.component';
import { ContactListComponent } from './composants/contact-list/contact-list.component';
import { InscriptionComponent } from './composants/inscription/inscription.component';
import { AccueilComponent } from './composants/accueil/accueil.component';
import { NotfoundComponent } from './composants/notfound/notfound.component';
import { AjouterContactComponent } from './composants/ajouter-contact/ajouter-contact.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ConnexionComponent,
    HeaderComponent,
    FooterComponent,
    ContactListComponent,
    InscriptionComponent,
    AccueilComponent,
    NotfoundComponent,
    AjouterContactComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
