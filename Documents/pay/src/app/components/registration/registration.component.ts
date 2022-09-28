import { Component, OnInit } from '@angular/core';
import{FormGroup,FormBuilder}from "@angular/forms"
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor(private userService:UserService) { }
  public user={
    username:'',
    firstName:'',
    lastName:'',
    email:'',
    mobileNumber:'',
    password:''

  };

  ngOnInit(): void {
  }
  formSubmit(){
    console.log(this.user);
    if(this.user.username==''|| this.user.username==null){
      alert('User is required!!');
      return;
    }
    this.userService.addUser(this.user).subscribe(
      (data)=>{
        console.log(data);
        alert('success');
        


      },
      (error)=>{
        console.log(error)
        alert('something went Wrong');

      }
    );

      }

}
