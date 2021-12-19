package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.q;
import com.bytedance.assem.arch.extensions.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.a.b;
import com.ss.android.ugc.aweme.homepage.story.icon.X2CIconStory;
import com.ss.android.ugc.aweme.homepage.story.icon.j;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.story.g;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.k.c;
import h.z;

public final class k extends c {

    /* renamed from: a  reason: collision with root package name */
    public final b f44257a;

    static {
        Covode.recordClassIndex(27119);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final void a(View view) {
        l.d(view, "");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final int c() {
        return 8388627;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final boolean d() {
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final boolean a() {
        return g.f137757a.i();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final View b() {
        View view;
        MethodCollector.i(6882);
        if (!g.f137757a.i()) {
            MethodCollector.o(6882);
            return null;
        }
        e activity = this.f44257a.getActivity();
        if (activity == null) {
            MethodCollector.o(6882);
            return null;
        }
        l.b(activity, "");
        try {
            view = ((X2CIconStory) f.a(new X2CIconStory())).a(activity, R.layout.a3s);
        } catch (Throwable unused) {
            view = com.a.a(LayoutInflater.from(activity), R.layout.a3s, new FrameLayout(activity), false);
        }
        b bVar = this.f44257a;
        d.a(bVar, new a(bVar, view));
        MethodCollector.o(6882);
        return view;
    }

    public k(b bVar) {
        l.d(bVar, "");
        this.f44257a = bVar;
    }

    static final class a extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ View $iconView$inlined;
        final /* synthetic */ b $this_apply;

        static {
            Covode.recordClassIndex(27120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, View view) {
            super(1);
            this.$this_apply = bVar;
            this.$iconView$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.b(this.$this_apply, new h.f.a.b<q, z>(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.k.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(27121);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    c<? extends com.bytedance.assem.arch.d.a> a2;
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$iconView$inlined;
                    if (com.ss.android.ugc.aweme.story.c.g.a()) {
                        a2 = ab.a(j.class);
                    } else {
                        a2 = ab.a(com.ss.android.ugc.aweme.homepage.story.icon.b.class);
                    }
                    qVar2.a(a2);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }
}
