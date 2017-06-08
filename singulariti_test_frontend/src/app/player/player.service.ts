import { Injectable } from '@angular/core';
import { Http, Response, Headers,RequestOptions,URLSearchParams} from '@angular/http';
import { Observable } from 'rxjs/Rx';

import { Player } from './player.interface';

@Injectable()

export class PlayerService{

	private playerUrl = 'http://localhost:8870/admin/api';

	constructor(private http:Http){}

	player(body:Player):Observable<Response>{
		let bodyString =JSON.stringify(body);
	let headers = new Headers();
		headers.append('Content-Type','application/json');
	
		//let options = new RequestOptions({headers : headers});

		return this.http
			.post(`${this.playerUrl}/test`,bodyString,{headers:headers}).map((res:Response)
                => res.json()).catch((error:any) => Observable.throw(error.json().error));
                

				
			

}
		
}