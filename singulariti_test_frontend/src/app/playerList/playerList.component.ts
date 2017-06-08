import { Component , OnInit} from '@angular/core';
import { FormGroup , FormControl, FormBuilder, Validators} from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Response } from '@angular/http';
import { PlayerListService} from  './playerList.service';
import { PlayerList } from './playerList.interface';

@Component({
	moduleId: module.id,
	selector: 'player-list-cmp',
	templateUrl: 'playerList.component.html',
	styleUrls: ['playerList.css'],
	 providers: [PlayerListService]

	
})

export class PlayerListComponent implements OnInit {

	
	 private lists : PlayerList[] = [];
	
	constructor(private playerListService: PlayerListService,
				private route: ActivatedRoute,
				private router: Router){}

	ngOnInit(){
		
	}

		loadList(){
			
			this.playerListService
				.getList()
                .subscribe(lists =>this.lists =lists,
                	       error =>this.errorMessage = <any>error);

			//api call to save
			
		}
	

	

	

 
}
