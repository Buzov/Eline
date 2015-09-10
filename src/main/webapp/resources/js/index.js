$(function()
	{
		$('.cell').mouseenter(function()
		{
			$(this).addClass('active');
			$('#accordion').children().not($(this)).addClass('inactive');
			
		})
		.mouseleave(function()
		{
			$(this).removeClass('active');
			$('#accordion').children().not($(this)).removeClass('inactive');
			
		});
		
	});