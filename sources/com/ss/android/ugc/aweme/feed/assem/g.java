package com.ss.android.ugc.aweme.feed.assem;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.adapter.ag;
import com.ss.android.ugc.aweme.feed.adapter.ap;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, ap<VideoBaseCell, VideoItemParams>> f92253a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final ag f92254b;

    static {
        Covode.recordClassIndex(58242);
    }

    public static final class b extends m implements h.f.a.a<Integer> {
        final /* synthetic */ z.e $aid;
        final /* synthetic */ int $position;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(58244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(g gVar, z.e eVar, int i2) {
            super(0);
            this.this$0 = gVar;
            this.$aid = eVar;
            this.$position = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(a());
        }

        private int a() {
            try {
                List<Aweme> e2 = this.this$0.f92254b.e();
                if (e2 == null) {
                    return -1;
                }
                int i2 = 0;
                for (Aweme aweme : e2) {
                    if (l.a((Object) com.ss.android.ugc.aweme.feed.x.l.a(aweme), (Object) this.$aid.element)) {
                        return i2;
                    }
                    i2++;
                }
                return -1;
            } catch (Exception unused) {
                return this.$position;
            }
        }
    }

    public static final class a extends m implements h.f.a.b<VideoItemParams, h.z> {
        final /* synthetic */ ap $innerProxy;
        final /* synthetic */ int $position;

        static {
            Covode.recordClassIndex(58243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ap apVar, int i2) {
            super(1);
            this.$innerProxy = apVar;
            this.$position = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(VideoItemParams videoItemParams) {
            l.d(videoItemParams, "");
            ap apVar = this.$innerProxy;
            int i2 = this.$position;
            com.bytedance.tiktok.proxy.b<R, ITEM> bVar = apVar.f91597b;
            if (bVar != null) {
                bVar.a(i2, videoItemParams);
            }
            return h.z.f158842a;
        }
    }

    public g(ag agVar) {
        l.d(agVar, "");
        this.f92254b = agVar;
    }
}
