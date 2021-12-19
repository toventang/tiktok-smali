package com.ss.android.ugc.aweme.emoji.b;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.utils.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public abstract class e extends k.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f89108a;

    /* renamed from: b  reason: collision with root package name */
    public final View f89109b;

    static {
        Covode.recordClassIndex(56038);
    }

    public e(ViewGroup viewGroup) {
        this(viewGroup, R.layout.z1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ e(android.view.ViewGroup r3, int r4) {
        /*
            r2 = this;
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 0
            android.view.View r1 = com.a.a(r1, r4, r3, r0)
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            r2.<init>(r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.b.e.<init>(android.view.ViewGroup, int):void");
    }

    private e(ViewGroup viewGroup, int i2, View view) {
        l.d(viewGroup, "");
        l.d(view, "");
        this.f89108a = i2;
        this.f89109b = view;
    }
}
