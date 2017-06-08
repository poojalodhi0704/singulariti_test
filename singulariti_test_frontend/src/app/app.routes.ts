import { Routes } from '@angular/router';

import { PlayerRoutes } from './player/index';
import { PlayerComponent } from './player/index';

import { PlayerListRoutes } from './playerList/index';
import { PlayerListComponent } from './playerList/index';

export const routes: Routes = [
	...PlayerListRoutes,
	...PlayerListRoutes,

	 { path: 'player',  component: PlayerComponent },
	 {path:'list',component: PlayerListComponent}
	
];
