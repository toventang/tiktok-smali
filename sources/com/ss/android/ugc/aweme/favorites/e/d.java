package com.ss.android.ugc.aweme.favorites.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public final class d extends BaseResponse {
    @c(a = "questions")

    /* renamed from: a  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.question.c> f90606a;
    @c(a = "cursor")

    /* renamed from: b  reason: collision with root package name */
    public int f90607b;
    @c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public int f90608c;
    @c(a = "invalid_count")

    /* renamed from: d  reason: collision with root package name */
    public int f90609d;

    static {
        Covode.recordClassIndex(56915);
    }

    public final boolean a() {
        if (this.f90608c == 1) {
            return true;
        }
        return false;
    }

    public final void a(boolean z) {
        this.f90608c = z ? 1 : 0;
    }
}
