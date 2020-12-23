export interface IEntreprise {
  id?: number;
  designation?: string;
  adresse?: string;
  secteur?: string;
}

export class Entreprise implements IEntreprise {
  constructor(public id?: number, public designation?: string, public adresse?: string, public secteur?: string) {}
}
