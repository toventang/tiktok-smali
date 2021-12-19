package com.ss.android.ugc.aweme.commercialize.api;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.z;
import com.google.gson.f;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.model.o;
import com.ss.android.ugc.aweme.commercialize.model.q;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class AwemeAdRankApi {

    /* renamed from: a  reason: collision with root package name */
    public static final AwemeAdRankApi f73692a = new AwemeAdRankApi();

    /* renamed from: b  reason: collision with root package name */
    private static final RealApi f73693b;

    /* renamed from: c  reason: collision with root package name */
    private static final f f73694c;

    public interface RealApi {
        static {
            Covode.recordClassIndex(45338);
        }

        @l.b.f(a = "/aweme/v1/ad/rank/")
        i<q> requestAwemeAdRank(@z(a = "cached_aweme_list") String str, @z(a = "last_ad_show_interval") long j2, @z(a = "action_mask") int i2);
    }

    public interface a {
        static {
            Covode.recordClassIndex(45339);
        }

        void a(String str);

        void a(String str, Exception exc);

        void a(List<o> list, String str);
    }

    private AwemeAdRankApi() {
    }

    static {
        RealApi realApi;
        com.bytedance.ies.ugc.aweme.network.f a2;
        Covode.recordClassIndex(45337);
        IRetrofitFactory a3 = RetrofitFactory.a();
        f fVar = null;
        if (a3 == null || (a2 = a3.a(com.ss.android.c.b.f59141e)) == null) {
            realApi = null;
        } else {
            realApi = (RealApi) a2.a(RealApi.class);
        }
        f73693b = realApi;
        GsonProvider c2 = GsonHolder.c();
        if (c2 != null) {
            fVar = c2.b();
        }
        f73694c = fVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73695a;

        static {
            Covode.recordClassIndex(45340);
        }

        b(a aVar) {
            this.f73695a = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            List<o> g2;
            String str = "";
            l.b(iVar, str);
            if (iVar.b()) {
                a aVar = this.f73695a;
                if (aVar != null) {
                    aVar.a("request canceled");
                }
            } else if (iVar.c()) {
                a aVar2 = this.f73695a;
                if (aVar2 != null) {
                    String message = iVar.e().getMessage();
                    if (message != null) {
                        str = message;
                    }
                    aVar2.a(str, iVar.e());
                }
            } else {
                q qVar = (q) iVar.d();
                if (qVar.f74897a == 204) {
                    a aVar3 = this.f73695a;
                    if (aVar3 != null) {
                        String str2 = qVar.f74898b;
                        if (str2 == null) {
                            str2 = "204: no change";
                        }
                        aVar3.a(str2);
                    }
                } else {
                    List<o> list = qVar.f74899c;
                    if (list == null || (g2 = n.g((Iterable) list)) == null) {
                        a aVar4 = this.f73695a;
                        if (aVar4 != null) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("empty rank list");
                            l.b(qVar, str);
                            qVar.getRequestId();
                            aVar4.a("empty rank list", illegalArgumentException);
                        }
                    } else {
                        ac acVar = ac.a.f91473a;
                        l.b(qVar, str);
                        acVar.a(qVar.getRequestId(), qVar.f74900d);
                        for (o oVar : g2) {
                            Aweme repackAweme = oVar.getRepackAweme();
                            if (repackAweme != null) {
                                repackAweme.setRequestId(qVar.getRequestId());
                                AwemeService.b().a(repackAweme);
                            }
                        }
                        a aVar5 = this.f73695a;
                        if (aVar5 != null) {
                            aVar5.a(g2, qVar.getRequestId());
                        }
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    public static void a(List<? extends Aweme> list, long j2, a aVar) {
        i<q> requestAwemeAdRank;
        String b2;
        String str;
        Long creativeId;
        String str2 = "";
        l.d(list, str2);
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            String aid = t.getAid();
            boolean isAd = t.isAd();
            if (t.isAd()) {
                AwemeRawAd awemeRawAd = t.getAwemeRawAd();
                if (awemeRawAd == null || (creativeId = awemeRawAd.getCreativeId()) == null) {
                    str = null;
                } else {
                    str = String.valueOf(creativeId.longValue());
                }
            } else {
                str = str2;
            }
            arrayList.add(new o(aid, isAd ? 1 : 0, str, null, 8, null));
        }
        f fVar = f73694c;
        if (!(fVar == null || (b2 = fVar.b(arrayList)) == null)) {
            str2 = b2;
        }
        try {
            RealApi realApi = f73693b;
            if (!(realApi == null || (requestAwemeAdRank = realApi.requestAwemeAdRank(str2, j2, -1)) == null)) {
                requestAwemeAdRank.a(new b(aVar));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
