package com.ipd.jianghuzuchebusiness.contract;

import com.ipd.jianghuzuchebusiness.base.BasePresenter;
import com.ipd.jianghuzuchebusiness.base.BaseView;
import com.ipd.jianghuzuchebusiness.bean.CaptchaBean;
import com.ipd.jianghuzuchebusiness.bean.UploadImgBean;

import java.util.TreeMap;

import io.reactivex.ObservableTransformer;
import okhttp3.RequestBody;

/**
 * Description ：MemberCenterContract  V 、P契约类
 * Author ： MengYang
 * Email ： 942685687@qq.com
 * Time ： 2019/4/2.
 */
public interface EditStoreInforContract {

    interface View extends BaseView {
        //不同的Bean单独处理
        void resultEditStoreInfor(CaptchaBean data);

        void resultUploadImg(UploadImgBean data);

        <T> ObservableTransformer<T, T> bindLifecycle();
    }

    abstract class Presenter extends BasePresenter<View> {
        public abstract void getEditStoreInfor(TreeMap<String, String> map, boolean isDialog, boolean cancelable);

        public abstract void getUploadImg(String imgType, TreeMap<String, RequestBody> map, boolean isDialog, boolean cancelable);
    }
}