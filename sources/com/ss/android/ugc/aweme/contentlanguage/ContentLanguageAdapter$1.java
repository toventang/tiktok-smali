package com.ss.android.ugc.aweme.contentlanguage;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

/* access modifiers changed from: package-private */
public class ContentLanguageAdapter$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f78142a;

    static {
        Covode.recordClassIndex(48449);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        if (this.f78142a.f78165d != null) {
            this.f78142a.f78165d.f78210a.a();
        }
    }

    @v(a = i.a.ON_RESUME)
    public void onResume() {
        if (this.f78142a.f78164c != null) {
            d dVar = this.f78142a;
            dVar.f78162a = dVar.f78164c.c().getValue();
            this.f78142a.notifyDataSetChanged();
        }
    }

    ContentLanguageAdapter$1(d dVar) {
        this.f78142a = dVar;
    }
}
