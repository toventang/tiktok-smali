package com.ss.android.ugc.aweme.shoutouts.review.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.b.b;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Arrays;

public final class ShoutoutsReviewHeaderTop extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public TuxTextView f133462g;

    /* renamed from: h  reason: collision with root package name */
    public TuxTextView f133463h;

    /* renamed from: i  reason: collision with root package name */
    public ShoutOutRatingBar f133464i;

    /* renamed from: j  reason: collision with root package name */
    public TuxTextView f133465j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f133466k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f133467l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f133468m;

    static {
        Covode.recordClassIndex(87282);
    }

    public ShoutoutsReviewHeaderTop(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.f4u);
        l.b(findViewById, "");
        this.f133462g = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.ez_);
        l.b(findViewById2, "");
        this.f133463h = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.dhb);
        l.b(findViewById3, "");
        this.f133464i = (ShoutOutRatingBar) findViewById3;
        View findViewById4 = findViewById(R.id.f63);
        l.b(findViewById4, "");
        this.f133465j = (TuxTextView) findViewById4;
        View findViewById5 = findViewById(R.id.bxm);
        l.b(findViewById5, "");
        this.f133466k = (ImageView) findViewById5;
        View findViewById6 = findViewById(R.id.f5i);
        l.b(findViewById6, "");
        this.f133467l = (TextView) findViewById6;
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsReviewHeaderTop f133469a;

        static {
            Covode.recordClassIndex(87283);
        }

        public a(ShoutoutsReviewHeaderTop shoutoutsReviewHeaderTop) {
            this.f133469a = shoutoutsReviewHeaderTop;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f133469a.getContext();
            l.b(context, "");
            b bVar = new b(context);
            bVar.a(R.string.g8, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            Context context2 = this.f133469a.getContext();
            l.b(context2, "");
            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.a(new com.bytedance.tux.dialog.b(context2).b(this.f133469a.getContext().getString(R.string.g6)).d(this.f133469a.getContext().getString(R.string.g7)).a(bVar), false).a(false)).a().b().show();
        }
    }

    public final void a(float f2, long j2) {
        if (j2 > 0) {
            ShoutOutRatingBar shoutOutRatingBar = this.f133464i;
            if (shoutOutRatingBar == null) {
                l.a("ratingBar");
            }
            shoutOutRatingBar.setStar(f2);
            TuxTextView tuxTextView = this.f133465j;
            if (tuxTextView == null) {
                l.a("tvRatingCount");
            }
            String string = getContext().getString(R.string.ddq);
            l.b(string, "");
            String a2 = com.a.a(string, Arrays.copyOf(new Object[]{com.ss.android.ugc.aweme.i18n.b.a(j2)}, 1));
            l.b(a2, "");
            tuxTextView.setText(a2);
            TextView textView = this.f133467l;
            if (textView == null) {
                l.a("tvRatingAvg");
            }
            String a3 = com.a.a("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
            l.b(a3, "");
            textView.setText(a3);
            TextView textView2 = this.f133467l;
            if (textView2 == null) {
                l.a("tvRatingAvg");
            }
            textView2.setVisibility(0);
            return;
        }
        ShoutOutRatingBar shoutOutRatingBar2 = this.f133464i;
        if (shoutOutRatingBar2 == null) {
            l.a("ratingBar");
        }
        Context context = getContext();
        l.b(context, "");
        shoutOutRatingBar2.setStarIdleDrawable(context.getResources().getDrawable(2131233817));
        ShoutOutRatingBar shoutOutRatingBar3 = this.f133464i;
        if (shoutOutRatingBar3 == null) {
            l.a("ratingBar");
        }
        shoutOutRatingBar3.setStar(0.0f);
        TuxTextView tuxTextView2 = this.f133465j;
        if (tuxTextView2 == null) {
            l.a("tvRatingCount");
        }
        tuxTextView2.setText(getContext().getString(R.string.dhv));
        TextView textView3 = this.f133467l;
        if (textView3 == null) {
            l.a("tvRatingAvg");
        }
        textView3.setVisibility(8);
    }

    private /* synthetic */ ShoutoutsReviewHeaderTop(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShoutoutsReviewHeaderTop(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
