package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f1063a;

    static {
        Covode.recordClassIndex(307);
    }

    public final boolean b() {
        return this.f1063a.getResources().getBoolean(R.bool.f159904a);
    }

    public final boolean c() {
        if (this.f1063a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    public final int a() {
        Configuration configuration = this.f1063a.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 > 960 && i3 > 720) {
            return 5;
        }
        if (i2 > 720 && i3 > 960) {
            return 5;
        }
        if (i2 >= 500) {
            return 4;
        }
        if (i2 > 640 && i3 > 480) {
            return 4;
        }
        if (i2 > 480 && i3 > 640) {
            return 4;
        }
        if (i2 >= 360) {
            return 3;
        }
        return 2;
    }

    private a(Context context) {
        this.f1063a = context;
    }

    public static a a(Context context) {
        return new a(context);
    }
}
