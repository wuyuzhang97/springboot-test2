/*function check(){
	var bookPage=$("#bookPage").val()
	var bookPrice=$("#bookPrice").val()
	for (var i = 0; i < bookPage.length; i++) {
		var str2=bookPage.substr(i, i+1);
		if(isNaN(str2)){
			alert("页数必须是数字");
			return false;
		}
	}
	var len=bookPage.indexOf(".")
	if(len>0){
		alert("页数必须是整数");
		return false;
	}
	for (var i = 0; i < bookPrice.length; i++) {
		var str2=bookPrice.substr(i, i+1);
		if(isNaN(str2)){
			alert("价格必须是数字");
			return false;
		}
	}
	return true;
}*/