package com.ss.android.ugc.aweme.upvote.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.ss.android.ugc.aweme.upvote.c.c;
import com.ss.android.ugc.aweme.upvote.c.g;
import com.ss.android.ugc.aweme.utils.dg;
import f.a.ab;
import h.f.b.l;
import java.util.List;

public final class f implements com.bytedance.assem.arch.a.a<e> {

    /* renamed from: a  reason: collision with root package name */
    public final e f142304a = new a();

    static {
        Covode.recordClassIndex(93076);
    }

    public static final class a implements e {
        static {
            Covode.recordClassIndex(93077);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.upvote.publish.e
        public final ab<BaseResponse> a(String str) {
            l.d(str, "");
            return UpvoteApi.f142023a.deleteUpvote(str);
        }

        @Override // com.ss.android.ugc.aweme.upvote.publish.e
        public final ab<c> a(List<String> list) {
            l.d(list, "");
            UpvoteApi upvoteApi = UpvoteApi.f142023a;
            String b2 = dg.a().b(list);
            l.b(b2, "");
            return upvoteApi.publishUpvoteBatch(b2);
        }

        @Override // com.ss.android.ugc.aweme.upvote.publish.e
        public final ab<g> a(String str, String str2) {
            l.d(str, "");
            return UpvoteApi.f142023a.publishUpvote(str, str2, null);
        }

        @Override // com.ss.android.ugc.aweme.upvote.publish.e
        public final ab<g> b(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            return UpvoteApi.f142023a.publishUpvote(str, str2, true);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ e a() {
        return this.f142304a;
    }
}
