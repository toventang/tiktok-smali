package com.bytedance.android.livesdk.qa;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;

public interface QAApi {
    static {
        Covode.recordClassIndex(11974);
    }

    @t(a = "/webcast/interaction/question/delete/")
    f.a.t<d> deleteQuestion(@z(a = "question_id") long j2);

    @t(a = "/webcast/interaction/question/answer/end/")
    f.a.t<d> endAnswer(@z(a = "room_id") long j2, @z(a = "question_id") long j3);

    @t(a = "/webcast/interaction/question/like/")
    f.a.t<d> likeQuestion(@z(a = "question_id") long j2, @z(a = "like") int i2, @z(a = "from") int i3);

    @t(a = "/webcast/interaction/question/list/")
    f.a.t<d<ai>> queryQuestion(@z(a = "room_id") long j2, @z(a = "unanswered_list_page_num") long j3, @z(a = "answered_list_page_num") long j4, @z(a = "from") int i2);

    @t(a = "/webcast/interaction/question/answer/start/")
    f.a.t<d> startAnswer(@z(a = "room_id") long j2, @z(a = "question_id") long j3);

    @t(a = "/webcast/interaction/question/submit/")
    @g
    f.a.t<d> submitQuestion(@e(a = "room_id") long j2, @e(a = "content") String str, @e(a = "from") int i2, @e(a = "post_anyway") int i3);

    @t(a = "/webcast/interaction/question/switch/")
    f.a.t<d> switchOn(@z(a = "turn_on") long j2);
}
