package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class bq extends a {
    @c(a = "sprint_type")

    /* renamed from: a  reason: collision with root package name */
    public int f19350a;
    @c(a = "notify_mode")

    /* renamed from: f  reason: collision with root package name */
    public int f19351f;
    @c(a = "prompt")

    /* renamed from: g  reason: collision with root package name */
    public bs f19352g;

    static {
        Covode.recordClassIndex(11487);
    }

    public bq() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.RANK_PROMPT_MESSAGE;
    }
}
