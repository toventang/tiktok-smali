package com.ss.android.ugc.aweme.profile.editprofile.vm;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    private final f.a.b.a f116265a;

    static {
        Covode.recordClassIndex(75047);
    }

    public a(f.a.b.a aVar) {
        l.d(aVar, "");
        this.f116265a = aVar;
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new ProfileEditProfileViewModel(this.f116265a);
    }
}
