function solution(number){
    let sum = 0
    Array.from({length: number - 1}, (_,i) => i + 1 ).map( (x) =>
        ( x / 3 ) % 1 == 0 || ( x / 5 ) % 1 == 0 ? sum += x : sum = sum )
  return sum
}
console.log(solution(10))