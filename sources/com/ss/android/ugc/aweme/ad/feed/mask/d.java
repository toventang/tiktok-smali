package com.ss.android.ugc.aweme.ad.feed.mask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.i;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;

public abstract class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final Context f65976a;

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f65977b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.ad.feed.mask.a.a f65978c;

    /* renamed from: d  reason: collision with root package name */
    public final String f65979d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f65980e;

    /* renamed from: f  reason: collision with root package name */
    private final h f65981f;

    /* renamed from: g  reason: collision with root package name */
    private final h f65982g;

    static {
        Covode.recordClassIndex(40581);
    }

    /* access modifiers changed from: package-private */
    public final TextView a() {
        return (TextView) this.f65981f.getValue();
    }

    /* access modifiers changed from: protected */
    public abstract void a(View view);

    /* access modifiers changed from: package-private */
    public final TextView b() {
        return (TextView) this.f65982g.getValue();
    }

    public abstract void c();

    static final class a extends m implements h.f.a.a<TextView> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(40582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f65980e.findViewById(R.id.b0p);
        }
    }

    static final class b extends m implements h.f.a.a<TextView> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(40583);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f65980e.findViewById(R.id.b0u);
        }
    }

    public void onClick(View view) {
        Integer valueOf;
        com.ss.android.ugc.aweme.commercialize_ad_api.a.a a2;
        ClickAgent.onClick(view);
        boolean E = com.ss.android.ugc.aweme.commercialize.e.a.b.E(this.f65977b);
        if (this.f65977b.isAd() || !E) {
            if (!(view == null || (valueOf = Integer.valueOf(view.getId())) == null)) {
                if (valueOf.intValue() == R.id.b0p) {
                    this.f65978c.a(3);
                    this.f65978c.a(false, true);
                    return;
                } else if (valueOf.intValue() == R.id.b0r || valueOf.intValue() == R.id.b0u) {
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.f65977b)) {
                        AwemeRawAd awemeRawAd = this.f65977b.getAwemeRawAd();
                        i.a aVar = new i.a();
                        aVar.f74815a = awemeRawAd;
                        aVar.f74816b = "button";
                        com.ss.android.ugc.aweme.ad.d.a.a("replay", awemeRawAd, aVar.a());
                        if (!(awemeRawAd == null || (a2 = CommercializeAdServiceImpl.a().a(4)) == null || !(a2 instanceof com.ss.android.ugc.aweme.ad.feed.e.a))) {
                            ((com.ss.android.ugc.aweme.ad.feed.e.a) a2).a(awemeRawAd);
                        }
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("background_ad", "replay", awemeRawAd).b("refer", "button").c();
                        this.f65978c.a();
                    }
                    this.f65978c.a(true, false);
                    return;
                }
            }
            a(view);
        } else if (view != null) {
            new com.bytedance.tux.g.b(view).e(R.string.of).b();
        }
    }

    /* access modifiers changed from: protected */
    public final View a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        View findViewById = viewGroup.findViewById(R.id.b5u);
        l.b(findViewById, "");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        frameLayout.removeAllViews();
        View a2 = com.a.a(LayoutInflater.from(this.f65976a), i2, frameLayout, false);
        l.b(a2, "");
        frameLayout.addView(a2);
        this.f65980e.setOnClickListener(this);
        return a2;
    }

    public d(LinearLayout linearLayout, c cVar) {
        l.d(linearLayout, "");
        l.d(cVar, "");
        this.f65980e = linearLayout;
        this.f65976a = cVar.b();
        this.f65977b = cVar.c();
        com.ss.android.ugc.aweme.ad.feed.mask.a.a aVar = cVar.f65972c;
        if (aVar == null) {
            l.a("adMaskCallback");
        }
        this.f65978c = aVar;
        String str = cVar.f65973d;
        if (str == null) {
            l.a("eventType");
        }
        this.f65979d = str;
        this.f65981f = h.i.a((h.f.a.a) new a(this));
        this.f65982g = h.i.a((h.f.a.a) new b(this));
    }
}
