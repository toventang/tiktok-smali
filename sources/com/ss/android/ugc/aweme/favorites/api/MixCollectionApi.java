package com.ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import f.a.t;
import l.b.f;

public interface MixCollectionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f90437a = a.f90438a;

    static {
        Covode.recordClassIndex(56771);
    }

    @f(a = "/aweme/v1/mix/listcollection/")
    t<com.ss.android.ugc.aweme.favorites.b.a> getMixCollection(@l.b.t(a = "count") int i2, @l.b.t(a = "cursor") long j2, @l.b.t(a = "mix_ids") String str);

    @f(a = "/aweme/v1/mix/list/")
    t<com.ss.android.ugc.aweme.favorites.b.a> getProfileVideoMixList(@l.b.t(a = "user_id") String str, @l.b.t(a = "sec_user_id") String str2, @l.b.t(a = "count") int i2, @l.b.t(a = "cursor") long j2);

    @f(a = "/aweme/v1/mix/multi/details/")
    t<com.ss.android.ugc.aweme.favorites.b.a> getSearchMixCollection(@l.b.t(a = "mix_ids") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f90438a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(56772);
        }
    }
}
