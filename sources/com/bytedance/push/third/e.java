package com.bytedance.push.third;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.third.a.b;

public final class e extends com.bytedance.push.k.e<c> implements c {

    /* renamed from: a  reason: collision with root package name */
    private int f42356a;

    /* renamed from: b  reason: collision with root package name */
    private String f42357b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f42358c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f42359d;

    /* renamed from: e  reason: collision with root package name */
    private b f42360e;

    /* renamed from: f  reason: collision with root package name */
    private String f42361f;

    /* renamed from: g  reason: collision with root package name */
    private b f42362g;

    static {
        Covode.recordClassIndex(25879);
    }

    @Override // com.bytedance.push.third.c
    public final b b() {
        return this.f42360e;
    }

    @Override // com.bytedance.push.third.c
    public final String c() {
        return this.f42357b;
    }

    @Override // com.bytedance.push.third.c
    public final String d() {
        return this.f42361f;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public c e() {
        if (m.a(this.f42357b)) {
            return this;
        }
        try {
            Object newInstance = Class.forName(this.f42357b).newInstance();
            if (newInstance instanceof b) {
                this.f42360e = (b) newInstance;
            }
        } catch (Throwable unused) {
        }
        return this;
    }

    @Override // com.bytedance.push.third.c
    public final boolean a() {
        if (!this.f42359d) {
            this.f42358c = this.f42362g.a(this.f42360e, this.f42356a);
            this.f42359d = true;
        }
        return this.f42358c;
    }

    public e(int i2, String str, String str2, b bVar) {
        this.f42356a = i2;
        this.f42357b = str;
        this.f42361f = str2;
        this.f42362g = bVar;
    }
}
