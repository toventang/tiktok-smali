package com.ss.android.ugc.aweme.search.model;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.n.d;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f121511a;

    /* renamed from: b  reason: collision with root package name */
    public final d f121512b;

    /* renamed from: c  reason: collision with root package name */
    public final b f121513c;

    /* renamed from: d  reason: collision with root package name */
    public final d f121514d;

    /* renamed from: e  reason: collision with root package name */
    public final String f121515e;

    /* renamed from: f  reason: collision with root package name */
    public final String f121516f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f121517g;

    static {
        Covode.recordClassIndex(79156);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Context context, d dVar, b bVar, d dVar2, int i2) {
        this(context, dVar, (i2 & 4) != 0 ? null : bVar, (i2 & 8) == 0 ? dVar2 : null, (String) null);
    }

    public c(Context context, d dVar, b bVar, d dVar2, String str) {
        l.d(dVar, "");
        this.f121511a = context;
        this.f121512b = dVar;
        this.f121513c = bVar;
        this.f121514d = dVar2;
        this.f121515e = str;
        this.f121516f = null;
        this.f121517g = null;
    }
}
