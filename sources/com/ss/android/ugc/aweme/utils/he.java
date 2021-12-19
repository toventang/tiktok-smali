package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import java.util.ArrayList;
import java.util.List;

public final class he {

    /* renamed from: a  reason: collision with root package name */
    List<String> f143058a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    String f143059b;

    /* renamed from: c  reason: collision with root package name */
    boolean f143060c = true;

    /* renamed from: d  reason: collision with root package name */
    private f f143061d = new f();

    static {
        Covode.recordClassIndex(93625);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f143060c = false;
        c();
    }

    private void c() {
        this.f143059b = null;
        this.f143058a.clear();
    }

    public final void a() {
        if (!this.f143058a.isEmpty() && this.f143060c) {
            b();
        }
    }
}
