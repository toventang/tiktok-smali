package com.bytedance.android.livesdk.u;

import com.bytedance.android.live.liveinteract.api.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21751a = new a();

    /* renamed from: com.bytedance.android.livesdk.u.a$a  reason: collision with other inner class name */
    public enum EnumC0481a {
        NORMAL_VIDEO("normal_video_live"),
        LINE_UP("video_anchor_order"),
        LINK_MIC_ANCHOR("video_anchor_connect"),
        LINK_MIC_PK("video_anchor_pk"),
        LINK_MIC_GUEST("video_anchor_guest_connect");
        
        private final String desc;

        public final String getDesc() {
            return this.desc;
        }

        static {
            Covode.recordClassIndex(12823);
        }

        private EnumC0481a(String str) {
            this.desc = str;
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(12822);
    }

    public static EnumC0481a b() {
        if (c()) {
            return EnumC0481a.LINE_UP;
        }
        return d();
    }

    private static boolean c() {
        return ((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoomForCurrentRoom();
    }

    public static long a() {
        f b2 = u.a().b();
        l.b(b2, "");
        return b2.c();
    }

    private static EnumC0481a d() {
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(b.class);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.api.IInteractService");
        b bVar = (b) a2;
        if (bVar.isBattling()) {
            return EnumC0481a.LINK_MIC_PK;
        }
        if (bVar.getLinkedGuestNum() > 0) {
            return EnumC0481a.LINK_MIC_GUEST;
        }
        if (bVar.isInCoHost()) {
            return EnumC0481a.LINK_MIC_ANCHOR;
        }
        return EnumC0481a.NORMAL_VIDEO;
    }
}
