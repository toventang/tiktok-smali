package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class ke {

    /* renamed from: a  reason: collision with root package name */
    final ff f51989a;

    static {
        Covode.recordClassIndex(32362);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.f51989a.b().x.a() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (b() && this.f51989a.l().a() - this.f51989a.b().x.a() > this.f51989a.f51600e.a((String) null, p.aS)) {
            return true;
        }
        return false;
    }

    public ke(ff ffVar) {
        this.f51989a = ffVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, Bundle bundle) {
        String str2;
        this.f51989a.p().c();
        if (!this.f51989a.r()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f51989a.b().w.a(str2);
                this.f51989a.b().x.a(this.f51989a.l().a());
            }
        }
    }
}
