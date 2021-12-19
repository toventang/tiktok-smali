package com.ss.android.ugc.aweme.device;

import android.content.Context;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import c.b.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.device.a;
import com.ss.android.ugc.aweme.utils.bq;
import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f80032a;

    static {
        Covode.recordClassIndex(49815);
    }

    b(Context context) {
        this.f80032a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j2;
        Context context = this.f80032a;
        a.C1869a aVar = new a.C1869a();
        bq.a aVar2 = new bq.a();
        aVar2.f142690a = bq.c();
        aVar2.f142691b = bq.b() * 1000;
        aVar2.f142692c = bq.a();
        aVar.f80027a = aVar2;
        bq.d dVar = new bq.d();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) bq.a(context, "window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            dVar.f142698a = displayMetrics.densityDpi;
            dVar.f142699b = displayMetrics.widthPixels;
            dVar.f142700c = displayMetrics.heightPixels;
            dVar.f142701d = displayMetrics.xdpi;
            dVar.f142702e = displayMetrics.ydpi;
            dVar.f142703f = displayMetrics.density;
        }
        aVar.f80028b = dVar;
        bq.e eVar = new bq.e();
        eVar.f142708e = bq.e(context);
        eVar.f142704a = bq.d(context);
        long j3 = -1;
        if (Environment.getDataDirectory() != null) {
            j2 = bq.a(Environment.getDataDirectory().getPath());
        } else {
            j2 = -1;
        }
        eVar.f142706c = j2;
        long c2 = d.c(context);
        if (c2 == -1) {
            c2 = -1;
        }
        eVar.f142705b = c2;
        if (Environment.getDataDirectory() != null) {
            j3 = bq.b(Environment.getDataDirectory().getPath());
        }
        eVar.f142707d = j3;
        eVar.f142709f = bq.c(context);
        aVar.f80029c = eVar;
        bq.b bVar = new bq.b();
        bVar.f142693a = bq.a(context);
        bVar.f142694b = bq.b(context);
        aVar.f80030d = bVar;
        bq.c cVar = new bq.c();
        int i2 = 1;
        cVar.f142695a = androidx.core.content.b.a(context, "android.permission.CAMERA") == 0 ? 1 : 0;
        cVar.f142696b = androidx.core.content.b.a(context, "android.permission.RECORD_AUDIO") == 0 ? 1 : 0;
        if (androidx.core.content.b.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            i2 = 0;
        }
        cVar.f142697c = i2;
        aVar.f80031e = cVar;
        return aVar;
    }
}
