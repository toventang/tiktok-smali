package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;

public interface JourneyApi {

    public static final class a {
        static {
            Covode.recordClassIndex(67199);
        }
    }

    static {
        Covode.recordClassIndex(67198);
    }

    @f(a = "/aweme/v1/config/list/")
    t<o> getJourney(@l.b.t(a = "recommend_group") Integer num, @l.b.t(a = "type") String str, @l.b.t(a = "gender_selection_ab") String str2);

    @o(a = "tiktok/v1/gender/selection/")
    @e
    t<BaseResponse> uploadGender(@c(a = "gender_selection") int i2);

    @o(a = "aweme/v1/user/interest/select/")
    @e
    t<BaseResponse> uploadInterest(@c(a = "selectedInterestList") String str, @c(a = "type") String str2);
}
