package com.bytedance.push.d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.c;
import com.ss.android.pushmanager.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final c f42086a;

    static {
        Covode.recordClassIndex(25731);
    }

    @Override // com.ss.android.pushmanager.b
    public final Context a() {
        return this.f42086a.f42057a;
    }

    @Override // com.ss.android.pushmanager.b
    public final int b() {
        return this.f42086a.f42058b;
    }

    @Override // com.ss.android.pushmanager.b
    public final int c() {
        return this.f42086a.f42059c;
    }

    public a(c cVar) {
        this.f42086a = cVar;
    }
}
