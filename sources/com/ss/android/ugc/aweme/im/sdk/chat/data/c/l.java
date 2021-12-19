package com.ss.android.ugc.aweme.im.sdk.chat.data.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.e;
import com.ss.android.ugc.aweme.im.sdk.chat.data.d.c;
import com.ss.android.ugc.aweme.im.sdk.chat.data.d.d;
import f.a.t;
import java.util.concurrent.ConcurrentHashMap;

public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, e> f100256a;

    /* renamed from: b  reason: collision with root package name */
    private final i f100257b;

    static {
        Covode.recordClassIndex(63914);
    }

    static final class a implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f100258a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f100259b;

        static {
            Covode.recordClassIndex(63915);
        }

        a(l lVar, String str) {
            this.f100258a = lVar;
            this.f100259b = str;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f100258a.f100256a.remove(this.f100259b);
        }
    }

    public /* synthetic */ l() {
        this(new j());
    }

    private l(i iVar) {
        h.f.b.l.d(iVar, "");
        this.f100257b = iVar;
        this.f100256a = new ConcurrentHashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.k
    public final t<c> b(String str) {
        h.f.b.l.d(str, "");
        e a2 = a(str);
        h.f.b.l.d(a2, "");
        t<c> a3 = new d(a2).a(new a(this, str));
        h.f.b.l.b(a3, "");
        return a3;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.k
    public final void c(String str) {
        h.f.b.l.d(str, "");
        e eVar = this.f100256a.get(str);
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.k
    public final void d(String str) {
        h.f.b.l.d(str, "");
        e eVar = this.f100256a.get(str);
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.k
    public final void e(String str) {
        h.f.b.l.d(str, "");
        e eVar = this.f100256a.get(str);
        if (eVar != null) {
            eVar.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.k
    public final e a(String str) {
        e putIfAbsent;
        h.f.b.l.d(str, "");
        ConcurrentHashMap<String, e> concurrentHashMap = this.f100256a;
        e eVar = concurrentHashMap.get(str);
        if (eVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (eVar = this.f100257b.a(str)))) != null) {
            eVar = putIfAbsent;
        }
        h.f.b.l.b(eVar, "");
        return eVar;
    }
}
