package com.ss.android.ugc.aweme.net.f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.j.a.d;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f112312a;

    /* renamed from: b  reason: collision with root package name */
    private String f112313b;

    static {
        Covode.recordClassIndex(72170);
    }

    @Override // com.ss.android.ugc.aweme.net.f.d
    public final void a(String str) {
        if (!this.f112312a) {
            d.a.f48738a.a();
            this.f112313b = str;
            this.f112312a = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.net.f.d
    public final void b(String str) {
        if (this.f112312a && TextUtils.equals(this.f112313b, str)) {
            d.a.f48738a.b();
            this.f112312a = false;
        }
    }
}
