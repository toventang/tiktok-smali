package com.bytedance.android.livesdk.chatroom.interaction;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.model.d;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.ap;
import com.bytedance.android.livesdk.j.cy;
import com.bytedance.android.livesdk.j.dr;
import com.bytedance.android.livesdk.j.ds;
import com.bytedance.android.livesdk.j.dt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f15671c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Handler.Callback f15672a;

    /* renamed from: b  reason: collision with root package name */
    public final DataChannel f15673b;

    /* renamed from: d  reason: collision with root package name */
    private Handler f15674d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.android.livesdk.ui.a f15675e;

    static {
        Covode.recordClassIndex(8656);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8658);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        this.f15674d.removeMessages(100);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(8660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            bool.booleanValue();
            this.this$0.a();
            return z.f158842a;
        }
    }

    static final class b implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f15676a;

        static {
            Covode.recordClassIndex(8659);
        }

        b(h hVar) {
            this.f15676a = hVar;
        }

        public final boolean handleMessage(Message message) {
            String str;
            l.d(message, "");
            if (message.obj instanceof com.bytedance.android.live.a.a.b.a) {
                DataChannel dataChannel = this.f15676a.f15673b;
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.live.api.exceptions.server.ApiServerException");
                dataChannel.c(cy.class, obj);
                return false;
            } else if (message.what != 100) {
                return false;
            } else {
                h hVar = this.f15676a;
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.LiveEffect");
                com.bytedance.android.livesdkapi.depend.model.a aVar = (com.bytedance.android.livesdkapi.depend.model.a) obj2;
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("live_take_sticker_effective_use").a(hVar.f15673b).b("live_take").c("click").d("live_take_detail").a("sticker_id", String.valueOf(aVar.f22995a));
                if (aVar.w) {
                    str = "1";
                } else {
                    str = "0";
                }
                a2.a("is_video_sticker", str).b();
                this.f15676a.f15673b.a(ap.class, (Object) true);
                return false;
            }
        }
    }

    public final void onEvent(d dVar) {
        String str;
        String str2;
        User owner;
        if (this.f15675e.isViewValid() && dVar.f7545a != null && !l.a((Object) "", (Object) dVar.f7545a.f22996b)) {
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            d dVar2 = (d) DataChannelGlobal.f34575d.b(dt.class);
            DataChannelGlobal.f34575d.c(dt.class);
            com.bytedance.android.livesdk.ab.b c2 = b.a.a("live_take_sticker_select").a(this.f15673b).b("live_take").c("click");
            if (room == null || (owner = room.getOwner()) == null) {
                str = null;
            } else {
                str = owner.getIdStr();
            }
            com.bytedance.android.livesdk.ab.b a2 = c2.g(str).a("sticker_id", dVar.f7545a.f22995a);
            if (dVar.f7545a.w) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            com.bytedance.android.livesdk.ab.b a3 = a2.a("is_video_sticker", str2).a("tab", dVar.f7547c);
            if (dVar2 == null || dVar2.f7545a.f22995a != dVar2.f7545a.f22995a) {
                a3.a("is_live_take_default", 0);
            } else {
                a3.a("is_live_take_default", 1);
            }
            a3.b();
            a();
            Handler handler = this.f15674d;
            handler.sendMessageDelayed(Message.obtain(handler, 100, dVar.f7545a), 30000);
            this.f15673b.a((androidx.lifecycle.m) this.f15675e, dr.class, (h.f.a.b) new c(this));
        }
    }

    public h(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel) {
        l.d(aVar, "");
        l.d(dataChannel, "");
        this.f15675e = aVar;
        this.f15673b = dataChannel;
        b bVar = new b(this);
        this.f15672a = bVar;
        this.f15674d = new Handler(bVar);
        dataChannel.a((androidx.lifecycle.m) aVar, ds.class, (h.f.a.b) new h.f.a.b<d, z>(this) {
            /* class com.bytedance.android.livesdk.chatroom.interaction.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8657);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(d dVar) {
                d dVar2 = dVar;
                l.d(dVar2, "");
                ((h) this.receiver).onEvent(dVar2);
                return z.f158842a;
            }
        });
        Object b2 = DataChannelGlobal.f34575d.b(dt.class);
        if (b2 != null) {
            dataChannel.c(ds.class, b2);
        }
    }
}
