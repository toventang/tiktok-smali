package com.ss.android.ugc.aweme.ax.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class a implements r {

    /* renamed from: a  reason: collision with root package name */
    public String f67657a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f67658b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f67659c;

    static {
        Covode.recordClassIndex(41657);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.r
    public void b() {
        this.f67659c = false;
    }

    public final String bz_() {
        String str = this.f67657a;
        if (str == null) {
            l.a("sessionId");
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.ax.a.r
    public void a(String str, boolean z) {
        l.d(str, "");
        this.f67657a = str;
        this.f67658b = z;
        this.f67659c = true;
    }
}
