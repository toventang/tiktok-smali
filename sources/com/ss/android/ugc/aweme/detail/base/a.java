package com.ss.android.ugc.aweme.detail.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.detail.a.b;
import com.ss.android.ugc.aweme.g.a.g;
import com.ss.android.ugc.aweme.v.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public RemoteImageView f79613a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f79614b;

    /* renamed from: c  reason: collision with root package name */
    private final int f79615c;

    static {
        Covode.recordClassIndex(49458);
    }

    @Override // com.ss.android.ugc.aweme.v.a.c
    public final void b(RelativeLayout relativeLayout) {
        l.d(relativeLayout, "");
    }

    @Override // com.ss.android.ugc.aweme.v.a.c
    public final g a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        return new b(this.f79614b, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.v.a.c
    public final void a(RelativeLayout relativeLayout) {
        MethodCollector.i(11632);
        l.d(relativeLayout, "");
        View a2 = com.a.a(LayoutInflater.from(this.f79614b), R.layout.w0, relativeLayout, false);
        RemoteImageView remoteImageView = (RemoteImageView) a2.findViewById(R.id.e9z);
        this.f79613a = remoteImageView;
        e.a(remoteImageView, this.f79615c);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(c.a(96), c.a(96));
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        layoutParams.bottomMargin = c.a(8);
        relativeLayout.addView(a2, layoutParams);
        MethodCollector.o(11632);
    }

    public a(Context context, int i2) {
        l.d(context, "");
        this.f79614b = context;
        this.f79615c = i2;
    }
}
