package com.google.android.gms.common.api.internal;

import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.j;
import java.util.Iterator;
import java.util.Map;

public final class cg {

    /* renamed from: a  reason: collision with root package name */
    final a<b<?>, ConnectionResult> f50152a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    final i<Map<b<?>, String>> f50153b = new i<>();

    /* renamed from: c  reason: collision with root package name */
    private final a<b<?>, String> f50154c = new a<>();

    /* renamed from: d  reason: collision with root package name */
    private int f50155d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f50156e = false;

    static {
        Covode.recordClassIndex(31279);
    }

    public cg(Iterable<? extends j<?>> iterable) {
        Iterator<? extends j<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.f50152a.put(((j) it.next()).c(), null);
        }
        this.f50155d = this.f50152a.keySet().size();
    }

    public final void a(b<?> bVar, ConnectionResult connectionResult, String str) {
        this.f50152a.put(bVar, connectionResult);
        this.f50154c.put(bVar, str);
        this.f50155d--;
        if (!connectionResult.b()) {
            this.f50156e = true;
        }
        if (this.f50155d != 0) {
            return;
        }
        if (this.f50156e) {
            this.f50153b.a(new f(this.f50152a));
            return;
        }
        this.f50153b.a(this.f50154c);
    }
}
