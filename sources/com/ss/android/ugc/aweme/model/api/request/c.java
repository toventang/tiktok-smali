package com.ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final b f110747c = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f110748a;

    /* renamed from: b  reason: collision with root package name */
    public int f110749b = 10;

    /* renamed from: d  reason: collision with root package name */
    private final h f110750d = i.a((h.f.a.a) C2829c.f110753a);

    static {
        Covode.recordClassIndex(71082);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(71084);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f110751a;

        /* renamed from: b  reason: collision with root package name */
        private int f110752b = 10;

        static {
            Covode.recordClassIndex(71083);
        }

        public final c a() {
            c cVar = new c();
            cVar.f110748a = this.f110751a;
            cVar.f110749b = this.f110752b;
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.c$c  reason: collision with other inner class name */
    static final class C2829c extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2829c f110753a = new C2829c();

        static {
            Covode.recordClassIndex(71085);
        }

        C2829c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            IAccountUserService e2 = AccountService.a().e();
            l.b(e2, "");
            return e2.getCurUserId();
        }
    }
}
