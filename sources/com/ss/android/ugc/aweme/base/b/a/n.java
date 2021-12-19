package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.aq.a.c;
import com.ss.android.ugc.aweme.bf.d;

/* access modifiers changed from: package-private */
public final class n implements c {

    /* renamed from: a  reason: collision with root package name */
    private Context f68014a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f68015b;

    static {
        Covode.recordClassIndex(41895);
    }

    @Override // com.ss.android.ugc.aweme.aq.a.c
    public final long a() {
        return this.f68015b.getLong("shotLastShowTime", 0);
    }

    public n(Context context) {
        this.f68014a = context;
        this.f68015b = d.a(context, "ShowXmaxTreeCache", 0);
    }

    @Override // com.ss.android.ugc.aweme.aq.a.c
    public final void a(long j2) {
        SharedPreferences.Editor edit = this.f68015b.edit();
        edit.putLong("shotLastShowTime", j2);
        edit.apply();
    }
}
