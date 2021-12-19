package com.bytedance.jedi.ext.adapter.extension;

import android.view.ViewGroup;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.a.a.e;
import com.bytedance.jedi.ext.adapter.f;
import h.f.a.q;
import h.f.a.r;
import h.f.b.l;
import h.z;

public final class b<T, RECEIVER extends g> extends a<T, b<T, RECEIVER>, JediViewHolder<? extends g, T>> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f39701f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public final m f39702e;

    static {
        Covode.recordClassIndex(24460);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(24461);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static <T, RECEIVER extends g> b<T, RECEIVER> a(h<? extends RECEIVER> hVar, j.e<T> eVar) {
            l.c(hVar, "");
            l.c(eVar, "");
            return new b<>((m) hVar, l.c(eVar, ""), (byte) 0);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ViewGroup, JediAdapterBuilder$viewHolder$factory$1$1> {
        final /* synthetic */ int $layout;
        final /* synthetic */ q $onBind;

        static {
            Covode.recordClassIndex(24464);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediAdapterBuilder$viewHolder$factory$1$1 invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.c(viewGroup2, "");
            return new JediAdapterBuilder$viewHolder$factory$1$1(this, viewGroup2, e.a(viewGroup2, this.$layout));
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<ViewGroup, JediAdapterBuilder$viewHolder$factory$2$1> {
        final /* synthetic */ int $layout;
        final /* synthetic */ r $onBind;

        static {
            Covode.recordClassIndex(24465);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediAdapterBuilder$viewHolder$factory$2$1 invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.c(viewGroup2, "");
            return new JediAdapterBuilder$viewHolder$factory$2$1(this, viewGroup2, e.a(viewGroup2, this.$layout));
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.b$b  reason: collision with other inner class name */
    public static final class C0972b extends f<T> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f39703d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.bytedance.jedi.arch.ext.list.a.e f39704e;

        static {
            Covode.recordClassIndex(24462);
        }

        /* renamed from: com.bytedance.jedi.ext.adapter.extension.b$b$a */
        static final class a extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
            final /* synthetic */ h.f.a.m $matcher;
            final /* synthetic */ com.bytedance.jedi.ext.adapter.b.g $registry$inlined;
            final /* synthetic */ C0972b this$0;

            static {
                Covode.recordClassIndex(24463);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h.f.a.m mVar, C0972b bVar, com.bytedance.jedi.ext.adapter.b.g gVar) {
                super(1);
                this.$matcher = mVar;
                this.this$0 = bVar;
                this.$registry$inlined = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(Integer num) {
                int intValue = num.intValue();
                return Boolean.valueOf(((Boolean) this.$matcher.invoke(Integer.valueOf(intValue), this.this$0.a(intValue, false))).booleanValue());
            }
        }

        @Override // com.bytedance.jedi.ext.adapter.b.d
        public final void a(com.bytedance.jedi.ext.adapter.b.g<JediViewHolder<? extends g, T>> gVar) {
            l.c(gVar, "");
            for (T t : this.f39703d.f39699c) {
                h.f.a.m<? super Integer, ? super RecyclerView, z> mVar = (h.f.a.m) t.component3();
                gVar.a(new a((h.f.a.m) t.component2(), this, gVar), mVar, (h.f.a.b) t.component1());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0972b(b bVar, com.bytedance.jedi.arch.ext.list.a.e eVar, m mVar, com.bytedance.jedi.arch.ext.list.a.e eVar2, com.bytedance.jedi.arch.ext.list.a.c cVar) {
            super(mVar, eVar2, cVar);
            this.f39703d = bVar;
            this.f39704e = eVar;
        }
    }

    private b(m mVar, com.bytedance.jedi.arch.ext.list.a.c<T> cVar) {
        super(cVar, (byte) 0);
        this.f39702e = mVar;
    }

    public /* synthetic */ b(m mVar, com.bytedance.jedi.arch.ext.list.a.c cVar, byte b2) {
        this(mVar, cVar);
    }
}
