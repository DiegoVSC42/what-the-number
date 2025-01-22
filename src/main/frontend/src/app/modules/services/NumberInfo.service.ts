import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { NumberInfo } from '../interfaces/NumberInfo';
import { environment } from '@env';

declare const WTN_API: String;

@Injectable({
  providedIn: 'root',
})
export class NumberInfoService {
  private API = WTN_API + '/number-info';
  currentEnvironment = environment.currentEnvironment;
  constructor(private http: HttpClient) {}

  getNumberInfo(value: bigint): Observable<NumberInfo> {
    const url = `${this.API}/${value}`;
    return this.http.get<NumberInfo>(url);
  }
}
