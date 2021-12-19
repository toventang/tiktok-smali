package com.ss.android.ugc.tools.utils.a;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class a {

    /* renamed from: h  reason: collision with root package name */
    public static final C4045a f149974h = new C4045a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public MotionEvent f149975a;

    /* renamed from: b  reason: collision with root package name */
    public MotionEvent f149976b;

    /* renamed from: c  reason: collision with root package name */
    public float f149977c;

    /* renamed from: d  reason: collision with root package name */
    public float f149978d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f149979e;

    /* renamed from: f  reason: collision with root package name */
    public long f149980f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f149981g;

    static {
        Covode.recordClassIndex(98729);
    }

    /* access modifiers changed from: protected */
    public abstract void a(int i2, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    public abstract void b(int i2, MotionEvent motionEvent);

    /* renamed from: com.ss.android.ugc.tools.utils.a.a$a  reason: collision with other inner class name */
    public static final class C4045a {
        static {
            Covode.recordClassIndex(98730);
        }

        private C4045a() {
        }

        public /* synthetic */ C4045a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
        MotionEvent motionEvent = this.f149975a;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.f149975a = null;
        }
        MotionEvent motionEvent2 = this.f149976b;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.f149976b = null;
        }
        this.f149979e = false;
    }

    public a(Context context) {
        l.d(context, "");
        this.f149981g = context;
    }

    public final boolean a(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        int action = motionEvent.getAction() & 255;
        if (!this.f149979e) {
            a(action, motionEvent);
            return true;
        }
        b(action, motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void b(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        MotionEvent motionEvent2 = this.f149975a;
        MotionEvent motionEvent3 = this.f149976b;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
            this.f149976b = null;
        }
        this.f149976b = MotionEvent.obtain(motionEvent);
        long eventTime = motionEvent.getEventTime();
        if (motionEvent2 == null) {
            l.b();
        }
        this.f149980f = eventTime - motionEvent2.getEventTime();
        this.f149977c = motionEvent.getPressure(motionEvent.getActionIndex());
        this.f149978d = motionEvent2.getPressure(motionEvent2.getActionIndex());
    }
}
