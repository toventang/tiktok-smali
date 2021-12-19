package com.google.firebase;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.m;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f54356a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54357b;

    /* renamed from: c  reason: collision with root package name */
    public final String f54358c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54359d;

    /* renamed from: e  reason: collision with root package name */
    public final String f54360e;

    /* renamed from: f  reason: collision with root package name */
    public final String f54361f;

    /* renamed from: g  reason: collision with root package name */
    public final String f54362g;

    static {
        Covode.recordClassIndex(33748);
    }

    public final int hashCode() {
        return p.a(this.f54357b, this.f54356a, this.f54358c, this.f54359d, this.f54360e, this.f54361f, this.f54362g);
    }

    public final String toString() {
        return p.a(this).a("applicationId", this.f54357b).a("apiKey", this.f54356a).a("databaseUrl", this.f54358c).a("gcmSenderId", this.f54360e).a("storageBucket", this.f54361f).a("projectId", this.f54362g).toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!p.a(this.f54357b, eVar.f54357b) || !p.a(this.f54356a, eVar.f54356a) || !p.a(this.f54358c, eVar.f54358c) || !p.a(this.f54359d, eVar.f54359d) || !p.a(this.f54360e, eVar.f54360e) || !p.a(this.f54361f, eVar.f54361f) || !p.a(this.f54362g, eVar.f54362g)) {
            return false;
        }
        return true;
    }

    e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        r.a(!m.a(str), "ApplicationId must be set.");
        this.f54357b = str;
        this.f54356a = str2;
        this.f54358c = str3;
        this.f54359d = str4;
        this.f54360e = str5;
        this.f54361f = str6;
        this.f54362g = str7;
    }
}
