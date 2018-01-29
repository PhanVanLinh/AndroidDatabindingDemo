package toong.vn.androiddatabindingdemo.second;

import android.databinding.ObservableBoolean;
import android.util.Log;

/**
 * Created by PhanVanLinh on 29/01/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class SecondViewModel {
    private String TAG = getClass().getSimpleName();
    public ObservableBoolean booleanValue = new ObservableBoolean();

    public ObservableBoolean getBooleanValue() {
        Log.i(TAG, "boolean = " + booleanValue.get());
        return booleanValue;
    }

    public void onButtonClicked() {
        booleanValue.set(true);
        // if we don't use notify change here,
        booleanValue.notifyChange();
    }
}
