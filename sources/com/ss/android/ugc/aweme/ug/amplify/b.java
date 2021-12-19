package com.ss.android.ugc.aweme.ug.amplify;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(92629);
    }

    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f141719a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ URLSpan f141720b;

        static {
            Covode.recordClassIndex(92630);
        }

        public final void onClick(View view) {
            String str;
            l.d(view, "");
            h.f.a.b bVar = this.f141719a;
            URLSpan uRLSpan = this.f141720b;
            if (uRLSpan != null) {
                str = uRLSpan.getURL();
            } else {
                str = null;
            }
            bVar.invoke(str);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(androidx.core.content.b.c(d.a(), R.color.bx));
        }

        public a(h.f.a.b bVar, URLSpan uRLSpan) {
            this.f141719a = bVar;
            this.f141720b = uRLSpan;
        }
    }
}
