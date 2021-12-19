package com.ss.android.ugc.aweme.comment.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public a f73043a;

    /* renamed from: b  reason: collision with root package name */
    private final View f73044b;

    public interface a {
        static {
            Covode.recordClassIndex(44987);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(44986);
    }

    public d(View view) {
        l.d(view, "");
        this.f73044b = view;
    }

    public final void a(int i2) {
        this.f73044b.setVisibility(i2);
        a aVar = this.f73043a;
        if (aVar != null) {
            aVar.a(i2);
        }
    }
}
