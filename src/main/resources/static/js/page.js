$(function(){
		
		/**
			带有li的就是li标签
			不带有li的是a超链接
		**/
		
		//获取上一页的页码是多少
		var pre = $("#pre").attr("yema");
		if(pre < 1){//上一页是禁用状态---给上一页所属的li标签添加class="disabled"
			$("#li_pre").attr("class","disabled");
			$("#pre").attr("href","javascript:;");
			$("#li_first").attr("class","disabled");
			$("#first").attr("href","javascript:;");
		}
		
		//获取下一页的页码是多少
		var next = $("#next").attr("yema");
		var n = parseInt(next);
		//获取总页数/05_BookKeeping/WebRoot/statics/js/page.js
		var total = $("#total").attr("yema");
		var t = parseInt(total);
		if(n > t){
			$("#li_next").attr("class","disabled");
			$("#next").attr("href","javascript:;");
			$("#li_total").attr("class","disabled");
			$("#total").attr("href","javascript:;");
		}
	});