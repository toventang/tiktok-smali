package com.bytedance.ies.xelement;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.xelement.b;
import com.bytedance.ies.xelement.i;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import com.lynx.tasm.behavior.v;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import h.f.b.z;
import h.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class LynxScrollView extends AbsLynxUIScroll<b> {
    public static final a p = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f36540a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f36541b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f36542c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f36543d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f36544e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f36545f;

    /* renamed from: g  reason: collision with root package name */
    public RecyclerView f36546g;

    /* renamed from: h  reason: collision with root package name */
    public int f36547h;

    /* renamed from: i  reason: collision with root package name */
    public i f36548i;

    /* renamed from: j  reason: collision with root package name */
    public int f36549j;

    /* renamed from: k  reason: collision with root package name */
    public int f36550k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f36551l;

    /* renamed from: m  reason: collision with root package name */
    public int f36552m = 1;
    public int n;
    public boolean o = true;
    private int q;
    private int r;
    private LynxBounceView s;

    static {
        Covode.recordClassIndex(21934);
    }

    public static boolean b(int i2) {
        return (i2 & 1) != 0;
    }

    public static boolean c(int i2) {
        return (i2 & 2) != 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean canHaveFlattenChild() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            switch (nextKey.hashCode()) {
                case -1826701651:
                    if (nextKey.equals("scroll-to-id")) {
                        scrollToId(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1383205240:
                    if (nextKey.equals("bounce")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setBounces(z);
                        continue;
                    }
                    break;
                case -1138034670:
                    if (nextKey.equals("enable-load-more")) {
                        boolean z2 = true;
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, true);
                        }
                        enableLoadMore(z2);
                        continue;
                    }
                    break;
                case 363559068:
                    if (nextKey.equals("layout-direction")) {
                        setLayoutDirection(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 561570840:
                    if (nextKey.equals("overflow-text")) {
                        overflowText(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1448017537:
                    if (nextKey.equals("page-enable")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setPageEnable(z);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final boolean needCustomLayout() {
        return true;
    }

    @m(a = "overflow-text")
    public final void overflowText(String str) {
        l.c(str, "");
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTap(boolean z) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21937);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    final class e extends LinearLayoutManager {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxScrollView f36556a;

        static {
            Covode.recordClassIndex(21941);
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f36558a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ z.c f36559b;

            static {
                Covode.recordClassIndex(21943);
            }

            b(e eVar, z.c cVar) {
                this.f36558a = eVar;
                this.f36559b = cVar;
            }

            public final void run() {
                this.f36558a.f36556a.a(this.f36559b.element);
            }
        }

        final class a extends r {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ e f36557f;

            static {
                Covode.recordClassIndex(21942);
            }

            @Override // androidx.recyclerview.widget.r
            public final int b() {
                return -1;
            }

            @Override // androidx.recyclerview.widget.r
            public final int c() {
                return -1;
            }

            @Override // androidx.recyclerview.widget.r
            public final float a(DisplayMetrics displayMetrics) {
                if (displayMetrics == null) {
                    return super.a(displayMetrics);
                }
                int i2 = Build.VERSION.SDK_INT;
                return 50.0f / ((float) displayMetrics.densityDpi);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(e eVar, Context context) {
                super(context);
                l.c(context, "");
                this.f36557f = eVar;
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final void a(RecyclerView.s sVar) {
            super.a(sVar);
            if (this.f36556a.f36549j > 0) {
                LynxScrollView lynxScrollView = this.f36556a;
                if (lynxScrollView.a(lynxScrollView.f36549j, false)) {
                    this.f36556a.f36549j = 0;
                }
            }
            if (this.f36556a.f36550k > 0) {
                z.c cVar = new z.c();
                cVar.element = this.f36556a.f36550k;
                this.f36556a.f36550k = 0;
                LynxScrollView.a(this.f36556a).post(new b(this, cVar));
            }
        }

        public e(LynxScrollView lynxScrollView, Context context) {
            l.c(context, "");
            this.f36556a = lynxScrollView;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
            l.c(recyclerView, "");
            l.c(sVar, "");
            Context context = recyclerView.getContext();
            l.a((Object) context, "");
            a aVar = new a(this, context);
            aVar.f3862g = i2;
            a(aVar);
        }
    }

    final class b extends RecyclerView.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public HashSet<Integer> f36553a = new HashSet<>();

        static {
            Covode.recordClassIndex(21938);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ c onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            return LynxScrollView.this.mChildren.size();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemViewType(int i2) {
            return ((LynxBaseUI) LynxScrollView.this.mChildren.get(i2)).hashCode();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onViewAttachedToWindow(c cVar) {
            com.lynx.tasm.c cVar2;
            l.c(cVar, "");
            int adapterPosition = cVar.getAdapterPosition();
            if (adapterPosition < LynxScrollView.this.mChildren.size() && !this.f36553a.contains(Integer.valueOf(adapterPosition))) {
                LynxBaseUI lynxBaseUI = (LynxBaseUI) LynxScrollView.this.mChildren.get(adapterPosition);
                if (lynxBaseUI != null && (lynxBaseUI instanceof LynxImpressionView)) {
                    LynxImpressionView lynxImpressionView = (LynxImpressionView) lynxBaseUI;
                    if (lynxImpressionView.f36525a) {
                        lynxImpressionView.hashCode();
                        j jVar = lynxImpressionView.mContext;
                        if (!(jVar == null || (cVar2 = jVar.f55897e) == null)) {
                            cVar2.a(new com.lynx.tasm.c.b(lynxImpressionView.getSign(), "impression"));
                        }
                    }
                }
                this.f36553a.add(Integer.valueOf(adapterPosition));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onViewDetachedFromWindow(c cVar) {
            com.lynx.tasm.c cVar2;
            l.c(cVar, "");
            int adapterPosition = cVar.getAdapterPosition();
            if (adapterPosition < LynxScrollView.this.mChildren.size() && this.f36553a.contains(Integer.valueOf(adapterPosition))) {
                LynxBaseUI lynxBaseUI = (LynxBaseUI) LynxScrollView.this.mChildren.get(adapterPosition);
                if (lynxBaseUI != null && (lynxBaseUI instanceof LynxImpressionView)) {
                    LynxImpressionView lynxImpressionView = (LynxImpressionView) lynxBaseUI;
                    if (lynxImpressionView.f36526b) {
                        lynxImpressionView.hashCode();
                        j jVar = lynxImpressionView.mContext;
                        if (!(jVar == null || (cVar2 = jVar.f55897e) == null)) {
                            cVar2.a(new com.lynx.tasm.c.b(lynxImpressionView.getSign(), "exit"));
                        }
                    }
                }
                this.f36553a.remove(Integer.valueOf(adapterPosition));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(c cVar, int i2) {
            c cVar2 = cVar;
            l.c(cVar2, "");
            LynxScrollView lynxScrollView = LynxScrollView.this;
            View view = cVar2.itemView;
            l.a((Object) view, "");
            Object obj = lynxScrollView.mChildren.get(i2);
            l.a(obj, "");
            int width = ((LynxBaseUI) obj).getWidth();
            Object obj2 = lynxScrollView.mChildren.get(i2);
            l.a(obj2, "");
            RecyclerView.j jVar = new RecyclerView.j(width, ((LynxBaseUI) obj2).getHeight());
            Object obj3 = lynxScrollView.mChildren.get(i2);
            l.a(obj3, "");
            jVar.leftMargin = ((LynxBaseUI) obj3).mMarginLeft;
            Object obj4 = lynxScrollView.mChildren.get(i2);
            l.a(obj4, "");
            jVar.rightMargin = ((LynxBaseUI) obj4).mMarginRight;
            Object obj5 = lynxScrollView.mChildren.get(i2);
            l.a(obj5, "");
            jVar.topMargin = ((LynxBaseUI) obj5).mMarginTop;
            Object obj6 = lynxScrollView.mChildren.get(i2);
            l.a(obj6, "");
            jVar.bottomMargin = ((LynxBaseUI) obj6).mMarginBottom;
            view.setLayoutParams(jVar);
        }

        private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
            c cVar;
            boolean a2;
            MethodCollector.i(3155);
            l.c(viewGroup, "");
            Iterator it = LynxScrollView.this.mChildren.iterator();
            while (true) {
                if (!it.hasNext()) {
                    j jVar = LynxScrollView.this.mContext;
                    l.a((Object) jVar, "");
                    cVar = new c(new FrameLayout(jVar.a()));
                    break;
                }
                LynxBaseUI lynxBaseUI = (LynxBaseUI) it.next();
                if (lynxBaseUI.hashCode() == i2) {
                    T t = ((LynxUI) lynxBaseUI).mView;
                    l.a((Object) t, "");
                    cVar = new c(t);
                    break;
                }
            }
            try {
                if (cVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(cVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = cVar.getClass().getName();
            MethodCollector.o(3155);
            return cVar;
        }
    }

    public static final class h extends RecyclerView {
        final /* synthetic */ LynxScrollView O;
        final /* synthetic */ Context P;

        static {
            Covode.recordClassIndex(21946);
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            RecyclerView.f itemAnimator = getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public final void onDetachedFromWindow() {
            i iVar = this.O.f36548i;
            if (iVar != null) {
                RecyclerView a2 = LynxScrollView.a(this.O);
                l.c(a2, "");
                ViewTreeObserver viewTreeObserver = a2.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnScrollChangedListener(iVar.f37082a);
                }
                iVar.f37082a = null;
            }
            super.onDetachedFromWindow();
            this.O.f36548i = null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
            if (r0 == null) goto L_0x004a;
         */
        @Override // androidx.recyclerview.widget.RecyclerView
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void requestLayout() {
            /*
            // Method dump skipped, instructions count: 108
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.LynxScrollView.h.requestLayout():void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(Context context, LynxScrollView lynxScrollView, Context context2) {
            super(context);
            this.O = lynxScrollView;
            this.P = context2;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollX() {
        RecyclerView recyclerView = this.f36546g;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        return recyclerView.computeHorizontalScrollOffset();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollY() {
        RecyclerView recyclerView = this.f36546g;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        return recyclerView.computeVerticalScrollOffset();
    }

    public static final class g implements b.AbstractC0892b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxScrollView f36561a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f36562b;

        static {
            Covode.recordClassIndex(21945);
        }

        @Override // com.bytedance.ies.xelement.b.AbstractC0892b
        public final void a() {
            j jVar;
            com.lynx.tasm.c cVar;
            if (this.f36561a.f36540a && (jVar = this.f36561a.mContext) != null && (cVar = jVar.f55897e) != null) {
                cVar.a(new com.lynx.tasm.c.b(this.f36561a.getSign(), "scrolltobounce"));
            }
        }

        g(LynxScrollView lynxScrollView, Context context) {
            this.f36561a = lynxScrollView;
            this.f36562b = context;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i2 = this.mPaddingLeft + this.mBorderLeftWidth;
        int i3 = this.mPaddingRight + this.mBorderRightWidth;
        int i4 = this.mPaddingTop + this.mBorderTopWidth;
        int i5 = this.mPaddingBottom + this.mBorderBottomWidth;
        RecyclerView recyclerView = this.f36546g;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        recyclerView.setPadding(i2, i4, i3, i5);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void measureChildren() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Integer num;
        super.measureChildren();
        LynxBounceView lynxBounceView = this.s;
        if (lynxBounceView != null) {
            lynxBounceView.measure();
        }
        View mBounceView = ((b) this.mView).getMBounceView();
        Integer num2 = null;
        if (!(mBounceView == null || (layoutParams2 = mBounceView.getLayoutParams()) == null)) {
            LynxBounceView lynxBounceView2 = this.s;
            if (lynxBounceView2 != null) {
                num = Integer.valueOf(lynxBounceView2.getWidth());
            } else {
                num = null;
            }
            layoutParams2.width = num.intValue();
        }
        View mBounceView2 = ((b) this.mView).getMBounceView();
        if (!(mBounceView2 == null || (layoutParams = mBounceView2.getLayoutParams()) == null)) {
            LynxBounceView lynxBounceView3 = this.s;
            if (lynxBounceView3 != null) {
                num2 = Integer.valueOf(lynxBounceView3.getHeight());
            }
            layoutParams.height = num2.intValue();
        }
        LynxBounceView lynxBounceView4 = this.s;
        if (lynxBounceView4 != null) {
            lynxBounceView4.layout();
        }
    }

    public final int a() {
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f36546g;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int i5 = 0;
        if (linearLayoutManager == null || this.mChildren.size() == 0) {
            return 0;
        }
        int k2 = linearLayoutManager.k();
        if (k2 >= 0 && k2 < this.mChildren.size()) {
            View c2 = linearLayoutManager.c(k2);
            if (linearLayoutManager.f()) {
                if (this.mLynxDirection == 2) {
                    int width = getWidth();
                    Object obj = this.mChildren.get(this.mChildren.size() - 1);
                    l.a(obj, "");
                    int left = width - ((LynxBaseUI) obj).getLeft();
                    Object obj2 = this.mChildren.get(this.mChildren.size() - 1);
                    l.a(obj2, "");
                    int i6 = left + ((LynxBaseUI) obj2).mMarginLeft + this.mPaddingLeft;
                    Object obj3 = this.mChildren.get(0);
                    l.a(obj3, "");
                    int left2 = ((LynxBaseUI) obj3).getLeft();
                    Object obj4 = this.mChildren.get(k2);
                    l.a(obj4, "");
                    int left3 = left2 - ((LynxBaseUI) obj4).getLeft();
                    Object obj5 = this.mChildren.get(0);
                    l.a(obj5, "");
                    int width2 = left3 + ((LynxBaseUI) obj5).getWidth();
                    Object obj6 = this.mChildren.get(0);
                    l.a(obj6, "");
                    int i7 = width2 + ((LynxBaseUI) obj6).mMarginRight + this.mPaddingRight;
                    if (c2 != null) {
                        i4 = getWidth() - c2.getLeft();
                    } else {
                        i4 = 0;
                    }
                    int i8 = i7 - i4;
                    if ((i6 - getWidth()) - i8 <= this.q) {
                        i5 = 2;
                    }
                    if (i8 <= this.r) {
                        i5 |= 1;
                    }
                    this.n = i8;
                } else {
                    Object obj7 = this.mChildren.get(this.mChildren.size() - 1);
                    l.a(obj7, "");
                    int left4 = ((LynxBaseUI) obj7).getLeft();
                    Object obj8 = this.mChildren.get(this.mChildren.size() - 1);
                    l.a(obj8, "");
                    int width3 = left4 + ((LynxBaseUI) obj8).getWidth();
                    Object obj9 = this.mChildren.get(this.mChildren.size() - 1);
                    l.a(obj9, "");
                    int i9 = width3 + ((LynxBaseUI) obj9).mMarginRight + this.mPaddingLeft;
                    Object obj10 = this.mChildren.get(k2);
                    l.a(obj10, "");
                    int left5 = ((LynxBaseUI) obj10).getLeft() + 0;
                    if (c2 != null) {
                        i3 = c2.getLeft();
                    } else {
                        i3 = 0;
                    }
                    int i10 = left5 - i3;
                    int width4 = (i9 - i10) - getWidth();
                    if (i10 <= this.r) {
                        i5 = 1;
                    }
                    if (width4 <= this.q) {
                        i5 |= 2;
                    }
                    this.n = i10;
                }
            } else if (linearLayoutManager.g()) {
                Object obj11 = this.mChildren.get(this.mChildren.size() - 1);
                l.a(obj11, "");
                int top = ((LynxBaseUI) obj11).getTop();
                Object obj12 = this.mChildren.get(this.mChildren.size() - 1);
                l.a(obj12, "");
                int height = top + ((LynxBaseUI) obj12).getHeight();
                Object obj13 = this.mChildren.get(this.mChildren.size() - 1);
                l.a(obj13, "");
                int i11 = height + ((LynxBaseUI) obj13).mMarginBottom + this.mPaddingBottom;
                Object obj14 = this.mChildren.get(k2);
                l.a(obj14, "");
                int top2 = ((LynxBaseUI) obj14).getTop();
                if (c2 != null) {
                    i2 = c2.getTop();
                } else {
                    i2 = 0;
                }
                int i12 = top2 - i2;
                int height2 = (i11 - getHeight()) - i12;
                if (i12 <= this.r) {
                    i5 = 1;
                }
                if (height2 <= this.q) {
                    i5 |= 2;
                }
                this.n = i12;
            }
        }
        return i5;
    }

    @m(a = "enable-load-more", f = true)
    public final void enableLoadMore(boolean z) {
        this.o = z;
    }

    @m(a = "page-enable", f = false)
    public final void setPageEnable(boolean z) {
        this.f36545f = z;
    }

    final class d extends RecyclerView.n {
        static {
            Covode.recordClassIndex(21940);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.c(recyclerView, "");
            LynxScrollView.this.recognizeGesturere();
            if (LynxScrollView.this.f36544e && LynxScrollView.this.f36547h == 1 && (i2 == 2 || i2 == 0)) {
                if (((b) LynxScrollView.this.mView).getMScrollDirection() == b.c.HORIZONTAL_LEFT || ((b) LynxScrollView.this.mView).getMScrollDirection() == b.c.HORIZONTAL_RIGHT) {
                    int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                    LynxScrollView.this.a(computeHorizontalScrollOffset, 0, computeHorizontalScrollOffset, 0, "dragend");
                }
                if (((b) LynxScrollView.this.mView).getMScrollDirection() == b.c.VERTICAL_BOTTOM || ((b) LynxScrollView.this.mView).getMScrollDirection() == b.c.VERTICAL_TOP) {
                    int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                    LynxScrollView.this.a(0, computeVerticalScrollOffset, 0, computeVerticalScrollOffset, "dragend");
                }
            }
            LynxScrollView.this.f36547h = i2;
            if (i2 == 0 && LynxScrollView.this.f36545f) {
                if (((b) LynxScrollView.this.mView).getMScrollDirection() == b.c.HORIZONTAL_LEFT || ((b) LynxScrollView.this.mView).getMScrollDirection() == b.c.HORIZONTAL_RIGHT) {
                    int measuredWidth = recyclerView.getMeasuredWidth();
                    int computeHorizontalScrollOffset2 = recyclerView.computeHorizontalScrollOffset() % measuredWidth;
                    if (computeHorizontalScrollOffset2 * 2 > measuredWidth) {
                        recyclerView.a(measuredWidth - computeHorizontalScrollOffset2, 0);
                    } else {
                        recyclerView.a(-computeHorizontalScrollOffset2, 0);
                    }
                } else if (((b) LynxScrollView.this.mView).getMScrollDirection() == b.c.VERTICAL_BOTTOM || ((b) LynxScrollView.this.mView).getMScrollDirection() == b.c.VERTICAL_TOP) {
                    int measuredHeight = recyclerView.getMeasuredHeight();
                    int computeVerticalScrollOffset2 = recyclerView.computeVerticalScrollOffset() % measuredHeight;
                    if (computeVerticalScrollOffset2 * 2 > measuredHeight) {
                        recyclerView.a(0, measuredHeight - computeVerticalScrollOffset2);
                    } else {
                        recyclerView.a(0, -computeVerticalScrollOffset2);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.c(recyclerView, "");
            if (LynxScrollView.this.f36542c || LynxScrollView.this.f36541b) {
                int a2 = LynxScrollView.this.a();
                if (!LynxScrollView.this.f36542c || (!LynxScrollView.c(a2) || !(!LynxScrollView.c(LynxScrollView.this.f36552m)))) {
                    if (LynxScrollView.this.f36541b && (LynxScrollView.b(a2) && (!LynxScrollView.b(LynxScrollView.this.f36552m)))) {
                        if (i2 != 0) {
                            LynxScrollView lynxScrollView = LynxScrollView.this;
                            lynxScrollView.a(lynxScrollView.n, 0, LynxScrollView.this.n + i2, 0, "scrolltoupper");
                        } else if (i3 != 0) {
                            LynxScrollView lynxScrollView2 = LynxScrollView.this;
                            lynxScrollView2.a(0, lynxScrollView2.n, 0, LynxScrollView.this.n + i3, "scrolltoupper");
                        }
                    }
                } else if (i2 != 0) {
                    LynxScrollView lynxScrollView3 = LynxScrollView.this;
                    lynxScrollView3.a(lynxScrollView3.n, 0, LynxScrollView.this.n + i2, 0, "scrolltolower");
                } else if (i3 != 0) {
                    LynxScrollView lynxScrollView4 = LynxScrollView.this;
                    lynxScrollView4.a(0, lynxScrollView4.n, 0, LynxScrollView.this.n + i3, "scrolltolower");
                }
                LynxScrollView.this.f36552m = a2;
            }
            if (!LynxScrollView.this.f36543d) {
                return;
            }
            if (i2 != 0) {
                LynxScrollView lynxScrollView5 = LynxScrollView.this;
                lynxScrollView5.a(lynxScrollView5.n, 0, LynxScrollView.this.n + i2, 0, "scroll");
            } else if (i3 != 0) {
                LynxScrollView lynxScrollView6 = LynxScrollView.this;
                lynxScrollView6.a(0, lynxScrollView6.n, 0, LynxScrollView.this.n + i3, "scroll");
            }
        }
    }

    @m(a = "bounce", f = false)
    public final void setBounces(boolean z) {
        ((b) this.mView).setMEnableBounce(z);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setLowerThreshole(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.q = i2;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setUpperThreshole(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.r = i2;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(21939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            l.c(view, "");
        }
    }

    static final class f extends r {

        /* renamed from: f  reason: collision with root package name */
        private int f36560f;

        static {
            Covode.recordClassIndex(21944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private f(Context context) {
            super(context);
            l.c(context, "");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public f(Context context, int i2) {
            this(context);
            l.c(context, "");
            this.f36560f = i2;
        }

        @Override // androidx.recyclerview.widget.r
        public final int a(View view, int i2) {
            l.c(view, "");
            RecyclerView.i iVar = this.f3864i;
            if (iVar == null || !iVar.g()) {
                return 0;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                return (iVar.u() - (RecyclerView.i.p(view) - ((RecyclerView.j) layoutParams).topMargin)) + this.f36560f;
            }
            throw new w("null cannot be cast to non-null type");
        }

        @Override // androidx.recyclerview.widget.r
        public final int b(View view, int i2) {
            l.c(view, "");
            RecyclerView.i iVar = this.f3864i;
            if (iVar == null || !iVar.f()) {
                return 0;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                return (iVar.t() - (RecyclerView.i.o(view) - ((RecyclerView.j) layoutParams).leftMargin)) + this.f36560f;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxScrollView(j jVar) {
        super(jVar);
        l.c(jVar, "");
    }

    public static final /* synthetic */ RecyclerView a(LynxScrollView lynxScrollView) {
        RecyclerView recyclerView = lynxScrollView.f36546g;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        return recyclerView;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChildV2(LynxBaseUI lynxBaseUI) {
        l.c(lynxBaseUI, "");
        removeChild(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void scrollToIndex(int i2) {
        if (!a(i2, false)) {
            this.f36549j = i2;
        } else {
            this.f36549j = 0;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollLeft(int i2) {
        this.f36550k = 0;
        if (!a(i2)) {
            this.f36550k = i2;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTop(int i2) {
        this.f36550k = 0;
        if (!a(i2)) {
            this.f36550k = i2;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLynxDirection(int i2) {
        this.mLynxDirection = i2;
        if (i2 == 2) {
            RecyclerView recyclerView = this.f36546g;
            if (recyclerView == null) {
                l.a("mRecyclerView");
            }
            recyclerView.setLayoutDirection(1);
            return;
        }
        RecyclerView recyclerView2 = this.f36546g;
        if (recyclerView2 == null) {
            l.a("mRecyclerView");
        }
        recyclerView2.setLayoutDirection(0);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        l.c(lynxBaseUI, "");
        int indexOf = this.mChildren.indexOf(lynxBaseUI);
        if (this.mChildren.remove(lynxBaseUI)) {
            RecyclerView recyclerView = this.f36546g;
            if (recyclerView == null) {
                l.a("mRecyclerView");
            }
            RecyclerView.a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemRemoved(indexOf);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f36542c = map.containsKey("scrolltolower");
            this.f36541b = map.containsKey("scrolltoupper");
            this.f36543d = map.containsKey("scroll");
            this.f36540a = map.containsKey("scrolltobounce");
            this.f36544e = map.containsKey("dragend");
        }
    }

    @m(a = "layout-direction")
    public final void setLayoutDirection(String str) {
        l.c(str, "");
        if (l.a((Object) str, (Object) "ltr")) {
            RecyclerView recyclerView = this.f36546g;
            if (recyclerView == null) {
                l.a("mRecyclerView");
            }
            recyclerView.setLayoutDirection(0);
        } else if (l.a((Object) str, (Object) "rtl")) {
            RecyclerView recyclerView2 = this.f36546g;
            if (recyclerView2 == null) {
                l.a("mRecyclerView");
            }
            recyclerView2.setLayoutDirection(1);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void a(boolean z) {
        LinearLayoutManager linearLayoutManager = null;
        if (!z) {
            ((b) this.mView).setMScrollDirection(b.c.HORIZONTAL_RIGHT);
            RecyclerView recyclerView = this.f36546g;
            if (recyclerView == null) {
                l.a("mRecyclerView");
            }
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = layoutManager;
            }
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) linearLayoutManager;
            if (linearLayoutManager2 != null) {
                linearLayoutManager2.b(0);
                return;
            }
            return;
        }
        ((b) this.mView).setMScrollDirection(b.c.VERTICAL_BOTTOM);
        RecyclerView recyclerView2 = this.f36546g;
        if (recyclerView2 == null) {
            l.a("mRecyclerView");
        }
        RecyclerView.i layoutManager2 = recyclerView2.getLayoutManager();
        if (layoutManager2 instanceof LinearLayoutManager) {
            linearLayoutManager = layoutManager2;
        }
        LinearLayoutManager linearLayoutManager3 = linearLayoutManager;
        if (linearLayoutManager3 != null) {
            linearLayoutManager3.b(1);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void b(boolean z) {
        LinearLayoutManager linearLayoutManager = null;
        if (z) {
            ((b) this.mView).setMScrollDirection(b.c.HORIZONTAL_RIGHT);
            RecyclerView recyclerView = this.f36546g;
            if (recyclerView == null) {
                l.a("mRecyclerView");
            }
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = layoutManager;
            }
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) linearLayoutManager;
            if (linearLayoutManager2 != null) {
                linearLayoutManager2.b(0);
                return;
            }
            return;
        }
        ((b) this.mView).setMScrollDirection(b.c.VERTICAL_BOTTOM);
        RecyclerView recyclerView2 = this.f36546g;
        if (recyclerView2 == null) {
            l.a("mRecyclerView");
        }
        RecyclerView.i layoutManager2 = recyclerView2.getLayoutManager();
        if (layoutManager2 instanceof LinearLayoutManager) {
            linearLayoutManager = layoutManager2;
        }
        LinearLayoutManager linearLayoutManager3 = linearLayoutManager;
        if (linearLayoutManager3 != null) {
            linearLayoutManager3.b(1);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        l.c(context, "");
        b bVar = new b(context);
        bVar.setOnScrollToEndListener(new g(this, context));
        bVar.setMScrollDirection(b.c.VERTICAL_BOTTOM);
        h hVar = new h(context, this, context);
        hVar.setAdapter(new b());
        hVar.setLayoutDirection(0);
        e eVar = new e(this, context);
        eVar.b(1);
        hVar.setLayoutManager(eVar);
        hVar.a(new d());
        this.f36546g = hVar;
        bVar.setMContentView(hVar);
        RecyclerView recyclerView = this.f36546g;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        recyclerView.setClipChildren(false);
        RecyclerView recyclerView2 = this.f36546g;
        if (recyclerView2 == null) {
            l.a("mRecyclerView");
        }
        i iVar = new i();
        this.f36548i = iVar;
        l.c(recyclerView2, "");
        recyclerView2.a(iVar.f37083b);
        l.c(recyclerView2, "");
        iVar.f37082a = new i.b(recyclerView2, iVar);
        ViewTreeObserver viewTreeObserver = recyclerView2.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnScrollChangedListener(iVar.f37082a);
        }
        bVar.setClipChildren(false);
        return bVar;
    }

    @m(a = "scroll-to-id")
    public final void scrollToId(String str) {
        l.c(str, "");
        List list = this.mChildren;
        l.a((Object) list, "");
        for (Object obj : list) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) obj;
            l.a((Object) lynxBaseUI, "");
            if (l.a((Object) lynxBaseUI.mName, (Object) str)) {
                if (obj != null) {
                    int indexOf = this.mChildren.indexOf(obj);
                    RecyclerView recyclerView = this.f36546g;
                    if (recyclerView == null) {
                        l.a("mRecyclerView");
                    }
                    if (recyclerView.getAdapter() != null) {
                        RecyclerView recyclerView2 = this.f36546g;
                        if (recyclerView2 == null) {
                            l.a("mRecyclerView");
                        }
                        RecyclerView.a adapter = recyclerView2.getAdapter();
                        if (adapter == null) {
                            l.a();
                        }
                        l.a((Object) adapter, "");
                        if (adapter.getItemCount() > indexOf) {
                            RecyclerView recyclerView3 = this.f36546g;
                            if (recyclerView3 == null) {
                                l.a("mRecyclerView");
                            }
                            recyclerView3.d(indexOf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollBarEnable(boolean z) {
        if (((b) this.mView).getMScrollDirection() == b.c.VERTICAL_BOTTOM || ((b) this.mView).getMScrollDirection() == b.c.VERTICAL_TOP) {
            RecyclerView recyclerView = this.f36546g;
            if (recyclerView == null) {
                l.a("mRecyclerView");
            }
            recyclerView.setVerticalScrollBarEnabled(z);
        } else if (((b) this.mView).getMScrollDirection() == b.c.HORIZONTAL_LEFT || ((b) this.mView).getMScrollDirection() == b.c.HORIZONTAL_RIGHT) {
            RecyclerView recyclerView2 = this.f36546g;
            if (recyclerView2 == null) {
                l.a("mRecyclerView");
            }
            recyclerView2.setHorizontalScrollBarEnabled(z);
        }
    }

    public final boolean a(int i2) {
        RecyclerView recyclerView = this.f36546g;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        int computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        RecyclerView recyclerView2 = this.f36546g;
        if (recyclerView2 == null) {
            l.a("mRecyclerView");
        }
        int computeVerticalScrollRange = recyclerView2.computeVerticalScrollRange();
        if (computeHorizontalScrollRange > 0) {
            RecyclerView recyclerView3 = this.f36546g;
            if (recyclerView3 == null) {
                l.a("mRecyclerView");
            }
            int computeHorizontalScrollOffset = i2 - recyclerView3.computeHorizontalScrollOffset();
            RecyclerView recyclerView4 = this.f36546g;
            if (recyclerView4 == null) {
                l.a("mRecyclerView");
            }
            recyclerView4.scrollBy(computeHorizontalScrollOffset, 0);
            return true;
        } else if (computeVerticalScrollRange <= 0) {
            return false;
        } else {
            RecyclerView recyclerView5 = this.f36546g;
            if (recyclerView5 == null) {
                l.a("mRecyclerView");
            }
            int computeVerticalScrollOffset = i2 - recyclerView5.computeVerticalScrollOffset();
            RecyclerView recyclerView6 = this.f36546g;
            if (recyclerView6 == null) {
                l.a("mRecyclerView");
            }
            recyclerView6.scrollBy(0, computeVerticalScrollOffset);
            return true;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChildV2(LynxBaseUI lynxBaseUI, int i2) {
        l.c(lynxBaseUI, "");
        insertChild(lynxBaseUI, i2);
    }

    @p
    public final void scrollToIndex(ReadableMap readableMap, Callback callback) {
        l.c(readableMap, "");
        l.c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        try {
            if (a(readableMap.getInt("index", 0), readableMap.getBoolean("smooth", false))) {
                callback.invoke(0, javaOnlyMap);
                return;
            }
            callback.invoke(1, javaOnlyMap);
        } catch (Throwable th) {
            javaOnlyMap.put("error", th.getMessage());
            callback.invoke(4, javaOnlyMap);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void insertChild(LynxBaseUI lynxBaseUI, int i2) {
        l.c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxBounceView) {
            LynxBounceView lynxBounceView = (LynxBounceView) lynxBaseUI;
            String str = lynxBounceView.f36522a;
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        ((b) this.mView).setMScrollDirection(b.c.VERTICAL_BOTTOM);
                        break;
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        ((b) this.mView).setMScrollDirection(b.c.VERTICAL_TOP);
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        ((b) this.mView).setMScrollDirection(b.c.HORIZONTAL_LEFT);
                        break;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        ((b) this.mView).setMScrollDirection(b.c.HORIZONTAL_RIGHT);
                        break;
                    }
                    break;
            }
            this.s = lynxBounceView;
            ((b) this.mView).setMBounceView((com.lynx.tasm.behavior.ui.view.a) lynxBounceView.mView);
        } else if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.add(i2, lynxBaseUI);
            RecyclerView recyclerView = this.f36546g;
            if (recyclerView == null) {
                l.a("mRecyclerView");
            }
            RecyclerView.a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemInserted(i2);
            }
        }
        lynxBaseUI.setParent(this);
    }

    public final boolean a(int i2, boolean z) {
        if (i2 < 0) {
            return false;
        }
        RecyclerView recyclerView = this.f36546g;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        if (recyclerView.getAdapter() == null) {
            return false;
        }
        RecyclerView recyclerView2 = this.f36546g;
        if (recyclerView2 == null) {
            l.a("mRecyclerView");
        }
        RecyclerView.a adapter = recyclerView2.getAdapter();
        if (adapter == null) {
            l.a();
        }
        l.a((Object) adapter, "");
        if (adapter.getItemCount() <= i2) {
            return false;
        }
        if (z) {
            RecyclerView recyclerView3 = this.f36546g;
            if (recyclerView3 == null) {
                l.a("mRecyclerView");
            }
            recyclerView3.d(i2);
            return true;
        }
        RecyclerView recyclerView4 = this.f36546g;
        if (recyclerView4 == null) {
            l.a("mRecyclerView");
        }
        RecyclerView.i layoutManager = recyclerView4.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager == null) {
            return true;
        }
        linearLayoutManager.a(i2, 0);
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
        l.c(lynxBaseUI, "");
        l.c(str, "");
        l.c(str2, "");
        a(lynxBaseUI, z, str, str2, 0);
    }

    public final void a(int i2, int i3, int i4, int i5, String str) {
        com.lynx.tasm.c cVar;
        l.c(str, "");
        com.lynx.tasm.c.h a2 = com.lynx.tasm.c.h.a(getSign(), str);
        RecyclerView recyclerView = this.f36546g;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        RecyclerView recyclerView2 = this.f36546g;
        if (recyclerView2 == null) {
            l.a("mRecyclerView");
        }
        a2.a(i2, i3, computeVerticalScrollOffset, recyclerView2.computeHorizontalScrollOffset(), i4 - i2, i5 - i3);
        j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f55897e) != null) {
            cVar.a(a2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.lynx.tasm.behavior.ui.LynxBaseUI r11, boolean r12, java.lang.String r13, java.lang.String r14, int r15) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.LynxScrollView.a(com.lynx.tasm.behavior.ui.LynxBaseUI, boolean, java.lang.String, java.lang.String, int):void");
    }
}
