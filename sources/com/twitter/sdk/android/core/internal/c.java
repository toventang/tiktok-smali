package com.twitter.sdk.android.core.internal;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.twitter.sdk.android.core.internal.b.b;
import com.twitter.sdk.android.core.k;

/* access modifiers changed from: package-private */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    final b f155960a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f155961b;

    static {
        Covode.recordClassIndex(103629);
    }

    /* access modifiers changed from: package-private */
    public final b a() {
        b a2 = new e(this.f155961b).a();
        b(a2);
        k.c().b();
        return a2;
    }

    static boolean b(b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.f155953a)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(b bVar) {
        if (b(bVar)) {
            b bVar2 = this.f155960a;
            bVar2.a(bVar2.b().putString("advertising_id", bVar.f155953a).putBoolean("limit_ad_tracking_enabled", bVar.f155954b));
            return;
        }
        b bVar3 = this.f155960a;
        bVar3.a(bVar3.b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
    }

    c(Context context, b bVar) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f155961b = applicationContext;
        this.f155960a = bVar;
    }
}
