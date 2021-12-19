package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel;

import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a;
import h.f.b.l;

public abstract class AbsReadStateDelegate extends Handler implements a {

    /* renamed from: c  reason: collision with root package name */
    public final a f100938c;

    static {
        Covode.recordClassIndex(64568);
    }

    public void a() {
    }

    public void bA_() {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    @v(a = i.a.ON_CREATE)
    public void onCreate() {
        a.C2516a.onCreate(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        a.C2516a.onDestroy(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        a.C2516a.onPause(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    @v(a = i.a.ON_RESUME)
    public void onResume() {
        a.C2516a.onResume(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    @v(a = i.a.ON_START)
    public void onStart() {
        a.C2516a.onStart(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    @v(a = i.a.ON_STOP)
    public void onStop() {
        a.C2516a.onStop(this);
    }

    public AbsReadStateDelegate(a aVar) {
        l.d(aVar, "");
        this.f100938c = aVar;
    }
}
