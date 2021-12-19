package com.ss.ugc.live.barrage.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;

public abstract class a {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ i[] f154062f = {new y(ab.a(a.class), "paint", "getPaint()Landroid/graphics/Paint;")};

    /* renamed from: a  reason: collision with root package name */
    private final h f154063a = h.i.a((h.f.a.a) c.f154073a);

    /* renamed from: g  reason: collision with root package name */
    public b f154064g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f154065h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f154066i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f154067j = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: k  reason: collision with root package name */
    public volatile AbstractC4098a f154068k;

    public interface b {
        static {
            Covode.recordClassIndex(102737);
        }

        void a();
    }

    public final Paint a() {
        return (Paint) this.f154063a.getValue();
    }

    public abstract Bitmap b();

    public void c() {
    }

    public void d() {
    }

    /* renamed from: com.ss.ugc.live.barrage.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC4098a {
        static {
            Covode.recordClassIndex(102732);
        }

        private AbstractC4098a() {
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$a  reason: collision with other inner class name */
        public static final class C4099a extends AbstractC4098a {

            /* renamed from: a  reason: collision with root package name */
            public static final C4099a f154069a = new C4099a();

            private C4099a() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(102733);
            }
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$b */
        public static final class b extends AbstractC4098a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f154070a = new b();

            private b() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(102734);
            }
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$c */
        public static final class c extends AbstractC4098a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f154071a = new c();

            private c() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(102735);
            }
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$d */
        public static final class d extends AbstractC4098a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f154072a = new d();

            private d() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(102736);
            }
        }

        public /* synthetic */ AbstractC4098a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<Paint> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f154073a = new c();

        static {
            Covode.recordClassIndex(102738);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setDither(true);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    static {
        Covode.recordClassIndex(102731);
    }

    public final void a(AbstractC4098a aVar) {
        this.f154068k = aVar;
        b(aVar);
    }

    public final boolean a(MotionEvent motionEvent) {
        l.c(motionEvent, "");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            b bVar = this.f154064g;
            if (bVar != null) {
                bVar.a();
            }
        }
        return true;
    }

    private final void b(AbstractC4098a aVar) {
        if (l.a(aVar, AbstractC4098a.b.f154070a)) {
            return;
        }
        if (l.a(aVar, AbstractC4098a.c.f154071a)) {
            c();
        } else if (!l.a(aVar, AbstractC4098a.d.f154072a) && l.a(aVar, AbstractC4098a.C4099a.f154069a)) {
            d();
        }
    }

    public void a(Canvas canvas) {
        Bitmap b2;
        l.c(canvas, "");
        if (!(!l.a(this.f154068k, AbstractC4098a.d.f154072a)) && (b2 = b()) != null && !b2.isRecycled()) {
            canvas.drawBitmap(b(), this.f154067j.left, this.f154067j.top, a());
        }
    }
}
