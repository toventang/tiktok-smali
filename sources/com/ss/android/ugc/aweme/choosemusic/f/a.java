package com.ss.android.ugc.aweme.choosemusic.f;

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
    public final Runnable f70532a = new RunnableC1594a(this);

    /* renamed from: b  reason: collision with root package name */
    public final RemoteImageView f70533b;

    /* renamed from: c  reason: collision with root package name */
    public final View f70534c;

    static {
        Covode.recordClassIndex(43498);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.f.a$a  reason: collision with other inner class name */
    static final class RunnableC1594a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f70535a;

        static {
            Covode.recordClassIndex(43499);
        }

        RunnableC1594a(a aVar) {
            this.f70535a = aVar;
        }

        public final void run() {
            this.f70535a.dismiss();
        }
    }

    public final void dismiss() {
        if (isShowing()) {
            super.dismiss();
        }
    }

    public a(Context context) {
        l.d(context, "");
        MethodCollector.i(5569);
        View inflate = LayoutInflater.from(context).inflate(R.layout.amy, (ViewGroup) null);
        l.b(inflate, "");
        this.f70534c = inflate;
        setContentView(inflate);
        View findViewById = inflate.findViewById(R.id.bz4);
        l.b(findViewById, "");
        this.f70533b = (RemoteImageView) findViewById;
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.fo);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        MethodCollector.o(5569);
    }
}
