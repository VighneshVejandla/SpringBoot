let names = ["vighnesh", "sowmya", "chakrish"];

console.log(names);

names.forEach(n=>console.log(n));

names.map(n=>n.length).forEach(n=>console.log(n))

console.log("-----------------")

names.map(n=>n.length).forEach(n=>{
    if(n>5){
        console.log(n);
    }
});