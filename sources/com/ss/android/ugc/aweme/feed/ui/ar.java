package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.utils.y;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ar extends a {

    /* renamed from: f  reason: collision with root package name */
    private TextView f94285f;

    static {
        Covode.recordClassIndex(59898);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.a
    public final int b() {
        return R.layout.s9;
    }

    public final void d() {
        View view = ((a) this).f94205a;
        if (view != null) {
            view.setVisibility(8);
        }
        c();
        c.a(new com.ss.android.ugc.aweme.feed.i.b(true));
    }

    public ar(View view) {
        super(view);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ar f94286a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f94287b;

        static {
            Covode.recordClassIndex(59899);
        }

        a(ar arVar, Aweme aweme) {
            this.f94286a = arVar;
            this.f94287b = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94286a.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.a, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        TextView textView;
        super.a(view);
        View view2 = ((a) this).f94205a;
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.a0s);
        } else {
            textView = null;
        }
        this.f94285f = textView;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f94288a;

        static {
            Covode.recordClassIndex(59900);
        }

        b(TextView textView) {
            this.f94288a = textView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f94288a.getContext()).a(R.string.dqk).a();
            c.a(new com.ss.android.ugc.aweme.ug.guide.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.a
    public final void a(Aweme aweme) {
        String str;
        l.d(aweme, "");
        if (y.h(aweme)) {
            View view = ((a) this).f94205a;
            if (view == null || view.getVisibility() != 0) {
                View view2 = ((a) this).f94205a;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                TextView textView = this.f94206b;
                String str2 = null;
                if (textView != null) {
                    VideoMaskInfo generalMaskInfo = aweme.getGeneralMaskInfo();
                    if (generalMaskInfo != null) {
                        str = generalMaskInfo.getTitle();
                    } else {
                        str = null;
                    }
                    textView.setText(str);
                }
                TextView textView2 = this.f94208d;
                if (textView2 != null) {
                    VideoMaskInfo generalMaskInfo2 = aweme.getGeneralMaskInfo();
                    if (generalMaskInfo2 != null) {
                        str2 = generalMaskInfo2.getContent();
                    }
                    textView2.setText(str2);
                }
                TextView textView3 = this.f94207c;
                if (textView3 != null) {
                    r.a("tns_mask_layer_click_skip", new d().a("scenario", "general").a("group_id", aweme.getAid()).f66730a);
                    textView3.setText(R.string.d27);
                    textView3.setOnClickListener(new b(textView3));
                }
                TextView textView4 = this.f94285f;
                if (textView4 != null) {
                    r.a("tns_mask_layer_click_watch", new d().a("scenario", "general").a("group_id", aweme.getAid()).f66730a);
                    textView4.setText(R.string.d28);
                    textView4.setOnClickListener(new a(this, aweme));
                }
                r.a("tns_show_mask_layer", new d().a("scenario", "general").a("group_id", aweme.getAid()).f66730a);
                return;
            }
            return;
        }
        View view3 = ((a) this).f94205a;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }
}
