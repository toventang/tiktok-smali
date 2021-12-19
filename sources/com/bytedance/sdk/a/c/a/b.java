package com.bytedance.sdk.a.c.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public abstract class b {
    public int errorCode;
    public String errorMsg;
    public Bundle extras;

    static {
        Covode.recordClassIndex(26458);
    }

    public boolean checkArgs() {
        return true;
    }

    public abstract int getType();

    public boolean isSuccess() {
        if (this.errorCode == 0) {
            return true;
        }
        return false;
    }

    public boolean isCancel() {
        if (this.errorCode == -2) {
            return true;
        }
        return false;
    }

    public void fromBundle(Bundle bundle) {
        this.errorCode = bundle.getInt("_bytedance_params_error_code");
        this.errorMsg = bundle.getString("_bytedance_params_error_msg");
        this.extras = bundle.getBundle("_bytedance_params_extra");
    }

    public void toBundle(Bundle bundle) {
        bundle.putInt("_bytedance_params_error_code", this.errorCode);
        bundle.putString("_bytedance_params_error_msg", this.errorMsg);
        bundle.putInt("_bytedance_params_type", getType());
        bundle.putBundle("_bytedance_params_extra", this.extras);
    }
}
