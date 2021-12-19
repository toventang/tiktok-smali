package com.ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.IAdCardOutService;
import com.ss.android.ugc.aweme.commercialize.service.AdCardOutService;
import com.ss.android.ugc.aweme.utils.dz;
import com.ss.android.ugc.aweme.utils.eb;
import h.f.b.m;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f73781b = C1654b.f73784a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f73782c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final dz f73783a = eb.a(c.f73786a);

    public static final class a {
        static {
            Covode.recordClassIndex(45411);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.b$b  reason: collision with other inner class name */
    static final class C1654b {

        /* renamed from: a  reason: collision with root package name */
        static final b f73784a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final C1654b f73785b = new C1654b();

        private C1654b() {
        }

        static {
            Covode.recordClassIndex(45412);
        }
    }

    public final t a() {
        return (t) this.f73783a.a();
    }

    static final class c extends m implements h.f.a.a<t> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f73786a = new c();

        static {
            Covode.recordClassIndex(45413);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t invoke() {
            IAdCardOutService adCardOutService;
            Object a2 = com.ss.android.ugc.b.a(IAdCardOutService.class, false);
            if (a2 != null) {
                adCardOutService = (IAdCardOutService) a2;
                if (adCardOutService == null) {
                    return null;
                }
            } else {
                adCardOutService = new AdCardOutService();
            }
            return adCardOutService.a();
        }
    }

    static {
        Covode.recordClassIndex(45410);
    }
}
