package com.ss.android.ugc.aweme.inbox.c;

import android.app.Dialog;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.b;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104089a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(66658);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.c.a$a  reason: collision with other inner class name */
    public static final class C2650a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Dialog f104091a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f104092b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f104093c;

        static {
            Covode.recordClassIndex(66659);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(b.c(this.f104093c.getContext(), R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            Dialog dialog = this.f104091a;
            if (dialog != null && dialog.isShowing()) {
                this.f104091a.dismiss();
            }
            SmartRouter.buildRoute(this.f104092b, "//privacy/suggest_account").withParam("enter_from", "notification_page").withParam("is_rec", 1).open();
        }

        public C2650a(Dialog dialog, e eVar, TextView textView) {
            this.f104091a = dialog;
            this.f104092b = eVar;
            this.f104093c = textView;
        }
    }
}
