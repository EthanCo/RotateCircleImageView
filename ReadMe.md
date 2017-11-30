## RotateCircleImageView
旋转的圆形ImageView，继承自[CircleImageView](https://github.com/hdodenhof/CircleImageView)  

![RotateCircleImageView](http://oqk78xit2.bkt.clouddn.com/RotateCircleImageView.gif)

### 依赖  

#### Step 1. Add the JitPack repository to your build file  
Add it in your root build.gradle at the end of repositories:  

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}  

#### Step 2. Add the dependency  

	dependencies {
        compile 'com.github.EthanCo:RotateCircleImageView:1.0.0'
	}

### 使用  
xml中添加

	<com.heiko.rotatecircleimageview.RotateCircleImageView
	        android:layout_margin="20dp"
	        android:id="@+id/img_rotate_circle"
	        android:src="@mipmap/ic_launcher"
	        app:rotate_duration="1200"
	        app:civ_border_width="2dp"
	        app:civ_border_color="#FF000000"
	        android:layout_width="200dp"
	        android:layout_height="200dp" />  

在java代码中  

	imgRotateCircle.startRotate(); //开始旋转
	imgRotateCircle.pauseRotate(); //暂停旋转  
    imgRotateCircle.cancelRotate(); //取消选择动画
	imgRotateCircle.reStartRotate(); //重新开始旋转动画

### 支持的自定义参数
	
	rotate_duration:旋转一圈的时间
	civ_border_width:边框宽度  
	civ_border_color:边框颜色