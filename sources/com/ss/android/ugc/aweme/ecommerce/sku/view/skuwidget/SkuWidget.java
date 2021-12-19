package com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.ah;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class SkuWidget extends SkuPanelBaseWidget implements au {

    /* renamed from: h  reason: collision with root package name */
    public LinearLayout f87467h;

    /* renamed from: i  reason: collision with root package name */
    public d f87468i;

    /* renamed from: j  reason: collision with root package name */
    private final int f87469j = R.layout.r0;

    static {
        Covode.recordClassIndex(54967);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.widget.Widget
    public final int b() {
        return this.f87469j;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    public final void m() {
        super.m();
        d dVar = this.f87468i;
        if (dVar == null) {
            l.a("specListLayout");
        }
        dVar.setCheckedChangeListener(new a(this));
        f.a.b.b unused = selectSubscribe(l(), a.f87471a, new ah(), new b(this));
        f.a.b.b unused2 = selectSubscribe(l(), b.f87472a, new ah(), new c(this));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    public final void n() {
        MethodCollector.i(6378);
        super.n();
        this.f87467h = (LinearLayout) a(R.id.e5r);
        Context context = a().getContext();
        l.b(context, "");
        this.f87468i = new d(context);
        LinearLayout linearLayout = this.f87467h;
        if (linearLayout == null) {
            l.a("skuWidgetContainer");
        }
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f87467h;
        if (linearLayout2 == null) {
            l.a("skuWidgetContainer");
        }
        d dVar = this.f87468i;
        if (dVar == null) {
            l.a("specListLayout");
        }
        linearLayout2.addView(dVar);
        MethodCollector.o(6378);
    }

    public static final class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkuWidget f87470a;

        static {
            Covode.recordClassIndex(54968);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(SkuWidget skuWidget) {
            this.f87470a = skuWidget;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.d.a
        public final void a(String[] strArr) {
            l.d(strArr, "");
            this.f87470a.l().a(strArr);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ SkuWidget this$0;

        static {
            Covode.recordClassIndex(54969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SkuWidget skuWidget) {
            super(2);
            this.this$0 = skuWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            int i2;
            Boolean bool2 = bool;
            l.d(iVar, "");
            LinearLayout linearLayout = this.this$0.f87467h;
            if (linearLayout == null) {
                l.a("skuWidgetContainer");
            }
            if (bool2 == null || !bool2.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            linearLayout.setVisibility(i2);
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.a, z> {
        final /* synthetic */ SkuWidget this$0;

        static {
            Covode.recordClassIndex(54970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SkuWidget skuWidget) {
            super(2);
            this.this$0 = skuWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x006a */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.d] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [T] */
        /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00c7 A[Catch:{ Exception -> 0x0171 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0161 A[Catch:{ Exception -> 0x0171 }] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i r18, com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.a r19) {
            /*
            // Method dump skipped, instructions count: 384
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.SkuWidget.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
