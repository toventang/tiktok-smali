package com.bytedance.android.livesdk.chatroom.interaction;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.k;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.d.f;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final DataChannel f15669a;

    final /* synthetic */ class a implements f {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ b f15670a;

        static {
            Covode.recordClassIndex(8655);
        }

        a(b bVar) {
            this.f15670a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            l.b(this.f15670a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(8653);
    }

    public final void onEvent(k kVar) {
        User user = (User) this.f15669a.b(dn.class);
        if (user != null) {
            user.setPayScores(user.getPayScores() + ((long) kVar.f17200a));
            user.setNeverRecharge(false);
            this.f15669a.b(dn.class, user);
        }
    }

    public g(Fragment fragment, DataChannel dataChannel) {
        l.d(fragment, "");
        l.d(dataChannel, "");
        this.f15669a = dataChannel;
        com.bytedance.android.livesdk.an.a.a().a(fragment, k.class, dataChannel).a(new a(new b<k, z>(this) {
            /* class com.bytedance.android.livesdk.chatroom.interaction.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8654);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(k kVar) {
                k kVar2 = kVar;
                l.d(kVar2, "");
                ((g) this.receiver).onEvent(kVar2);
                return z.f158842a;
            }
        }));
    }
}
