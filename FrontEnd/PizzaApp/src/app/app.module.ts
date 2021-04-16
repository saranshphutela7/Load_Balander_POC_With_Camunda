import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { QuillModule } from 'ngx-quill'
import { AppRoutingModule } from './app-routing.module';
import { PizzaAppComponent } from './blogcenter/pizzaapp.component';
import { CommonModule } from '@angular/common';
import { NgxSpinnerModule } from 'ngx-spinner';


@NgModule({
  declarations: [
    AppComponent,
    PizzaAppComponent,

  ],
  imports: [
    CommonModule,
    BrowserModule,
    QuillModule.forRoot(),    
    AppRoutingModule,
    NgxSpinnerModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
