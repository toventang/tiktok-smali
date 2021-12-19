package com.ss.android.ugc.aweme.ecommerce.sku.viewmodel;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuSaleProp;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public final class SkuPanelViewModel extends JediViewModel<SkuState> implements IEventCenter.b {
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<Image> f87500a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f87501b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public SkuPanelState f87502c;

    /* renamed from: d  reason: collision with root package name */
    public SkuInfo f87503d;

    /* renamed from: e  reason: collision with root package name */
    public SkuPanelStarter.SkuEnterParams f87504e;

    /* renamed from: f  reason: collision with root package name */
    public ProductPackStruct f87505f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ecommerce.sku.d f87506g;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f87507k;

    /* renamed from: l  reason: collision with root package name */
    public String f87508l;

    /* renamed from: m  reason: collision with root package name */
    public f.a.b.b f87509m;
    private Image o;
    private ProductPrice p;
    private AddToCartButton q;

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f87513a = new e();

        static {
            Covode.recordClassIndex(54990);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(54984);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54985);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(boolean z) {
        c(new q(z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01fb, code lost:
        if (r7 != null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0106, code lost:
        if (r5.isEmpty() == false) goto L_0x0109;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String[] r14) {
        /*
        // Method dump skipped, instructions count: 612
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel.a(java.lang.String[]):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
    public final void a(String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        int hashCode = str.hashCode();
        if (hashCode != -49893737) {
            if (hashCode == 1117656670 && str.equals("ec_send_sku_params")) {
                SkuPanelStarter.SkuRenderParams skuRenderParams = (SkuPanelStarter.SkuRenderParams) com.ss.android.ugc.aweme.account.util.i.a(str2, SkuPanelStarter.SkuRenderParams.class);
                String str3 = null;
                this.f87505f = skuRenderParams != null ? skuRenderParams.getProductInfoPack() : null;
                if (skuRenderParams != null) {
                    String productId = skuRenderParams.getProductId();
                    SkuPanelStarter.SkuEnterParams skuEnterParams = this.f87504e;
                    if (skuEnterParams != null) {
                        str3 = skuEnterParams.getProductId();
                    }
                    if (h.f.b.l.a((Object) productId, (Object) str3)) {
                        a(new SkuInfo(skuRenderParams.getSkuList(), skuRenderParams.getSalePropList()), skuRenderParams.getPrice(), skuRenderParams.getMainPicture(), new SkuPanelState(skuRenderParams.getProductId(), null, null, null, skuRenderParams.getCheckedSkuIds(), skuRenderParams.getProductQuantity(), false, 0, null, null, null, 1984, null), skuRenderParams.getSellerId(), skuRenderParams.getAddToCartButton());
                        a(a.SUCCESS);
                    }
                }
            }
        } else if (str.equals("ec_sku_panel_keyboard_show")) {
            a(((SkuPanelStarter.SkuKeyboardVisibilityParams) com.ss.android.ugc.aweme.account.util.i.a(str2, SkuPanelStarter.SkuKeyboardVisibilityParams.class)).getKeyboardVisibility());
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        EventCenter.a().a("ec_send_sku_params", this);
        EventCenter.a().a("ec_sku_panel_keyboard_show", this);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ SkuState d() {
        return new SkuState(null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, null, false, 65535, null);
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        b();
        EventCenter.a().b("ec_send_sku_params", this);
        EventCenter.a().b("ec_sku_panel_keyboard_show", this);
    }

    public final void b() {
        f.a.b.b bVar = this.f87509m;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f87509m = null;
    }

    public final String a() {
        SkuPanelState skuPanelState = this.f87502c;
        String[] checkedSkuIds = skuPanelState != null ? skuPanelState.getCheckedSkuIds() : null;
        SkuInfo skuInfo = this.f87503d;
        if (skuInfo != null) {
            List<SaleProp> list = skuInfo.f87416b;
            if (list != null && !list.isEmpty()) {
                if (checkedSkuIds == null) {
                    return list.get(0).f87409b;
                }
                int length = checkedSkuIds.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (h.f.b.l.a((Object) checkedSkuIds[i2], (Object) "")) {
                        return list.get(i2).f87409b;
                    }
                }
            }
        }
        return null;
    }

    private void a(Image image) {
        c(new k(image));
    }

    private void b(int i2) {
        c(new l(i2));
    }

    private void c(int i2) {
        b_(new m(this, i2));
    }

    private void d(String str) {
        c(new p(str));
    }

    private void e(String str) {
        c(new t(str));
    }

    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewModel f87516a;

        static {
            Covode.recordClassIndex(54993);
        }

        public h(SkuPanelViewModel skuPanelViewModel) {
            this.f87516a = skuPanelViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ProductPackStruct productPackStruct = (ProductPackStruct) obj;
            SkuPanelViewModel skuPanelViewModel = this.f87516a;
            h.f.b.l.b(productPackStruct, "");
            skuPanelViewModel.a(productPackStruct);
            this.f87516a.b();
            this.f87516a.b(false);
        }
    }

    private final void a(PromotionView promotionView) {
        c(new u(promotionView));
    }

    private void b(String str) {
        c(new r(str));
    }

    private void c(String str) {
        h.f.b.l.d(str, "");
        c(new x(str));
    }

    public static final class f extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f87514a = new f();

        static {
            Covode.recordClassIndex(54991);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, 0, null, true, null, null, false, 61439, null);
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f87515a = new g();

        static {
            Covode.recordClassIndex(54992);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, 0, null, true, null, null, false, 61439, null);
        }
    }

    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewModel f87517a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f87518b;

        static {
            Covode.recordClassIndex(54994);
        }

        public i(SkuPanelViewModel skuPanelViewModel, Fragment fragment) {
            this.f87517a = skuPanelViewModel;
            this.f87518b = fragment;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Resources resources;
            com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(this.f87518b);
            Context context = this.f87518b.getContext();
            if (context == null || (resources = context.getResources()) == null) {
                str = null;
            } else {
                str = resources.getString(R.string.fy7);
            }
            bVar.a(str).b();
            this.f87517a.b();
            this.f87517a.b(false);
            this.f87517a.a(a.FAIL);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ AddToCartButton $addToCartButton;

        static {
            Covode.recordClassIndex(54995);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(AddToCartButton addToCartButton) {
            super(1);
            this.$addToCartButton = addToCartButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, this.$addToCartButton, false, 49151, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ Image $newImage;

        static {
            Covode.recordClassIndex(54996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(Image image) {
            super(1);
            this.$newImage = image;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, this.$newImage, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, null, false, 65534, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ int $currentPos;

        static {
            Covode.recordClassIndex(54997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(int i2) {
            super(1);
            this.$currentPos = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, this.$currentPos, null, false, null, null, false, 64511, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<SkuState, z> {
        final /* synthetic */ int $maxQuantity;
        final /* synthetic */ SkuPanelViewModel this$0;

        static {
            Covode.recordClassIndex(54998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(SkuPanelViewModel skuPanelViewModel, int i2) {
            super(1);
            this.this$0 = skuPanelViewModel;
            this.$maxQuantity = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            if (skuState2.getCurrentQuantity() > this.$maxQuantity) {
                this.this$0.c(new h.f.a.b<SkuState, SkuState>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel.m.AnonymousClass1 */
                    final /* synthetic */ m this$0;

                    static {
                        Covode.recordClassIndex(54999);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ SkuState invoke(SkuState skuState) {
                        SkuState skuState2 = skuState;
                        h.f.b.l.d(skuState2, "");
                        return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, this.this$0.$maxQuantity, this.this$0.$maxQuantity, 0, null, false, null, null, false, 64767, null);
                    }
                });
            } else {
                this.this$0.c(new h.f.a.b<SkuState, SkuState>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel.m.AnonymousClass2 */
                    final /* synthetic */ m this$0;

                    static {
                        Covode.recordClassIndex(55000);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ SkuState invoke(SkuState skuState) {
                        SkuState skuState2 = skuState;
                        h.f.b.l.d(skuState2, "");
                        return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, this.this$0.$maxQuantity, 0, 0, null, false, null, null, false, 65279, null);
                    }
                });
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ String $newPrice;

        static {
            Covode.recordClassIndex(55001);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(String str) {
            super(1);
            this.$newPrice = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            String str = "";
            h.f.b.l.d(skuState2, str);
            String str2 = this.$newPrice;
            if (str2 != null) {
                str = str2;
            }
            return SkuState.copy$default(skuState2, null, null, str, null, null, null, null, null, 0, 0, 0, null, false, null, null, false, 65531, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ int $quantity;

        static {
            Covode.recordClassIndex(55002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(int i2) {
            super(1);
            this.$quantity = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, this.$quantity, 0, null, false, null, null, false, 65023, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ String $text;

        static {
            Covode.recordClassIndex(55003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(1);
            this.$text = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, this.$text, null, 0, 0, 0, null, false, null, null, false, 65471, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ boolean $show;

        static {
            Covode.recordClassIndex(55004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(boolean z) {
            super(1);
            this.$show = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, 0, Boolean.valueOf(this.$show), false, null, null, false, 63487, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ String $lowStockWarning;

        static {
            Covode.recordClassIndex(55005);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(String str) {
            super(1);
            this.$lowStockWarning = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, this.$lowStockWarning, null, null, null, null, 0, 0, 0, null, false, null, null, false, 65527, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ Boolean $needIcon;

        static {
            Covode.recordClassIndex(55006);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(Boolean bool) {
            super(1);
            this.$needIcon = bool;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, this.$needIcon, null, null, null, null, null, null, 0, 0, 0, null, false, null, null, false, 65533, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ String $originalPrice;

        static {
            Covode.recordClassIndex(55007);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(String str) {
            super(1);
            this.$originalPrice = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, this.$originalPrice, null, null, 0, 0, 0, null, false, null, null, false, 65503, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ PromotionView $promotionView;

        static {
            Covode.recordClassIndex(55008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(PromotionView promotionView) {
            super(1);
            this.$promotionView = promotionView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, this.$promotionView, null, null, null, 0, 0, 0, null, false, null, null, false, 65519, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ boolean $showLoading;

        static {
            Covode.recordClassIndex(55009);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(boolean z) {
            super(1);
            this.$showLoading = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, null, this.$showLoading, 32767, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ a $state;

        static {
            Covode.recordClassIndex(55010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(a aVar) {
            super(1);
            this.$state = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, this.$state, null, false, 57343, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x extends h.f.b.m implements h.f.a.b<SkuState, SkuState> {
        final /* synthetic */ String $newSpecifications;

        static {
            Covode.recordClassIndex(55011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(String str) {
            super(1);
            this.$newSpecifications = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            h.f.b.l.d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, this.$newSpecifications, 0, 0, 0, null, false, null, null, false, 65407, null);
        }
    }

    private void a(Boolean bool) {
        c(new s(bool));
    }

    public static final class c extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c, Boolean> {
        final /* synthetic */ SkuPanelViewModel this$0;

        static {
            Covode.recordClassIndex(54987);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(SkuPanelViewModel skuPanelViewModel) {
            super(1);
            this.this$0 = skuPanelViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c cVar) {
            ExceptionUX exceptionUX;
            Integer exceptionUXType;
            com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            T t = cVar2.data;
            String str = null;
            if (!(t == null || (exceptionUX = t.f84683b) == null || (exceptionUXType = exceptionUX.getExceptionUXType()) == null || exceptionUXType.intValue() != 1)) {
                Integer valueOf = Integer.valueOf(cVar2.code);
                SkuPanelStarter.SkuEnterParams skuEnterParams = this.this$0.f87504e;
                if (skuEnterParams != null) {
                    str = skuEnterParams.getEnterFrom();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("page_name", "sku");
                linkedHashMap.put("popup_name", "go_to_cart");
                if (!com.ss.android.ugc.aweme.ecommerce.sku.a.a.f87365a.containsKey("previous_page") && str != null) {
                    linkedHashMap.put("previous_page", str);
                }
                linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                if (valueOf != null) {
                    linkedHashMap.put("error_code", Integer.valueOf(valueOf.intValue()));
                }
                com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_popup_show", linkedHashMap);
            }
            return false;
        }
    }

    private void a(String str) {
        c(new n(str));
    }

    public final void b(boolean z) {
        c(new v(z));
    }

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewModel f87510a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuItem f87511b;

        static {
            Covode.recordClassIndex(54988);
        }

        public d(SkuPanelViewModel skuPanelViewModel, SkuItem skuItem) {
            this.f87510a = skuPanelViewModel;
            this.f87511b = skuItem;
        }

        /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x00f8  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x010b  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0185  */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r26) {
            /*
            // Method dump skipped, instructions count: 444
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel.d.accept(java.lang.Object):void");
        }
    }

    public final void a(int i2) {
        c(new o(i2));
        SkuPanelState skuPanelState = this.f87502c;
        if (skuPanelState != null) {
            skuPanelState.setProductQuantity(Integer.valueOf(i2));
        }
    }

    public final void a(ProductPackStruct productPackStruct) {
        String[] strArr;
        Integer num;
        String str;
        ProductPrice productPrice;
        Image image;
        String str2;
        List<Image> list;
        this.f87505f = productPackStruct;
        com.ss.android.ugc.aweme.ecommerce.sku.a.a.a(productPackStruct);
        String str3 = productPackStruct.f86638b;
        if (str3 == null) {
            str3 = "0";
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.f87504e;
        String str4 = null;
        if (skuEnterParams != null) {
            strArr = skuEnterParams.getCheckedSkuIds();
        } else {
            strArr = null;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.f87504e;
        if (skuEnterParams2 != null) {
            num = skuEnterParams2.getProductQuantity();
        } else {
            num = null;
        }
        List<SkuItem> list2 = productPackStruct.f86643g;
        List<SaleProp> list3 = productPackStruct.f86642f;
        SkuPanelStarter.SkuEnterParams skuEnterParams3 = this.f87504e;
        if (skuEnterParams3 != null) {
            str = skuEnterParams3.getEnterFrom();
        } else {
            str = null;
        }
        ProductBase productBase = productPackStruct.f86641e;
        if (productBase != null) {
            productPrice = productBase.f86629g;
        } else {
            productPrice = null;
        }
        ProductBase productBase2 = productPackStruct.f86641e;
        if (productBase2 == null || (list = productBase2.f86626d) == null) {
            image = null;
        } else {
            image = (Image) h.a.n.b((List) list, 0);
        }
        SellerInfo sellerInfo = productPackStruct.f86640d;
        if (sellerInfo != null) {
            str2 = sellerInfo.f86657a;
        } else {
            str2 = null;
        }
        SkuPanelStarter.SkuRenderParams skuRenderParams = new SkuPanelStarter.SkuRenderParams(str3, strArr, num, list2, list3, str, productPrice, image, str2, productPackStruct.q, productPackStruct);
        String productId = skuRenderParams.getProductId();
        SkuPanelStarter.SkuEnterParams skuEnterParams4 = this.f87504e;
        if (skuEnterParams4 != null) {
            str4 = skuEnterParams4.getProductId();
        }
        if (h.f.b.l.a((Object) productId, (Object) str4)) {
            a(new SkuInfo(skuRenderParams.getSkuList(), skuRenderParams.getSalePropList()), skuRenderParams.getPrice(), skuRenderParams.getMainPicture(), new SkuPanelState(skuRenderParams.getProductId(), null, null, null, skuRenderParams.getCheckedSkuIds(), skuRenderParams.getProductQuantity(), false, 0, null, null, null, 1984, null), skuRenderParams.getSellerId(), skuRenderParams.getAddToCartButton());
            a(a.SUCCESS);
        }
    }

    public final void a(a aVar) {
        h.f.b.l.d(aVar, "");
        c(new w(aVar));
    }

    public static final class b extends h.f.b.m implements h.f.a.m<com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c, ButtonAction, Boolean> {
        final /* synthetic */ View $view;
        final /* synthetic */ SkuPanelViewModel this$0;

        static {
            Covode.recordClassIndex(54986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(SkuPanelViewModel skuPanelViewModel, View view) {
            super(2);
            this.this$0 = skuPanelViewModel;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c cVar, ButtonAction buttonAction) {
            String str;
            Integer num;
            Integer buttonActionType;
            String str2;
            Context context;
            HashMap<String, Object> hashMap;
            Object obj;
            String str3;
            HashMap<String, Object> visitReportParams;
            com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c cVar2 = cVar;
            ButtonAction buttonAction2 = buttonAction;
            String str4 = "";
            h.f.b.l.d(cVar2, str4);
            String valueOf = String.valueOf(cVar2.code);
            SkuPanelStarter.SkuEnterParams skuEnterParams = this.this$0.f87504e;
            String str5 = null;
            if (skuEnterParams != null) {
                str = skuEnterParams.getEnterFrom();
            } else {
                str = null;
            }
            if (buttonAction2 != null) {
                num = buttonAction2.getButtonActionType();
            } else {
                num = null;
            }
            boolean z = true;
            if (num != null) {
                if (num.intValue() == 0 || num.intValue() == 1) {
                    str4 = "stay";
                } else if (num.intValue() == 3) {
                    str4 = "enter";
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "sku");
            linkedHashMap.put("popup_name", "go_to_cart");
            if (!com.ss.android.ugc.aweme.ecommerce.sku.a.a.f87365a.containsKey("previous_page") && str != null) {
                linkedHashMap.put("previous_page", str);
            }
            if (valueOf != null) {
                linkedHashMap.put("error_code", valueOf);
            }
            linkedHashMap.put("action_type", str4);
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_popup_click", linkedHashMap);
            if (!(buttonAction2 == null || (buttonActionType = buttonAction2.getButtonActionType()) == null || buttonActionType.intValue() != 3)) {
                ButtonActionInfo buttonActionInfo = buttonAction2.getButtonActionInfo();
                if (buttonActionInfo != null) {
                    str2 = buttonActionInfo.getSchema();
                } else {
                    str2 = null;
                }
                if (hk.a(str2)) {
                    View view = this.$view;
                    if (view != null) {
                        context = view.getContext();
                    } else {
                        context = null;
                    }
                    SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.this$0.f87504e;
                    if (skuEnterParams2 != null) {
                        hashMap = skuEnterParams2.getTrackParams();
                    } else {
                        hashMap = null;
                    }
                    SkuPanelStarter.SkuEnterParams skuEnterParams3 = this.this$0.f87504e;
                    if (skuEnterParams3 == null || (visitReportParams = skuEnterParams3.getVisitReportParams()) == null) {
                        obj = null;
                    } else {
                        obj = visitReportParams.get("chain_key");
                    }
                    String str6 = (String) obj;
                    SkuPanelStarter.SkuEnterParams skuEnterParams4 = this.this$0.f87504e;
                    if (skuEnterParams4 != null) {
                        str3 = skuEnterParams4.getEnterFrom();
                    } else {
                        str3 = null;
                    }
                    ButtonActionInfo buttonActionInfo2 = buttonAction2.getButtonActionInfo();
                    if (buttonActionInfo2 != null) {
                        str5 = buttonActionInfo2.getSchema();
                    }
                    com.ss.android.ugc.aweme.ecommerce.cart.a.a(context, hashMap, null, str6, str3, str5);
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    private final void a(SkuInfo skuInfo, ProductPrice productPrice, Image image, SkuPanelState skuPanelState, String str, AddToCartButton addToCartButton) {
        boolean z;
        int i2;
        Integer stockNum;
        List<SaleProp> list;
        List<SalePropValue> list2;
        SkuItem skuItem;
        this.f87503d = skuInfo;
        this.o = image;
        this.f87502c = skuPanelState;
        this.p = productPrice;
        this.q = addToCartButton;
        this.f87508l = str;
        List<SkuItem> list3 = skuInfo.f87415a;
        if (list3 == null || list3.size() != 1) {
            z = false;
        } else {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.f87507k = valueOf;
        SkuPanelState skuPanelState2 = this.f87502c;
        if (skuPanelState2 != null) {
            skuPanelState2.setSingleSku(valueOf);
        }
        String[] strArr = null;
        a(productPrice != null ? productPrice.f86653d : null);
        a(productPrice != null ? productPrice.f86651b : null);
        List<SkuItem> list4 = skuInfo.f87415a;
        a((list4 == null || (skuItem = (SkuItem) h.a.n.h((List) list4)) == null) ? null : skuItem.getPromotionView());
        d(productPrice != null ? productPrice.f86652c : null);
        e(productPrice != null ? productPrice.f86650a : null);
        c(new j(this.q));
        SkuInfo skuInfo2 = this.f87503d;
        if (!(skuInfo2 == null || (list = skuInfo2.f87416b) == null || list.isEmpty())) {
            SaleProp saleProp = (SaleProp) h.a.n.h((List) list);
            if (!h.f.b.l.a((Object) (saleProp != null ? saleProp.f87410c : null), (Object) true) || (list2 = saleProp.f87411d) == null || list2.isEmpty()) {
                Image image2 = this.o;
                if (image2 != null) {
                    a(image2);
                    this.f87500a.add(image2);
                }
            } else {
                SalePropValue salePropValue = (SalePropValue) h.a.n.h((List) saleProp.f87411d);
                a(salePropValue != null ? salePropValue.f87414c : null);
                for (SalePropValue salePropValue2 : saleProp.f87411d) {
                    Image image3 = salePropValue2.f87414c;
                    if (image3 != null) {
                        this.f87500a.add(image3);
                    }
                    String str2 = salePropValue2.f87413b;
                    if (str2 != null) {
                        this.f87501b.add(str2);
                    }
                }
            }
        }
        Integer productQuantity = skuPanelState.getProductQuantity();
        if (productQuantity != null) {
            i2 = productQuantity.intValue();
        } else {
            i2 = 1;
        }
        SkuPanelState skuPanelState3 = this.f87502c;
        if (skuPanelState3 != null) {
            strArr = skuPanelState3.getCheckedSkuIds();
        }
        List<SkuItem> list5 = skuInfo.f87415a;
        if (list5 != null && list5.size() == 1 && (stockNum = skuInfo.f87415a.get(0).getStockNum()) != null && stockNum.intValue() > 0) {
            List<SkuSaleProp> skuSalePropList = skuInfo.f87415a.get(0).getSkuSalePropList();
            if (skuSalePropList != null) {
                ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) skuSalePropList, 10));
                Iterator<T> it = skuSalePropList.iterator();
                while (it.hasNext()) {
                    String str3 = it.next().f87418b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList.add(str3);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                strArr = (String[]) array;
            }
            a(i2);
        }
        if (strArr != null) {
            a(strArr);
        }
        a(i2);
    }
}
