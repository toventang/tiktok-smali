package com.bytedance.android.live.wallet;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.c.b;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.g;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import f.a.l.c;
import f.a.t;
import java.util.HashMap;
import java.util.List;

public final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    public g f13181a;

    /* renamed from: b  reason: collision with root package name */
    BalanceStruct f13182b;

    /* renamed from: c  reason: collision with root package name */
    public final f.a.l.g<Long> f13183c;

    /* renamed from: d  reason: collision with root package name */
    private final b f13184d;

    static {
        Covode.recordClassIndex(7314);
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.bytedance.android.live.wallet.d
    public final BalanceStruct e() {
        return this.f13182b;
    }

    @Override // com.bytedance.android.live.wallet.d
    public final g f() {
        return this.f13181a;
    }

    @Override // com.bytedance.android.live.wallet.d
    public final void a(String str) {
        ((IapApi) e.a().a(IapApi.class)).autoExchange(true).a(new f()).a(new j(this, str), k.f13194a);
    }

    public final void a(String str, String str2, long j2) {
        ((IapApi) e.a().a(IapApi.class)).getExchangeRatio(str, str2, 101, j2, 2).a(new f()).a(new t(this), u.f13244a);
    }

    @Override // com.bytedance.android.live.wallet.d
    public final void a(List<String> list) {
        this.f13184d.a(list);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final i f13191a = new i((byte) 0);

        static {
            Covode.recordClassIndex(7317);
        }
    }

    private static boolean i() {
        return u.a().b().e();
    }

    @Override // com.bytedance.android.live.wallet.d
    public final t<Long> a() {
        return this.f13183c.a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
    }

    @Override // com.bytedance.android.live.wallet.d
    public final long b() {
        if (!i()) {
            return 0;
        }
        return this.f13181a.f13232a;
    }

    @Override // com.bytedance.android.live.wallet.d
    public final void c() {
        this.f13182b = new BalanceStruct();
        this.f13181a = new g();
    }

    @Override // com.bytedance.android.live.wallet.d
    public final boolean g() {
        if (!m.a("0", d.a(y.e(), "js_kv_methods_20191113", 0).getString("live_auto_exchange", "0"))) {
            return true;
        }
        return false;
    }

    private i() {
        this.f13181a = new g();
        this.f13182b = new BalanceStruct();
        this.f13183c = new c();
        this.f13184d = new b(0);
    }

    @Override // com.bytedance.android.live.wallet.d
    public final void d() {
        if (i()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ((IapApi) e.a().a(IapApi.class)).getWalletInfoNew().a(new f()).a(new n(this, uptimeMillis), new o(uptimeMillis));
        }
    }

    @Override // com.bytedance.android.live.wallet.d
    public final void h() {
        if (i()) {
            ((IapApi) e.a().a(IapApi.class)).getBalanceInfo(1).a(new f()).a(new p(this), q.f13240a);
        }
    }

    /* synthetic */ i(byte b2) {
        this();
    }

    @Override // com.bytedance.android.live.wallet.d
    public final void a(g gVar) {
        this.f13184d.a(gVar);
    }

    @Override // com.bytedance.android.live.wallet.d
    public final void b(g gVar) {
        this.f13184d.b(gVar);
    }

    @Override // com.bytedance.android.live.wallet.d
    public final String c(long j2) {
        return a(j2, this.f13182b.getExchangeInfo());
    }

    @Override // com.bytedance.android.live.wallet.d
    public final String d(long j2) {
        return a(j2, this.f13181a.f13235d);
    }

    public static void a(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        d.a(y.e(), "js_kv_methods_20191113", 0).edit().putString("live_auto_exchange", str).commit();
    }

    @Override // com.bytedance.android.live.wallet.d
    public final boolean b(long j2) {
        if (i() && this.f13181a.f13232a >= j2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.wallet.d
    public final void e(long j2) {
        if (i() && this.f13182b.getUserBalance() != null && this.f13182b.getExchangeInfo() != null && this.f13182b.getExchangeInfo().getBasePackage() != null) {
            BasePackage basePackage = this.f13182b.getExchangeInfo().getBasePackage();
            double d2 = (double) j2;
            double price = (double) basePackage.getPrice();
            double pow = Math.pow(10.0d, (double) (basePackage.getRealDot() - 2));
            Double.isNaN(price);
            Double.isNaN(d2);
            this.f13182b.getExchangeInfo().setMaxCoins((long) (d2 / (price / pow)));
            this.f13182b.getUserBalance().setBalance(j2);
        }
    }

    @Override // com.bytedance.android.live.wallet.d
    public final void a(long j2) {
        if (i()) {
            this.f13181a.f13232a = j2;
            this.f13183c.onNext(Long.valueOf(b()));
        }
    }

    @Override // com.bytedance.android.live.wallet.d
    public final void a(final com.bytedance.android.livesdkapi.depend.d.b.c cVar) {
        if (!i()) {
            com.bytedance.android.live.a.a.b.a aVar = new com.bytedance.android.live.a.a.b.a(-666);
            aVar.setErrorMsg("user doesn't login");
            cVar.a(aVar);
            return;
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        ((IapApi) e.a().a(IapApi.class)).getWalletInfoNew().a(new f()).a(new f.a.d.f<com.bytedance.android.live.network.response.d<g>>() {
            /* class com.bytedance.android.live.wallet.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(7315);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(com.bytedance.android.live.network.response.d<g> dVar) {
                com.bytedance.android.live.network.response.d<g> dVar2 = dVar;
                if (dVar2.data != null) {
                    i.this.f13181a = (g) dVar2.data;
                    BalanceStructExtra balanceStructExtra = i.this.f13181a.f13235d;
                    i.a(((g) dVar2.data).f13233b);
                    if (i.this.f13181a.f13234c != null && i.this.f13181a.f13234c.getEnableExchange()) {
                        i.this.f13181a.f13235d = balanceStructExtra;
                        i iVar = i.this;
                        iVar.a(iVar.f13181a.f13234c.getCurrency(), i.this.f13181a.f13234c.getRegion(), i.this.f13181a.f13234c.getBalance());
                    }
                    cVar.a(((g) dVar2.data).f13232a);
                    i.this.f13183c.onNext(Long.valueOf(i.this.b()));
                } else {
                    cVar.a(new com.bytedance.android.live.a.a.a.c());
                }
                com.bytedance.android.livesdk.wallet.b.a.a(0, SystemClock.uptimeMillis() - uptimeMillis, null);
            }
        }, new f.a.d.f<Throwable>() {
            /* class com.bytedance.android.live.wallet.i.AnonymousClass2 */

            static {
                Covode.recordClassIndex(7316);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(Throwable th) {
                int i2;
                Throwable th2 = th;
                HashMap hashMap = new HashMap();
                hashMap.put("error_msg", th2.getMessage());
                if (th2 instanceof com.bytedance.android.live.a.a.a) {
                    i2 = ((com.bytedance.android.live.a.a.a) th2).getErrorCode();
                } else {
                    i2 = -16;
                }
                hashMap.put("error_code", Integer.valueOf(i2));
                com.bytedance.android.livesdk.wallet.b.a.a(SystemClock.uptimeMillis() - uptimeMillis, hashMap);
                com.bytedance.android.livesdk.wallet.b.a.a(1, SystemClock.uptimeMillis() - uptimeMillis, hashMap);
                cVar.a(th2);
            }
        });
    }

    private static String a(long j2, BalanceStructExtra balanceStructExtra) {
        if (balanceStructExtra == null || balanceStructExtra.getBasePackage() == null || balanceStructExtra.getCurrencyInfo() == null) {
            return "";
        }
        int realDot = balanceStructExtra.getBasePackage().getRealDot();
        long price = balanceStructExtra.getBasePackage().getPrice();
        StringBuilder append = new StringBuilder().append(balanceStructExtra.getCurrencyInfo().getSymbol());
        double d2 = (double) price;
        double pow = Math.pow(10.0d, (double) realDot);
        Double.isNaN(d2);
        double d3 = d2 / pow;
        double d4 = (double) j2;
        Double.isNaN(d4);
        return append.append(com.a.a("%.2f", new Object[]{Double.valueOf(d3 * d4)})).toString();
    }

    @Override // com.bytedance.android.live.wallet.d
    public final void a(com.bytedance.android.live.wallet.model.c cVar, com.bytedance.android.livesdkapi.depend.d.b.a aVar) {
        ((IapApi) e.a().a(IapApi.class)).exchangeCoins(cVar.f13215a, cVar.f13218d, cVar.f13217c, cVar.f13219e, cVar.f13220f, cVar.f13221g, cVar.f13222h).a(new f()).a(new l(this, aVar), new m(aVar));
    }

    @Override // com.bytedance.android.live.wallet.d
    public final void a(com.bytedance.android.livesdk.wallet.c cVar, Activity activity) {
        this.f13184d.a(cVar, activity);
    }

    @Override // com.bytedance.android.live.wallet.d
    public final t<com.bytedance.android.live.network.response.a<com.bytedance.android.livesdk.wallet.c, DiamondPackageExtra>> a(String str, long j2, long j3, long j4) {
        return ((IapApi) e.a().a(IapApi.class)).fetchDiamondPackage(str, j2, j3, j4);
    }
}
