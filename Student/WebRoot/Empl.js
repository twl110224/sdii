function Btn(id, mbtn) {
	var item = {
		"id" : id,
		"mbtn" : mbtn
	}
	$("#cc #right").load(contextPath + "/" + mbtn, item);
	
}