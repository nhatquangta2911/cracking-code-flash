const addOne = (givenArray) => {
   let carry = 1;
   let result = new Array(givenArray.length);
   for (let i = givenArray.length - 1; i >= 0; --i) {
     let sum = givenArray[i] + carry;
     if(sum === 10) {
        carry = 1; 
     } else {
        carry = 0;
     }
     result[i] = sum % 10;
   }
   if(carry === 1) {
      result = new Array(givenArray.length + 1).fill(0);
      result[0] = 1;
   }
   return result;
}

const myArray = [9, 9, 9, 9, 9];
console.log(addOne(myArray));