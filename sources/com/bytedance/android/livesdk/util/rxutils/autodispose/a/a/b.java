package com.bytedance.android.livesdk.util.rxutils.autodispose.a.a;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import f.a.d.e;

final /* synthetic */ class b implements e {

    /* renamed from: a  reason: collision with root package name */
    static final e f22137a = new b();

    static {
        Covode.recordClassIndex(13041);
    }

    private b() {
    }

    @Override // f.a.d.e
    public final boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
