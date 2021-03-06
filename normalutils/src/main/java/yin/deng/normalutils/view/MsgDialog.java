package yin.deng.normalutils.view;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import yin.deng.normalutils.R;
import yin.deng.normalutils.utils.ScreenUtils;


/**
 * Created by Administrator on 2017/7/26.
 * deng yin
 */
public class MsgDialog extends Dialog {
    public  ViewHolder holder;

    public MsgDialog(Context context) {
        super(context, R.style.ActionSheetDialogStyle);
        View view = View.inflate(context, R.layout.dialog_normal, null);
        setContentView(view);
        //获取当前Activity所在的窗体
        Window dialogWindow = getWindow();
        //设置Dialog从窗体底部弹出
        dialogWindow.setGravity(Gravity.CENTER);
        //设置动画
        dialogWindow.setWindowAnimations(R.style.ActionSheetDialogAnimation);
        //获得窗体的属性
        WindowManager.LayoutParams lp = dialogWindow.getAttributes();
        lp.width = ScreenUtils.dipTopx(context, 300f);
        //       将属性设置给窗体
        dialogWindow.setAttributes(lp);
        holder = new ViewHolder(view);
        holder.tvCancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
    }

    public ViewHolder getHolder() {
        return holder;
    }

    public static class ViewHolder {
        public ImageView ivImg;
        public ImageView ivClose;
        public TextView tvTitle;
        public  TextView tvContent;
        public TextView tvCancle;
        public TextView tvSure;
        public LinearLayout llTextContent;
        public LinearLayout llBottom;
        public FrameLayout fmImgAd;

        public  ViewHolder(View view) {
            ivImg= (ImageView) getView(view,R.id.iv_img);
            ivClose= (ImageView) getView(view,R.id.iv_close);
            tvTitle= (TextView) getView(view,R.id.tv_title);
            tvContent= (TextView) getView(view,R.id.tv_content);
            tvCancle= (TextView) getView(view,R.id.tv_cancle);
            tvSure= (TextView) getView(view,R.id.tv_sure);
            llTextContent= (LinearLayout) getView(view,R.id.ll_text_content);
            llBottom= (LinearLayout) getView(view,R.id.ll_bottom);
            fmImgAd= (FrameLayout) getView(view,R.id.fm_img_ad);
        }

        public View getView(View view,int id){
            return view.findViewById(id);
        }
    }
}
