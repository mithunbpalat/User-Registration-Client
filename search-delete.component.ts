import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserRegistrationService } from '../user-registration.service';

@Component({
  selector: 'app-search-delete',
  templateUrl: './search-delete.component.html',
  styleUrls: ['./search-delete.component.css']
})
export class SearchDeleteComponent implements OnInit {

  users: any;
  id: any;
  constructor(private service:UserRegistrationService) { }

  public delteUser(id:number){
    let resp=this.service.deleteUser(id);
    resp.subscribe((data)=>this.users=data);
  }
  public findUserByEmailId(){
    let resp=this.service.getUserByEmail(this.id);
    resp.subscribe((data)=>this.users=data);
  }

  ngOnInit(): void {
    let resp=this.service.getUsers();
    resp.subscribe((data)=>this.users=data);
  }

}
