package com.ss.android.ugc.aweme.feed.ui;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.y;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import h.z;

public final class bd extends a {

    /* renamed from: f  reason: collision with root package name */
    private TextView f94333f;

    static {
        Covode.recordClassIndex(59927);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.a
    public final int b() {
        return R.layout.s9;
    }

    public bd(View view) {
        super(view);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.a, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        super.a(dataCenter);
        if (dataCenter != null) {
            dataCenter.a("on_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.a, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        TextView textView;
        super.a(view);
        ImageView imageView = this.f94209e;
        if (imageView != null) {
            imageView.setImageResource(2131231746);
        }
        View view2 = ((a) this).f94205a;
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.a0s);
        } else {
            textView = null;
        }
        this.f94333f = textView;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.a, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void c(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        if (bVar != null) {
            str = bVar.f67014a;
        } else {
            str = null;
        }
        if (l.a((Object) "on_page_unselected", (Object) str) && y.i(this.L) && com.ss.android.ugc.aweme.compliance.api.a.d().h() == 0 && com.ss.android.ugc.aweme.compliance.api.a.d().i() == 2) {
            com.ss.android.ugc.aweme.compliance.api.a.d().a((IComplianceBusinessService) 2, (int) ((h.f.a.a<z>) null));
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bd f94334a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f94335b;

        static {
            Covode.recordClassIndex(59928);
        }

        a(bd bdVar, Aweme aweme) {
            this.f94334a = bdVar;
            this.f94335b = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("tns_mask_layer_click_watch", new d().a("scenario", "photosensitive").a("group_id", this.f94335b.getAid()).f66730a);
            com.ss.android.ugc.aweme.compliance.api.a.d().a((IComplianceBusinessService) 2, (int) ((h.f.a.a<z>) null));
            View view2 = ((a) this.f94334a).f94205a;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            com.ss.android.ugc.aweme.compliance.api.a.d().a((IComplianceBusinessService) 2, (int) ((h.f.a.a<z>) null));
            c.a(new com.ss.android.ugc.aweme.feed.i.b());
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f94336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bd f94337b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f94338c;

        static {
            Covode.recordClassIndex(59929);
        }

        b(TextView textView, bd bdVar, Aweme aweme) {
            this.f94336a = textView;
            this.f94337b = bdVar;
            this.f94338c = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("tns_mask_layer_click_skip", new d().a("scenario", "photosensitive").a("group_id", this.f94338c.getAid()).f66730a);
            com.ss.android.ugc.aweme.compliance.api.a.d().a((IComplianceBusinessService) 1, (int) ((h.f.a.a<z>) null));
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f94336a.getContext()).a(R.string.dqk).a();
            c.a(new com.ss.android.ugc.aweme.ug.guide.a());
            this.f94337b.a(this.f94338c);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.a
    public final void a(Aweme aweme) {
        TextView textView;
        TextView textView2;
        l.d(aweme, "");
        if (!y.i(aweme)) {
            View view = ((a) this).f94205a;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (com.ss.android.ugc.aweme.compliance.api.a.d().h() == 1) {
            View view2 = ((a) this).f94205a;
            if (view2 == null || view2.getVisibility() != 0 || (textView = this.f94333f) == null || textView.getVisibility() != 8 || (textView2 = this.f94207c) == null || textView2.getVisibility() != 8) {
                View view3 = ((a) this).f94205a;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                r.a("tns_show_photosensitive_removed", new d().a("group_id", aweme.getAid()).f66730a);
                TextView textView3 = this.f94333f;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                TextView textView4 = this.f94207c;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                TextView textView5 = this.f94208d;
                if (textView5 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.R.getString(R.string.dqb) + "\n\n" + this.R.getString(R.string.dqc));
                    int a2 = p.a((CharSequence) spannableStringBuilder, "\n\n", 0, false, 6);
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(7, true), a2 + 1, a2 + 2, 33);
                    textView5.setText(spannableStringBuilder);
                }
                TextView textView6 = this.f94206b;
                if (textView6 != null) {
                    textView6.setText(R.string.dqa);
                }
            }
        } else {
            View view4 = ((a) this).f94205a;
            if (view4 == null || view4.getVisibility() != 0) {
                View view5 = ((a) this).f94205a;
                if (view5 != null) {
                    view5.setVisibility(0);
                }
                r.a("tns_show_mask_layer", new d().a("scenario", "photosensitive").a("group_id", aweme.getAid()).f66730a);
                TextView textView7 = this.f94208d;
                if (textView7 != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.R.getString(R.string.dq9) + "\n\n" + this.R.getString(R.string.dq_));
                    int a3 = p.a((CharSequence) spannableStringBuilder2, "\n\n", 0, false, 6);
                    spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(7, true), a3 + 1, a3 + 2, 33);
                    textView7.setText(spannableStringBuilder2);
                }
                TextView textView8 = this.f94206b;
                if (textView8 != null) {
                    textView8.setText(R.string.dqe);
                }
                TextView textView9 = this.f94207c;
                if (textView9 != null) {
                    textView9.setVisibility(0);
                    textView9.setText(R.string.dqf);
                    textView9.setOnClickListener(new a(this, aweme));
                }
                TextView textView10 = this.f94333f;
                if (textView10 != null) {
                    textView10.setVisibility(0);
                    textView10.setText(R.string.dqd);
                    textView10.setOnClickListener(new b(textView10, this, aweme));
                }
            }
        }
    }
}
