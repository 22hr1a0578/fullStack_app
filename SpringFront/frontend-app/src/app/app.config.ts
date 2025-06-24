import { importProvidersFrom } from '@angular/core';
import { RouterModule } from '@angular/router';
import { provideHttpClient } from '@angular/common/http';

export const appConfig = {
  providers: [
    importProvidersFrom(RouterModule.forRoot([])), // if you use routing
    provideHttpClient(),  // <-- use this instead of importProvidersFrom(HttpClientModule)
  ]
};