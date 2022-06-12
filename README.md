##PASSOS PRA EXECUÇÂO##
Basta rodar como aplicação Spring, ele vai criar um banco em memoria e subir a aplicação.
Subindo a aplicação na porta 8080 que é padrão no Spring

##CONTROLLER
Localhost:8080/ #Get
	Retorna a lista com todos os communications 	registrados
Localhost:8080/{id} #Get
	Retorna o communication com o Id especifico
Localhost:8080/ #Post
	Adciona um novo communication
Localhost:8080/{id} #Put
	Atualiza um communication com o id especifico
Localhost:8080/{id} #Delete
	Deleta o communication com o id especificado