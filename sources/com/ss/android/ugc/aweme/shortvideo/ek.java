package com.ss.android.ugc.aweme.shortvideo;

import android.text.Editable;
import com.bytedance.covode.number.Covode;
import h.f.a.a;

public final /* synthetic */ class ek implements a {

    /* renamed from: a  reason: collision with root package name */
    private final String f128434a;

    /* renamed from: b  reason: collision with root package name */
    private final Editable f128435b;

    static {
        Covode.recordClassIndex(84216);
    }

    public ek(String str, Editable editable) {
        this.f128434a = str;
        this.f128435b = editable;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        return Boolean.valueOf(this.f128434a.length() > this.f128435b.length());
    }
}
