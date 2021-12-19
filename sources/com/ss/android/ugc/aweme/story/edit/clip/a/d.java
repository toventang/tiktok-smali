package com.ss.android.ugc.aweme.story.edit.clip.a;

import com.bytedance.als.b;
import com.bytedance.als.j;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.story.edit.clip.a.g;
import com.ss.android.ugc.aweme.story.edit.clip.a.h;
import h.f.b.l;
import h.i;
import h.p;

public abstract class d<Api extends b, Clip extends g<?>, Cluster extends h<Clip>> extends j<Api> implements a<Cluster, Clip> {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f137545a = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(89983);
    }

    private final m<p<Clip, Boolean>> a() {
        return (m) this.f137545a.getValue();
    }

    public void a(Clip clip) {
        l.d(clip, "");
    }

    public void b(Clip clip) {
        l.d(clip, "");
    }

    static final class a extends h.f.b.m implements h.f.a.a<m<p<? extends Clip, ? extends Boolean>>> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(89984);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            return new m(this) {
                /* class com.ss.android.ugc.aweme.story.edit.clip.a.d.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f137546a;

                static {
                    Covode.recordClassIndex(89985);
                }

                {
                    this.f137546a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.edit.clip.a.d */
                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.ss.android.ugc.aweme.story.edit.clip.a.d */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.u, com.bytedance.als.m
                public final /* synthetic */ void onChanged(Object obj) {
                    p pVar = (p) obj;
                    if (((Boolean) pVar.getSecond()).booleanValue()) {
                        this.f137546a.this$0.a((g) pVar.getFirst());
                    } else {
                        this.f137546a.this$0.b((g) pVar.getFirst());
                    }
                }
            };
        }
    }

    @Override // com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        U();
    }

    /* access modifiers changed from: protected */
    public final void V() {
        cy_().c().removeObserver(a());
    }

    public final void U() {
        cy_().c().observe(this, a());
    }
}
