   //  사진마다 배경색이 바뀌게 하는 함수
   const myCarousel = document.getElementById('carouselExampleControls')

   myCarousel.addEventListener('slide.bs.carousel', event => {
       if(document.querySelector(".carousel-item:nth-of-type(3)").classList.contains("active")){
           document.querySelector(".main-container").style.background="black"
       }
       if(document.querySelector(".carousel-item:nth-of-type(1)").classList.contains("active")){
           document.querySelector(".main-container").style.background="red"
       }
       if(document.querySelector(".carousel-item:nth-of-type(2)").classList.contains("active")){
           document.querySelector(".main-container").style.background="blue"
       }
   })

//  검색창에 계속 검색되는 함수
function autoPlaceholder(){
   const letters =["가게를 검색해보세요.","맛있다정육점"];
   const speed = 100;
   let i =0;
   let text ="";
   const value = document.querySelector(".main-search-form input[type='search']");

   // 글쓰기
   const typing = async ()=>{
        let temp= "";
        const letter = letters[i].split("");

        while(letter.length){
            await wait(speed);
            text += letter.shift();
            value.setAttribute("placeholder", text);
       }
        temp = text + "|";
        value.setAttribute("placeholder", temp);
        await wait(300);
        value.setAttribute("placeholder", text);
        await wait(300);
        value.setAttribute("placeholder", temp);
        await wait(300);
        value.setAttribute("placeholder", text);
        await wait(300);
        value.setAttribute("placeholder", temp);
        await wait(300);
        value.setAttribute("placeholder", text);
        await wait(300);
        value.setAttribute("placeholder", temp);
        await wait(300);
        
        remove();
       
   }
    // 글지우기
    const remove = async ()=>{
        const letter = letters[i].split("");
       
        while(letter.length){
            await wait(speed);
           
           letter.pop();
           text = letter.join("");
           value.setAttribute("placeholder", text);
       }
       
       if(i == letters.length-1){
           i = 0;
       }else{
           i++;
       }

       typing();
   }

   // 기다리기
   function wait(ms){
       return new Promise(res => setTimeout(res, ms))
   }

   setTimeout(typing,2700);

}

autoPlaceholder();


//  검색창에 글을 입력하면 돋보기 사라지게 하는 이벤트 리스너
document.querySelector(".main-search-form input[type='search']").addEventListener('focus',function(){
   document.querySelector(".search-icon").style.opacity="0%"
});
document.querySelector(".main-search-form input[type='search']").addEventListener('blur',function(){
   document.querySelector(".search-icon").style.opacity="80%"
})