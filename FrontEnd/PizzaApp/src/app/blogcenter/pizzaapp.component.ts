import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-blogcenter',
  templateUrl: './pizzaapp.component.html',
  styleUrls: ['./pizzaapp.component.css']
})
export class PizzaAppComponent implements OnInit {
  title = 'PizzaApp';
  pizzaSizeList: any = ['Large', 'Medium', 'Small']
  orderStatus : boolean = false
  constructor(private http: HttpClient, private router: Router) { }

  form = new FormGroup({
    pizzaType: new FormControl('', Validators.required),
    quantity : new FormControl('',Validators.required)
  });

  get f(){
    return this.form.controls;
  }

  ngOnInit(): void {

  }



  submit() {
    let url = 'http://localhost:8888/start?key=OrderProcessing&pizzaType='+this.form.value.pizzaType+'&quantity='+this.form.value.quantity;
    this.http.get(url).subscribe((data: any) => {
      this.orderStatus = data
      console.log(this.orderStatus)
    });
    console.log(this.form.value.pizzaType);
    console.log(this.form.value.quantity);
  }

}
