Android实验九

题目：异步任务的隐含子线程程序框架 

 自定义一个AsyncTask任务,命名为Mytask

![image-20201210210921146](imageLab_9/image-20201210210921146.png)

使用doInBackground(Params...)方法在子线程中执行耗时任务，并返回执行结果

![image-20201210211203093](imageLab_9/image-20201210211203093.png)

使用onProgressUpdate(Progress...)方法接收后台任务传过来的参数，并更新UI

![image-20201210211400266](imageLab_9/image-20201210211400266.png)

后台任务执行完成后返回结果，使用onPostExecute(Result)方法接收返回的结果并进行UI操作

![image-20201210211818236](imageLab_9/image-20201210211818236.png)

实验结果

主界面

![image-20201210212115797](imageLab_9/image-20201210212115797.png)

点击“点我加载”按钮

![image-20201210212310739](imageLab_9/image-20201210212310739.png)

更新完成

![image-20201210212338337](imageLab_9/image-20201210212338337.png)

还没加载完成时点击“cancel”按钮

![image-20201210212454825](imageLab_9/image-20201210212454825.png)

​    