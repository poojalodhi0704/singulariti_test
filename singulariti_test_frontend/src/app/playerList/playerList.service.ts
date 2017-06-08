import { Injectable } from '@angular/core';
import { Http, Response, Headers,RequestOptions,URLSearchParams} from '@angular/http';
import { Observable } from 'rxjs/Rx';
import {PlayerList} from './playerList.interface';



@Injectable()
export class PlayerListService {

	private listUrl ='http://localhost:8870/admin/api/test';
	
	constructor(private http:Http){}
	
	getList(): Observable<PlayerList []>{
		
		return this.http
		   .get(this.listUrl).map((res:Response) => res.json())
		   .catch((error:any) => Observable.throw(error.json().error));
	}
	}
	

