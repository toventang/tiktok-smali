package com.bytedance.android.livesdk.am;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13952a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(7740);
    }

    /* renamed from: com.bytedance.android.livesdk.am.a$a  reason: collision with other inner class name */
    public static final class C0291a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f13953a;

        static {
            Covode.recordClassIndex(7741);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
        }

        C0291a(Runnable runnable) {
            this.f13953a = runnable;
        }

        public final void onClick(View view) {
            l.d(view, "");
            this.f13953a.run();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f13954a;

        static {
            Covode.recordClassIndex(7742);
        }

        b(Runnable runnable) {
            this.f13954a = runnable;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f13954a.run();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f13955a;

        static {
            Covode.recordClassIndex(7743);
        }

        c(Runnable runnable) {
            this.f13955a = runnable;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f13955a.run();
        }
    }

    public static final Dialog a(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        l.d(context, "");
        l.d(runnable2, "");
        l.d(runnable3, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String a2 = y.a((int) R.string.e40);
        String a3 = y.a((int) R.string.elv, a2);
        spannableStringBuilder.append((CharSequence) a3);
        if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a2)) {
            l.b(a3, "");
            l.b(a2, "");
            int a4 = p.a((CharSequence) a3, a2, 0, false, 6);
            if (a4 != -1) {
                com.bytedance.android.live.design.widget.c.a(spannableStringBuilder, a4, a2.length() + a4, 700);
            }
            if (runnable != null) {
                spannableStringBuilder.setSpan(new C0291a(runnable), a4, a2.length() + a4, 33);
            }
        }
        b.a aVar = new b.a(context);
        aVar.f18287d = 2131234842;
        b.a a5 = aVar.a(R.string.ely);
        a5.f18286c = spannableStringBuilder;
        b.a a6 = a5.b(R.string.elx, (DialogInterface.OnClickListener) new b(runnable2), false).a(R.string.elw, (DialogInterface.OnClickListener) new c(runnable3), false);
        a6.f18296m = false;
        com.bytedance.android.livesdk.l.b a7 = a6.a();
        l.b(a7, "");
        return a7;
    }
}
