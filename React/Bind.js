const person={
    name:"Navya",
    class:12,
    display:function(){
     return this.name+""+this.class;
    }
}
let person1={name:"Kumari",class:10}
let get=person.display();
let get1=person.display.bind(person1);
let get2=person.display.bind(person1)();
console.log(get1());
console.log(get);
console.log(get2);
console.log("It is presenting")
setTimeout(person.display,3000);
console.log(person.display());
console.log(typeof get+" "+typeof get1 +" "+typeof get2);
