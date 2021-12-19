package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.u;
import com.a.b.c;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.cache.e;
import com.ss.android.ugc.aweme.feed.i.af;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.x.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import org.json.JSONObject;

public final class bo extends g implements u<com.ss.android.ugc.aweme.arch.widgets.base.b> {

    /* renamed from: l  reason: collision with root package name */
    private View f94394l;

    static {
        Covode.recordClassIndex(59957);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a() {
    }

    private final void c() {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        if (g.a(this.f94768a)) {
            View view = this.f94394l;
            if (view != null) {
                view.setVisibility(0);
            }
            d a2 = new d().a("enter_from", this.f94769b);
            Aweme aweme = this.f94768a;
            l.b(aweme, "");
            d a3 = a2.a("group_id", aweme.getAid());
            Aweme aweme2 = this.f94768a;
            l.b(aweme2, "");
            r.a("vpa_notify_show", a3.a("author_id", aweme2.getAuthorUid()).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.a(this.f94768a, this.f94772e))).f66730a);
            if (com.ss.android.ugc.aweme.compliance.api.a.e().c() == 2 || !l.a((Object) "homepage_hot", (Object) this.f94769b) || this.f94772e != 0 || this.f94778k != 1) {
                View view2 = this.f94394l;
                if (view2 != null && (tuxTextView = (TuxTextView) view2.findViewById(R.id.czr)) != null) {
                    tuxTextView.setVisibility(8);
                    return;
                }
                return;
            }
            View view3 = this.f94394l;
            if (!(view3 == null || (tuxTextView2 = (TuxTextView) view3.findViewById(R.id.czr)) == null)) {
                tuxTextView2.setVisibility(0);
            }
            d a4 = new d().a("enter_from", this.f94769b);
            Aweme aweme3 = this.f94768a;
            l.b(aweme3, "");
            d a5 = a4.a("group_id", aweme3.getAid());
            Aweme aweme4 = this.f94768a;
            l.b(aweme4, "");
            r.a("opt_out_show", a5.a("author_id", aweme4.getAuthorUid()).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.a(this.f94768a, this.f94772e))).f66730a);
            return;
        }
        View view4 = this.f94394l;
        if (view4 != null) {
            view4.setVisibility(8);
        }
    }

    public bo(View view) {
        super(view);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.a("on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bo f94398a;

        static {
            Covode.recordClassIndex(59962);
        }

        b(bo boVar) {
            this.f94398a = boVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f94398a.f94774g, com.ss.android.ugc.aweme.compliance.api.a.e().b()).open();
            d a2 = new d().a("enter_from", this.f94398a.f94769b);
            Aweme aweme = this.f94398a.f94768a;
            l.b(aweme, "");
            d a3 = a2.a("group_id", aweme.getAid());
            Aweme aweme2 = this.f94398a.f94768a;
            l.b(aweme2, "");
            r.a("enter_vpa_notify", a3.a("author_id", aweme2.getAuthorUid()).f66730a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(View view) {
        TuxTextView tuxTextView;
        MethodCollector.i(9442);
        View a2 = c.a((Activity) this.f94774g, (int) R.layout.tr);
        l.b(a2, "");
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a2);
        }
        this.f94394l = a2;
        if (a2 != null) {
            a2.setVisibility(8);
        }
        View view2 = this.f94394l;
        if (view2 == null || (tuxTextView = (TuxTextView) view2.findViewById(R.id.czr)) == null) {
            MethodCollector.o(9442);
            return;
        }
        tuxTextView.setVisibility(8);
        MethodCollector.o(9442);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxTextView f94395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bo f94396b;

        static {
            Covode.recordClassIndex(59958);
        }

        a(TuxTextView tuxTextView, bo boVar) {
            this.f94395a = tuxTextView;
            this.f94396b = boVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            d a2 = new d().a("enter_from", this.f94396b.f94769b);
            Aweme aweme = this.f94396b.f94768a;
            l.b(aweme, "");
            d a3 = a2.a("group_id", aweme.getAid());
            Aweme aweme2 = this.f94396b.f94768a;
            l.b(aweme2, "");
            r.a("opt_out_click", a3.a("author_id", aweme2.getAuthorUid()).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.a(this.f94396b.f94768a, this.f94396b.f94772e))).f66730a);
            a.C0731a aVar = new a.C0731a(this.f94396b.f94774g);
            aVar.E = true;
            a.C0731a a4 = aVar.a(R.string.bw8);
            a4.f33402b = this.f94395a.getContext().getString(R.string.bw5) + "\n\n" + this.f94395a.getContext().getString(R.string.bw6);
            a.C0731a b2 = a4.a(R.string.bw7, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.feed.ui.bo.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f94397a;

                static {
                    Covode.recordClassIndex(59959);
                }

                {
                    this.f94397a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    com.ss.android.ugc.aweme.compliance.api.a.e().a(new h.f.a.a<z>(this) {
                        /* class com.ss.android.ugc.aweme.feed.ui.bo.a.AnonymousClass1.AnonymousClass1 */
                        final /* synthetic */ AnonymousClass1 this$0;

                        static {
                            Covode.recordClassIndex(59960);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ z invoke() {
                            com.ss.android.ugc.d.a.c.a(new af());
                            e.m();
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f94397a.f94396b.f94774g).a(R.string.bw_).a();
                            return z.f158842a;
                        }
                    }, new h.f.a.a<z>(this) {
                        /* class com.ss.android.ugc.aweme.feed.ui.bo.a.AnonymousClass1.AnonymousClass2 */
                        final /* synthetic */ AnonymousClass1 this$0;

                        static {
                            Covode.recordClassIndex(59961);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ z invoke() {
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f94397a.f94396b.f94774g).a(R.string.bw9).a();
                            return z.f158842a;
                        }
                    });
                }
            }, false).b(R.string.a73, (DialogInterface.OnClickListener) null, false);
            b2.F = true;
            b2.a().c();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(VideoItemParams videoItemParams) {
        String string;
        View view;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        ConstraintLayout constraintLayout;
        super.a(videoItemParams);
        if (videoItemParams != null) {
            if (g.a(this.f94768a)) {
                if (!com.ss.android.ugc.aweme.compliance.api.a.e().a()) {
                    n.a("vpa_show_in_error_region", "", (JSONObject) null);
                }
                View view2 = this.f94394l;
                if (!(view2 == null || (constraintLayout = (ConstraintLayout) view2.findViewById(R.id.fku)) == null)) {
                    constraintLayout.setOnClickListener(new b(this));
                }
                StringBuilder sb = new StringBuilder();
                Aweme aweme = this.f94768a;
                l.b(aweme, "");
                if (aweme.getUploadMiscInfoStruct().vpaInfo.getInfoBarType() == 1) {
                    string = this.f94774g.getString(R.string.bw0);
                } else {
                    string = this.f94774g.getString(R.string.bw1);
                }
                SpannableString spannableString = new SpannableString(sb.append(string).append("  ").toString());
                Context context = this.f94774g;
                l.b(context, "");
                spannableString.setSpan(new ax(context), spannableString.length() - 1, spannableString.length(), 18);
                View view3 = this.f94394l;
                if (!(view3 == null || (tuxTextView2 = (TuxTextView) view3.findViewById(R.id.boz)) == null)) {
                    tuxTextView2.setText(spannableString);
                }
                if (com.ss.android.ugc.aweme.compliance.api.a.e().c() != 2 && l.a((Object) "homepage_hot", (Object) this.f94769b) && this.f94772e == 0 && this.f94778k == 1 && (view = this.f94394l) != null && (tuxTextView = (TuxTextView) view.findViewById(R.id.czr)) != null) {
                    tuxTextView.setOnClickListener(new a(tuxTextView, this));
                }
            }
            c();
        }
    }
}
