package com.ss.android.ugc.aweme.network;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.List;

public final class b {
    public static final a r = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ttnet.d f112552a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.ttnet.b.a f112553b;

    /* renamed from: c  reason: collision with root package name */
    public int f112554c;

    /* renamed from: d  reason: collision with root package name */
    public String f112555d;

    /* renamed from: e  reason: collision with root package name */
    public String f112556e;

    /* renamed from: f  reason: collision with root package name */
    public String f112557f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f112558g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f112559h;

    /* renamed from: i  reason: collision with root package name */
    public List<com.bytedance.retrofit2.c.a> f112560i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public h.f.a.a<String> f112561j = c.f112566a;

    /* renamed from: k  reason: collision with root package name */
    public h.f.a.a<Integer> f112562k = e.f112568a;

    /* renamed from: l  reason: collision with root package name */
    public h.f.a.a<Integer> f112563l = C2877b.f112565a;

    /* renamed from: m  reason: collision with root package name */
    public h.f.a.a<Boolean> f112564m = f.f112569a;
    public h.f.a.a<Integer> n = d.f112567a;
    public com.ss.android.ugc.aweme.net.c.a o;
    public final NetworkPartnerGroup p = new NetworkPartnerGroup();
    public final Application q;

    static final class c extends m implements h.f.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f112566a = new c();

        static {
            Covode.recordClassIndex(72336);
        }

        c() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(72333);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72334);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.b$b  reason: collision with other inner class name */
    static final class C2877b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2877b f112565a = new C2877b();

        static {
            Covode.recordClassIndex(72335);
        }

        C2877b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return 0;
        }
    }

    static final class d extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f112567a = new d();

        static {
            Covode.recordClassIndex(72337);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return -1;
        }
    }

    static final class e extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f112568a = new e();

        static {
            Covode.recordClassIndex(72338);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return 10;
        }
    }

    static final class f extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f112569a = new f();

        static {
            Covode.recordClassIndex(72339);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    public b(Application application) {
        l.d(application, "");
        this.q = application;
    }
}
