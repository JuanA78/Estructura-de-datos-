function fact1(n){

let acum=1;
let i=1;
while (i<=n){
    acum*=i;
    i++;

}
return acum;
}

r=fact1(5);
console.log(r);
window.alert(r);