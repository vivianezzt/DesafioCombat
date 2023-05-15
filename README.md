# Formação Desenvolvedor Moderno
### Módulo: Programação Moderna
### Capítulo: Construtores, this, sobrecarga, encapsulamento

# Desafio COMBATE

<P> Em um jogo de combate, cada jogador joga com um campeão. Cada campeão possui um nome, uma
quantidade de ataque, armadura e vida. O combate entre dois campeões é organizado em turnos, de modo
que em cada turno, os dois campeões se atacam. Você deve fazer um programa para instanciar dois
campeões, depois executar N turnos de combate, mostrando a cada turno o estado de cada campeão,
conforme exemplos. Se em um turno um dos campeões morrer (quantidade de vida igual a zero), o
combate deve terminar. Ao final do combate, mostrar na tela "FIM DO COMBATE". </p><br>
<h5> A regra para um campeão A receber dano de outro campeão B é a seguinte: 
</h5>
<ol type="1">
	<li>A quantidade de vida do campeão A deve ser decrescida da quantidade de ataque do campeão B, descontada a
quantidade de armadura do campeão A. A quantidade de vida resultante não pode ser menor que zero. </li>
	<li> Independente da quantidade de armadura do campeão A, pelo menos 1 de vida o campeão A deve perder. 
</li>

<p> Você deve criar uma classe para representar o campeão, conforme projeto abaixo. </p>

<img src="https://github.com/vivianezzt/DesafioCombat/blob/main/img/champion.png">

<p> O método status deve retornar o nome
e a situação de vida do campeão
(inclusive com a palavra "morreu" se
a vida estiver a zero), conforme
exemplos </p>

## EXEMPLO 1

<img src="https://github.com/vivianezzt/DesafioCombat/blob/main/img/combate-1.png">


## EXEMPLO 2 

<img src="https://github.com/vivianezzt/DesafioCombat/blob/main/img/combate-2.png">

## CRITÉRIOS DE AVALIAÇÃO (TODOS DEVEM ESTAR CORRETOS): 

<ol type="1">
 	<li> Nomes de classes, atributos, métodos e argumentos respeitando o projeto, bem como as convenções
de nome para Java (classe com primeira letra maiúscula, e padrão "camel case" para atributos, variáveis
e métodos. </li>
	<li> Atributos da classe Champion corretos e devidamente encapsulados com métodos get/set. </li>
	<li> Construtor da classe Champion correto. </li>
	<li> Método takeDamage da classe Champion correto.</li>
	<li> Método status da classe Champion correto. </li>
	<li> Comportamento do programa correto conforme exemplos. </li>

  <h3> CRÉDITOS &copy;</h3>
<h4> Este desafio foi proposto pelo Prof. <a href="https://www.instagram.com/devsuperior.ig/">Nélio Alves</a> no Módulo - Programação Moderna (JAVA)
</h4><a href="https://devsuperior.com.br/evento-sds">DEVSUPERIOR - Faça parte você támbem</a>
