import { Component, OnInit } from '@angular/core';
import { UserService } from './services/user.service'
import { Person } from './models/person';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent implements OnInit{
  title = 'onlinereg-frontend';
  persons: Person[] = [];

  personForm = this.formBuilder.group({
    fullname: '',
    surname: '',
    telephone: ''
  });

  constructor(
    private userService: UserService,
    private formBuilder: FormBuilder,) {

  }

  ngOnInit() {
    this.getUsers();
  }

  getUsers() {
    this.userService.getUsers().subscribe(users => {
      console.log(users);
      this.persons = users;
    });
  }

  onSubmit(): void {
    console.warn('User', this.personForm.value);
    this.userService.addUser(this.personForm.value).subscribe(u => {
      this.persons.push(u);
    });
    this.personForm.reset();
  }
}
