| 姓名：黄佳桐                                 | 专业： 软件工程      | 班级：20181181 | 学号：2018118133 |
| -------------------------------------------- | -------------------- | -------------- | ---------------- |
| 科目： Android 第一行代码                    | 实验日期：2020.12.15 |                |                  |
| 实验题目：  Android课程设计——健康饮食搭配APP |                      |                |                  |

**实验内容：**

右键点击res→New→Directory，创建mipmap文件夹用来存放APP需要用到的图片

![img](Image/clip_image001.png)

创建HomeMenuActivity.java同时创建activity_home_menu.xml文件，修改布局问线性布局，并添加背景图片

![img](Image/clip_image003.jpg)

修改res→values→styles.xml文件，将DarkActionBar改成NoActionBar

![img](Image/clip_image005.jpg)

修改activity_home_menu.xml添加三个按钮

![img](Image/clip_image007.jpg)

修改HomeMenuActivity.java中的代码，判断谁被点击，到这里主界面基本完成

![img](Image/clip_image008.png)

新建活动InfoListActivity,并在layout文件夹中添加activity_info_list.xml文件，修改其中的代码

![img](Image/clip_image010.jpg)

在drawable文件夹中创建info_et_bg.xml文件，添加图片shape并设置其形状

![img](Image/clip_image012.jpg)

在values文件夹中的colors.xml文件中添加颜色white和dividerColor的颜色

![img](Image/clip_image013.png)

在layout中新建item_infolist_lv.xml文件，将布局改成相对布局，修改代码添加内容

![img](Image/clip_image015.jpg)

修改HomMenuActivity中的代码，使用Intent进行页面跳转

![img](Image/clip_image017.jpg)

新建FoodUtils.java

![img](Image/clip_image019.jpg)

新建FoodBean.java

![img](Image/clip_image021.jpg)

新建InfoAdapter.java

![img](Image/clip_image023.jpg)

将HomeMenuActivity设为主界面

![img](Image/clip_image025.jpg)

修改InfoListActivity中的代码，添加点击事件

![img](Image/clip_image027.jpg)

新建一个food_grid包，在其中添加FoodGridActivity活动，修改activity_food_grid.xml中的代码

![img](Image/clip_image029.jpg)

新建item_foodgrid.xml文件

![img](Image/clip_image031.jpg)

在drawable中新建item_gridbg.xml设置背景图片

![img](Image/clip_image033.jpg)

新建FoodGridAdapter

![img](Image/clip_image035.jpg)

修改FoodGridActivity中的代码

![img](Image/clip_image036.png)

修改HomeMenuActivity中的代码，进行界面的跳转

![img](Image/clip_image038.jpg)

为了显示第三界面，新建FoodDescActivity和activity_food_desc.xml，修改布局为ScrollView，同时修改代码添加界面详情

![img](Image/clip_image040.jpg)

修改FoodDescActivity中的代码

![img](Image/clip_image042.jpg)

修改InofListActivity中的代码，设置第三界面点击跳转监听事件

![img](Image/clip_image044.jpg)

修改FoodGridActivity中的代码，设置第三界面点击跳转监听事件

![img](Image/clip_image046.jpg)

新建AboutActivity和activity_about.xml文件，修改布局为线性布局，添加页面详情

![img](Image/clip_image048.jpg)

新建item_aboutvp.xml文件，设置about页面的图片详情

![img](Image/clip_image050.jpg)

在AboutActivity中设置分享软件的点击事件

![img](Image/clip_image052.jpg)

创建AboutAdapter

![img](Image/clip_image054.jpg)

修改AboutActivity中的代码，实现自动播放下一张图片

![img](Image/clip_image056.jpg)

创建图片指示器

![img](Image/clip_image058.jpg)

设置ViewPager页面的监听器

![img](Image/clip_image060.jpg)

将activity_main.xml改为相对布局

![img](Image/clip_image062.jpg)

将MainActivity设置为主界面，并倒计时进入HomeMenuActivity界面

![img](Image/clip_image064.jpg)

修改activity_guide.xml设置引导界面

![img](Image/clip_image066.jpg)

新建item_guide1.xml，创建引导界面的图片布局

![img](Image/clip_image068.jpg)

新建包guide放置引导界面的activity，新建GuideAdapter

![img](Image/clip_image070.jpg)

修改GuideActivity中的代码

![img](Image/clip_image072.jpg)

修改MainActivity中的代码，判断是不是第一次进入

![img](Image/clip_image074.jpg)

**实验结果：**

APP图标

![img](Image/clip_image076.jpg)

主界面，倒计时进入

![img](Image/clip_image078.jpg)

第一次启动APP进入引导界面

![img](Image/clip_image080.jpg) ![img](Image/clip_image082.jpg) ![img](Image/clip_image084.jpg)

点击立即进入，不是第一次开启则不会进入引导界面

![img](Image/clip_image086.jpg)

点击食物搭配表，出现一个列表视图

![img](Image/clip_image088.jpg)

在搜索框中输入搜索内容，点击搜索按钮，显示搜索内容，点击刷新按钮，回到食物列表

![img](Image/clip_image090.jpg)

在食物列表中点击食物，出现第三级界面食物详情

![img](Image/clip_image092.jpg)

返回点击食物营养表，出现网格视图

![img](Image/clip_image094.jpg)

点击食物，同样出现第三级界面食物详情

![img](Image/clip_image096.jpg)

返回点击关于本软件，上面的图片会自动循环切换，也可以手动滑动切换

![img](Image/clip_image098.jpg)

点击分享软件

![img](Image/clip_image100.jpg)