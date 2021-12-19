package com.ss.android.ugc.aweme.friends.ui;

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

public final class av extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f97202a;

    /* renamed from: b  reason: collision with root package name */
    public String f97203b = "";

    static {
        Covode.recordClassIndex(61749);
    }

    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ av f97204a;

        static {
            Covode.recordClassIndex(61750);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(av avVar) {
            this.f97204a = avVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(b.c(this.f97204a.f97202a.getContext(), R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            SmartRouter.buildRoute(this.f97204a.f97202a.getContext(), "//privacy/suggest_account").withParam("enter_from", "foru").withParam("previous_page", this.f97204a.f97203b).withParam("is_rec", 1).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public av(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.b8u);
        l.b(findViewById, "");
        this.f97202a = (TextView) findViewById;
    }
}
