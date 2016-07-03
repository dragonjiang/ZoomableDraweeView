# zoomabledraweeview
**实现fresco的DraweeView的图片手势缩放**

fresco可以配合PhotoView实现图片缩放，但是这种方式比较麻烦，具体可以参考：

	https://github.com/ongakuer/PhotoDraweeView

	https://github.com/biezhihua/MySimpleDraweeView

他们的实现方式分别是修改Photoview和继承Photoview，自定义DraweeView。

---

这里介绍直接使用ScaleGestureDetector进行手势缩放检测的方法。
这种方法实现起来比较简单。


![](http://i.imgur.com/SWssO7A.gif)