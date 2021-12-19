package com.ss.android.ad.splash.core.video;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.f.o;
import com.zhiliaoapp.musically.R;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    FrameLayout f58759a;

    /* renamed from: b  reason: collision with root package name */
    TextView f58760b;

    /* renamed from: c  reason: collision with root package name */
    TextView f58761c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f58762d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f58763e;

    /* renamed from: f  reason: collision with root package name */
    SSRenderSurfaceView f58764f;

    /* renamed from: g  reason: collision with root package name */
    View f58765g;

    /* renamed from: h  reason: collision with root package name */
    int f58766h;

    /* renamed from: i  reason: collision with root package name */
    int f58767i;

    /* renamed from: j  reason: collision with root package name */
    View f58768j;

    /* renamed from: k  reason: collision with root package name */
    Context f58769k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f58770l;

    /* renamed from: m  reason: collision with root package name */
    public a f58771m;
    FrameLayout n;
    TextView o;
    Space p;
    TextView q;
    TextView r;
    public boolean s;
    private View.OnTouchListener t = new View.OnTouchListener() {
        /* class com.ss.android.ad.splash.core.video.e.AnonymousClass3 */

        static {
            Covode.recordClassIndex(36408);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return true;
            }
            e eVar = e.this;
            if (!eVar.d()) {
                return true;
            }
            eVar.f58771m.a(motionEvent);
            return true;
        }
    };

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(36409);
        }

        void a();

        void a(int i2, int i3, int i4);

        void a(MotionEvent motionEvent);

        void a(SurfaceHolder surfaceHolder);

        void b();
    }

    static {
        Covode.recordClassIndex(36405);
    }

    public final void c() {
        this.f58765g.setVisibility(8);
    }

    public final boolean d() {
        if (this.f58771m != null) {
            return true;
        }
        return false;
    }

    public final FrameLayout.LayoutParams a() {
        if (this.f58768j.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) this.f58768j.getLayoutParams();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        layoutParams.setMargins(0, (int) o.a(this.f58769k, 14.0f), (int) o.a(this.f58769k, 9.0f), 0);
        this.f58760b.setLayoutParams(layoutParams);
    }

    public final void e() {
        b(8);
        this.f58761c.setVisibility(4);
        this.f58759a.setVisibility(8);
        this.f58760b.setVisibility(8);
        this.f58762d.setVisibility(8);
        this.f58763e.setVisibility(4);
        if (this.s) {
            this.n.setVisibility(8);
            this.q.setVisibility(8);
            this.r.setVisibility(8);
        }
    }

    public final void b(int i2) {
        o.a(this.f58768j, i2);
    }

    public final void a(int i2) {
        this.f58768j.setVisibility(0);
        SSRenderSurfaceView sSRenderSurfaceView = this.f58764f;
        if (sSRenderSurfaceView != null) {
            sSRenderSurfaceView.setVisibility(i2);
        }
    }

    @Override // com.ss.android.ad.splash.core.video.a
    public final void b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f58764f.getHolder()) {
            this.f58770l = false;
            if (d()) {
                this.f58771m.a();
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video.a
    public final void a(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f58764f.getHolder()) {
            this.f58770l = true;
            if (d()) {
                this.f58771m.a(surfaceHolder);
            }
        }
    }

    e(Context context, View view) {
        b(8);
        this.f58769k = context;
        if (view != null) {
            this.f58761c = (TextView) view.findViewById(R.id.gj);
            this.f58759a = (FrameLayout) view.findViewById(R.id.gi);
            this.f58760b = (TextView) view.findViewById(R.id.gh);
            if (h.v != 0) {
                this.f58760b.setText(h.v);
            } else {
                this.f58760b.setText(R.string.g3_);
            }
            this.f58763e = (ImageView) view.findViewById(R.id.gl);
            this.f58762d = (ImageView) view.findViewById(R.id.gk);
            this.o = (TextView) view.findViewById(R.id.d2);
            this.n = (FrameLayout) view.findViewById(R.id.d1);
            this.p = (Space) view.findViewById(R.id.d0);
            this.q = (TextView) view.findViewById(R.id.d4);
            this.r = (TextView) view.findViewById(R.id.d3);
            if (h.y != 0) {
                this.f58761c.setText(h.y);
            } else {
                this.f58761c.setText(R.string.g37);
            }
            if (h.C != 0) {
                this.f58763e.setImageResource(h.C);
            } else {
                this.f58763e.setImageResource(2131233863);
            }
            if (h.w != 0) {
                this.f58761c.setBackgroundResource(h.w);
                this.o.setBackgroundResource(h.w);
            }
            SSRenderSurfaceView sSRenderSurfaceView = (SSRenderSurfaceView) view.findViewById(R.id.fh_);
            this.f58764f = sSRenderSurfaceView;
            sSRenderSurfaceView.a(this);
            this.f58765g = view.findViewById(R.id.fgm);
            this.f58759a.setWillNotDraw(false);
            this.n.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ad.splash.core.video.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(36406);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (e.this.d()) {
                        e.this.f58771m.b();
                    }
                }
            });
            this.f58761c.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ad.splash.core.video.e.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(36407);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    view.setVisibility(4);
                    e.this.f58763e.setVisibility(0);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setDuration(800);
                    rotateAnimation.setRepeatCount(10);
                    rotateAnimation.setRepeatMode(1);
                    rotateAnimation.setInterpolator(new LinearInterpolator());
                    e.this.f58763e.startAnimation(rotateAnimation);
                    if (e.this.d()) {
                        e.this.f58771m.b();
                    }
                }
            });
        }
        this.f58768j = view;
        if (view != null) {
            view.setOnTouchListener(this.t);
        }
    }

    @Override // com.ss.android.ad.splash.core.video.a
    public final void a(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        if (surfaceHolder == this.f58764f.getHolder() && d()) {
            this.f58771m.a(i2, i3, i4);
        }
    }
}
