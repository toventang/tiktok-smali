package com.ss.android.token;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.c;
import com.bytedance.sdk.a.o.d;
import com.ss.android.account.f;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f61008a;

    /* renamed from: b  reason: collision with root package name */
    public Set<String> f61009b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    public String f61010c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f61011d = false;

    /* renamed from: e  reason: collision with root package name */
    public long f61012e = 600000;

    /* renamed from: f  reason: collision with root package name */
    public a f61013f;

    public interface a {
        static {
            Covode.recordClassIndex(37587);
        }

        boolean a();
    }

    static {
        Covode.recordClassIndex(37586);
    }

    public b() {
        String str;
        d dVar = f.f58196c;
        if (dVar == null || !dVar.a()) {
            str = c.a.f43087a + c.a.a();
        } else {
            str = c.a.f43088b + c.a.a();
        }
        this.f61008a = str;
        String a2 = g.a(str);
        if (a2 != null) {
            this.f61009b.add(a2);
        }
    }
}
