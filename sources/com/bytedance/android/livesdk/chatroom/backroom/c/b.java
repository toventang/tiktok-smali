package com.bytedance.android.livesdk.chatroom.backroom.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.backroom.RoomBackProgressView;
import com.bytedance.android.livesdk.chatroom.backroom.c.a;
import com.bytedance.android.livesdk.event.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.j;
import h.f.b.l;
import h.z;

public final class b implements a.AbstractC0321a {

    /* renamed from: a  reason: collision with root package name */
    public EnterRoomConfig f15013a;

    /* renamed from: b  reason: collision with root package name */
    public HSImageView f15014b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15015c;

    /* renamed from: d  reason: collision with root package name */
    public EnterRoomConfig f15016d;

    /* renamed from: e  reason: collision with root package name */
    public Context f15017e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f15018f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15019g;

    /* renamed from: h  reason: collision with root package name */
    private RoomBackProgressView f15020h;

    /* renamed from: i  reason: collision with root package name */
    private final i f15021i;

    public final /* synthetic */ class c implements f {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f15023a;

        static {
            Covode.recordClassIndex(8344);
        }

        public c(h.f.a.b bVar) {
            this.f15023a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            l.b(this.f15023a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(8341);
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.c.a.AbstractC0321a
    public final void a() {
        ViewGroup viewGroup = this.f15018f;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f15022a;

        static {
            Covode.recordClassIndex(8342);
        }

        public a(b bVar) {
            this.f15022a = bVar;
        }

        public final void onClick(View view) {
            this.f15022a.a("click");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.c.b$b  reason: collision with other inner class name */
    public static final /* synthetic */ class C0322b extends j implements h.f.a.b<com.bytedance.android.livesdk.chatroom.backroom.a.a, z> {
        static {
            Covode.recordClassIndex(8343);
        }

        public C0322b(b bVar) {
            super(1, bVar, b.class, "onEvent", "onEvent(Lcom/bytedance/android/livesdk/chatroom/backroom/event/RoomFetchEvent;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdk.chatroom.backroom.a.a aVar) {
            ((b) this.receiver).onEvent(aVar);
            return z.f158842a;
        }
    }

    public final void a(int i2) {
        if (this.f15013a != null) {
            if (i2 == 1) {
                a(false);
            } else {
                a(true);
            }
        }
    }

    public final void b(int i2) {
        if (this.f15013a == null) {
            n.a(this.f15018f, 8);
        } else if (this.f15019g) {
            n.a(this.f15018f, 8);
        } else {
            n.a(this.f15018f, i2);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.c.a.AbstractC0321a
    public final void a(float f2) {
        b(0);
        RoomBackProgressView roomBackProgressView = this.f15020h;
        if (roomBackProgressView != null) {
            roomBackProgressView.setProgress(f2);
        }
        com.bytedance.android.live.core.c.a.a(4, "RoomFragmentBackRoomView", "animation progress: " + f2 + ' ');
    }

    public final void a(boolean z) {
        this.f15019g = z;
        if (z) {
            b(8);
        } else if (a.b() && com.bytedance.android.livesdk.chatroom.backroom.d.a.b()) {
            b(0);
        }
    }

    public final void onEvent(com.bytedance.android.livesdk.chatroom.backroom.a.a aVar) {
        Room room;
        long j2;
        String str;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        if (aVar != null) {
            if (this.f15015c) {
                this.f15015c = false;
                if (!(this.f15013a == null || aVar.f14999a == null || (room = aVar.f14999a) == null || room.author() == null)) {
                    com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_return_show").a().a("layer_level", com.bytedance.android.livesdk.chatroom.backroom.b.f15002a.a(com.bytedance.android.live.core.f.a.a(this.f15017e)).c());
                    EnterRoomConfig enterRoomConfig = this.f15013a;
                    if (enterRoomConfig == null || (roomsData2 = enterRoomConfig.f23299c) == null) {
                        j2 = 0;
                    } else {
                        j2 = roomsData2.R;
                    }
                    com.bytedance.android.livesdk.ab.b a3 = a2.a("to_room_id", j2);
                    EnterRoomConfig enterRoomConfig2 = this.f15013a;
                    if (enterRoomConfig2 == null || (roomsData = enterRoomConfig2.f23299c) == null || (str = roomsData.D) == null) {
                        str = "0";
                    }
                    a3.a("to_anchor_id", str).b();
                }
            }
            a(false);
        }
    }

    public final boolean a(String str) {
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig.RoomsData roomsData3;
        EnterRoomConfig.RoomsData roomsData4;
        boolean z;
        EnterRoomConfig.RoomsData roomsData5;
        if (this.f15013a == null) {
            return false;
        }
        com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
        l.b(fVar, "");
        EnterRoomLinkSession a2 = fVar.a();
        l.b(a2, "");
        EnterRoomConfig enterRoomConfig = a2.f23354b;
        if (enterRoomConfig == null) {
            enterRoomConfig = null;
        }
        long j2 = 0;
        if (!(enterRoomConfig == null || (roomsData4 = enterRoomConfig.f23299c) == null || !roomsData4.ag)) {
            long j3 = enterRoomConfig.f23299c.aj;
            if (j3 > 0) {
                EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
                enterRoomConfig2.f23299c.R = j3;
                enterRoomConfig2.f23299c.J = enterRoomConfig.f23299c.J;
                enterRoomConfig2.f23299c.L = enterRoomConfig.f23299c.L;
                enterRoomConfig2.f23299c.ak = false;
                EnterRoomConfig.RoomsData roomsData6 = enterRoomConfig2.f23299c;
                EnterRoomConfig enterRoomConfig3 = this.f15013a;
                if (enterRoomConfig3 == null || (roomsData5 = enterRoomConfig3.f23299c) == null) {
                    z = false;
                } else {
                    z = roomsData5.ag;
                }
                roomsData6.ag = z;
                this.f15013a = enterRoomConfig2;
                EnterRoomLinkSession.a(enterRoomConfig2).a(new Event("mic_room_jump_event", 1033, com.bytedance.android.livesdkapi.session.b.MessageReceived).a("roomid:" + j3 + " autojump: false"));
                b.a.a("livesdk_line_up_list_click_return").a().b();
            }
        }
        EnterRoomConfig enterRoomConfig4 = this.f15013a;
        if (!(enterRoomConfig4 == null || (roomsData3 = enterRoomConfig4.f23299c) == null)) {
            j2 = roomsData3.R;
        }
        EnterRoomConfig enterRoomConfig5 = this.f15013a;
        if (!(enterRoomConfig5 == null || (roomsData2 = enterRoomConfig5.f23299c) == null)) {
            roomsData2.ax = str;
        }
        EnterRoomConfig enterRoomConfig6 = this.f15013a;
        if (!(enterRoomConfig6 == null || (roomsData = enterRoomConfig6.f23299c) == null)) {
            roomsData.M = "click";
        }
        com.bytedance.android.livesdk.an.a.a().a(new e(j2, this.f15013a, (byte) 0));
        return true;
    }

    public b(Context context, i iVar, ViewGroup viewGroup) {
        RoomBackProgressView roomBackProgressView;
        int i2;
        this.f15017e = context;
        this.f15021i = iVar;
        this.f15018f = viewGroup;
        HSImageView hSImageView = null;
        if (viewGroup != null) {
            roomBackProgressView = (RoomBackProgressView) viewGroup.findViewById(R.id.dpo);
        } else {
            roomBackProgressView = null;
        }
        this.f15020h = roomBackProgressView;
        this.f15014b = viewGroup != null ? (HSImageView) viewGroup.findViewById(R.id.dpm) : hSImageView;
        this.f15013a = com.bytedance.android.livesdk.chatroom.backroom.b.f15002a.a(com.bytedance.android.live.core.f.a.a(this.f15017e)).a();
        com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
        l.b(fVar, "");
        EnterRoomLinkSession a2 = fVar.a();
        l.b(a2, "");
        this.f15016d = a2.f23354b;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            if (!com.bytedance.android.live.uikit.c.a.a(this.f15017e)) {
                i2 = R.drawable.btp;
            } else {
                i2 = R.drawable.btq;
            }
            viewGroup.setBackgroundResource(i2);
        }
    }
}
