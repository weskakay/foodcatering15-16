function changeImg(name, day){
	setTimeout(hide(day),500);
	setTimeout(newImage(name, day), 500);
	setTimeout(show(day),500);
	}
function newImage(name, day){
	$('#img'+day).attr('src','/resources/jpg/'+name+day+'.jpg');
	}
function show(day){
	$('#img'+day).attr('style','opacity: 1; transition-property: opacity; transition-duration: 0.5s; transition-delay: 10ms;');
	}
function hide(day){
	$('#img'+day).attr('style','opacity: 0; transition-property: opacity; transition-duration: 0.5s; transition-delay: 10ms;');
	}
	
function setClass(type){
	if (type=='#REGULAR'){
		return "mdl-tabs__panel is-active";
	}
	else{
		return "mdl-tabs__panel";
	}
}