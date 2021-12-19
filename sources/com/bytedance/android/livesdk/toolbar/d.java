package com.bytedance.android.livesdk.toolbar;

import com.bytedance.android.livesdk.chatroom.c.j;
import com.bytedance.android.livesdk.gift.model.h;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.d.f;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public DataChannel f21695a;

    /* renamed from: b  reason: collision with root package name */
    public a f21696b;

    /* renamed from: c  reason: collision with root package name */
    public f.a.b.a f21697c;

    public interface a {
        static {
            Covode.recordClassIndex(12794);
        }

        void a(h hVar);
    }

    static {
        Covode.recordClassIndex(12793);
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f21698a;

        static {
            Covode.recordClassIndex(12795);
        }

        b(d dVar) {
            this.f21698a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            DataChannel dataChannel;
            Room room;
            a aVar;
            j jVar = (j) obj;
            if (jVar != null && (dataChannel = this.f21698a.f21695a) != null && (room = (Room) dataChannel.b(df.class)) != null && room.getId() == jVar.f15124a && (aVar = this.f21698a.f21696b) != null) {
                aVar.a(jVar.f15125b);
            }
        }
    }

    public d(DataChannel dataChannel) {
        l.d(dataChannel, "");
        this.f21695a = dataChannel;
        f.a.b.a aVar = new f.a.b.a();
        this.f21697c = aVar;
        aVar.a(com.bytedance.android.livesdk.an.a.a().a(j.class).d(new b(this)));
    }
}
