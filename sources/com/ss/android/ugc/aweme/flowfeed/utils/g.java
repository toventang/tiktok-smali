package com.ss.android.ugc.aweme.flowfeed.utils;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f96184a;

    /* renamed from: b  reason: collision with root package name */
    protected Set<i> f96185b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    protected int f96186c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f96187d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f96188e;

    /* renamed from: f  reason: collision with root package name */
    public final f f96189f;

    /* renamed from: g  reason: collision with root package name */
    public e f96190g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f96191h;

    /* renamed from: i  reason: collision with root package name */
    private final a f96192i;

    public interface a {
        static {
            Covode.recordClassIndex(60938);
        }

        boolean e();
    }

    static {
        Covode.recordClassIndex(60936);
    }

    public final void g() {
        this.f96185b.clear();
    }

    private i j() {
        return this.f96190g.a(this.f96185b);
    }

    public final void h() {
        k();
        c();
        f();
    }

    public final void i() {
        k();
        c();
        e();
    }

    private void k() {
        if (!b.a((Collection) this.f96185b)) {
            for (i iVar : this.f96185b) {
                iVar.f96195e = 0;
            }
        }
    }

    public final void a() {
        int i2;
        RecyclerView.i layoutManager = this.f96184a.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || ((LinearLayoutManager) layoutManager).f3778j != 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.f96190g.a(i2);
    }

    public final void d() {
        if (!b.a((Collection) this.f96185b)) {
            Iterator<i> it = this.f96185b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void b() {
        if (!b.a((Collection) this.f96185b)) {
            for (i iVar : this.f96185b) {
                if (this.f96190g.b(iVar.c())) {
                    if (!iVar.f96198h) {
                        iVar.f96198h = true;
                    }
                } else if (iVar.f96198h) {
                    iVar.f96198h = false;
                }
            }
        }
    }

    public final void c() {
        if (!b.a((Collection) this.f96185b)) {
            for (i iVar : this.f96185b) {
                if (this.f96190g.a(iVar.c()) && !iVar.f96197g) {
                    com.a.a("start showing: %s", new Object[]{iVar.d()});
                    iVar.f96197g = true;
                }
            }
        }
    }

    public final void f() {
        i j2;
        if (!this.f96191h && this.f96186c != 2 && !b.a((Collection) this.f96185b)) {
            a aVar = this.f96192i;
            if ((aVar == null || aVar.e()) && (j2 = j()) != null) {
                com.a.a("PlayTargetChanged roll into playarea: %s", new Object[]{j2.d()});
                j2.b(this.f96186c);
            }
        }
    }

    public final void e() {
        i j2;
        if (!this.f96191h && this.f96186c != 2 && !b.a((Collection) this.f96185b)) {
            a aVar = this.f96192i;
            if (aVar != null && !aVar.e()) {
                return;
            }
            if ((this.f96186c != 1 || this.f96189f == null) && (j2 = j()) != null) {
                com.a.a("PlayTargetChanged roll into playarea: %s", new Object[]{j2.d()});
                j2.a(this.f96186c);
            }
        }
    }

    public final void a(i iVar) {
        if (iVar != null) {
            iVar.d();
            iVar.f();
            if (iVar.a() < 0) {
                new RuntimeException("Negative displayPosition");
            }
            if (this.f96185b.add(iVar)) {
                iVar.d();
            }
        }
    }

    public final void b(i iVar) {
        if (iVar != null) {
            iVar.d();
            iVar.f();
            if (iVar.a() < 0) {
                new RuntimeException("Negative displayPosition");
            }
            if (this.f96185b.remove(iVar)) {
                iVar.d();
            }
        }
    }

    public g(RecyclerView recyclerView, f fVar, a aVar) {
        this.f96189f = fVar;
        this.f96192i = aVar;
        this.f96184a = recyclerView;
        recyclerView.a(new RecyclerView.n() {
            /* class com.ss.android.ugc.aweme.flowfeed.utils.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(60937);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                super.a(recyclerView, i2);
                g.this.a();
                g.this.f96186c = i2;
                if (i2 == 0) {
                    if (g.this.f96187d || (g.this.f96188e && g.this.f96189f != null)) {
                        g.this.f();
                    }
                    g.this.f96187d = false;
                    g.this.f96188e = false;
                } else if (i2 == 2) {
                    g.this.f96187d = true;
                } else if (i2 == 1) {
                    g.this.f96188e = true;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2, int i3) {
                super.a(recyclerView, i2, i3);
                g.this.a();
                if (g.this.f96189f != null) {
                    g.this.f96190g.a();
                }
                if (g.this.f96186c == 1 && g.this.f96189f == null) {
                    g.this.f();
                }
                if (g.this.f96186c == 0 && i3 == 0) {
                    if (recyclerView.getItemAnimator() != null) {
                        recyclerView.getItemAnimator().a(new h(this));
                    } else {
                        g.this.f();
                    }
                }
                g.this.c();
                g.this.b();
                g.this.d();
            }
        });
    }
}
