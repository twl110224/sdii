layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  $("#xiugai").click(function(){
	  var id = $("#id").val();
	  var name = $("#name").val();

	  var data = {
			  "id":id,
			  "name":name,
	  }
	  $.ajax({
	  		url:"/Student/ClassUpdate",
			data:data,
			tyep:"post",
			success:function(data){
					layer.msg("用户信息修改成功");
					setTimeout(function(){
						layer.closeAll("iframe");
			            //刷新父页面
			            parent.location.reload();
		        	},1000);
			}
	  })
	  return false;
})

});