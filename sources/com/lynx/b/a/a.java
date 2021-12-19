package com.lynx.b.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.core.h.m;
import androidx.core.h.n;
import androidx.core.h.q;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.b.a.a.b;
import com.lynx.b.a.a.c;
import com.lynx.b.a.a.d;
import com.lynx.b.a.a.e;
import com.lynx.b.a.a.f;
import com.lynx.b.a.a.g;
import com.lynx.b.a.a.h;
import com.lynx.b.a.a.i;
import com.lynx.b.a.a.j;
import com.zhiliaoapp.musically.R;

public final class a extends ViewGroup implements n, i {
    protected static com.lynx.b.a.a.a aI;
    protected static b aJ;
    protected static c aK;
    protected static ViewGroup.MarginLayoutParams aL = new ViewGroup.MarginLayoutParams(-1, -1);
    protected boolean A;
    protected boolean B;
    protected boolean C;
    protected boolean D;
    protected boolean E;
    protected boolean F;
    protected boolean G;
    protected boolean H;
    protected boolean I;
    protected boolean J;
    protected boolean K;
    protected boolean L;
    protected boolean M;
    protected boolean N;
    protected boolean O;
    protected boolean P;
    protected boolean Q;
    protected boolean R;
    protected boolean S;
    protected boolean T;
    protected boolean U;
    protected boolean V;
    protected boolean W;

    /* renamed from: a  reason: collision with root package name */
    protected int f55073a;
    protected com.lynx.b.a.b.b aA;
    protected long aB;
    protected int aC;
    protected int aD;
    protected boolean aE;
    protected boolean aF;
    protected boolean aG;
    protected boolean aH;
    protected boolean aM;
    protected MotionEvent aN;
    protected Runnable aO;
    protected ValueAnimator aP;
    protected com.lynx.b.a.g.d aa;
    protected com.lynx.b.a.g.b ab;
    protected com.lynx.b.a.g.c ac;
    protected j ad;
    protected int ae;
    protected boolean af;
    protected int[] ag;
    protected m ah;
    protected q ai;
    protected int aj;
    protected com.lynx.b.a.b.a ak;
    protected int al;
    protected com.lynx.b.a.b.a am;
    protected int an;
    protected int ao;
    protected float ap;
    protected float aq;
    protected float ar;
    protected float as;
    protected g at;
    protected g au;
    protected d av;
    protected Paint aw;
    protected Handler ax;
    protected h ay;
    protected com.lynx.b.a.b.b az;

    /* renamed from: b  reason: collision with root package name */
    protected int f55074b;

    /* renamed from: c  reason: collision with root package name */
    protected int f55075c;

    /* renamed from: d  reason: collision with root package name */
    protected int f55076d;

    /* renamed from: e  reason: collision with root package name */
    protected int f55077e;

    /* renamed from: f  reason: collision with root package name */
    protected int f55078f;

    /* renamed from: g  reason: collision with root package name */
    protected int f55079g;

    /* renamed from: h  reason: collision with root package name */
    protected float f55080h;

    /* renamed from: i  reason: collision with root package name */
    protected float f55081i;

    /* renamed from: j  reason: collision with root package name */
    protected float f55082j;

    /* renamed from: k  reason: collision with root package name */
    protected float f55083k;

    /* renamed from: l  reason: collision with root package name */
    protected float f55084l;

    /* renamed from: m  reason: collision with root package name */
    protected char f55085m;
    protected boolean n;
    protected boolean o;
    protected int p;
    protected int q;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    protected int v;
    protected Scroller w;
    protected VelocityTracker x;
    protected Interpolator y;
    protected int[] z;

    @Override // com.lynx.b.a.a.i
    public final ViewGroup getLayout() {
        return this;
    }

    public class d implements h {
        static {
            Covode.recordClassIndex(34582);
        }

        @Override // com.lynx.b.a.a.h
        public final i a() {
            return a.this;
        }

        @Override // com.lynx.b.a.a.h
        public final h b() {
            if (a.this.az == com.lynx.b.a.b.b.TwoLevel) {
                a.this.ay.a(com.lynx.b.a.b.b.TwoLevelFinish);
                if (a.this.f55074b == 0) {
                    a(0, false);
                    a.this.a(com.lynx.b.a.b.b.None);
                } else {
                    a(0).setDuration((long) a.this.f55077e);
                }
            }
            return this;
        }

        public d() {
        }

        @Override // com.lynx.b.a.a.h
        public final ValueAnimator a(int i2) {
            a aVar = a.this;
            return aVar.a(i2, 0, aVar.y, a.this.f55078f);
        }

        @Override // com.lynx.b.a.a.h
        public final h a(com.lynx.b.a.b.b bVar) {
            switch (AnonymousClass2.f55088a[bVar.ordinal()]) {
                case 1:
                    if (a.this.az != com.lynx.b.a.b.b.None && a.this.f55074b == 0) {
                        a.this.a(com.lynx.b.a.b.b.None);
                        return null;
                    } else if (a.this.f55074b == 0) {
                        return null;
                    } else {
                        a(0);
                        return null;
                    }
                case 2:
                    if (!a.this.az.isOpening) {
                        a aVar = a.this;
                        if (aVar.a(aVar.A)) {
                            a.this.a(com.lynx.b.a.b.b.PullDownToRefresh);
                            return null;
                        }
                    }
                    a.this.setViceState(com.lynx.b.a.b.b.PullDownToRefresh);
                    return null;
                case 3:
                    a aVar2 = a.this;
                    if (!aVar2.a(aVar2.B) || a.this.az.isOpening || a.this.az.isFinishing || (a.this.S && a.this.G && a.this.T)) {
                        a.this.setViceState(com.lynx.b.a.b.b.PullUpToLoad);
                        return null;
                    }
                    a.this.a(com.lynx.b.a.b.b.PullUpToLoad);
                    return null;
                case 4:
                    if (!a.this.az.isOpening) {
                        a aVar3 = a.this;
                        if (aVar3.a(aVar3.A)) {
                            a.this.a(com.lynx.b.a.b.b.PullDownCanceled);
                            a(com.lynx.b.a.b.b.None);
                            return null;
                        }
                    }
                    a.this.setViceState(com.lynx.b.a.b.b.PullDownCanceled);
                    return null;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    a aVar4 = a.this;
                    if (!aVar4.a(aVar4.B) || a.this.az.isOpening || (a.this.S && a.this.G && a.this.T)) {
                        a.this.setViceState(com.lynx.b.a.b.b.PullUpCanceled);
                        return null;
                    }
                    a.this.a(com.lynx.b.a.b.b.PullUpCanceled);
                    a(com.lynx.b.a.b.b.None);
                    return null;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (!a.this.az.isOpening) {
                        a aVar5 = a.this;
                        if (aVar5.a(aVar5.A)) {
                            a.this.a(com.lynx.b.a.b.b.ReleaseToRefresh);
                            return null;
                        }
                    }
                    a.this.setViceState(com.lynx.b.a.b.b.ReleaseToRefresh);
                    return null;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    a aVar6 = a.this;
                    if (!aVar6.a(aVar6.B) || a.this.az.isOpening || a.this.az.isFinishing || (a.this.S && a.this.G && a.this.T)) {
                        a.this.setViceState(com.lynx.b.a.b.b.ReleaseToLoad);
                        return null;
                    }
                    a.this.a(com.lynx.b.a.b.b.ReleaseToLoad);
                    return null;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    if (!a.this.az.isOpening) {
                        a aVar7 = a.this;
                        if (aVar7.a(aVar7.A)) {
                            a.this.a(com.lynx.b.a.b.b.ReleaseToTwoLevel);
                            return null;
                        }
                    }
                    a.this.setViceState(com.lynx.b.a.b.b.ReleaseToTwoLevel);
                    return null;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    if (!a.this.az.isOpening) {
                        a aVar8 = a.this;
                        if (aVar8.a(aVar8.A)) {
                            a.this.a(com.lynx.b.a.b.b.RefreshReleased);
                            return null;
                        }
                    }
                    a.this.setViceState(com.lynx.b.a.b.b.RefreshReleased);
                    return null;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    if (!a.this.az.isOpening) {
                        a aVar9 = a.this;
                        if (aVar9.a(aVar9.B)) {
                            a.this.a(com.lynx.b.a.b.b.LoadReleased);
                            return null;
                        }
                    }
                    a.this.setViceState(com.lynx.b.a.b.b.LoadReleased);
                    return null;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    a.this.setStateRefreshing(true);
                    return null;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    a.this.setStateLoading(true);
                    return null;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    if (a.this.az != com.lynx.b.a.b.b.Refreshing) {
                        return null;
                    }
                    a.this.a(com.lynx.b.a.b.b.RefreshFinish);
                    return null;
                case ABRConfig.ABR_SELECT_SCENE:
                    if (a.this.az != com.lynx.b.a.b.b.Loading) {
                        return null;
                    }
                    a.this.a(com.lynx.b.a.b.b.LoadFinish);
                    return null;
                case 15:
                    a.this.a(com.lynx.b.a.b.b.TwoLevelReleased);
                    return null;
                case 16:
                    a.this.a(com.lynx.b.a.b.b.TwoLevelFinish);
                    return null;
                case 17:
                    a.this.a(com.lynx.b.a.b.b.TwoLevel);
                    return null;
                default:
                    return null;
            }
        }

