import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoArComponent } from './components/logo-ar/logo-ar.component';
import { ProyectosComponent } from './components/proyectos/proyectos.component';
import { HssComponent } from './components/hss/hss.component';
import { FooterComponent } from './components/footer/footer.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import {NgOptimizedImage} from "@angular/common";
import { NgCircleProgressModule } from 'ng-circle-progress';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoArComponent,
    ProyectosComponent,
    HssComponent,
    FooterComponent,
    ExperienciaComponent,
    EducacionComponent,
    BannerComponent,
    AcercaDeComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        NgOptimizedImage,
        NgCircleProgressModule.forRoot({})
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
