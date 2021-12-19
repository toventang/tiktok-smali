package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import f.a.t;
import l.b.f;

public interface RecommendUserDialogApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f96984a = a.f96985a;

    static {
        Covode.recordClassIndex(61627);
    }

    @f(a = "/tiktok/v1/fyp/user/recommendations/")
    t<RecommendUserDialogList> fetchRecommendUserDialogList(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "rec_impr_users") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f96985a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(61628);
        }
    }
}
