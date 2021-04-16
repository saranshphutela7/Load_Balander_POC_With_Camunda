import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PizzaAppComponent } from './blogcenter/pizzaapp.component';

const routes: Routes = [
   {path:"", component : PizzaAppComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
