package com.ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final C2828b f110740c = new C2828b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f110741a;

    /* renamed from: b  reason: collision with root package name */
    public int f110742b = 10;

    /* renamed from: d  reason: collision with root package name */
    private final h f110743d = i.a((h.f.a.a) c.f110746a);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f110744a = 10;

        /* renamed from: b  reason: collision with root package name */
        public int f110745b;

        static {
            Covode.recordClassIndex(71079);
        }
    }

    static {
        Covode.recordClassIndex(71078);
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.b$b  reason: collision with other inner class name */
    public static final class C2828b {
        static {
            Covode.recordClassIndex(71080);
        }

        private C2828b() {
        }

        public /* synthetic */ C2828b(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f110746a = new c();

        static {
            Covode.recordClassIndex(71081);
        }

        c() {
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
