package com.bytedance.ug.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public Context f45745a;

    /* renamed from: b  reason: collision with root package name */
    public String f45746b;

    /* renamed from: c  reason: collision with root package name */
    public String f45747c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f45748d;

    /* renamed from: e  reason: collision with root package name */
    public int f45749e = 1;

    static {
        Covode.recordClassIndex(27837);
    }

    public final f a() {
        if (this.f45749e == 1 && this.f45745a == null) {
            throw new IllegalArgumentException("context is null");
        } else if (this.f45746b != null && this.f45747c != null) {
            return new f(this.f45745a, this.f45746b, this.f45747c, this.f45748d, this.f45749e);
        } else {
            throw new IllegalArgumentException("sdkName or sdkVersion is invalid. sdkName = " + this.f45746b + ", sdkVersion = " + this.f45747c);
        }
    }
}
