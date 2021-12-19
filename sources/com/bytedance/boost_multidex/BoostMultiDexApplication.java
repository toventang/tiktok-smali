package com.bytedance.boost_multidex;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class BoostMultiDexApplication extends Application {
    private boolean isOptProcess;

    static {
        Covode.recordClassIndex(15630);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        boolean isOptimizeProcess = BoostMultiDex.isOptimizeProcess(Utility.getCurProcessName(context));
        this.isOptProcess = isOptimizeProcess;
        if (isOptimizeProcess) {
            BoostMultiDex.install(context);
        }
    }

    public void onCreate() {
        super.onCreate();
        boolean z = this.isOptProcess;
    }
}
