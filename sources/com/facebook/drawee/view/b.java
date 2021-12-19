package com.facebook.drawee.view;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.h;
import com.facebook.common.d.i;
import com.facebook.drawee.b.b;
import com.facebook.drawee.e.t;
import com.facebook.drawee.e.u;
import com.facebook.drawee.h.a;
import com.facebook.drawee.h.b;

public class b<DH extends com.facebook.drawee.h.b> implements u {

    /* renamed from: a  reason: collision with root package name */
    public boolean f47494a;

    /* renamed from: b  reason: collision with root package name */
    public a f47495b;

    /* renamed from: c  reason: collision with root package name */
    public final com.facebook.drawee.b.b f47496c = com.facebook.drawee.b.b.a();

    /* renamed from: d  reason: collision with root package name */
    private boolean f47497d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47498e = true;

    /* renamed from: f  reason: collision with root package name */
    private DH f47499f;

    static {
        Covode.recordClassIndex(28813);
    }

    public final boolean e() {
        if (this.f47499f != null) {
            return true;
        }
        return false;
    }

    private boolean g() {
        a aVar = this.f47495b;
        if (aVar == null || aVar.e() != this.f47499f) {
            return false;
        }
        return true;
    }

    private void j() {
        if (!this.f47494a || !this.f47498e) {
            i();
        } else {
            h();
        }
    }

    public void b() {
        this.f47496c.a(b.a.ON_HOLDER_ATTACH);
        this.f47494a = true;
        j();
    }

    public void c() {
        this.f47496c.a(b.a.ON_HOLDER_DETACH);
        this.f47494a = false;
        j();
    }

    public final DH d() {
        return (DH) ((com.facebook.drawee.h.b) i.a(this.f47499f));
    }

    public Drawable f() {
        DH dh = this.f47499f;
        if (dh == null) {
            return null;
        }
        return dh.a();
    }

    private void h() {
        if (!this.f47497d) {
            this.f47496c.a(b.a.ON_ATTACH_CONTROLLER);
            this.f47497d = true;
            a aVar = this.f47495b;
            if (aVar != null && aVar.e() != null) {
                this.f47495b.f();
            }
        }
    }

    private void i() {
        if (this.f47497d) {
            this.f47496c.a(b.a.ON_DETACH_CONTROLLER);
            this.f47497d = false;
            if (g()) {
                this.f47495b.g();
            }
        }
    }

    @Override // com.facebook.drawee.e.u
    public final void a() {
        if (!this.f47497d) {
            com.facebook.common.e.a.b(com.facebook.drawee.b.b.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f47495b)), toString());
            this.f47494a = true;
            this.f47498e = true;
            j();
        }
    }

    public String toString() {
        return h.a(this).a("controllerAttached", this.f47497d).a("holderAttached", this.f47494a).a("drawableVisible", this.f47498e).a("events", this.f47496c.toString()).toString();
    }

    public static <DH extends com.facebook.drawee.h.b> b<DH> a(DH dh) {
        return new b<>(dh);
    }

    private void a(u uVar) {
        Drawable f2 = f();
        if (f2 instanceof t) {
            ((t) f2).a(uVar);
        }
    }

    public b(DH dh) {
        if (dh != null) {
            b(dh);
        }
    }

    @Override // com.facebook.drawee.e.u
    public final void a(boolean z) {
        b.a aVar;
        if (this.f47498e != z) {
            com.facebook.drawee.b.b bVar = this.f47496c;
            if (z) {
                aVar = b.a.ON_DRAWABLE_SHOW;
            } else {
                aVar = b.a.ON_DRAWABLE_HIDE;
            }
            bVar.a(aVar);
            this.f47498e = z;
            j();
        }
    }

    public final void b(DH dh) {
        boolean z;
        this.f47496c.a(b.a.ON_SET_HIERARCHY);
        boolean g2 = g();
        a((u) null);
        DH dh2 = (DH) ((com.facebook.drawee.h.b) i.a(dh));
        this.f47499f = dh2;
        Drawable a2 = dh2.a();
        if (a2 == null || a2.isVisible()) {
            z = true;
        } else {
            z = false;
        }
        a(z);
        a(this);
        if (g2) {
            this.f47495b.a(dh);
        }
    }

    public final void a(a aVar) {
        boolean z = this.f47497d;
        if (z) {
            i();
        }
        if (g()) {
            this.f47496c.a(b.a.ON_CLEAR_OLD_CONTROLLER);
            this.f47495b.a((com.facebook.drawee.h.b) null);
        }
        this.f47495b = aVar;
        if (aVar != null) {
            this.f47496c.a(b.a.ON_SET_CONTROLLER);
            this.f47495b.a(this.f47499f);
        } else {
            this.f47496c.a(b.a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            h();
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        if (!g()) {
            return false;
        }
        return this.f47495b.a(motionEvent);
    }
}
