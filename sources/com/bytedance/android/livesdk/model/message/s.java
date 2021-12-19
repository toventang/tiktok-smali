package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class s extends a {
    @c(a = "emote_list")

    /* renamed from: a  reason: collision with root package name */
    public List<EmoteModel> f19686a;
    @c(a = "user")

    /* renamed from: f  reason: collision with root package name */
    public User f19687f;

    static {
        Covode.recordClassIndex(11696);
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        return false;
    }

    public s() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.EMOTE_CHAT;
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        List<EmoteModel> list;
        if (this.f19687f == null || (list = this.f19686a) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
