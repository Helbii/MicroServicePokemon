import { Component } from '@angular/core';
import { User } from '../user';
@Component({
  selector: 'app-form-auth',
  templateUrl: './form-auth.component.html',
  styleUrls: ['./form-auth.component.css']
})
export class FormAuthComponent {

  user: User = {
    id:1,
    name:'Bilel',
    password:'password'
  };


}

