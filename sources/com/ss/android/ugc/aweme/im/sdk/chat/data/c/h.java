package com.ss.android.ugc.aweme.im.sdk.chat.data.c;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.d.g;
import f.a.n;
import f.a.t;
import h.f.b.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, com.bytedance.ies.im.core.api.b.b> f100246a;

    /* renamed from: b  reason: collision with root package name */
    public final e f100247b;

    static {
        Covode.recordClassIndex(63906);
    }

    static final class c implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f100251a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f100252b;

        static {
            Covode.recordClassIndex(63909);
        }

        c(h hVar, String str) {
            this.f100251a = hVar;
            this.f100252b = str;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f100251a.f100246a.remove(this.f100252b);
        }
    }

    public /* synthetic */ h() {
        this(new f());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.g
    public final n<com.bytedance.im.core.d.h> b(String str) {
        l.d(str, "");
        return this.f100247b.c(str);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.g
    public final boolean d(String str) {
        l.d(str, "");
        return this.f100247b.f(str);
    }

    static final class b<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f100250a;

        static {
            Covode.recordClassIndex(63908);
        }

        b(h hVar) {
            this.f100250a = hVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.bytedance.im.core.d.h hVar = (com.bytedance.im.core.d.h) obj;
            l.d(hVar, "");
            e eVar = this.f100250a.f100247b;
            String conversationId = hVar.getConversationId();
            l.b(conversationId, "");
            eVar.e(conversationId);
            return hVar;
        }
    }

    private h(e eVar) {
        l.d(eVar, "");
        this.f100247b = eVar;
        this.f100246a = new ConcurrentHashMap<>();
    }

    static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f100248a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f100249b;

        static {
            Covode.recordClassIndex(63907);
        }

        a(h hVar, String str) {
            this.f100248a = hVar;
            this.f100249b = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.bytedance.im.core.d.h hVar = (com.bytedance.im.core.d.h) obj;
            l.d(hVar, "");
            if (hVar.isTemp()) {
                return this.f100248a.f100247b.d(this.f100249b);
            }
            ab a2 = ab.a(hVar);
            l.b(a2, "");
            return a2;
        }
    }

    static final class d<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f100253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f100254b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f100255c;

        static {
            Covode.recordClassIndex(63910);
        }

        d(h hVar, String str, String str2) {
            this.f100253a = hVar;
            this.f100254b = str;
            this.f100255c = str2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.bytedance.im.core.d.h hVar = (com.bytedance.im.core.d.h) obj;
            l.d(hVar, "");
            Map<String, String> localExt = hVar.getLocalExt();
            if (localExt == null || !localExt.containsKey(this.f100254b)) {
                return f.a.h.a.a(f.a.e.e.a.d.f157241a);
            }
            localExt.remove(this.f100254b);
            return this.f100253a.f100247b.a(this.f100255c, localExt);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.g
    public final t<com.ss.android.ugc.aweme.im.sdk.chat.data.d.a> a(String str) {
        com.bytedance.ies.im.core.api.b.b putIfAbsent;
        l.d(str, "");
        ConcurrentHashMap<String, com.bytedance.ies.im.core.api.b.b> concurrentHashMap = this.f100246a;
        com.bytedance.ies.im.core.api.b.b bVar = concurrentHashMap.get(str);
        if (bVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (bVar = this.f100247b.a(str)))) != null) {
            bVar = putIfAbsent;
        }
        l.b(bVar, "");
        com.bytedance.ies.im.core.api.b.b bVar2 = bVar;
        l.d(bVar2, "");
        t<com.ss.android.ugc.aweme.im.sdk.chat.data.d.a> a2 = new com.ss.android.ugc.aweme.im.sdk.chat.data.d.b(bVar2).a(new c(this, str));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.g
    public final ab<com.bytedance.im.core.d.h> c(String str) {
        l.d(str, "");
        n<com.bytedance.im.core.d.h> b2 = this.f100247b.b(str);
        ab<com.bytedance.im.core.d.h> d2 = this.f100247b.d(str);
        f.a.e.b.b.a((Object) d2, "other is null");
        ab<com.bytedance.im.core.d.h> c2 = f.a.h.a.a(new f.a.e.e.c.t(b2, d2)).a((g) new a(this, str)).c(new b(this));
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.g
    public final f.a.b a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        f.a.b b2 = this.f100247b.b(str).b(new d(this, str2, str));
        l.b(b2, "");
        return b2;
    }
}
