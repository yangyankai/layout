package com.example.administrator.mylayoutparams;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * 但LayoutParams类也只是简单的描述了宽高，宽和高都可以设置成三种值：
 * 1，一个确定的值；
 * 2，FILL_PARENT，即填满（和父容器一样大小）；
 * 3，WRAP_CONTENT，即包裹住组件就好。
 */
public class MainActivity extends AppCompatActivity {
    MainActivity _this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _this = this;
        TextView textView = new TextView(_this);
        textView.setText("代码添加布局");
        textView.setBackgroundColor(Color.GREEN);

        /**
         * RelativeLayout LayoutParams
         */
//        RelativeLayout   填充父布局大小
//        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//        RelativeLayout   精确大小
//        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(200, 200);
//        RelativeLayout   包含自身
//        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);//父布局右面
//        lp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);//父布局顶部
//        lp.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);//在父布局居中

        /**
         *FrameLayout LayoutParams
         */
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(200, 200);//大小
        lp.gravity = Gravity.BOTTOM | Gravity.RIGHT;//布局

        textView.setLayoutParams(lp);
        FrameLayout relativeLayout = (FrameLayout) findViewById(R.id.my_relativeLayout);
        relativeLayout.addView(textView);
    }
}
