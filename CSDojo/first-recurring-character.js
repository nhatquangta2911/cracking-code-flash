const findFirstRecurringCharacter = (givenString) => {
   let recurringCharacters = "";

   for(let i = 0; i < givenString.length - 1; i++) {
      for(let j = i + 1; j < givenString.length; j++) {
         if (givenString.charAt(i) === givenString.charAt(j)) {
            recurringCharacters += givenString.charAt(i);
         }
      }
   }

   let result = recurringCharacters.charAt(0);
   return result;
}

const myString = 'CBADEFBACCDHD';
console.log(findFirstRecurringCharacter(myString));