        @Override // com.lynx.b.a.a.h
        public final h a(g gVar, int i2) {
            if (a.this.aw == null && i2 != 0) {
                a.this.aw = new Paint();
            }
            if (gVar.equals(a.this.at)) {
                a.this.aC = i2;
            } else if (gVar.equals(a.this.au)) {
                a.this.aD = i2;
            }
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e8, code lost:
            if (r2 >= 0) goto L_0x0298;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0378, code lost:
            if (r8 != false) goto L_0x00a1;
         */
        /* JADX WARNING: Removed duplicated region for block: B:159:0x0373  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0  */
        @Override // com.lynx.b.a.a.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.lynx.b.a.a.h a(int r23, boolean r24) {
            /*
            // Method dump skipped, instructions count: 978
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.b.a.a.d.a(int, boolean):com.lynx.b.a.a.h");
        }
    }

    public final com.lynx.b.a.b.b getState() {
        return this.az;
    }

    /* access modifiers changed from: protected */
    public final void a(com.lynx.b.a.b.b bVar) {
        com.lynx.b.a.b.b bVar2 = this.az;
        if (bVar2 != bVar) {
            this.az = bVar;
            this.aA = bVar;
            g gVar = this.at;
            g gVar2 = this.au;
            com.lynx.b.a.g.c cVar = this.ac;
            if (gVar != null) {
                gVar.a(this, bVar2, bVar);
            }
            if (gVar2 != null) {
                gVar2.a(this, bVar2, bVar);
            }
            if (cVar != null) {
                cVar.a(this, bVar2, bVar);
            }
            if (bVar == com.lynx.b.a.b.b.LoadFinish) {
                this.aH = false;
            }
        } else if (this.aA != bVar2) {
            this.aA = bVar2;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(boolean z2, g gVar) {
        return z2 || this.L || gVar == null || gVar.getSpinnerStyle() == com.lynx.b.a.b.c.f55146c;
    }

    /* access modifiers changed from: protected */
    public final boolean a(boolean z2) {
        return z2 && !this.L;
    }

    /* access modifiers changed from: protected */
    public final void a(float f2) {
        float f3 = f2;
        if (this.af && !this.O && f3 < 0.0f && !this.av.d()) {
            f3 = 0.0f;
        }
        if (this.az == com.lynx.b.a.b.b.TwoLevel && f3 > 0.0f) {
            this.ay.a(Math.min((int) f3, getMeasuredHeight()), true);
        } else if (this.az == com.lynx.b.a.b.b.Refreshing && f3 >= 0.0f) {
            int i2 = this.aj;
            if (f3 < ((float) i2)) {
                this.ay.a((int) f3, true);
            } else {
                double d2 = (double) ((this.ap - 1.0f) * ((float) i2));
                int max = Math.max((this.f55079g * 4) / 3, getHeight());
                int i3 = this.aj;
                double d3 = (double) (max - i3);
                double max2 = (double) Math.max(0.0f, (f3 - ((float) i3)) * this.f55084l);
                Double.isNaN(max2);
                double d4 = -max2;
                if (d3 == 0.0d) {
                    d3 = 1.0d;
                }
                Double.isNaN(d2);
                this.ay.a(((int) Math.min(d2 * (1.0d - Math.pow(100.0d, d4 / d3)), max2)) + this.aj, true);
            }
        } else if (f3 < 0.0f && (this.az == com.lynx.b.a.b.b.Loading || ((this.G && this.S && this.T && a(this.B)) || (this.K && !this.S && a(this.B))))) {
            int i4 = this.al;
            if (f3 > ((float) (-i4))) {
                this.ay.a((int) f3, true);
            } else {
                double d5 = (double) ((this.aq - 1.0f) * ((float) i4));
                int max3 = Math.max((this.f55079g * 4) / 3, getHeight());
                int i5 = this.al;
                double d6 = (double) (max3 - i5);
                double d7 = (double) (-Math.min(0.0f, (((float) i5) + f3) * this.f55084l));
                Double.isNaN(d7);
                double d8 = -d7;
                if (d6 == 0.0d) {
                    d6 = 1.0d;
                }
                Double.isNaN(d5);
                this.ay.a(((int) (-Math.min(d5 * (1.0d - Math.pow(100.0d, d8 / d6)), d7))) - this.al, true);
            }
        } else if (f3 >= 0.0f) {
            double d9 = (double) (this.ap * ((float) this.aj));
            double max4 = (double) Math.max(this.f55079g / 2, getHeight());
            double max5 = (double) Math.max(0.0f, this.f55084l * f3);
            Double.isNaN(max5);
            double d10 = -max5;
            if (max4 == 0.0d) {
                max4 = 1.0d;
            }
            Double.isNaN(d9);
            this.ay.a((int) Math.min(d9 * (1.0d - Math.pow(100.0d, d10 / max4)), max5), true);
        } else {
            double d11 = (double) (this.aq * ((float) this.al));
            double max6 = (double) Math.max(this.f55079g / 2, getHeight());
            double d12 = (double) (-Math.min(0.0f, this.f55084l * f3));
            Double.isNaN(d12);
            double d13 = -d12;
            if (max6 == 0.0d) {
                max6 = 1.0d;
            }
            Double.isNaN(d11);
            this.ay.a((int) (-Math.min(d11 * (1.0d - Math.pow(100.0d, d13 / max6)), d12)), true);
        }
        if (this.K && !this.S && a(this.B) && f3 < 0.0f && this.az != com.lynx.b.a.b.b.Refreshing && this.az != com.lynx.b.a.b.b.Loading && this.az != com.lynx.b.a.b.b.LoadFinish) {
            if (this.R) {
                this.aO = null;
                this.ay.a(-this.al);
            }
            setStateDirectLoading(false);
            this.ax.postDelayed(new Runnable() {
                /* class com.lynx.b.a.a.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(34571);
                }

                public final void run() {
                    if (a.this.ab != null) {
                        a.this.ab.a_(a.this);
                    } else if (a.this.ac == null) {
                        a.this.e();
                    }
                    com.lynx.b.a.g.c cVar = a.this.ac;
                    if (cVar != null) {
                        cVar.a_(a.this);
                    }
                }
            }, (long) this.f55078f);
        }
    }

    public final i a(com.lynx.b.a.g.d dVar) {
        this.aa = dVar;
        return this;
    }

    public final i a(com.lynx.b.a.g.b bVar) {
        this.ab = bVar;
        this.B = this.B || !this.U;
        return this;
    }

    public final int getNestedScrollAxes() {
        return this.ai.a();
    }

    static {
        Covode.recordClassIndex(34565);
    }

    @Override // com.lynx.b.a.a.i
    public final i a() {
        setNestedScrollingEnabled(false);
        return this;
    }

    public final i d() {
        return a(3000, Boolean.FALSE);
    }

    public final i e() {
        return a(LiveNetAdaptiveHurryTimeSetting.DEFAULT, false);
    }

    public final e getRefreshFooter() {
        g gVar = this.au;
        if (gVar instanceof e) {
            return (e) gVar;
        }
        return null;
    }

    public final f getRefreshHeader() {
        g gVar = this.at;
        if (gVar instanceof f) {
            return (f) gVar;
        }
        return null;
    }

    public final i b() {
        return a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.aB))), 300) << 16, Boolean.FALSE);
    }

    public final i c() {
        return a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.aB))), 300) << 16, false);
    }

    public final i f() {
        return a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.aB))), 300) << 16, true);
    }

    public final boolean g() {
        if (this.az != com.lynx.b.a.b.b.None || !a(this.A)) {
            return false;
        }
        AnonymousClass9 r1 = new Runnable() {
            /* class com.lynx.b.a.a.AnonymousClass9 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ float f55107a = 1.0f;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f55108b = 300;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f55109c = false;

            static {
                Covode.recordClassIndex(34576);
            }

            public final void run() {
                if (a.this.aA == com.lynx.b.a.b.b.Refreshing) {
                    if (a.this.aP != null) {
                        a.this.aP.cancel();
                    }
                    a aVar = a.this;
                    aVar.f55082j = ((float) aVar.getMeasuredWidth()) / 2.0f;
                    a.this.ay.a(com.lynx.b.a.b.b.PullDownToRefresh);
                    a aVar2 = a.this;
                    aVar2.aP = ValueAnimator.ofInt(aVar2.f55074b, (int) (((float) a.this.aj) * this.f55107a));
                    a.this.aP.setDuration((long) this.f55108b);
                    a.this.aP.setInterpolator(new com.lynx.b.a.h.b(com.lynx.b.a.h.b.f55191a));
                    a.this.aP.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.lynx.b.a.a.AnonymousClass9.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(34577);
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (a.this.aP != null) {
                                a.this.ay.a(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
                            }
                        }
                    });
                    a.this.aP.addListener(new AnimatorListenerAdapter() {
                        /* class com.lynx.b.a.a.AnonymousClass9.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(34578);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (a.this.aP != null) {
                                a.this.aP = null;
                                if (a.this.az != com.lynx.b.a.b.b.ReleaseToRefresh) {
                                    a.this.ay.a(com.lynx.b.a.b.b.ReleaseToRefresh);
                                }
                                a.this.setStateRefreshing(!AnonymousClass9.this.f55109c);
                            }
                        }
                    });
                    a.this.aP.start();
                }
            }
        };
        setViceState(com.lynx.b.a.b.b.Refreshing);
        r1.run();
        return true;
    }

    public final boolean isNestedScrollingEnabled() {
        if (!this.P) {
            return false;
        }
        if (this.J || this.A || this.B) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.aG = false;
        this.ay.a(0, true);
        a(com.lynx.b.a.b.b.None);
        Handler handler = this.ax;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.U = true;
        this.aO = null;
        ValueAnimator valueAnimator = this.aP;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.aP.removeAllUpdateListeners();
            this.aP.cancel();
            this.aP = null;
        }
        this.aH = false;
    }

    /* renamed from: com.lynx.b.a.a$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f55088a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00ba */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 211
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.b.a.a.AnonymousClass2.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        int f55120a;

        /* renamed from: b  reason: collision with root package name */
        int f55121b = 10;

        /* renamed from: c  reason: collision with root package name */
        float f55122c;

        /* renamed from: d  reason: collision with root package name */
        float f55123d = 0.98f;

        /* renamed from: e  reason: collision with root package name */
        long f55124e;

        /* renamed from: f  reason: collision with root package name */
        long f55125f = AnimationUtils.currentAnimationTimeMillis();

        static {
            Covode.recordClassIndex(34580);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
            if (r1.a(r1.B) != false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
            if (r1.a(r1.B) != false) goto L_0x0058;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
            if (r10.f55126g.f55074b >= (-r10.f55126g.al)) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
            if (r10.f55126g.f55074b > r10.f55126g.aj) goto L_0x0075;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Runnable a() {
            /*
            // Method dump skipped, instructions count: 232
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.b.a.a.b.a():java.lang.Runnable");
        }

        public final void run() {
            if (a.this.aO == this && !a.this.az.isFinishing) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                long j2 = currentAnimationTimeMillis - this.f55125f;
                double d2 = (double) this.f55122c;
                double pow = Math.pow((double) this.f55123d, (double) (((float) (currentAnimationTimeMillis - this.f55124e)) / (1000.0f / ((float) this.f55121b))));
                Double.isNaN(d2);
                float f2 = (float) (d2 * pow);
                this.f55122c = f2;
                float f3 = f2 * ((((float) j2) * 1.0f) / 1000.0f);
                if (Math.abs(f3) > 1.0f) {
                    this.f55125f = currentAnimationTimeMillis;
                    this.f55120a = (int) (((float) this.f55120a) + f3);
                    if (a.this.f55074b * this.f55120a > 0) {
                        a.this.ay.a(this.f55120a, true);
                        a.this.ax.postDelayed(this, (long) this.f55121b);
                        return;
                    }
                    a.this.aO = null;
                    a.this.ay.a(0, true);
                    View b2 = a.this.av.b();
                    int i2 = (int) (-this.f55122c);
                    if (b2 instanceof ScrollView) {
                        ((ScrollView) b2).fling(i2);
                    } else if (b2 instanceof AbsListView) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            ((AbsListView) b2).fling(i2);
                        }
                    } else if (b2 instanceof WebView) {
                        ((WebView) b2).flingScroll(0, i2);
                    } else if (b2 instanceof NestedScrollView) {
                        ((NestedScrollView) b2).b(i2);
                    } else if (b2 instanceof RecyclerView) {
                        ((RecyclerView) b2).b(0, i2);
                    }
                    if (a.this.aH && f3 > 0.0f) {
                        a.this.aH = false;
                        return;
                    }
                    return;
                }
                a.this.aO = null;
            }
        }

        b(float f2) {
            this.f55122c = f2;
            this.f55120a = a.this.f55074b;
        }
    }

    private void h() {
        if (this.az == com.lynx.b.a.b.b.TwoLevel) {
            if (this.v > -1000 && this.f55074b > getMeasuredHeight() / 2) {
                ValueAnimator a2 = this.ay.a(getMeasuredHeight());
                if (a2 != null) {
                    a2.setDuration((long) this.f55077e);
                }
            } else if (this.n) {
                this.ay.b();
            }
        } else if (this.az == com.lynx.b.a.b.b.Loading || (this.G && this.S && this.T && this.f55074b < 0 && a(this.B))) {
            int i2 = this.f55074b;
            int i3 = this.al;
            if (i2 < (-i3)) {
                this.ay.a(-i3);
            } else if (i2 > 0) {
                this.ay.a(0);
            }
        } else if (this.az == com.lynx.b.a.b.b.Refreshing) {
            int i4 = this.f55074b;
            int i5 = this.aj;
            if (i4 > i5) {
                this.ay.a(i5);
            } else if (i4 < 0) {
                this.ay.a(0);
            }
        } else if (this.az == com.lynx.b.a.b.b.PullDownToRefresh) {
            this.ay.a(com.lynx.b.a.b.b.PullDownCanceled);
        } else if (this.az == com.lynx.b.a.b.b.PullUpToLoad) {
            this.ay.a(com.lynx.b.a.b.b.PullUpCanceled);
        } else if (this.az == com.lynx.b.a.b.b.ReleaseToRefresh) {
            this.ay.a(com.lynx.b.a.b.b.Refreshing);
        } else if (this.az == com.lynx.b.a.b.b.ReleaseToLoad) {
            this.ay.a(com.lynx.b.a.b.b.Loading);
        } else if (this.az == com.lynx.b.a.b.b.ReleaseToTwoLevel) {
            this.ay.a(com.lynx.b.a.b.b.TwoLevelReleased);
        } else if (this.az == com.lynx.b.a.b.b.RefreshReleased) {
            if (this.aP == null) {
                this.ay.a(this.aj);
            }
        } else if (this.az == com.lynx.b.a.b.b.LoadReleased) {
            if (this.aP == null) {
                this.ay.a(-this.al);
            }
        } else if (this.f55074b != 0) {
            this.ay.a(0);
        }
    }

    public final void computeScroll() {
        float currVelocity;
        this.w.getCurrY();
        if (this.w.computeScrollOffset()) {
            int finalY = this.w.getFinalY();
            if (finalY >= 0 ? finalY <= 0 || ((!this.B && !this.J) || !this.av.d()) : (!this.A && !this.J) || !this.av.c()) {
                this.aM = true;
                invalidate();
                return;
            }
            if (this.aM) {
                int i2 = Build.VERSION.SDK_INT;
                if (finalY > 0) {
                    currVelocity = -this.w.getCurrVelocity();
                } else {
                    currVelocity = this.w.getCurrVelocity();
                }
                if (this.aP == null) {
                    if (currVelocity > 0.0f && (this.az == com.lynx.b.a.b.b.Refreshing || this.az == com.lynx.b.a.b.b.TwoLevel)) {
                        this.aO = new RunnableC1252a(currVelocity, this.aj);
                    } else if (currVelocity < 0.0f && (this.az == com.lynx.b.a.b.b.Loading || ((this.G && this.S && this.T && a(this.B)) || (this.K && !this.S && a(this.B) && this.az != com.lynx.b.a.b.b.Refreshing)))) {
                        this.aO = new RunnableC1252a(currVelocity, -this.al);
                    } else if (this.f55074b == 0 && this.I) {
                        this.aO = new RunnableC1252a(currVelocity, 0);
                    }
                }
            }
            this.w.forceFinished(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinishInflate() {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.b.a.a.onFinishInflate():void");
    }

    /* renamed from: com.lynx.b.a.a$a  reason: collision with other inner class name */
    protected class RunnableC1252a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        int f55113a;

        /* renamed from: b  reason: collision with root package name */
        int f55114b = 10;

        /* renamed from: c  reason: collision with root package name */
        int f55115c;

        /* renamed from: d  reason: collision with root package name */
        long f55116d;

        /* renamed from: e  reason: collision with root package name */
        float f55117e;

        /* renamed from: f  reason: collision with root package name */
        float f55118f;

        static {
            Covode.recordClassIndex(34579);
        }

        public final void run() {
            if (a.this.aO == this && !a.this.az.isFinishing) {
                if (Math.abs(a.this.f55074b) < Math.abs(this.f55115c)) {
                    double d2 = (double) this.f55118f;
                    int i2 = this.f55113a + 1;
                    this.f55113a = i2;
                    double pow = Math.pow(0.949999988079071d, (double) (i2 * 2));
                    Double.isNaN(d2);
                    this.f55118f = (float) (d2 * pow);
                } else if (this.f55115c != 0) {
                    double d3 = (double) this.f55118f;
                    int i3 = this.f55113a + 1;
                    this.f55113a = i3;
                    double pow2 = Math.pow(0.44999998807907104d, (double) (i3 * 2));
                    Double.isNaN(d3);
                    this.f55118f = (float) (d3 * pow2);
                } else {
                    double d4 = (double) this.f55118f;
                    int i4 = this.f55113a + 1;
                    this.f55113a = i4;
                    double pow3 = Math.pow(0.8500000238418579d, (double) (i4 * 2));
                    Double.isNaN(d4);
                    this.f55118f = (float) (d4 * pow3);
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f2 = this.f55118f * ((((float) (currentAnimationTimeMillis - this.f55116d)) * 1.0f) / 1000.0f);
                if (Math.abs(f2) >= 1.0f) {
                    this.f55116d = currentAnimationTimeMillis;
                    float f3 = this.f55117e + f2;
                    this.f55117e = f3;
                    a.this.a(f3);
                    a.this.ax.postDelayed(this, (long) this.f55114b);
                    return;
                }
                if (a.this.aA.isDragging && a.this.aA.isHeader) {
                    a.this.ay.a(com.lynx.b.a.b.b.PullDownCanceled);
                } else if (a.this.aA.isDragging && a.this.aA.isFooter) {
                    a.this.ay.a(com.lynx.b.a.b.b.PullUpCanceled);
                }
                a.this.aO = null;
                if (Math.abs(a.this.f55074b) >= Math.abs(this.f55115c)) {
                    int min = Math.min(Math.max((int) (((float) Math.abs(a.this.f55074b - this.f55115c)) / com.lynx.b.a.h.b.f55193c), 30), 100) * 10;
                    a aVar = a.this;
                    aVar.a(this.f55115c, 0, aVar.y, min);
                }
            }
        }

        RunnableC1252a(float f2, int i2) {
            this.f55118f = f2;
            this.f55115c = i2;
            this.f55116d = AnimationUtils.currentAnimationTimeMillis();
            a.this.ax.postDelayed(this, (long) this.f55114b);
            if (f2 > 0.0f) {
                a.this.ay.a(com.lynx.b.a.b.b.PullDownToRefresh);
            } else {
                a.this.ay.a(com.lynx.b.a.b.b.PullUpToLoad);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        g gVar;
        MethodCollector.i(5311);
        super.onAttachedToWindow();
        boolean z2 = true;
        this.aG = true;
        if (!isInEditMode()) {
            if (this.at == null) {
                b bVar = aJ;
                if (bVar != null) {
                    getContext();
                    b(bVar.a());
                } else {
                    b(new com.lynx.b.a.d.a(getContext()));
                }
            }
            if (this.au == null) {
                com.lynx.b.a.a.a aVar = aI;
                if (aVar != null) {
                    getContext();
                    b(aVar.a());
                } else {
                    z2 = this.B;
                    b(new com.lynx.b.a.c.a(getContext()));
                    this.B = z2;
                }
            } else {
                if (!this.B && this.U) {
                    z2 = false;
                }
                this.B = z2;
            }
            if (this.av == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    g gVar2 = this.at;
                    if ((gVar2 == null || childAt != gVar2.getView()) && ((gVar = this.au) == null || childAt != gVar.getView())) {
                        this.av = new com.lynx.b.a.e.a(childAt);
                    }
                }
            }
            if (this.av == null) {
                int a2 = com.lynx.b.a.h.b.a(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(R.string.g3u);
                super.addView(textView, 0, new c(-1));
                com.lynx.b.a.e.a aVar2 = new com.lynx.b.a.e.a(textView);
                this.av = aVar2;
                aVar2.a().setPadding(a2, a2, a2, a2);
            }
            View findViewById = findViewById(this.p);
            View findViewById2 = findViewById(this.q);
            this.av.a(this.ad);
            this.av.a(this.O);
            this.av.a(this.ay, findViewById, findViewById2);
            if (this.f55074b != 0) {
                a(com.lynx.b.a.b.b.None);
                d dVar = this.av;
                this.f55074b = 0;
                dVar.a(0, this.r, this.s);
            }
        }
        int[] iArr = this.z;
        if (iArr != null) {
            g gVar3 = this.at;
            if (gVar3 != null) {
                gVar3.setPrimaryColors(iArr);
            }
            g gVar4 = this.au;
            if (gVar4 != null) {
                gVar4.setPrimaryColors(this.z);
            }
        }
        d dVar2 = this.av;
        if (dVar2 != null) {
            super.bringChildToFront(dVar2.a());
        }
        g gVar5 = this.at;
        if (gVar5 != null && gVar5.getSpinnerStyle().f55151h) {
            super.bringChildToFront(this.at.getView());
        }
        g gVar6 = this.au;
        if (gVar6 != null && gVar6.getSpinnerStyle().f55151h) {
            super.bringChildToFront(this.au.getView());
        }
        MethodCollector.o(5311);
    }

    public static void setDefaultRefreshFooterCreator(com.lynx.b.a.a.a aVar) {
        aI = aVar;
    }

    public static void setDefaultRefreshHeaderCreator(b bVar) {
        aJ = bVar;
    }

    public static void setDefaultRefreshInitializer(c cVar) {
        aK = cVar;
    }

    public final i a(com.lynx.b.a.g.c cVar) {
        this.ac = cVar;
        return this;
    }

    public final i c(boolean z2) {
        this.A = z2;
        return this;
    }

    public static class c extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f55127a;

        /* renamed from: b  reason: collision with root package name */
        public com.lynx.b.a.b.c f55128b;

        static {
            Covode.recordClassIndex(34581);
        }

        public c(int i2) {
            super(-1, i2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a1p, R.attr.a1q});
            this.f55127a = obtainStyledAttributes.getColor(0, this.f55127a);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f55128b = com.lynx.b.a.b.c.f55149f[obtainStyledAttributes.getInt(1, com.lynx.b.a.b.c.f55144a.f55150g)];
            }
            obtainStyledAttributes.recycle();
        }
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    public final void setNestedScrollingEnabled(boolean z2) {
        this.P = z2;
        this.ah.a(z2);
    }

    public final i b(boolean z2) {
        this.U = true;
        this.B = z2;
        return this;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.core.h.n
    public final void onStopNestedScroll(View view) {
        this.ai.a(0);
        this.af = false;
        this.ae = 0;
        h();
        this.ah.b(0);
    }

    /* access modifiers changed from: protected */
    public final void setViceState(com.lynx.b.a.b.b bVar) {
        if (this.az.isDragging && this.az.isHeader != bVar.isHeader) {
            a(com.lynx.b.a.b.b.None);
        }
        if (this.aA != bVar) {
            this.aA = bVar;
        }
    }

    /* access modifiers changed from: protected */
    public final void setStateLoading(final boolean z2) {
        AnonymousClass1 r5 = new AnimatorListenerAdapter() {
            /* class com.lynx.b.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34566);
            }

            public final void onAnimationEnd(Animator animator) {
                a.this.setStateDirectLoading(z2);
            }
        };
        a(com.lynx.b.a.b.b.LoadReleased);
        ValueAnimator a2 = this.ay.a(-this.al);
        if (a2 != null) {
            a2.addListener(r5);
        }
        g gVar = this.au;
        if (gVar != null) {
            int i2 = this.al;
            gVar.a(this, i2, (int) (this.aq * ((float) i2)));
        }
        if (a2 == null) {
            r5.onAnimationEnd(null);
        }
    }

    /* access modifiers changed from: protected */
    public final void setStateRefreshing(final boolean z2) {
        AnonymousClass3 r5 = new AnimatorListenerAdapter() {
            /* class com.lynx.b.a.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(34568);
            }

            public final void onAnimationEnd(Animator animator) {
                a.this.aB = System.currentTimeMillis();
                a.this.a(com.lynx.b.a.b.b.Refreshing);
                if (a.this.aa != null) {
                    if (z2) {
                        a.this.aa.a(a.this);
                    }
                } else if (a.this.ac == null) {
                    a.this.d();
                }
                if (a.this.at != null) {
                    g gVar = a.this.at;
                    a aVar = a.this;
                    gVar.b(aVar, aVar.aj, (int) (a.this.ap * ((float) a.this.aj)));
                }
                if (a.this.ac != null && (a.this.at instanceof f) && z2) {
                    a.this.ac.a(a.this);
                }
            }
        };
        a(com.lynx.b.a.b.b.RefreshReleased);
        ValueAnimator a2 = this.ay.a(this.aj);
        if (a2 != null) {
            a2.addListener(r5);
        }
        g gVar = this.at;
        if (gVar != null) {
            int i2 = this.aj;
            gVar.a(this, i2, (int) (this.ap * ((float) i2)));
        }
        com.lynx.b.a.g.c cVar = this.ac;
        if (cVar != null && (this.at instanceof f)) {
            cVar.a();
        }
        if (a2 == null) {
            r5.onAnimationEnd(null);
        }
    }

    private boolean a(int i2) {
        if (i2 == 0) {
            if (this.aP != null) {
                if (this.az.isFinishing || this.az == com.lynx.b.a.b.b.TwoLevelReleased) {
                    return true;
                }
                if (this.az == com.lynx.b.a.b.b.PullDownCanceled) {
                    this.ay.a(com.lynx.b.a.b.b.PullDownToRefresh);
                } else if (this.az == com.lynx.b.a.b.b.PullUpCanceled) {
                    this.ay.a(com.lynx.b.a.b.b.PullUpToLoad);
                }
                this.aP.cancel();
                this.aP = null;
            }
            this.aO = null;
        }
        if (this.aP != null) {
            return true;
        }
        return false;
    }

    private i b(e eVar) {
        boolean z2;
        g gVar;
        MethodCollector.i(5633);
        g gVar2 = this.au;
        if (gVar2 != null) {
            super.removeView(gVar2.getView());
        }
        this.au = eVar;
        this.aH = false;
        this.aD = 0;
        this.T = false;
        this.aF = false;
        this.am = this.am.a();
        if (!this.U || this.B) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.B = z2;
        if (this.au.getSpinnerStyle().f55151h) {
            super.addView(this.au.getView(), getChildCount(), new c(-2));
        } else {
            super.addView(this.au.getView(), 0, new c(-2));
        }
        int[] iArr = this.z;
        if (!(iArr == null || (gVar = this.au) == null)) {
            gVar.setPrimaryColors(iArr);
        }
        MethodCollector.o(5633);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void setStateDirectLoading(boolean z2) {
        if (this.az != com.lynx.b.a.b.b.Loading) {
            this.aB = System.currentTimeMillis();
            this.aH = true;
            a(com.lynx.b.a.b.b.Loading);
            com.lynx.b.a.g.b bVar = this.ab;
            if (bVar != null) {
                if (z2) {
                    bVar.a_(this);
                }
            } else if (this.ac == null) {
                e();
            }
            g gVar = this.au;
            if (gVar != null) {
                int i2 = this.al;
                gVar.b(this, i2, (int) (this.aq * ((float) i2)));
            }
            com.lynx.b.a.g.c cVar = this.ac;
            if (cVar != null && (this.au instanceof e) && z2) {
                cVar.a_(this);
            }
        }
    }

    private i b(f fVar) {
        g gVar;
        MethodCollector.i(5619);
        g gVar2 = this.at;
        if (gVar2 != null) {
            super.removeView(gVar2.getView());
        }
        this.at = fVar;
        this.aC = 0;
        this.aE = false;
        this.ak = this.ak.a();
        if (this.at.getSpinnerStyle().f55151h) {
            super.addView(this.at.getView(), getChildCount(), new c(-2));
        } else {
            super.addView(this.at.getView(), 0, new c(-2));
        }
        int[] iArr = this.z;
        if (!(iArr == null || (gVar = this.at) == null)) {
            gVar.setPrimaryColors(iArr);
        }
        MethodCollector.o(5619);
        return this;
    }

    public final i d(boolean z2) {
        if (this.az == com.lynx.b.a.b.b.Refreshing && z2) {
            a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.aB))), 300) << 16, Boolean.TRUE);
        } else if (this.az == com.lynx.b.a.b.b.Loading && z2) {
            f();
        } else if (this.S != z2) {
            this.S = z2;
            g gVar = this.au;
            if (gVar instanceof e) {
                if (((e) gVar).a(z2)) {
                    this.T = true;
                    if (this.S && this.G && this.f55074b > 0 && this.au.getSpinnerStyle() == com.lynx.b.a.b.c.f55144a && a(this.B) && a(this.A, this.at)) {
                        this.au.getView().setTranslationY((float) this.f55074b);
                    }
                } else {
                    this.T = false;
                    new RuntimeException("Footer:" + this.au + " NoMoreData is not supported");
                }
            }
        }
        return this;
    }

    private boolean b(float f2) {
        if (f2 == 0.0f) {
            f2 = (float) this.v;
        }
        if (Build.VERSION.SDK_INT > 27 && this.av != null) {
            getScaleY();
            View a2 = this.av.a();
            if (getScaleY() == -1.0f && a2.getScaleY() == -1.0f) {
                f2 = -f2;
            }
        }
        if (Math.abs(f2) > ((float) this.t)) {
            if (((float) this.f55074b) * f2 < 0.0f) {
                if (this.az == com.lynx.b.a.b.b.Refreshing || this.az == com.lynx.b.a.b.b.Loading || (this.f55074b < 0 && this.S)) {
                    this.aO = new b(f2).a();
                    return true;
                } else if (this.az.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f2 < 0.0f && ((this.I && (this.B || this.J)) || ((this.az == com.lynx.b.a.b.b.Loading && this.f55074b >= 0) || (this.K && a(this.B))))) || (f2 > 0.0f && ((this.I && this.A) || this.J || (this.az == com.lynx.b.a.b.b.Refreshing && this.f55074b <= 0)))) {
                this.aM = false;
                this.w.fling(0, 0, 0, (int) (-f2), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.w.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    public final i a(View view) {
        MethodCollector.i(5645);
        d dVar = this.av;
        if (dVar != null) {
            super.removeView(dVar.a());
        }
        super.addView(view, getChildCount(), new c(-1));
        this.av = new com.lynx.b.a.e.a(view);
        if (this.aG) {
            View findViewById = findViewById(this.p);
            View findViewById2 = findViewById(this.q);
            this.av.a(this.ad);
            this.av.a(this.O);
            this.av.a(this.ay, findViewById, findViewById2);
        }
        g gVar = this.at;
        if (gVar != null && gVar.getSpinnerStyle().f55151h) {
            super.bringChildToFront(this.at.getView());
        }
        g gVar2 = this.au;
        if (gVar2 != null && gVar2.getSpinnerStyle().f55151h) {
            super.bringChildToFront(this.au.getView());
        }
        MethodCollector.o(5645);
        return this;
    }

    public final i a(e eVar) {
        return b(eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0112, code lost:
        if (r15 != 3) goto L_0x0114;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r21) {
        /*
        // Method dump skipped, instructions count: 869
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.b.a.a.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final i a(f fVar) {
        return b(fVar);
    }

    private i a(int i2, Boolean bool) {
        int i3 = (i2 << 16) >> 16;
        AnonymousClass7 r3 = new Runnable(i2 >> 16, bool, true) {
            /* class com.lynx.b.a.a.AnonymousClass7 */

            /* renamed from: a  reason: collision with root package name */
            int f55094a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f55095b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Boolean f55096c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f55097d = true;

            static {
                Covode.recordClassIndex(34572);
            }

            public final void run() {
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
                if (this.f55094a == 0) {
                    if (a.this.az == com.lynx.b.a.b.b.None && a.this.aA == com.lynx.b.a.b.b.Refreshing) {
                        a.this.aA = com.lynx.b.a.b.b.None;
                    } else if (a.this.aP != null && a.this.az.isHeader && (a.this.az.isDragging || a.this.az == com.lynx.b.a.b.b.RefreshReleased)) {
                        ValueAnimator valueAnimator = a.this.aP;
                        a.this.aP = null;
                        valueAnimator.cancel();
                        a.this.ay.a(com.lynx.b.a.b.b.None);
                    } else if (!(a.this.az != com.lynx.b.a.b.b.Refreshing || a.this.at == null || a.this.av == null)) {
                        this.f55094a++;
                        a.this.ax.postDelayed(this, (long) this.f55095b);
                        a.this.a(com.lynx.b.a.b.b.RefreshFinish);
                        if (this.f55096c == Boolean.FALSE) {
                            a.this.d(false);
                        }
                    }
                    if (this.f55096c == Boolean.TRUE) {
                        a.this.d(true);
                        return;
                    }
                    return;
                }
                int a2 = a.this.at.a(a.this, this.f55097d);
                if (a2 < Integer.MAX_VALUE) {
                    if (a.this.n || a.this.af) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (a.this.n) {
                            a aVar = a.this;
                            aVar.f55081i = aVar.f55083k;
                            a.this.f55076d = 0;
                            a.this.n = false;
                            a aVar2 = a.this;
                            a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, aVar2.f55082j, (a.this.f55083k + ((float) a.this.f55074b)) - ((float) (a.this.f55073a * 2)), 0));
                            a aVar3 = a.this;
                            a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, aVar3.f55082j, a.this.f55083k + ((float) a.this.f55074b), 0));
                        }
                        if (a.this.af) {
                            a.this.ae = 0;
                            a aVar4 = a.this;
                            a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, aVar4.f55082j, a.this.f55083k, 0));
                            a.this.af = false;
                            a.this.f55076d = 0;
                        }
                    }
                    if (a.this.f55074b > 0) {
                        a aVar5 = a.this;
                        ValueAnimator a3 = aVar5.a(0, a2, aVar5.y, a.this.f55078f);
                        if (a.this.N) {
                            animatorUpdateListener = a.this.av.a(a.this.f55074b);
                        }
                        if (a3 != null && animatorUpdateListener != null) {
                            a3.addUpdateListener(animatorUpdateListener);
                        }
                    } else if (a.this.f55074b < 0) {
                        a aVar6 = a.this;
                        aVar6.a(0, a2, aVar6.y, a.this.f55078f);
                    } else {
                        a.this.ay.a(0, false);
                        a.this.ay.a(com.lynx.b.a.b.b.None);
                    }
                }
            }

            {
                this.f55095b = r3;
                this.f55096c = r4;
            }
        };
        if (i3 > 0) {
            this.ax.postDelayed(r3, (long) i3);
        } else {
            r3.run();
        }
        return this;
    }

    private i a(int i2, boolean z2) {
        int i3 = (i2 << 16) >> 16;
        AnonymousClass8 r3 = new Runnable(i2 >> 16, z2, true) {
            /* class com.lynx.b.a.a.AnonymousClass8 */

            /* renamed from: a  reason: collision with root package name */
            int f55099a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f55100b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f55101c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f55102d = true;

            static {
                Covode.recordClassIndex(34573);
            }

            public final void run() {
                int i2;
                long j2;
                int i3;
                boolean z = true;
                if (this.f55099a == 0) {
                    if (a.this.az == com.lynx.b.a.b.b.None && a.this.aA == com.lynx.b.a.b.b.Loading) {
                        a.this.aA = com.lynx.b.a.b.b.None;
                    } else if (a.this.aP != null && ((a.this.az.isDragging || a.this.az == com.lynx.b.a.b.b.LoadReleased) && a.this.az.isFooter)) {
                        ValueAnimator valueAnimator = a.this.aP;
                        a.this.aP = null;
                        valueAnimator.cancel();
                        a.this.ay.a(com.lynx.b.a.b.b.None);
                    } else if (!(a.this.az != com.lynx.b.a.b.b.Loading || a.this.au == null || a.this.av == null)) {
                        this.f55099a++;
                        a.this.ax.postDelayed(this, (long) this.f55100b);
                        a.this.a(com.lynx.b.a.b.b.LoadFinish);
                        return;
                    }
                    if (this.f55101c) {
                        a.this.d(true);
                        return;
                    }
                    return;
                }
                int a2 = a.this.au.a(a.this, this.f55102d);
                if (a2 < Integer.MAX_VALUE) {
                    if (!this.f55101c || !a.this.G || a.this.f55074b >= 0 || !a.this.av.d()) {
                        z = false;
                    }
                    int i4 = a.this.f55074b;
                    if (z) {
                        i2 = Math.max(a.this.f55074b, -a.this.al);
                    } else {
                        i2 = 0;
                    }
                    final int i5 = i4 - i2;
                    if (a.this.n || a.this.af) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (a.this.n) {
                            a aVar = a.this;
                            aVar.f55081i = aVar.f55083k;
                            a aVar2 = a.this;
                            aVar2.f55076d = aVar2.f55074b - i5;
                            a.this.n = false;
                            if (a.this.F) {
                                i3 = i5;
                            } else {
                                i3 = 0;
                            }
                            a aVar3 = a.this;
                            float f2 = (float) i3;
                            a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, aVar3.f55082j, a.this.f55083k + f2 + ((float) (a.this.f55073a * 2)), 0));
                            a aVar4 = a.this;
                            a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, aVar4.f55082j, a.this.f55083k + f2, 0));
                        }
                        if (a.this.af) {
                            a.this.ae = 0;
                            a aVar5 = a.this;
                            a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, aVar5.f55082j, a.this.f55083k, 0));
                            a.this.af = false;
                            a.this.f55076d = 0;
                        }
                    }
                    Handler handler = a.this.ax;
                    AnonymousClass1 r3 = new Runnable() {
                        /* class com.lynx.b.a.a.AnonymousClass8.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(34574);
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                            // Method dump skipped, instructions count: 200
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.lynx.b.a.a.AnonymousClass8.AnonymousClass1.run():void");
                        }
                    };
                    if (a.this.f55074b < 0) {
                        j2 = (long) a2;
                    } else {
                        j2 = 0;
                    }
                    handler.postDelayed(r3, j2);
                }
            }

            {
                this.f55100b = r3;
                this.f55101c = r4;
            }
        };
        if (i3 > 0) {
            this.ax.postDelayed(r3, (long) i3);
        } else {
            r3.run();
        }
        return this;
    }

    private a(Context context, byte b2) {
        super(context, null);
        boolean z2;
        boolean z3;
        boolean z4;
        com.lynx.b.a.b.a aVar;
        com.lynx.b.a.b.a aVar2;
        MethodCollector.i(5290);
        this.f55077e = 300;
        this.f55078f = 300;
        this.f55084l = 0.5f;
        this.f55085m = 'n';
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.A = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.F = true;
        this.H = true;
        this.I = true;
        this.K = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.ag = new int[2];
        this.ah = new m(this);
        this.ai = new q();
        this.ak = com.lynx.b.a.b.a.f55130a;
        this.am = com.lynx.b.a.b.a.f55130a;
        this.ap = 2.5f;
        this.aq = 2.5f;
        this.ar = 1.0f;
        this.as = 1.0f;
        this.ay = new d();
        this.az = com.lynx.b.a.b.b.None;
        this.aA = com.lynx.b.a.b.b.None;
        this.aB = 0;
        this.aC = 0;
        this.aD = 0;
        this.aH = false;
        this.aM = false;
        this.aN = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ax = new Handler();
        this.w = new Scroller(context);
        this.x = VelocityTracker.obtain();
        this.f55079g = context.getResources().getDisplayMetrics().heightPixels;
        this.y = new com.lynx.b.a.h.b(com.lynx.b.a.h.b.f55191a);
        this.f55073a = viewConfiguration.getScaledTouchSlop();
        this.t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.u = viewConfiguration.getScaledMaximumFlingVelocity();
        this.al = com.lynx.b.a.h.b.a(60.0f);
        this.aj = com.lynx.b.a.h.b.a(100.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16842986, 16842987, R.attr.ad6, R.attr.ad9, R.attr.ad_, R.attr.ada, R.attr.adh, R.attr.adi, R.attr.adj, R.attr.adk, R.attr.adl, R.attr.adm, R.attr.adn, R.attr.adq, R.attr.adr, R.attr.ads, R.attr.adt, R.attr.adu, R.attr.adv, R.attr.adx, R.attr.ady, R.attr.adz, R.attr.ae0, R.attr.ae3, R.attr.ae4, R.attr.ae7, R.attr.ae8, R.attr.ae9, R.attr.ae_, R.attr.aea, R.attr.aeb, R.attr.aec, R.attr.aed, R.attr.aee, R.attr.aef, R.attr.aei, R.attr.aej});
        if (!obtainStyledAttributes.hasValue(1)) {
            super.setClipToPadding(false);
        }
        if (!obtainStyledAttributes.hasValue(0)) {
            super.setClipChildren(false);
        }
        this.f55084l = obtainStyledAttributes.getFloat(5, this.f55084l);
        this.ap = obtainStyledAttributes.getFloat(32, this.ap);
        this.aq = obtainStyledAttributes.getFloat(27, this.aq);
        this.ar = obtainStyledAttributes.getFloat(34, this.ar);
        this.as = obtainStyledAttributes.getFloat(29, this.as);
        this.A = obtainStyledAttributes.getBoolean(20, this.A);
        this.f55078f = obtainStyledAttributes.getInt(36, this.f55078f);
        this.B = obtainStyledAttributes.getBoolean(13, this.B);
        this.aj = obtainStyledAttributes.getDimensionPixelOffset(30, this.aj);
        this.al = obtainStyledAttributes.getDimensionPixelOffset(25, this.al);
        this.an = obtainStyledAttributes.getDimensionPixelOffset(31, this.an);
        this.ao = obtainStyledAttributes.getDimensionPixelOffset(26, this.ao);
        this.Q = obtainStyledAttributes.getBoolean(4, this.Q);
        this.R = obtainStyledAttributes.getBoolean(3, this.R);
        this.E = obtainStyledAttributes.getBoolean(12, this.E);
        this.F = obtainStyledAttributes.getBoolean(11, this.F);
        this.H = obtainStyledAttributes.getBoolean(18, this.H);
        this.K = obtainStyledAttributes.getBoolean(6, this.K);
        this.I = obtainStyledAttributes.getBoolean(16, this.I);
        this.L = obtainStyledAttributes.getBoolean(19, this.L);
        this.M = obtainStyledAttributes.getBoolean(21, this.M);
        this.N = obtainStyledAttributes.getBoolean(22, this.N);
        this.O = obtainStyledAttributes.getBoolean(14, this.O);
        boolean z5 = obtainStyledAttributes.getBoolean(9, this.G);
        this.G = z5;
        this.G = obtainStyledAttributes.getBoolean(10, z5);
        this.C = obtainStyledAttributes.getBoolean(8, this.C);
        this.D = obtainStyledAttributes.getBoolean(7, this.D);
        this.J = obtainStyledAttributes.getBoolean(17, this.J);
        this.p = obtainStyledAttributes.getResourceId(24, this.p);
        this.q = obtainStyledAttributes.getResourceId(23, this.q);
        this.r = obtainStyledAttributes.getResourceId(33, this.r);
        this.s = obtainStyledAttributes.getResourceId(28, this.s);
        boolean z6 = obtainStyledAttributes.getBoolean(15, this.P);
        this.P = z6;
        this.ah.a(z6);
        if (this.U || obtainStyledAttributes.hasValue(13)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.U = z2;
        if (this.V || obtainStyledAttributes.hasValue(12)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.V = z3;
        if (this.W || obtainStyledAttributes.hasValue(11)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.W = z4;
        if (obtainStyledAttributes.hasValue(30)) {
            aVar = com.lynx.b.a.b.a.f55136g;
        } else {
            aVar = this.ak;
        }
        this.ak = aVar;
        if (obtainStyledAttributes.hasValue(25)) {
            aVar2 = com.lynx.b.a.b.a.f55136g;
        } else {
            aVar2 = this.am;
        }
        this.am = aVar2;
        int color = obtainStyledAttributes.getColor(2, 0);
        int color2 = obtainStyledAttributes.getColor(35, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.z = new int[]{color2, color};
            } else {
                this.z = new int[]{color2};
            }
        } else if (color != 0) {
            this.z = new int[]{0, color};
        }
        if (this.L && !this.U && !this.B) {
            this.B = true;
        }
        obtainStyledAttributes.recycle();
        MethodCollector.o(5290);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 788
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.b.a.a.onMeasure(int, int):void");
    }

    @Override // androidx.core.h.n
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        if ((!this.aH || f3 <= 0.0f) && !b(-f3) && !this.ah.a(f2, f3)) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.h.n
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.ai.a(i2, 0);
        this.ah.a(i2 & 2, 0);
        this.ae = this.f55074b;
        this.af = true;
        a(0);
    }

    @Override // androidx.core.h.n
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if (!isEnabled() || !isNestedScrollingEnabled() || (i2 & 2) == 0 || (!this.J && !this.A && !this.B)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        View view2;
        Paint paint;
        Paint paint2;
        d dVar = this.av;
        if (dVar != null) {
            view2 = dVar.a();
        } else {
            view2 = null;
        }
        g gVar = this.at;
        if (gVar != null && gVar.getView() == view) {
            if (!a(this.A) || (!this.H && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int max = Math.max(view2.getTop() + view2.getPaddingTop() + this.f55074b, view.getTop());
                int i2 = this.aC;
                if (!(i2 == 0 || (paint2 = this.aw) == null)) {
                    paint2.setColor(i2);
                    if (this.at.getSpinnerStyle().f55152i) {
                        max = view.getBottom();
                    } else if (this.at.getSpinnerStyle() == com.lynx.b.a.b.c.f55144a) {
                        max = view.getBottom() + this.f55074b;
                    }
                    canvas.drawRect(0.0f, (float) view.getTop(), (float) getWidth(), (float) max, this.aw);
                }
                if (this.C && this.at.getSpinnerStyle() == com.lynx.b.a.b.c.f55146c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), max);
                    boolean drawChild = super.drawChild(canvas, view, j2);
                    canvas.restore();
                    return drawChild;
                }
            }
        }
        g gVar2 = this.au;
        if (gVar2 != null && gVar2.getView() == view) {
            if (!a(this.B) || (!this.H && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int min = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f55074b, view.getBottom());
                int i3 = this.aD;
                if (!(i3 == 0 || (paint = this.aw) == null)) {
                    paint.setColor(i3);
                    if (this.au.getSpinnerStyle().f55152i) {
                        min = view.getTop();
                    } else if (this.au.getSpinnerStyle() == com.lynx.b.a.b.c.f55144a) {
                        min = view.getTop() + this.f55074b;
                    }
                    canvas.drawRect(0.0f, (float) min, (float) getWidth(), (float) view.getBottom(), this.aw);
                }
                if (this.D && this.au.getSpinnerStyle() == com.lynx.b.a.b.c.f55146c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), min, view.getRight(), view.getBottom());
                    boolean drawChild2 = super.drawChild(canvas, view, j2);
                    canvas.restore();
                    return drawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // androidx.core.h.n
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return this.ah.a(f2, f3, z2);
    }

    @Override // androidx.core.h.n
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        int i4 = this.ae;
        int i5 = 0;
        if (i3 * i4 > 0) {
            if (Math.abs(i3) > Math.abs(this.ae)) {
                int i6 = this.ae;
                this.ae = 0;
                i5 = i6;
            } else {
                this.ae -= i3;
                i5 = i3;
            }
            a((float) this.ae);
        } else if (i3 > 0 && this.aH) {
            int i7 = i4 - i3;
            this.ae = i7;
            a((float) i7);
            i5 = i3;
        }
        this.ah.a(i2, i3 - i5, iArr, null);
        iArr[1] = iArr[1] + i5;
    }

    /* access modifiers changed from: protected */
    public final ValueAnimator a(int i2, int i3, Interpolator interpolator, int i4) {
        if (this.f55074b == i2) {
            return null;
        }
        ValueAnimator valueAnimator = this.aP;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.aO = null;
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f55074b, i2);
        this.aP = ofInt;
        ofInt.setDuration((long) i4);
        this.aP.setInterpolator(interpolator);
        this.aP.addListener(new AnimatorListenerAdapter() {
            /* class com.lynx.b.a.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(34569);
            }

            public final void onAnimationEnd(Animator animator) {
                a.this.aP = null;
                if (a.this.f55074b == 0 && a.this.az != com.lynx.b.a.b.b.None && !a.this.az.isOpening && !a.this.az.isDragging) {
                    a.this.a(com.lynx.b.a.b.b.None);
                } else if (a.this.az != a.this.aA) {
                    a aVar = a.this;
                    aVar.setViceState(aVar.az);
                }
            }
        });
        this.aP.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.lynx.b.a.a.AnonymousClass5 */

            static {
                Covode.recordClassIndex(34570);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                a.this.ay.a(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
            }
        });
        this.aP.setStartDelay((long) i3);
        this.aP.start();
        return this.aP;
    }

    @Override // androidx.core.h.n
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        com.lynx.b.a.b.b bVar;
        j jVar;
        j jVar2;
        boolean a2 = this.ah.a(i2, i3, i4, i5, this.ag);
        int i6 = i5 + this.ag[1];
        if (i6 >= 0 ? !(i6 <= 0 || ((!this.B && !this.J) || (this.ae == 0 && (jVar = this.ad) != null && !jVar.b(this.av.a())))) : !((!this.A && !this.J) || (this.ae == 0 && (jVar2 = this.ad) != null && !jVar2.a(this.av.a())))) {
            if (this.aA == com.lynx.b.a.b.b.None || this.aA.isOpening) {
                h hVar = this.ay;
                if (i6 > 0) {
                    bVar = com.lynx.b.a.b.b.PullUpToLoad;
                } else {
                    bVar = com.lynx.b.a.b.b.PullDownToRefresh;
                }
                hVar.a(bVar);
                if (!a2) {
                    ViewParent parent = getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            int i7 = this.ae - i6;
            this.ae = i7;
            a((float) i7);
        }
        if (this.aH && i3 < 0) {
            this.aH = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i6;
        int i7;
        int i8;
        boolean z3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        boolean z4;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = super.getChildAt(i9);
            if (!(childAt.getVisibility() == 8 || childAt.getTag(R.string.g3t) == childAt)) {
                d dVar = this.av;
                boolean z5 = true;
                if (dVar != null && dVar.a() == childAt) {
                    if (!isInEditMode() || !this.H || !a(this.A) || this.at == null) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    View a2 = this.av.a();
                    ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams3 = aL;
                    }
                    int i10 = marginLayoutParams3.leftMargin + paddingLeft;
                    int i11 = marginLayoutParams3.topMargin + paddingTop;
                    int measuredWidth = a2.getMeasuredWidth() + i10;
                    int measuredHeight = a2.getMeasuredHeight() + i11;
                    if (z4 && a(this.E, this.at)) {
                        int i12 = this.aj;
                        i11 += i12;
                        measuredHeight += i12;
                    }
                    a2.layout(i10, i11, measuredWidth, measuredHeight);
                }
                g gVar = this.at;
                if (gVar != null && gVar.getView() == childAt) {
                    if (!isInEditMode() || !this.H || !a(this.A)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    View view = this.at.getView();
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams2 = aL;
                    }
                    int i13 = marginLayoutParams2.leftMargin;
                    int i14 = marginLayoutParams2.topMargin + this.an;
                    int measuredWidth2 = view.getMeasuredWidth() + i13;
                    int measuredHeight2 = view.getMeasuredHeight() + i14;
                    if (!z3 && this.at.getSpinnerStyle() == com.lynx.b.a.b.c.f55144a) {
                        int i15 = this.aj;
                        i14 -= i15;
                        measuredHeight2 -= i15;
                    }
                    view.layout(i13, i14, measuredWidth2, measuredHeight2);
                }
                g gVar2 = this.au;
                if (gVar2 != null && gVar2.getView() == childAt) {
                    if (!isInEditMode() || !this.H || !a(this.B)) {
                        z5 = false;
                    }
                    View view2 = this.au.getView();
                    ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    } else {
                        marginLayoutParams = aL;
                    }
                    com.lynx.b.a.b.c spinnerStyle = this.au.getSpinnerStyle();
                    int i16 = marginLayoutParams.leftMargin;
                    int measuredHeight3 = (marginLayoutParams.topMargin + getMeasuredHeight()) - this.ao;
                    if (this.S && this.T && this.G && this.av != null && this.au.getSpinnerStyle() == com.lynx.b.a.b.c.f55144a && a(this.B)) {
                        View a3 = this.av.a();
                        ViewGroup.LayoutParams layoutParams4 = a3.getLayoutParams();
                        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                            i8 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                        } else {
                            i8 = 0;
                        }
                        measuredHeight3 = a3.getMeasuredHeight() + paddingTop + paddingTop + i8;
                    }
                    if (spinnerStyle == com.lynx.b.a.b.c.f55148e) {
                        measuredHeight3 = marginLayoutParams.topMargin - this.ao;
                    } else {
                        if (z5 || spinnerStyle == com.lynx.b.a.b.c.f55147d || spinnerStyle == com.lynx.b.a.b.c.f55146c) {
                            i6 = this.al;
                        } else if (spinnerStyle.f55152i && this.f55074b < 0) {
                            if (a(this.B)) {
                                i7 = -this.f55074b;
                            } else {
                                i7 = 0;
                            }
                            i6 = Math.max(i7, 0);
                        }
                        measuredHeight3 -= i6;
                    }
                    view2.layout(i16, measuredHeight3, view2.getMeasuredWidth() + i16, view2.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }
}
