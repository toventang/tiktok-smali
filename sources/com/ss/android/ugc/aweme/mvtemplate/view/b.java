package com.ss.android.ugc.aweme.mvtemplate.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.ss.android.ugc.aweme.mvtemplate.a.d;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.v.a.c;
import com.ss.android.ugc.aweme.y.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f112178a;

    /* renamed from: b  reason: collision with root package name */
    public final String f112179b;

    /* renamed from: d  reason: collision with root package name */
    private TextView f112180d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteImageView f112181e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f112182f;

    /* renamed from: g  reason: collision with root package name */
    private FrameLayout f112183g;

    /* renamed from: h  reason: collision with root package name */
    private SmartImageView f112184h;

    /* renamed from: i  reason: collision with root package name */
    private TuxTextView f112185i;

    static {
        Covode.recordClassIndex(72070);
    }

    @Override // com.ss.android.ugc.aweme.mvtemplate.view.g
    public final c a() {
        Context context = this.f112178a;
        LayoutInflater from = LayoutInflater.from(context);
        l.b(from, "");
        return new com.ss.android.ugc.aweme.v.a.a(context, from, R.string.b8u);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f112186a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.y.c f112187b;

        static {
            Covode.recordClassIndex(72071);
        }

        a(b bVar, com.ss.android.ugc.aweme.y.c cVar) {
            this.f112186a = bVar;
            this.f112187b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            IChallengeDetailLegacyService a2 = ChallengeDetailLegacyServiceImpl.a();
            Context context = this.f112186a.f112178a;
            c.b bVar = this.f112187b.s;
            l.b(bVar, "");
            a2.a(context, bVar.f145316b);
        }
    }

    @Override // com.ss.android.ugc.aweme.mvtemplate.view.g
    public final void a(View view) {
        l.d(view, "");
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bf9);
        if (viewGroup != null) {
            View a2 = com.a.a(LayoutInflater.from(this.f112178a), R.layout.al6, viewGroup, true);
            this.f112185i = (TuxTextView) a2.findViewById(R.id.al0);
            this.f112184h = (SmartImageView) a2.findViewById(R.id.cu);
            this.f112183g = (FrameLayout) a2.findViewById(R.id.ct);
            this.f112180d = (TextView) a2.findViewById(R.id.f159973com);
            this.f112181e = (RemoteImageView) a2.findViewById(R.id.cok);
            this.f112182f = (TextView) a2.findViewById(R.id.crz);
        }
    }

    @Override // com.ss.android.ugc.aweme.mvtemplate.view.g
    public final void a(d dVar) {
        com.ss.android.ugc.aweme.y.c b2;
        String str;
        long j2;
        l.d(dVar, "");
        MvModel mvModel = dVar.f112139c;
        if (mvModel != null) {
            TextView textView = this.f112180d;
            if (textView != null) {
                textView.setText(mvModel.getName());
            }
            TextView textView2 = this.f112182f;
            if (textView2 != null) {
                StringBuilder sb = new StringBuilder();
                Long userCount = mvModel.getUserCount();
                if (userCount != null) {
                    j2 = userCount.longValue();
                } else {
                    j2 = 0;
                }
                textView2.setText(sb.append(com.ss.android.ugc.aweme.i18n.b.a(j2)).append(" ").toString());
            }
            e.a(this.f112181e, mvModel.getIconUrl());
        }
        if (com.ss.android.ugc.aweme.aq.a.a.a() && (b2 = com.ss.android.ugc.aweme.aq.a.a.b()) != null && b2.s != null && b2.f145312l != null) {
            List<String> list = b2.f145312l;
            MvModel mvModel2 = dVar.f112139c;
            if (mvModel2 != null) {
                str = mvModel2.getMvId();
            } else {
                str = null;
            }
            if (list.contains(str)) {
                if (!TextUtils.isEmpty(b2.n)) {
                    TuxTextView tuxTextView = this.f112185i;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(0);
                    }
                    TuxTextView tuxTextView2 = this.f112185i;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(b2.n);
                    }
                    FrameLayout frameLayout = this.f112183g;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                    }
                } else {
                    TuxTextView tuxTextView3 = this.f112185i;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(8);
                    }
                }
                FrameLayout frameLayout2 = this.f112183g;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                SmartImageView smartImageView = this.f112184h;
                if (smartImageView != null) {
                    smartImageView.setVisibility(0);
                }
                c.b bVar = b2.s;
                l.b(bVar, "");
                v a2 = r.a(bVar.f145315a).a("MovieDetailFragment");
                Context context = this.f112178a;
                e.a aVar = new e.a();
                aVar.f39831e = com.bytedance.lighten.a.d.c.a(context, 2.0f);
                aVar.f39828b = com.bytedance.lighten.a.d.c.a(context, 0.0f);
                com.bytedance.lighten.a.e a3 = aVar.a();
                l.b(a3, "");
                a2.w = a3;
                a2.E = this.f112184h;
                a2.c();
                FrameLayout frameLayout3 = this.f112183g;
                if (frameLayout3 != null) {
                    frameLayout3.setOnClickListener(new a(this, b2));
                }
            }
        }
    }

    public b(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        this.f112178a = context;
        this.f112179b = str;
    }
}
