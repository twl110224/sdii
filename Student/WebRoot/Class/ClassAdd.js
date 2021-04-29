layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  $("#tijiao").click(function(){
	  var username = $("#name").val();
	  var data = {
			  "name":name,		 
	  }
	  $.ajax({
	  		url:"/Student/ClassInsert",
			data:data,
			tyep:"post",
			success:function(data){
					layer.msg("添加成功")
					setTimeout(function(){
						layer.closeAll("iframe");
			            //刷新父页面
			            parent.location.reload();
						/*var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
						parent.layer.close(index); //再执行关闭
*/		        	},1000);
			
				
			}
	  })
	  return false;
})

});