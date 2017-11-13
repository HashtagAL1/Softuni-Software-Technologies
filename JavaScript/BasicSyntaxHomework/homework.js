function multiplyBy2(input) {
    let num = Number(input[0]);
    console.log(num * 2);
}

function multiply2Numbers(input) {
    let num1 = Number(input[0]);
    let num2 = Number(input[1]);
    let res = num1 * num2;
    console.log(res);
}

function multiplyOrDivide(input) {
    let num1 = Number(input[0]);
    let num2 = Number(input[1]);
    let res;
    if(num1 <= num2) {
        res = num1 * num2;
    }
    else
        res = num1 / num2;
    console.log(res);
}

function productOf3Numbers(input) {
    let num1 = Number(input[0]);
    let num2 = Number(input[1]);
    let num3 = Number(input[2]);
    let cnt = 0;
    if(num1 < 0)
        cnt++;
    if(num2 < 0)
        cnt++;
    if(num3 < 0)
        cnt++;
    if(cnt == 1 || cnt == 3)
        console.log("Negative");

    else
        console.log("Positive");
}

function PrintNumbers(input) {
    let num = Number(input);
    for(let i = num; i > 0; i--) {
        console.log(i);
    }
}

function PrintLines(input) {
    for (let line of input) {
        if(line !== "Stop") {
            console.log(line);
        }
        else
            break;
    }
}

function NumbersInReversedOrder(input) {
    for(let i = input.length - 1; i > -1; i--) {
        console.log(input[i])
    }
}

function valuesToIndexes(input) {
    let length = Number(input[0]);
    let result = [];
    for(let i = 0; i < length; i++) {
        result[i] = 0;
    }
    for(let i = 1; i < input.length; i++) {
        let elements = input[i].split(/\s-\s/g);
        let index = Number(elements[0]);
        let value = Number(elements[1]);
        result[index] = value;
    }
    for (let num of result) {
        console.log(num);
    }
}

function addRemoveElements(input) {
    let result = [];
    for (let command of input) {
        let elements = command.split(' ');
        let action = elements[0];
        let number = Number(elements[1]);
        if(action === 'add') {
            result.push(number);
        }
        else if (action === 'remove') {
            if(number >= result.length || number < 0) {
                continue;
            }
            result.splice(number, 1);
        }
    }
    for (let num of result) {
        console.log(num);
    }
}

function keyValuePairs(input) {
    let res = {};
    for(let i = 0; i < input.length - 1; i++) {
        let keyValue = input[i].split(' ');
        let key = keyValue[0];
        let value = keyValue[1];
        res[key] = value;
    }
    let flag = input[input.length - 1];
    if(flag in res) {
        console.log(res[flag]);
    }
    else
        console.log('None');
}

function multipleKeyValuePairs(input) {
    let res = {};
    for(let i = 0; i < input.length - 1; i++) {
        let keyValue = input[i].split(' ');
        let key = keyValue[0];
        let value = keyValue[1];
        if(!(key in res)) {
            res[key] = [];
        }
        res[key].push(value);
    }
    let flag = input[input.length - 1];
    if(flag in res) {
        let output = res[flag].join('\n');
        console.log(output)
    }
    else
        console.log('None');
}

function storeStudents(input) {
    let res = [];
    for (let student of input) {
        let elements = student.split(/\s->\s/)
        let name = elements[0];
        let age = elements[1];
        let grade = elements[2];
        let stud = {name: name, age: age, grade: grade};
        res.push(stud);
    }
    for (let student of res) {
        console.log('Name: ' + student.name);
        console.log('Age: ' + student.age);
        console.log('Grade: ' + student.grade);
    }
}

function parseJSON(input) {
    for (let obj of input) {
        let res = JSON.parse(obj);
        console.log('Name: ' + res.name);
        console.log('Age: ' + res.age);
        console.log('Date: ' + res.date);
    }
}

function objectToString(input) {
    let obj = {};
    for (let line of input) {
        let elements = line.split(/\s->\s/);
        let property = elements[0];
        let value = elements[1];
        let flag = Number(value);
        if(isNaN(flag)) {
            obj[property] = value;
        }
        else
            obj[property] = flag;
    }
    let str = JSON.stringify(obj);
    console.log(str);

}