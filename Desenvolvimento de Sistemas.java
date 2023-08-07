<h1>Fixação conteúdo JS<h1>

<h2>Faça um código que liste os carros de uma concessionária que possui 10 carros, sobre<h2>
<h2>cada carro é importante colocar modelo, marca, cor e ano. Após isso, crie uma função que mostre<h2>
<h2>todos os modelos de carro que tem no ano escolhido (o ano deve ser parâmetro de entrada na função).<h2>

<h2>const carros = [<h2>
<h2>    {<h2>
<h2>        modelo : "AMG GT 63S",<h2>
<h2>        marca : "Mercedes",<h2>
<h2>        cor : "Preto fosco",<h2>
<h2>        ano : 2020<h2>
<h2>    },<h2>
<h2>    {<h2>
<h2>        modelo : "RS6 Avant",<h2>
<h2>        marca : "Audi",<h2>
<h2>        cor : "Preto fosco",<h2>
<h2>        ano : 2023<h2>
<h2>    },<h2>
<h2>    {<h2>
<h2>        modelo : "M8 Competition",<h2>
<h2>        marca : "BMW",<h2>
<h2>        cor : "Preto fosco",<h2>
<h2>        ano : 2022<h2>
<h2>    },<h2>
<h2>    {<h2>
<h2>        modelo : "Aventador SVJ",<h2>
<h2>        marca : "Lamborghini",<h2>
<h2>        cor : "Roxo metalico",<h2>
<h2>        ano : 2018<h2>
<h2>    },<h2>
<h2>    {<h2>
<h2>        modelo : "SF90 2022",<h2>
<h2>        marca : "Ferrari",<h2>
<h2>        cor : "Preto metalico",<h2>
<h2>        ano : 2022<h2>
<h2>    },<h2>
<h2>    {<h2>
<h2>        modelo : "GT3 RS",<h2>
<h2>        marca : "Porsche",<h2>
<h2>        cor : "Verde metalico",<h2>
<h2>        ano : 2019<h2>
<h2>    },<h2>
<h2>    {<h2>
<h2>        modelo : "GTR R35 Nismo",<h2>
<h2>        marca : "Nissan",<h2>
<h2>        cor : "Branco metalico",<h2>
<h2>        ano : 2007<h2>
<h2>    },<h2>
<h2>    {<h2>
<h2>        modelo : "Supra MK4",<h2>
<h2>        marca : "Toyota",<h2>
<h2>        cor : "Laranja",<h2>
<h2>        ano : 1993<h2>
<h2>    },<h2>
<h2>    {<h2>
<h2>        modelo : "Civic Type R",<h2>
<h2>        marca : "Honda",<h2>
<h2>        cor : "Azul metalico",<h2>
<h2>        ano : 2023<h2>
<h2>    },<h2>
<h2>    {<h2>
<h2>        modelo : "P1",<h2>
<h2>        marca : "McLaren",<h2>
<h2>        cor : "Branco metalico",<h2>
<h2>        ano : 2013<h2>
<h2>    }<h2>
<h2>]<h2>
<h2>ano(2013)<h2>
<h2>function ano(ano){<h2>
<h2>    for(i = 0; i < carros.length; i++){<h2>
<h2>        if(carros[i].ano == ano){<h2>
<h2>        console.log(carros[i])<h2>
<h2>        }<h2>
<h2>    }<h2>
<h2>}<h2>




<h2>[Running] node "c:\Users\igor_p_pinto\Desktop\Atividade dos Carros\atividade.js"<h2>
<h2>{ modelo: 'P1', marca: 'McLaren', cor: 'Branco metalico', ano: 2013 }<h2>


<h2>[Done] exited with code=0 in 0.091 seconds<h2>

<h2>Link da atividade no classroom https://classroom.google.com/c/NTQyMTY1MDY2ODUz/a/NjEzMzAzMzE3NTk5/details <h2>
