package com.ss.android.ugc.aweme.tools.b;

import com.bytedance.covode.number.Covode;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    final c f138754a;

    static {
        Covode.recordClassIndex(90760);
    }

    public d(c cVar) {
        this.f138754a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.b.c
    public final String a(String str, e eVar, e eVar2) {
        if (str == null || str.length() <= 5000) {
            return this.f138754a.a(str, eVar, eVar2);
        }
        throw new IllegalArgumentException("Struct in tools line is too long! MAX_LENGTH is 5000, while input.length() is " + str.length() + "!");
    }
}
