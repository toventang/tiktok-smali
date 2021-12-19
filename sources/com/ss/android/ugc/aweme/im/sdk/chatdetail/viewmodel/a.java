package com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import h.f.b.l;

public final class a implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f101844a;

    /* renamed from: b  reason: collision with root package name */
    private final b f101845b;

    static {
        Covode.recordClassIndex(65146);
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new GroupChatDetailViewModel(this.f101844a, this.f101845b);
    }

    public a(String str, b bVar) {
        l.d(str, "");
        l.d(bVar, "");
        this.f101844a = str;
        this.f101845b = bVar;
    }
}
