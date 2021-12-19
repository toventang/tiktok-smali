package com.ss.android.ugc.aweme.story.edit.clip.a;

import androidx.lifecycle.m;
import com.bytedance.als.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.story.edit.clip.a.g;
import com.ss.android.ugc.aweme.story.edit.clip.a.h;
import h.f.b.l;
import h.i;
import h.p;

public abstract class f<T extends JediViewModel<? extends UiState> & m & b, Clip extends g<?>, ClipCluster extends h<Clip>> extends com.bytedance.ui_component.b<T> implements a<ClipCluster, Clip> {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f137548a = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(89987);
    }

    public void a(Clip clip) {
        l.d(clip, "");
    }

    public void b(Clip clip) {
        l.d(clip, "");
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.bytedance.als.m<p<? extends Clip, ? extends Boolean>>> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            return new com.bytedance.als.m(this) {
                /* class com.ss.android.ugc.aweme.story.edit.clip.a.f.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f137549a;

                static {
                    Covode.recordClassIndex(89989);
                }

                {
                    this.f137549a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.edit.clip.a.f */
                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.ss.android.ugc.aweme.story.edit.clip.a.f */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.u, com.bytedance.als.m
                public final /* synthetic */ void onChanged(Object obj) {
                    p pVar = (p) obj;
                    if (((Boolean) pVar.getSecond()).booleanValue()) {
                        this.f137549a.this$0.a((g) pVar.getFirst());
                    } else {
                        this.f137549a.this$0.b((g) pVar.getFirst());
                    }
                }
            };
        }
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        cy_().c().observe(this, (com.bytedance.als.m) this.f137548a.getValue());
    }
}
