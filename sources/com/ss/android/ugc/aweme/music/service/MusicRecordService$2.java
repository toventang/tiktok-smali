package com.ss.android.ugc.aweme.music.service;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

class MusicRecordService$2 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f111729a;

    static {
        Covode.recordClassIndex(71853);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f111729a.f111730a = false;
        this.f111729a.f111734e.b();
    }

    MusicRecordService$2(e eVar) {
        this.f111729a = eVar;
    }
}
