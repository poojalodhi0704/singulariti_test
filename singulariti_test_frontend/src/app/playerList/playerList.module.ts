import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule, JsonpModule} from '@angular/http';


import { PlayerListComponent } from './playerList.component';

@NgModule({
    imports: [CommonModule, RouterModule, ReactiveFormsModule , HttpModule , JsonpModule],
    declarations: [PlayerListComponent],
    exports: [ PlayerListComponent],
    
})

export class PlayerListModule { }
