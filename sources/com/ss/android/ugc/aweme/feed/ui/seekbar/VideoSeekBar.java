package com.ss.android.ugc.aweme.feed.ui.seekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class VideoSeekBar extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f95023a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f95024b;

    /* renamed from: c  reason: collision with root package name */
    private int f95025c;

    /* renamed from: d  reason: collision with root package name */
    private int f95026d;

    /* renamed from: e  reason: collision with root package name */
    private MutableSeekBar f95027e;

    /* renamed from: f  reason: collision with root package name */
    private Float f95028f;

    /* renamed from: g  reason: collision with root package name */
    private c f95029g;

    /* renamed from: h  reason: collision with root package name */
    private b f95030h;

    /* renamed from: i  reason: collision with root package name */
    private int f95031i;

    /* renamed from: j  reason: collision with root package name */
    private int f95032j;

    /* renamed from: k  reason: collision with root package name */
    private final int f95033k;

    /* renamed from: l  reason: collision with root package name */
    private final int f95034l;

    /* renamed from: m  reason: collision with root package name */
    private final int f95035m;
    private int n;
    private float o;

    public interface b {
        static {
            Covode.recordClassIndex(60253);
        }

        void a(MotionEvent motionEvent);
    }

    public interface c {
        static {
            Covode.recordClassIndex(60254);
        }

        void a(SeekBar seekBar);

        void a(SeekBar seekBar, int i2, boolean z);

        void b(SeekBar seekBar);
    }

    static {
        Covode.recordClassIndex(60251);
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60252);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final b getMOnDispatchTouchEventListener() {
        return this.f95030h;
    }

    public final c getMOnSeekBarChangeListener() {
        return this.f95029g;
    }

    public final Float getMProgress() {
        return this.f95028f;
    }

    public final int getMScreenWidth() {
        return this.f95031i;
    }

    public final MutableSeekBar getMutableSeekBar() {
        return this.f95027e;
    }

    public final float getProgressHeight() {
        return this.o;
    }

    public final int getSeekBarShowType() {
        return this.f95032j;
    }

    public final void setMOnDispatchTouchEventListener(b bVar) {
        this.f95030h = bVar;
    }

    public final void setMOnSeekBarChangeListener(c cVar) {
        this.f95029g = cVar;
    }

    public final void setMProgress(Float f2) {
        this.f95028f = f2;
    }

    public final void setMScreenWidth(int i2) {
        this.f95031i = i2;
    }

    public final void setProgress(float f2) {
        a(f2);
    }

    public final void setProgressHeight(float f2) {
        this.o = f2;
    }

    public static final class d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoSeekBar f95036a;

        static {
            Covode.recordClassIndex(60255);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(VideoSeekBar videoSeekBar) {
            this.f95036a = videoSeekBar;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            c mOnSeekBarChangeListener = this.f95036a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.a(seekBar);
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            c mOnSeekBarChangeListener = this.f95036a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.b(seekBar);
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            c mOnSeekBarChangeListener = this.f95036a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.a(seekBar, i2, z);
            }
        }
    }

    public VideoSeekBar(Context context) {
        this(context, null);
    }

    public final void setOnDispatchTouchEventListener(b bVar) {
        l.d(bVar, "");
        this.f95030h = bVar;
    }

    public final void setOnSeekBarChangeListener(c cVar) {
        l.d(cVar, "");
        this.f95029g = cVar;
    }

    public final void setPauseStatus(boolean z) {
        MutableSeekBar mutableSeekBar = this.f95027e;
        if (mutableSeekBar != null) {
            mutableSeekBar.setPauseStatus(z);
        }
    }

    public final z a(MotionEvent motionEvent) {
        b bVar = this.f95030h;
        if (bVar == null) {
            return null;
        }
        bVar.a(motionEvent);
        return z.f158842a;
    }

    public final void a(float f2) {
        this.f95028f = Float.valueOf(f2);
        MutableSeekBar mutableSeekBar = this.f95027e;
        if (mutableSeekBar != null) {
            mutableSeekBar.setProgress((int) (f2 * 100.0f));
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        if (this.f95032j == 2) {
            return false;
        }
        a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    private final void a(int i2) {
        this.o = (float) this.f95024b;
        int i3 = this.f95025c;
        float f2 = (float) i3;
        this.n = this.f95034l;
        if (i2 == 1) {
            this.o = (float) i3;
            f2 = (float) this.f95026d;
            this.n = this.f95033k;
        }
        MutableSeekBar mutableSeekBar = this.f95027e;
        if (mutableSeekBar != null) {
            com.ss.android.ugc.aweme.feed.ui.seekbar.a.c.a(mutableSeekBar);
            MutableSeekBar.a(mutableSeekBar, Integer.valueOf(this.n), null, Float.valueOf(this.o), 10);
            MutableSeekBar.a(mutableSeekBar, Float.valueOf(f2), Integer.valueOf(this.n));
        }
    }

    public final void setSeekBarShowType(int i2) {
        MutableSeekBar mutableSeekBar;
        if (this.f95032j != i2) {
            this.f95032j = i2;
            if (i2 == 0) {
                MutableSeekBar mutableSeekBar2 = this.f95027e;
                if (mutableSeekBar2 != null) {
                    mutableSeekBar2.setVisibility(0);
                    a(0);
                    mutableSeekBar2.setCanDrag(true);
                }
            } else if (i2 == 1) {
                MutableSeekBar mutableSeekBar3 = this.f95027e;
                if (mutableSeekBar3 != null) {
                    mutableSeekBar3.setVisibility(0);
                    a(1);
                    mutableSeekBar3.setCanDrag(true);
                }
            } else if (i2 == 2 && (mutableSeekBar = this.f95027e) != null) {
                mutableSeekBar.setCanDrag(false);
                mutableSeekBar.setVisibility(8);
            }
        }
    }

    public VideoSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private VideoSeekBar(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        ViewGroup.LayoutParams layoutParams;
        MethodCollector.i(8060);
        this.f95024b = (int) n.b(getContext(), 2.0f);
        this.f95025c = (int) n.b(getContext(), 4.0f);
        this.f95026d = (int) n.b(getContext(), 13.0f);
        this.f95032j = 2;
        Context context2 = getContext();
        if (context2 == null) {
            l.b();
        }
        this.f95033k = androidx.core.content.b.c(context2, R.color.f159928l);
        Context context3 = getContext();
        if (context3 == null) {
            l.b();
        }
        int c2 = androidx.core.content.b.c(context3, R.color.ac);
        this.f95034l = c2;
        Context context4 = getContext();
        if (context4 == null) {
            l.b();
        }
        int c3 = androidx.core.content.b.c(context4, R.color.a7);
        this.f95035m = c3;
        this.n = c2;
        this.o = (float) this.f95024b;
        try {
            this.f95031i = n.a(context);
            View a2 = com.a.b.a.a(context, R.layout.tl, this, true);
            bringToFront();
            MutableSeekBar mutableSeekBar = (MutableSeekBar) a2.findViewById(R.id.dwy);
            this.f95027e = mutableSeekBar;
            if (!(mutableSeekBar == null || (layoutParams = mutableSeekBar.getLayoutParams()) == null)) {
                layoutParams.height = (int) n.b(context, 20.0f);
            }
            MutableSeekBar mutableSeekBar2 = this.f95027e;
            if (mutableSeekBar2 != null) {
                MutableSeekBar.a(mutableSeekBar2, Integer.valueOf(this.n), Integer.valueOf(c3), Float.valueOf(this.o), 8);
                MutableSeekBar.a(mutableSeekBar2, Float.valueOf((float) this.f95025c), Integer.valueOf(this.n));
            }
            MutableSeekBar mutableSeekBar3 = this.f95027e;
            if (mutableSeekBar3 != null) {
                mutableSeekBar3.setCustomOnSeekBarChangeListener(new d(this));
                MethodCollector.o(8060);
                return;
            }
            MethodCollector.o(8060);
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
            MethodCollector.o(8060);
        }
    }
}
