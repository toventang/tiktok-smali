package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;
import java.util.List;

public class ai extends a {
    @c(a = "total")

    /* renamed from: a  reason: collision with root package name */
    public int f19133a;
    @c(a = "count")

    /* renamed from: f  reason: collision with root package name */
    public int f19134f;
    @c(a = b.f37372a)

    /* renamed from: g  reason: collision with root package name */
    public int f19135g;
    @c(a = "user")

    /* renamed from: h  reason: collision with root package name */
    public User f19136h;
    @c(a = "icon")

    /* renamed from: i  reason: collision with root package name */
    public String f19137i;
    @c(a = "icons")

    /* renamed from: j  reason: collision with root package name */
    public List<ImageModel> f19138j;

    static {
        Covode.recordClassIndex(11399);
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        return true;
    }

    public ai() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.LIKE;
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        if (!this.f13611c) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.livesdk.ac.b.a
    public long getMessageId() {
        return super.getMessageId();
    }

    public ai(Boolean bool, User user) {
        this.f19136h = user;
        this.L = com.bytedance.android.livesdk.model.message.a.a.LIKE;
        this.f13611c = bool.booleanValue();
    }
}
