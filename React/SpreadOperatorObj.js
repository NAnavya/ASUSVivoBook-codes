let person={
    name:"navya",
    clg:"PVP"    
}
console.log(person); // Here it printing the object in key and value pair

//By using spread operator we can unpack the elements as follow
let Updatedperson ={...person};
let Updatedperson1={person}
let Updatedperson2={...person,name:"Kumari"}  //Here it override the the already existed data with updated name as "Kumari" instead of navya  
let Updatedperson3={...person,age:16} ;  //here it is also possible to add the new variable besides the object variables
//In addition tothe dataWhatever we have in the object it append the value at the end 
console.log(Updatedperson);  //With SpreadOperator
console.log(Updatedperson1); //WithOut SpreadOperators
console.log(Updatedperson2);
console.log(Updatedperson3);