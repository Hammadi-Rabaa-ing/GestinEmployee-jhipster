import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { MonolithSharedModule } from 'app/shared/shared.module';
import { MonolithCoreModule } from 'app/core/core.module';
import { MonolithAppRoutingModule } from './app-routing.module';
import { MonolithHomeModule } from './home/home.module';
import { MonolithEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    MonolithSharedModule,
    MonolithCoreModule,
    MonolithHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    MonolithEntityModule,
    MonolithAppRoutingModule,
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [MainComponent],
})
export class MonolithAppModule {}
