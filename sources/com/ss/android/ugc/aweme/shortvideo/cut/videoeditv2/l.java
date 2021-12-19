package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.utils.b;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.setting.cj;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.h;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.d;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.i;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.widget.i;
import com.ss.android.ugc.aweme.themechange.base.c;
import com.zhiliaoapp.musically.R;
import h.p;
import java.util.Collections;
import java.util.List;

public abstract class l extends a implements View.OnTouchListener {
    protected long A;
    protected long B;
    protected long C;
    protected long D;
    protected long E;
    protected boolean F;
    protected boolean G;
    protected boolean H;
    protected long I;
    protected Boolean J;
    protected float K;
    protected VEMediaParserProviderV2 L;
    public h M;
    private DecelerateInterpolator N = new DecelerateInterpolator();
    private View O;
    private View P;
    private View Q;
    private View R;
    private boolean S;
    private SpeedyLinearLayoutManager T;
    private SpeedyLinearLayoutManager U;
    private int V;
    private int W;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private long ak;
    private RecyclerView.n al;
    private float am;
    private float an;
    private float ao;

    /* renamed from: b  reason: collision with root package name */
    protected ImageView f126268b;

    /* renamed from: c  reason: collision with root package name */
    protected RTLImageView f126269c;

    /* renamed from: d  reason: collision with root package name */
    protected RTLImageView f126270d;

    /* renamed from: e  reason: collision with root package name */
    protected RTLLinearLayout f126271e;

    /* renamed from: f  reason: collision with root package name */
    protected AutoPollRecyclerView f126272f;

    /* renamed from: g  reason: collision with root package name */
    protected AutoPollRecyclerView f126273g;

    /* renamed from: h  reason: collision with root package name */
    protected InterceptFrameLayout f126274h;

    /* renamed from: i  reason: collision with root package name */
    protected int f126275i = 0;

    /* renamed from: j  reason: collision with root package name */
    float f126276j = b.b(getContext(), 12.0f);

    /* renamed from: k  reason: collision with root package name */
    protected long f126277k = di.a();

    /* renamed from: l  reason: collision with root package name */
    protected long f126278l;

    /* renamed from: m  reason: collision with root package name */
    protected e f126279m;
    protected VideoEditViewModel n;
    protected CutMultiVideoViewModel o;
    protected boolean p;
    protected b q;
    protected c r;
    protected c s;
    protected float t;
    protected int u;
    protected int v;
    protected d w;
    protected boolean x;
    protected int y;
    protected long z;

