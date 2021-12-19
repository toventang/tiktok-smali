package com.bytedance.android.livesdk.actionhandler;

import com.bytedance.android.live.network.a.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.report.ReportCommitData;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;

interface ActionHandlerApi {
    static {
        Covode.recordClassIndex(7546);
    }

    @h(a = "/webcast/room/info/")
    @a(a = a.EnumC0254a.ROOM)
    b<d<Room>> getRoomStats(@z(a = "is_anchor") boolean z, @z(a = "room_id") long j2, @z(a = "pack_level") int i2);

    @g
    @a(a = a.EnumC0254a.REPORT)
    @t(a = "/webcast/user/report/commit/")
    f.a.t<d<ReportCommitData>> postReportReasons(@e(a = "target_room_id") long j2, @e(a = "target_anchor_id") long j3, @e(a = "reason") long j4, @e(a = "report_record_extra") String str);
}
