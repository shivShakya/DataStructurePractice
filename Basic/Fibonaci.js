
const createFib = (n)=>{
       // initialisized variable
       const arr = [];
       let a = 0 ;
       let b = 1;
       let c ;

       // declaration
       arr[0] = a;
       arr[1] = b;
       

       // main logic 
       for(let i = 2 ; i < n ; i++){
             c = a + b;
             arr[i] = c;
             a = b;
             b = c;
       }

       //returing
       return arr; 
}


const n = parseInt(prompt("Enter the number"),5);
let arr = createFib(n);

for(let i = 0 ; i < arr.length ; i++){
       console.log(arr[i]+ " ");
}