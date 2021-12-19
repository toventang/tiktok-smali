package com.ss.android.ugc.aweme.base;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;

public class SafeHandler extends Handler implements f {

    /* renamed from: a  reason: collision with root package name */
    private final m f67955a;

    static {
        Covode.recordClassIndex(41836);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.SafeHandler$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f67956a;

        static {
            Covode.recordClassIndex(41837);
            int[] iArr = new int[i.a.values().length];
            f67956a = iArr;
            try {
                iArr[i.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public SafeHandler(m mVar) {
        super(Looper.getMainLooper());
        this.f67955a = mVar;
        if (mVar != null) {
            mVar.getLifecycle().a(this);
        }
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (AnonymousClass1.f67956a[aVar.ordinal()] == 1) {
            removeCallbacksAndMessages(null);
            m mVar2 = this.f67955a;
            if (mVar2 != null) {
                mVar2.getLifecycle().b(this);
            }
        }
    }
}
