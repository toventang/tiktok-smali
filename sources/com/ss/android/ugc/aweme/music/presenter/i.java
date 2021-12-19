package com.ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.a.m;

final /* synthetic */ class i implements m {

    /* renamed from: a  reason: collision with root package name */
    static final m f111590a = new i();

    static {
        Covode.recordClassIndex(71708);
    }

    private i() {
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(TextUtils.equals(((Aweme) obj).getAid(), ((Aweme) obj2).getAid()));
    }
}
