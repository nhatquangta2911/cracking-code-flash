const findFirstRecurringCharacter = givenArray => {
   let result = "";
   let recurringCharacters = new Map();
   for (let i = 0; i < givenArray.length; i++) {
      if (givenArray[i] in recurringCharacters.values()) {
         result = givenArray[i];    
         continue;
      } else {
         recurringCharacters.set(i, givenArray[i]);
      }
   }
   return "";
};

const myString = "DBCABA";
console.log(findFirstRecurringCharacter(myString));
