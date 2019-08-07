package yin.deng.dynormalutils;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import yin.deng.normalutils.utils.LogUtils;
import yin.deng.normalutils.utils.MyFileUtils;
import yin.deng.normalutils.utils.SnackbarUtils;
import yin.deng.normalutils.view.CircleImageView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.i(html);
        tv = (TextView) findViewById(R.id.tv);
        SnackbarUtils.ShortSnackbar(tv,"测试一下消息",SnackbarUtils.Warning).show();
    }

    public String html="\n" +
            "<!DOCTYPE html>\n" +
            "<html lang=\"zh-CN\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "                <div class=\"opt-box d-flex justify-content-center flex-column\">\n" +
            "            <span  class=\"csdn-tracking-statistics tracking-click\" data-report-click='{\"mod\":\"popu_379\"}'>\n" +
            "                                    <a class=\"btn btn-sm btn-red-hollow attention\" id=\"btnAttent\">关注</a>\n" +
            "                            </span>\n" +
            "        </div>\n" +
            "            </div>\n" +
            "    <div class=\"data-info d-flex item-tiling\">\n" +
            "                <dl class=\"text-center\" title=\"82\">\n" +
            "                        <dt><a href=\"https://blog.csdn.net/yyo201?t=1\">原创</a></dt>\n" +
            "            <dd><a href=\"https://blog.csdn.net/yyo201?t=1\"><span class=\"count\">82</span></a></dd>\n" +
            "                    </dl>\n" +
            "        <dl class=\"text-center\" id=\"fanBox\" title=\"5\">\n" +
            "            <dt>粉丝</dt>\n" +
            "            <dd><span class=\"count\" id=\"fan\">5</span></dd>\n" +
            "        </dl>\n" +
            "        <dl class=\"text-center\" title=\"10\">\n" +
            "            <dt>喜欢</dt>\n" +
            "            <dd><span class=\"count\">10</span></dd>\n" +
            "        </dl>\n" +
            "        <dl class=\"text-center\" title=\"19\">\n" +
            "            <dt>评论</dt>\n" +
            "            <dd><span class=\"count\">19</span></dd>\n" +
            "        </dl>\n" +
            "    </div>\n" +
            "    <div class=\"grade-box clearfix\">\n" +
            "        <dl>\n" +
            "            <dt>等级：</dt>\n" +
            "            <dd>\n" +
            "                <a href=\"https://blog.csdn.net/home/help.html#level\" title=\"4级,点击查看等级说明\" target=\"_blank\">\n" +
            "                    <svg class=\"icon icon-level\" aria-hidden=\"true\">\n" +
            "                        <use xlink:href=\"#csdnc-bloglevel-4\"></use>\n" +
            "                    </svg>\n" +
            "                </a>\n" +
            "            </dd>\n" +
            "        </dl>\n" +
            "        <dl>\n" +
            "            <dt>访问：</dt>\n" +
            "            <dd title=\"33998\">\n" +
            "                3万+            </dd>\n" +
            "        </dl>\n" +
            "        <dl>\n" +
            "            <dt>积分：</dt>\n" +
            "            <dd title=\"1259\">\n" +
            "                1259            </dd>\n" +
            "        </dl>\n" +
            "        <dl title=\"59045\">\n" +
            "            <dt>排名：</dt>\n" +
            "            <dd>5万+</dd>\n" +
            "        </dl>\n" +
            "    </div>\n" +
            "        <div class=\"badge-box d-flex\">\n" +
            "        <span>勋章：</span>\n" +
            "        <div class=\"badge d-flex\">\n" +
            "                                                        <div class=\"icon-badge\" title=\"持之以恒\">\n" +
            "                       <div class=\"mouse-box\">\n" +
            "                          <img src=\"https://g.csdnimg.cn/static/user-medal/chizhiyiheng.svg\" alt=\"\">\n" +
            "                          <div class=\"icon-arrow\"></div>\n" +
            "                       </div>\n" +
            "                       <div class=\"grade-detail-box\">\n" +
            "                           <div class=\"pos-box\">\n" +
            "                               <div class=\"left-box d-flex justify-content-center align-items-center flex-column\">\n" +
            "                                    <img src=\"https://g.csdnimg.cn/static/user-medal/chizhiyiheng.svg\" alt=\"\">\n" +
            "                                   <p>持之以恒</p>\n" +
            "                               </div>\n" +
            "                               <div class=\"right-box\">\n" +
            "                                   授予每个自然月内发布4篇或4篇以上原创或翻译IT博文的用户。不积跬步无以至千里，不积小流无以成江海，程序人生的精彩需要坚持不懈地积累！                               </div>\n" +
            "                           </div>\n" +
            "                       </div>\n" +
            "                   </div>\n" +
            "                                                             <div class=\"icon-badge\" title=\"勤写标兵Lv2\">\n" +
            "                       <div class=\"mouse-box\">\n" +
            "                          <img src=\"https://g.csdnimg.cn/static/user-medal/qinxiebiaobing_l2_t1.svg\" alt=\"\">\n" +
            "                          <div class=\"icon-arrow\"></div>\n" +
            "                       </div>\n" +
            "                       <div class=\"grade-detail-box\">\n" +
            "                           <div class=\"pos-box\">\n" +
            "                               <div class=\"left-box d-flex justify-content-center align-items-center flex-column\">\n" +
            "                                    <img src=\"https://g.csdnimg.cn/static/user-medal/qinxiebiaobing_l2_t1.svg\" alt=\"\">\n" +
            "                                   <p>勤写标兵Lv2</p>\n" +
            "                               </div>\n" +
            "                               <div class=\"right-box\">\n" +
            "                                   授予每个自然周发布4篇到6篇原创IT博文的用户。本勋章将于次周上午根据用户上周的博文发布情况由系统自动颁发。                               </div>\n" +
            "                           </div>\n" +
            "                       </div>\n" +
            "                   </div>\n" +
            "                                             </div>\n" +
            "        <script>\n" +
            "            (function ($) {\n" +
            "                setTimeout(function(){\n" +
            "                    $('div.icon-badge.show-moment').removeClass('show-moment');\n" +
            "                }, 5000);\n" +
            "            })(window.jQuery)\n" +
            "        </script>\n" +
            "    </div>\n" +
            "    </div>\n" +
            "<div id=\"asideNewArticle\" class=\"aside-box\">\n" +
            "    <h3 class=\"aside-title\">最新文章</h3>\n" +
            "    <div class=\"aside-content\">\n" +
            "        <ul class=\"inf_list clearfix csdn-tracking-statistics tracking-click\" data-mod=\"popu_382\">\n" +
            "                        <li class=\"clearfix\">\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/details/98596469\" target=\"_blank\" >\n" +
            "                                        MyBatis 批量插入                </a>\n" +
            "            </li>\n" +
            "                        <li class=\"clearfix\">\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/details/97763558\" target=\"_blank\" >\n" +
            "                                        jsp访问WEB-INF下面的资源-jsp                </a>\n" +
            "            </li>\n" +
            "                        <li class=\"clearfix\">\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/details/97275957\" target=\"_blank\" >\n" +
            "                                        Spring-framework @Autowired注入bean 为null之谜                </a>\n" +
            "            </li>\n" +
            "                        <li class=\"clearfix\">\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/details/97127911\" target=\"_blank\" >\n" +
            "                                        android 下载更新后台的apk 的时候 contentLength = -1                </a>\n" +
            "            </li>\n" +
            "                        <li class=\"clearfix\">\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/details/96481479\" target=\"_blank\" >\n" +
            "                                        idea的mybatis的xml文件总是报警告SQL dialect is not configured                </a>\n" +
            "            </li>\n" +
            "                    </ul>\n" +
            "    </div>\n" +
            "</div>\n" +
            "<div id=\"asideCategory\" class=\"aside-box\">\n" +
            "    <h3 class=\"aside-title\">个人分类</h3>\n" +
            "    <div class=\"aside-content\">\n" +
            "        <ul>\n" +
            "                        <li>\n" +
            "                <a class=\"clearfix\" href=\"https://blog.csdn.net/yyo201/article/category/8440924\">\n" +
            "                    <span class=\"title oneline\">android学习笔记</span>\n" +
            "                    <span class=\"count float-right\">14篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <li>\n" +
            "                <a class=\"clearfix\" href=\"https://blog.csdn.net/yyo201/article/category/8528391\">\n" +
            "                    <span class=\"title oneline\">javaweb</span>\n" +
            "                    <span class=\"count float-right\">10篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                    </ul>\n" +
            "    </div>\n" +
            "    </div>\n" +
            "<div id=\"asideArchive\" class=\"aside-box flexible-box\">\n" +
            "    <h3 class=\"aside-title\">归档</h3>\n" +
            "    <div class=\"aside-content\">\n" +
            "        <ul class=\"archive-list\">\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2019/08\">\n" +
            "                    2019年8月                    <span class=\"count float-right\">1篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2019/07\">\n" +
            "                    2019年7月                    <span class=\"count float-right\">12篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2019/06\">\n" +
            "                    2019年6月                    <span class=\"count float-right\">4篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2019/05\">\n" +
            "                    2019年5月                    <span class=\"count float-right\">7篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2019/04\">\n" +
            "                    2019年4月                    <span class=\"count float-right\">9篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2019/03\">\n" +
            "                    2019年3月                    <span class=\"count float-right\">3篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2019/02\">\n" +
            "                    2019年2月                    <span class=\"count float-right\">4篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2019/01\">\n" +
            "                    2019年1月                    <span class=\"count float-right\">2篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2018/12\">\n" +
            "                    2018年12月                    <span class=\"count float-right\">4篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2018/11\">\n" +
            "                    2018年11月                    <span class=\"count float-right\">3篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2018/10\">\n" +
            "                    2018年10月                    <span class=\"count float-right\">1篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2018/09\">\n" +
            "                    2018年9月                    <span class=\"count float-right\">3篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2018/08\">\n" +
            "                    2018年8月                    <span class=\"count float-right\">14篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2018/07\">\n" +
            "                    2018年7月                    <span class=\"count float-right\">5篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2018/06\">\n" +
            "                    2018年6月                    <span class=\"count float-right\">9篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2018/05\">\n" +
            "                    2018年5月                    <span class=\"count float-right\">5篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2018/04\">\n" +
            "                    2018年4月                    <span class=\"count float-right\">2篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2018/03\">\n" +
            "                    2018年3月                    <span class=\"count float-right\">5篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2017/12\">\n" +
            "                    2017年12月                    <span class=\"count float-right\">1篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                        <!--归档统计-->\n" +
            "            <li>\n" +
            "                <a href=\"https://blog.csdn.net/yyo201/article/month/2016/04\">\n" +
            "                    2016年4月                    <span class=\"count float-right\">1篇</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                    </ul>\n" +
            "    </div>\n" +
            "        <p class=\"text-center\">\n" +
            "        <a class=\"btn btn-link-blue flexible-btn\" data-fbox=\"aside-archive\">展开</a>\n" +
            "    </p>\n" +
            "    </div>\n" +
            "<div id=\"asideHotArticle\" class=\"aside-box\">\n" +
            "\t<h3 class=\"aside-title\">热门文章</h3>\n" +
            "\t<div class=\"aside-content\">\n" +
            "\t\t<ul class=\"hotArticle-list csdn-tracking-statistics tracking-click\" data-report-view='{\"mod\":\"popu_521\"}'>\n" +
            "\t\t\t\t\t\t\t<li>\n" +
            "\n" +
            "\t\t\t\t\t<a href=\"https://blog.csdn.net/yyo201/article/details/79562328\" >\n" +
            "                                                android studio 引入guava                    </a>\n" +
            "\t\t\t\t\t<p class=\"read\">阅读数 <span>3270</span></p>\n" +
            "\t\t\t\t</li>\n" +
            "\t\t\t\t\t\t\t<li>\n" +
            "\n" +
            "\t\t\t\t\t<a href=\"https://blog.csdn.net/yyo201/article/details/81874214\" >\n" +
            "                                                EasyDarwin-开源的rtmp流媒体服务器                    </a>\n" +
            "\t\t\t\t\t<p class=\"read\">阅读数 <span>2794</span></p>\n" +
            "\t\t\t\t</li>\n" +
            "\t\t\t\t\t\t\t<li>\n" +
            "\n" +
            "\t\t\t\t\t<a href=\"https://blog.csdn.net/yyo201/article/details/80570741\" >\n" +
            "                                                Android dependency 冲突                    </a>\n" +
            "\t\t\t\t\t<p class=\"read\">阅读数 <span>2778</span></p>\n" +
            "\t\t\t\t</li>\n" +
            "\t\t\t\t\t\t\t<li>\n" +
            "\n" +
            "\t\t\t\t\t<a href=\"https://blog.csdn.net/yyo201/article/details/81661951\" >\n" +
            "                                                记一个TbsReaderView 的深坑                    </a>\n" +
            "\t\t\t\t\t<p class=\"read\">阅读数 <span>2084</span></p>\n" +
            "\t\t\t\t</li>\n" +
            "\t\t\t\t\t\t\t<li>\n" +
            "\n" +
            "\t\t\t\t\t<a href=\"https://blog.csdn.net/yyo201/article/details/81200529\" >\n" +
            "                                                AndroidStudio Unable to run 'adb': null                    </a>\n" +
            "\t\t\t\t\t<p class=\"read\">阅读数 <span>1672</span></p>\n" +
            "\t\t\t\t</li>\n" +
            "\t\t\t\t\t</ul>\n" +
            "\t</div>\n" +
            "</div>\n" +
            "<div id=\"asideNewComments\" class=\"aside-box\">\n" +
            "    <h3 class=\"aside-title\">最新评论</h3>\n" +
            "    <div class=\"aside-content\">\n" +
            "        <ul class=\"newcomment-list\">\n" +
            "                        <li>\n" +
            "                <a class=\"title text-truncate\" target=\"_blank\" href=\"https://blog.csdn.net/yyo201/article/details/83620578#comments\">Idea 一直报错SNAPSHOT...</a>\n" +
            "                <p class=\"comment ellipsis\">\n" +
            "                    <a href=\"https://my.csdn.net/weixin_43496777\" class=\"user-name\" target=\"_blank\">weixin_43496777：</a>大神 如何解决？同样弄了一个上午！                </p>\n" +
            "            </li>\n" +
            "                        <li>\n" +
            "                <a class=\"title text-truncate\" target=\"_blank\" href=\"https://blog.csdn.net/yyo201/article/details/86737595#comments\">android 视频图片轮播</a>\n" +
            "                <p class=\"comment ellipsis\">\n" +
            "                    <a href=\"https://my.csdn.net/m0_38141292\" class=\"user-name\" target=\"_blank\">m0_38141292：</a>博主，能否提供Demo 参考参考，1224189747@qq.com，万分感谢！！！                </p>\n" +
            "            </li>\n" +
            "                        <li>\n" +
            "                <a class=\"title text-truncate\" target=\"_blank\" href=\"https://blog.csdn.net/yyo201/article/details/83620578#comments\">Idea 一直报错SNAPSHOT...</a>\n" +
            "                <p class=\"comment ellipsis\">\n" +
            "                    <a href=\"https://my.csdn.net/qq_41134142\" class=\"user-name\" target=\"_blank\">qq_41134142：</a>idea控制台显示叫我去system下看log日志吧，日志中显示的就是说读取不到这个context.xml文件，编译的class下也没有，有点无从下手了                </p>\n" +
            "            </li>\n" +
            "                        <li>\n" +
            "                <a class=\"title text-truncate\" target=\"_blank\" href=\"https://blog.csdn.net/yyo201/article/details/83620578#comments\">Idea 一直报错SNAPSHOT...</a>\n" +
            "                <p class=\"comment ellipsis\">\n" +
            "                    <a href=\"https://my.csdn.net/yyo201\" class=\"user-name\" target=\"_blank\">yyo201：</a>[reply]qq_41134142[/reply]\n" +
            "idea都有日志的，运行程序下面就会出现日志窗口。实在找不到就通过上方工具栏 Helper-&gt;Show Log in Explorer，看到日志才好动手改                </p>\n" +
            "            </li>\n" +
            "                        <li>\n" +
            "                <a class=\"title text-truncate\" target=\"_blank\" href=\"https://blog.csdn.net/yyo201/article/details/83620578#comments\">Idea 一直报错SNAPSHOT...</a>\n" +
            "                <p class=\"comment ellipsis\">\n" +
            "                    <a href=\"https://my.csdn.net/qq_41134142\" class=\"user-name\" target=\"_blank\">qq_41134142：</a>重新配置了、清除了编译文件，能试的都试过了，不行啊，能给个意见吗                </p>\n" +
            "            </li>\n" +
            "                    </ul>\n" +
            "    </div>\n" +
            "</div>\n" +
            "\t<div id=\"asideFooter\">\n" +
            "\t\t\t\n" +
            "\t\t<div class=\"aside-box\">\n" +
            "\t\t\t<div id=\"kp_box_57\" data-pid=\"57\" data-track-view='{\"mod\":\"kp_popu_57-707\",\"con\":\",,\"}' data-track-click='{\"mod\":\"kp_popu_57-707\",\"con\":\",,\"}' data-report-view='{\"mod\":\"kp_popu_57-707\",\"keyword\":\"\"}' data-report-click='{\"mod\":\"kp_popu_57-707\",\"keyword\":\"\"}'><script async src=\"//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"></script>\n" +
            "<!-- 博客内页左下视窗-20181130 -->\n" +
            "<ins class=\"adsbygoogle\"\n" +
            "     style=\"display:inline-block;width:300px;height:250px\"\n" +
            "     data-ad-client=\"ca-pub-1076724771190722\"\n" +
            "     data-ad-slot=\"1894159733\"></ins>\n" +
            "<script>\n" +
            "(adsbygoogle = window.adsbygoogle || []).push({});\n" +
            "</script></div>\t\t</div>\n" +
            "\t\t\t\t<div class=\"aside-box\">\n" +
            "\t\t\t<div class=\"persion_article\">\n" +
            "\t\t\t</div>\n" +
            "\t\t</div>\n" +
            "\t</div>\n" +
            "</aside>\n" +
            "<script src=\"https://csdnimg.cn/pubfooter/js/publib_footer-1.0.3.js\" data-isfootertrack=\"false\" type=\"text/javascript\"></script>\n" +
            "<script>\n" +
            "\t$(\"a.flexible-btn\").click(function(){\n" +
            "\t\t$(this).parents('div.aside-box').removeClass('flexible-box');\n" +
            "\t\t$(this).remove();\n" +
            "\t})\n" +
            "</script>\n" +
            "</div>\n" +
            "<div class=\"mask-dark\"></div>\n" +
            "<div class=\"tool-box vertical\">\n" +
            "    \t<ul class=\"meau-list\">\n" +
            "\t\t<li class=\"btn-like-box \">\n" +
            "\t\t\t<button class=\" low-height hover-box btn-like \" title=\"点赞\">\n" +
            "\t\t\t\t<svg class=\"icon active hover-hide\" aria-hidden=\"true\">\n" +
            "\t\t\t\t\t<use xlink:href=\"#csdnc-thumbsup-ok\"></use>\n" +
            "\t\t\t\t</svg>\n" +
            "\t\t\t\t<svg class=\"icon no-active hover-hide\" aria-hidden=\"true\">\n" +
            "\t\t\t\t\t<use xlink:href=\"#csdnc-thumbsup\"></use>\n" +
            "\t\t\t\t</svg>\n" +
            "\t\t\t\t<span class=\"hover-show text-box text\">\n" +
            "\t\t\t\t\t<span class=\"no-active\">点赞</span>\n" +
            "\t\t\t\t\t<span class=\"active\">取消点赞</span>\n" +
            "\t\t\t\t</span>\n" +
            "\t\t\t\t<p id=\"supportCount\">0</p>\n" +
            "\t\t\t</button>\n" +
            "\t\t</li>\n" +
            "\t\t<li class=\"to-commentBox\">\n" +
            "\t\t\t\t\t\t<a class=\"btn-comments low-height hover-box\" title=\"写评论\" href=\"#commentBox\">\n" +
            "\t\t\t\t<svg class=\"icon hover-hide\" aria-hidden=\"true\">\n" +
            "\t\t\t\t\t<use xlink:href=\"#csdnc-comments\"></use>\n" +
            "\t\t\t\t</svg>\n" +
            "\t\t\t\t<span class=\"hover-show text\">评论</span>\n" +
            "\t\t\t\t<p class=\"\">\n" +
            "\t\t\t\t\t\t\t\t\t\t</p>\n" +
            "\t\t\t</a>\n" +
            "\t\t</li>\n" +
            "\t\t<li class=\"toc-container-box\" id=\"liTocBox\">\n" +
            "\t\t\t<a class=\"btn-toc low-height hover-box btn-comments\" title=\"目录\">\n" +
            "\t\t\t\t<svg class=\"icon hover-hide\" aria-hidden=\"true\">\n" +
            "\t\t\t\t\t<use xlink:href=\"#csdnc-contents\"></use>\n" +
            "\t\t\t\t</svg>\n" +
            "\t\t\t\t<span class=\"hover-show text\">目录</span>\n" +
            "\t\t\t</a>\n" +
            "\t\t\t<div class=\"toc-container\">\n" +
            "\t\t\t\t<div class=\"pos-box\">\n" +
            "\t\t\t\t\t<div class=\"icon-arrow\"></div>\n" +
            "\t\t\t\t\t<div class=\"scroll-box\">\n" +
            "\t\t\t\t\t\t<div class=\"toc-box\"></div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div class=\"opt-box\">\n" +
            "\t\t\t\t\t<button class=\"btn-opt prev nomore\" title=\"向上\">\n" +
            "\t\t\t\t\t\t<svg class=\"icon\" aria-hidden=\"true\">\n" +
            "\t\t\t\t\t\t\t<use xlink:href=\"#csdnc-chevronup\"></use>\n" +
            "\t\t\t\t\t\t</svg>\n" +
            "\t\t\t\t\t</button>\n" +
            "\t\t\t\t\t<button class=\"btn-opt next\">\n" +
            "\t\t\t\t\t\t<svg class=\"icon\" aria-hidden=\"true\">\n" +
            "\t\t\t\t\t\t\t<use xlink:href=\"#csdnc-chevrondown\"></use>\n" +
            "\t\t\t\t\t\t</svg>\n" +
            "\t\t\t\t\t</button>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</div>\n" +
            "\t\t</li>\n" +
            "\t\t<li>\n" +
            "\t\t\t<a class=\"btn-bookmark low-height hover-box btn-comments\" title=\"收藏\">\n" +
            "\t\t\t\t<svg class=\"icon active hover-hide\" aria-hidden=\"true\">\n" +
            "\t\t\t\t\t<use xlink:href=\"#csdnc-bookmark-ok\"></use>\n" +
            "\t\t\t\t</svg>\n" +
            "\t\t\t\t<svg class=\"icon no-active hover-hide\" aria-hidden=\"true\">\n" +
            "\t\t\t\t\t<use xlink:href=\"#csdnc-bookmark\"></use>\n" +
            "\t\t\t\t</svg>\n" +
            "\t\t\t\t\t<span class=\"hover-show text\">收藏</span>\n" +
            "\t\t\t\t<!-- <span class=\"hover-show text-box text\">\n" +
            "\t\t\t\t\t<span class=\"no-active\">收藏</span>\n" +
            "\t\t\t\t\t<span class=\"active\">取消收藏</span>\n" +
            "\t\t\t\t</span> -->\n" +
            "\t\t\t</a>\n" +
            "\t\t</li>\n" +
            "\t\t<li class=\"bdsharebuttonbox\">\n" +
            "\t\t\t<div class=\"weixin-qr btn-comments low-height hover-box\" >\n" +
            "        <a href=\"#\" class=\"bds_weixin clear-share-style\" data-cmd=\"weixin\" title=\"手机看\"></a>\n" +
            "\t\t\t\t<svg class=\"icon hover-hide\" aria-hidden=\"true\">\n" +
            "\t\t\t\t\t<use xlink:href=\"#csdnc-usephone\"></use>\n" +
            "\t\t\t\t</svg>\n" +
            "\t\t\t\t<span class=\"hover-show text text3\">\n" +
            "\t\t\t\t\t手机看\n" +
            "\t\t\t\t</span>\n" +
            "\t\t\t</div>\n" +
            "\t\t</li>\n" +
            "\t\t\t\t\t\t\t<li class=\"widescreen-hide\">\n" +
            "\t\t\t\t<a class=\"prev btn-comments low-height hover-box\" href=\"https://blog.csdn.net/yyo201/article/details/95449760\" title=\"Idea 学习笔记\">\n" +
            "\t\t\t\t\t<svg class=\"icon hover-hide\" aria-hidden=\"true\">\n" +
            "\t\t\t\t\t\t<use xlink:href=\"#csdnc-chevronleft\"></use>\n" +
            "\t\t\t\t\t</svg>\n" +
            "\t\t\t\t\t<span class=\"hover-show text text3\">上一篇</span>\n" +
            "\t\t\t\t</a>\n" +
            "\t\t\t</li>\n" +
            "\t\t\t\t\t\t\t\t<li class=\"widescreen-hide\">\n" +
            "\t\t\t<a class=\"next btn-comments hover-box low-height\" href=\"https://blog.csdn.net/yyo201/article/details/96314664\" title=\"IDEA 学习笔记2\">\n" +
            "\t\t\t\t<svg class=\"icon hover-hide\" aria-hidden=\"true\">\n" +
            "\t\t\t\t\t<use xlink:href=\"#csdnc-chevronright\"></use>\n" +
            "\t\t\t\t</svg>\n" +
            "\t\t\t\t<span class=\"hover-show text text3\">下一篇</span>\n" +
            "\t\t\t</a>\n" +
            "\t\t</li>\n" +
            "\t\t\t\t\t\t<!-- 宽屏更多按钮 -->\n" +
            "\t\t<li class=\"widescreen-more\">\n" +
            "\t\t\t<a class=\"btn-comments chat-ask-button low-height hover-box\" title=\"快问\" href=\"#chatqa\">\n" +
            "\t\t\t\t<svg class=\"icon hover-hide\" aria-hidden=\"true\">\n" +
            "\t\t\t\t\t<use xlink:href=\"#csdnc-more\"></use>\n" +
            "\t\t\t\t</svg>\n" +
            "\t\t\t\t<span class=\"hover-show text\">更多</span>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</a>\n" +
            "\n" +
            "<script type=\"text/javascript\" src=\"https://csdnimg.cn/release/blog_mathjax/MathJax.js?config=TeX-AMS-MML_HTMLorMML\"></script>\n" +
            "<script type=\"text/x-mathjax-config\">\n" +
            "    MathJax.Hub.Config({\n" +
            "            \"HTML-CSS\": {\n" +
            "                    linebreaks: { automatic: true, width: \"94%container\" },\n" +
            "                    imageFont: null\n" +
            "            },\n" +
            "            tex2jax: {\n" +
            "                preview: \"none\"\n" +
            "            },\n" +
            "            mml2jax: {\n" +
            "                preview: 'none'\n" +
            "            }\n" +
            "    });\n" +
            "</script>\n" +
            "<script type=\"text/javascript\">\n" +
            "    </script>\n" +
            "<script src=\"https://gh.bdstatic.com/static/gh/js/sdk/bword.min.js\"></script>\n" +
            "</html>\n";
}
