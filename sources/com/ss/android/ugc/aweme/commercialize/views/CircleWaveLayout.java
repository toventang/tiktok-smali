package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.facebook.drawee.c.c;
import com.facebook.drawee.c.d;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

public class CircleWaveLayout extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final String f75861a = CircleWaveLayout.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    ScaleFadeCircleView f75862b;

    /* renamed from: c  reason: collision with root package name */
    public ScaleFadeCircleView f75863c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f75864d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f75865e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f75866f;

    /* renamed from: g  reason: collision with root package name */
    protected d<f> f75867g;

    /* renamed from: h  reason: collision with root package name */
    private CircleImageView f75868h;

    static {
        Covode.recordClassIndex(46788);
    }

    public CircleWaveLayout(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (view.getId() == R.id.a67) {
            g.c().a(getContext(), this.f75864d);
            g.a().h(getContext(), this.f75864d);
            Aweme aweme = this.f75864d;
            if (aweme != null && aweme.isAd()) {
                a.a("draw_ad", "logo_click", this.f75864d.getAwemeRawAd()).c();
            }
            g.a().c(getContext(), this.f75864d);
        }
    }

    public CircleWaveLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CircleWaveLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(12659);
        this.f75867g = new c<f>() {
            /* class com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout.AnonymousClass2 */

            static {
                Covode.recordClassIndex(46790);
            }

            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final void onRelease(String str) {
                super.onRelease(str);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
                super.onIntermediateImageSet(str, fVar);
            }

            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final void onFailure(String str, Throwable th) {
                super.onFailure(str, th);
                CircleWaveLayout.this.f75866f = false;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
                if (CircleWaveLayout.this.f75865e) {
                    CircleWaveLayout.this.setVisibility(0);
                    CircleWaveLayout circleWaveLayout = CircleWaveLayout.this;
                    circleWaveLayout.f75862b.a();
                    circleWaveLayout.postDelayed(new Runnable() {
                        /* class com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(46789);
                        }

                        public final void run() {
                            CircleWaveLayout.this.f75863c.a();
                        }
                    }, 750);
                    CircleWaveLayout.this.f75866f = true;
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.a0_, this);
        this.f75862b = (ScaleFadeCircleView) findViewById(R.id.b3x);
        this.f75863c = (ScaleFadeCircleView) findViewById(R.id.dwn);
        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.a67);
        this.f75868h = circleImageView;
        circleImageView.setOnClickListener(this);
        setOnClickListener(this);
        MethodCollector.o(12659);
    }
}
