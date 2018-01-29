package toong.vn.androiddatabindingdemo.main;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import toong.vn.androiddatabindingdemo.BR;

/**
 * Created by PhanVanLinh on 29/01/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class MainViewModel extends BaseObservable{
    private String TAG = getClass().getSimpleName();
    public boolean booleanValue;

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
        notifyPropertyChanged(BR.booleanValue);
    }

    @Bindable
    public boolean isBooleanValue() {
        Log.i(TAG, "boolean = " + booleanValue);
        return booleanValue;
    }

    public void onButtonClicked() {
        setBooleanValue(true);
    }
}
