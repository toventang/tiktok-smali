package com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.h.v;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.utils.bp;
import h.f.b.l;
import h.h;
import h.k.c;
import java.util.Objects;

public final class SwitchInputItemViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.address.a.a> implements au {

    /* renamed from: f  reason: collision with root package name */
    final h f84496f;

    static {
        Covode.recordClassIndex(52726);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<AddressEditViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ c $viewModelClass;
        final /* synthetic */ c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(52727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, c cVar, c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.SwitchInputItemViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_address_edit_viewholder_SwitchInputItemViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f84497a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommonItemView f84498b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SwitchInputItemViewHolder f84499c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.a.a f84500d;

        static {
            Covode.recordClassIndex(52728);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            if (view != null) {
                CommonItemView commonItemView = this.f84498b;
                commonItemView.setChecked(!commonItemView.d());
                com.ss.android.ugc.aweme.ecommerce.address.a.a aVar = this.f84500d;
                if (this.f84498b.d()) {
                    str = "1";
                } else {
                    str = "0";
                }
                aVar.f84262b = str;
                ((AddressEditViewModel) this.f84499c.f84496f.getValue()).f84358e = true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(CommonItemView commonItemView, SwitchInputItemViewHolder switchInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
            super(700);
            this.f84498b = commonItemView;
            this.f84499c = switchInputItemViewHolder;
            this.f84500d = aVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchInputItemViewHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558949(0x7f0d0225, float:1.8743228E38)
            r0 = 0
            android.view.View r0 = com.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.class
            h.k.c r1 = h.f.b.ab.a(r0)
            com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.SwitchInputItemViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.SwitchInputItemViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = h.i.a(r0)
            r4.f84496f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.SwitchInputItemViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
        com.ss.android.ugc.aweme.ecommerce.address.a.a aVar2 = aVar;
        l.d(aVar2, "");
        View view = this.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
        CommonItemView commonItemView = (CommonItemView) view;
        commonItemView.setLeftText(aVar2.f84261a.f84313g);
        v.a(commonItemView, (Drawable) null);
        Object obj = aVar2.f84262b;
        if ((obj instanceof String) && obj != null) {
            commonItemView.setChecked(l.a(obj, (Object) "1"));
        }
        commonItemView.setOnClickListener(new b(commonItemView, this, aVar2));
    }
}
