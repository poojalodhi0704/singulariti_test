import { Component, OnInit } from '@angular/core';
import { FormGroup , FormControl, FormBuilder, Validators} from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Response } from '@angular/http';
import { Player } from './player.interface';
import { PlayerService } from './player.service';


@Component({
	moduleId: module.id,
	selector: 'player-cmp',
	templateUrl: 'player.component.html',
	styleUrls: ['player.css'],
	providers: [PlayerService]
})

export class PlayerComponent implements OnInit {
		
		public playerForm : FormGroup;
		public submitted : boolean;

		constructor(private _fb: FormBuilder,
				private playerService: PlayerService,
				private route: ActivatedRoute,
				private router: Router){}
		
		ngOnInit(){
		this.playerForm = new FormGroup({
			country: new FormControl('',<any>Validators.required),
	        player: new FormControl('',<any>Validators.required),
			
		});
	}
	
		player( model:Player , isValid:boolean ){
				this.submitted = true;
				this.playerService.player(model).subscribe(val=>console.log);
				


	}


      }
