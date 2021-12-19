package com.ss.android.ugc.aweme.shortvideo.ui.creationflow;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.f.a.a;

public final class RecordStage$startActivitySafely$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f131645a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f131646b;

    static {
        Covode.recordClassIndex(86211);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onActivityStart();
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onActivityStart() {
        ((m) this.f131645a).getLifecycle().b(this);
        this.f131646b.invoke();
    }

    RecordStage$startActivitySafely$1(Context context, a aVar) {
        this.f131645a = context;
        this.f131646b = aVar;
    }
}
