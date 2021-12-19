package com.ss.android.ugc.aweme.ad.feed.card;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65810a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final View f65811b;

    /* renamed from: c  reason: collision with root package name */
    private AwemeRawAd f65812c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f65813d = false;

    static {
        Covode.recordClassIndex(40491);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a(int i2, int i3, int i4) {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final boolean e() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void g() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void h() {
        this.f65813d = true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40493);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a() {
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", this.f65812c).b("refer", "default_card").b();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a(int i2) {
        this.f65811b.setVisibility(i2);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f65812c = awemeRawAd;
    }

    public c(FrameLayout frameLayout) {
        l.d(frameLayout, "");
        MethodCollector.i(153);
        View inflate = View.inflate(frameLayout.getContext(), R.layout.af_, null);
        l.b(inflate, "");
        this.f65811b = inflate;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(n.b(frameLayout.getContext(), 2.0f));
        gradientDrawable.setColor(Color.parseColor("#E5252525"));
        inflate.setBackground(gradientDrawable);
        inflate.setOnClickListener(AnonymousClass1.f65814a);
        Context context = frameLayout.getContext();
        l.b(context, "");
        frameLayout.addView(inflate, new FrameLayout.LayoutParams(com.ss.android.ugc.aweme.ad.feed.a.a(context), (int) n.b(frameLayout.getContext(), 88.0f)));
        MethodCollector.o(153);
    }
}
