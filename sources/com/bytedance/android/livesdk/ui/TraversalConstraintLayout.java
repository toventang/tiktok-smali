package com.bytedance.android.livesdk.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.v;
import h.z;
import java.util.Map;

public final class TraversalConstraintLayout extends ConstraintLayout implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private boolean f21763g;

    /* renamed from: h  reason: collision with root package name */
    private long f21764h;

    /* renamed from: i  reason: collision with root package name */
    private long f21765i;

    /* renamed from: j  reason: collision with root package name */
    private long f21766j;

    /* renamed from: k  reason: collision with root package name */
    private long f21767k;

    /* renamed from: l  reason: collision with root package name */
    private long f21768l;

    /* renamed from: m  reason: collision with root package name */
    private final h f21769m;
    private r<? super Long, ? super Long, ? super Long, ? super Long, z> n;

    static {
        Covode.recordClassIndex(12826);
    }

    public TraversalConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final Map<String, Long> getMCostTimesMap() {
        return (Map) this.f21769m.getValue();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.r<? super java.lang.Long, ? super java.lang.Long, ? super java.lang.Long, ? super java.lang.Long, h.z>, h.f.a.r<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, h.z> */
    public final r<Long, Long, Long, Long, z> getTraversalCallBack() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f21763g) {
            removeCallbacks(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        postDelayed(this, ((long) PanelOpenCostTimesSetting.INSTANCE.getValue().f18748b) * 1000);
    }

    static final class a extends m implements h.f.a.a<Map<String, Long>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21770a = new a();

        static {
            Covode.recordClassIndex(12827);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, Long> invoke() {
            return ag.b(v.a("measure_duration", 0L), v.a("layout_duration", 0L), v.a("draw_duration", 0L), v.a("traversal_total_duration", 0L));
        }
    }

    public final void run() {
        long j2;
        long j3;
        long j4;
        this.f21763g = true;
        Map<String, Long> mCostTimesMap = getMCostTimesMap();
        r<? super Long, ? super Long, ? super Long, ? super Long, z> rVar = this.n;
        if (rVar != null) {
            Long l2 = mCostTimesMap.get("measure_duration");
            long j5 = 0;
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            Long valueOf = Long.valueOf(j2);
            Long l3 = mCostTimesMap.get("layout_duration");
            if (l3 != null) {
                j3 = l3.longValue();
            } else {
                j3 = 0;
            }
            Long valueOf2 = Long.valueOf(j3);
            Long l4 = mCostTimesMap.get("draw_duration");
            if (l4 != null) {
                j4 = l4.longValue();
            } else {
                j4 = 0;
            }
            Long valueOf3 = Long.valueOf(j4);
            Long l5 = mCostTimesMap.get("traversal_total_duration");
            if (l5 != null) {
                j5 = l5.longValue();
            }
            rVar.a(valueOf, valueOf2, valueOf3, Long.valueOf(j5));
        }
    }

    public final void setTraversalCallBack(r<? super Long, ? super Long, ? super Long, ? super Long, z> rVar) {
        this.n = rVar;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void dispatchDraw(Canvas canvas) {
        long j2;
        l.d(canvas, "");
        if (this.f21763g) {
            super.dispatchDraw(canvas);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.dispatchDraw(canvas);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.f21768l = elapsedRealtime2;
        this.f21767k = elapsedRealtime2 - elapsedRealtime;
        Map<String, Long> mCostTimesMap = getMCostTimesMap();
        long j3 = this.f21768l - this.f21764h;
        Long l2 = mCostTimesMap.get("traversal_total_duration");
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        if (j3 > j2) {
            mCostTimesMap.put("measure_duration", Long.valueOf(this.f21765i));
            mCostTimesMap.put("layout_duration", Long.valueOf(this.f21766j));
            mCostTimesMap.put("draw_duration", Long.valueOf(this.f21767k));
            mCostTimesMap.put("traversal_total_duration", Long.valueOf(this.f21768l - this.f21764h));
        }
        this.f21764h = 0;
        this.f21765i = 0;
        this.f21766j = 0;
        this.f21767k = 0;
        this.f21768l = 0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void onMeasure(int i2, int i3) {
        if (this.f21763g) {
            super.onMeasure(i2, i3);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f21764h == 0) {
            this.f21764h = elapsedRealtime;
        }
        super.onMeasure(i2, i3);
        this.f21765i += SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    private /* synthetic */ TraversalConstraintLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TraversalConstraintLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f21769m = i.a((h.f.a.a) a.f21770a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.f21763g) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onLayout(z, i2, i3, i4, i5);
        this.f21766j += SystemClock.elapsedRealtime() - elapsedRealtime;
    }
}
