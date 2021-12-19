package com.bytedance.sdk.a.h.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.n.a;
import java.util.Map;

public final class b extends i implements h {

    /* renamed from: a  reason: collision with root package name */
    public String f43248a;

    /* renamed from: b  reason: collision with root package name */
    public String f43249b;

    /* renamed from: c  reason: collision with root package name */
    public String f43250c;

    /* renamed from: d  reason: collision with root package name */
    public String f43251d;

    /* renamed from: e  reason: collision with root package name */
    public Map f43252e;

    /* renamed from: f  reason: collision with root package name */
    public a f43253f;

    static {
        Covode.recordClassIndex(26517);
    }

    @Override // com.bytedance.sdk.a.h.a.h
    public final a b() {
        return this.f43253f;
    }

    private b(String str, String str2, String str3, String str4) {
        super(20);
        this.f43248a = str;
        this.f43249b = str3;
        this.f43250c = str2;
        this.f43251d = str4;
    }

    public b(String str, String str2, String str3, String str4, Map map) {
        this(str, str2, str3, str4);
        this.f43252e = map;
    }
}
