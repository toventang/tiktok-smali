package com.ss.android.ugc.aweme.ftc.components.sticker.hint;

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
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.editSticker.a.i;
import com.ss.android.ugc.aweme.editSticker.interact.g;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class b extends j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f97981d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    i f97982a;

    /* renamed from: b  reason: collision with root package name */
    final g f97983b = new g();

    /* renamed from: c  reason: collision with root package name */
    public TextView f97984c;

    /* renamed from: e  reason: collision with root package name */
    private FTCStickerHintTextViewModel f97985e;

    static {
        Covode.recordClassIndex(62284);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62285);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.hint.b$b  reason: collision with other inner class name */
    static final class RunnableC2369b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97986a;

        static {
            Covode.recordClassIndex(62286);
        }

        RunnableC2369b(b bVar) {
            this.f97986a = bVar;
        }

        public final void run() {
            TextView textView = this.f97986a.f97984c;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public static final class e implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97989a;

        static {
            Covode.recordClassIndex(62289);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.i.a
        public final void a() {
            TextView textView = this.f97989a.f97984c;
            if (textView == null) {
                l.b();
            }
            textView.setVisibility(0);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.i.a
        public final void b() {
            b bVar = this.f97989a;
            TextView textView = bVar.f97984c;
            if (textView != null) {
                textView.postDelayed(new RunnableC2369b(bVar), 3000);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(b bVar) {
            this.f97989a = bVar;
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97987a;

        static {
            Covode.recordClassIndex(62287);
        }

        c(b bVar) {
            this.f97987a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            TextView textView = this.f97987a.f97984c;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97988a;

        static {
            Covode.recordClassIndex(62288);
        }

        d(b bVar) {
            this.f97988a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            float f2;
            com.ss.android.ugc.tools.view.b bVar;
            a aVar = (a) obj;
            if (aVar != null) {
                b bVar2 = this.f97988a;
                float f3 = aVar.f97977a;
                float f4 = aVar.f97978b;
                int i2 = aVar.f97979c;
                int i3 = aVar.f97980d;
                if (bVar2.f97984c != null) {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4 || bVar2.f97983b.a()) {
                                        return;
                                    }
                                } else if (bVar2.f97983b.e()) {
                                    return;
                                }
                            } else if (bVar2.f97983b.d()) {
                                return;
                            }
                        } else if (bVar2.f97983b.c()) {
                            return;
                        }
                    } else if (bVar2.f97983b.a()) {
                        return;
                    }
                    TextView textView = bVar2.f97984c;
                    if (textView == null) {
                        l.b();
                    }
                    textView.setText(i2);
                    TextView textView2 = bVar2.f97984c;
                    if (textView2 == null) {
                        l.b();
                    }
                    TextView textView3 = bVar2.f97984c;
                    if (textView3 == null) {
                        l.b();
                    }
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dh.b(textView3.getContext()), Integer.MIN_VALUE);
                    TextView textView4 = bVar2.f97984c;
                    if (textView4 == null) {
                        l.b();
                    }
                    textView2.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(dh.a(textView4.getContext()), Integer.MIN_VALUE));
                    if (i3 == 4 && (bVar = com.ss.android.ugc.aweme.editSticker.g.f88154a) != null && bVar.e()) {
                        TextView textView5 = bVar2.f97984c;
                        if (textView5 == null) {
                            l.b();
                        }
                        Context context = textView5.getContext();
                        l.b(context, "");
                        f2 = r.a(context, 18.0f);
                    } else {
                        f2 = 0.0f;
                    }
                    TextView textView6 = bVar2.f97984c;
                    if (textView6 == null) {
                        l.b();
                    }
                    if (r.a(textView6)) {
                        TextView textView7 = bVar2.f97984c;
                        if (textView7 == null) {
                            l.b();
                        }
                        f3 = ((float) dh.b(textView7.getContext())) - f3;
                    }
                    TextView textView8 = bVar2.f97984c;
                    if (textView8 == null) {
                        l.b();
                    }
                    if (f3 - (((float) textView8.getMeasuredWidth()) / 2.0f) >= 0.0f) {
                        TextView textView9 = bVar2.f97984c;
                        if (textView9 == null) {
                            l.b();
                        }
                        float measuredWidth = f3 - (((float) textView9.getMeasuredWidth()) / 2.0f);
                        TextView textView10 = bVar2.f97984c;
                        if (textView10 == null) {
                            l.b();
                        }
                        bVar2.a(measuredWidth, (f4 - ((float) textView10.getMeasuredHeight())) + f2);
                    } else {
                        TextView textView11 = bVar2.f97984c;
                        if (textView11 == null) {
                            l.b();
                        }
                        bVar2.a(0.0f, (f4 - ((float) textView11.getMeasuredHeight())) + f2);
                    }
                    i iVar = bVar2.f97982a;
                    if (iVar != null) {
                        TextView textView12 = bVar2.f97984c;
                        if (textView12 == null) {
                            l.b();
                        }
                        iVar.a(textView12, new e(bVar2));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.atx, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, float f3) {
        ViewGroup.LayoutParams layoutParams;
        TextView textView = this.f97984c;
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
        TextView textView2 = this.f97984c;
        if (textView2 != null) {
            textView2.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        TextPaint paint;
        l.d(view, "");
        super.a(view, bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a2 = ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(FTCStickerHintTextViewModel.class);
        l.b(a2, "");
        this.f97985e = (FTCStickerHintTextViewModel) a2;
        this.f97984c = (TextView) b(R.id.f80);
        TextView textView = this.f97984c;
        if (textView == null) {
            l.b();
        }
        Context context = textView.getContext();
        l.b(context, "");
        this.f97982a = new com.ss.android.ugc.aweme.editSticker.a.a(context);
        TextView textView2 = this.f97984c;
        if (!(textView2 == null || (paint = textView2.getPaint()) == null)) {
            paint.setFakeBoldText(true);
        }
        FTCStickerHintTextViewModel fTCStickerHintTextViewModel = this.f97985e;
        if (fTCStickerHintTextViewModel == null) {
            l.a("stickerHintTextViewModel");
        }
        fTCStickerHintTextViewModel.a().observe(this, new c(this));
        FTCStickerHintTextViewModel fTCStickerHintTextViewModel2 = this.f97985e;
        if (fTCStickerHintTextViewModel2 == null) {
            l.a("stickerHintTextViewModel");
        }
        fTCStickerHintTextViewModel2.b().observe(this, new d(this));
    }
}
