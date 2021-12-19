package com.ss.android.ugc.aweme.challenge.recommend;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.challenge.recommend.a.b;
import com.ss.android.ugc.aweme.services.RetrofitService;
import h.a.n;
import h.f.b.l;
import java.util.Comparator;
import java.util.List;
import l.b.f;
import l.b.t;

public final class RecommendHashTagApi {

    /* renamed from: a  reason: collision with root package name */
    static final HashTagApi f69991a = ((HashTagApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(HashTagApi.class));

    /* renamed from: b  reason: collision with root package name */
    public static final RecommendHashTagApi f69992b = new RecommendHashTagApi();

    public interface HashTagApi {

        /* renamed from: a  reason: collision with root package name */
        public static final a f69993a = a.f69994a;

        static {
            Covode.recordClassIndex(43173);
        }

        @f(a = "/aweme/v1/challenge/history/intervene/")
        i<b> fetchRecommendHashTagsMT(@t(a = "zip_uri") String str, @t(a = "effect_ids") String str2, @t(a = "music_id") String str3, @t(a = "video_id") String str4);

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f69994a = new a();

            private a() {
            }

            static {
                Covode.recordClassIndex(43174);
            }
        }
    }

    private RecommendHashTagApi() {
    }

    static {
        Covode.recordClassIndex(43172);
    }

    /* access modifiers changed from: package-private */
    public static final class a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.t f69995a;

        static {
            Covode.recordClassIndex(43175);
        }

        a(androidx.lifecycle.t tVar) {
            this.f69995a = tVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            List<com.ss.android.ugc.aweme.challenge.recommend.a.a> list;
            l.b(iVar, "");
            if (!iVar.a()) {
                return null;
            }
            b bVar = (b) iVar.d();
            if (!(bVar == null || (list = bVar.f70006a) == null)) {
                n.a((List) list, (Comparator) AnonymousClass1.f69996a);
            }
            this.f69995a.setValue(iVar.d());
            return null;
        }
    }
}
