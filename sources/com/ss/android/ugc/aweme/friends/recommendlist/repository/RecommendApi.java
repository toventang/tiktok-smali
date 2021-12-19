package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.MutualUserList;
import f.a.t;
import l.b.f;

public interface RecommendApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f96982a = a.f96983a;

    static {
        Covode.recordClassIndex(61625);
    }

    @f(a = "/tiktok/v1/user/mutual/list/")
    t<MutualUserList> getMutualList(@l.b.t(a = "sec_uid") String str, @l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "mutual_type") Integer num3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f96983a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(61626);
        }
    }
}
