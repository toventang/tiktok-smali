package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.df.r;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.KTVView;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.utils.d;
import com.zhiliaoapp.musically.R;

public final class h implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    ImageView f126384a;

    /* renamed from: b  reason: collision with root package name */
    KTVView f126385b;

    /* renamed from: c  reason: collision with root package name */
    TextView f126386c;

    /* renamed from: d  reason: collision with root package name */
    TextView f126387d;

    /* renamed from: e  reason: collision with root package name */
    String f126388e;

    /* renamed from: f  reason: collision with root package name */
    b f126389f;

    /* renamed from: g  reason: collision with root package name */
    RelativeLayout f126390g;

    /* renamed from: h  reason: collision with root package name */
    public int f126391h;

    /* renamed from: i  reason: collision with root package name */
    public int f126392i;

    /* renamed from: j  reason: collision with root package name */
    a f126393j;

    /* renamed from: k  reason: collision with root package name */
    public b f126394k;

    /* renamed from: l  reason: collision with root package name */
    private View f126395l;

    /* renamed from: m  reason: collision with root package name */
    private int f126396m;
    private float n;
    private float o;
    private boolean p;

    public interface a {
        static {
            Covode.recordClassIndex(82925);
        }

        void c(int i2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(82926);
        }

        void b(int i2);
    }

    static {
        Covode.recordClassIndex(82923);
    }

    private int c() {
        if (this.f126396m >= this.f126392i) {
            return (int) (((((float) this.f126385b.getWidth()) * 1.0f) * 15000.0f) / ((float) this.f126392i));
        }
        double width = (double) this.f126385b.getWidth();
        Double.isNaN(width);
        double d2 = (double) this.f126396m;
        Double.isNaN(d2);
        double d3 = width * 1.0d * d2;
        double d4 = (double) this.f126392i;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    private void b() {
        MethodCollector.i(10526);
        this.f126387d.setText(r.a(this.f126392i));
        this.f126386c.setText(this.f126388e);
        ImageView imageView = new ImageView(this.f126395l.getContext());
        this.f126384a = imageView;
        imageView.setImageResource(2131232194);
        this.f126384a.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f126390g.addView(this.f126384a);
        this.f126384a.setX(this.f126385b.getX() - ((float) (this.f126384a.getWidth() / 2)));
        this.f126385b.setLength(a());
        this.f126384a.setOnTouchListener(this);
        b bVar = this.f126389f;
        bVar.setBubbleTextViewAttribute(k.b.a(bVar.getContext()));
        this.f126389f.setScrollListener(new f.a() {
            /* class com.ss.android.ugc.aweme.shortvideo.cutmusic.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(82924);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a
            public final void b(float f2) {
                h.this.f126389f.setTimeBubble((int) (f2 * ((float) h.this.f126392i)));
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a
            public final void a(float f2) {
                h hVar = h.this;
                hVar.f126391h = (int) (f2 * ((float) hVar.f126392i));
                if (h.this.f126394k != null) {
                    h.this.f126394k.b(h.this.f126391h);
                }
            }
        });
        this.f126389f.a((((float) this.f126391h) * 1.0f) / ((float) this.f126392i));
        this.f126389f.setTimeBubble(this.f126391h);
        MethodCollector.o(10526);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        if (this.f126396m >= this.f126392i || this.p) {
            return this.f126385b.getWidth();
        }
        double width = (double) this.f126385b.getWidth();
        Double.isNaN(width);
        double d2 = (double) this.f126396m;
        Double.isNaN(d2);
        double d3 = width * 1.0d * d2;
        double d4 = (double) this.f126392i;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    private h a(View view) {
        this.f126395l = view;
        b(view);
        b();
        this.f126395l.bringToFront();
        int i2 = this.f126392i;
        int i3 = this.f126396m;
        if (i2 > i3 && i2 < i3 + 1000) {
            this.p = true;
        }
        return this;
    }

    private void a(boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        ImageView imageView = this.f126384a;
        int i6 = 0;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        KTVView kTVView = this.f126385b;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        kTVView.setVisibility(i3);
        TextView textView = this.f126386c;
        if (z) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView.setVisibility(i4);
        TextView textView2 = this.f126387d;
        if (z) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        textView2.setVisibility(i5);
        b bVar = this.f126389f;
        if (z) {
            i6 = 8;
        }
        bVar.setVisibility(i6);
        d.a("tool_performance_show_music_wave", new com.ss.android.ugc.tools.f.b().a("scene", "MusicDragView").a("status", !z ? 1 : 0).f149193a);
    }

    private void b(View view) {
        this.f126385b = (KTVView) view.findViewById(R.id.c45);
        this.f126386c = (TextView) view.findViewById(R.id.f7r);
        this.f126387d = (TextView) view.findViewById(R.id.ez6);
        this.f126389f = (b) view.findViewById(R.id.ai4);
        this.f126390g = (RelativeLayout) view.findViewById(R.id.e5t);
        this.f126388e = view.getContext().getResources().getString(R.string.gji);
        view.findViewById(R.id.bw6).setOnClickListener(new j(this));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            int i2 = 0;
            if (action == 1) {
                int x = (int) ((this.f126384a.getX() - this.f126385b.getX()) + ((float) (this.f126384a.getWidth() / 2)));
                if (x >= 0) {
                    i2 = x;
                }
                double d2 = (double) i2;
                Double.isNaN(d2);
                double width = (double) this.f126385b.getWidth();
                Double.isNaN(width);
                double d3 = (d2 * 1.0d) / width;
                double d4 = (double) this.f126392i;
                Double.isNaN(d4);
                int i3 = (int) (d3 * d4);
                this.f126391h = i3;
                b bVar = this.f126394k;
                if (bVar != null) {
                    bVar.b(i3);
                }
            } else if (action == 2 && !this.p) {
                float rawX = this.o + (motionEvent.getRawX() - this.n);
                if (rawX < this.f126385b.getX() - ((float) (this.f126384a.getWidth() / 2))) {
                    rawX = this.f126385b.getX() - ((float) (this.f126384a.getWidth() / 2));
                }
                if ((rawX - this.f126385b.getX()) + ((float) (this.f126384a.getWidth() / 2)) >= ((float) (this.f126385b.getWidth() - c()))) {
                    rawX = ((this.f126385b.getX() - ((float) (this.f126384a.getWidth() / 2))) + ((float) this.f126385b.getWidth())) - ((float) c());
                }
                if (rawX < 0.0f) {
                    rawX = 0.0f;
                }
                this.f126384a.animate().x(rawX).setDuration(0).start();
                int x2 = (int) ((this.f126384a.getX() + ((float) (this.f126384a.getWidth() / 2))) - this.f126385b.getX());
                if (x2 < 0 || this.p) {
                    x2 = 0;
                }
                this.f126385b.setStart(x2);
                this.f126385b.setLength(a());
                TextView textView = this.f126386c;
                double x3 = (double) this.f126384a.getX();
                Double.isNaN(x3);
                double x4 = (double) this.f126385b.getX();
                Double.isNaN(x4);
                double d5 = (x3 * 1.0d) - x4;
                double width2 = (double) (this.f126384a.getWidth() / 2);
                Double.isNaN(width2);
                double d6 = d5 + width2;
                double width3 = (double) this.f126385b.getWidth();
                Double.isNaN(width3);
                double d7 = d6 / width3;
                int i4 = this.f126392i;
                double d8 = (double) i4;
                Double.isNaN(d8);
                int i5 = (int) (d7 * d8);
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 <= i4) {
                    i2 = i5;
                }
                textView.setText(r.a(i2));
            }
        } else {
            this.n = motionEvent.getRawX();
            this.o = this.f126384a.getX();
        }
        return true;
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.d dVar, int i2, int i3) {
        k.f126400f.a(dVar, (long) i2, (long) i3);
        k.b(dVar);
        if (dVar == null || this.f126389f == null) {
            a(true);
            return;
        }
        a(false);
        this.f126389f.setAudioWaveViewData(dVar);
    }

    public static h a(View view, int i2, int i3, int i4) {
        h hVar = new h();
        hVar.f126396m = i2;
        hVar.f126391h = i4;
        hVar.f126392i = i3;
        hVar.a(view);
        view.post(i.a(hVar));
        b bVar = hVar.f126394k;
        if (bVar != null) {
            bVar.b(i4);
        }
        return hVar;
    }
}
