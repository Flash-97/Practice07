package com.javaex.ex01;

public  class Ractangle extends Shape{
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	//getter/setter
	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}


	//일반 메소드
	public void draw() {
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");            
	}

	public void showInfo(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}

	//toString()
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + "]";
	}
	
	
	
	
	

}


