import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { PlayerComponent } from './player.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule} from '@angular/http';

@NgModule({
    imports: [CommonModule, RouterModule, ReactiveFormsModule, FormsModule, HttpModule],
    declarations: [PlayerComponent],
    exports: [PlayerComponent]
})

export class PlayerModule { }
