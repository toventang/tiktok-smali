package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.retrofit2.u;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.preloader.LowResolutionImageCache;
import com.ss.android.ugc.aweme.ecommercebase.dto.GImage;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionItem;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.ss.android.ugc.aweme.ecommercebase.view.TagTextView;
import com.ss.android.ugc.aweme.ecommercebase.view.a.b;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.AudienceProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.c;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.business.common.view.LogoTuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.framework.a.a;
import com.ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.q;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bz;

public final class b extends RelativeLayout implements com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87869a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f87870b;

    static {
        Covode.recordClassIndex(55266);
    }

    private View a(int i2) {
        if (this.f87870b == null) {
            this.f87870b = new SparseArray();
        }
        View view = (View) this.f87870b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f87870b.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55267);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.c.b$b  reason: collision with other inner class name */
    public static final class C2128b extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ String $anchorId;
        final /* synthetic */ String $productIds;
        final /* synthetic */ String $roomId;
        final /* synthetic */ Integer $source;

        static {
            Covode.recordClassIndex(55268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2128b(Integer num, String str, String str2, String str3) {
            super(0);
            this.$source = num;
            this.$roomId = str;
            this.$anchorId = str2;
            this.$productIds = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }

        public final boolean a() {
            String str;
            if (this.$source == null || this.$roomId == null || this.$anchorId == null || (str = this.$productIds) == null || str.length() == 0) {
                return false;
            }
            return true;
        }
    }

    private static com.bytedance.lighten.a.e a() {
        e.a aVar = new e.a();
        aVar.f39831e = i.a.a.a.a.b.a(2.0f);
        aVar.f39827a = false;
        com.bytedance.lighten.a.e a2 = aVar.a();
        l.b(a2, "");
        return a2;
    }

    public static final class f extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87875a = 300;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f87876b;

        static {
            Covode.recordClassIndex(55272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(h.f.a.a aVar) {
            super(300);
            this.f87876b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            h.f.a.a aVar;
            if (view != null && (aVar = this.f87876b) != null) {
                aVar.invoke();
            }
        }
    }

    public static final class g extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87877a = 300;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f87878b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f87879c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PopupCardVO f87880d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommercelive.framework.b.a f87881e;

        static {
            Covode.recordClassIndex(55273);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                h.f.a.b bVar = this.f87879c;
                if (bVar != null) {
                    bVar.invoke("pic");
                }
                this.f87878b.b(this.f87880d, this.f87881e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(b bVar, h.f.a.b bVar2, PopupCardVO popupCardVO, com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar) {
            super(300);
            this.f87878b = bVar;
            this.f87879c = bVar2;
            this.f87880d = popupCardVO;
            this.f87881e = aVar;
        }
    }

    public static final class h extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87882a = 300;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f87883b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f87884c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PopupCardVO f87885d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommercelive.framework.b.a f87886e;

        static {
            Covode.recordClassIndex(55274);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                h.f.a.b bVar = this.f87884c;
                if (bVar != null) {
                    bVar.invoke("title");
                }
                this.f87883b.b(this.f87885d, this.f87886e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(b bVar, h.f.a.b bVar2, PopupCardVO popupCardVO, com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar) {
            super(300);
            this.f87883b = bVar;
            this.f87884c = bVar2;
            this.f87885d = popupCardVO;
            this.f87886e = aVar;
        }
    }

    public static final class i extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87887a = 300;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f87888b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f87889c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PopupCardVO f87890d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommercelive.framework.b.a f87891e;

        static {
            Covode.recordClassIndex(55275);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                h.f.a.b bVar = this.f87889c;
                if (bVar != null) {
                    bVar.invoke("button");
                }
                this.f87888b.b(this.f87890d, this.f87891e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(b bVar, h.f.a.b bVar2, PopupCardVO popupCardVO, com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar) {
            super(300);
            this.f87888b = bVar;
            this.f87889c = bVar2;
            this.f87890d = popupCardVO;
            this.f87891e = aVar;
        }
    }

    public static final class j extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87892a = 300;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f87893b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f87894c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PopupCardVO f87895d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommercelive.framework.b.a f87896e;

        static {
            Covode.recordClassIndex(55276);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                h.f.a.b bVar = this.f87894c;
                if (bVar != null) {
                    bVar.invoke("other");
                }
                this.f87893b.b(this.f87895d, this.f87896e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(b bVar, h.f.a.b bVar2, PopupCardVO popupCardVO, com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar) {
            super(300);
            this.f87893b = bVar;
            this.f87894c = bVar2;
            this.f87895d = popupCardVO;
            this.f87896e = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.c
    public final void setFlashSaleInfo(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ezn);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<com.bytedance.tux.c.e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f87874a = new e();

        static {
            Covode.recordClassIndex(55271);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44776b = Integer.valueOf((int) R.attr.a3f);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.c
    public final void setFlashSaleViewVisible(boolean z) {
        int i2;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        View a2 = a(R.id.fib);
        l.b(a2, "");
        a2.setVisibility(i2);
        TuxIconView tuxIconView = (TuxIconView) a(R.id.b6v);
        l.b(tuxIconView, "");
        tuxIconView.setVisibility(i2);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ezn);
        l.b(tuxTextView, "");
        tuxTextView.setVisibility(i2);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommercelive.framework.b.a $eventParamHelper;
        final /* synthetic */ PopupCardVO $product;
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(55269);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar, PopupCardVO popupCardVO, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$eventParamHelper = aVar;
            this.$product = popupCardVO;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, this.$eventParamHelper, this.$product, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            String str3;
            com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.c a2;
            if (this.label == 0) {
                r.a(obj);
                com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar = this.$eventParamHelper;
                String str4 = null;
                if (aVar != null) {
                    str = aVar.c("traffic_source");
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar2 = this.$eventParamHelper;
                if (aVar2 != null) {
                    str2 = aVar2.c("room_id");
                } else {
                    str2 = null;
                }
                com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar3 = this.$eventParamHelper;
                if (aVar3 != null) {
                    str3 = aVar3.c("author_id");
                } else {
                    str3 = null;
                }
                com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar4 = this.$eventParamHelper;
                if (aVar4 != null) {
                    str4 = aVar4.c("product_id");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str4);
                com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.e a3 = b.a(h.c.b.a.b.a(a.C2133a.a(str)), str2, str3, dg.a().b(arrayList));
                if (a3 == null || (a2 = com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.d.a(a3)) == null) {
                    this.this$0.a(this.$product, this.$eventParamHelper);
                } else {
                    this.this$0.a(this.$product, this.$eventParamHelper, a2);
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(1224);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, (int) R.style.x8);
        LayoutInflater.from(context).cloneInContext(contextThemeWrapper).inflate(R.layout.ya, this);
        setLayoutParams(new RelativeLayout.LayoutParams(com.ss.android.ugc.aweme.ecommercelive.framework.d.a.a(300, context), -2));
        setBackground(androidx.core.content.b.a(contextThemeWrapper, (int) R.drawable.a6i));
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ari);
        l.b(tuxTextView, "");
        TextPaint paint = tuxTextView.getPaint();
        paint.setFlags(16);
        paint.setAntiAlias(true);
        TuxIconView tuxIconView = (TuxIconView) a(R.id.b6v);
        l.b(tuxIconView, "");
        com.bytedance.tux.h.i.b(tuxIconView, 0, 0, 0, 0, false, 16);
        p.c(a(R.id.b6v), com.ss.android.ugc.aweme.ecommercelive.framework.d.a.a(2, context));
        TuxIconView tuxIconView2 = (TuxIconView) a(R.id.b6v);
        l.b(tuxIconView2, "");
        ViewGroup.LayoutParams layoutParams = tuxIconView2.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            aVar.q = -1;
            aVar.f2047d = R.id.fib;
            aVar.r = -1;
            aVar.f2049f = R.id.ezn;
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.ezn);
            l.b(tuxTextView2, "");
            com.bytedance.tux.h.i.b(tuxTextView2, 0, 0, 0, 0, false, 16);
            p.d(a(R.id.ezn), com.ss.android.ugc.aweme.ecommercelive.framework.d.a.a(2, context));
            TuxIconView tuxIconView3 = (TuxIconView) a(R.id.b6v);
            l.b(tuxIconView3, "");
            ViewGroup.LayoutParams layoutParams2 = tuxIconView3.getLayoutParams();
            if (layoutParams2 != null) {
                ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams2;
                aVar2.s = -1;
                aVar2.f2050g = R.id.fib;
                aVar2.p = -1;
                aVar2.f2048e = R.id.b6v;
                MethodCollector.o(1224);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            MethodCollector.o(1224);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        MethodCollector.o(1224);
        throw nullPointerException2;
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }

    public static final class d extends com.bytedance.lighten.a.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.d f87871a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupCardVO f87872b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f87873c;

        static {
            Covode.recordClassIndex(55270);
        }

        @Override // com.bytedance.lighten.a.c.d, com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view) {
            this.f87871a.element = System.currentTimeMillis();
        }

        d(z.d dVar, PopupCardVO popupCardVO, String str) {
            this.f87871a = dVar;
            this.f87872b = popupCardVO;
            this.f87873c = str;
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, Throwable th) {
            String str;
            String valueOf = String.valueOf(this.f87872b.getProductId());
            String str2 = this.f87873c;
            String imageUrl = this.f87872b.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            String fromMessageId = this.f87872b.getFromMessageId();
            if (this.f87872b.isFromMessage()) {
                str = "message";
            } else {
                str = "pop";
            }
            com.ss.android.ugc.aweme.ecommercelive.business.common.b.d.a(valueOf, str2, imageUrl, fromMessageId, str);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, o oVar, Animatable animatable) {
            String str;
            long currentTimeMillis = System.currentTimeMillis() - this.f87871a.element;
            String valueOf = String.valueOf(this.f87872b.getProductId());
            String str2 = this.f87873c;
            String imageUrl = this.f87872b.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            String fromMessageId = this.f87872b.getFromMessageId();
            if (this.f87872b.isFromMessage()) {
                str = "message";
            } else {
                str = "pop";
            }
            com.ss.android.ugc.aweme.ecommercelive.business.common.b.d.a(valueOf, str2, imageUrl, fromMessageId, str, Long.valueOf(currentTimeMillis));
            LowResolutionImageCache.a().a(this.f87872b.getImageUrlKey(), this.f87872b.getImageUrl());
        }
    }

    private static void a(TuxTextView tuxTextView, int i2) {
        if (tuxTextView.getMaxLines() != i2) {
            tuxTextView.setMaxLines(i2);
        }
    }

    private final void d(PopupCardVO popupCardVO, com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar) {
        String str;
        z.d dVar = new z.d();
        dVar.element = System.currentTimeMillis();
        if (aVar != null) {
            str = aVar.c("room_id");
        } else {
            str = null;
        }
        Drawable a2 = com.bytedance.tux.c.f.a(e.f87874a).a(new ContextThemeWrapper(getContext(), (int) R.style.x8));
        v a3 = com.bytedance.lighten.a.r.a(popupCardVO.getImageUrl());
        a3.n = a2;
        a3.w = a();
        a3.E = (SmartImageView) a(R.id.aro);
        a3.a(new d(dVar, popupCardVO, str));
    }

    public final void b(PopupCardVO popupCardVO, com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar) {
        int i2;
        int i3;
        List<PromotionItem> promotion_items;
        PromotionItem promotionItem;
        Integer style;
        List<PromotionItem> promotion_items2;
        PromotionItem promotionItem2;
        Integer type;
        PromotionView promotionView = popupCardVO.getPromotionView();
        if (promotionView == null || (promotion_items2 = promotionView.getPromotion_items()) == null || (promotionItem2 = (PromotionItem) n.h((List) promotion_items2)) == null || (type = promotionItem2.getType()) == null) {
            i2 = 0;
        } else {
            i2 = type.intValue();
        }
        PromotionView promotionView2 = popupCardVO.getPromotionView();
        if (promotionView2 == null || (promotion_items = promotionView2.getPromotion_items()) == null || (promotionItem = (PromotionItem) n.h((List) promotion_items)) == null || (style = promotionItem.getStyle()) == null) {
            i3 = -1;
        } else {
            i3 = style.intValue();
        }
        if (i2 == 3 && i3 == 1) {
            bz unused = kotlinx.coroutines.i.a(an.a(com.ss.android.ugc.aweme.ecommercelive.framework.d.a.b.f88027b), null, null, new c(this, aVar, popupCardVO, null), 3);
        } else {
            a(popupCardVO, aVar);
        }
    }

    private final void c(PopupCardVO popupCardVO, com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (popupCardVO.getPlatform() == 5 || (popupCardVO.getPlatform() == 6 && popupCardVO.getSchema() != null)) {
            String str8 = null;
            if (aVar != null) {
                str = aVar.c("author_id");
                str2 = aVar.c("room_id");
                str3 = aVar.c("enter_from_merge");
                str4 = aVar.c("enter_method");
                str5 = aVar.c("action_type");
                str6 = aVar.c("follow_status");
                str7 = aVar.c("list_skin_type");
                str8 = aVar.c("product_skin_type");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
            }
            int platform = popupCardVO.getPlatform();
            String schema = popupCardVO.getSchema();
            com.ss.android.ugc.aweme.ecommercelive.business.a.a aVar2 = new com.ss.android.ugc.aweme.ecommercelive.business.a.a((byte) 0);
            if (str == null) {
                str = "";
            }
            aVar2.f87727b = str;
            aVar2.f87728c = String.valueOf(popupCardVO.getProductId());
            aVar2.f87736k = "live";
            aVar2.f87726a = "live_popup_card";
            aVar2.f87734i = str2;
            aVar2.f87729d = str3 + "_temai_" + str4;
            aVar2.f87730e = str5;
            aVar2.f87731f = String.valueOf(popupCardVO.getPlatform());
            aVar2.f87732g = String.valueOf(popupCardVO.getSourceFrom());
            aVar2.f87733h = popupCardVO.getSource();
            aVar2.f87735j = str6;
            aVar2.q = str7;
            aVar2.r = str8;
            String a2 = com.ss.android.ugc.aweme.ecommercelive.business.a.b.a(platform, schema, aVar2);
            if (a2 != null) {
                ECommerceService.createIECommerceServicebyMonsterPlugin(false).prefetchPdp(a2, getContext());
            }
        }
    }

    public final void a(PopupCardVO popupCardVO, com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Map<String, String> map;
        if (aVar != null) {
            str = aVar.c("author_id");
            str2 = aVar.c("room_id");
            str3 = aVar.c("enter_from_merge");
            str4 = aVar.c("enter_method");
            str5 = aVar.c("action_type");
            str6 = aVar.c("follow_status");
            str7 = aVar.c("entrance_form");
            str8 = aVar.c("is_ad");
            str9 = aVar.c("request_id");
            str10 = aVar.c("list_skin_type");
            str11 = aVar.c("product_skin_type");
            str12 = aVar.c("search_id");
            str13 = aVar.c("search_result_id");
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
            str12 = null;
            str13 = null;
        }
        com.ss.android.ugc.aweme.ecommercelive.business.a.a aVar2 = new com.ss.android.ugc.aweme.ecommercelive.business.a.a((byte) 0);
        if (str == null) {
            str = "";
        }
        aVar2.f87727b = str;
        aVar2.f87728c = String.valueOf(popupCardVO.getProductId());
        aVar2.f87736k = "live";
        aVar2.f87726a = "live_popup_card";
        aVar2.f87734i = str2;
        aVar2.f87729d = str3 + "_temai_" + str4;
        aVar2.f87730e = str5;
        aVar2.f87731f = String.valueOf(popupCardVO.getPlatform());
        aVar2.f87732g = String.valueOf(popupCardVO.getSourceFrom());
        aVar2.f87733h = popupCardVO.getSource();
        aVar2.f87735j = str6;
        aVar2.f87737l = str7;
        aVar2.f87738m = str8;
        if (aVar != null) {
            map = (Map) aVar.b("effect_ad_extra");
        } else {
            map = null;
        }
        aVar2.u = map;
        aVar2.n = com.bytedance.android.livesdk.ab.e.o();
        aVar2.o = com.bytedance.android.livesdk.ab.e.p();
        if (str9 == null) {
            str9 = "";
        }
        aVar2.p = str9;
        aVar2.q = str10;
        aVar2.r = str11;
        aVar2.s = str12;
        aVar2.t = str13;
        if (hl.a(popupCardVO.getSchema())) {
            SmartRouter.buildRoute(getContext(), com.ss.android.ugc.aweme.ecommercelive.business.a.b.a(popupCardVO.getPlatform(), popupCardVO.getSchema(), aVar2)).open();
            return;
        }
        int c2 = com.bytedance.common.utility.n.c(getContext(), ((float) com.bytedance.common.utility.n.b(getContext())) * 0.9f);
        com.ss.android.common.util.g gVar = new com.ss.android.common.util.g("sslocal://webcast_webview");
        gVar.a("title", popupCardVO.getTitle());
        gVar.a("gravity", "bottom");
        gVar.a(StringSet.type, "popup");
        gVar.a("height", String.valueOf(c2));
        gVar.a("hide_nav_bar", 1);
        com.ss.android.common.util.g gVar2 = new com.ss.android.common.util.g(popupCardVO.getOpenUrl());
        gVar2.a("web_bg_color", "FFFFFF");
        gVar2.a("hide_loading", 0);
        gVar.a("url", gVar2.a());
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.d().a(getContext(), Uri.parse(gVar.a() + "&use_page_back=true&show_title_bar=true&show_title_close=true"));
    }

    public final void a(PopupCardVO popupCardVO, com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar, com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        int i2;
        String str16;
        List<String> urls;
        if (aVar != null) {
            str = aVar.c("author_id");
        } else {
            str = null;
        }
        if (aVar != null) {
            str2 = aVar.c("room_id");
            str3 = aVar.c("enter_from_merge");
            str4 = aVar.c("enter_method");
            str5 = aVar.c("action_type");
            str6 = aVar.c("follow_status");
            str7 = aVar.c("entrance_form");
            str8 = aVar.c("is_ad");
            str9 = aVar.c("request_id");
            str10 = aVar.c("list_skin_type");
            str11 = aVar.c("product_skin_type");
            str12 = aVar.c("search_id");
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
            str12 = null;
        }
        if (aVar != null) {
            str13 = aVar.c("search_result_id");
        } else {
            str13 = null;
        }
        int platform = popupCardVO.getPlatform();
        String schema = popupCardVO.getSchema();
        com.ss.android.ugc.aweme.ecommercelive.business.a.a aVar2 = new com.ss.android.ugc.aweme.ecommercelive.business.a.a((byte) 0);
        if (str == null) {
            str = "";
        }
        aVar2.f87727b = str;
        aVar2.f87728c = String.valueOf(popupCardVO.getProductId());
        aVar2.f87736k = "live";
        aVar2.f87726a = "live_popup_card";
        aVar2.f87734i = str2;
        aVar2.f87729d = str3 + "_temai_" + str4;
        aVar2.f87730e = str5;
        aVar2.f87731f = String.valueOf(popupCardVO.getPlatform());
        aVar2.f87732g = String.valueOf(popupCardVO.getSourceFrom());
        aVar2.f87733h = popupCardVO.getSource();
        aVar2.f87735j = str6;
        aVar2.f87737l = str7;
        aVar2.f87738m = str8;
        aVar2.n = com.bytedance.android.livesdk.ab.e.o();
        aVar2.o = com.bytedance.android.livesdk.ab.e.p();
        if (str9 == null) {
            str9 = "";
        }
        aVar2.p = str9;
        aVar2.q = str10;
        aVar2.r = str11;
        aVar2.s = str12;
        aVar2.t = str13;
        String a2 = com.ss.android.ugc.aweme.ecommercelive.business.a.b.a(platform, schema, aVar2);
        Uri.Builder builder = new Uri.Builder();
        Uri parse = Uri.parse(cVar.f87770g);
        if (parse != null) {
            Uri.Builder encodedPath = builder.scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).encodedPath(parse.getPath());
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            l.b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                encodedPath.appendQueryParameter(t, parse.getQueryParameter(t));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            GImage gImage = cVar.f87771h;
            if (!(gImage == null || (urls = gImage.getUrls()) == null)) {
                arrayList.addAll(urls);
            }
            linkedHashMap2.put("image_url", arrayList);
            String str17 = cVar.f87765b;
            if (str17 == null) {
                str17 = "";
            }
            linkedHashMap2.put("title", str17);
            String str18 = cVar.f87766c;
            if (str18 == null) {
                str18 = "";
            }
            linkedHashMap2.put("desc", str18);
            String str19 = cVar.f87767d;
            if (str19 == null) {
                str19 = "";
            }
            linkedHashMap2.put("from_price", str19);
            String str20 = cVar.f87768e;
            if (str20 == null) {
                str20 = "";
            }
            linkedHashMap2.put("to_price", str20);
            ArrayList arrayList2 = new ArrayList();
            List<com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.b> list = cVar.f87769f;
            if (list != null) {
                for (T t2 : list) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    String str21 = t2.f87761a;
                    if (str21 == null) {
                        str21 = "";
                    }
                    linkedHashMap3.put("text", str21);
                    Integer num = t2.f87762b;
                    if (num == null) {
                        num = "";
                    }
                    linkedHashMap3.put("action", num);
                    if (a2 == null) {
                        str16 = "";
                    } else {
                        str16 = a2;
                    }
                    linkedHashMap3.put("redirect", str16);
                    arrayList2.add(linkedHashMap3);
                }
            }
            linkedHashMap2.put("buttons", arrayList2);
            linkedHashMap.put("content_params", linkedHashMap2);
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put("enter_from", c.a.C2123a.f87772a);
            if (aVar == null || (str14 = aVar.c("room_id")) == null) {
                str14 = "";
            }
            linkedHashMap4.put("room_id", str14);
            if (aVar == null || (str15 = aVar.c("author_id")) == null) {
                str15 = "";
            }
            linkedHashMap4.put("anchor_id", str15);
            linkedHashMap.put("track_params", linkedHashMap4);
            Integer num2 = cVar.f87764a;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            linkedHashMap.put("popup_type", Integer.valueOf(i2));
            encodedPath.appendQueryParameter("popup_params", dg.a().b(linkedHashMap));
        }
        String uri = builder.build().toString();
        l.b(uri, "");
        SmartRouter.buildRoute(getContext(), uri).open();
    }

    public static com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.e a(Integer num, String str, String str2, String str3) {
        Object obj;
        com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.e eVar;
        T t;
        Boolean valueOf = Boolean.valueOf(new C2128b(num, str, str2, str3).a());
        int i2 = 0;
        boolean z = true;
        if (!valueOf.booleanValue()) {
            z = false;
        }
        com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.e eVar2 = null;
        if (!z) {
            return null;
        }
        valueOf.booleanValue();
        try {
            AudienceProductListApi audienceProductListApi = (AudienceProductListApi) com.ss.android.ugc.aweme.ecommercelive.framework.network.a.a(AudienceProductListApi.class, "https://oec-api.tiktokv.com");
            if (num != null) {
                i2 = num.intValue();
            }
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            if (str3 == null) {
                str3 = "";
            }
            u<BaseResponse<com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.e>> execute = audienceProductListApi.getFansPopUp(i2, str, str2, str3).execute();
            if (execute == null || (t = execute.f42630b) == null) {
                eVar = null;
            } else {
                eVar = (com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.e) t.getData();
            }
            obj = q.m223constructorimpl(eVar);
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (!q.m228isFailureimpl(obj)) {
            eVar2 = obj;
        }
        return eVar2;
    }

    public final void a(PopupCardVO popupCardVO, com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar, h.f.a.b<? super String, h.z> bVar, h.f.a.a<h.z> aVar2) {
        PromotionItem promotionItem;
        GImage gImage;
        List<PromotionItem> promotion_items;
        l.d(popupCardVO, "");
        c(popupCardVO, aVar);
        d(popupCardVO, aVar);
        LogoTuxTextView logoTuxTextView = (LogoTuxTextView) a(R.id.arn);
        l.b(logoTuxTextView, "");
        logoTuxTextView.setText(popupCardVO.getTitle());
        PromotionView promotionView = popupCardVO.getPromotionView();
        if (promotionView == null || (promotion_items = promotionView.getPromotion_items()) == null) {
            promotionItem = null;
        } else {
            promotionItem = (PromotionItem) n.h((List) promotion_items);
        }
        ((TagTextView) a(R.id.arj)).setTagUi(b.a.a(promotionItem));
        if (((TagTextView) a(R.id.arj)).f87698a) {
            LogoTuxTextView logoTuxTextView2 = (LogoTuxTextView) a(R.id.arn);
            l.b(logoTuxTextView2, "");
            a(logoTuxTextView2, 1);
        } else {
            LogoTuxTextView logoTuxTextView3 = (LogoTuxTextView) a(R.id.arn);
            l.b(logoTuxTextView3, "");
            a(logoTuxTextView3, 2);
        }
        com.ss.android.ugc.aweme.ecommercelive.business.common.a.e promotionSkin = popupCardVO.getPromotionSkin();
        if (!(promotionSkin == null || (gImage = promotionSkin.f87972a) == null)) {
            v a2 = com.bytedance.lighten.a.r.a(gImage.toImageUrlModel());
            a2.E = (SmartImageView) a(R.id.arf);
            a2.c();
        }
        ((LogoTuxTextView) a(R.id.arn)).a(popupCardVO.getTitle(), popupCardVO.getPromotionLogos());
        TuxTextView tuxTextView = (TuxTextView) a(R.id.arp);
        l.b(tuxTextView, "");
        String formatAvailablePrice = popupCardVO.getFormatAvailablePrice();
        if (formatAvailablePrice == null) {
            formatAvailablePrice = popupCardVO.getPrice();
        }
        tuxTextView.setText(formatAvailablePrice);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.ari);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(popupCardVO.getFormatOriginPrice());
        TuxTextView tuxTextView3 = (TuxTextView) a(R.id.arg);
        l.b(tuxTextView3, "");
        tuxTextView3.setText(popupCardVO.getSource());
        if (popupCardVO.isSoldOut()) {
            Context context = getContext();
            l.b(context, "");
            androidx.l.a.a.i a3 = androidx.l.a.a.i.a(context.getResources(), R.drawable.a6_, null);
            if (a3 != null) {
                TuxTextView tuxTextView4 = (TuxTextView) a(R.id.are);
                l.b(tuxTextView4, "");
                tuxTextView4.setBackground(a3);
            }
            ((TuxTextView) a(R.id.are)).setTextColor(androidx.core.content.b.c(getContext(), R.color.bz));
        } else {
            Context context2 = getContext();
            l.b(context2, "");
            androidx.l.a.a.i a4 = androidx.l.a.a.i.a(context2.getResources(), R.drawable.a65, null);
            if (a4 != null) {
                TuxTextView tuxTextView5 = (TuxTextView) a(R.id.are);
                l.b(tuxTextView5, "");
                tuxTextView5.setBackground(a4);
            }
            ((TuxTextView) a(R.id.are)).setTextColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) a(R.id.arh);
        l.b(appCompatImageView, "");
        appCompatImageView.setOnClickListener(new f(aVar2));
        SmartImageView smartImageView = (SmartImageView) a(R.id.aro);
        l.b(smartImageView, "");
        smartImageView.setOnClickListener(new g(this, bVar, popupCardVO, aVar));
        LogoTuxTextView logoTuxTextView4 = (LogoTuxTextView) a(R.id.arn);
        l.b(logoTuxTextView4, "");
        logoTuxTextView4.setOnClickListener(new h(this, bVar, popupCardVO, aVar));
        TuxTextView tuxTextView6 = (TuxTextView) a(R.id.are);
        l.b(tuxTextView6, "");
        tuxTextView6.setOnClickListener(new i(this, bVar, popupCardVO, aVar));
        setOnClickListener(new j(this, bVar, popupCardVO, aVar));
    }
}
