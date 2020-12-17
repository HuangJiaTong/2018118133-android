| 姓名：黄佳桐                                 | 专业： 软件工程      | 班级：20181181 | 学号：2018118133 |
| -------------------------------------------- | -------------------- | -------------- | ---------------- |
| 科目： Android 第一行代码                    | 实验日期：2020.12.15 |                |                  |
| 实验题目： 最佳的UI体验——Material Design实战 |                      |                |                  |

**实验内容：**

设置界面的主题颜色，res/values/styles.xml

![img](ImageLab_12/clip_image002.jpg)

修改activity_main.xml文件的代码，使用Toolbar代替ActionBar

![img](ImageLab_12/clip_image004.jpg)

修改MainActivity.java中的代码，通过findViewById()得到Toolbar的实例，然后调用setSupportActionBar()方法并将Toolbar的实例传入

![img](ImageLab_12/clip_image005.png)

修改标题栏上显示的文字内容

![img](ImageLab_12/clip_image006.png)

Res目录下新建menu文件夹，在其中创建一个toolbar.xml文件

![img](ImageLab_12/clip_image008.jpg)

修改MainActivity.jJava中的代码，指定按钮的位置

![img](ImageLab_12/clip_image010.jpg)

修改activity_main.xml文件的代码，添加DrawerLayout布局

![img](ImageLab_12/clip_image012.jpg)

修改MainActivity.jJava中的代码，添加滑动菜单的导航按钮

![img](ImageLab_12/clip_image014.jpg)

![img](ImageLab_12/clip_image015.png)

在menu文件夹中创建nav_menu.xml文件设置滑动菜单的功能选项

![img](ImageLab_12/clip_image017.jpg)

在layout文件夹中新建一个nav_header.xml文件，设置headerLayout

![img](ImageLab_12/clip_image019.jpg)

修改activity_main.xml文件，使用NavigationView

![img](ImageLab_12/clip_image021.jpg)

修改MainActivity.java的代码，设置NavigationView的点击事件

![img](ImageLab_12/clip_image023.jpg)

修改activity_main.xml文件，设置悬浮按钮

![img](ImageLab_12/clip_image025.jpg)

修改MainActivity.java的代码，设置悬浮按钮的点击事件，并使用Snackbar

![img](ImageLab_12/clip_image027.jpg)

使用CardView添加依赖

![img](ImageLab_12/clip_image029.jpg)

修改activity_main.xml文件，添加RecyclerView

![img](ImageLab_12/clip_image031.jpg)

新建一个Fruit类

![img](ImageLab_12/clip_image032.png)

在layout文件夹中新建一个fruit_item.xml文件

![img](ImageLab_12/clip_image034.jpg)

新建FruitAdapter类

![img](ImageLab_12/clip_image036.jpg)

修改MainActivity.java中的代码

![img](ImageLab_12/clip_image038.jpg)

![img](ImageLab_12/clip_image040.jpg)

![img](ImageLab_12/clip_image041.png)

修改activity_main.xml 中的代码，使用AppBarLayout

![img](ImageLab_12/clip_image042.png)

修改activity_main.xml 中的代码,使用SwipeRefreshLayout

![img](ImageLab_12/clip_image044.jpg)

修改MainActivity.java中的代码

![img](ImageLab_12/clip_image046.jpg)

创建一个FruitActivity

![img](ImageLab_12/clip_image048.jpg)

在activity_fruit.xml添加CoordiantorLayout,其中嵌套一个AppBarLayout，在嵌套一个CollasingToolbarLayout

![img](ImageLab_12/clip_image050.jpg)

在CollasingToolbarLayout中定义标题栏中的具体内容

![img](ImageLab_12/clip_image052.jpg)

使用NestedScrollView，嵌套CardView显示水果详情，与AppBarLayout平级

![img](ImageLab_12/clip_image054.jpg)

设置一个悬浮按钮

![img](ImageLab_12/clip_image056.jpg)

修改FruitAdapter中的代码，处理RecyclerView的点击事件

![img](ImageLab_12/clip_image058.jpg)

**实验结果：**

主界面

![img](ImageLab_12/clip_image059.png)

滑动菜单

![img](ImageLab_12/clip_image060.png)

点击图片或文字

![img](ImageLab_12/clip_image061.png)

折叠式标题栏

![img](ImageLab_12/clip_image062.png)

下拉刷新

![img](ImageLab_12/clip_image063.png)