package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f102694a;

    static {
        Covode.recordClassIndex(65760);
    }

    public a(String str) {
        l.d(str, "");
        this.f102694a = str;
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new GroupShareViewModel(this.f102694a);
    }
}
