package com.ss.android.ugc.aweme.question.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.a.m;

final /* synthetic */ class c implements m {

    /* renamed from: a  reason: collision with root package name */
    static final m f119967a = new c();

    static {
        Covode.recordClassIndex(77929);
    }

    private c() {
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(TextUtils.equals(((Aweme) obj).getAid(), ((Aweme) obj2).getAid()));
    }
}
