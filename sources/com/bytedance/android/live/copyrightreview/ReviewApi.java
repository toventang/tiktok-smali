package com.bytedance.android.live.copyrightreview;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.model.message.ba;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface ReviewApi {
    static {
        Covode.recordClassIndex(4519);
    }

    @h(a = "/webcast/review/notification_confirm")
    t<d<ba>> confirmCopyright(@z(a = "room_id") long j2, @z(a = "confirm_type") int i2, @z(a = "confirm_value") int i3);

    @h(a = "/webcast/review/notify_of_confirm_copyright/")
    t<d<Void>> notifyOfConfirmCopyright(@z(a = "room_id") long j2);
}
