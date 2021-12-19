package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.core.h.d;
import com.bytedance.android.live.effect.api.a.e;
import com.bytedance.android.livesdk.chatroom.c.v;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class ao implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: a  reason: collision with root package name */
    d f15894a;

    /* renamed from: b  reason: collision with root package name */
    ScaleGestureDetector f15895b;

    /* renamed from: c  reason: collision with root package name */
    boolean f15896c;

    /* renamed from: d  reason: collision with root package name */
    int f15897d;

    /* renamed from: e  reason: collision with root package name */
    int f15898e;

    /* renamed from: f  reason: collision with root package name */
    int f15899f;

    /* renamed from: g  reason: collision with root package name */
    int f15900g;

    /* renamed from: h  reason: collision with root package name */
    boolean f15901h;

    /* renamed from: i  reason: collision with root package name */
    MotionEvent f15902i;

    /* renamed from: j  reason: collision with root package name */
    private float f15903j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    private a f15904k = a.BEF_GESTURE_TYPE_PAN;

    /* renamed from: l  reason: collision with root package name */
    private Context f15905l;

    static {
        Covode.recordClassIndex(8788);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    private v.a b() {
        MotionEvent motionEvent = this.f15902i;
        if (motionEvent != null) {
            return a(motionEvent, true);
        }
        return null;
    }

    public static boolean a() {
        List<com.bytedance.android.livesdkapi.depend.model.a> b2;
        e e2 = com.bytedance.android.live.effect.d.e();
        if (e2 == null || (b2 = e2.b(com.bytedance.android.live.effect.api.a.f9637b)) == null || b2.size() <= 0) {
            return false;
        }
        for (com.bytedance.android.livesdkapi.depend.model.a aVar : b2) {
            List<String> list = aVar.f23004j;
            if (list != null && list.size() > 0) {
                return list.contains("TouchGes");
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public enum a {
        BEF_GESTURE_TYPE_UNKNOWN,
        BEF_GESTURE_TYPE_TAP,
        BEF_GESTURE_TYPE_PAN,
        BEF_GESTURE_TYPE_ROTATE,
        BEF_GESTURE_TYPE_SCALE,
        BEF_GESTURE_TYPE_LONG_PRESS;

        static {
            Covode.recordClassIndex(8789);
        }
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f15903j = 1.0f;
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f15904k = a.BEF_GESTURE_TYPE_TAP;
        if (this.f15902i != null) {
            a(201, b());
            this.f15902i = null;
        }
        a(206, a(motionEvent, false));
        return false;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.f15904k = a.BEF_GESTURE_TYPE_SCALE;
        if (this.f15902i != null) {
            a(201, b());
            this.f15902i = null;
        }
        v.a aVar = new v.a();
        aVar.f15161g = scaleGestureDetector.getScaleFactor() / this.f15903j;
        aVar.f15160f = 3.0f;
        a(205, aVar);
        this.f15903j = scaleGestureDetector.getScaleFactor();
        return false;
    }

    public ao(Context context) {
        this.f15905l = context;
        this.f15897d = a(context).getResources().getDisplayMetrics().widthPixels;
        this.f15898e = a(context).getResources().getDisplayMetrics().heightPixels;
        d dVar = new d(context, this);
        this.f15894a = dVar;
        dVar.a();
        this.f15894a.a(this);
        this.f15895b = new ScaleGestureDetector(context, this);
    }

    static void a(int i2, v.a aVar) {
        if (aVar != null) {
            com.bytedance.android.livesdk.an.a.a().a(new v(i2, aVar));
        } else {
            com.bytedance.android.live.core.c.a.a(6, "EffectGestureDetector", "notifyTouchEvent event is null, action: ".concat(String.valueOf(i2)));
        }
    }

    /* access modifiers changed from: package-private */
    public final v.a a(MotionEvent motionEvent, boolean z) {
        a aVar;
        v.a aVar2 = new v.a();
        aVar2.f15156b = motionEvent.getX() / ((float) this.f15897d);
        aVar2.f15157c = motionEvent.getY() / ((float) this.f15898e);
        if (z && (aVar = this.f15904k) != null) {
            aVar2.f15155a = aVar.ordinal();
        }
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r4 != 6) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.livesdk.chatroom.c.v.a a(android.view.MotionEvent r6, long r7) {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.ao.a(android.view.MotionEvent, long):com.bytedance.android.livesdk.chatroom.c.v$a");
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (this.f15901h) {
            this.f15901h = false;
        }
        this.f15904k = a.BEF_GESTURE_TYPE_PAN;
        if (this.f15902i != null) {
            a(201, b());
            this.f15902i = null;
        }
        v.a a2 = a(motionEvent2, false);
        a2.f15158d = f2 / ((float) this.f15897d);
        a2.f15159e = f3 / ((float) this.f15898e);
        a2.f15160f = 1.0f;
        a(203, a2);
        return true;
    }
}
