package com.bytedance.ies.powerlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.bytedance.ies.powerlist.proxy.ListVMProxy;
import com.bytedance.tiktok.proxy.b;
import com.bytedance.tiktok.proxy.c;
import com.bytedance.tiktok.proxy.d;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.a.z;
import h.f.b.l;
import java.util.List;

public abstract class PowerCell<T extends a> extends RecyclerView.ViewHolder implements k, m, c<PowerCell<T>, T, ListVMProxy<PowerCell<T>, T>> {

    /* renamed from: a  reason: collision with root package name */
    private final n f34231a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f34232b;

    /* renamed from: c  reason: collision with root package name */
    public m f34233c;

    /* renamed from: d  reason: collision with root package name */
    public T f34234d;

    /* renamed from: e  reason: collision with root package name */
    public PowerAdapter f34235e;

    /* renamed from: f  reason: collision with root package name */
    public PowerStub f34236f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f34237g;

    /* renamed from: h  reason: collision with root package name */
    public final PowerCell<T> f34238h;

    /* renamed from: i  reason: collision with root package name */
    public ListVMProxy<PowerCell<T>, T> f34239i;

    /* renamed from: j  reason: collision with root package name */
    private final b<PowerCell<T>, T> f34240j;

    static {
        Covode.recordClassIndex(20461);
    }

    public void a(T t, List<? extends Object> list) {
        l.c(t, "");
        l.c(list, "");
    }

    public void a(Object obj) {
    }

    public int j() {
        return 0;
    }

    public void k() {
    }

    public void onDestroy() {
    }

    public void q() {
    }

    @Override // com.bytedance.tiktok.proxy.c
    public final m aC_() {
        return this.f34233c;
    }

    @Override // com.bytedance.tiktok.proxy.c
    public final /* bridge */ /* synthetic */ d aG_() {
        return this.f34238h;
    }

    public b<PowerCell<T>, T> f() {
        return this.f34240j;
    }

    @Override // androidx.lifecycle.m
    public i getLifecycle() {
        return this.f34231a;
    }

    public void m() {
        p();
    }

    public void l() {
        o();
        n();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PowerCell() {
        /*
            r2 = this;
            android.widget.Space r1 = com.bytedance.ies.powerlist.c.f34260a
            if (r1 != 0) goto L_0x0009
            java.lang.String r0 = "globalSpace"
            h.f.b.l.a(r0)
        L_0x0009:
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.powerlist.PowerCell.<init>():void");
    }

    private final void e() {
        if (this.f34237g) {
            this.f34231a.a(i.a.ON_START);
        }
    }

    private final void r() {
        if (this.f34237g) {
            this.f34231a.a(i.a.ON_PAUSE);
        }
    }

    public final m i() {
        PowerAdapter powerAdapter = this.f34235e;
        if (powerAdapter != null) {
            return powerAdapter.j();
        }
        return null;
    }

    private final boolean d() {
        f.a.l.b<com.bytedance.ies.powerlist.page.config.c> bVar;
        com.bytedance.ies.powerlist.page.config.c i2;
        PowerAdapter powerAdapter = this.f34235e;
        if (powerAdapter == null || (bVar = powerAdapter.f34214f) == null || (i2 = bVar.i()) == null) {
            return false;
        }
        return i2.f34360e;
    }

    private final void s() {
        if (this.f34237g) {
            this.f34231a.a(i.a.ON_STOP);
            ListVMProxy<PowerCell<T>, T> listVMProxy = this.f34239i;
            if (listVMProxy != null) {
                listVMProxy.a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        i lifecycle;
        if (!this.f34232b) {
            m mVar = this.f34233c;
            if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
                lifecycle.a(this);
            }
            this.f34232b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        this.f34237g = true;
        int i2 = d.f34268b[getLifecycle().a().ordinal()];
        if (i2 == 1) {
            e();
            a(false);
        } else if (i2 == 2) {
            a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1 != 3) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r2 = this;
            androidx.lifecycle.i r0 = r2.getLifecycle()
            androidx.lifecycle.i$b r0 = r0.a()
            int[] r1 = com.bytedance.ies.powerlist.d.f34269c
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x001d
            r0 = 2
            if (r1 == r0) goto L_0x0020
            r0 = 3
            if (r1 == r0) goto L_0x0020
        L_0x0019:
            r0 = 0
            r2.f34237g = r0
            return
        L_0x001d:
            r2.r()
        L_0x0020:
            r2.s()
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.powerlist.PowerCell.p():void");
    }

    @Override // com.bytedance.tiktok.proxy.c
    public final /* bridge */ /* synthetic */ void a(com.bytedance.tiktok.proxy.a aVar) {
        this.f34239i = (ListVMProxy) aVar;
    }

    public void a(T t) {
        l.c(t, "");
        a(t, z.INSTANCE);
    }

    private PowerCell(View view) {
        super(view);
        this.f34231a = new n(this);
        this.f34238h = this;
    }

    private final void a(boolean z) {
        if (this.f34237g) {
            this.f34231a.a(i.a.ON_RESUME);
            ListVMProxy<PowerCell<T>, T> listVMProxy = this.f34239i;
            if (listVMProxy != null) {
                listVMProxy.a(this, z);
            }
        }
    }

    public View a(ViewGroup viewGroup) {
        View a2;
        l.c(viewGroup, "");
        Integer valueOf = Integer.valueOf(j());
        if (valueOf.intValue() > 0 && valueOf != null && (a2 = a(viewGroup, valueOf.intValue())) != null) {
            return a2;
        }
        throw new IllegalArgumentException("onCreateItemView layoutId is valid!!");
    }

    public static /* synthetic */ ac a(PowerCell powerCell, Class cls) {
        e d2;
        PowerAdapter powerAdapter = powerCell.f34235e;
        if (powerAdapter == null || (d2 = powerAdapter.d()) == null) {
            return null;
        }
        return ae.a(d2, (ad.b) null).a(cls);
    }

    public static /* synthetic */ ac b(PowerCell powerCell, Class cls) {
        Fragment c2;
        PowerAdapter powerAdapter = powerCell.f34235e;
        if (powerAdapter == null || (c2 = powerAdapter.c()) == null) {
            return null;
        }
        return ae.a(c2, (ad.b) null).a(cls);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        i lifecycle;
        l.c(mVar, "");
        l.c(aVar, "");
        switch (d.f34267a[aVar.ordinal()]) {
            case 1:
                this.f34231a.a(i.a.ON_CREATE);
                q();
                return;
            case 2:
                e();
                return;
            case 3:
                a(true);
                return;
            case 4:
                r();
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                s();
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                p();
                this.f34231a.a(i.a.ON_DESTROY);
                m mVar2 = this.f34233c;
                if (!(mVar2 == null || (lifecycle = mVar2.getLifecycle()) == null)) {
                    lifecycle.b(this);
                }
                onDestroy();
                return;
            default:
                return;
        }
    }

    public final View a(ViewGroup viewGroup, int i2) {
        l.c(viewGroup, "");
        Context context = viewGroup.getContext();
        if (!d()) {
            View a2 = com.a.a(LayoutInflater.from(context), i2, viewGroup, false);
            l.a((Object) a2, "");
            return a2;
        } else if (context instanceof Activity) {
            com.a.b.b.a(i2);
            View a3 = com.a.b.c.a((Activity) context, i2);
            com.a.b.c.a(context, i2);
            l.a((Object) a3, "");
            return a3;
        } else {
            throw new IllegalStateException("context is not an Activity??".toString());
        }
    }
}
