package com.ss.android.ugc.aweme.discover.helper;

import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class MusicPlayHelper$play$6 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MusicPlayHelper f81022a;

    static {
        Covode.recordClassIndex(50365);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MusicPlayHelper$play$6(MusicPlayHelper musicPlayHelper) {
        this.f81022a = musicPlayHelper;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        if (aVar == i.a.ON_PAUSE) {
            this.f81022a.a();
        }
    }
}
