package com.cuit.drawdream.drawdream.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.widget.Toast;

import com.cuit.drawdream.bean.UserInfoEntity;
import com.cuit.drawdream.drawdream.utils.tool.Config;
import com.cuit.drawdream.drawdream.view.MyInfoMgtActivity;
import com.kelin.mvvmlight.command.ReplyCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * class :    MyInfoFragmentViewModel
 * At         2017/5/31.
 * Desc :
 */

public class MyInfoFragmentViewModel extends BaseViewModel {

    private Context mContext;

    public final ObservableField<String > mName = new ObservableField<>();

    public MyInfoFragmentViewModel(Context context) {
        super(context);
        mContext = context;
        mName.set(Config.USER_INFO.getUserName());
    }

    /**
     * 跳转到我的信息管理
     */
    public final ReplyCommand toMyMsg = new ReplyCommand(()->{
        //跳转到msg
        Intent intent = new Intent(mContext, MyInfoMgtActivity.class);
        mContext.startActivity(intent);
    });

    /**
     * 友好性提示
     */
    public final ReplyCommand hint = new ReplyCommand(()->{
       Toast.makeText(mContext,"程序猿懒得写了",Toast.LENGTH_SHORT).show();
    });



    @Override
    public void destroy() {

    }
}
