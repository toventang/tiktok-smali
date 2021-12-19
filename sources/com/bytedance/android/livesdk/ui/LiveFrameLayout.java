package com.bytedance.android.livesdk.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.a.ag;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.v;
import h.z;
import java.util.Map;

public final class LiveFrameLayout extends FrameLayout implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private boolean f21753a;

    /* renamed from: b  reason: collision with root package name */
    private long f21754b;

    /* renamed from: c  reason: collision with root package name */
    private long f21755c;

    /* renamed from: d  reason: collision with root package name */
    private long f21756d;

    /* renamed from: e  reason: collision with root package name */
    private long f21757e;

    /* renamed from: f  reason: collision with root package name */
    private long f21758f;

    /* renamed from: g  reason: collision with root package name */
    private long f21759g;

    /* renamed from: h  reason: collision with root package name */
    private final h f21760h;

    /* renamed from: i  reason: collision with root package name */
    private b<? super Map<String, Long>, z> f21761i;

    static {
        Covode.recordClassIndex(12824);
    }

    public LiveFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final Map<String, Long> getMCostTimesMap() {
        return (Map) this.f21760h.getValue();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f21753a) {
            removeCallbacks(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        postDelayed(this, ((long) PanelOpenCostTimesSetting.INSTANCE.getValue().f18748b) * 1000);
    }

    public final void run() {
        this.f21753a = true;
        getMCostTimesMap().remove("traversal_start_time");
        getMCostTimesMap().put("total_traversal_times", Long.valueOf(this.f21759g));
        b<? super Map<String, Long>, z> bVar = this.f21761i;
        if (bVar != null) {
            bVar.invoke(getMCostTimesMap());
        }
    }

    static final class a extends m implements h.f.a.a<Map<String, Long>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21762a = new a();

        static {
            Covode.recordClassIndex(12825);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, Long> invoke() {
            return ag.b(v.a("traversal_start_time", 0L), v.a("measure_duration", 0L), v.a("layout_duration", 0L), v.a("draw_duration", 0L), v.a("traversal_end_time", 0L), v.a("traversal_total_duration", 0L));
        }
    }

    public final void setTraversalCallBack(b<? super Map<String, Long>, z> bVar) {
        l.d(bVar, "");
        this.f21761i = bVar;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        long j2;
        l.d(canvas, "");
        if (this.f21753a) {
            super.dispatchDraw(canvas);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.dispatchDraw(canvas);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.f21758f = elapsedRealtime2;
        this.f21757e = elapsedRealtime2 - elapsedRealtime;
        this.f21759g++;
        Map<String, Long> mCostTimesMap = getMCostTimesMap();
        long j3 = this.f21758f - this.f21754b;
        Long l2 = mCostTimesMap.get("traversal_total_duration");
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        if (j3 > j2) {
            mCostTimesMap.put("traversal_start_time", Long.valueOf(this.f21754b));
            mCostTimesMap.put("measure_duration", Long.valueOf(this.f21755c));
            mCostTimesMap.put("layout_duration", Long.valueOf(this.f21756d));
            mCostTimesMap.put("draw_duration", Long.valueOf(this.f21757e));
            mCostTimesMap.put("traversal_end_time", Long.valueOf(this.f21758f));
            mCostTimesMap.put("traversal_total_duration", Long.valueOf(this.f21758f - this.f21754b));
            mCostTimesMap.put("current_traversal_times", Long.valueOf(this.f21759g));
        }
        this.f21754b = 0;
        this.f21755c = 0;
        this.f21756d = 0;
        this.f21757e = 0;
        this.f21758f = 0;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(9888);
        if (this.f21753a) {
            super.onMeasure(i2, i3);
            MethodCollector.o(9888);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f21754b == 0) {
            this.f21754b = elapsedRealtime;
        }
        super.onMeasure(i2, i3);
        this.f21755c += SystemClock.elapsedRealtime() - elapsedRealtime;
        MethodCollector.o(9888);
    }

    private /* synthetic */ LiveFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LiveFrameLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(10065);
        this.f21760h = i.a((h.f.a.a) a.f21762a);
        MethodCollector.o(10065);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MethodCollector.i(10063);
        if (this.f21753a) {
            super.onLayout(z, i2, i3, i4, i5);
            MethodCollector.o(10063);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onLayout(z, i2, i3, i4, i5);
        this.f21756d += SystemClock.elapsedRealtime() - elapsedRealtime;
        MethodCollector.o(10063);
    }
}
