

$(document).ready(function(){


	// var userAgent = window.navigator.userAgent.toLowerCase();

	// if(userAgent.indexOf('iphone') != -1){
	// 	$(document.body).css("background-repeat","no-repeat").css("background-size","100%");
	// }else if(userAgent.indexOf('Android') != -1){
	// 	$(document.body).css("background-repeat","no-repeat").css("background-size","100%");
	// }else{
	// 	$(document.body).css("background-repeat","no-repeat").css("background-size","100%");
	// };
});


$(document).ready(function(){
	$('.signup').css("display","none");
	// $('.login').css("display","inline");
	
	var options = [ {selector: '.login', offset: 0, callback: 'Materialize.showStaggeredList("#move-card")' } ];
	Materialize.scrollCard(options);

	$('.login').css("visibility","visible");
});


//---------------- card change & button text change ----------------
var changeCard = function(){

	var login_card_status = $('.login').css("display");

	//共通のアクション
	var options = [];
	Materialize.scrollCard(options);

	//sign up カードを出現させる
	if( login_card_status != 'none' ){
		$('.login').css("display","none");
		$('.signup').css("display","inline");
		$('.signup').fadeTo("fast", 0).animate({ opacity: 1 });
		$('.cardChangeButton').text("Log in");
		// options.push({selector: '.signup', offset: 0, callback: 'Materialize.showStaggeredList("#move-card")' });
	}
	// log in を出現させる
	else{
		$('.signup').css("display","none");
		$('.login').css("display","inline");
		// options.push({selector: '.login', offset: 0, callback: 'Materialize.showStaggeredList("#move-card")' });
		$('.login').fadeTo("fast", 0).animate({ opacity: 1 });
		$('.cardChangeButton').text("Sign up");
	}

}


// var options = [
//     {selector: '#staggered-test', offset: 400, callback: 'Materialize.showStaggeredList("#staggered-test")' }
// ];
// Materialize.scrollFire(options);


