function sumNumbers() {
    let fnum = Number(document.getElementById('num1').value);
    let snum = Number(document.getElementById('num2').value);
    document.getElementById('result').innerHTML = fnum + snum;
}

function expressionProblem2(){
    let res = Math.pow(((30+25) * (1/3) * (35-14-12)),2);
    console.log(res);
}

function sumTwoNumbers(arr) {
    let res = Number(arr[0]) + Number(arr[1]);
    console.log(res);
}

function threeIntsSum(str) {
    let nums = str.toString().split(' ').map(Number);
    let num1 = nums[0];
    let num2 = nums[1];
    let num3 = nums[2];
    if(num1 == num2 + num3) {
        let min = Math.min(num2, num3);
        let max = Math.max(num2, num3);
        console.log(min + ' + ' + max + ' = ' + num1);
    }
    else if(num2 == num1 + num3) {
        let min = Math.min(num1, num3);
        let max = Math.max(num1, num3);
        console.log(min + ' + ' + max + ' = ' + num2);
    }
    else if(num3 == num1 + num2) {
        let min = Math.min(num2, num1);
        let max = Math.max(num2, num1);
        console.log(min + ' + ' + max + ' = ' + num3);
    }
    else
        console.log("No");
}

function symmetricalNumbers(input) {
    let isSym = true;
    for(let i = 1; i <= Number(input); i++) {
        let temp = String(i);
        for(let j = 0; j < temp.length; j++) {
            if(temp[j] != temp[temp.length - 1 - j]){
                isSym = false;
                break;
            }
            isSym = true;
        }
        if(isSym)
            console.log(i);
    }
}

function sumsByTown(arr) {
    let objects = arr.map((JSON.parse));
    let sums = {};
    for (let obj of objects) {
        if(obj.town in sums) {
            sums[obj.town] += obj.income;
        }
        else {
            sums[obj.town] = obj.income;
        }
    }
    let towns = Object.keys(sums).sort();
    for (let town of towns) {
        console.log(town + ' -> ' + sums[town]);
    }
}

function largestThreeNumbers(input) {
    let nums = input.map(Number);
    let sorted = nums.sort((a,b) => b - a);
    let count = Math.min(3, sorted.length);
    for(let i = 0; i < count; i++) {
        console.log(sorted[i]);
    }
}

function extractCapitalLettersWords(input) {
    let text = input.join(',');
    let words = text.split(/\W+/);
    let nonEmpty = words.filter(x => x.length > 0);
    let res = nonEmpty.filter(isUpper);
    console.log(res.join(', '));
    function isUpper(str) {
        return str === str.toUpperCase();
    }
}
