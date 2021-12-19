package com.ss.android.ugc.aweme.commercialize.egg.impl.d;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.commercialize.egg.d.b;
import com.ss.android.ugc.aweme.commercialize.log.c;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ItemCommentEggGroup;
import com.ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class a implements com.ss.android.ugc.aweme.commercialize.egg.c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74018a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(45583);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.d.a$a  reason: collision with other inner class name */
    public static final class CallableC1669a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f74019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.egg.d.a f74020b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f74021c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f74022d;

        static {
            Covode.recordClassIndex(45584);
        }

        CallableC1669a(boolean z, com.ss.android.ugc.aweme.commercialize.egg.d.a aVar, b bVar, String str) {
            this.f74019a = z;
            this.f74020b = aVar;
            this.f74021c = bVar;
            this.f74022d = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i2;
            try {
                if (this.f74019a) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_url", this.f74020b.f73933a);
                jSONObject.put("egg_type", this.f74021c.f73955a);
                jSONObject.put("egg_id", this.f74021c.f73959e);
                jSONObject.put("creative_id", this.f74021c.f73956b);
                jSONObject.put("log_extra", this.f74021c.f73957c);
                jSONObject.put("aweme_id", this.f74021c.f73958d);
                com.bytedance.apm.b.a(this.f74022d, i2, jSONObject);
            } catch (Exception unused) {
            }
            return z.f158842a;
        }
    }

    public static boolean a() {
        if (!b.a()) {
            return true;
        }
        return false;
    }

    public static void a(com.ss.android.ugc.aweme.commercialize.egg.d.a aVar) {
        if (!a() && aVar != null) {
            a("preload_start", aVar.f73944l, 0, 12);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.c.a
    public final void b(List<? extends Aweme> list) {
        if (!a() && list != null) {
            ArrayList<Aweme> arrayList = new ArrayList();
            for (T t : list) {
                ItemCommentEggGroup commentEggGroup = t.getCommentEggGroup();
                if (!(commentEggGroup == null || commentEggGroup.getCommentEggData() == null)) {
                    arrayList.add(t);
                }
            }
            for (Aweme aweme : arrayList) {
                c a2 = new c("egg", "data_received", -1, System.currentTimeMillis()).a(aweme.getAid());
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                c b2 = a2.b(awemeRawAd != null ? awemeRawAd.getCreativeIdStr() : null);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                d.f74778a.a(b2.c(awemeRawAd2 != null ? awemeRawAd2.getLogExtra() : null).e(UGCMonitor.EVENT_COMMENT));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.c.a
    public final void a(List<? extends Aweme> list) {
        String fileType;
        String materialUrl;
        if (!a() && list != null) {
            ArrayList<Aweme> arrayList = new ArrayList();
            for (T t : list) {
                ItemLikeEggData commerceAdLikeDigg = t.getCommerceAdLikeDigg();
                if (!(commerceAdLikeDigg == null || (fileType = commerceAdLikeDigg.getFileType()) == null || fileType.length() == 0 || (materialUrl = commerceAdLikeDigg.getMaterialUrl()) == null || materialUrl.length() == 0)) {
                    arrayList.add(t);
                }
            }
            for (Aweme aweme : arrayList) {
                c a2 = new c("egg", "data_received", -1, System.currentTimeMillis()).a(aweme.getAid());
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                String str = null;
                c b2 = a2.b(awemeRawAd != null ? awemeRawAd.getCreativeIdStr() : null);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    str = awemeRawAd2.getLogExtra();
                }
                d.f74778a.a(b2.c(str).e("like"));
            }
        }
    }

    public static void a(com.ss.android.ugc.aweme.commercialize.egg.d.a aVar, boolean z, String str) {
        if (!a() && aVar != null) {
            a("show_result", aVar.f73944l, !z ? 1 : 0, str);
            a("aweme_ad_egg_show_error_rate", aVar, z);
        }
    }

    public static void a(String str, com.ss.android.ugc.aweme.commercialize.egg.d.a aVar, boolean z) {
        ExecutorService executorService;
        b bVar = aVar.f73944l;
        if (bVar != null) {
            CallableC1669a aVar2 = new CallableC1669a(z, aVar, bVar, str);
            IAppLogDepend iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a;
            if (iAppLogDepend != null) {
                executorService = iAppLogDepend.getLogThreadPool();
            } else {
                executorService = null;
            }
            i.b(aVar2, executorService);
        }
    }

    public static /* synthetic */ void a(String str, b bVar, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        a(str, bVar, i2, (String) null);
    }

    private static void a(String str, b bVar, int i2, String str2) {
        if (bVar != null) {
            d.f74778a.a(new c("egg", str, i2, System.currentTimeMillis()).a(bVar.f73958d).b(bVar.f73956b).c(bVar.f73957c).e(bVar.f73955a).f(bVar.f73959e).d(str2));
        }
    }
}
