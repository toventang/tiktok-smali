package com.ss.android.ugc.aweme.ecommerce.router;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.zhiliaoapp.musically.R;

public final class l extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public boolean f87174a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f87175b;

    /* renamed from: c  reason: collision with root package name */
    public final View f87176c;

    /* renamed from: d  reason: collision with root package name */
    private final View f87177d;

    static {
        Covode.recordClassIndex(54709);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f87178a;

        static {
            Covode.recordClassIndex(54710);
        }

        a(l lVar) {
            this.f87178a = lVar;
        }

        public final void run() {
            this.f87178a.b();
        }
    }

    public static final class b implements NoticeView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f87179a;

        static {
            Covode.recordClassIndex(54711);
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
        public final void b() {
            this.f87179a.dismiss();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(l lVar) {
            this.f87179a = lVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f87180a;

        static {
            Covode.recordClassIndex(54712);
        }

        c(l lVar) {
            this.f87180a = lVar;
        }

        public final void run() {
            this.f87180a.dismiss();
        }
    }

    public final void b() {
        try {
            super.dismiss();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void dismiss() {
        if (!this.f87174a) {
            this.f87174a = true;
            a(false);
            new Handler(Looper.getMainLooper()).postDelayed(new a(this), 500);
        }
    }

    public final boolean a() {
        try {
            this.f87177d.measure(0, 0);
            View view = this.f87176c;
            View view2 = this.f87177d;
            h.f.b.l.b(view2, "");
            showAtLocation(view, 80, 0, view2.getMeasuredHeight());
            a(true);
            new Handler(Looper.getMainLooper()).postDelayed(new c(this), 5000);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private final void a(boolean z) {
        float translationY;
        float measuredHeight;
        AnimatorSet animatorSet = new AnimatorSet();
        Interpolator a2 = com.bytedance.tux.a.a.a.a();
        Interpolator a3 = com.bytedance.tux.a.a.a.a();
        View view = this.f87177d;
        h.f.b.l.b(view, "");
        NoticeView noticeView = (NoticeView) view.findViewById(R.id.amh);
        float f2 = 1.0f;
        float f3 = 0.0f;
        if (z) {
            View view2 = this.f87177d;
            h.f.b.l.b(view2, "");
            translationY = ((float) view2.getMeasuredHeight()) * 1.0f;
            measuredHeight = 0.0f;
        } else {
            h.f.b.l.b(noticeView, "");
            f3 = noticeView.getAlpha();
            translationY = noticeView.getTranslationY();
            float translationY2 = noticeView.getTranslationY();
            View view3 = this.f87177d;
            h.f.b.l.b(view3, "");
            measuredHeight = translationY2 + ((float) view3.getMeasuredHeight());
            f2 = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(noticeView, "alpha", f3, f2).setDuration(300L);
        if (!z) {
            a2 = a3;
        }
        duration.setInterpolator(a2);
        h.f.b.l.b(duration, "");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(noticeView, "translationY", translationY, measuredHeight).setDuration(500L);
        duration2.setInterpolator(a3);
        h.f.b.l.b(duration2, "");
        animatorSet.play(duration).with(duration2);
        animatorSet.start();
    }

    public l(Context context, View view) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(view, "");
        MethodCollector.i(3586);
        this.f87175b = context;
        this.f87176c = view;
        View inflate = LayoutInflater.from(context).inflate(R.layout.rb, (ViewGroup) null);
        this.f87177d = inflate;
        setContentView(inflate);
        setWidth(-1);
        setHeight(-2);
        h.f.b.l.b(inflate, "");
        ((NoticeView) inflate.findViewById(R.id.amh)).setTitleText(context.getResources().getString(R.string.bja));
        h.f.b.l.b(inflate, "");
        ((NoticeView) inflate.findViewById(R.id.amh)).setOnInternalClickListener(new b(this));
        h.f.b.l.b(inflate, "");
        ((NoticeView) inflate.findViewById(R.id.amh)).setNoticeBackgroundColor(0);
        MethodCollector.o(3586);
    }
}
