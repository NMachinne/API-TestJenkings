var suma = document.getElementById("btnSumar");
var multiplicar = document.getElementById("btnMultiplicar");

var urlSuma = "http://localhost:5000/sumar";
var urlMulti = "http://localhost:5000/multiplicar";

suma.addEventListener("click", funSumar);
multiplicar.addEventListener("click", funMultiplicar);

async function funSumar() {
    var num1 = parseInt(document.getElementById("numero1").value);
    var num2 = parseInt(document.getElementById("numero2").value);

    if(isNaN(num1) || isNaN(num2)){
        alert("Los campos no estan rellenos")
    } else{
        var urlEncoded = urlSuma + '?numero1=' + num1 + '&numero2=' + num2;
        var petSuma = await fetch(urlEncoded, {
            method: 'POST', //usar POST, GET u otros métodos según la API
            headers: {
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin':'*'
            },
            body: '',
            mode: 'cors'
        })

        if (petSuma.ok)
        {
            const data = await petSuma.json();
            //Hacemos algo con los datos de vuelta.
            //var resultado = data.resultado;
            document.getElementById("resultado").innerHTML = data;
        }
    
    }
    //var resultado = num1 + num2;
    //document.getElementById("resultado").innerHTML = resultado;

}

async function funMultiplicar(){
    var num1 = parseInt(document.getElementById("numero1").value);
    var num2 = parseInt(document.getElementById("numero2").value);

    if(isNaN(num1) || isNaN(num2)){
        alert("Los campos no estan rellenos")
    } else{
        var urlEncoded = urlMulti + '?numero1=' + num1 + '&numero2=' + num2;
        var petMulti = await fetch(urlEncoded, {
            method: 'POST', //usar POST, GET u otros métodos según la API
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ numero1: num1, numero2: num2 }),
            mode: 'cors'
        })

        if (petMulti.ok)
        {
            const data = await petMulti.json();
            //Hacemos algo con los datos de vuelta.
            //var resultado = data.resultado;
            document.getElementById("resultado").innerHTML = data;
        }
    }

    //var resultado = num1 * num2;
    //document.getElementById("resultado").innerHTML = resultado;
}
