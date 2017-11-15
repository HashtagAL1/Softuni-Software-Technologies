function Calculator(leftOperand, operator, rightOperand) {
    this.leftOperand = leftOperand;
    this.rightOperand = rightOperand;
    this.operator = operator;
    this.calculateResult = function () {
        let res = 0;
        switch (this.operator){
            case '+':
                res = this.leftOperand + this.rightOperand;
                break;
            case"-":
                res = this.leftOperand - this.rightOperand;
                break;
            case '*':
                res = this.leftOperand * this.rightOperand;
                break;
            case '/':
                res = this.leftOperand / this.rightOperand;
                break;
        }
        return res;
    }
}

module.exports = Calculator;