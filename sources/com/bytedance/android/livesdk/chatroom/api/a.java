package com.bytedance.android.livesdk.chatroom.api;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(8284);
    }

    public static void a(long j2, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("time", Long.valueOf(j2));
        c.a("ttlive_live_end_audience_query", i2, hashMap);
    }

    public static void a(final Handler handler, long j2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        ((EndPageRecommendRetrofitApi) e.a().a(EndPageRecommendRetrofitApi.class)).getLive(j2).a(new f()).a(new f.a.d.f<com.bytedance.android.live.network.response.a<Room, com.bytedance.android.live.base.model.c.a>>() {
            /* class com.bytedance.android.livesdk.chatroom.api.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8285);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(com.bytedance.android.live.network.response.a<Room, com.bytedance.android.live.base.model.c.a> aVar) {
                com.bytedance.android.live.network.response.a<Room, com.bytedance.android.live.base.model.c.a> aVar2 = aVar;
                SystemClock.elapsedRealtime();
                a.a(elapsedRealtime, 0);
                Handler handler = handler;
                if (handler != null) {
                    Message obtainMessage = handler.obtainMessage(22);
                    obtainMessage.obj = aVar2.f12145b;
                    try {
                        for (Room room : (List) obtainMessage.obj) {
                            room.setRequestId(((com.bytedance.android.live.base.model.c.a) aVar2.f12146c).f7383f);
                            room.setLog_pb(((com.bytedance.android.live.base.model.c.a) aVar2.f12146c).a().toString());
                        }
                    } catch (Exception unused) {
                    }
                    handler.sendMessage(obtainMessage);
                }
            }
        }, new f.a.d.f<Throwable>() {
            /* class com.bytedance.android.livesdk.chatroom.api.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(8286);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(Throwable th) {
                SystemClock.elapsedRealtime();
                a.a(elapsedRealtime, 1);
                Handler handler = handler;
                if (handler != null) {
                    Message obtainMessage = handler.obtainMessage(22);
                    obtainMessage.obj = th;
                    handler.sendMessage(obtainMessage);
                }
            }
        });
    }
}
