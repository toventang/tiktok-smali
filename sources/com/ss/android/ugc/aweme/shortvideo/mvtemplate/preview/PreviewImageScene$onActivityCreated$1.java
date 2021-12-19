package com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;

public final class PreviewImageScene$onActivityCreated$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f129368a;

    static {
        Covode.recordClassIndex(84913);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        b bVar;
        if (this.f129368a.F().getVisibility() == 0 && (bVar = this.f129368a.f129372f) != null) {
            bVar.a(R.string.dq6);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PreviewImageScene$onActivityCreated$1(e eVar) {
        this.f129368a = eVar;
    }
}
