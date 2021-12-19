package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class af {

    /* renamed from: a  reason: collision with root package name */
    public int f37694a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f37695b;

    /* renamed from: c  reason: collision with root package name */
    public ap f37696c;

    /* renamed from: d  reason: collision with root package name */
    public ap f37697d;

    /* renamed from: e  reason: collision with root package name */
    public ap f37698e;

    /* renamed from: f  reason: collision with root package name */
    public List<ai> f37699f;

    /* renamed from: g  reason: collision with root package name */
    public u f37700g;

    static {
        Covode.recordClassIndex(22660);
    }

    public af() {
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("Result{direction=").append(this.f37694a).append(", origin=").append(this.f37696c).append(", toCheck=").append(this.f37697d).append(", checked=").append(this.f37698e).append(", success=").append(this.f37695b).append(", size=").append(this.f37699f.size()).append(", logId=");
        u uVar = this.f37700g;
        if (uVar != null) {
            str = uVar.f38028f;
        } else {
            str = null;
        }
        return append.append(str).append("}").toString();
    }

    public af(long j2, long j3, int i2) {
        this.f37694a = i2;
        this.f37696c = new ap(j2, j3);
        this.f37697d = new ap(j2, j3);
        this.f37698e = new ap();
        this.f37699f = new ArrayList();
    }
}
