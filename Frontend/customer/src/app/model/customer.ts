export class Customer {
    id!: number;
    name: string;
    lastName:string;
    email:string;
    phone:string;

    constructor(name:string,lastName:string ,email:string,phone:string){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }
}
