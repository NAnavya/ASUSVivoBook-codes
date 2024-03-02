function sum(a,b,...restdata){
    console.log(a,b,restdata);
}
sum(1,2,3,4,5);

let obj1 = {
    id: 1,
    name : 'navya'
}

let obj2 = {
    id1: 2
}

const {id,name} = {...obj1}


console.log(id+name);
let num=[2,3,4];
console.log(Math.min(4,2,56));
console.log(Math.min(num));
console.log(Math.min(...num));