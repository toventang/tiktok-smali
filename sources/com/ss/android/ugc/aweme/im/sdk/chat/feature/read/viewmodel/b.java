package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.e;
import com.ss.android.ugc.aweme.im.sdk.chat.data.a;
import h.f.b.l;

public final class b implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    public final e f100953a;

    /* renamed from: b  reason: collision with root package name */
    public final a f100954b;

    static {
        Covode.recordClassIndex(64578);
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        if (cls.isAssignableFrom(ReadStateViewModel.class)) {
            return new ReadStateViewModel(this.f100953a, this.f100954b);
        }
        throw new IllegalArgumentException("ReadStateViewModelFactory: Unknown ViewModel class");
    }

    public b(e eVar, a aVar) {
        l.d(eVar, "");
        l.d(aVar, "");
        this.f100953a = eVar;
        this.f100954b = aVar;
    }
}
