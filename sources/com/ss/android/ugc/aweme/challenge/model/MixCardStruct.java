package com.ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.g;
import java.io.Serializable;

public final class MixCardStruct implements Serializable {
    public static final Companion Companion = new Companion(null);
    @c(a = "aweme_info")
    private Aweme aweme;
    @c(a = "room_info")
    private RoomStructV2 roomInfo;
    @c(a = StringSet.type)
    private int type;

    static {
        Covode.recordClassIndex(43164);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(43165);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final RoomStructV2 getRoomInfo() {
        return this.roomInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isLive() {
        if (this.roomInfo != null) {
            return true;
        }
        return false;
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setRoomInfo(RoomStructV2 roomStructV2) {
        this.roomInfo = roomStructV2;
    }

    public final void setType(int i2) {
        this.type = i2;
    }
}
