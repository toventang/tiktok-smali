package com.ss.android.ugc.aweme.money.growth;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.services.RetrofitService;
import h.f.b.l;
import java.util.concurrent.Callable;
import l.b.f;
import l.b.t;

public final class GoogleCampaignInfoApi {

    /* renamed from: a  reason: collision with root package name */
    public static final GoogleCampaignApi f110825a = ((GoogleCampaignApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(b.f59141e).create(GoogleCampaignApi.class));

    /* renamed from: b  reason: collision with root package name */
    public static final a f110826b = new a((byte) 0);

    public interface GoogleCampaignApi {
        static {
            Covode.recordClassIndex(71112);
        }

        @f(a = "/aweme/v1/activity/campaign/")
        i<b> querySettings(@t(a = "google_aid") String str);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71113);
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi$a$a  reason: collision with other inner class name */
        public static final class CallableC2830a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            public static final CallableC2830a f110827a = new CallableC2830a();

            static {
                Covode.recordClassIndex(71114);
            }

            CallableC2830a() {
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(d.a());
                GoogleCampaignApi googleCampaignApi = GoogleCampaignInfoApi.f110825a;
                l.b(advertisingIdInfo, "");
                String id = advertisingIdInfo.getId();
                l.b(id, "");
                return googleCampaignApi.querySettings(id).a(AnonymousClass1.f110828a, i.f4824a, null);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(71111);
    }
}
