package com.ss.android.ugc.aweme.commercialize.profile.impl;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.profile.api.d;
import com.ss.android.ugc.aweme.commercialize.profile.api.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public class a implements View.OnClickListener, com.ss.android.ugc.aweme.commercialize.profile.api.a {

    /* renamed from: a  reason: collision with root package name */
    public Context f75186a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f75187b;

    /* renamed from: c  reason: collision with root package name */
    public d f75188c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f75189d;

    /* renamed from: e  reason: collision with root package name */
    private final h f75190e = i.a((h.f.a.a) new b(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f75191f = i.a((h.f.a.a) new C1714a(this));

    static {
        Covode.recordClassIndex(46384);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a
    public void a(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a
    public void a(boolean z) {
    }

    /* access modifiers changed from: protected */
    public final TextView b() {
        return (TextView) this.f75190e.getValue();
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.a$a  reason: collision with other inner class name */
    static final class C1714a extends m implements h.f.a.a<View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(46385);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1714a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.f75189d.findViewById(R.id.dh);
        }
    }

    static final class b extends m implements h.f.a.a<TextView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(46386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f75189d.findViewById(R.id.dj);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a
    public void a() {
        this.f75189d.setOnClickListener(this);
        ((View) this.f75191f.getValue()).setOnClickListener(this);
        b().setOnClickListener(this);
    }

    public a(LinearLayout linearLayout) {
        l.d(linearLayout, "");
        this.f75189d = linearLayout;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a
    public void a(e eVar) {
        AwemeRawAd awemeRawAd;
        l.d(eVar, "");
        this.f75187b = eVar.f75141b;
        this.f75186a = eVar.f75140a;
        this.f75188c = eVar.f75143d;
        com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(b());
        TextView b2 = b();
        float a2 = (float) n.a(2.0d);
        Aweme aweme = this.f75187b;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        b2.setBackground(new com.ss.android.ugc.aweme.commercialize.ad.b(a2, Color.parseColor(com.ss.android.ugc.aweme.commercialize.e.a.b.c(awemeRawAd))));
        b().setText(com.ss.android.ugc.aweme.commercialize.util.a.a(this.f75186a, this.f75187b, false));
    }
}
