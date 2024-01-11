//map 반복문
//map 반복문, slice, filter
let array=['red','green','blue','pink','orange','gray'];
//map 을 이용해서 출력하기 
array.map((color,idx)=>console.log(idx+":"+color));
console.log("-----------------");
//배열의 데이타 잘라내기(slice), 걸러내기 (filter)
//blue 를 삭제 후 다시 출력 
// array=[...array.slice(0,2), /*0~1번을 잘라내기 : red, green*/
//         ...array.slice(3,array.length) /*3부터 length-1까지 잘라내기*/
//     ];
//         array.map((color,idx)=>console.log(idx+":"+color));

//이번엔 filter 로 blue 인 2번 만 걸러보자
let array2 = array.filter((color,idx)=>idx!==2); //i가 2가 아닌것만 리턴 (필터링)
array2.map((color,idx)=>console.log(idx+":"+color));