
// console.log(occurences)
const str = "Mississippi";
let countForS = 0, countForI = 0;

for (let i = 0; i < str.length; i++) {
  if (str[i] === 's') {
    countForS++;
  } else if (str[i] === 'i') {
    countForI++;
  }
}

console.log("Number of S: " + countForS);
console.log("Number of I: " + countForI);
