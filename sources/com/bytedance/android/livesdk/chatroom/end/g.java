package com.bytedance.android.livesdk.chatroom.end;

import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.at.d;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.z;
import java.util.HashMap;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f15443a = new f.a.b.a();

    public interface a {
        static {
            Covode.recordClassIndex(8530);
        }

        void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar);

        void a(Throwable th);
    }

    static {
        Covode.recordClassIndex(8528);
    }

    public final void a(long j2, Room room, String str, final a aVar) {
        boolean z;
        String str2;
        String str3;
        if (room != null) {
            String str4 = "live_over";
            u.a().b().a(((d.a) new d.b().a(j2)).a(room.getRequestId()).b("live_detail").c(str4).b(0).d(room.getLabels()).c()).b(new z<com.bytedance.android.livesdkapi.depend.model.b.a>() {
                /* class com.bytedance.android.livesdk.chatroom.end.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(8529);
                }

                @Override // f.a.z
                public final void onComplete() {
                }

                @Override // f.a.z
                public final void onError(Throwable th) {
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.a(th);
                    }
                }

                @Override // f.a.z
                public final void onSubscribe(b bVar) {
                    g.this.f15443a.a(bVar);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.z
                public final /* synthetic */ void onNext(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
                    com.bytedance.android.livesdkapi.depend.model.b.a aVar2 = aVar;
                    a aVar3 = aVar;
                    if (aVar3 != null) {
                        aVar3.a(aVar2);
                    }
                }
            });
            if (room.getOwner() == null || room.getOwner().getId() != j2) {
                z = false;
            } else {
                z = true;
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("growth_deepevent", "1");
                if (!m.a(com.bytedance.android.livesdk.chatroom.d.a().e())) {
                    hashMap.put("enter_live_method", com.bytedance.android.livesdk.chatroom.d.a().e());
                }
                String g2 = e.g();
                if (TextUtils.isEmpty(g2) || !"click_push_live_cd_user".equals(g2)) {
                    hashMap.put("is_subscribe", "0");
                } else {
                    hashMap.put("is_subscribe", "1");
                }
                if (!z) {
                    str4 = "live_anchor_c_audience";
                }
                if (str == null || (!str.contains("carousel_audience_c") && !str.contains("loyal_audience_c"))) {
                    str = str4;
                }
                if (y.f()) {
                    str2 = "portrait";
                } else {
                    str2 = "landscape";
                }
                hashMap.put("room_orientation", str2);
                if (!(room.getOwner() == null || room.getOwner().getFollowInfo() == null)) {
                    int followStatus = (int) room.getOwner().getFollowInfo().getFollowStatus();
                    if (followStatus == 1 || followStatus == 3) {
                        str3 = "mutual";
                    } else {
                        str3 = "single";
                    }
                    hashMap.put("follow_type", str3);
                }
                b.a.a("follow").a((Map<String, String>) hashMap).a(new com.bytedance.android.livesdk.ab.c.e(str, j2)).b("live_interact").c("core").d("live_detail").a().b();
            } catch (Exception unused) {
            }
        }
    }
}
