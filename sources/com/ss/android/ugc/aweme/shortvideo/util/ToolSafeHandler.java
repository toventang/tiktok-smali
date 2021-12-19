package com.ss.android.ugc.aweme.shortvideo.util;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

public class ToolSafeHandler extends SafeHandler {

    /* renamed from: b  reason: collision with root package name */
    private boolean f132176b;

    static {
        Covode.recordClassIndex(86562);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f132177a;

        static {
            Covode.recordClassIndex(86563);
            int[] iArr = new int[i.a.values().length];
            f132177a = iArr;
            try {
                iArr[i.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ToolSafeHandler(m mVar) {
        super(mVar);
    }

    public final void a(Runnable runnable) {
        if (!this.f132176b) {
            post(runnable);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.SafeHandler, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (AnonymousClass1.f132177a[aVar.ordinal()] == 1) {
            a();
            this.f132176b = true;
        }
    }
}
