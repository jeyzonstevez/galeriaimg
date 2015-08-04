var ultimaImagen = document.getElementById('imagenprincipal').src;


function imagen1() {
var ultimaImagen = document.getElementById('imagenprincipal').src;
document.getElementById('imagenprincipal').src='./imagenes/imagen1.jpg';
}


function imagen3() {
	var ultimaImagen = document.getElementById('imagenprincipal').src;
document.getElementById('imagenprincipal').src='./imagenes/imagen3.jpg';
}


function imagen4() {
	var ultimaImagen = document.getElementById('imagenprincipal').src;
document.getElementById('imagenprincipal').src='./imagenes/imagen4.jpg';
}


function imagen5() {
	var ultimaImagen = document.getElementById('imagenprincipal').src;
document.getElementById('imagenprincipal').src='./imagenes/imagen5.jpg';
}

function volver () {
	var ultimaImagen = document.getElementById('imagenprincipal').src;
	document.getElementById("imagenprincipal").src="./imagenes/imagen2.jpg"}


function imagenFija(archivo) {
	var ver = "./imagenes/"+archivo;
	ultimaImagen =document.getElementById('imagenprincipal').src=ver;
}
