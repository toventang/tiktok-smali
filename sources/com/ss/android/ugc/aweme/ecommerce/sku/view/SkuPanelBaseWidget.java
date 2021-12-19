package com.ss.android.ugc.aweme.ecommerce.sku.view;

import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel;
import h.f.b.ab;
import h.f.b.l;
import h.h;
import h.k.c;

public class SkuPanelBaseWidget extends JediBaseWidget implements au {

    /* renamed from: h  reason: collision with root package name */
    private final h f87419h;

    static {
        Covode.recordClassIndex(54913);
    }

    public final SkuPanelViewModel l() {
        return (SkuPanelViewModel) this.f87419h.getValue();
    }

    public void m() {
    }

    public void n() {
    }

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.base.arch.JediBaseWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.widget.Widget
    public final void c() {
        super.c();
        n();
        m();
    }

    public SkuPanelBaseWidget() {
        c a2 = ab.a(SkuPanelViewModel.class);
        this.f87419h = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    public static final class a extends h.f.b.m implements h.f.a.a<SkuPanelViewModel> {
        final /* synthetic */ Widget $this_hostViewModel;
        final /* synthetic */ c $viewModelClass;
        final /* synthetic */ c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Widget widget, c cVar, c cVar2) {
            super(0);
            this.$this_hostViewModel = widget;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_sku_view_SkuPanelBaseWidget$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    /* access modifiers changed from: protected */
    public final <T extends View> T a(int i2) {
        View view = this.f46127e;
        if (view == null) {
            l.b();
        }
        T t = (T) view.findViewById(i2);
        if (t == null) {
            l.b();
        }
        return t;
    }
}
