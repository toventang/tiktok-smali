package com.ss.android.ugc.aweme.social.widget.card.rec;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.f;
import com.bytedance.tux.status.TuxStatusView;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import java.util.Objects;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.cu;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.n;
import kotlinx.coroutines.z;

public final class a extends RecyclerView.ViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static final C3471a f133827c = new C3471a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final am f133828a;

    /* renamed from: b  reason: collision with root package name */
    public final i f133829b;

    /* renamed from: d  reason: collision with root package name */
    private final z f133830d;

    static {
        Covode.recordClassIndex(87549);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.a$a  reason: collision with other inner class name */
    public static final class C3471a {
        static {
            Covode.recordClassIndex(87550);
        }

        private C3471a() {
        }

        public /* synthetic */ C3471a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final TuxStatusView a() {
        View view = this.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        return (TuxStatusView) view;
    }

    public final void b() {
        TuxStatusView a2 = a();
        ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
        layoutParams.height = 0;
        a2.setLayoutParams(layoutParams);
        a2.setVisibility(8);
    }

    static final class b extends k implements m<am, d<? super h.z>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87551);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final d<h.z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super h.z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                try {
                    this.L$0 = this;
                    this.label = 1;
                    n nVar = new n(h.c.a.b.a(this), 1);
                    this.this$0.f133829b.b().b(nVar, h.c.b.a.b.a(-1));
                    obj = nVar.e();
                    if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                        l.d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception unused) {
                    this.this$0.b();
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar = (f) obj;
            if (fVar instanceof f.b) {
                this.this$0.b();
            } else if (fVar instanceof f.c) {
                this.this$0.b();
            }
            return h.z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(i iVar, View view) {
        super(view);
        l.d(iVar, "");
        l.d(view, "");
        this.f133829b = iVar;
        z a2 = cu.a();
        this.f133830d = a2;
        this.f133828a = an.a(o.f159148a.plus(a2));
    }
}
