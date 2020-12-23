export interface IFonction {
  id?: number;
  designation?: string;
}

export class Fonction implements IFonction {
  constructor(public id?: number, public designation?: string) {}
}
