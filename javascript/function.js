function sum(a,b){
    return a+b;
}


//this are arrow functions like lambda functions in java
let add = (a, b=2) =>{
    return a+b;
}


console.log("This is normal function "+sum(1,2));
console.log("This is arrow function "+add(3,4));
console.log("giving number directly in the function :" + add(3));


