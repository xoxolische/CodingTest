function onClickCreate() {
	
	var item = {	
			
			customer: $("#customer").val(),
			ccyPair: $("#ccyPair").val(),
			type: $("#type").val(),
			direction: $("#direction").val(),
			tradeDate: $("#tradeDate").val(),
			amount1: $("#amount1").val(),
			amount2: $("#amount2").val(),
			rate: $("#rate").val(),
			valueDate: $("#valueDate").val(),
			legalEntity: $("#legalEntity").val(),
			trader: $("#trader").val()			
			
			/*
			
			customer:"PLUTO1",
			ccyPair:"EURUSD",
			type:"Spot",
			direction:"BUY",
			tradeDate:"2016-08-11",
			amount1:1000000.00,
			amount2:1120000.00,
			rate:1.12,
			valueDate:"2016-08-15",
			legalEntity:"CS Zurich",
			trader:"JohannBaumfiddler"
			*/
			
	    };
	$.ajax({
        url: "create",
        method: 'POST',
        data: JSON.stringify(item),
        contentType: "application/json",
        dataType: 'json'
	}).done(function (data) {
    	$('html, body').animate({ scrollTop: 0 }, 'fast');
    	$("#submitCollector").fadeIn("slow", function () {
    		$("#submitCollector").html(data.entity);
    		//$("#submitCollector").html(data.entityType);
    		console.log(data);
    	});
	})
}
