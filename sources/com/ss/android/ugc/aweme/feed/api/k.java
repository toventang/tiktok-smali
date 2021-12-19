package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class k implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private transient SlimRoom f91947a;
    private LogPbBean logPbBean;
    @c(a = "is_show_blue_point")
    private boolean showBluePoint;
    @c(a = "user")
    private final User user;

    static {
        Covode.recordClassIndex(57900);
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public final boolean getShowBluePoint() {
        return this.showBluePoint;
    }

    public final SlimRoom getSlimRoom() {
        return this.f91947a;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setLogPbBean(LogPbBean logPbBean2) {
        this.logPbBean = logPbBean2;
    }

    public final void setShowBluePoint(boolean z) {
        this.showBluePoint = z;
    }

    public final void setSlimRoom(SlimRoom slimRoom) {
        this.f91947a = slimRoom;
    }

    public k(User user2, boolean z, LogPbBean logPbBean2) {
        l.d(user2, "");
        this.user = user2;
        this.showBluePoint = z;
        this.logPbBean = logPbBean2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(User user2, boolean z, LogPbBean logPbBean2, int i2, g gVar) {
        this(user2, z, (i2 & 4) != 0 ? null : logPbBean2);
    }
}
