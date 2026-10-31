
const prompt = require("prompt-sync")();

console.log("How Many Students Do You Have: ");
let student = Number(prompt());

console.log("How Many Subjects Do They Offer: ");
let subject = Number(prompt());

console.log("Saving >>>>>>>>>>>>>>>>>>");
console.log("Saved Successfully");

let scores = [];

for (let index = 0; index < student; index++) {
    scores[index] = [];

    for (let count = 0; count < subject; count++) {
        console.log("Scores for student " + (index + 1));
        console.log("Scores for subject " + (count + 1) + " : ");

        let score = Number(prompt());

        while (score < 0 || score > 100) {
            console.log("Invalid score");
            score = Number(prompt());
        }

        scores[index][count] = score;

        console.log("Saving >>>>>>>>>>>>>");
        console.log("Saved Successfully");
    }
}

let total = [];

for (let count = 0; count < student; count++) {
    let sum = 0;

    for (let index = 0; index < subject; index++) {
        sum += scores[count][index];
    }

    total[count] = sum;
}

let studentPosition = [];

for (let count = 0; count < student; count++) {
    studentPosition[count] = 1;

    for (let index = 0; index < student; index++) {
        if (total[index] > total[count]) {
            studentPosition[count]++;
        }
    }
}

console.log("================ STUDENT RESULT ================");

console.log("Students | Scores | Total | Average | Positon");

for (let count = 0; count < student; count++) {
    let average = total[count] / subject;

    let result = "Students " + (count + 1) + " | ";

    for (let index = 0; index < subject; index++) {
        result += scores[count][index] + " ";
    }

    result += "| " + total[count];
    result += " | " + average;
    result += " | " + studentPosition[count];

    console.log(result);
}

console.log("================================================");

