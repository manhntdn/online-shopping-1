$ (function () {
	
	switch (menu) {
		
	case 'About Us':  	
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProduct').addClass('active');
	default: 
		$('#listProduct').addClass('active');
		$('#a'+menu).addClass('active');
		break;
	}
})