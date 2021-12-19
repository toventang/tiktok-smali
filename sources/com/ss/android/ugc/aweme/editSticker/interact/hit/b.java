package com.ss.android.ugc.aweme.editSticker.interact.hit;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.editSticker.a.i;
import com.ss.android.ugc.aweme.editSticker.interact.g;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;
import java.util.Objects;

public final class b extends j {

    /* renamed from: f  reason: collision with root package name */
    public static final a f88174f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    i f88175a;

    /* renamed from: b  reason: collision with root package name */
    final g f88176b = new g();

    /* renamed from: c  reason: collision with root package name */
    public TextView f88177c;

    /* renamed from: d  reason: collision with root package name */
    TextView f88178d;

    /* renamed from: e  reason: collision with root package name */
    final float f88179e = 8.0f;

    /* renamed from: g  reason: collision with root package name */
    private StickerHintTextViewModel f88180g;

    static {
        Covode.recordClassIndex(55435);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55436);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.interact.hit.b$b  reason: collision with other inner class name */
    public static final class RunnableC2139b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f88181a;

        static {
            Covode.recordClassIndex(55437);
        }

        RunnableC2139b(TextView textView) {
            this.f88181a = textView;
        }

        public final void run() {
            TextView textView = this.f88181a;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public static final class e implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f88184a;

        static {
            Covode.recordClassIndex(55440);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.i.a
        public final void a() {
            TextView textView = this.f88184a.f88177c;
            if (textView == null) {
                l.b();
            }
            textView.setVisibility(0);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.i.a
        public final void b() {
            b.a(this.f88184a.f88177c, 3000);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(b bVar) {
            this.f88184a = bVar;
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f88182a;

        static {
            Covode.recordClassIndex(55438);
        }

        c(b bVar) {
            this.f88182a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            b bVar = this.f88182a;
            TextView textView = bVar.f88177c;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = bVar.f88178d;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void e(Bundle bundle) {
        super.e(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a2 = ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(StickerHintTextViewModel.class);
        l.b(a2, "");
        this.f88180g = (StickerHintTextViewModel) a2;
    }

    public final void a(p<Integer, Integer> pVar) {
        Integer first;
        if (pVar != null && (first = pVar.getFirst()) != null) {
            int intValue = first.intValue();
            View view = this.n;
            l.b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = intValue;
            View view2 = this.n;
            l.b(view2, "");
            marginLayoutParams.setMarginStart((dh.b(view2.getContext()) - intValue) / 2);
            View view3 = this.n;
            l.b(view3, "");
            view3.setLayoutParams(marginLayoutParams);
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f88183a;

        static {
            Covode.recordClassIndex(55439);
        }

        d(b bVar) {
            this.f88183a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            float f2;
            com.ss.android.ugc.tools.view.b bVar;
            ViewGroup.LayoutParams layoutParams;
            a aVar = (a) obj;
            if (aVar != null) {
                b bVar2 = this.f88183a;
                float f3 = aVar.f88170a;
                float f4 = aVar.f88171b;
                int i2 = aVar.f88172c;
                int i3 = aVar.f88173d;
                if (bVar2.f88177c != null) {
                    switch (i3) {
                        case 0:
                            if (bVar2.f88176b.a()) {
                                return;
                            }
                            break;
                        case 1:
                            if (bVar2.f88176b.c()) {
                                return;
                            }
                            break;
                        case 2:
                            if (bVar2.f88176b.d()) {
                                return;
                            }
                            break;
                        case 3:
                            if (bVar2.f88176b.e()) {
                                return;
                            }
                            break;
                        case 4:
                            if (bVar2.f88176b.a()) {
                                return;
                            }
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            break;
                        default:
                            return;
                    }
                    if (i3 == 6) {
                        TextView textView = bVar2.f88178d;
                        if (textView != null) {
                            textView.setText(i2);
                            Context context = textView.getContext();
                            l.b(context, "");
                            float a2 = r.a(context, bVar2.f88179e);
                            TextView textView2 = bVar2.f88178d;
                            if (textView2 != null) {
                                layoutParams = textView2.getLayoutParams();
                            } else {
                                layoutParams = null;
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            if (marginLayoutParams != null) {
                                marginLayoutParams.topMargin = (int) (f4 + a2);
                            }
                            TextView textView3 = bVar2.f88178d;
                            if (textView3 != null) {
                                textView3.setLayoutParams(marginLayoutParams);
                            }
                            textView.setVisibility(0);
                            b.a(bVar2.f88178d, 5000);
                            return;
                        }
                        return;
                    }
                    TextView textView4 = bVar2.f88177c;
                    if (textView4 == null) {
                        l.b();
                    }
                    textView4.setText(i2);
                    TextView textView5 = bVar2.f88177c;
                    if (textView5 == null) {
                        l.b();
                    }
                    TextView textView6 = bVar2.f88177c;
                    if (textView6 == null) {
                        l.b();
                    }
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dh.b(textView6.getContext()), Integer.MIN_VALUE);
                    TextView textView7 = bVar2.f88177c;
                    if (textView7 == null) {
                        l.b();
                    }
                    textView5.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(dh.a(textView7.getContext()), Integer.MIN_VALUE));
                    if (i3 == 4 && (bVar = com.ss.android.ugc.aweme.editSticker.g.f88154a) != null && bVar.e()) {
                        TextView textView8 = bVar2.f88177c;
                        if (textView8 == null) {
                            l.b();
                        }
                        Context context2 = textView8.getContext();
                        l.b(context2, "");
                        f2 = r.a(context2, 18.0f);
                    } else {
                        f2 = 0.0f;
                    }
                    TextView textView9 = bVar2.f88177c;
                    if (textView9 == null) {
                        l.b();
                    }
                    if (r.a(textView9)) {
                        TextView textView10 = bVar2.f88177c;
                        if (textView10 == null) {
                            l.b();
                        }
                        f3 = ((float) dh.b(textView10.getContext())) - f3;
                    }
                    TextView textView11 = bVar2.f88177c;
                    if (textView11 == null) {
                        l.b();
                    }
                    if (f3 - (((float) textView11.getMeasuredWidth()) / 2.0f) >= 0.0f) {
                        TextView textView12 = bVar2.f88177c;
                        TextView textView13 = bVar2.f88177c;
                        if (textView13 == null) {
                            l.b();
                        }
                        float measuredWidth = f3 - (((float) textView13.getMeasuredWidth()) / 2.0f);
                        TextView textView14 = bVar2.f88177c;
                        if (textView14 == null) {
                            l.b();
                        }
                        b.a(textView12, measuredWidth, (f4 - ((float) textView14.getMeasuredHeight())) + f2);
                    } else {
                        TextView textView15 = bVar2.f88177c;
                        TextView textView16 = bVar2.f88177c;
                        if (textView16 == null) {
                            l.b();
                        }
                        b.a(textView15, 0.0f, (f4 - ((float) textView16.getMeasuredHeight())) + f2);
                    }
                    i iVar = bVar2.f88175a;
                    if (iVar != null) {
                        TextView textView17 = bVar2.f88177c;
                        if (textView17 == null) {
                            l.b();
                        }
                        iVar.a(textView17, new e(bVar2));
                    }
                }
            }
        }
    }

    public static void a(TextView textView, long j2) {
        if (textView != null) {
            textView.postDelayed(new RunnableC2139b(textView), j2);
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.zj, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        TextPaint paint;
        l.d(view, "");
        super.a(view, bundle);
        this.f88177c = (TextView) b(R.id.f80);
        this.f88178d = (TextView) b(R.id.f82);
        TextView textView = this.f88177c;
        if (textView == null) {
            l.b();
        }
        Context context = textView.getContext();
        l.b(context, "");
        this.f88175a = new com.ss.android.ugc.aweme.editSticker.a.a(context);
        TextView textView2 = this.f88177c;
        if (!(textView2 == null || (paint = textView2.getPaint()) == null)) {
            paint.setFakeBoldText(true);
        }
        StickerHintTextViewModel stickerHintTextViewModel = this.f88180g;
        if (stickerHintTextViewModel == null) {
            l.a("stickerHintTextViewModel");
        }
        t<Boolean> a2 = stickerHintTextViewModel.a();
        if (a2 != null) {
            a2.observe(this, new c(this));
        }
        StickerHintTextViewModel stickerHintTextViewModel2 = this.f88180g;
        if (stickerHintTextViewModel2 == null) {
            l.a("stickerHintTextViewModel");
        }
        t<a> b2 = stickerHintTextViewModel2.b();
        if (b2 != null) {
            b2.observe(this, new d(this));
        }
    }

    static void a(TextView textView, float f2, float f3) {
        ViewGroup.LayoutParams layoutParams;
        if (textView != null) {
            layoutParams = textView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = (int) f2;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart((int) f2);
            marginLayoutParams.topMargin = (int) f3;
        }
        if (textView != null) {
            textView.setLayoutParams(marginLayoutParams);
        }
    }
}
