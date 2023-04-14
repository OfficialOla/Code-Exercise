function numberOfAge(value){
    let valueOfYearInDay = value*365;
    let valueInHour = valueOfYearInDay * 24;
    let valueInMins = valueInHour * 60;
    let valueInSecs = valueInMins * 60;
    let valueInMillisecs = valueInSecs * 1000;
    return valueInMillisecs

}
console.log(numberOfAge(20))