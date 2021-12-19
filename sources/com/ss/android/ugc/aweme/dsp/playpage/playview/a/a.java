package com.ss.android.ugc.aweme.dsp.playpage.playview.a;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playpage.base.b;
import h.f.b.l;

public abstract class a implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final C1994a f83754b = new C1994a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f83755a;

    /* renamed from: c  reason: collision with root package name */
    private b f83756c;

    /* renamed from: d  reason: collision with root package name */
    private int f83757d = -1;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f83758e;

    static {
        Covode.recordClassIndex(52250);
    }

    public abstract void c(c cVar);

    public abstract void d(c cVar);

    public abstract ViewGroup e();

    public void f() {
    }

    public void g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playpage.playview.a.a$a  reason: collision with other inner class name */
    public static final class C1994a {
        static {
            Covode.recordClassIndex(52251);
        }

        private C1994a() {
        }

        public /* synthetic */ C1994a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean j() {
        if (this.f83757d == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.playview.a.b
    public final void h() {
        ViewGroup viewGroup = this.f83758e;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        g();
    }

    /* access modifiers changed from: protected */
    public final ViewGroup k() {
        ViewGroup viewGroup = this.f83758e;
        if (viewGroup != null) {
            return viewGroup;
        }
        ViewGroup e2 = e();
        this.f83758e = e2;
        return e2;
    }

    /* access modifiers changed from: protected */
    public final b l() {
        b bVar = this.f83756c;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("Please ensure lifecycle [setPlayPage] invoked.");
    }

    /* access modifiers changed from: protected */
    public final boolean i() {
        String str;
        com.ss.android.ugc.aweme.dsp.playerservice.f.a a2;
        c n;
        if (!j()) {
            return false;
        }
        c cVar = this.f83755a;
        String str2 = null;
        if (cVar != null) {
            str = cVar.a();
        } else {
            str = null;
        }
        b bVar = this.f83756c;
        if (!(bVar == null || (a2 = bVar.a()) == null || (n = a2.f83565a.n()) == null)) {
            str2 = n.a();
        }
        if (l.a((Object) str, (Object) str2)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.playview.a.b
    public final void a(int i2) {
        this.f83757d = i2;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.playview.a.b
    public final void a(b bVar) {
        l.d(bVar, "");
        this.f83756c = bVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.playview.a.b
    public final void b(c cVar) {
        String str;
        c cVar2 = this.f83755a;
        String str2 = null;
        if (cVar2 != null) {
            str = cVar2.a();
        } else {
            str = null;
        }
        if (cVar != null) {
            str2 = cVar.a();
        }
        if (!l.a((Object) str, (Object) str2)) {
            this.f83755a = cVar;
            k().setVisibility(0);
            f();
            if (j()) {
                c(cVar);
            } else {
                d(cVar);
            }
        }
    }
}
