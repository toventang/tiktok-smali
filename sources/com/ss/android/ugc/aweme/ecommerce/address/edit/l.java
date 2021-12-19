package com.ss.android.ugc.aweme.ecommerce.address.edit;

import android.view.ViewGroup;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.DescItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.SwitchInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder;

public final class l extends com.ss.android.ugc.aweme.base.arch.c<Object> {

    /* renamed from: d  reason: collision with root package name */
    public final m f84465d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.fragment.app.i f84466e;

    static {
        Covode.recordClassIndex(52696);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h, com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return ((com.ss.android.ugc.aweme.base.arch.d) this).f67986a.b(i2);
    }

    static final class b extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f84467a = new b();

        static {
            Covode.recordClassIndex(52698);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new DescItemViewHolder(viewGroup2);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f84468a = new c();

        static {
            Covode.recordClassIndex(52699);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new TextInputItemViewHolder(viewGroup2);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f84469a = new e();

        static {
            Covode.recordClassIndex(52701);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new PhoneInputItemViewHolder(viewGroup2);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f84470a = new i();

        static {
            Covode.recordClassIndex(52705);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new SwitchInputItemViewHolder(viewGroup2);
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(52697);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            int intValue = num.intValue();
            boolean z = false;
            if (this.this$0.a(intValue, 0) || this.this$0.a(intValue, 5)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(52700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue(), 1));
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(52702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue(), 2));
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(52703);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new RegionInputItemViewHolder(viewGroup2, this.this$0.f84466e);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(52704);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue(), 3));
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(52706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue(), 4));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h
    public final void a(com.bytedance.jedi.ext.adapter.b.g<JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> gVar) {
        h.f.b.l.d(gVar, "");
        com.bytedance.jedi.ext.adapter.b.g unused = gVar.a(new a(this), null, c.f84468a);
        com.bytedance.jedi.ext.adapter.b.g unused2 = gVar.a(new d(this), null, e.f84469a);
        com.bytedance.jedi.ext.adapter.b.g unused3 = gVar.a(new f(this), null, new g(this));
        com.bytedance.jedi.ext.adapter.b.g unused4 = gVar.a(new h(this), null, i.f84470a);
        com.bytedance.jedi.ext.adapter.b.g unused5 = gVar.a(new j(this), null, b.f84467a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(m mVar, androidx.fragment.app.i iVar) {
        super(mVar, new k(), 4);
        h.f.b.l.d(mVar, "");
        this.f84465d = mVar;
        this.f84466e = iVar;
    }

    public final boolean a(int i2, int i3) {
        InputItemDTO inputItemDTO;
        Integer num;
        Object a2 = a(i2);
        if (!(a2 instanceof com.ss.android.ugc.aweme.ecommerce.address.a.a)) {
            a2 = null;
        }
        com.ss.android.ugc.aweme.ecommerce.address.a.a aVar = (com.ss.android.ugc.aweme.ecommerce.address.a.a) a2;
        if (aVar == null || (inputItemDTO = aVar.f84261a) == null || (num = inputItemDTO.f84314h) == null || num.intValue() != i3) {
            return false;
        }
        return true;
    }
}
