package com.ss.android.ugc.aweme.comment.barrage.view;

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
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class BubbleMultiTagLayout extends FrameLayout implements com.ss.android.ugc.aweme.base.ui.anchor.c {

    /* renamed from: a  reason: collision with root package name */
    public d f71680a;

    /* renamed from: b  reason: collision with root package name */
    s<ag> f71681b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f71682c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f71683d;

    static {
        Covode.recordClassIndex(44091);
    }

    public BubbleMultiTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.c
    public final View k() {
        return this;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BubbleMultiTagLayout f71684a;

        static {
            Covode.recordClassIndex(44092);
        }

        a(BubbleMultiTagLayout bubbleMultiTagLayout) {
            this.f71684a = bubbleMultiTagLayout;
        }

        public final void run() {
            this.f71684a.a();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BubbleMultiTagLayout f71685a;

        static {
            Covode.recordClassIndex(44093);
        }

        b(BubbleMultiTagLayout bubbleMultiTagLayout) {
            this.f71685a = bubbleMultiTagLayout;
        }

        public final void run() {
            this.f71685a.c();
        }
    }

    private SmartImageView b() {
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
        final /* synthetic */ BubbleMultiTagLayout f71686a;

        static {
            Covode.recordClassIndex(44094);
        }

        c(BubbleMultiTagLayout bubbleMultiTagLayout) {
            this.f71686a = bubbleMultiTagLayout;
        }

        public final void run() {
            if (this.f71686a.f71680a.a()) {
                this.f71686a.setVisibility(0);
                this.f71686a.f71680a.b(this.f71686a);
            }
        }
    }

    public final void a() {
        if (!this.f71682c) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            com.a.b.c.a((Activity) context, R.layout.i2, this, true);
            this.f71682c = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.c
    public final void c() {
        if (this.f71682c) {
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
            b().setImageResource(R.color.c9);
            b().setVisibility(8);
        }
    }

    public final void setOnInternalEventListener(s<ag> sVar) {
        l.d(sVar, "");
        this.f71681b = sVar;
    }

    public final void setRootBackgroundDrawable(Drawable drawable) {
        this.f71683d = drawable;
        a();
        View findViewById = findViewById(R.id.kd);
        l.b(findViewById, "");
        ((LinearLayout) findViewById).setBackground(this.f71683d);
    }

    private /* synthetic */ BubbleMultiTagLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BubbleMultiTagLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(969);
        Object a2 = com.ss.android.ugc.aweme.feed.service.a.a(d.class);
        l.b(a2, "");
        this.f71680a = (d) a2;
        MethodCollector.o(969);
    }
}
