package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.Collections;
import java.util.List;

public final class af extends a {
    @c(a = "delete_msg_ids")

    /* renamed from: a  reason: collision with root package name */
    public List<Long> f19128a;
    @c(a = "delete_user_ids")

    /* renamed from: f  reason: collision with root package name */
    public List<Long> f19129f;

    static {
        Covode.recordClassIndex(11396);
    }

    public af() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.IM_DELETE;
        List<Long> emptyList = Collections.emptyList();
        l.b(emptyList, "");
        this.f19128a = emptyList;
        List<Long> emptyList2 = Collections.emptyList();
        l.b(emptyList2, "");
        this.f19129f = emptyList2;
    }
}
