package com.ss.android.ugc.aweme.feed.ui.seekbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.dsp.service.MusicDspServiceImpl;
import h.f.b.l;

public final class VideoSeekBarMaskView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f95037a;

    /* renamed from: b  reason: collision with root package name */
    private VideoSeekBar f95038b;

    /* renamed from: c  reason: collision with root package name */
    private MutableSeekBar f95039c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f95040d;

    /* renamed from: e  reason: collision with root package name */
    private float f95041e;

    /* renamed from: f  reason: collision with root package name */
    private float f95042f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f95043g;

    /* renamed from: h  reason: collision with root package name */
    private int f95044h;

    /* renamed from: i  reason: collision with root package name */
    private float f95045i;

    /* renamed from: j  reason: collision with root package name */
    private VideoSeekBar f95046j;

    /* renamed from: k  reason: collision with root package name */
    private MutableSeekBar f95047k;

    /* renamed from: l  reason: collision with root package name */
    private Rect f95048l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f95049m;
    private float n;
    private float o;
    private boolean p;
    private int q;
    private float r;

    static {
        Covode.recordClassIndex(60256);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f95050a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(60257);
        }

        public static boolean a() {
            if (SettingsManager.a().a("increase_seek_bar_touch_area", 0) > 0) {
                return true;
            }
            return false;
        }
    }

    public final float getLastDownRawX() {
        return this.f95041e;
    }

    public final float getLastDownRawY() {
        return this.f95042f;
    }

    public final float getMoveDx() {
        return this.f95045i;
    }

    public final boolean getMusicDspIsDownInRect() {
        return this.f95049m;
    }

    public final float getMusicDspLastDownRawX() {
        return this.n;
    }

    public final float getMusicDspLastDownRawY() {
        return this.o;
    }

    public final float getMusicDspMoveDx() {
        return this.r;
    }

    public final MutableSeekBar getMusicDspMutableSeekBar() {
        return this.f95047k;
    }

    public final boolean getMusicDspNeedHandleMove() {
        return this.p;
    }

    public final Rect getMusicDspSeekBarRect() {
        return this.f95048l;
    }

    public final int getMusicDspTouchSlop() {
        return this.q;
    }

    public final VideoSeekBar getMusicDspVideoSeekBar() {
        return this.f95046j;
    }

    public final MutableSeekBar getMutableSeekBar() {
        return this.f95039c;
    }

    public final boolean getNeedHandleMove() {
        return this.f95043g;
    }

    public final Rect getSeekBarRect() {
        return this.f95040d;
    }

    public final int getTouchSlop() {
        return this.f95044h;
    }

    public final VideoSeekBar getVideoSeekBar() {
        return this.f95038b;
    }

    private final boolean a() {
        VideoSeekBar videoSeekBar;
        if (!MusicDspServiceImpl.g().f() || (videoSeekBar = this.f95046j) == null || videoSeekBar.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void setDownInRect(boolean z) {
        this.f95037a = z;
    }

    public final void setLastDownRawX(float f2) {
        this.f95041e = f2;
    }

    public final void setLastDownRawY(float f2) {
        this.f95042f = f2;
    }

    public final void setMoveDx(float f2) {
        this.f95045i = f2;
    }

    public final void setMusicDspIsDownInRect(boolean z) {
        this.f95049m = z;
    }

    public final void setMusicDspLastDownRawX(float f2) {
        this.n = f2;
    }

    public final void setMusicDspLastDownRawY(float f2) {
        this.o = f2;
    }

    public final void setMusicDspMoveDx(float f2) {
        this.r = f2;
    }

    public final void setMusicDspMutableSeekBar(MutableSeekBar mutableSeekBar) {
        this.f95047k = mutableSeekBar;
    }

    public final void setMusicDspNeedHandleMove(boolean z) {
        this.p = z;
    }

    public final void setMusicDspSeekBarRect(Rect rect) {
        this.f95048l = rect;
    }

    public final void setMusicDspTouchSlop(int i2) {
        this.q = i2;
    }

    public final void setMusicDspVideoSeekBar(VideoSeekBar videoSeekBar) {
        this.f95046j = videoSeekBar;
    }

    public final void setMutableSeekBar(MutableSeekBar mutableSeekBar) {
        this.f95039c = mutableSeekBar;
    }

    public final void setNeedHandleMove(boolean z) {
        this.f95043g = z;
    }

    public final void setSeekBarRect(Rect rect) {
        this.f95040d = rect;
    }

    public final void setTouchSlop(int i2) {
        this.f95044h = i2;
    }

    public final void setVideoSeekBar(VideoSeekBar videoSeekBar) {
        this.f95038b = videoSeekBar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VideoSeekBarMaskView(Context context) {
        this(context, null);
        l.d(context, "");
    }

    public final void setMusicDspSeekBarView(VideoSeekBar videoSeekBar) {
        l.d(videoSeekBar, "");
        this.f95046j = videoSeekBar;
        this.f95047k = videoSeekBar.getMutableSeekBar();
    }

    public final boolean canScrollVertically(int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (getChildAt(i3).canScrollVertically(i2)) {
                return true;
            }
        }
        return super.canScrollVertically(i2);
    }

    public final void setSeekBarView(VideoSeekBar videoSeekBar) {
        MutableSeekBar mutableSeekBar;
        l.d(videoSeekBar, "");
        this.f95038b = videoSeekBar;
        if (videoSeekBar != null) {
            mutableSeekBar = videoSeekBar.getMutableSeekBar();
        } else {
            mutableSeekBar = null;
        }
        this.f95039c = mutableSeekBar;
    }

    public final boolean canScrollHorizontally(int i2) {
        if (a()) {
            if (!a.a() || !this.f95049m || this.r <= 10.0f) {
                return super.canScrollHorizontally(i2);
            }
            return true;
        } else if (!a.a() || !this.f95037a || this.f95045i <= 10.0f) {
            return super.canScrollHorizontally(i2);
        } else {
            return true;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VideoSeekBar videoSeekBar;
        VideoSeekBar videoSeekBar2;
        Integer valueOf;
        VideoSeekBar videoSeekBar3;
        VideoSeekBar videoSeekBar4;
        Integer valueOf2;
        if (a()) {
            if (!a.a() || (((videoSeekBar3 = this.f95046j) != null && videoSeekBar3.getVisibility() == 8) || ((videoSeekBar4 = this.f95046j) != null && videoSeekBar4.getVisibility() == 4))) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            Rect rect = new Rect();
            this.f95048l = rect;
            MutableSeekBar mutableSeekBar = this.f95047k;
            if (mutableSeekBar != null) {
                mutableSeekBar.getGlobalVisibleRect(rect);
            }
            if (!(motionEvent == null || (valueOf2 = Integer.valueOf(motionEvent.getAction())) == null)) {
                if (valueOf2.intValue() == 0) {
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    float a2 = (float) SettingsManager.a().a("increase_seek_bar_touch_area", 0);
                    Rect rect2 = this.f95048l;
                    if (rect2 == null || rawX < ((float) rect2.left) || rawX > ((float) rect2.right) || rawY < ((float) rect2.top) - a2 || rawY > ((float) rect2.bottom) + a2) {
                        this.f95049m = false;
                    } else {
                        this.f95049m = true;
                        this.n = motionEvent.getRawX();
                        this.o = motionEvent.getRawY();
                        VideoSeekBar videoSeekBar5 = this.f95046j;
                        if (videoSeekBar5 != null) {
                            videoSeekBar5.a(motionEvent);
                        }
                        MutableSeekBar mutableSeekBar2 = this.f95047k;
                        if (mutableSeekBar2 != null) {
                            mutableSeekBar2.onTouchEvent(motionEvent);
                        }
                    }
                } else if (valueOf2.intValue() == 2) {
                    if (this.f95049m) {
                        float abs = Math.abs(this.n - motionEvent.getRawX());
                        float abs2 = Math.abs(this.o - motionEvent.getRawY());
                        this.r = abs;
                        if (abs > ((float) this.q) && abs > abs2) {
                            this.p = true;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            return true;
                        }
                    }
                } else if (valueOf2.intValue() == 1 || valueOf2.intValue() == 3) {
                    if (this.f95049m && this.p) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    this.f95049m = false;
                    this.p = false;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } else if (!a.a() || (((videoSeekBar = this.f95038b) != null && videoSeekBar.getVisibility() == 8) || ((videoSeekBar2 = this.f95038b) != null && videoSeekBar2.getVisibility() == 4))) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            Rect rect3 = new Rect();
            this.f95040d = rect3;
            MutableSeekBar mutableSeekBar3 = this.f95039c;
            if (mutableSeekBar3 != null) {
                mutableSeekBar3.getGlobalVisibleRect(rect3);
            }
            if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null)) {
                if (valueOf.intValue() == 0) {
                    float rawX2 = motionEvent.getRawX();
                    float rawY2 = motionEvent.getRawY();
                    float a3 = (float) SettingsManager.a().a("increase_seek_bar_touch_area", 0);
                    Rect rect4 = this.f95040d;
                    if (rect4 == null || rawX2 < ((float) rect4.left) || rawX2 > ((float) rect4.right) || rawY2 < ((float) rect4.top) - a3 || rawY2 > ((float) rect4.bottom) + a3) {
                        this.f95037a = false;
                    } else {
                        this.f95037a = true;
                        this.f95041e = motionEvent.getRawX();
                        this.f95042f = motionEvent.getRawY();
                        VideoSeekBar videoSeekBar6 = this.f95038b;
                        if (videoSeekBar6 != null) {
                            videoSeekBar6.a(motionEvent);
                        }
                        MutableSeekBar mutableSeekBar4 = this.f95039c;
                        if (mutableSeekBar4 != null) {
                            mutableSeekBar4.onTouchEvent(motionEvent);
                        }
                    }
                } else if (valueOf.intValue() == 2) {
                    if (this.f95037a) {
                        float abs3 = Math.abs(this.f95041e - motionEvent.getRawX());
                        float abs4 = Math.abs(this.f95042f - motionEvent.getRawY());
                        this.f95045i = abs3;
                        if (abs3 > ((float) this.f95044h) && abs3 > abs4) {
                            this.f95043g = true;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            return true;
                        }
                    }
                } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                    if (this.f95037a && this.f95043g) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    this.f95037a = false;
                    this.f95043g = false;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VideoSeekBar videoSeekBar;
        VideoSeekBar videoSeekBar2;
        Integer valueOf;
        VideoSeekBar videoSeekBar3;
        VideoSeekBar videoSeekBar4;
        Integer valueOf2;
        if (a()) {
            if (!a.a() || (((videoSeekBar3 = this.f95046j) != null && videoSeekBar3.getVisibility() == 8) || ((videoSeekBar4 = this.f95046j) != null && videoSeekBar4.getVisibility() == 4))) {
                return super.onTouchEvent(motionEvent);
            }
            if (!(motionEvent == null || (valueOf2 = Integer.valueOf(motionEvent.getAction())) == null)) {
                if (valueOf2.intValue() == 2) {
                    if (Math.abs(this.n - motionEvent.getRawX()) > ((float) this.q)) {
                        VideoSeekBar videoSeekBar5 = this.f95046j;
                        if (videoSeekBar5 != null) {
                            videoSeekBar5.a(motionEvent);
                        }
                        MutableSeekBar mutableSeekBar = this.f95047k;
                        if (mutableSeekBar != null) {
                            mutableSeekBar.onTouchEvent(motionEvent);
                        }
                        this.p = true;
                    }
                } else if (valueOf2.intValue() == 1 || valueOf2.intValue() == 3) {
                    if (this.p) {
                        VideoSeekBar videoSeekBar6 = this.f95046j;
                        if (videoSeekBar6 != null) {
                            videoSeekBar6.a(motionEvent);
                        }
                        MutableSeekBar mutableSeekBar2 = this.f95047k;
                        if (mutableSeekBar2 != null) {
                            mutableSeekBar2.onTouchEvent(motionEvent);
                        }
                    }
                    this.f95049m = false;
                    this.p = false;
                }
            }
            return super.onTouchEvent(motionEvent);
        } else if (!a.a() || (((videoSeekBar = this.f95038b) != null && videoSeekBar.getVisibility() == 8) || ((videoSeekBar2 = this.f95038b) != null && videoSeekBar2.getVisibility() == 4))) {
            return super.onTouchEvent(motionEvent);
        } else {
            if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null)) {
                if (valueOf.intValue() == 2) {
                    if (Math.abs(this.f95041e - motionEvent.getRawX()) > ((float) this.f95044h)) {
                        VideoSeekBar videoSeekBar7 = this.f95038b;
                        if (videoSeekBar7 != null) {
                            videoSeekBar7.a(motionEvent);
                        }
                        MutableSeekBar mutableSeekBar3 = this.f95039c;
                        if (mutableSeekBar3 != null) {
                            mutableSeekBar3.onTouchEvent(motionEvent);
                        }
                        this.f95043g = true;
                    }
                } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                    if (this.f95043g) {
                        VideoSeekBar videoSeekBar8 = this.f95038b;
                        if (videoSeekBar8 != null) {
                            videoSeekBar8.a(motionEvent);
                        }
                        MutableSeekBar mutableSeekBar4 = this.f95039c;
                        if (mutableSeekBar4 != null) {
                            mutableSeekBar4.onTouchEvent(motionEvent);
                        }
                    }
                    this.f95037a = false;
                    this.f95043g = false;
                }
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VideoSeekBarMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private VideoSeekBarMaskView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(8007);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        l.b(viewConfiguration, "");
        this.f95044h = viewConfiguration.getScaledTouchSlop();
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(context);
        l.b(viewConfiguration2, "");
        this.q = viewConfiguration2.getScaledTouchSlop();
        MethodCollector.o(8007);
    }
}
