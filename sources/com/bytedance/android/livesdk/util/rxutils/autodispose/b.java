package com.bytedance.android.livesdk.util.rxutils.autodispose;

import androidx.lifecycle.i;
import com.bytedance.android.livesdk.util.rxutils.autodispose.a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.b.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements a {

    /* renamed from: a  reason: collision with root package name */
    static final a f22142a = new b();

    static {
        Covode.recordClassIndex(13048);
    }

    private b() {
    }

    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.b.a, f.a.d.g
    public final Object apply(Object obj) {
        i.a aVar = (i.a) obj;
        int i2 = a.AnonymousClass1.f22133a[aVar.ordinal()];
        if (i2 == 1) {
            return i.a.ON_DESTROY;
        }
        if (i2 == 2) {
            return i.a.ON_STOP;
        }
        if (i2 == 3) {
            return i.a.ON_PAUSE;
        }
        if (i2 == 4) {
            return i.a.ON_STOP;
        }
        throw new com.bytedance.android.livesdk.util.rxutils.autodispose.b.b("Lifecycle has ended! Last event was ".concat(String.valueOf(aVar)));
    }
}
