package dagger.hilt.android.internal.c;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f156658a;

    static {
        Covode.recordClassIndex(104047);
    }

    /* access modifiers changed from: package-private */
    public final Application a() {
        Context applicationContext = this.f156658a.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        return (Application) applicationContext;
    }

    public c(Context context) {
        this.f156658a = context;
    }
}
