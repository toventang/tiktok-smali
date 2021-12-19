package com.ss.android.ugc.aweme.notification.h;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.r;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import h.f.b.l;

public final class q {
    static {
        Covode.recordClassIndex(73083);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f113681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SpannableStringBuilder f113682b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseNotice f113683c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f113684d;

        static {
            Covode.recordClassIndex(73084);
        }

        a(TextView textView, SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, int i2) {
            this.f113681a = textView;
            this.f113682b = spannableStringBuilder;
            this.f113683c = baseNotice;
            this.f113684d = i2;
        }

        public final void run() {
            TextView textView = this.f113681a;
            q.a(textView, this.f113682b, this.f113683c, this.f113684d, textView.getWidth());
        }
    }

    public static final void a(TextView textView, SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, int i2, int i3) {
        l.d(textView, "");
        l.d(spannableStringBuilder, "");
        l.d(baseNotice, "");
        if (i3 == 0) {
            textView.post(new a(textView, spannableStringBuilder, baseNotice, i2));
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setBreakStrategy(0);
        }
        String valueOf = String.valueOf(k.a(baseNotice, textView.getContext()));
        k.a(spannableStringBuilder, baseNotice, textView.getContext());
        TextPaint paint = textView.getPaint();
        l.b(paint, "");
        textView.setText(a(spannableStringBuilder, paint, i3, i2, valueOf.length(), (int) textView.getPaint().measureText(valueOf)));
    }

    private static SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i2, int i3, int i4, int i5) {
        l.d(spannableStringBuilder, "");
        l.d(textPaint, "");
        return r.a(spannableStringBuilder, textPaint, i2, i3, i4, i5);
    }
}
