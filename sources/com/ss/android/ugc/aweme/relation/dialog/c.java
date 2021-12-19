package com.ss.android.ugc.aweme.relation.dialog;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f120392a;

    /* renamed from: b  reason: collision with root package name */
    public String f120393b = "";

    static {
        Covode.recordClassIndex(78332);
    }

    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f120394a;

        static {
            Covode.recordClassIndex(78333);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(c cVar) {
            this.f120394a = cVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(b.c(this.f120394a.f120392a.getContext(), R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            SmartRouter.buildRoute(this.f120394a.f120392a.getContext(), "//privacy/suggest_account").withParam("enter_from", "foru_boarding").withParam("previous_page", this.f120394a.f120393b).withParam("is_rec", 1).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.b8u);
        l.b(findViewById, "");
        this.f120392a = (TextView) findViewById;
    }
}