    static {
        Covode.recordClassIndex(82885);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a
    public View getEndSlide() {
        return this.f126269c;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a
    public View getStartSlide() {
        return this.f126270d;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final boolean a(e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, String str) {
        this.o = cutMultiVideoViewModel;
        MediaModel a2 = d.a(str, cutMultiVideoViewModel);
        if (a2 == null) {
            return false;
        }
        return a(eVar, cutMultiVideoViewModel, Collections.singletonList(a2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final boolean a(e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list) {
        return a(eVar, cutMultiVideoViewModel, null, i.a(list), list.size() > 1 ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final boolean a(e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, List<VideoSegment> list, int i2) {
        this.f126279m = eVar;
        this.o = cutMultiVideoViewModel;
        if (videoEditViewModel == null) {
            this.n = (VideoEditViewModel) ae.a(eVar, (ad.b) null).a(VideoEditViewModel.class);
        } else {
            this.n = videoEditViewModel;
        }
        this.u = i2;
        a(cutMultiVideoViewModel, list);
        h();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (z2) {
            b(floatValue);
        } else {
            c(floatValue);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        i();
        j();
    }

    private void r() {
        if (!this.S) {
            this.S = true;
            d.a(this.f126279m);
        }
    }

    public c getFrameAdapter() {
        if (this.u == 1) {
            return this.r;
        }
        return this.s;
    }

    public SpeedyLinearLayoutManager getLayoutManager() {
        if (this.u == 1) {
            return this.T;
        }
        return this.U;
    }

    /* access modifiers changed from: protected */
    public AutoPollRecyclerView getRecyclerView() {
        if (this.u == 1) {
            return this.f126272f;
        }
        return this.f126273g;
    }

    /* access modifiers changed from: protected */
    public final void n() {
        postDelayed(new n(this), 100);
    }

    private long getSelectedTimeV2() {
        return (long) Math.round(((this.f126269c.getStartX() - this.f126270d.getStartX()) - ((float) d.f126258c)) * this.q.f126235a);
    }

    private void i() {
        int i2;
        View view = this.Q;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            float startX = this.f126270d.getStartX() + (((float) d.f126258c) / 2.0f);
            if (!this.p) {
                startX += this.f126276j;
            }
            int i3 = 0;
            View c2 = getLayoutManager().c(0);
            if (c2 != null) {
                i2 = (int) (startX - c2.getX());
            } else {
                i2 = (int) startX;
            }
            if (i2 > 0) {
                i3 = i2 + 1;
            }
            this.Q.setX(startX - ((float) i3));
            layoutParams.width = i3;
            layoutParams.height = this.ad;
            layoutParams.topMargin = this.ag;
            this.Q.setLayoutParams(layoutParams);
        }
    }

    private void j() {
        int i2;
        int i3;
        View view = this.R;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            float startX = this.f126269c.getStartX() + (((float) d.f126258c) / 2.0f);
            if (!this.p) {
                startX -= this.f126276j;
            }
            View c2 = getLayoutManager().c(getLayoutManager().A() - 1);
            if (c2 != null) {
                i2 = (int) ((c2.getX() + ((float) c2.getWidth())) - startX);
            } else {
                i2 = (int) (((float) this.f126275i) - startX);
            }
            if (i2 <= 0) {
                i3 = 0;
            } else {
                i3 = i2 + 1;
            }
            this.R.setX(startX);
            layoutParams.width = i3;
            layoutParams.height = this.ad;
            layoutParams.topMargin = this.ag;
            this.R.setLayoutParams(layoutParams);
        }
    }

    private void q() {
        this.Q = new View(this.f126279m);
        this.R = new View(this.f126279m);
        int a2 = c.a(false, false, true, false);
        this.Q.setBackgroundColor(a2);
        this.R.setBackgroundColor(a2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, this.ad);
        layoutParams.topMargin = this.ag;
        this.Q.setLayoutParams(layoutParams);
        int startX = (int) (this.f126269c.getStartX() + ((float) (d.f126258c / 2)));
        int i2 = ((int) (((float) (this.z - this.B)) / this.q.f126235a)) - (d.f126258c / 2);
        int i3 = this.f126275i;
        if (i2 > i3 - startX) {
            i2 = i3 - startX;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2 + 2, this.ad);
        layoutParams2.topMargin = this.ag;
        this.R.setX((float) startX);
        this.R.setLayoutParams(layoutParams2);
        addView(this.Q);
        addView(this.R);
    }

    /* access modifiers changed from: protected */
    public final void m() {
        if (this.C != 0 && (this.f126269c.getStartX() - this.f126270d.getStartX()) - ((float) d.f126258c) != this.t) {
            long j2 = this.C / 6;
            if (this.u == 1) {
                p<Integer, Float> a2 = b.a(this.A, (float) j2, this.ac, this.n.k());
                this.f126272f.g(a2.component1().intValue(), -Math.round(a2.component2().floatValue()));
            } else {
                long j3 = this.A;
                int i2 = (int) (j3 / j2);
                this.f126273g.g(i2, -Math.round((((float) (j3 - (((long) i2) * j2))) / ((float) j2)) * ((float) this.ac)));
            }
            n();
        }
    }

    /* access modifiers changed from: protected */
    public final void o() {
        this.f126271e.setOnTouchListener(this);
        getRecyclerView().q();
        if (this.u == 1) {
            if (this.C != this.q.f126236b) {
                this.q.f126236b = this.C;
                b bVar = this.q;
                long j2 = this.z;
                this.n.l();
                bVar.b(j2);
                this.r.b(this.q.f126235a, 0.0f);
            }
        } else if (this.C != this.q.f126236b) {
            this.q.f126236b = this.C;
            this.q.a(this.z);
            this.s.b(this.q.f126235a, this.w.f125506d);
        }
        m();
        a(this.f126269c, (float) ((this.f126275i - this.y) - d.f126258c), false);
        a(this.f126270d, (float) this.y, true);
    }

    private void s() {
        this.f126271e.setOnTouchListener(this);
        if (this.J.booleanValue()) {
            long j2 = this.ak;
            if (j2 < 0) {
                long j3 = this.A + j2;
                this.A = j3;
                if (j3 <= 0) {
                    this.A = 0;
                }
                this.B = this.A + this.I;
            } else {
                long j4 = this.B + j2;
                this.B = j4;
                long j5 = this.z;
                if (j4 >= j5) {
                    this.B = j5;
                }
                this.A = this.B - this.I;
            }
            this.n.g();
            return;
        }
        getRecyclerView().q();
        if (this.u == 1) {
            if (this.C != this.q.f126236b) {
                this.q.f126236b = this.C;
                b bVar = this.q;
                long j6 = this.z;
                this.n.l();
                bVar.b(j6);
                this.r.b(this.q.f126235a, 0.0f);
            }
        } else if (this.C != this.q.f126236b) {
            this.q.f126236b = this.C;
            this.q.a(this.z);
            this.s.b(this.q.f126235a, this.w.f125506d);
        }
        m();
        a(this.f126269c, (float) ((this.f126275i - this.y) - d.f126258c), false);
        a(this.f126270d, (float) this.y, true);
    }

    /* access modifiers changed from: protected */
    public final void l() {
        long j2 = this.C;
        if (j2 != 0) {
            long j3 = j2 / 6;
            if (this.u == 1) {
                p<Integer, Float> a2 = b.a(this.A, (float) j3, this.ac, this.n.k());
                this.f126272f.g(a2.component1().intValue(), -Math.round(a2.component2().floatValue()));
            } else {
                long j4 = this.A;
                int i2 = (int) (j4 / j3);
                this.f126273g.g(i2, -Math.round((((float) (j4 - (((long) i2) * j3))) / ((float) j3)) * ((float) this.ac)));
            }
            if (this.J.booleanValue() && this.u == 0 && this.I < 1000) {
                VideoSegment videoSegment = this.n.k().get(this.v);
                if (this.A > videoSegment.f125478b - this.C) {
                    float f2 = ((float) (this.A - (videoSegment.f125478b - this.C))) / this.q.f126235a;
                    RTLImageView rTLImageView = this.f126270d;
                    rTLImageView.setStartX(rTLImageView.getStartX() + f2);
                    RTLImageView rTLImageView2 = this.f126269c;
                    rTLImageView2.setStartX(rTLImageView2.getStartX() + f2);
                    a((int) this.f126270d.getStartX(), (int) this.f126269c.getStartX());
                }
            }
            n();
        }
    }

    private void k() {
        RTLImageView rTLImageView = new RTLImageView(this.f126279m);
        this.f126270d = rTLImageView;
        rTLImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f126270d.setPadding(d.f126258c / 2, 0, 0, 0);
        this.f126270d.setImageResource(2131235000);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(d.f126258c, this.af);
        layoutParams.topMargin = this.ah;
        this.f126270d.setLayoutParams(layoutParams);
        this.f126270d.setOnTouchListener(this);
        this.f126270d.setTag("startSlide");
        this.f126270d.setStartX((float) this.y);
        addView(this.f126270d);
        RTLImageView rTLImageView2 = new RTLImageView(this.f126279m);
        this.f126269c = rTLImageView2;
        rTLImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f126269c.setPadding(0, 0, d.f126258c / 2, 0);
        this.f126269c.setImageResource(2131234999);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(d.f126258c, this.af);
        layoutParams2.topMargin = this.ah;
        this.f126269c.setLayoutParams(layoutParams2);
        this.f126269c.setOnTouchListener(this);
        this.f126269c.setTag("endSlide");
        this.f126269c.setStartX((float) ((this.f126275i - this.y) - d.f126258c));
        addView(this.f126269c);
        this.O = new View(this.f126279m);
        this.P = new View(this.f126279m);
        setBorderColor(R.color.bh);
        addView(this.O);
        addView(this.P);
        a((int) this.f126270d.getStartX(), (int) this.f126269c.getStartX());
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f126271e.getLayoutParams();
        layoutParams3.leftMargin = this.y + d.f126258c;
        layoutParams3.height = this.W;
        layoutParams3.topMargin = this.ab;
        this.f126271e.setLayoutParams(layoutParams3);
        this.f126271e.setTag("curPoint");
        this.f126271e.setOnTouchListener(this);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f126268b.getLayoutParams();
        layoutParams4.width = this.V;
        this.f126268b.setLayoutParams(layoutParams4);
        this.f126268b.setImageDrawable(com.ss.android.ugc.tools.view.a.a(0, -1, 1, this.V / 2));
        if (cj.a()) {
            this.f126268b.setImageDrawable(null);
            int a2 = en.a(0.5d, com.ss.android.ugc.aweme.port.in.i.f115645a);
            i.b.a(this.f126268b, -1, en.a((double) (((float) this.V) / 2.0f), com.ss.android.ugc.aweme.port.in.i.f115645a), androidx.core.content.b.c(getContext(), R.color.bo), a2, a2, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void b() {
        d dVar = this.w;
        if (dVar != null) {
            if (this.u != 1) {
                dVar.f125503a = (long) (((float) this.A) * dVar.f125506d);
                d dVar2 = this.w;
                dVar2.f125504b = (long) (((float) this.B) * dVar2.f125506d);
            }
            if (this.u == 0) {
                this.n.a(this.w, this.v);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void h() {
        this.v = 0;
        View inflate = View.inflate(this.f126279m, R.layout.bij, this);
        this.f126268b = (ImageView) inflate.findViewById(R.id.ahk);
        this.f126271e = (RTLLinearLayout) inflate.findViewById(R.id.ahl);
        this.f126272f = (AutoPollRecyclerView) inflate.findViewById(R.id.b9q);
        this.f126273g = (AutoPollRecyclerView) inflate.findViewById(R.id.e4i);
        this.f126274h = (InterceptFrameLayout) inflate.findViewById(R.id.djm);
        VideoSegment videoSegment = this.n.k().get(this.v);
        if (this.u != 1) {
            bj.a("init EditState");
            VideoSegment videoSegment2 = this.n.k().get(0);
            this.w = new d(videoSegment2);
            this.z = (long) (((float) videoSegment2.f125478b) / videoSegment2.f());
        } else {
            this.z = b.a(this.n.k(), this.n.l());
        }
        this.C = a(this.z, true);
        b bVar = new b(this.t);
        this.q = bVar;
        bVar.f126237c = this.f126278l;
        this.q.f126238d = this.f126277k;
        this.q.f126236b = this.C;
        this.A = 0;
        this.B = 0 + this.C;
        this.n.a(this.t);
        if (this.u == 1) {
            b bVar2 = this.q;
            long j2 = this.z;
            this.n.l();
            bVar2.b(j2);
        } else {
            this.q.a(videoSegment.f125478b, videoSegment.f());
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f126273g.getLayoutParams();
        layoutParams.topMargin = this.ag;
        this.f126273g.setLayoutParams(layoutParams);
        this.f126273g.setPadding(this.y + d.f126258c, 0, this.y + d.f126258c, 0);
        c cVar = new c(this.f126279m, new int[]{this.ac, this.ad}, this.q.f126235a, this.L, 0);
        this.s = cVar;
        cVar.a(this.F);
        this.f126273g.setAdapter(this.s);
        SpeedyLinearLayoutManager speedyLinearLayoutManager = new SpeedyLinearLayoutManager(this.f126279m);
        this.U = speedyLinearLayoutManager;
        this.f126273g.setLayoutManager(speedyLinearLayoutManager);
        this.f126273g.a(this.al);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f126272f.getLayoutParams();
        layoutParams2.topMargin = this.ag;
        this.f126272f.setLayoutParams(layoutParams2);
        this.f126272f.setPadding(this.y + d.f126258c, 0, this.y + d.f126258c, 0);
        c cVar2 = new c(this.f126279m, new int[]{this.ac, this.ad}, this.q.f126235a, this.L, 1);
        this.r = cVar2;
        cVar2.a(this.F);
        this.f126272f.setAdapter(this.r);
        SpeedyLinearLayoutManager speedyLinearLayoutManager2 = new SpeedyLinearLayoutManager(this.f126279m);
        this.T = speedyLinearLayoutManager2;
        this.f126272f.setLayoutManager(speedyLinearLayoutManager2);
        this.f126272f.a(this.al);
        if (this.u == 0) {
            this.f126273g.setVisibility(0);
            this.f126272f.setVisibility(8);
        } else {
            this.f126273g.setVisibility(8);
            this.f126272f.setVisibility(0);
        }
        if (this.x) {
            a();
        }
        k();
        q();
        this.f126270d.bringToFront();
        this.f126269c.bringToFront();
        this.f126271e.bringToFront();
    }

    public void setSelfAdaptiontoastAnimListener(h hVar) {
        this.M = hVar;
    }

    /* access modifiers changed from: protected */
    public final long b(long j2) {
        return a(j2, false);
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: protected */
    public void setFocusOnMode(boolean z2) {
        this.n.s.setValue(Boolean.valueOf(z2));
    }

    public void setBorderColor(int i2) {
        this.O.setBackgroundColor(this.f126279m.getResources().getColor(i2));
        this.P.setBackgroundColor(this.f126279m.getResources().getColor(i2));
    }

    private void a(float f2) {
        float f3 = this.an;
        if (f3 == 0.0f) {
            this.an = f2;
        } else if (Math.abs(f3 - f2) > 3.0f) {
            this.an = f2;
            this.n.f();
        }
    }

    private void b(float f2) {
        if (this.C < this.f126277k) {
            b(false);
            long j2 = this.f126277k;
            this.C = j2;
            this.A = this.B - j2;
        } else {
            b(f2, true);
        }
        b();
        if (this.aj == 1) {
            this.n.a();
        }
    }

    private void c(float f2) {
        if (this.C < this.f126277k) {
            b(false);
            long j2 = this.f126277k;
            this.C = j2;
            this.B = this.A + j2;
        } else {
            b(f2, false);
        }
        b();
        if (this.aj == 2) {
            this.n.b();
        }
    }

    public void setEnabled(boolean z2) {
        this.f126274h.setIntercept(!z2);
        if (z2) {
            this.f126270d.setEnabled(true);
            this.f126269c.setEnabled(true);
            this.f126271e.setEnabled(true);
        } else if (this.aj == 0) {
            this.f126270d.setEnabled(false);
            this.f126269c.setEnabled(false);
            this.f126271e.setEnabled(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a
    public void setEditViewHeight(boolean z2) {
        if (z2) {
            this.W = this.aa;
            this.ad = d.f126256a;
            this.ab = 0;
        } else {
            this.W = (int) n.b(getContext(), 44.0f);
            this.ad = this.ae;
            this.ab = (int) n.b(getContext(), 2.0f);
        }
        int i2 = this.ad;
        this.af = (this.ai * 2) + i2;
        this.r.a(i2);
        this.s.a(this.ad);
        removeView(this.f126270d);
        removeView(this.f126269c);
        removeView(this.O);
        removeView(this.P);
        removeView(this.Q);
        removeView(this.R);
        k();
        q();
        this.f126270d.bringToFront();
        this.f126269c.bringToFront();
        this.f126271e.bringToFront();
    }

    private void b(boolean z2) {
        String string;
        if (!this.S) {
            this.S = true;
            d.a(this.f126279m);
            if (!z2) {
                string = getResources().getString(R.string.h6x, Float.valueOf(((float) this.f126277k) / 1000.0f));
            } else if (!this.f126141a || !com.ss.android.ugc.aweme.shortvideo.edit.c.b.a()) {
                string = getResources().getString(R.string.h6w, Long.valueOf(this.f126278l / 1000));
            } else {
                string = com.ss.android.ugc.aweme.shortvideo.edit.c.b.a(a(getContext()));
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f126279m).a(string).a();
        }
    }

    public final void a(int i2) {
        float abs = ((float) Math.abs(i2)) * this.q.f126235a;
        if (i2 > 0) {
            long j2 = (long) (((float) this.B) + abs);
            this.B = j2;
            long j3 = this.z;
            if (j2 >= j3) {
                this.B = j3;
            }
            this.A = this.B - this.I;
        } else {
            long j4 = (long) (((float) this.A) - abs);
            this.A = j4;
            if (j4 <= 0) {
                this.A = 0;
            }
            this.B = this.A + this.I;
        }
        i();
        j();
        b();
    }

    public final void b(int i2) {
        if (this.aj != 0) {
            if (i2 < 0) {
                RTLImageView rTLImageView = this.f126269c;
                rTLImageView.setStartX(rTLImageView.getStartX() - ((float) i2));
            } else {
                RTLImageView rTLImageView2 = this.f126270d;
                rTLImageView2.setStartX(rTLImageView2.getStartX() - ((float) i2));
            }
            i();
            j();
            a((int) this.f126270d.getStartX(), (int) this.f126269c.getStartX());
            long selectedTimeV2 = getSelectedTimeV2();
            this.C = selectedTimeV2;
            int i3 = this.aj;
            if (i3 == 1) {
                long j2 = this.B - selectedTimeV2;
                this.A = j2;
                if (j2 <= 0) {
                    this.A = 0;
                }
            } else if (i3 == 2) {
                long j3 = this.A + selectedTimeV2;
                this.B = j3;
                long j4 = this.z;
                if (j3 >= j4) {
                    this.B = j4;
                }
            }
            long j5 = this.B - this.A;
            this.C = j5;
            long j6 = this.f126278l;
            if (j5 > j6) {
                this.C = j6;
                b(true);
                getRecyclerView().q();
            }
        } else {
            if (i2 > 0) {
                long abs = (long) (((float) this.B) + (((float) Math.abs(i2)) * this.q.f126235a));
                this.B = abs;
                long j7 = this.z;
                if (abs >= j7) {
                    this.B = j7;
                }
                this.A = this.B - this.C;
            } else {
                long abs2 = (long) (((float) this.A) - (((float) Math.abs(i2)) * this.q.f126235a));
                this.A = abs2;
                if (abs2 <= 0) {
                    this.A = 0;
                }
                this.B = this.A + this.C;
            }
            i();
            j();
        }
        b();
    }

    private long a(long j2, boolean z2) {
        long min = Math.min(j2, this.f126278l);
        if (!z2 || !com.ss.android.ugc.aweme.shortvideo.edit.c.b.a()) {
            return min;
        }
        return Math.min(min, com.ss.android.ugc.aweme.shortvideo.cut.p.a());
    }

    private void a(CutMultiVideoViewModel cutMultiVideoViewModel, List<VideoSegment> list) {
        if (cutMultiVideoViewModel.f125336k) {
            for (VideoSegment videoSegment : list) {
                videoSegment.f125478b = (long) cutMultiVideoViewModel.f125337l;
                videoSegment.f125482f = 720;
                videoSegment.f125483g = 1280;
            }
        }
        this.n.b(list);
    }

    private void b(float f2, boolean z2) {
        if (z2) {
            this.f126270d.setStartX(f2);
        } else {
            this.f126269c.setStartX(f2);
        }
        a((int) this.f126270d.getStartX(), (int) this.f126269c.getStartX());
        if (z2) {
            i();
        } else {
            j();
        }
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g.a().B();
        this.f126278l = 300000;
        this.p = true;
        this.x = true;
        this.ad = d.f126256a;
        this.ae = en.a(32.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
        this.aj = 0;
        this.y = d.f126259d;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = false;
        this.K = 0.0f;
        this.al = new RecyclerView.n() {
            /* class com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(82886);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                if (i2 == 1) {
                    l lVar = l.this;
                    lVar.a(lVar.f126270d.getStartX() + ((float) d.f126258c), false);
                    l.this.H = true;
                    l.this.f126270d.setEnabled(false);
                    l.this.f126269c.setEnabled(false);
                } else if (i2 == 0) {
                    l.this.setFocusOnMode(false);
                    l.this.f126270d.setEnabled(true);
                    l.this.f126269c.setEnabled(true);
                    if (l.this.H) {
                        l.this.n.g();
                        l.this.H = false;
                        if (l.this.n.k().size() > 8) {
                            l.this.L.c();
                        }
                    } else {
                        if (l.this.getLayoutManager().l() == 0) {
                            l.this.A = 0;
                            l lVar2 = l.this;
                            lVar2.C = lVar2.B - l.this.A;
                            l.this.n.a(0.0f);
                        }
                        if (l.this.getLayoutManager().n() == l.this.getFrameAdapter().getItemCount() - 1) {
                            l lVar3 = l.this;
                            lVar3.B = lVar3.z;
                            l lVar4 = l.this;
                            lVar4.C = lVar4.B - l.this.A;
                            l.this.n.a(0.0f);
                        }
                    }
                }
                super.a(recyclerView, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2, int i3) {
                if (i2 != 0) {
                    if (l.this.J.booleanValue()) {
                        l.this.a(i2);
                    } else {
                        l.this.b(i2);
                    }
                    if (!l.this.H) {
                        l.this.n.a(l.this.t);
                        if (l.this.M != null) {
                            l.this.M.b(l.this.getSelectedTime());
                        }
                    }
                }
            }
        };
        this.an = 0.0f;
        this.f126275i = com.ss.android.ugc.aweme.df.n.b(context);
        this.ai = (int) n.b(context, 2.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.qa, R.attr.qr, R.attr.qs, R.attr.uz, R.attr.v0, R.attr.a1v, R.attr.a5g, R.attr.a5h, R.attr.a6a, R.attr.a7j, R.attr.abv, R.attr.acv, R.attr.af8});
            this.V = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
            int round = Math.round(obtainStyledAttributes.getDimension(1, 0.0f));
            this.aa = round;
            this.W = round;
            this.af = this.ad + (this.ai * 2);
            float f2 = (float) ((this.f126275i - (d.f126258c * 2)) - (this.y * 2));
            this.t = f2;
            this.ac = Math.round(f2 / 6.0f);
            this.ah = (this.W - d.f126257b) / 2;
            this.ag = (this.W - this.ad) / 2;
            obtainStyledAttributes.recycle();
        }
        setLoadThumbnailDirectly(true);
        this.L = new VEMediaParserProviderV2(context);
    }

    /* access modifiers changed from: protected */
    public final void a(float f2, boolean z2) {
        if (f2 < this.f126270d.getStartX() + ((float) d.f126258c)) {
            f2 = this.f126270d.getStartX() + ((float) d.f126258c);
        }
        if (f2 > this.f126269c.getStartX() - ((float) this.f126268b.getWidth())) {
            f2 = this.f126269c.getStartX() - ((float) this.f126268b.getWidth());
        }
        this.f126271e.setStartX(f2);
        if (!z2) {
            return;
        }
        if (this.u == 2) {
            this.n.a(getSinglePlayingPosition());
        } else {
            this.n.a(getMultiPlayingPosition());
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r13.equals("endSlide") == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r13.equals("curPoint") == false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 882
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.l.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, int i3) {
        if (this.O != null && this.P != null && i2 <= i3) {
            int i4 = d.f126258c + i2;
            int i5 = ((i3 - i2) - d.f126258c) + 1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams.width = i5;
            layoutParams.height = this.ai;
            layoutParams.leftMargin = i4;
            layoutParams.topMargin = this.ah;
            this.O.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.P.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams2.width = i5;
            layoutParams2.height = this.ai;
            layoutParams2.leftMargin = i4;
            layoutParams2.topMargin = (this.ah + this.af) - this.ai;
            this.P.setLayoutParams(layoutParams2);
        }
    }

    private void a(RTLImageView rTLImageView, float f2, boolean z2) {
        if (rTLImageView != null && Math.abs(rTLImageView.getStartX() - f2) > 1.0f) {
            if (!z2) {
                float startX = rTLImageView.getStartX();
                int i2 = this.f126275i;
                if (startX > ((float) (i2 + 1))) {
                    rTLImageView.setStartX((float) (i2 + 1));
                }
            } else if (rTLImageView.getStartX() < ((float) (-d.f126258c))) {
                rTLImageView.setStartX((float) (-d.f126258c));
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(rTLImageView.getStartX(), f2);
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(this.N);
            ofFloat.addUpdateListener(new m(this, z2));
            ofFloat.start();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(long j2, long j3, long j4) {
        long j5 = j3 - j2;
        this.C = j5;
        this.C = Math.min(j4, j5);
        this.A = j2;
        this.B = j3;
    }
}
