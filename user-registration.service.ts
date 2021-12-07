import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserRegistrationService {

  constructor(private http:HttpClient) { }

  public doRegistration(user: User){
    return this.http.post("http://localhost:8083/register",user,{responseType:'text' as 'json'});
  }
  public getUsers(){
    return this.http.get("http://localhost:8083/getAllUsers");
  }
  public getUserByEmail(id:number){
    return this.http.get("http://localhost:8083/findUser/id?id="+id);
  }

  public deleteUser(id:number){
    return this.http.delete("http://localhost:8083/cancel/id?id="+id);
  }

}
