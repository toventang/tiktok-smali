package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.model.bb;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.b;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.bytedance.retrofit2.mime.TypedOutput;
import f.a.ab;
import java.util.HashMap;

public interface UserApi {
    static {
        Covode.recordClassIndex(12995);
    }

    @h(a = "/webcast/user/attr/")
    ab<d<bb>> getUserAttr(@z(a = "attr_types") String str);

    @h(a = "/webcast/user/")
    ab<d<User>> queryUser(@z(a = "target_uid") long j2, @z(a = "packed_level") long j3, @z(a = "sec_target_uid") String str);

    @h(a = "/webcast/user/")
    ab<d<User>> queryUser(@aa HashMap<String, String> hashMap);

    @t(a = "/webcast/user/attr/update/")
    @g
    f.a.t<d<Object>> updateSwitch(@e(a = "attr_type") long j2, @e(a = "value") long j3);

    @t(a = "/webcast/room/upload/image/")
    ab<d<a>> uploadAvatar(@b TypedOutput typedOutput);
}
