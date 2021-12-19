package com.ss.android.ugc.aweme.network;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Application f112513a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.ttnet.d f112514b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.ttnet.b.a f112515c;

    /* renamed from: d  reason: collision with root package name */
    public final int f112516d;

    /* renamed from: e  reason: collision with root package name */
    public final String f112517e;

    /* renamed from: f  reason: collision with root package name */
    public final String f112518f;

    /* renamed from: g  reason: collision with root package name */
    public final String f112519g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f112520h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f112521i;

    /* renamed from: j  reason: collision with root package name */
    public final List<com.bytedance.retrofit2.c.a> f112522j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.net.c.a f112523k;

    /* renamed from: l  reason: collision with root package name */
    public final d<String> f112524l;

    /* renamed from: m  reason: collision with root package name */
    public final d<Integer> f112525m;
    public final d<Integer> n;
    public final d<Boolean> o;
    public final d<Integer> p;
    public final d<NetworkPartnerGroup> q;

    static {
        Covode.recordClassIndex(72313);
    }

    /* renamed from: com.ss.android.ugc.aweme.network.a$a  reason: collision with other inner class name */
    public static final class C2875a implements d<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f112526a;

        static {
            Covode.recordClassIndex(72314);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.ugc.aweme.network.d
        public final /* synthetic */ Integer a() {
            return this.f112526a.f112563l.invoke();
        }

        C2875a(b bVar) {
            this.f112526a = bVar;
        }
    }

    public static final class b implements d<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f112532a;

        static {
            Covode.recordClassIndex(72315);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.ugc.aweme.network.d
        public final /* synthetic */ String a() {
            return this.f112532a.f112561j.invoke();
        }

        b(b bVar) {
            this.f112532a = bVar;
        }
    }

    public static final class c implements d<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f112534a;

        static {
            Covode.recordClassIndex(72316);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.ugc.aweme.network.d
        public final /* synthetic */ Integer a() {
            return this.f112534a.n.invoke();
        }

        c(b bVar) {
            this.f112534a = bVar;
        }
    }

    public static final class d implements d<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f112538a;

        static {
            Covode.recordClassIndex(72317);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.ugc.aweme.network.d
        public final /* synthetic */ Integer a() {
            return this.f112538a.f112562k.invoke();
        }

        d(b bVar) {
            this.f112538a = bVar;
        }
    }

    public static final class e implements d<NetworkPartnerGroup> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f112542a;

        static {
            Covode.recordClassIndex(72318);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.ugc.aweme.network.d
        public final /* bridge */ /* synthetic */ NetworkPartnerGroup a() {
            return this.f112542a.p.a();
        }

        e(b bVar) {
            this.f112542a = bVar;
        }
    }

    public static final class f implements d<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f112548a;

        static {
            Covode.recordClassIndex(72319);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.ugc.aweme.network.d
        public final /* synthetic */ Boolean a() {
            return this.f112548a.f112564m.invoke();
        }

        f(b bVar) {
            this.f112548a = bVar;
        }
    }

    public a(b bVar) {
        l.d(bVar, "");
        this.f112513a = bVar.q;
        this.f112514b = bVar.f112552a;
        this.f112515c = bVar.f112553b;
        this.f112516d = bVar.f112554c;
        this.f112517e = bVar.f112555d;
        this.f112518f = bVar.f112556e;
        this.f112519g = bVar.f112557f;
        this.f112520h = bVar.f112558g;
        this.f112521i = bVar.f112559h;
        this.f112522j = bVar.f112560i;
        this.f112523k = bVar.o;
        this.f112524l = new b(bVar);
        this.f112525m = new d(bVar);
        this.n = new C2875a(bVar);
        this.o = new f(bVar);
        this.p = new c(bVar);
        this.q = new e(bVar);
    }
}
