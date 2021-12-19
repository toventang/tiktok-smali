package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.m;
import com.ss.android.ugc.aweme.shortvideo.cut.model.ScrollInterceptedLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.b;
import com.ss.android.ugc.aweme.shortvideo.cut.model.c;
import com.ss.android.ugc.aweme.shortvideo.cut.model.d;
import com.ss.android.ugc.aweme.shortvideo.cut.u;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.aweme.shortvideo.widget.p;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.StyleTextView;
import com.ss.android.ugc.tools.view.style.f;
import com.ss.android.ugc.tools.view.widget.j;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class VideoEditView extends a implements View.OnTouchListener {
    public AudioTrackView A;
    View B;
    View C;
    b D;
    b E;
    p F;
    protected float G;
    protected float H;
    protected int I;
    protected int J;
    protected int K;
    protected int L;
    protected boolean M;
    protected c N;
    protected d O;
    protected int P;
    protected int Q;
    protected int R;
    protected int S;
    protected int T;
    private long U;
    private float V;
    private float W;
    private boolean aA;
    private boolean aB;
    private long aC;
    private float aD;
    private RecyclerView.n aE;
    private boolean aF;
    private boolean aG;
    private float aa;
    private boolean ab;
    private boolean ac;
    private w ad;
    private PopupWindow ae;
    private long af;
    private int ag;
    private int ah;
    private int ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private g am;
    private t<Bitmap> an;
    private t<Boolean> ao;
    private boolean ap;
    private boolean aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private int ay;
    private int az;

    /* renamed from: b  reason: collision with root package name */
    private long f126106b;

    /* renamed from: c  reason: collision with root package name */
    protected int f126107c;

    /* renamed from: d  reason: collision with root package name */
    e f126108d;

    /* renamed from: e  reason: collision with root package name */
    VideoEditViewModel f126109e;

    /* renamed from: f  reason: collision with root package name */
    CutMultiVideoViewModel f126110f;

    /* renamed from: g  reason: collision with root package name */
    protected RTLImageView f126111g;

    /* renamed from: h  reason: collision with root package name */
    protected RTLImageView f126112h;

    /* renamed from: i  reason: collision with root package name */
    protected TextView f126113i;

    /* renamed from: j  reason: collision with root package name */
    protected TextView f126114j;

    /* renamed from: k  reason: collision with root package name */
    protected FrameLayout.LayoutParams f126115k;

    /* renamed from: l  reason: collision with root package name */
    protected FrameLayout.LayoutParams f126116l;

    /* renamed from: m  reason: collision with root package name */
    protected View f126117m;
    protected View n;
    protected View o;
    protected View p;
    protected View q;
    RTLLinearLayout r;
    ImageView s;
    protected boolean t;
    protected boolean u;
    protected boolean v;
    protected b w;
    FrameLayout x;
    MVRecycleView y;
    MVRecycleView z;

    static {
        Covode.recordClassIndex(82815);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void a(List<VideoSegment> list) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void a(boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void e() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void f() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getLeftSeekingValue() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getPlayingPosition() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getRightSeekingValue() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setDefaultMode(boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setMultiEditEnableForStickPointMode(boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public boolean d() {
        return this.v;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public int getEditState() {
        return this.J;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a
    public View getEndSlide() {
        return this.f126111g;
    }

    public int getFrameHeight() {
        return this.P;
    }

    public int getFrameWidth() {
        return this.av;
    }

    public int getLeftRightMargin() {
        return this.R;
    }

    public long getMaxVideoLength() {
        return this.U;
    }

    public long getMinVideoLength() {
        return this.f126106b;
    }

    public int getOverXScroll() {
        return this.I;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a
    public View getStartSlide() {
        return this.f126112h;
    }

    public g getVeEditor() {
        return this.am;
    }

    public VideoEditViewModel getVideoEditViewModel() {
        return this.f126109e;
    }

    public w getViewConfig() {
        return this.ad;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final boolean a(e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, String str) {
        MediaModel mediaModel;
        this.f126110f = cutMultiVideoViewModel;
        if (cutMultiVideoViewModel.f125336k) {
            mediaModel = new MediaModel(-1);
            mediaModel.f109390b = str;
            mediaModel.f109400l = 720;
            mediaModel.f109401m = 1280;
            mediaModel.f109396h = (long) cutMultiVideoViewModel.f125337l;
        } else {
            VEUtils.VEVideoFileInfo a2 = u.a(str);
            if (a2 == null) {
                return false;
            }
            mediaModel = new MediaModel(-1);
            mediaModel.f109390b = str;
            mediaModel.f109400l = a2.width;
            mediaModel.f109401m = a2.height;
            mediaModel.f109396h = (long) a2.duration;
        }
        return a(eVar, cutMultiVideoViewModel, Collections.singletonList(mediaModel));
    }

    public final boolean a(e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, p pVar, List<MediaModel> list) {
        this.F = pVar;
        return a(eVar, cutMultiVideoViewModel, list);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final boolean a(e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list) {
        return a(eVar, cutMultiVideoViewModel, null, i.a(list), list.size() > 1 ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final boolean a(e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, List<VideoSegment> list, int i2) {
        this.J = i2;
        this.f126108d = eVar;
        this.f126110f = cutMultiVideoViewModel;
        if (videoEditViewModel == null) {
            this.f126109e = (VideoEditViewModel) ae.a(eVar, (ad.b) null).a(VideoEditViewModel.class);
        } else {
            this.f126109e = videoEditViewModel;
        }
        a(cutMultiVideoViewModel, list);
        s();
        this.ak = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Long l2) {
        float d2;
        float f2;
        float f3;
        if (l2 != null) {
            this.af = l2.longValue();
            com.ss.android.ugc.tools.c.f149151f.a(a.a(Locale.getDefault(), "VEEffectSeekLayout->getOriginVideoPlayProgress: duration: %d", new Object[]{Long.valueOf(this.af)}));
            int i2 = this.J;
            long j2 = this.af;
            if (!this.u) {
                com.ss.android.ugc.tools.c.f149151f.a(a.a(Locale.getDefault(), "VEEffectSeekLayout->updateCurPointerLocation: editState: %d, currentOriginProgress: %d", new Object[]{Integer.valueOf(i2), Long.valueOf(j2)}));
                if (!(j2 == -1 || j2 == 1)) {
                    float f4 = 0.0f;
                    if (i2 == 1) {
                        b bVar = this.w;
                        List<VideoSegment> k2 = this.f126109e.k();
                        float l3 = this.f126109e.l();
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < k2.size(); i3++) {
                            if (!k2.get(i3).f125485i) {
                                arrayList.add(k2.get(i3));
                            }
                        }
                        long j3 = j2;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList.size()) {
                                i4 = 0;
                                break;
                            }
                            VideoSegment videoSegment = (VideoSegment) arrayList.get(i4);
                            long e2 = (long) (((float) (videoSegment.e() - videoSegment.d())) / (videoSegment.f() * l3));
                            if (j3 <= e2) {
                                break;
                            }
                            f4 += ((float) e2) / bVar.f125494e;
                            j3 -= e2;
                            i4++;
                        }
                        if (!arrayList.isEmpty()) {
                            if (i4 != 0 || ((VideoSegment) arrayList.get(i4)).d() == 0) {
                                d2 = (float) (j3 - ((VideoSegment) arrayList.get(i4)).d());
                                f2 = l3 * ((VideoSegment) arrayList.get(i4)).f();
                                f3 = bVar.f125494e;
                            } else {
                                d2 = (float) j3;
                                f2 = l3 * ((VideoSegment) arrayList.get(i4)).f();
                                f3 = bVar.f125494e;
                            }
                            f4 += d2 / (f2 * f3);
                        }
                        f4 -= this.G;
                    } else if (i2 == 2 || i2 == 0) {
                        f4 = ((((float) j2) * 1.0f) / (this.O.f125506d * this.w.f125494e)) - this.G;
                    }
                    this.f126112h.getStartX();
                    com.ss.android.ugc.tools.c.f149151f.a("VEEffectSeekLayout->updateCurPointerLocation2: width = " + f4 + ";time = " + j2 + " startSlideX = " + this.f126112h.getStartX() + " startToZero = " + this.G);
                    a(this.f126112h.getStartX() + f4, false);
                }
            }
        }
    }

    public void a(VideoSegment videoSegment) {
        this.J = 1;
        this.f126109e.a(1);
        d dVar = this.O;
        if (dVar != null) {
            dVar.a();
        }
        c cVar = this.N;
        if (cVar != null) {
            cVar.a();
        }
        this.f126109e.b(videoSegment.a(true));
        this.w.a(this.f126109e.k(), this.f126109e.l());
        int i2 = this.T;
        a((float) i2, (float) ((this.f126107c - i2) - m.f125471d), 0);
        a(videoSegment, 3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void a(androidx.core.g.e<Float, Float> eVar, boolean z2) {
        if (z2) {
            if (eVar.f2397a != null) {
                this.N.f125500a = eVar.f2397a.floatValue();
            }
            if (eVar.f2398b != null) {
                this.N.f125501b = eVar.f2398b.floatValue();
            }
            this.w.a(this.f126109e.k(), this.f126109e.l());
            a(this.N.f125500a, this.N.f125501b, this.N.f125502c);
            return;
        }
        a(eVar.f2397a.floatValue(), eVar.f2398b.floatValue(), 0);
        this.z.postDelayed(new r(this), 10);
    }

    /* access modifiers changed from: protected */
    public void a(VideoSegment videoSegment, int i2) {
        this.y.setVisibility(0);
        this.z.setVisibility(8);
        this.E.a();
        if (i2 == 2) {
            this.y.b(0);
            this.D.a(this.w.f125491b);
            this.f126109e.i();
        } else if (i2 == 3) {
            this.y.b(0);
            this.D.a(videoSegment, this.w.f125491b);
            this.f126109e.a(videoSegment);
        } else if (i2 == 1) {
            this.f126109e.h();
        }
    }

    public void a(androidx.core.g.e<Integer, Integer> eVar) {
        this.J = 2;
        this.f126109e.a(2);
        this.L = eVar.f2397a.intValue();
        this.K = eVar.f2398b.intValue();
        VideoSegment videoSegment = this.f126109e.k().get(this.K);
        d dVar = this.O;
        if (dVar == null) {
            this.O = new d(videoSegment);
        } else {
            dVar.a(videoSegment);
        }
        this.w.a(videoSegment.f125478b, videoSegment.a(true), this.f126109e.c(this.K).f(), this.J);
        this.y.setVisibility(8);
        this.D.a();
        this.z.setVisibility(0);
        this.z.b(0);
        this.E.a(this.w.f125491b, videoSegment);
        this.z.a(this.f126109e.b(this.K), 0);
        this.N.a(getStartSlideX(), getEndSlideX(), getOverXScroll());
        float a2 = m.a(this.w, this.f126109e.c(this.K), this.f126109e.b(this.K), this.T);
        a(a2, m.a(this.f126108d, this.w, a2, this.f126109e.c(this.K), this.T), 0);
        this.f126109e.a(eVar);
    }

    public final boolean a(int i2, int i3) {
        return a(i2, i3, true);
    }

    public final boolean a(int i2, int i3, boolean z2) {
        float f2;
        if (this.f126112h == null) {
            return false;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (!this.f126112h.isLaidOut() || this.f126112h.getLeft() == 0) {
            return false;
        }
        if (this.J == 1) {
            this.y.b(0);
            this.y.a(0, 0);
        } else {
            this.f126109e.a(this.K, 0);
            this.z.b(0);
            this.z.a(0, 0);
        }
        float f3 = (((((float) i2) * 1.0f) / this.w.f125494e) + ((float) this.T)) - 0.0f;
        if (((long) i3) >= this.w.f125495f) {
            f2 = (float) ((dh.b(this.f126108d) - this.T) - m.f125471d);
            f3 = Math.max((f2 - ((float) m.f125471d)) - (((float) (i3 - i2)) / this.w.f125494e), (float) (this.T - 0));
        } else {
            f2 = (((float) (i3 - i2)) / this.w.f125494e) + ((float) m.f125471d) + f3;
        }
        a(f3, f2, 0, z2);
        if (z2) {
            setCurPointerContainerStartX((float) (this.T + m.f125471d));
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(String str) {
        if (str.equals("curPoint") || ((int) ((this.f126111g.getStartX() - this.f126112h.getStartX()) - ((float) m.f125471d))) >= ((int) this.w.f125496g) - 2) {
            return true;
        }
        D();
        m.a(this.f126108d);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r5 <= 0.0f) goto L_0x0026;
     */
    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.core.g.e<java.lang.Float, java.lang.Float> r8, java.util.List<com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r9) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.a(androidx.core.g.e, java.util.List):void");
    }

    public final void a(final boolean z2, boolean z3, final androidx.core.g.a<Void> aVar) {
        AlphaAnimation alphaAnimation;
        if (z3) {
            if (!z2) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            alphaAnimation.setDuration(200);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                /* class com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(82820);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                    if (z2) {
                        VideoEditView.this.c(true);
                    }
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!z2) {
                        VideoEditView.this.c(false);
                    }
                    androidx.core.g.a aVar = aVar;
                    if (aVar != null) {
                        aVar.a(null);
                    }
                }
            });
            RTLImageView rTLImageView = this.f126112h;
            if (rTLImageView != null) {
                rTLImageView.startAnimation(alphaAnimation);
            }
            RTLImageView rTLImageView2 = this.f126111g;
            if (rTLImageView2 != null) {
                rTLImageView2.startAnimation(alphaAnimation);
            }
            View view = this.f126117m;
            if (view != null) {
                view.startAnimation(alphaAnimation);
            }
            View view2 = this.n;
            if (view2 != null) {
                view2.startAnimation(alphaAnimation);
            }
            View view3 = this.q;
            if (view3 != null) {
                view3.startAnimation(alphaAnimation);
                return;
            }
            return;
        }
        c(z2);
    }

    private void A() {
        B();
        C();
    }

    public float getEndSlideX() {
        return this.f126111g.getStartX();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getMaxCutDuration() {
        return this.w.f125495f;
    }

    public float getSelectedTimeInMillis() {
        return this.H * this.w.f125494e;
    }

    public float getStartSlideX() {
        return this.f126112h.getStartX();
    }

    private void E() {
        if (!this.ac) {
            this.ac = true;
            m.a(this.f126108d);
        }
    }

    private void z() {
        PopupWindow popupWindow = this.ae;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.ae = null;
        }
    }

    public float getAudioStartTranslationX() {
        RTLImageView rTLImageView = this.f126112h;
        if (rTLImageView != null) {
            return rTLImageView.getTranslationX();
        }
        return 0.0f;
    }

    public RecyclerView getCurrentFrameRecyclerView() {
        if (this.J == 0) {
            return this.z;
        }
        return this.y;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public int getCurrentRotate() {
        int i2 = this.J;
        if (i2 == 2 || i2 == 0) {
            return this.O.f125505c;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public androidx.core.g.e<Long, Long> getPlayBoundary() {
        if (this.J == 1) {
            return getMultiVideoPlayBoundary();
        }
        return getSingleVideoPlayBoundary();
    }

    public long getSeekTime() {
        if (this.J == 1) {
            return getMultiSeekTime();
        }
        return getSingleSeekTime();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public float getSelectedTime() {
        return (this.H * this.w.f125494e) / 1000.0f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getSingleSeekTime() {
        return (long) ((this.G + ((float) m.f125471d)) * this.w.f125494e);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public float getCurrentSpeed() {
        int i2 = this.J;
        if (i2 == 2 || i2 == 0) {
            return this.O.f125506d;
        }
        return this.f126109e.l();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getMultiSeekTime() {
        return b.a(this.f126109e.k(), (this.G + ((float) m.f125471d)) * this.w.f125494e, this.f126109e.l());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getSinglePlayingPosition() {
        return (long) (((this.G + this.r.getStartX()) - this.f126112h.getStartX()) * this.w.f125494e * this.O.f125506d);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public androidx.core.g.e<Float, Float> getSlideX() {
        return new androidx.core.g.e<>(Float.valueOf(getStartSlideX()), Float.valueOf(getEndSlideX()));
    }

    /* access modifiers changed from: protected */
    public void n() {
        RTLImageView rTLImageView = this.f126112h;
        if (rTLImageView != null) {
            rTLImageView.setImageResource(2131235000);
        }
        RTLImageView rTLImageView2 = this.f126111g;
        if (rTLImageView2 != null) {
            rTLImageView2.setImageResource(2131234999);
        }
    }

    public final void q() {
        View view = this.B;
        if (view != null) {
            view.setVisibility(4);
        }
        AudioTrackView audioTrackView = this.A;
        if (audioTrackView != null) {
            audioTrackView.setVisibility(4);
        }
        z();
    }

    private void s() {
        this.f126107c = dh.b(this.f126108d);
        this.L = 0;
        this.K = 0;
        b bVar = new b(this.f126109e.k(), m.b(this.f126108d, this.T));
        this.w = bVar;
        bVar.f125497h = this.U;
        this.w.f125498i = this.f126106b;
        t();
        u();
        y();
        x();
        h();
    }

    private void w() {
        if (this.q != null) {
            int startX = (int) (this.f126112h.getStartX() + ((float) m.f125471d));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Double.valueOf(Math.ceil((double) this.H)).intValue(), this.P);
            layoutParams.topMargin = this.S;
            layoutParams.leftMargin = startX;
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(startX);
            this.q.setLayoutParams(layoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getMultiPlayingPosition() {
        return b.a(this.f126109e.k(), ((this.G + this.r.getStartX()) - this.f126112h.getStartX()) * this.w.f125494e, this.f126109e.l());
    }

    public androidx.core.g.e<Long, Long> getSingleVideoPlayBoundary() {
        return androidx.core.g.e.a(Long.valueOf((long) ((this.G + ((float) m.f125471d)) * this.w.f125494e * this.O.f125506d)), Long.valueOf((long) ((this.G + ((float) m.f125471d) + this.H) * this.w.f125494e * this.O.f125506d)));
    }

    public void i() {
        if (this.o != null) {
            float startX = this.f126112h.getStartX();
            int max = Math.max((this.T + m.f125471d) - this.I, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Math.max((int) (startX - ((float) max)), 0), this.P);
            layoutParams.topMargin = this.S;
            layoutParams.leftMargin = max;
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(max);
            layoutParams.gravity = 8388611;
            this.o.setLayoutParams(layoutParams);
        }
    }

    public void k() {
        this.J = 1;
        this.f126109e.a(1);
        d dVar = this.O;
        if (dVar != null) {
            dVar.a();
        }
        this.w.a(this.f126109e.k(), this.f126109e.l());
        a(this.N.f125500a, this.N.f125501b, this.N.f125502c);
        a((VideoSegment) null, 1);
    }

    public void l() {
        this.J = 1;
        this.f126109e.a(1);
        m();
        c cVar = this.N;
        if (cVar != null) {
            cVar.a();
        }
        this.w.a(this.f126109e.k(), this.f126109e.l());
        int i2 = this.T;
        a((float) i2, (float) ((this.f126107c - i2) - m.f125471d), 0);
        a((VideoSegment) null, 2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void r() {
        this.O.f125505c += 90;
        if (this.O.f125505c >= 360) {
            this.O.f125505c = 0;
        }
        if (this.J == 0) {
            this.f126109e.a(this.O, 0);
        }
    }

    private void C() {
        MethodCollector.i(5746);
        View view = new View(this.f126108d);
        this.q = view;
        view.setTag("block");
        this.q.setOnTouchListener(this);
        this.q.setBackgroundColor(this.ah);
        this.q.setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.H, this.P);
        layoutParams.topMargin = (int) r.a(this.f126108d, 7.0f);
        layoutParams.leftMargin = this.T + m.f125471d;
        int i2 = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart(this.T + m.f125471d);
        this.q.setLayoutParams(layoutParams);
        this.x.addView(this.q);
        this.r.bringToFront();
        MethodCollector.o(5746);
    }

    private void D() {
        if (System.currentTimeMillis() - this.aC >= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            if (this.J == 2) {
                j.a(this.f126108d, getResources().getString(R.string.h6x, Float.valueOf(0.5f))).a();
                this.aC = System.currentTimeMillis();
                return;
            }
            j.a(this.f126108d, getResources().getString(R.string.h6x, Float.valueOf(1.0f))).a();
            this.aC = System.currentTimeMillis();
        }
    }

    private void F() {
        String a2 = a.a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf((this.H * this.w.f125494e) / 1000.0f)});
        if (!(this.r == null || this.f126112h == null || this.f126110f.f125327b.getValue() == null)) {
            a.a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) this.f126110f.f125327b.getValue().longValue()) / 1000.0f)});
        }
        if (this.f126110f.f125326a.getValue() != null) {
            this.f126110f.f125326a.getValue();
        }
        getResources().getString(R.string.d6p, a2);
        this.f126109e.l();
    }

    private void t() {
        MethodCollector.i(5402);
        View inflate = View.inflate(this.f126108d, R.layout.bii, this);
        this.r = (RTLLinearLayout) inflate.findViewById(R.id.ahl);
        this.s = (ImageView) inflate.findViewById(R.id.ahk);
        this.x = (FrameLayout) inflate.findViewById(R.id.b9l);
        this.y = (MVRecycleView) inflate.findViewById(R.id.b9q);
        this.z = (MVRecycleView) inflate.findViewById(R.id.e4i);
        this.A = (AudioTrackView) inflate.findViewById(R.id.ni);
        this.B = inflate.findViewById(R.id.e08);
        this.C = inflate.findViewById(R.id.ae6);
        MethodCollector.o(5402);
    }

    private void u() {
        if (this.J == 1) {
            this.N = new c();
            this.w.a(this.f126109e.k(), this.f126109e.l());
        } else {
            VideoSegment videoSegment = this.f126109e.k().get(0);
            this.O = new d(videoSegment);
            this.w.a(videoSegment.f125478b, videoSegment.a(true), videoSegment.f(), this.J);
        }
        this.H = (float) ((this.f126107c - (this.T * 2)) - (m.f125471d * 2));
        this.G = (float) (-m.f125471d);
    }

    private void v() {
        if (this.ap) {
            androidx.core.g.e<Long, Long> playBoundary = getPlayBoundary();
            F f2 = playBoundary.f2397a;
            S s2 = playBoundary.f2398b;
            if (!(f2 == null || s2 == null)) {
                long max = Math.max(0L, f2.longValue());
                String a2 = a.a(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(((float) max) / 1000.0f)});
                String a3 = a.a(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(((float) s2.longValue()) / 1000.0f)});
                eu.a(this.f126114j, a2);
                eu.a(this.f126113i, a3);
            }
            p();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void b() {
        this.H = (this.f126111g.getStartX() - this.f126112h.getStartX()) - ((float) m.f125471d);
        this.G = (((float) (this.I - m.f125471d)) + this.f126112h.getStartX()) - ((float) this.T);
        if (!(1 == this.J || this.O == null)) {
            androidx.core.g.e<Long, Long> singleVideoPlayBoundary = getSingleVideoPlayBoundary();
            this.O.f125503a = singleVideoPlayBoundary.f2397a.longValue();
            this.O.f125504b = singleVideoPlayBoundary.f2398b.longValue();
            if (this.ag != 2 && this.J == 0) {
                this.f126109e.a(this.O, 0);
            }
        }
        F();
        v();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final boolean g() {
        VideoSegment videoSegment = this.f126109e.k().get(this.L);
        boolean z2 = false;
        if (videoSegment == null || this.O == null) {
            return false;
        }
        if (Math.abs(videoSegment.d() - this.O.f125503a) > 100 || Math.abs(videoSegment.e() - this.O.f125504b) > 100) {
            return true;
        }
        if (videoSegment.f() != this.O.f125506d) {
            z2 = true;
        }
        if (videoSegment.f125486j != this.O.f125505c) {
            return true;
        }
        return z2;
    }

    public androidx.core.g.e<Long, Long> getMultiVideoPlayBoundary() {
        return androidx.core.g.e.a(Long.valueOf(b.a(this.f126109e.k(), (this.G + ((float) m.f125471d)) * this.w.f125494e, this.f126109e.l())), Long.valueOf(b.a(this.f126109e.k(), (this.G + ((float) m.f125471d) + this.H) * this.w.f125494e, this.f126109e.l())));
    }

    public void h() {
        this.f126110f.f125327b.observe(this.f126108d, new k(this));
        if (this.aB) {
            this.f126110f.f125329d.observe(this.f126108d, new l(this));
            this.f126110f.f125330e.observe(this.f126108d, new m(this));
            this.f126110f.f125331f.observe(this.f126108d, new n(this));
            this.f126110f.f125332g.observe(this.f126108d, new o(this));
            this.f126110f.f125333h.observe(this.f126108d, new p(this));
            this.f126110f.f125334i.observe(this.f126108d, new q(this));
        }
    }

    public void j() {
        if (this.p != null) {
            float startX = this.f126111g.getStartX();
            int i2 = (int) ((((((float) this.w.f125495f) / this.w.f125494e) - this.G) - ((float) (m.f125471d * 2))) - this.H);
            int i3 = (int) ((((float) this.f126107c) - startX) - ((float) m.f125471d));
            int max = Math.max(Math.min(i2, i3), 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(max, this.P);
            int i4 = i3 - max;
            layoutParams.rightMargin = i4;
            int i5 = Build.VERSION.SDK_INT;
            layoutParams.setMarginEnd(i4);
            layoutParams.topMargin = this.S;
            layoutParams.gravity = 8388613;
            this.p.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
        this.f126109e.a(this.O, this.K);
        this.f126109e.a(this.K, getOverXScroll());
        this.w.a(this.f126109e.k().get(this.K).a(true), this.O.f125506d);
        this.f126110f.a(this.f126109e.k().get(this.K).a(true));
    }

    public final void o() {
        VideoEditViewModel videoEditViewModel;
        if (this.w != null && (videoEditViewModel = this.f126109e) != null && !k.a(videoEditViewModel.k())) {
            if (this.J == 1) {
                this.w.a(this.f126109e.k(), this.f126109e.l());
                return;
            }
            VideoSegment videoSegment = this.f126109e.k().get(0);
            this.w.a(videoSegment.f125478b, videoSegment.a(true), videoSegment.f(), this.J);
        }
    }

    public final void p() {
        if (this.ap) {
            TextView textView = this.f126114j;
            textView.setX(a(this.f126112h, textView));
            TextView textView2 = this.f126113i;
            textView2.setX(a(this.f126111g, textView2));
            float f2 = 0.0f;
            if (Math.abs(this.f126114j.getX() - this.f126113i.getX()) - (((float) (this.f126114j.getWidth() + this.f126113i.getWidth())) / 2.0f) > 0.0f) {
                f2 = 1.0f;
            }
            if (this.f126114j.getAlpha() != f2) {
                this.f126114j.animate().alpha(f2).setDuration(150).start();
                this.f126113i.animate().alpha(f2).setDuration(150).start();
            }
        }
    }

    private void B() {
        MethodCollector.i(5742);
        this.o = new View(this.f126108d);
        this.p = new View(this.f126108d);
        this.o.setBackgroundColor(this.ai);
        this.p.setBackgroundColor(this.ai);
        int max = Math.max(this.I - m.f125471d, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(max, this.P);
        layoutParams.topMargin = (int) r.a(this.f126108d, 7.0f);
        layoutParams.gravity = 8388611;
        layoutParams.leftMargin = this.T - max;
        int i2 = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart(this.T - max);
        this.o.setLayoutParams(layoutParams);
        int max2 = Math.max((int) ((((((float) this.w.f125495f) / this.w.f125494e) - ((float) this.I)) - this.H) - ((float) m.f125471d)), 0);
        int i3 = this.T;
        int min = Math.min(max2, i3);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(min, this.P);
        layoutParams2.topMargin = (int) r.a(this.f126108d, 7.0f);
        int i4 = i3 - min;
        layoutParams2.rightMargin = i4;
        int i5 = Build.VERSION.SDK_INT;
        layoutParams2.setMarginEnd(i4);
        layoutParams2.gravity = 8388613;
        this.p.setLayoutParams(layoutParams2);
        this.x.addView(this.o);
        this.x.addView(this.p);
        MethodCollector.o(5742);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void c() {
        this.w.a(this.f126109e.k(), this.f126109e.l());
        int i2 = this.T;
        a((float) i2, (float) ((this.f126107c - i2) - m.f125471d), 0);
        this.y.b(0);
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.f126109e.k()) {
            if (!videoSegment.f125485i) {
                arrayList.add(videoSegment);
            }
        }
        this.D.a(arrayList);
    }

    private void y() {
        int i2;
        View view = this.C;
        if (this.aA) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        int i3 = this.T + m.f125471d;
        this.C.setBackground(com.ss.android.ugc.tools.view.a.a(getResources().getColor(R.color.uc), 0, (int) r.a(getContext(), 1.0f), 0));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.C.getLayoutParams();
        layoutParams.topMargin = this.S;
        int i4 = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart(i3);
        layoutParams.setMarginEnd(i3);
        this.C.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.z.getLayoutParams();
        layoutParams2.topMargin = this.S;
        this.z.setLayoutParams(layoutParams2);
        this.z.setPadding(this.T + m.f125471d, 0, this.T + m.f125471d, 0);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.y.getLayoutParams();
        layoutParams3.topMargin = this.S;
        this.y.setLayoutParams(layoutParams3);
        this.y.setPadding(this.T + m.f125471d, 0, this.T + m.f125471d, 0);
        int a2 = r.a(getContext()) - ((this.T + m.f125471d) * 2);
        g a3 = new g().a(new int[]{this.av, this.P, a2});
        a3.f126176b = this.f126109e.k();
        a3.f126177c = this.w.f125491b;
        a3.f126178d = 2;
        a3.f126179e = this.F;
        this.E = new b(this.f126108d, a3.a());
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.A.getLayoutParams();
        layoutParams4.height = this.P;
        layoutParams4.topMargin = this.S;
        this.A.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.B.getLayoutParams();
        layoutParams5.height = this.P;
        layoutParams5.topMargin = this.S;
        this.B.setLayoutParams(layoutParams5);
        this.B.setPadding(this.T + m.f125471d, 0, this.T + m.f125471d, 0);
        if (this.F != null) {
            this.E.a(this.ad.f126197b);
        }
        this.E.b(this.aq);
        this.z.setAdapter(this.E);
        this.z.setLayoutManager(new MVLinearLayoutManager());
        this.z.a(this.aE);
        this.z.setflingScale(0.12d);
        g a4 = new g().a(new int[]{this.av, this.P, a2});
        a4.f126176b = this.f126109e.k();
        a4.f126177c = this.w.f125491b;
        a4.f126178d = 1;
        a4.f126179e = this.F;
        b bVar = new b(this.f126108d, a4.a());
        this.D = bVar;
        if (this.F != null) {
            bVar.a(this.ad.f126197b);
        }
        this.D.b(this.aq);
        this.y.setAdapter(this.D);
        this.y.setLayoutManager(new ScrollInterceptedLayoutManager());
        this.y.setflingScale(0.12d);
        this.y.a(this.aE);
        if (this.J == 0) {
            this.z.setVisibility(0);
            this.y.setVisibility(8);
            if (this.f126110f.f125336k) {
                this.E.o = true;
                this.E.p = this.am;
            }
            this.E.f126153i = this.ao;
            this.E.f126152h = this.an;
        } else {
            this.z.setVisibility(8);
            this.y.setVisibility(0);
        }
        if (this.al) {
            a();
        }
        this.s.setImageDrawable(com.ss.android.ugc.tools.view.a.a(0, -1, 1, this.ar / 2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void a() {
        VideoEditViewModel videoEditViewModel = this.f126109e;
        if (videoEditViewModel != null) {
            if (this.J != 0) {
                b bVar = this.D;
                if (bVar != null) {
                    bVar.a(videoEditViewModel.k());
                }
            } else if (this.E != null) {
                t<Boolean> tVar = this.ao;
                if (tVar != null) {
                    tVar.setValue(true);
                }
                this.E.a(this.f126109e.k());
            }
        }
    }

    private void x() {
        MethodCollector.i(5680);
        RTLImageView rTLImageView = new RTLImageView(this.f126108d);
        this.f126112h = rTLImageView;
        rTLImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m.f125471d, this.Q);
        this.f126115k = layoutParams;
        layoutParams.topMargin = this.ay;
        this.f126115k.leftMargin = this.T;
        int i2 = Build.VERSION.SDK_INT;
        this.f126115k.setMarginStart(this.T);
        this.f126112h.setLayoutParams(this.f126115k);
        if (com.ss.android.ugc.asve.f.d.a(this.f126108d)) {
            this.f126112h.setLeft(this.f126107c - this.T);
            v.b((View) this.f126112h, 1);
        } else {
            this.f126112h.setLeft(this.f126115k.leftMargin);
        }
        if (!this.t) {
            this.f126112h.setOnTouchListener(null);
        } else {
            this.f126112h.setOnTouchListener(this);
        }
        this.f126112h.setTag("startSlide");
        this.x.addView(this.f126112h);
        this.f126114j = a(this.f126108d);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) (((float) (this.f126115k.topMargin + this.f126115k.height)) + r.a(this.f126108d, 4.0f));
        layoutParams2.leftMargin = this.T;
        int i3 = Build.VERSION.SDK_INT;
        layoutParams2.setMarginStart(this.T);
        this.f126114j.setLayoutParams(layoutParams2);
        this.f126114j.setTag("startSlideTime");
        this.x.addView(this.f126114j);
        this.f126114j.addTextChangedListener(new j() {
            /* class com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(82816);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.j
            public final void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                VideoEditView.this.f126114j.post(new t(this));
            }
        });
        RTLImageView rTLImageView2 = new RTLImageView(this.f126108d);
        this.f126111g = rTLImageView2;
        rTLImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(m.f125471d + m.f125475h, this.Q);
        this.f126116l = layoutParams3;
        layoutParams3.topMargin = this.ay;
        this.f126116l.leftMargin = (this.f126107c - this.T) - m.f125471d;
        int i4 = Build.VERSION.SDK_INT;
        this.f126116l.setMarginStart((this.f126107c - this.T) - m.f125471d);
        this.f126111g.setLayoutParams(this.f126116l);
        if (com.ss.android.ugc.asve.f.d.a(this.f126108d)) {
            this.f126111g.setLeft(this.T);
            v.b((View) this.f126111g, 1);
        } else {
            this.f126111g.setLeft(this.f126116l.leftMargin);
        }
        if (!this.t) {
            this.f126111g.setOnTouchListener(null);
        } else {
            this.f126111g.setOnTouchListener(this);
        }
        this.f126111g.setPadding(0, 0, m.f125475h, 0);
        int i5 = Build.VERSION.SDK_INT;
        this.f126111g.setPaddingRelative(0, 0, m.f125475h, 0);
        this.f126111g.setTag("endSlide");
        this.x.addView(this.f126111g);
        this.f126113i = a(this.f126108d);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = (int) (((float) (this.f126116l.topMargin + this.f126116l.height)) + r.a(this.f126108d, 4.0f));
        layoutParams4.leftMargin = (this.f126107c - this.T) - m.f125471d;
        int i6 = Build.VERSION.SDK_INT;
        layoutParams4.setMarginStart(this.T);
        this.f126113i.setLayoutParams(layoutParams4);
        this.f126113i.setTag("endSlideTime");
        this.x.addView(this.f126113i);
        this.f126113i.addTextChangedListener(new j() {
            /* class com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(82817);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.j
            public final void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                VideoEditView.this.f126113i.post(new u(this));
            }
        });
        n();
        this.f126117m = new View(this.f126108d);
        this.n = new View(this.f126108d);
        setBorderColor(R.color.a2o);
        this.x.addView(this.f126117m);
        this.x.addView(this.n);
        int i7 = this.T;
        c(i7, (this.f126107c - i7) - m.f125471d);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.r.getLayoutParams();
        layoutParams5.leftMargin = this.T + m.f125471d;
        layoutParams5.height = this.as;
        layoutParams5.topMargin = this.au;
        int i8 = Build.VERSION.SDK_INT;
        layoutParams5.setMarginStart(this.T + m.f125471d);
        this.r.setLayoutParams(layoutParams5);
        this.r.setTag("curPoint");
        this.r.setOnTouchListener(this);
        RTLLinearLayout rTLLinearLayout = this.r;
        if (rTLLinearLayout != null) {
            this.x.removeView(rTLLinearLayout);
            this.x.addView(this.r);
        }
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams6.width = this.ar;
        this.s.setLayoutParams(layoutParams6);
        e(this.ap);
        A();
        MethodCollector.o(5680);
    }

    public void setCanEdit(boolean z2) {
        this.aB = z2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setExtractFramesInRoughMode(boolean z2) {
        this.aq = z2;
    }

    public void setFirstFrameBitmapLiveData(t<Bitmap> tVar) {
        this.an = tVar;
    }

    public void setFirstFrameVisibleLiveData(t<Boolean> tVar) {
        this.ao = tVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setLoadThumbnailDirectly(boolean z2) {
        this.al = z2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setMaxVideoLength(long j2) {
        this.U = j2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setMinVideoLength(long j2) {
        this.f126106b = j2;
    }

    public void setPointerType(int i2) {
        this.ag = i2;
    }

    public void setVeEditor(g gVar) {
        this.am = gVar;
    }

    public void setViewConfig(w wVar) {
        this.ad = wVar;
    }

    private void setVideoSegmentData(List<VideoSegment> list) {
        this.f126109e.b(list);
    }

    public final void b(boolean z2) {
        b bVar = this.E;
        if (bVar != null) {
            bVar.c(z2);
        }
    }

    public void setHitTest(Boolean bool) {
        this.aF = bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setCurrentRotate(int i2) {
        int i3 = this.J;
        if (i3 == 2 || i3 == 0) {
            this.O.f125505c = i2;
        }
    }

    public void setEnableBoundaryText(boolean z2) {
        if (z2 != this.ap) {
            e(z2);
        }
        this.ap = z2;
    }

    public void setEndCoverColor(int i2) {
        View view = this.p;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    private void e(boolean z2) {
        int i2;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.f126114j.setVisibility(i2);
        this.f126113i.setVisibility(i2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(boolean z2) {
        if (z2) {
            setCurPointerContainerStartX(this.f126112h.getStartX() + ((float) m.f125471d));
        }
        i();
        w();
        j();
    }

    public void setBorderColor(int i2) {
        this.f126117m.setBackgroundColor(this.f126108d.getResources().getColor(i2));
        this.n.setBackgroundColor(this.f126108d.getResources().getColor(i2));
    }

    public void setEnabled(boolean z2) {
        this.aj = z2;
        if (this.y.getLayoutManager() instanceof ScrollInterceptedLayoutManager) {
            ((ScrollInterceptedLayoutManager) this.y.getLayoutManager()).f125476a = z2;
        }
    }

    private TextView a(Context context) {
        StyleTextView styleTextView = new StyleTextView(context);
        styleTextView.setTextColor(context.getResources().getColor(R.color.rc));
        styleTextView.setTextSize(11.0f);
        styleTextView.setClickable(true);
        styleTextView.setTypeface(f.a(com.ss.android.ugc.tools.view.style.a.MEDIUM.getFONT_NAME()), 1);
        styleTextView.setOnTouchListener(this);
        return styleTextView;
    }

    private void setCurPointerContainerStartX(float f2) {
        float f3;
        int i2;
        RTLLinearLayout rTLLinearLayout = this.r;
        if (f2 <= ((float) (this.T + m.f125471d))) {
            i2 = (this.T + m.f125471d) - m.f125474g;
        } else if (f2 >= ((float) (((this.f126107c - this.T) - m.f125471d) - m.f125472e))) {
            i2 = (((this.f126107c - this.T) - m.f125471d) - m.f125472e) + m.f125474g;
        } else {
            f3 = f2 + (((float) m.f125474g) * (((2.0f * f2) / ((float) ((this.f126107c - this.T) - m.f125471d))) - 4.0f));
            rTLLinearLayout.setStartX(f3);
        }
        f3 = (float) i2;
        rTLLinearLayout.setStartX(f3);
    }

    private void b(float f2) {
        Iterator<com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.b> it = this.ad.f126196a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.b next = it.next();
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a<Float> a2 = next.a(f2, m.f125471d, this.f126112h.getStartX(), this.w.f125494e);
            if (!a2.a()) {
                if (!a2.b()) {
                    if (a2.c()) {
                        f2 = a2.f126143a.floatValue();
                    } else {
                        throw new IllegalStateException("illegal intercept result, result = " + a2.toString() + ", interceptor = " + next.a());
                    }
                }
            } else {
                return;
            }
        }
        if (f2 > ((float) ((this.f126107c - this.T) - m.f125471d))) {
            f2 = (float) ((this.f126107c - this.T) - m.f125471d);
            if (this.f126112h.getStartX() == ((float) this.T)) {
                E();
            }
        }
        if ((f2 - this.f126112h.getStartX()) - ((float) m.f125471d) < this.w.f125496g) {
            D();
            E();
            f2 = this.f126112h.getStartX() + this.w.f125496g + ((float) m.f125471d);
        }
        this.f126111g.setStartX(f2);
        setCurPointerContainerStartX(this.f126111g.getStartX() - ((float) this.s.getWidth()));
        c((int) this.f126112h.getStartX(), (int) this.f126111g.getStartX());
        b();
        this.f126109e.b();
        j();
        w();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a
    public void setEditViewHeight(boolean z2) {
        MethodCollector.i(5406);
        if (z2) {
            this.as = this.at;
            this.P = this.aw;
            this.au = 0;
        } else {
            this.as = (int) r.a(getContext(), 44.0f);
            this.P = this.ax;
            this.au = (int) r.a(getContext(), 2.0f);
        }
        int i2 = this.P;
        this.Q = (this.az * 2) + i2;
        this.D.a(i2);
        this.E.a(this.P);
        this.x.removeView(this.f126112h);
        this.x.removeView(this.f126114j);
        this.x.removeView(this.f126111g);
        this.x.removeView(this.f126113i);
        this.x.removeView(this.f126117m);
        this.x.removeView(this.n);
        this.x.removeView(this.r);
        this.x.removeView(this.o);
        this.x.removeView(this.p);
        this.x.removeView(this.q);
        x();
        MethodCollector.o(5406);
    }

    public final void c(boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RTLImageView rTLImageView = this.f126112h;
        int i10 = 0;
        if (rTLImageView != null) {
            if (z2) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            rTLImageView.setVisibility(i9);
        }
        TextView textView = this.f126114j;
        if (textView != null && this.ap) {
            if (z2) {
                i8 = 0;
            } else {
                i8 = 4;
            }
            textView.setVisibility(i8);
        }
        RTLImageView rTLImageView2 = this.f126111g;
        if (rTLImageView2 != null) {
            if (z2) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            rTLImageView2.setVisibility(i7);
        }
        TextView textView2 = this.f126113i;
        if (textView2 != null && this.ap) {
            if (z2) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            textView2.setVisibility(i6);
        }
        View view = this.f126117m;
        if (view != null) {
            if (z2) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            view.setVisibility(i5);
        }
        View view2 = this.n;
        if (view2 != null) {
            if (z2) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            view2.setVisibility(i4);
        }
        View view3 = this.o;
        if (view3 != null) {
            if (z2) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            view3.setVisibility(i3);
        }
        View view4 = this.p;
        if (view4 != null) {
            if (z2) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view4.setVisibility(i2);
        }
        View view5 = this.q;
        if (view5 != null) {
            if (!z2) {
                i10 = 4;
            }
            view5.setVisibility(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(float f2) {
        if (this.J == 1) {
            this.f126109e.c(f2);
        } else {
            this.O.f125506d = f2;
            if (this.J == 0) {
                this.f126109e.a(this.O, 0);
            }
        }
        if (this.J == 1) {
            this.w.a(this.f126109e.k(), this.f126109e.l());
            this.D.a(this.w.f125491b);
            this.y.b(0);
        } else {
            this.w.a(this.f126109e.k().get(this.K).f125478b, this.f126109e.k().get(this.K).a(true), this.O.f125506d, this.J);
            this.E.a(this.w.f125491b, this.f126109e.k().get(this.K));
            this.z.b(0);
        }
        int i2 = this.T;
        a((float) i2, (float) ((this.f126107c - i2) - m.f125471d), 0);
        F();
        if (this.J == 0) {
            this.w.a(this.f126109e.k().get(this.K).a(true), this.O.f125506d);
        }
        this.f126109e.b(f2);
    }

    public final void a(int i2) {
        if (this.ak) {
            long j2 = (long) i2;
            setMaxVideoLength(j2);
            List<VideoSegment> k2 = this.f126109e.k();
            this.w.f125497h = j2;
            if (this.J == 1) {
                this.w.a(this.f126109e.k(), this.f126109e.l());
            } else if (!com.ss.android.ugc.tools.utils.d.a(k2)) {
                VideoSegment videoSegment = k2.get(0);
                videoSegment.f125478b = j2;
                videoSegment.b(j2);
                this.w.a(videoSegment.f125478b, videoSegment.a(true), videoSegment.f(), this.J);
            }
        }
    }

    public VideoEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final float a(float f2, float f3) {
        if (f2 >= f3) {
            return f3 / this.w.f125494e;
        }
        return f2 / this.w.f125494e;
    }

    private static float a(View view, View view2) {
        return (view.getX() + (((float) (view.getMeasuredWidth() - view.getPaddingRight())) / 2.0f)) - (((float) view2.getMeasuredWidth()) / 2.0f);
    }

    public final void b(int i2, int i3) {
        this.B.setVisibility(0);
        this.A.setVisibility(0);
        this.A.a(getAudioStartTranslationX(), a((float) i2, (float) i3), (long) i2);
    }

    private void c(int i2, int i3) {
        if (this.f126117m != null && this.n != null) {
            int i4 = m.f125471d + i2;
            int a2 = ((i3 - i2) - m.f125471d) + ((int) r.a(this.f126108d, 1.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, this.az);
            layoutParams.leftMargin = i4;
            int i5 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(i4);
            layoutParams.topMargin = this.ay;
            this.f126117m.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a2, this.az);
            layoutParams2.leftMargin = i4;
            int i6 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart(i4);
            layoutParams2.topMargin = (this.ay + this.Q) - this.az;
            this.n.setLayoutParams(layoutParams2);
        }
    }

    private void a(CutMultiVideoViewModel cutMultiVideoViewModel, List<VideoSegment> list) {
        if (cutMultiVideoViewModel.f125336k) {
            for (VideoSegment videoSegment : list) {
                videoSegment.f125478b = (long) cutMultiVideoViewModel.f125337l;
                videoSegment.f125482f = 720;
                videoSegment.f125483g = 1280;
            }
        }
        this.f126109e.b(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0065, code lost:
        if (r7 != false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(float r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.b(float, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0269, code lost:
        r13.f126109e.c();
        r13.f126109e.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x028f, code lost:
        if (r12.equals("endSlide") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02cc, code lost:
        if (r12.equals("startSlideTime") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02d4, code lost:
        if (r12.equals("endSlideTime") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02d8, code lost:
        r13.W = r13.f126111g.getLeftX();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02e6, code lost:
        if (r12.equals("startSlide") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ea, code lost:
        r13.W = r13.f126112h.getLeftX();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x031a, code lost:
        throw new java.lang.IllegalStateException("illegal intercept result, result = " + r5.toString() + ", interceptor = " + r6.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r12.equals("endSlide") == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c3, code lost:
        if (r12.equals("startSlideTime") == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
        if (r12.equals("endSlideTime") == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cf, code lost:
        if (r13.aF == false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d7, code lost:
        if (r13.aj == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00db, code lost:
        if (r13.aG == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e3, code lost:
        if (r13.A.getVisibility() != 0) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f8, code lost:
        if (java.lang.Math.abs((getSelectedTime() * 1000.0f) - ((float) r13.A.getDuraion())) > 300.0f) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fa, code lost:
        r7 = (r13.f126112h.getStartX() + ((float) com.ss.android.ugc.aweme.shortvideo.cut.m.f125471d)) + (((float) r13.A.getDuraion()) / r13.w.f125494e);
        b(r7);
        r13.aD = r7;
        E();
        setEnabled(false);
        r13.f126109e.d();
        r13.aG = false;
        r13.u = false;
        r13.ac = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013c, code lost:
        if (java.lang.Math.abs((getSelectedTime() * 1000.0f) - ((float) r13.A.getDuraion())) <= 300.0f) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013e, code lost:
        r13.aG = true;
        r13.ac = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0142, code lost:
        b(r1);
        z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014a, code lost:
        b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0153, code lost:
        if (r12.equals("startSlide") == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0157, code lost:
        r8 = r13.ad.f126196a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0163, code lost:
        if (r8.hasNext() == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        r6 = r8.next();
        r5 = r6.b(r1, com.ss.android.ugc.aweme.shortvideo.cut.m.f125471d, r13.f126111g.getStartX(), r13.w.f125494e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017f, code lost:
        if (r5.a() != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0185, code lost:
        if (r5.b() != false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018b, code lost:
        if (r5.c() == false) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018d, code lost:
        r1 = r5.f126143a.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a6, code lost:
        if (((r13.f126111g.getStartX() - r1) - ((float) com.ss.android.ugc.aweme.shortvideo.cut.m.f125471d)) >= r13.w.f125496g) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a8, code lost:
        D();
        E();
        r1 = (r13.f126111g.getStartX() - ((float) com.ss.android.ugc.aweme.shortvideo.cut.m.f125471d)) - r13.w.f125496g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c2, code lost:
        if (r1 >= ((float) r13.T)) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d5, code lost:
        if (r13.f126111g.getStartX() != ((float) ((r13.f126107c - r13.T) - com.ss.android.ugc.aweme.shortvideo.cut.m.f125471d))) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d7, code lost:
        E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01da, code lost:
        r1 = (float) r13.T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01dd, code lost:
        r13.f126112h.setStartX(r1);
        setCurPointerContainerStartX(r1 + ((float) com.ss.android.ugc.aweme.shortvideo.cut.m.f125471d));
        c((int) r13.f126112h.getStartX(), (int) r13.f126111g.getStartX());
        b();
        r13.f126109e.a();
        i();
        w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021e, code lost:
        if (r12.equals("endSlide") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0249, code lost:
        if (r12.equals("startSlideTime") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0251, code lost:
        if (r12.equals("endSlideTime") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0255, code lost:
        r13.f126109e.d();
        r13.f126109e.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0265, code lost:
        if (r12.equals("startSlide") == false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 874
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void a(float f2, boolean z2) {
        com.ss.android.ugc.tools.c.f149151f.a(a.a(Locale.getDefault(), "VEEffectSeekLayout->processCurPointSlide0: targetX: %f, isTouch: %b", new Object[]{Float.valueOf(f2), Boolean.valueOf(z2)}));
        if (this.ag == 2) {
            f2 = Math.min(Math.max((float) (this.T + m.f125471d), f2), (float) (((this.f126107c - this.T) - m.f125471d) - m.f125472e));
        } else {
            if (f2 < this.f126112h.getStartX() + ((float) m.f125471d)) {
                f2 = this.f126112h.getStartX() + ((float) m.f125471d);
            }
            if (f2 > this.f126111g.getStartX() - ((float) this.s.getWidth())) {
                f2 = this.f126111g.getStartX() - ((float) this.s.getWidth());
            }
        }
        com.ss.android.ugc.tools.c.f149151f.a(a.a(Locale.getDefault(), "VEEffectSeekLayout->processCurPointSlide1: targetX: %f", new Object[]{Float.valueOf(f2)}));
        setCurPointerContainerStartX(f2);
        this.f126109e.a(this.H);
        if (!z2) {
            return;
        }
        if (this.J == 2) {
            this.f126109e.a(getSinglePlayingPosition());
        } else {
            this.f126109e.a(getMultiPlayingPosition());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(float f2, float f3, int i2) {
        a(f2, f3, i2, true);
    }

    public VideoEditView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        this.t = true;
        this.ad = new w();
        this.M = true;
        this.ag = 1;
        this.aj = true;
        this.ak = false;
        this.al = true;
        this.ap = false;
        this.av = m.f125469b;
        this.P = m.f125468a;
        this.ax = (int) r.a(getContext(), 32.0f);
        this.T = (int) r.a(getContext(), 36.0f);
        this.aB = true;
        this.aD = -1.0f;
        this.aE = new RecyclerView.n() {
            /* class com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.AnonymousClass4 */

            /* renamed from: b  reason: collision with root package name */
            private boolean f126124b;

            static {
                Covode.recordClassIndex(82819);
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void a() {
                VideoEditView.this.u = false;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                if (i2 == 0) {
                    if (this.f126124b) {
                        VideoEditView.this.f126109e.g();
                        this.f126124b = false;
                    }
                    recyclerView.postDelayed(new v(this), 100);
                } else {
                    VideoEditView.this.u = true;
                }
                super.a(recyclerView, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2, int i3) {
                if (i2 != 0) {
                    this.f126124b = true;
                    VideoEditView videoEditView = VideoEditView.this;
                    int i4 = videoEditView.I;
                    if (com.ss.android.ugc.asve.f.d.a(recyclerView.getContext())) {
                        i2 = -i2;
                    }
                    videoEditView.I = i4 + i2;
                    VideoEditView.this.b();
                    VideoEditView.this.i();
                    VideoEditView.this.j();
                    VideoEditView.this.f126109e.f();
                }
            }
        };
        this.aF = false;
        this.aG = true;
        this.az = (int) r.a(context, 2.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.qa, R.attr.qr, R.attr.qs, R.attr.uz, R.attr.v0, R.attr.a1v, R.attr.a5g, R.attr.a5h, R.attr.a6a, R.attr.a7j, R.attr.abv, R.attr.acv, R.attr.af8});
            this.ah = obtainStyledAttributes.getColor(6, 0);
            this.ah = androidx.core.graphics.a.b(this.ah, (int) (obtainStyledAttributes.getFloat(7, 1.0f) * 255.0f));
            this.ai = obtainStyledAttributes.getColor(12, getResources().getColor(R.color.u5));
            this.ag = obtainStyledAttributes.getInt(9, 1);
            this.av = Math.round(obtainStyledAttributes.getDimension(4, (float) m.f125469b));
            int round = Math.round(obtainStyledAttributes.getDimension(3, (float) m.f125468a));
            this.aw = round;
            this.P = round;
            this.ar = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
            int round2 = Math.round(obtainStyledAttributes.getDimension(1, 0.0f));
            this.at = round2;
            this.as = round2;
            this.R = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
            this.aA = obtainStyledAttributes.getBoolean(10, false);
            this.Q = this.P + (this.az * 2);
            this.T = Math.round(obtainStyledAttributes.getDimension(11, (float) (this.R - m.f125471d)));
            int i3 = this.as;
            this.ay = (i3 - this.Q) / 2;
            this.S = (i3 - this.P) / 2;
            this.M = obtainStyledAttributes.getBoolean(8, true);
            obtainStyledAttributes.recycle();
        }
    }

    private void a(float f2, float f3, int i2, boolean z2) {
        this.f126112h.setStartX(f2);
        this.A.a(getAudioStartTranslationX());
        this.f126111g.setStartX(f3);
        c((int) this.f126112h.getStartX(), (int) this.f126111g.getStartX());
        this.I = i2;
        b();
        post(new s(this, z2));
    }
}
