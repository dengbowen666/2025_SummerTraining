<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
	<%@ include file="../../static/head.jsp"%>
	<link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css" rel="stylesheet">
	<script type="text/javascript" charset="utf-8">
	    window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
	</script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
  	<style>
		.error{
			color:red;
		}
	</style>
<body>
	<!-- Pre Loader -->
	<div class="loading">
		<div class="spinner">
			<div class="double-bounce1"></div>
			<div class="double-bounce2"></div>
		</div>
	</div>
	<!--/Pre Loader -->
	<div class="wrapper">
		<!-- Page Content -->
		<div id="contentText">
				<!-- Top Navigation -->
				<%@ include file="../../static/topNav.jsp"%>
				<!-- Menu -->
				<div class="container menu-nav">
					<nav class="navbar navbar-expand-lg lochana-bg text-white">
						<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
						 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
							<span class="ti-menu text-white"></span>
						</button>
				
						<div class="collapse navbar-collapse" id="navbarSupportedContent">
							<!-- <div class="z-navbar-nav-title">$template2.back.menu.title.text</div> -->
							<ul id="navUl" class="navbar-nav mr-auto">
							
							</ul>
						</div>
					</nav>
				</div>
				<!-- /Menu -->
				<!-- Breadcrumb -->
				<!-- Page Title -->
				<div class="container mt-0">
					<div class="row breadcrumb-bar">
						<div class="col-md-6">
							<h3 class="block-title">编辑申请岗位</h3>
						</div>
						<div class="col-md-6">
							<ol class="breadcrumb">
								<li class="breadcrumb-item">
									<a href="${pageContext.request.contextPath}/index.jsp">
										<span class="ti-home"></span>
									</a>
								</li>
								<li class="breadcrumb-item"><span>申请岗位管理</span></li>
								<li class="breadcrumb-item active"><span>编辑申请岗位</span></li>
							</ol>
						</div>
					</div>
				</div>
			<!-- /Page Title -->

			<!-- /Breadcrumb -->
			<!-- Main Content -->
			<div class="container">

				<div class="row">
					<!-- Widget Item -->
					<div class="col-md-12">
						<div class="widget-area-2 lochana-box-shadow">
							<h3 class="widget-title">申请岗位信息</h3>
							<form id="addOrUpdateForm">
								<div class="form-row">
									<input id="updateId" name="id" type="hidden">
									<div class="form-group col-md-6">
										<label>岗位名称</label>
										<input name="gangweimingcheng" id="gangweimingcheng" name="gangweimingcheng" class="form-control" placeholder="岗位名称">
									</div>
									<div class="form-group col-md-6">
										<label>岗位要求</label>
										<input name="gangweiyaoqiu" id="gangweiyaoqiu" name="gangweiyaoqiu" class="form-control" placeholder="岗位要求">
									</div>
									<div class="form-group col-md-6">
										<label>岗位性质</label>
										<input name="gangweixingzhi" id="gangweixingzhi" name="gangweixingzhi" class="form-control" placeholder="岗位性质">
									</div>
									<div class="form-group col-md-6">
										<label>薪资待遇</label>
										<input name="xinzidaiyu" id="xinzidaiyu" name="xinzidaiyu" class="form-control" placeholder="薪资待遇">
									</div>
									<div class="form-group col-md-6">
										<label>人数</label>
										<select id="renshuSelect" name="renshu" class="form-control">
												<option value=""></option>
												<option class="renshuOption" value="1">
													1
												</option>
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>部门编号</label>
										<input name="bumenbianhao" id="bumenbianhao" name="bumenbianhao" class="form-control" placeholder="部门编号">
									</div>
									<div class="form-group col-md-6">
										<label>部门名称</label>
										<input name="bumenmingcheng" id="bumenmingcheng" name="bumenmingcheng" class="form-control" placeholder="部门名称">
									</div>
									<div class="form-group col-md-6">
										<label>申请理由</label>
										<textarea  name="shenqingliyou" class="form-control" id="shenqingliyou" rows="3"></textarea>
									</div>
									<div class="form-group col-md-6">
										<label>申请进度</label>
										<select id="shenqingjinduSelect" name="shenqingjindu" class="form-control">
												<option value=""></option>
												<option class="shenqingjinduOption" value="已面试">
													已面试
												</option>
												<option class="shenqingjinduOption" value="待面试">
													待面试
												</option>
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>申请日期</label>
										<div id="shenqingriqiDate" class="input-append date form_datetime">
											<input id="shenqingriqi-input" name="shenqingriqi" size="15" type="text" readonly>
											<span class="add-on"><i class="icon-remove"></i></span>
											<span class="add-on"><i class="icon-calendar"></i></span>
										</div>
									</div>
									<div class="form-group col-md-6">
										<label>学号</label>
										<input name="xuehao" id="xuehao" name="xuehao" class="form-control" placeholder="学号">
									</div>
									<div class="form-group col-md-6">
										<label>姓名</label>
										<input name="xingming" id="xingming" name="xingming" class="form-control" placeholder="姓名">
									</div>
									<div class="form-group col-md-6">
										<label>院系</label>
										<input name="yuanxi" id="yuanxi" name="yuanxi" class="form-control" placeholder="院系">
									</div>
									<div class="form-group col-md-6">
										<label>专业</label>
										<input name="zhuanye" id="zhuanye" name="zhuanye" class="form-control" placeholder="专业">
									</div>
									<div class="form-group col-md-6">
										<label>手机</label>
										<input name="shouji" id="shouji" name="shouji" class="form-control" placeholder="手机">
									</div>
									<div class="form-group col-md-6">
										<label>是否贫困生</label>
										<select id="shifoupinkunshengSelect" name="shifoupinkunsheng" class="form-control">
												<option value=""></option>
												<option class="shifoupinkunshengOption" value="是">
													是
												</option>
												<option class="shifoupinkunshengOption" value="否">
													否
												</option>
										</select>	
									</div>	
										
									<div class="form-group-1 col-md-6 mb-3" style="display: flex;flex-wrap: wrap;">
										<button  id="submitBtn" type="button" class="btn btn-primary btn-lg">提交</button>
										<button id="exitBtn" type="button" class="btn btn-primary btn-lg">取消</button>
									</div>
								</div>
							</form>
						</div>
					</div>
					<!-- /Widget Item -->
				</div>
			</div>
			<!-- /Main Content -->
		</div>
		<!-- /Page Content -->
	</div>
	<!-- Back to Top -->
	<a id="back-to-top" href="#" class="back-to-top">
		<span class="ti-angle-up"></span>
	</a>
	<!-- /Back to Top -->
	<%@ include file="../../static/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.fileupload.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/jquery.validate.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/messages_zh.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/card.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
	<script>
		<%@ include file="../../utils/menu.jsp"%>
		<%@ include file="../../static/setMenu.js"%>
		<%@ include file="../../static/utils.js"%>
		<%@ include file="../../utils/baseUrl.jsp"%>   	

		var tableName = "shenqinggangwei";
		var pageType = "add-or-update";
		var updateId = "";
		var crossTableId = -1;
		var crossTableName = '';
		var ruleForm = {};
		var crossRuleForm = {};
				var renshuKucun = 0;



		var ruleForm = {};
		var vm = new Vue({
		  el: '#addOrUpdateForm',
		  data:{
			  ruleForm : {},
			},
		  beforeCreate: function(){
			  var id = window.sessionStorage.getItem("id");
				if(id != null && id != "" && id != "null"){
					$.ajax({ 
		                type: "GET",
		                url: baseUrl + "shenqinggangwei/info/" + id,
		                beforeSend: function(xhr) {xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));},
		                success: function(res){               	
		                	if(res.code == 0){
		                		vm.ruleForm = res.data;
				    		}else if(res.code == 401) {
				    			<%@ include file="../../static/toLogin.jsp"%>    
				    		}else{ alert(res.msg)}
		                },
		            });
				}
			},
			methods: { }
	  	});		

		// 文件上传
		function upload(){
		}  
		//取消 
		function cancel() {
            window.location.href = "list.jsp";
		}
		function getQueryString(name) { 
			var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
			var r = window.location.search.substr(1).match(reg); 
			if (r != null) return unescape(r[2]); 
			return null; 
		}

		// 表单提交
		function submit() {

			var crossFlag = getQueryString("cross");
			if(validform() ==true && compare() == true){
				if(crossFlag) {
					if(Number(renshuKucun) < Number($('#renshuSelect').val())){
						alert('人数不能大于'+renshuKucun+'！请重新输入');
						return false;
					}
				}
				let data = {};
				getContent();
				let value = $('#addOrUpdateForm').serializeArray();
				$.each(value, function (index, item) { 
							data[item.name] = item.value;
						});
				let json = JSON.stringify(data);
				var urlParam;
				var successMes = '';
				if(updateId!=null && updateId!="null" && updateId!=''){
					urlParam = 'update';
					successMes = '修改成功';
				}else{		
					urlParam = 'save';
					successMes = '添加成功';
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(crossFlag) {
					//如果跨表更新失败，不显示成功提示
					flag = crossTableUpdate();
										var statusColumnName = window.sessionStorage.getItem('statusColumnName'); 
					var statusColumnValue = window.sessionStorage.getItem('statusColumnValue'); 
					var obj = JSON.parse(window.sessionStorage.getItem('crossObj'));
					if(statusColumnName!='') {
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}
							}
							var table = window.sessionStorage.getItem('crossTableName');
							httpJson(crossTableName + "/update","POST",obj,(res)=>{
								if(res.code == 0){
									console.log('更新属性成功');
								}
							});   
						} else  {
							crossuserid = Number(window.sessionStorage.getItem('userid'));
							crossrefid = obj["id"];
							crossoptnum = window.sessionStorage.getItem('statusColumnName');
							crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					data.crossuserid=crossuserid;
					data.crossrefid=crossrefid;
					http("shenqinggangwei/page","GET",{
						page:1,
						limit:10,
						crossuserid:data.crossuserid,
						crossrefid:data.crossrefid,			
					},(res)=>{
						if(res.data.total >= crossoptnum){
							alert(window.sessionStorage.getItem('tips'));
							return false;
						} else {
							httpJson("shenqinggangwei/"+urlParam,"POST",data,(res)=>{
								if(res.code == 0){
									window.sessionStorage.removeItem('id');
									let flag = true;
									if(crossFlag) {
									}

									if(flag){
										alert(successMes);
									}
									if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true"){
										window.sessionStorage.removeItem('onlyme');
										window.location.href="${pageContext.request.contextPath}/index.jsp";
									}else{
                                        window.location.href = "list.jsp";
									}
									
								}
							});
						}
					});
				} else {
					httpJson("shenqinggangwei/"+urlParam,"POST",data,(res)=>{
						if(res.code == 0){
							window.sessionStorage.removeItem('id');
							let flag = true;
							if(crossFlag) {
							}

							if(flag){
								alert(successMes);
							}
							if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true"){
								window.sessionStorage.removeItem('onlyme');
								window.location.href="${pageContext.request.contextPath}/index.jsp";
							}else{
                                        window.location.href = "list.jsp";
							}
							
						}
					});
				}
			}else{
				alert("表单未填完整或有错误");
			}
		}

		// 填充富文本框
		function setContent(){
		}  

		// 获取富文本框内容
		function getContent(){
		}

		// 表单校验
		function validform() {
			return $("#addOrUpdateForm").validate({ 
				rules: {
				    gangweimingcheng: {
					required: true,
					},
				    gangweiyaoqiu: {
					},
				    gangweixingzhi: {
					},
				    xinzidaiyu: {
					},
				    renshu: {
					required: true,
					digits: true,
					},
				    bumenbianhao: {
					},
				    bumenmingcheng: {
					},
				    shenqingliyou: {
					},
				    shenqingjindu: {
					},
				    shenqingriqi: {
					},
				    xuehao: {
					},
				    xingming: {
					},
				    yuanxi: {
					},
				    zhuanye: {
					},
				    shouji: {
					isPhone: true,
					},
				    shifoupinkunsheng: {
					required: true,
					},
				    crossuserid: {
					},
				    crossrefid: {
					},
				    sfsh: {
					},
				    shhf: {
					},
				},
				messages: {
					gangweiyaoqiu: {
					},
					gangweixingzhi: {
					},
					xinzidaiyu: {
					},
					renshu: {
						required: "人数不能为空",
					},
					bumenbianhao: {
					},
					bumenmingcheng: {
					},
					shenqingliyou: {
					},
					shenqingjindu: {
					},
					shenqingriqi: {
					},
					xuehao: {
					},
					xingming: {
					},
					yuanxi: {
					},
					zhuanye: {
					},
					shouji: {
					},
					shifoupinkunsheng: {
						required: "是否贫困生不能为空",
					},
					crossuserid: {
					},
					crossrefid: {
					},
					sfsh: {
					},
					shhf: {
					},
				}
			}).form();
		}
		// 添加表单校验方法
		function addValidation(){
			jQuery.validator.addMethod("isPhone", function(value, element) {
					var length = value.length;
					var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(19[0-9]{1})|(17[0-9]{1}))+\d{8})$/;
					return this.optional(element) || (length == 11 && mobile.test(value));
			}, "请填写正确的手机号码");
                        jQuery.validator.addMethod("isIdCardNo", function(value, element) {
                                return this.optional(element) || value.length == 18;
                        }, "请正确输入您的身份证号码");
                        jQuery.validator.addMethod("isTel", function(value, element) {
                          var length = value.length;
                          var phone = /(^(\d{3,4}-)?\d{6,8}$)|(^(\d{3,4}-)?\d{6,8}(-\d{1,5})?$)|(\d{11})/;
                          return this.optional(element) || (phone.test(value));
                         }, "请填写正确的固定电话");//可以自定义默认提示信息
		}
		// 获取当前详情
		function getDetails() {
			var id = window.sessionStorage.getItem("id");
			if(id != null && id != "" && id != "null"){
				updateId = id;
				window.sessionStorage.removeItem('id');
				http("shenqinggangwei/info/" + id,"GET",{},(res)=>{
					if(res.code == 0){
						ruleForm = res.data
						// 是/否下拉框回显
						setSelectOption();
						// 设置图片src
						showImg();
						// 数据填充
						dataBind();
						// 富文本框回显	
						setContent();
												//注册表单验证
						$(validform());	
					}
				});
			}else{

				var shenqingjinduOptions = document.getElementsByClassName("shenqingjinduOption");
				for(var shenqingjinduCount = 0; shenqingjinduCount < shenqingjinduOptions.length;shenqingjinduCount++){
					if(shenqingjinduOptions[shenqingjinduCount].getAttribute('value') == "待面试"){
						shenqingjinduOptions[shenqingjinduCount].setAttribute('selected','selected');
					}
				}
				var shifoupinkunshengOptions = document.getElementsByClassName("shifoupinkunshengOption");
				for(var shifoupinkunshengCount = 0; shifoupinkunshengCount < shifoupinkunshengOptions.length;shifoupinkunshengCount++){
					if(shifoupinkunshengOptions[shifoupinkunshengCount].getAttribute('value') == "是"){
						shifoupinkunshengOptions[shifoupinkunshengCount].setAttribute('selected','selected');
					}
				}


		 		fill()
				//注册表单验证
		    		$(validform());
			}
		}	
		// 下拉框选项回显
		function setSelectOption(){
		}			
		// 关联下拉框改变
		function lvSelectChange(level){
			let data = {};
			let value = $('#addOrUpdateForm').serializeArray();
			$.each(value, function (index, item) { 
			            data[item.name] = item.value;
			        });
			
		}		
		// 清除可能会重复渲染的selection
		function clear(className){
			var elements = document.getElementsByClassName(className);
        	for(var i = elements.length - 1; i >= 0; i--) { 
        	  elements[i].parentNode.removeChild(elements[i]); 
        	}
		}		
		function dateTimePick(){
			$.fn.datetimepicker.dates['zh-CN'] = { 
		            days: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"],
		            daysShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六", "周日"],
		            daysMin:  ["日", "一", "二", "三", "四", "五", "六", "日"],
		            months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            monthsShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            today: "今天",
		            suffix: [],
		            meridiem: ["上午", "下午"]
		    };
			$("#shenqingriqi-input").val(getCurDate());
			$("#shenqingriqiDate").datetimepicker({ 
				minView: "month",
				autoclose: true,
				format:'yyyy-mm-dd',
				language:'zh-CN',
			});

		}		
		
		function calculation(){
			//积
			var x = 0;
			//和
			var y = 0;
			var flag = 0;



		}		
		function calculationSE(colName){
			//单列求和接口
			http("shenqinggangwei"+colName,"GET",{
				tableName: "shenqinggangwei",
				columnName: colName
			},(res)=>{
				if(res.code == 0){
					$("#"+colName).attr("value",res.data);
				}
			});
		}	
		function calculationPre(){
			//进入该页面就填充"单列求和"的列
		}			
		
		
			//新增时填充字段
			function fill(){
				var username = window.sessionStorage.getItem('username');
				var accountTableName = window.sessionStorage.getItem('accountTableName');
				http(accountTableName+'/session','GET',{},(res)=>{
					if(res.code == 0){
						var myId = res.data.id;
						if(res.data !=null && res.data.xuehao != null && res.data.xuehao != ''){
							$('#xuehao').val(res.data.xuehao)
							$("#xuehao").attr('readonly','readonly');
						}
						if(res.data !=null && res.data.xingming != null && res.data.xingming != ''){
							$('#xingming').val(res.data.xingming)
							$("#xingming").attr('readonly','readonly');
						}
						if(res.data !=null && res.data.yuanxi != null && res.data.yuanxi != ''){
							$('#yuanxi').val(res.data.yuanxi)
							$("#yuanxi").attr('readonly','readonly');
						}
						if(res.data !=null && res.data.zhuanye != null && res.data.zhuanye != ''){
							$('#zhuanye').val(res.data.zhuanye)
							$("#zhuanye").attr('readonly','readonly');
						}
						if(res.data !=null && res.data.shouji != null && res.data.shouji != ''){
							$('#shouji').val(res.data.shouji)
							$("#shouji").attr('readonly','readonly');
						}
						$(validform());
					}
				});
							
			}	
			
		function dataBind(){
			$("#updateId").val(ruleForm.id);	
			$("#gangweimingcheng").val(ruleForm.gangweimingcheng);	
			$("#gangweiyaoqiu").val(ruleForm.gangweiyaoqiu);	
			$("#gangweixingzhi").val(ruleForm.gangweixingzhi);	
			$("#xinzidaiyu").val(ruleForm.xinzidaiyu);	
			var renshuOptions = document.getElementsByClassName("renshuOption");
			for(var renshuCount = 0; renshuCount < renshuOptions.length;renshuCount++){
				if(renshuOptions[renshuCount].getAttribute('value') == ruleForm.renshu){
					renshuOptions[renshuCount].setAttribute('selected','selected');
				}
			}
			$("#bumenbianhao").val(ruleForm.bumenbianhao);	
			$("#bumenmingcheng").val(ruleForm.bumenmingcheng);	
			$("#shenqingliyou").val(ruleForm.shenqingliyou);
			var shenqingjinduOptions = document.getElementsByClassName("shenqingjinduOption");
			for(var shenqingjinduCount = 0; shenqingjinduCount < shenqingjinduOptions.length;shenqingjinduCount++){
				if(shenqingjinduOptions[shenqingjinduCount].getAttribute('value') == ruleForm.shenqingjindu){
					shenqingjinduOptions[shenqingjinduCount].setAttribute('selected','selected');
				}
			}
			$("#shenqingriqi-input").val(ruleForm.shenqingriqi);
			$("#xuehao").val(ruleForm.xuehao);	
			$("#xingming").val(ruleForm.xingming);	
			$("#yuanxi").val(ruleForm.yuanxi);	
			$("#zhuanye").val(ruleForm.zhuanye);	
			$("#shouji").val(ruleForm.shouji);	
			var shifoupinkunshengOptions = document.getElementsByClassName("shifoupinkunshengOption");
			for(var shifoupinkunshengCount = 0; shifoupinkunshengCount < shifoupinkunshengOptions.length;shifoupinkunshengCount++){
				if(shifoupinkunshengOptions[shifoupinkunshengCount].getAttribute('value') == ruleForm.shifoupinkunsheng){
					shifoupinkunshengOptions[shifoupinkunshengCount].setAttribute('selected','selected');
				}
			}
			$("#crossuserid").val(ruleForm.crossuserid);	
			$("#crossrefid").val(ruleForm.crossrefid);	
				
						$("#shhf").val(ruleForm.shhf);	
		}		
		//图片显示
		function showImg(){
		}		
		//跨表

        //跨表
        function crossTable(){
		crossTableName = window.sessionStorage.getItem('crossTableName');
		crossTableId = window.sessionStorage.getItem('crossTableId');
		if(crossTableName != null && crossTableName != '' && crossTableId != null && crossTableId != '' && crossTableId != -1){
			http(crossTableName + "/info/" + crossTableId,"GET",{},(res)=>{
				if(res.code == 0){
					crossRuleForm = res.data;
					$('#updateId').val(crossTableId);
					if(res.data != null && res.data != '' && res.data.gangweimingcheng != null && res.data.gangweimingcheng != ''){

						$("#gangweimingcheng").val(res.data.gangweimingcheng);
						$("#gangweimingcheng").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.gangweiyaoqiu != null && res.data.gangweiyaoqiu != ''){

						$("#gangweiyaoqiu").val(res.data.gangweiyaoqiu);
						$("#gangweiyaoqiu").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.gangweixingzhi != null && res.data.gangweixingzhi != ''){

						$("#gangweixingzhi").val(res.data.gangweixingzhi);
						$("#gangweixingzhi").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.xinzidaiyu != null && res.data.xinzidaiyu != ''){

						$("#xinzidaiyu").val(res.data.xinzidaiyu);
						$("#xinzidaiyu").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.renshu != null && res.data.renshu != ''){

						renshuKucun = res.data.renshu;
						$("#renshu").val(res.data.renshu);
					}
					if(res.data != null && res.data != '' && res.data.bumenbianhao != null && res.data.bumenbianhao != ''){

						$("#bumenbianhao").val(res.data.bumenbianhao);
						$("#bumenbianhao").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.bumenmingcheng != null && res.data.bumenmingcheng != ''){

						$("#bumenmingcheng").val(res.data.bumenmingcheng);
						$("#bumenmingcheng").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.shenqingliyou != null && res.data.shenqingliyou != ''){

						$("#shenqingliyou").val(res.data.shenqingliyou);
					}
					if(res.data != null && res.data != '' && res.data.shenqingjindu != null && res.data.shenqingjindu != ''){

						var shenqingjinduOptions = document.getElementsByClassName("shenqingjinduOption");
						for(var shenqingjinduCount = 0; shenqingjinduCount < shenqingjinduOptions.length;shenqingjinduCount++){
							if(shenqingjinduOptions[shenqingjinduCount].getAttribute('value') == res.data.shenqingjindu){
								shenqingjinduOptions[shenqingjinduCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.shenqingriqi != null && res.data.shenqingriqi != ''){

						$("#shenqingriqi-input").val(res.data.shenqingriqi);
						$('#shenqingriqiFileName').val(res.data.shenqingriqi)
					}
					if(res.data != null && res.data != '' && res.data.xuehao != null && res.data.xuehao != ''){

						$("#xuehao").val(res.data.xuehao);
						$("#xuehao").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.xingming != null && res.data.xingming != ''){

						$("#xingming").val(res.data.xingming);
						$("#xingming").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.yuanxi != null && res.data.yuanxi != ''){

						$("#yuanxi").val(res.data.yuanxi);
						$("#yuanxi").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.zhuanye != null && res.data.zhuanye != ''){

						$("#zhuanye").val(res.data.zhuanye);
						$("#zhuanye").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.shouji != null && res.data.shouji != ''){

						$("#shouji").val(res.data.shouji);
						$("#shouji").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.shifoupinkunsheng != null && res.data.shifoupinkunsheng != ''){

						var shifoupinkunshengOptions = document.getElementsByClassName("shifoupinkunshengOption");
						for(var shifoupinkunshengCount = 0; shifoupinkunshengCount < shifoupinkunshengOptions.length;shifoupinkunshengCount++){
							if(shifoupinkunshengOptions[shifoupinkunshengCount].getAttribute('value') == res.data.shifoupinkunsheng){
								shifoupinkunshengOptions[shifoupinkunshengCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.crossuserid != null && res.data.crossuserid != ''){

						$("#crossuserid").val(res.data.crossuserid);
						$("#crossuserid").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.crossrefid != null && res.data.crossrefid != ''){

						$("#crossrefid").val(res.data.crossrefid);
						$("#crossrefid").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.sfsh != null && res.data.sfsh != ''){

					}
					if(res.data != null && res.data != '' && res.data.shhf != null && res.data.shhf != ''){

						$("#shhf").val(res.data.shhf);
						$("#shhf").attr('readonly','readonly');
					}
				}
			});  
            }
		window.sessionStorage.removeItem('crossTableName');
		window.sessionStorage.removeItem('crossTableId');
        }
		
		//跨表更新字段
		function crossTableUpdate(){
			let flag = crossTableUpdateValidation();
			if(flag){
				httpJson(crossTableName + "/update","POST",{
					id: crossTableId,
					renshu: Number(crossRuleForm.renshu) - Number($('#renshuSelect').val()),
				},(res)=>{
					if(res.code == 0){
						console.log('跨表更新成功');
						return true;
					}
				});   
			}
			return false;
		}

		//跨表更新前验证
		function crossTableUpdateValidation(){
			//防止减法导致库存负值
			if(Number(renshuKucun) < Number($('#renshu').val())){
				alert('人数不能大于'+renshuKucun+'！请重新输入');
				return false;
			}
			return true;
		}
		$(document).ready(function() { 
			//设置右上角用户名
            $('.dropdown-menu h5').html(window.sessionStorage.getItem('username')+'('+window.sessionStorage.getItem('role')+')')
			//设置项目名
			$('.sidebar-header h3 a').html(projectName)
			//设置导航栏菜单
			setMenu();
			//初始化时间插件
			dateTimePick();
			//添加表单校验信息文本
			addValidation();
			getDetails();
			//初始化上传按钮
			upload();
			//单列求和
			calculationPre();
			//跨表
			crossTable();
			<%@ include file="../../static/myInfo.js"%>
			$('#submitBtn').on('click', function(e) {
			    e.preventDefault();
			    //console.log("点击了...提交按钮");
			    submit();
			});
			$('#exitBtn').on('click', function(e) {
			    cancel();
			});
			readonly();
		});		

		function readonly(){
            if(window.sessionStorage.getItem('role')!="管理员") {
				$('#money').attr('readonly','readonly');
            }
		}

		//比较大小
		function compare(){
			var largerVal = null;
			var smallerVal = null;
			if(largerVal !=null && smallerVal != null){
				if(parseInt(largerVal)<=parseInt(smallerVal)){
					alert(smallerName+'不能大于等于'+largerName);
					return false;
				}
			}
			return true;
		}


		// 用户登出
        <%@ include file="../../static/logout.jsp"%>		
	</script>
</body>

</html>
