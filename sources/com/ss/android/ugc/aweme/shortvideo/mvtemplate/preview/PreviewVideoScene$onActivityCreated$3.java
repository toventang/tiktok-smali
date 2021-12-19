package com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n;
import com.zhiliaoapp.musically.R;

public final class PreviewVideoScene$onActivityCreated$3 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n f129369a;

    static {
        Covode.recordClassIndex(84914);
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
        if (this.f129369a.f129420h == n.b.FILE_DELETED) {
            b bVar2 = this.f129369a.f129421i;
            if (bVar2 != null) {
                bVar2.a(R.string.cd4);
            }
        } else if (this.f129369a.f129420h == n.b.DISABLE_4K && (bVar = this.f129369a.f129421i) != null) {
            bVar.a(R.string.h6j);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PreviewVideoScene$onActivityCreated$3(n nVar) {
        this.f129369a = nVar;
    }
}
