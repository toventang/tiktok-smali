package com.bytedance.android.livesdk.util.rxutils.autodispose.a;

import android.view.View;
import com.bytedance.android.livesdk.util.rxutils.autodispose.ab;
import com.bytedance.covode.number.Covode;
import f.a.f;
import java.util.Objects;

public final class c implements ab {

    /* renamed from: a  reason: collision with root package name */
    private final View f22141a;

    static {
        Covode.recordClassIndex(13044);
    }

    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.ab
    public final f c() {
        return new b(this.f22141a);
    }

    private c(View view) {
        this.f22141a = view;
    }

    public static ab a(View view) {
        Objects.requireNonNull(view, "view == null");
        return new c(view);
    }
}
