package com.ss.android.ugc.aweme.feed.model.livesplash;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.utils.dx;
import java.util.List;

public final class LiveAwesomeData {
    @c(a = "gbc")
    public String gbc;
    @c(a = "hidden_psm_pi")
    public boolean hideView = true;
    @c(a = "psm_pi")
    public List<LiveShowMessage> psmPi;
    @b(a = dx.class)
    @c(a = "data")
    public String roomData;
    @c(a = "sec_uid")
    public String secUid;
    @c(a = "uid")
    public long uid;
    @c(a = "use_room_info")
    public boolean useRoomInfo = true;

    static {
        Covode.recordClassIndex(59517);
    }
}
