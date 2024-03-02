let number=[1,2,3,4];
let [num1,num2,num3] =number; //It is called destructing which means destructing the data which is in the form of either Array or Object
 //  Here it is not possible by using the spread operator and assign it to the new variables let [num4,num5,num6,num7]={...number};
 let [num4,num5,num6,num7]=[...number];
 console.log(num4)
 let[a,,c,d]=number;// It is also possible toskip the values of some elements in an Array just by keeping it as an empty space
console.log(num1,num2,num3);
console.log(a,c,d);

let person ={
    name:"Navya",
    section:2
}

let {name,section}=person;
//NOTE :-> Here we use curly braces instead of [] because whenever we are destructuring the object which is in keyvalue
//format so we use curly braces {} but when we destructing the array which is in index format the we must use []but here the variables names must 
// compatable with the object variables means the name must be same basedon that key only it assign the value but it isnot needed when it comes to an 
// destructuring the Array only for object Destructuring it is needed or we can assign it to our own variable asfollows
let{name:name1,section:section1}=person;

console.log(name+section)
console.log(name1,section1);