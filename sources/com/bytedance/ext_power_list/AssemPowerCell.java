package com.bytedance.ext_power_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.b.g;
import com.bytedance.assem.arch.b.j;
import com.bytedance.assem.arch.b.s;
import com.bytedance.assem.arch.b.x;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.b.a;
import com.bytedance.tiktok.proxy.c;
import com.bytedance.tiktok.proxy.d;
import h.f.b.l;
import h.w;
import h.z;
import java.util.List;

public abstract class AssemPowerCell<ASSEM extends x<? extends d>, T extends com.bytedance.ies.powerlist.b.a> extends PowerCell<T> implements g {

    /* renamed from: a  reason: collision with root package name */
    public ASSEM f28660a;

    /* renamed from: b  reason: collision with root package name */
    public View f28661b;

    /* renamed from: j  reason: collision with root package name */
    private final k f28662j;

    static {
        Covode.recordClassIndex(16863);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void a(T t) {
        l.c(t, "");
    }

    public abstract ASSEM e();

    public static final class a implements com.bytedance.tiktok.proxy.b<PowerCell<T>, T> {

        /* renamed from: a  reason: collision with root package name */
        private s f28663a;

        /* renamed from: b  reason: collision with root package name */
        private ASSEM f28664b;

        static {
            Covode.recordClassIndex(16864);
        }

        a() {
        }

        @Override // com.bytedance.tiktok.proxy.b
        public final void a() {
            s e2 = e();
            if (e2 != null) {
                e2.j();
            }
            this.f28664b = null;
        }

        @Override // com.bytedance.tiktok.proxy.b
        public final void b() {
            s e2 = e();
            if (e2 != null) {
                s.a(i.b.CREATED, e2, false);
            }
        }

        @Override // com.bytedance.tiktok.proxy.b
        public final void c() {
            s e2 = e();
            if (e2 != null) {
                s.a(i.b.CREATED, e2, false);
            }
        }

        @Override // com.bytedance.tiktok.proxy.b
        public final void d() {
            s e2 = e();
            if (e2 != null) {
                s.a(i.b.DESTROYED, e2, false);
            }
        }

        private final s e() {
            j jVar;
            ASSEM assem = this.f28664b;
            s sVar = null;
            if (assem != null) {
                jVar = assem.n;
            } else {
                jVar = null;
            }
            if (jVar instanceof s) {
                sVar = jVar;
            }
            return sVar;
        }

        @Override // com.bytedance.tiktok.proxy.b
        public final void a(boolean z) {
            s e2 = e();
            if (e2 != null) {
                s.a(i.b.RESUMED, e2, z);
            }
        }

        @Override // com.bytedance.tiktok.proxy.b
        public final /* synthetic */ void a(int i2, Object obj) {
            l.c(obj, "");
            s e2 = e();
            if (e2 != null) {
                e2.a(i2, obj);
            }
        }

        @Override // com.bytedance.tiktok.proxy.b
        public final /* synthetic */ void a(int i2, c cVar, Object obj, List list, h.f.a.b bVar, h.f.a.a aVar) {
            l.c(cVar, "");
            l.c(obj, "");
            l.c(bVar, "");
            l.c(aVar, "");
            this.f28664b = (ASSEM) ((AssemPowerCell) cVar).d();
            if (this.f28663a == null) {
                this.f28663a = new s();
            }
            s sVar = this.f28663a;
            if (sVar != null) {
                ASSEM assem = this.f28664b;
                if (assem == null) {
                    l.a();
                }
                sVar.a(assem, obj, list, bVar, aVar);
            }
        }
    }

    @Override // com.bytedance.assem.arch.b.g
    public final m aF_() {
        return this.f34233c;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final com.bytedance.tiktok.proxy.b<PowerCell<T>, T> f() {
        return new a();
    }

    @Override // com.bytedance.assem.arch.b.g
    public final View aE_() {
        View view = this.f28661b;
        if (view == null) {
            l.a("containerView");
        }
        return view;
    }

    public final ASSEM d() {
        ASSEM assem = this.f28660a;
        if (assem == null) {
            l.a("assemAttach2Cell");
        }
        return assem;
    }

    public AssemPowerCell() {
        AssemPowerCell$dispatcher$1 assemPowerCell$dispatcher$1 = new AssemPowerCell$dispatcher$1(this);
        this.f28662j = assemPowerCell$dispatcher$1;
        getLifecycle().a(assemPowerCell$dispatcher$1);
    }

    @Override // com.bytedance.assem.arch.b.g
    public final e aD_() {
        Context context = aE_().getContext();
        if (context != null) {
            return (e) context;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.c(viewGroup, "");
        this.f28660a = e();
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        ASSEM assem = this.f28660a;
        if (assem == null) {
            l.a("assemAttach2Cell");
        }
        View a2 = com.a.a(from, assem.C(), viewGroup, false);
        l.a((Object) a2, "");
        l.c(a2, "");
        this.f28661b = a2;
        com.bytedance.assem.arch.extensions.d.a(this, new b(this));
        return aE_();
    }

    static final class b extends h.f.b.m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ AssemPowerCell this$0;

        static {
            Covode.recordClassIndex(16865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AssemPowerCell assemPowerCell) {
            super(1);
            this.this$0 = assemPowerCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.c(assembler2, "");
            this.this$0.d().d(this.this$0.aE_());
            this.this$0.d().a(this.this$0.aE_());
            this.this$0.d().f25472i = true;
            x d2 = this.this$0.d();
            AssemSupervisor a2 = assembler2.a(this.this$0);
            if (a2 != null) {
                d2.a(a2);
                this.this$0.d().a(this.this$0);
                return z.f158842a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
