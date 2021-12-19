package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15759a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15760b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15761c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15762d = true;

    /* renamed from: e  reason: collision with root package name */
    public String f15763e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15764f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15765g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15766h;

    /* renamed from: i  reason: collision with root package name */
    public final List<EmoteModel> f15767i = new ArrayList();

    static {
        Covode.recordClassIndex(8701);
    }

    public final void a(List<EmoteModel> list) {
        this.f15767i.clear();
        if (list != null && !list.isEmpty()) {
            this.f15767i.addAll(list);
        }
    }
}
