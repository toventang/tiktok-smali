package com.bytedance.sdk.a.c.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public abstract class a {
    public String callerLocalEntry;
    public String callerPackage;
    public String callerVersion;
    public Bundle extras;

    static {
        Covode.recordClassIndex(26457);
    }

    public boolean checkArgs() {
        return true;
    }

    public abstract int getType();

    public String getCallerLocalEntry() {
        return this.callerLocalEntry;
    }

    public String getCallerPackage() {
        return this.callerPackage;
    }

    public String getCallerVersion() {
        return this.callerVersion;
    }

    public void fromBundle(Bundle bundle) {
        this.callerPackage = bundle.getString("_bytedance_params_type_caller_package");
        this.callerVersion = bundle.getString("__bytedance_base_caller_version");
        this.extras = bundle.getBundle("_bytedance_params_extra");
        this.callerLocalEntry = bundle.getString("_bytedance_params_from_entry");
    }

    public void toBundle(Bundle bundle) {
        bundle.putString("_bytedance_params_type_caller_package", this.callerPackage);
        bundle.putString("__bytedance_base_caller_version", this.callerVersion);
        bundle.putInt("_bytedance_params_type", getType());
        bundle.putBundle("_bytedance_params_extra", this.extras);
        bundle.putString("_bytedance_params_from_entry", this.callerLocalEntry);
    }
}
