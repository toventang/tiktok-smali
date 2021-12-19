package com.bytedance.android.livesdk.model.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "update_user_setting_info")

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdk.chatroom.model.c.a f18937a;

    static {
        Covode.recordClassIndex(11294);
    }

    public a(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f18937a, ((a) obj).f18937a);
        }
        return true;
    }

    public final int hashCode() {
        com.bytedance.android.livesdk.chatroom.model.c.a aVar = this.f18937a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MultiLiveUpdateUserSettingContent(multiLiveAnchorPanelSettings=" + this.f18937a + ")";
    }

    private a() {
        this.f18937a = null;
    }

    private /* synthetic */ a(byte b2) {
        this();
    }
}
