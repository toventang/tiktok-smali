package com.bytedance.android.livesdk.chatroom.d;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.u;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.bf;
import com.bytedance.android.livesdk.chatroom.widget.o;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtRoomSlideUpGuideSetting;
import com.bytedance.android.livesdkapi.g.f;
import com.bytedance.android.livesdkapi.g.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.b.b;

public final class d implements u<Boolean>, f.a {

    /* renamed from: j  reason: collision with root package name */
    private static volatile d f15202j;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15203a;

    /* renamed from: b  reason: collision with root package name */
    public h f15204b;

    /* renamed from: c  reason: collision with root package name */
    boolean f15205c;

    /* renamed from: d  reason: collision with root package name */
    public b f15206d;

    /* renamed from: e  reason: collision with root package name */
    public ViewGroup f15207e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15208f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15209g;

    /* renamed from: h  reason: collision with root package name */
    public String f15210h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15211i;

    static {
        Covode.recordClassIndex(8421);
    }

    private d() {
    }

    @Override // com.bytedance.android.livesdkapi.g.f.a
    public final void c() {
        if (this.f15203a) {
            d();
        }
    }

    private String f() {
        return "live.mt.slide_up_guide.need_show." + this.f15210h;
    }

    public static d a() {
        MethodCollector.i(264);
        if (f15202j == null) {
            synchronized (d.class) {
                try {
                    if (f15202j == null) {
                        f15202j = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(264);
                    throw th;
                }
            }
        }
        d dVar = f15202j;
        MethodCollector.o(264);
        return dVar;
    }

    public final void b() {
        if (this.f15203a) {
            this.f15203a = false;
            this.f15207e = null;
            bf.a().e();
            bf.a().f14206b.removeObserver(this);
            this.f15205c = false;
            this.f15211i = false;
            this.f15208f = false;
            this.f15209g = false;
            h hVar = this.f15204b;
            if (hVar != null) {
                hVar.b(this);
                this.f15204b = null;
            }
            b bVar = this.f15206d;
            if (bVar != null) {
                bVar.dispose();
                this.f15206d = null;
            }
        }
    }

    public final void e() {
        Context e2;
        com.bytedance.ies.f.b a2;
        if (this.f15203a && (e2 = y.e()) != null && (a2 = com.bytedance.ies.f.b.a(e2, com.bytedance.ies.f.b.f33816b)) != null) {
            a2.b(f(), false);
        }
    }

    public final void d() {
        com.bytedance.ies.f.b a2;
        h hVar;
        Context e2 = y.e();
        if (e2 != null && (a2 = com.bytedance.ies.f.b.a(e2, com.bytedance.ies.f.b.f33816b)) != null) {
            long a3 = a2.a("live.mt.slide_up_guide.last_show", -1L);
            long currentTimeMillis = System.currentTimeMillis();
            if (a3 <= 0 || currentTimeMillis - a3 > 86400000) {
                long a4 = a2.a("live.mt.slide_up_guide.total_show", 0L);
                if (a4 < ((long) LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().getMaxShowTimes()) && a2.a(f(), true) && !this.f15211i && !bf.a().d() && this.f15205c && (hVar = this.f15204b) != null && hVar.a() >= 2) {
                    o.a(this.f15207e);
                    this.f15208f = true;
                    e();
                    a2.b("live.mt.slide_up_guide.last_show", Long.valueOf(currentTimeMillis));
                    a2.b("live.mt.slide_up_guide.total_show", Long.valueOf(a4 + 1));
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(Boolean bool) {
        Boolean bool2 = bool;
        if (this.f15203a && bool2 != null && bool2.booleanValue()) {
            d();
        }
    }
}
