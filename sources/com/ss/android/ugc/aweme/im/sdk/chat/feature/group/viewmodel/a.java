package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b;
import h.f.b.l;

public final class a implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    private final b f100609a;

    static {
        Covode.recordClassIndex(64359);
    }

    public a(b bVar) {
        l.d(bVar, "");
        this.f100609a = bVar;
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new GroupChatViewModel(this.f100609a);
    }
}
