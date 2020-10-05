实验一：活动的生命周期

启动debug模式，首先调用MainActivity的onCreate()

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image002.jpg)

按F9，调用MainActivity的onStart()

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image004.jpg)

按F9，调用MainActivity的reSume()

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image006.jpg)

按F9，出现START HJTNORMALACTIVITY按钮和START HJTDIALOGACTIVITY按钮

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image008.jpg)

点击START HJTNORMALACTIVITY按钮，调用MainActivity的onPause()

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image010.jpg)

 

 

 

 

 

 

 

 

按F9，调用hjtNormalActivity的onCreate()

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image012.jpg)

按F9,调用MainActivity的onStop()

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image014.jpg)

 

 

 

 

 

 

 

 

按F9，显示hjtNormalActivity的内容

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image016.jpg)

点击返回，调用MainActivity的onRestart()

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image018.jpg)

 

 

 

 

 

 

 

 

 

按F9,再次调用MainActivity的onStar()

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image020.jpg)

按F9，调用MainActivity的onResume()

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image022.jpg)

 

 

 

 

 

 

 

 

 

按F9，再次出现START HJTNORMALACTIVITY按钮和START HJTDIALOGACTIVITY按钮

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image024.jpg)

这次点击START HJTDIALOGACTIVITY按钮，调用MainActivity的onPause()

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image026.jpg)

 

 

 

 

 

 

按F9，调用hjtDialogActivity的onCreate()

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image028.jpg)

按F9，显示hjtDialogActivity的界面

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image030.jpg)

 

 

 

 

 

 

 

点击返回，调用MainActivity的onResume()

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image032.jpg)

再点击返回，调用MainActivity的onPause()，并退出程序

![img](file:///C:/Users/黄佳桐/AppData/Local/Temp/msohtmlclip1/01/clip_image034.jpg)

分析与讨论：

通过此次实验，我体会了一遍活动的完整的生命周期。当我们启动活动，首先会进入活动的运行状态，依次调用onCreate(),onStart(),onResume(),当前的活动运行并处于栈顶位置。当栈顶位置被其他活动占据，当前的活动进入暂停状态，当新活动是一个对话框式的活动，则执行onPause()方法。如果当前活动完全不可见，则进入停止状态，此时则调用onStop()方法。活动在有停止状态变为运行状态之前，则调用onReStart()。在活动被销毁之前则调用onDestroy()方法。