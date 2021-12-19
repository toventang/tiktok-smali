package androidx.multidex;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class MultiDexApplication extends Application {
    static {
        Covode.recordClassIndex(1455);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }
}
