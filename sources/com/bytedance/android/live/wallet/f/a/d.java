package com.bytedance.android.live.wallet.f.a;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.c.b;
import com.bytedance.android.live.wallet.e;
import com.bytedance.android.live.wallet.g;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeGiftIapidSetting;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.x;
import h.f.b.ad;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class d extends b<com.bytedance.android.live.wallet.f.b.b> {

    /* renamed from: a  reason: collision with root package name */
    public DiamondPackageExtra f13151a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.livesdk.wallet.c f13152b;

    /* renamed from: c  reason: collision with root package name */
    public List<com.bytedance.android.livesdk.wallet.c> f13153c;

    /* renamed from: d  reason: collision with root package name */
    public f.a.b.b f13154d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.d.b.b f13155e;

    /* renamed from: f  reason: collision with root package name */
    public final g f13156f = new a(this);

    /* renamed from: g  reason: collision with root package name */
    public final com.bytedance.android.live.wallet.c.b f13157g;

    /* renamed from: h  reason: collision with root package name */
    public long f13158h;

    /* renamed from: i  reason: collision with root package name */
    public long f13159i;

    /* renamed from: j  reason: collision with root package name */
    private final h f13160j = com.bytedance.android.livesdkapi.m.d.a(b.f13164a);

    /* renamed from: k  reason: collision with root package name */
    private final h f13161k = i.a((h.f.a.a) e.f13167a);

    /* renamed from: l  reason: collision with root package name */
    private final Activity f13162l;

    static {
        Covode.recordClassIndex(7298);
    }

    private final IapApi g() {
        return (IapApi) this.f13161k.getValue();
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return (String) this.f13160j.getValue();
    }

    static final class b extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13164a = new b();

        static {
            Covode.recordClassIndex(7300);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return LiveFirstRechargeGiftIapidSetting.INSTANCE.getValue();
        }
    }

    public final void e() {
        this.f13157g.a(this.f13156f);
    }

    public final void f() {
        this.f13157g.b(this.f13156f);
    }

    static final class e extends m implements h.f.a.a<IapApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f13167a = new e();

        static {
            Covode.recordClassIndex(7303);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IapApi invoke() {
            return com.bytedance.android.live.network.e.a().a(IapApi.class);
        }
    }

    @Override // com.bytedance.ies.a.b
    public final void b() {
        f.a.b.b bVar;
        super.b();
        f.a.b.b bVar2 = this.f13154d;
        if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f13154d) == null)) {
            bVar.dispose();
        }
        this.f13155e = null;
    }

    public final void c() {
        f.a.b.b bVar;
        com.bytedance.android.live.wallet.f.b.b bVar2 = (com.bytedance.android.live.wallet.f.b.b) this.y;
        if (bVar2 != null) {
            bVar2.l();
        }
        f.a.b.b bVar3 = this.f13154d;
        if (!(bVar3 == null || bVar3.isDisposed() || (bVar = this.f13154d) == null)) {
            bVar.dispose();
        }
        if (com.bytedance.android.live.wallet.e.f13122g.f13124a.length() != 0 || e.a.a()) {
            d();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a());
        this.f13157g.a(arrayList);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        long j2;
        if (e.a.a()) {
            j2 = 8;
        } else {
            j2 = 0;
        }
        this.f13154d = g().fetchDiamondPackage(com.bytedance.android.live.wallet.e.f13122g.f13124a, this.f13158h, this.f13159i, j2).a(new f()).a(new c(this), new C0278d(this));
    }

    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f13163a;

        static {
            Covode.recordClassIndex(7299);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(d dVar) {
            this.f13163a = dVar;
        }

        @Override // com.bytedance.android.live.wallet.g
        public final void a(int i2, Object obj) {
            ArrayList arrayList;
            List<com.bytedance.android.livesdk.wallet.c> list;
            ArrayList arrayList2 = null;
            Integer num = null;
            if (i2 == 1) {
                d dVar = this.f13163a;
                if (obj != null) {
                    List<com.bytedance.android.livesdk.wallet.c> list2 = (List) obj;
                    if (list2.size() != 1 || !com.bytedance.common.utility.m.a(((com.bytedance.android.livesdk.wallet.c) list2.get(0)).f22406b, dVar.a())) {
                        for (com.bytedance.android.livesdk.wallet.c cVar : list2) {
                            List<com.bytedance.android.livesdk.wallet.c> list3 = dVar.f13153c;
                            if (list3 != null) {
                                for (T t : list3) {
                                    if (com.bytedance.common.utility.m.a(t.f22406b, cVar.f22406b)) {
                                        t.f22407c = cVar.f22407c;
                                        t.f22412h = cVar.f22412h;
                                        t.f22411g = cVar.f22411g;
                                        t.f22414j = cVar.f22414j;
                                    }
                                }
                            }
                        }
                        List<com.bytedance.android.livesdk.wallet.c> list4 = dVar.f13153c;
                        if (list4 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (T t2 : list4) {
                                if (!com.bytedance.common.utility.m.a(t2.f22411g)) {
                                    arrayList3.add(t2);
                                }
                            }
                            arrayList = arrayList3;
                        } else {
                            arrayList = null;
                        }
                        if (ad.c(arrayList)) {
                            arrayList2 = arrayList;
                        }
                        dVar.f13153c = arrayList2;
                        if (com.bytedance.android.live.wallet.e.f13122g.a().isEmpty() && (list = dVar.f13153c) != null) {
                            com.bytedance.android.live.wallet.e.f13122g.a(list);
                        }
                        com.bytedance.android.live.wallet.f.b.b bVar = (com.bytedance.android.live.wallet.f.b.b) dVar.y;
                        if (bVar != null) {
                            bVar.m();
                        }
                        com.bytedance.android.live.wallet.f.b.b bVar2 = (com.bytedance.android.live.wallet.f.b.b) dVar.y;
                        if (bVar2 != null) {
                            DiamondPackageExtra diamondPackageExtra = dVar.f13151a;
                            List<com.bytedance.android.livesdk.wallet.c> list5 = dVar.f13153c;
                            if (list5 == null) {
                                list5 = new ArrayList<>();
                            }
                            bVar2.a(diamondPackageExtra, list5);
                        }
                        com.bytedance.android.livesdkapi.depend.d.b.b bVar3 = dVar.f13155e;
                        if (bVar3 != null) {
                            bVar3.a(1, 0, "ok");
                            return;
                        }
                        return;
                    }
                    com.bytedance.android.live.wallet.e eVar = com.bytedance.android.live.wallet.e.f13122g;
                    String str = ((com.bytedance.android.livesdk.wallet.c) list2.get(0)).f22411g;
                    l.b(str, "");
                    eVar.a(str);
                    dVar.d();
                    return;
                }
                com.bytedance.android.live.wallet.f.b.b bVar4 = (com.bytedance.android.live.wallet.f.b.b) dVar.y;
                if (bVar4 != null) {
                    bVar4.m();
                }
                com.bytedance.android.live.wallet.f.b.b bVar5 = (com.bytedance.android.live.wallet.f.b.b) dVar.y;
                if (bVar5 != null) {
                    bVar5.a(new Exception("result is null"), 0);
                }
            } else if (i2 == 2) {
                this.f13163a.a(obj);
            } else if (i2 == 3) {
                com.bytedance.android.live.wallet.f.b.b bVar6 = (com.bytedance.android.live.wallet.f.b.b) this.f13163a.y;
                if (bVar6 != null) {
                    bVar6.c();
                }
                com.bytedance.android.livesdk.wallet.c cVar2 = this.f13163a.f13152b;
                if (cVar2 != null) {
                    long j2 = (long) cVar2.f22405a;
                    com.bytedance.android.livesdkapi.depend.d.b.b bVar7 = this.f13163a.f13155e;
                    if (bVar7 != null) {
                        bVar7.a(j2);
                    }
                }
                DiamondPackageExtra diamondPackageExtra2 = com.bytedance.android.live.wallet.e.f13122g.f13128e;
                if (diamondPackageExtra2 != null) {
                    com.bytedance.android.livesdk.wallet.c cVar3 = this.f13163a.f13152b;
                    if (cVar3 != null) {
                        num = Integer.valueOf(cVar3.f22405a);
                    }
                    diamondPackageExtra2.recentlyPurchasedPacketId = num.intValue();
                }
                com.bytedance.android.livesdk.wallet.c cVar4 = this.f13163a.f13152b;
                if (cVar4 != null) {
                    com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.wallet.d(true, cVar4.f22408d));
                    com.bytedance.android.live.wallet.f.b.b bVar8 = (com.bytedance.android.live.wallet.f.b.b) this.f13163a.y;
                    if (bVar8 != null) {
                        bVar8.b(cVar4.f22408d);
                    }
                }
            }
        }

        @Override // com.bytedance.android.live.wallet.g
        public final void a(int i2, int i3, int i4, Exception exc, com.bytedance.android.livesdk.wallet.g gVar) {
            l.d(exc, "");
            l.d(gVar, "");
            if (i2 == 1) {
                com.bytedance.android.livesdkapi.depend.d.b.b bVar = this.f13163a.f13155e;
                if (bVar != null) {
                    bVar.a(0, i3, exc.getMessage());
                }
                com.bytedance.android.live.wallet.f.b.b bVar2 = (com.bytedance.android.live.wallet.f.b.b) this.f13163a.y;
                if (bVar2 != null) {
                    bVar2.a(exc, i3);
                }
            } else if (i2 == 2) {
                d dVar = this.f13163a;
                l.d(exc, "");
                com.bytedance.android.live.wallet.f.b.b bVar3 = (com.bytedance.android.live.wallet.f.b.b) dVar.y;
                if (bVar3 != null) {
                    bVar3.c();
                }
                if (!(exc instanceof Exception)) {
                    exc = null;
                }
                Exception exc2 = exc;
                if (exc2 == null) {
                    exc2 = new Exception();
                }
                com.bytedance.android.livesdkapi.depend.d.b.b bVar4 = dVar.f13155e;
                if (bVar4 != null) {
                    bVar4.a(exc2, "fail_google_create_order_fail");
                }
                com.bytedance.android.live.wallet.f.b.b bVar5 = (com.bytedance.android.live.wallet.f.b.b) dVar.y;
                if (bVar5 != null) {
                    bVar5.a(i2, i3, i4, exc2);
                }
            } else if (i2 == 3) {
                com.bytedance.android.live.wallet.f.b.b bVar6 = (com.bytedance.android.live.wallet.f.b.b) this.f13163a.y;
                if (bVar6 != null) {
                    bVar6.c();
                }
                com.bytedance.android.live.wallet.f.b.b bVar7 = (com.bytedance.android.live.wallet.f.b.b) this.f13163a.y;
                if (bVar7 != null) {
                    bVar7.a(i2, i3, i4, exc);
                }
            }
        }
    }

    public final void a(com.bytedance.android.livesdk.wallet.c cVar) {
        l.d(cVar, "");
        this.f13152b = cVar;
        com.bytedance.android.live.wallet.f.b.b bVar = (com.bytedance.android.live.wallet.f.b.b) this.y;
        if (bVar != null) {
            bVar.a(R.string.gmn);
        }
        this.f13157g.a(cVar, this.f13162l);
    }

    public final com.bytedance.android.livesdk.wallet.c a(String str) {
        List<com.bytedance.android.livesdk.wallet.c> list;
        l.d(str, "");
        if (com.bytedance.common.utility.collection.b.a((Collection) this.f13153c) || (list = this.f13153c) == null) {
            return null;
        }
        for (T t : list) {
            if (com.bytedance.common.utility.m.a(t.f22406b, str)) {
                return t;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.wallet.f.a.d$d  reason: collision with other inner class name */
    public static final class C0278d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f13166a;

        static {
            Covode.recordClassIndex(7302);
        }

        C0278d(d dVar) {
            this.f13166a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            String str;
            com.bytedance.android.live.wallet.f.b.b bVar;
            String message;
            Throwable th = (Throwable) obj;
            if (th instanceof com.bytedance.android.live.a.a.a) {
                i2 = ((com.bytedance.android.live.a.a.a) th).getErrorCode();
            } else {
                i2 = -1;
            }
            String str2 = "api exception";
            if (th == null || (str = th.getMessage()) == null) {
                str = str2;
            }
            com.bytedance.android.live.wallet.c.c.a("ttlive_query_wallet_purchase", i2, -1, str);
            com.bytedance.android.livesdkapi.depend.d.b.b bVar2 = this.f13166a.f13155e;
            if (bVar2 != null) {
                if (!(th == null || (message = th.getMessage()) == null)) {
                    str2 = message;
                }
                bVar2.a(0, i2, str2);
            }
            com.bytedance.android.live.wallet.f.b.b bVar3 = (com.bytedance.android.live.wallet.f.b.b) this.f13166a.y;
            if (bVar3 != null) {
                bVar3.m();
            }
            if ((th instanceof Exception) && (bVar = (com.bytedance.android.live.wallet.f.b.b) this.f13166a.y) != null) {
                bVar.a((Exception) th, 0);
            }
        }
    }

    public final void a(Object obj) {
        com.bytedance.android.livesdk.wallet.e eVar;
        String str;
        String str2;
        com.bytedance.android.live.wallet.f.b.b bVar = (com.bytedance.android.live.wallet.f.b.b) this.y;
        if (bVar != null) {
            bVar.c();
        }
        com.bytedance.android.live.wallet.f.b.b bVar2 = (com.bytedance.android.live.wallet.f.b.b) this.y;
        if (bVar2 != null) {
            bVar2.a(0);
        }
        if ((obj instanceof com.bytedance.android.livesdk.wallet.e) && (str = (eVar = (com.bytedance.android.livesdk.wallet.e) obj).f22418b) != null && (str2 = eVar.f22417a) != null) {
            com.bytedance.android.live.wallet.c.b bVar3 = this.f13157g;
            l.d(str, "");
            l.d(str2, "");
            bVar3.f13088b.a(((IapApi) com.bytedance.android.live.network.e.a().a(IapApi.class)).checkOrderResult(str).a(new f()).a((f.a.d.g<? super R, ? extends x<? extends R>>) b.h.f13103a, false).g(com.bytedance.android.livesdk.util.rxutils.i.a(1000)).a(new b.i(bVar3, str, SystemClock.uptimeMillis(), str2), new b.j(bVar3, str2, str)));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f13165a;

        static {
            Covode.recordClassIndex(7301);
        }

        c(d dVar) {
            this.f13165a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.a aVar = (com.bytedance.android.live.network.response.a) obj;
            List<T> list = aVar.f12145b;
            l.b(list, "");
            if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
                com.bytedance.android.live.wallet.c.c.a("ttlive_query_wallet_purchase", 12, -1, "query wallet purchase empty");
                com.bytedance.android.live.wallet.f.b.b bVar = (com.bytedance.android.live.wallet.f.b.b) this.f13165a.y;
                if (bVar != null) {
                    bVar.a(new Exception("server diamonds is null"), 0);
                    return;
                }
                return;
            }
            com.bytedance.android.livesdkapi.depend.d.b.b bVar2 = this.f13165a.f13155e;
            if (bVar2 != null) {
                bVar2.a(2, 0, "api success");
            }
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                String str = t.f22406b;
                l.b(str, "");
                arrayList.add(str);
            }
            this.f13165a.f13153c = list;
            this.f13165a.f13151a = (DiamondPackageExtra) aVar.f12146c;
            com.bytedance.android.live.wallet.e.f13122g.f13128e = this.f13165a.f13151a;
            HashMap hashMap = new HashMap();
            hashMap.put("iapKey", Integer.valueOf(list.size()));
            com.bytedance.android.live.wallet.c.c.a("ttlive_query_wallet_purchase", hashMap);
            this.f13165a.f13157g.a(arrayList);
        }
    }

    public d(Activity activity, com.bytedance.android.live.wallet.c.b bVar, long j2, long j3) {
        l.d(activity, "");
        l.d(bVar, "");
        this.f13162l = activity;
        this.f13157g = bVar;
        this.f13158h = j2;
        this.f13159i = j3;
    }
}
