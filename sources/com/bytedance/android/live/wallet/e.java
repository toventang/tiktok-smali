package com.bytedance.android.live.wallet;

import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class e {

    /* renamed from: g  reason: collision with root package name */
    public static final e f13122g = b.f13134a;

    /* renamed from: h  reason: collision with root package name */
    public static final a f13123h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f13124a;

    /* renamed from: b  reason: collision with root package name */
    public List<com.bytedance.android.livesdk.wallet.c> f13125b;

    /* renamed from: c  reason: collision with root package name */
    public List<com.bytedance.android.livesdk.wallet.c> f13126c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.livesdk.wallet.c f13127d;

    /* renamed from: e  reason: collision with root package name */
    public DiamondPackageExtra f13128e;

    /* renamed from: f  reason: collision with root package name */
    public long f13129f;

    public static final class a {
        static {
            Covode.recordClassIndex(7284);
        }

        private a() {
        }

        public static String b() {
            if (a()) {
                return "amazon";
            }
            return "google_pay";
        }

        public static boolean a() {
            String str;
            IHostContext iHostContext = (IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class);
            if (iHostContext != null) {
                str = iHostContext.getChannel();
            } else {
                str = null;
            }
            return m.a("amazon_int", str);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final e f13134a = new e((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f13135b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(7285);
        }
    }

    static {
        Covode.recordClassIndex(7283);
    }

    private e() {
        this.f13124a = "";
        this.f13125b = new ArrayList();
        this.f13126c = new ArrayList();
        this.f13127d = new com.bytedance.android.livesdk.wallet.c();
    }

    public final List<com.bytedance.android.livesdk.wallet.c> a() {
        long j2 = this.f13129f;
        f b2 = u.a().b();
        l.b(b2, "");
        if (j2 != b2.c()) {
            this.f13125b.clear();
        }
        return this.f13125b;
    }

    public /* synthetic */ e(byte b2) {
        this();
    }

    public final void a(String str) {
        l.d(str, "");
        this.f13124a = str;
    }

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f13145a = new d();

        static {
            Covode.recordClassIndex(7287);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            String str;
            Throwable th = (Throwable) obj;
            if (th instanceof com.bytedance.android.live.a.a.a) {
                i2 = ((com.bytedance.android.live.a.a.a) th).getErrorCode();
            } else {
                i2 = -1;
            }
            if (th == null || (str = th.getMessage()) == null) {
                str = "api exception";
            }
            com.bytedance.android.live.wallet.c.c.a("ttlive_query_wallet_purchase", i2, -1, str);
        }
    }

    public final void a(List<? extends com.bytedance.android.livesdk.wallet.c> list) {
        l.d(list, "");
        f b2 = u.a().b();
        l.b(b2, "");
        this.f13129f = b2.c();
        this.f13125b.clear();
        this.f13125b.addAll(list);
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f13142a;

        static {
            Covode.recordClassIndex(7286);
        }

        public c(e eVar) {
            this.f13142a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.a aVar = (com.bytedance.android.live.network.response.a) obj;
            e eVar = this.f13142a;
            List<T> list = aVar.f12145b;
            l.b(list, "");
            l.d(list, "");
            eVar.f13126c = list;
            this.f13142a.f13128e = (DiamondPackageExtra) aVar.f12146c;
            ArrayList arrayList = new ArrayList();
            for (com.bytedance.android.livesdk.wallet.c cVar : this.f13142a.f13126c) {
                String str = cVar.f22406b;
                l.b(str, "");
                arrayList.add(str);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("item_size", Integer.valueOf(arrayList.size()));
            com.bytedance.android.live.wallet.c.c.a("ttlive_query_wallet_purchase", hashMap);
            ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a(arrayList);
        }
    }
}
