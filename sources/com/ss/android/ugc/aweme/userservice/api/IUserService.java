package com.ss.android.ugc.aweme.userservice.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.a.c;
import com.bytedance.jedi.a.c.f;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.ab;
import f.a.t;
import java.util.Map;

public interface IUserService {
    static {
        Covode.recordClassIndex(93163);
    }

    c<String, User> a();

    FollowStatus a(String str, int i2, String str2);

    FollowStatus a(String str, String str2, int i2, int i3, int i4, String str3, int i5, String str4, Map<String, String> map);

    ab<FollowStatus> a(String str, String str2, int i2, int i3, int i4, String str3, int i5);

    t<f<User>> a(String str);

    t<BaseResponse> a(String str, String str2);

    com.ss.android.ugc.aweme.arch.widgets.base.c<FollowStatus> b();

    com.ss.android.ugc.aweme.arch.widgets.base.c<BlockStatus> c();
}
