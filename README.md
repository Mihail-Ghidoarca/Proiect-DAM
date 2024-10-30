# Proiect-DAM
users(
 iduser pk
 username,
 pass,
 data nasterii
 email,
 phonenmb
 isLoggedIn(bool)
 enum status),
echipa(
 	idechipa pk,
 	iduser 
 	numeEchipa),
turneu(
 	idturneu pk,
 	numeturneu)
interface games(
 	idgame pk
 	nume)
 pc_games (child games)(
 	getters setters)
 console_games (child games)
 {	
 	getters setters
 	nr_bucati}
interface dispozitive(
	iddisp pk
	numedisp
	pret(per/ora))
pc(child dispozitive)(
	periferice
	specs
	getters setters
	pret(per/ora))
console(child dispozitive)
(
	getters setters
	pret(per/ora))
programari(

	idprogr
	iduser
	data
	iddisp
	idgame)

spring react mongodb
