const formulario = document.querySelector("form")

/*PEGA O INPUT NOME E SELECIONA NA QUERY A CLASSE NOME*/
const Inome = document.querySelector(".nome");
const Iemail = document.querySelector(".email");
const Isenha = document.querySelector(".senha");
const Itelefone = document.querySelector(".telefone");

function cadastrar() {

    fetch("http://localhost:8080/usuarios",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        /*JSON QUE VAI SER ENCAMINHADO PARA API*/
        method: "POST",
        body: JSON.stringify({
            nome: Inome.value,
            email: Iemail.value,
            senha: Isenha.value,
            telefone: Itelefone.value
        })
    })
    .then(function(res) {console.log(res) })
    .catch(function(res) {console.log(res) })
};

/*ATRIBUI VALORES VAZIOS PARA OS INPUTS*/
function limpar (){
    Inome.value = "";
    Iemail.value = "";
    Isenha.value = "";
    Itelefone.value = "";
};

/*FUNÇÃO PARA CRIAR O EVENTO DE SALVAR OS INPUTS*/
formulario.addEventListener('submit', function (event){
    event.preventDefault();

    cadastrar();
    limpar();
});     

