import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {RouterModule } from '@angular/router';
import {FormsModule} from '@angular/forms';
import {PlayerModule} from './player/player.module';
import { PlayerListModule } from './playerList/playerList.module';
import {HttpModule , JsonpModule}  from '@angular/http';
import {routes} from './app.routes';
import {SidebarComponent} from './sidebar/index';
import {SidebarModule} from './sidebar/sidebar.module';
import { AppComponent } from './app.component';

@NgModule({
	 imports :[  BrowserModule ,
	             RouterModule.forRoot(routes),
	             HttpModule,
	             JsonpModule,
	             PlayerModule,
	             PlayerListModule,
	             SidebarModule
	            
	            
	             ],
	  providers:[],
	declarations:[AppComponent, SidebarComponent],
	bootstrap:[AppComponent, SidebarComponent ]
	})
export class AppModule{}
