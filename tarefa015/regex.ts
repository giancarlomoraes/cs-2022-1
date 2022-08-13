//Exercício 1

function validaLogin(login: string){
    if (/([a-zA-Z0-9$&+,:;=?@#|'<>.^*()%!-]{5,30})\w+/.test(login)) {
        console.log("O login passou nas verificações");
    }else{
        console.log("O login não passou nas verificações")
    }
}

console.log("Validações para login")
validaLogin("gian")
validaLogin("%Gian123456")

//Exercício 2

function validaSenha(login: string){
    if (/^(?=.*[a-z])(?=.*[A-Z])(?=.*[$&+,:;=?@#|'<>.^*()%!-])[0-9a-zA-Z$&+,:;=?@#|'<>.^*()%!-]{8,12}$/.test(login)) {
        console.log("A senha passou nas verificações");
    }else{
        console.log("A senha não passou nas verificações")
    }
}

console.log("\nValidações para senha")

validaSenha("Gian123")
validaSenha("*Gian123456")
