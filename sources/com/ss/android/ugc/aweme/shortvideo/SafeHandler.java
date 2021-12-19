package com.ss.android.ugc.aweme.shortvideo;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;

public class SafeHandler extends Handler implements f {

    /* renamed from: a  reason: collision with root package name */
    final m f124754a;

    static {
        Covode.recordClassIndex(81979);
    }

    public final void a() {
        removeCallbacksAndMessages(null);
        a(new df(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.SafeHandler$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f124755a;

        static {
            Covode.recordClassIndex(81980);
            int[] iArr = new int[i.a.values().length];
            f124755a = iArr;
            try {
                iArr[i.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public SafeHandler(m mVar) {
        super(Looper.getMainLooper());
        this.f124754a = mVar;
        a(new de(this));
    }

    private void a(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (AnonymousClass1.f124755a[aVar.ordinal()] == 1) {
            a();
        }
    }
}
