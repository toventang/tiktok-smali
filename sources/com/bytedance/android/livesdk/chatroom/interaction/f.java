package com.bytedance.android.livesdk.chatroom.interaction;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.c.x;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.model.message.ce;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final DataChannel f15667a;

    final /* synthetic */ class a implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ b f15668a;

        static {
            Covode.recordClassIndex(8652);
        }

        a(b bVar) {
            this.f15668a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            l.b(this.f15668a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(8650);
    }

    public final void onEvent(x xVar) {
        Room room;
        User user;
        l.d(xVar, "");
        if (xVar.f15168a != null && (room = (Room) this.f15667a.b(df.class)) != null && (user = (User) this.f15667a.b(dn.class)) != null) {
            ShareReportResult shareReportResult = xVar.f15168a;
            l.b(shareReportResult, "");
            if (shareReportResult.getDeltaIntimacy() > 0) {
                long id = room.getId();
                ShareReportResult shareReportResult2 = xVar.f15168a;
                l.b(shareReportResult2, "");
                ce a2 = com.bytedance.android.livesdk.chatroom.b.b.a(id, shareReportResult2.getDisplayText(), user);
                IMessageManager iMessageManager = (IMessageManager) this.f15667a.b(cg.class);
                if (iMessageManager != null) {
                    iMessageManager.insertMessage(a2, true);
                }
            }
        }
    }

    public f(Fragment fragment, DataChannel dataChannel) {
        l.d(fragment, "");
        l.d(dataChannel, "");
        this.f15667a = dataChannel;
        com.bytedance.android.livesdk.an.a.a().a(fragment, x.class, dataChannel).a(new a(new b<x, z>(this) {
            /* class com.bytedance.android.livesdk.chatroom.interaction.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8651);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(x xVar) {
                x xVar2 = xVar;
                l.d(xVar2, "");
                ((f) this.receiver).onEvent(xVar2);
                return z.f158842a;
            }
        }));
    }
}
