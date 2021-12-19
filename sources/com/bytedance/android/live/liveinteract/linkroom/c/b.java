package com.bytedance.android.live.liveinteract.linkroom.c;

import android.view.View;
import androidx.lifecycle.m;
import com.bytedance.android.live.design.view.j;
import com.bytedance.android.live.liveinteract.linkroom.c.a;
import com.bytedance.android.live.liveinteract.platform.common.f.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public c f10540b;

    /* renamed from: c  reason: collision with root package name */
    public g f10541c;

    /* renamed from: d  reason: collision with root package name */
    private a f10542d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private boolean f10543e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10544f;

    static {
        Covode.recordClassIndex(5621);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
    }

    public final void onClick(View view) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
        this.f10541c.a();
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
        this.f10541c.b();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final boolean c() {
        return this.f10541c.c();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final boolean d() {
        return this.f10540b.f10555j;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final void f() {
        this.f10541c.d();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final void e() {
        if (this.f10540b.f10555j && this.f10541c.c()) {
            a(0, 17);
        } else if (this.f10540b.f10555j && !this.f10541c.c()) {
            a(0, 1);
        } else if (this.f10541c.c() && !this.f10540b.f10555j) {
            a(0, 16);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final void b(boolean z) {
        int i2;
        g gVar = this.f10541c;
        gVar.f10582a = z;
        if (gVar.f10582a) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        gVar.a(i2);
        this.f10543e = z;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final void c(boolean z) {
        int i2;
        c cVar = this.f10540b;
        if (cVar.f10555j != z) {
            cVar.f10555j = z;
            if (cVar.f10555j) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            cVar.a(i2);
        }
        this.f10544f = z;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final void d(boolean z) {
        c cVar = this.f10540b;
        if (z) {
            cVar.a(8);
            j.a(cVar.f10557l);
        } else if (cVar.f10555j) {
            cVar.a(0);
        }
        g gVar = this.f10541c;
        if (z) {
            gVar.a(8);
        } else if (gVar.c()) {
            gVar.a(0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final void a(int i2, int i3) {
        if ((i3 & 1) == 1) {
            this.f10540b.a(i2);
        }
        if ((i3 & 16) == 16) {
            this.f10541c.a(i2);
        }
    }

    public b(a.b bVar, m mVar) {
        l.d(bVar, "");
        l.d(mVar, "");
        this.f10540b = new c(bVar, mVar, this.f10542d);
        this.f10541c = new g(bVar, mVar, this.f10542d);
    }
}
