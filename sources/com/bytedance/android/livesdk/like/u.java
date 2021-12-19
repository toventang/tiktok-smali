package com.bytedance.android.livesdk.like;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.Collections;
import java.util.List;

public final class u {
    @c(a = "icons")

    /* renamed from: a  reason: collision with root package name */
    private List<ImageModel> f18356a;
    @c(a = "icons_self")

    /* renamed from: b  reason: collision with root package name */
    private List<ImageModel> f18357b;

    static {
        Covode.recordClassIndex(10336);
    }

    public final List<ImageModel> a() {
        List<ImageModel> list = this.f18356a;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public final List<ImageModel> b() {
        List<ImageModel> list = this.f18357b;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }
}
