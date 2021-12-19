package com.ss.android.ugc.aweme.profile.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.a.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bv implements b {

    /* renamed from: a  reason: collision with root package name */
    static final b f117005a = new bv();

    static {
        Covode.recordClassIndex(75556);
    }

    private bv() {
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        String trim = obj.toString().trim();
        return Boolean.valueOf(TextUtils.isEmpty(trim) || trim.contains("@"));
    }
}
