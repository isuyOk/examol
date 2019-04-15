package com.result;

public class CodeMsg {
	
	private int code;
	private String msg;
	

	public static CodeMsg SUCCESS = new CodeMsg(0, "success");

	//登录模块
	public static CodeMsg PASSWORD_EMPTY = new CodeMsg(500211, "登录密码不能为空");
	public static CodeMsg EMAIL_EMPTY = new CodeMsg(500212, "邮箱不能为空");
	public static CodeMsg EMAIL_ERROR = new CodeMsg(500213, "邮箱格式错误");
	public static CodeMsg EMAIL_NOT_EXIST = new CodeMsg(500214, "邮箱不存在");
	public static CodeMsg PASSWORD_ERROR = new CodeMsg(500215, "密码错误");


	public static CodeMsg UPDATE_SUCCESS = new CodeMsg(500311, "修改成功");
	public static CodeMsg UPDATE_FAILE = new CodeMsg(500312, "修改失败");
	public static CodeMsg DELETE_SUCCESS = new CodeMsg(500313, "删除成功");
	public static CodeMsg DELETE_FAILE = new CodeMsg(500314, "删除失败");
	public static CodeMsg ADD_FAILE = new CodeMsg(500315, "添加失败");
	public static CodeMsg ADD_SUCCESS = new CodeMsg(500316, "添加成功");


	private CodeMsg( ) {
	}
			
	private CodeMsg( int code,String msg ) {
		this.code = code;
		this.msg = msg;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public CodeMsg fillArgs(Object... args) {
		int code = this.code;
		String message = String.format(this.msg, args);
		return new CodeMsg(code, message);
	}

	@Override
	public String toString() {
		return "CodeMsg [code=" + code + ", msg=" + msg + "]";
	}
	
	
}
