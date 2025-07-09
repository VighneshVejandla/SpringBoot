// let number1 = prompt("Enter a number:");
// if(number1%5 == 0){
//     console.log("The number is multiple of 5");
// }else{
//     console.log("The number is not multiple of 5");
// }


// let str = 'vighnesh';

// for(let i of str){
//     console.log('i=', i);
// }


// let student1 = {
//     name: "vighnesh",
//     age: 22,
//     collage: "VIT - AP",
//     cgpe : 8.5
// };

// for(let key in student1){
//     console.log(key, ":", student1[key]);
// }

// // practice question 1;

// for(let i =0; i<=100; i++){
//     if(i%2 == 0){
//         console.log(i, "is even");
//     }
// }

// practice question 2;
// let gameNum = 25;
// let guessNum = prompt("Guess the number between 1 and 50");
// while(guessNum != gameNum){
//     if(guessNum < gameNum){
//         console.log(prompt("The number is greater than " + guessNum));
//     }else{
//         console.log(prompt("The number is less than " + guessNum));
//     }
//     guessNum = prompt("Guess the number between 1 and 50");
// }
// console.log("Congratulations! You guessed the number " + gameNum + " correctly!");


// let str = "vighnesh\nvejandla";
// console.log(str); 



let array = [250, 300, 350, 800, 900, 200]

let sum = 0;

for(let i = 0; i < array.length; i++){
    let offer = array[i]/10;
    
    console.log(`Item value : ${array[i]}`);
    array[i] = array[i] - offer;
    console.log(`Item value after offer removal: ${array[i]}`);

    sum += array[i]
}

console.log(`Total price afer the offer of 10%: ${sum}`);