package com.ss.android.ugc.aweme.anchor.multi.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ui.anchor.d;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lego.p;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;
import org.json.JSONObject;

public final class FeedMultiTagLayout extends FrameLayout implements com.ss.android.ugc.aweme.base.ui.anchor.c {

    /* renamed from: a  reason: collision with root package name */
    public d f66412a;

    /* renamed from: b  reason: collision with root package name */
    private s<ag> f66413b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f66414c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f66415d;

    static {
        Covode.recordClassIndex(40805);
    }

    public FeedMultiTagLayout(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public FeedMultiTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.c
    public final View k() {
        return this;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedMultiTagLayout f66416a;

        static {
            Covode.recordClassIndex(40806);
        }

        a(FeedMultiTagLayout feedMultiTagLayout) {
            this.f66416a = feedMultiTagLayout;
        }

        public final void run() {
            this.f66416a.b();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedMultiTagLayout f66417a;

        static {
            Covode.recordClassIndex(40807);
        }

        b(FeedMultiTagLayout feedMultiTagLayout) {
            this.f66417a = feedMultiTagLayout;
        }

        public final void run() {
            this.f66417a.c();
        }
    }

    public final void l() {
        this.f66412a.a(this);
    }

    private SmartImageView m() {
        View findViewById = findViewById(R.id.ke);
        l.b(findViewById, "");
        return (SmartImageView) findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.c
    public final SmartImageView d() {
        View findViewById = findViewById(R.id.kb);
        l.b(findViewById, "");
        return (SmartImageView) findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.c
    public final TextView e() {
        View findViewById = findViewById(R.id.kg);
        l.b(findViewById, "");
        return (TextView) findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.c
    public final TextView f() {
        View findViewById = findViewById(R.id.kh);
        l.b(findViewById, "");
        return (TextView) findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.c
    public final ImageView g() {
        View findViewById = findViewById(R.id.kc);
        l.b(findViewById, "");
        return (ImageView) findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.c
    public final View h() {
        View findViewById = findViewById(R.id.kd);
        l.b(findViewById, "");
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.c
    public final View i() {
        View findViewById = findViewById(R.id.kj);
        l.b(findViewById, "");
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.c
    public final TextView j() {
        View findViewById = findViewById(R.id.kf);
        l.b(findViewById, "");
        return (TextView) findViewById;
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedMultiTagLayout f66418a;

        static {
            Covode.recordClassIndex(40808);
        }

        c(FeedMultiTagLayout feedMultiTagLayout) {
            this.f66418a = feedMultiTagLayout;
        }

        public final void run() {
            if (this.f66418a.f66412a.a()) {
                this.f66418a.setVisibility(0);
                this.f66418a.f66412a.b(this.f66418a);
            }
        }
    }

    public final void b() {
        if (!this.f66414c) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            com.a.b.c.a((Activity) context, R.layout.ru, this, true);
            this.f66414c = true;
        }
    }

    public final void a() {
        if (com.ss.android.ugc.aweme.feed.assem.a.f91966a) {
            p.a().post(new a(this));
            p.a().post(new b(this));
            p.a().post(new c(this));
            return;
        }
        b();
        c();
        if (this.f66412a.a()) {
            setVisibility(0);
            this.f66412a.b(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.c
    public final void c() {
        if (this.f66414c) {
            setVisibility(8);
            TextView e2 = e();
            e2.setText("");
            ViewGroup.LayoutParams layoutParams = e2.getLayoutParams();
            layoutParams.width = -2;
            e2.setLayoutParams(layoutParams);
            f().setVisibility(8);
            TextView j2 = j();
            j2.setVisibility(8);
            j2.setText("");
            ViewGroup.LayoutParams layoutParams2 = j2.getLayoutParams();
            layoutParams2.width = -2;
            j2.setLayoutParams(layoutParams2);
            i().setVisibility(8);
            g().setVisibility(8);
            d().setImageResource(R.color.c9);
            m().setImageResource(R.color.c9);
            m().setVisibility(8);
        }
    }

    public final void setOnInternalEventListener(s<ag> sVar) {
        l.d(sVar, "");
        this.f66413b = sVar;
    }

    public final void setRootBackgroundDrawable(Drawable drawable) {
        this.f66415d = drawable;
        b();
        View findViewById = findViewById(R.id.kd);
        l.b(findViewById, "");
        ((LinearLayout) findViewById).setBackground(this.f66415d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedMultiTagLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9594);
        Object a2 = com.ss.android.ugc.aweme.feed.service.a.a(d.class);
        l.b(a2, "");
        this.f66412a = (d) a2;
        MethodCollector.o(9594);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ FeedMultiTagLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    public final int a(Aweme aweme, Activity activity, String str, JSONObject jSONObject) {
        l.d(aweme, "");
        l.d(activity, "");
        l.d(str, "");
        l.d(jSONObject, "");
        return this.f66412a.a(aweme, activity, str, jSONObject, this.f66413b, false, this);
    }
}
