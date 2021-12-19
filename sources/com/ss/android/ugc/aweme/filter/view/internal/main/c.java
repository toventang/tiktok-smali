package com.ss.android.ugc.aweme.filter.view.internal.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.filter.view.a.i;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;

public final class c implements com.ss.android.ugc.aweme.filter.view.internal.a {

    /* renamed from: a  reason: collision with root package name */
    public View.OnClickListener f95843a;

    /* renamed from: b  reason: collision with root package name */
    public View f95844b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f95845c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final f.a.b.a f95846d = new f.a.b.a();

    /* renamed from: e  reason: collision with root package name */
    private final Context f95847e;

    /* renamed from: f  reason: collision with root package name */
    private final i f95848f;

    static {
        Covode.recordClassIndex(60732);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.a
    public final void a() {
        MethodCollector.i(9727);
        FrameLayout frameLayout = new FrameLayout(this.f95847e);
        View a2 = com.a.a(LayoutInflater.from(this.f95847e), R.layout.ed, this.f95848f.e(), false);
        if (a2 == null) {
            l.b();
        }
        frameLayout.addView(a2, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f95844b = frameLayout;
        this.f95848f.a(frameLayout, this.f95845c);
        this.f95846d.a(this.f95848f.g().a(new a(this), f.a.e.b.a.f157192e));
        MethodCollector.o(9727);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.a
    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        this.f95843a = onClickListener;
    }

    static final class a<T> implements f<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f95849a;

        static {
            Covode.recordClassIndex(60733);
        }

        a(c cVar) {
            this.f95849a = cVar;
        }

        @Override // f.a.d.f
        public final void accept(Object obj) {
            View.OnClickListener onClickListener;
            if (obj == this.f95849a.f95845c && (onClickListener = this.f95849a.f95843a) != null) {
                View view = this.f95849a.f95844b;
                if (view == null) {
                    l.a("entranceView");
                }
                onClickListener.onClick(view);
            }
        }
    }

    public c(Context context, i iVar) {
        l.d(context, "");
        l.d(iVar, "");
        this.f95847e = context;
        this.f95848f = iVar;
    }
}
