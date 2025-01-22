import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { NumberInfo } from '../interfaces/NumberInfo';

@Injectable({
  providedIn: 'root',
})
export class NumberInfoService {
  private API = 'http://localhost:8080/number-info';

  constructor(private http: HttpClient) {}

  getNumberInfo(value: bigint): Observable<NumberInfo> {
    const url = `${this.API}/${value}`;
    return this.http.get<NumberInfo>(url);
  }
}
