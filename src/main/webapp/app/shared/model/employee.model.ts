import { Moment } from 'moment';
import { IEntreprise } from 'app/shared/model/entreprise.model';
import { IFonction } from 'app/shared/model/fonction.model';

export interface IEmployee {
  id?: number;
  nom?: string;
  prenom?: string;
  date_naiss?: Moment;
  adresse?: string;
  fonction?: string;
  entreprise?: string;
  entreprise_To_Employees?: IEntreprise[];
  fonction_to_employees?: IFonction[];
}

export class Employee implements IEmployee {
  constructor(
    public id?: number,
    public nom?: string,
    public prenom?: string,
    public date_naiss?: Moment,
    public adresse?: string,
    public fonction?: string,
    public entreprise?: string,
    public entreprise_To_Employees?: IEntreprise[],
    public fonction_to_employees?: IFonction[]
  ) {}
}
