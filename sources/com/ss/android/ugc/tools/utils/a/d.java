package com.ss.android.ugc.tools.utils.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class d extends a {
    public static final a p = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private final float f149989i;

    /* renamed from: j  reason: collision with root package name */
    private float f149990j;

    /* renamed from: k  reason: collision with root package name */
    public float f149991k;

    /* renamed from: l  reason: collision with root package name */
    public float f149992l;

    /* renamed from: m  reason: collision with root package name */
    public float f149993m;
    public float n;
    public int o;
    private float q;
    private float r;
    private float s;

    static {
        Covode.recordClassIndex(98737);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.utils.a.a
    public abstract void a(int i2, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.utils.a.a
    public abstract void b(int i2, MotionEvent motionEvent);

    public static final class a {
        static {
            Covode.recordClassIndex(98738);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        l.d(context, "");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        l.b(viewConfiguration, "");
        this.f149989i = (float) viewConfiguration.getScaledEdgeSlop();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.utils.a.a
    public void b(MotionEvent motionEvent) {
        float f2;
        l.d(motionEvent, "");
        super.b(motionEvent);
        MotionEvent motionEvent2 = this.f149975a;
        this.r = -1.0f;
        this.s = -1.0f;
        if (motionEvent2 == null) {
            l.b();
        }
        float x = motionEvent2.getX(0);
        float y = motionEvent2.getY(0);
        float f3 = 0.0f;
        if (motionEvent2.getPointerCount() >= 2) {
            f3 = motionEvent2.getX(1);
            f2 = motionEvent2.getY(1);
        } else {
            f2 = 0.0f;
        }
        this.f149991k = f3 - x;
        this.f149992l = f2 - y;
        float x2 = motionEvent.getX(0);
        float y2 = motionEvent.getY(0);
        if (motionEvent.getPointerCount() >= 2) {
            f3 = motionEvent.getX(1);
            f2 = motionEvent.getY(1);
        }
        this.f149993m = f3 - x2;
        this.n = f2 - y2;
    }

    /* access modifiers changed from: protected */
    public final boolean c(MotionEvent motionEvent) {
        float f2;
        boolean z;
        boolean z2;
        l.d(motionEvent, "");
        Resources resources = this.f149981g.getResources();
        l.b(resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.f149990j = ((float) displayMetrics.widthPixels) - this.f149989i;
        float f3 = this.f149989i;
        float f4 = ((float) displayMetrics.heightPixels) - f3;
        this.q = f4;
        int i2 = this.o;
        float f5 = f3 - ((float) i2);
        float f6 = this.f149990j + ((float) i2);
        float f7 = f4 + ((float) i2);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        l.d(motionEvent, "");
        float x = motionEvent.getX() - motionEvent.getRawX();
        float f8 = 0.0f;
        if (1 < motionEvent.getPointerCount()) {
            f2 = motionEvent.getX(1) - x;
        } else {
            f2 = 0.0f;
        }
        l.d(motionEvent, "");
        float y = motionEvent.getY() - motionEvent.getRawY();
        if (1 < motionEvent.getPointerCount()) {
            f8 = motionEvent.getY(1) - y;
        }
        if (rawX < f5 || rawY < f5 || rawX > f6 || rawY > f7) {
            z = true;
        } else {
            z = false;
        }
        if (f2 < f5 || f8 < f5 || f2 > f6 || f8 > f7) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            return z2 ? true : true;
        }
        if (z2) {
            return true;
        }
        return false;
    }
}
