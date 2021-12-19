package com.ss.android.ugc.aweme.kids.choosemusic.f;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f105638a = new RunnableC2695a(this);

    /* renamed from: b  reason: collision with root package name */
    public final RemoteImageView f105639b;

    /* renamed from: c  reason: collision with root package name */
    public final View f105640c;

    static {
        Covode.recordClassIndex(67664);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.f.a$a  reason: collision with other inner class name */
    static final class RunnableC2695a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105641a;

        static {
            Covode.recordClassIndex(67665);
        }

        RunnableC2695a(a aVar) {
            this.f105641a = aVar;
        }

        public final void run() {
            this.f105641a.dismiss();
        }
    }

    public final void dismiss() {
        if (isShowing()) {
            super.dismiss();
        }
    }

    public a(Context context) {
        l.d(context, "");
        MethodCollector.i(11519);
        View inflate = LayoutInflater.from(context).inflate(R.layout.amy, (ViewGroup) null);
        l.b(inflate, "");
        this.f105640c = inflate;
        setContentView(inflate);
        View findViewById = inflate.findViewById(R.id.bz4);
        l.b(findViewById, "");
        this.f105639b = (RemoteImageView) findViewById;
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.fo);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        MethodCollector.o(11519);
    }
}
