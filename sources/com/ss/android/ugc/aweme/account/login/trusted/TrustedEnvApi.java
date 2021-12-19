package com.ss.android.ugc.aweme.account.login.trusted;

import androidx.lifecycle.i;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.g;
import com.ss.android.ugc.aweme.account.login.q;
import com.ss.android.ugc.aweme.account.login.trusted.j;
import com.ss.android.ugc.aweme.utils.ai;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.List;
import l.b.o;

public final class TrustedEnvApi {

    /* renamed from: a  reason: collision with root package name */
    public static final EndPoints f63680a;

    /* renamed from: b  reason: collision with root package name */
    public static final TrustedEnvApi f63681b = new TrustedEnvApi();

    /* renamed from: c  reason: collision with root package name */
    private static final h f63682c;

    public interface EndPoints {
        static {
            Covode.recordClassIndex(39264);
        }

        @o(a = "/passport/device/trust_users/")
        @g
        i<j> fetchTrustedUsers(@l.b.c(a = "last_sec_user_id") String str, @l.b.c(a = "d_ticket") String str2, @l.b.c(a = "last_login_way") int i2, @l.b.c(a = "last_login_time") long j2, @l.b.c(a = "last_login_platform") String str3);

        @o(a = "/passport/user/device_record_status/get/")
        i<a> getLoginHistoryFeatureState();

        @o(a = "/passport/user/device_record_status/set/")
        @g
        i<a> setLoginHistoryFeatureState(@l.b.c(a = "user_device_record_status") int i2);
    }

    static final class a extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f63683a = new a();

        static {
            Covode.recordClassIndex(39265);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "https://api-va.tiktokv.com";
        }
    }

    private TrustedEnvApi() {
    }

    static {
        Covode.recordClassIndex(39263);
        h a2 = h.i.a((h.f.a.a) a.f63683a);
        f63682c = a2;
        f63680a = (EndPoints) RetrofitFactory.a().b((String) a2.getValue()).d().a(EndPoints.class);
    }

    public static void a(h.f.a.b<? super j, z> bVar) {
        l.d(bVar, "");
        a("", "", "", bVar);
    }

    /* access modifiers changed from: package-private */
    public static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f63685a;

        static {
            Covode.recordClassIndex(39267);
        }

        c(h.f.a.b bVar) {
            this.f63685a = bVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            h.f.a.b bVar = this.f63685a;
            l.b(iVar, "");
            bVar.invoke(iVar.d());
            return z.f158842a;
        }
    }

    public static final class e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f63688a;

        static {
            Covode.recordClassIndex(39270);
        }

        public e(h.f.a.b bVar) {
            this.f63688a = bVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            h.f.a.b bVar = this.f63688a;
            l.b(iVar, "");
            bVar.invoke(iVar.d());
            return z.f158842a;
        }
    }

    public static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f63686a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f63687b;

        static {
            Covode.recordClassIndex(39268);
        }

        public d(androidx.lifecycle.m mVar, h.f.a.b bVar) {
            this.f63686a = mVar;
            this.f63687b = bVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(final i iVar) {
            androidx.lifecycle.m mVar = this.f63686a;
            if (mVar == null) {
                h.f.a.b bVar = this.f63687b;
                l.b(iVar, "");
                bVar.invoke(iVar.d());
            } else {
                AnonymousClass1 r2 = new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.account.login.trusted.TrustedEnvApi.d.AnonymousClass1 */
                    final /* synthetic */ d this$0;

                    static {
                        Covode.recordClassIndex(39269);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        h.f.a.b bVar = this.this$0.f63687b;
                        i iVar = iVar;
                        l.b(iVar, "");
                        bVar.invoke(iVar.d());
                        return z.f158842a;
                    }
                };
                l.d(mVar, "");
                l.d(r2, "");
                androidx.lifecycle.i lifecycle = mVar.getLifecycle();
                l.b(lifecycle, "");
                if (lifecycle.a() != i.b.DESTROYED) {
                    r2.invoke();
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f63684a = new b();

        static {
            Covode.recordClassIndex(39266);
        }

        b() {
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            List<h> list;
            Long l2;
            String str;
            String str2;
            String str3;
            if (ai.a(iVar)) {
                l.b(iVar, "");
                String str4 = ((j) iVar.d()).f63724a;
                if (str4 != null && p.a(str4, "success", true)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    i.a().storeLong("last_success_fetch", currentTimeMillis);
                    j.a aVar = ((j) iVar.d()).f63725b;
                    if (!(aVar == null || (list = aVar.f63726a) == null)) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : list) {
                            T t2 = t;
                            if (t2.f63718c != null && (((l2 = t2.f63718c) == null || l2.longValue() != 0) && (str = t2.f63717b) != null && str.length() > 0 && (str2 = t2.f63722g) != null && str2.length() > 0 && (str3 = t2.f63719d) != null && str3.length() > 0)) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList<h> arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
                        for (h hVar : arrayList2) {
                            hVar.f63716a = currentTimeMillis;
                            arrayList3.add(hVar);
                        }
                        i.a(n.k(arrayList3));
                        q.b(list);
                    }
                }
            }
            l.b(iVar, "");
            return iVar.d();
        }
    }

    private static void a(String str, String str2, String str3, h.f.a.b<? super j, z> bVar) {
        l.d(str2, "");
        l.d(bVar, "");
        f63680a.fetchTrustedUsers(str, str2, -1, 0, str3).a(b.f63684a).a(new c(bVar), b.i.f4826c, null);
    }
}
