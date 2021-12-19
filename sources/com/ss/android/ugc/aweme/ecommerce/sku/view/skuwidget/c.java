package com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.c.k;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.util.g;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public static final a f87473f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    List<com.ss.android.ugc.aweme.ecommerce.sku.model.a.a> f87474a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ecommerce.sku.model.a.a f87475b;

    /* renamed from: c  reason: collision with root package name */
    final int f87476c = 1;

    /* renamed from: d  reason: collision with root package name */
    public int f87477d = -1;

    /* renamed from: e  reason: collision with root package name */
    public b f87478e;

    /* renamed from: g  reason: collision with root package name */
    private final int f87479g;

    /* renamed from: h  reason: collision with root package name */
    private final int f87480h;

    /* renamed from: i  reason: collision with root package name */
    private final int f87481i;

    /* renamed from: j  reason: collision with root package name */
    private final int f87482j = a(8.0f);

    /* renamed from: k  reason: collision with root package name */
    private final int f87483k = a(7.0f);

    /* renamed from: l  reason: collision with root package name */
    private final int f87484l = a(11.0f);

    /* renamed from: m  reason: collision with root package name */
    private final int f87485m;
    private String n;
    private final SparseArray<List<View>> o = new SparseArray<>();
    private final ArrayList<Integer> p = new ArrayList<>();
    private com.bytedance.lighten.a.e q;
    private final com.bytedance.lighten.a.e r;
    private int s;
    private boolean t;
    private Drawable u;
    private Drawable v;

    public interface b {
        static {
            Covode.recordClassIndex(54975);
        }

        void a(int i2, com.ss.android.ugc.aweme.ecommerce.sku.model.a.a aVar);
    }

    static {
        Covode.recordClassIndex(54973);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54974);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f87489a;

        static {
            Covode.recordClassIndex(54978);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.c.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f87490a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ e f87491b;

                static {
                    Covode.recordClassIndex(54979);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f87490a < this.f87491b.f87489a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f87491b.f87489a;
                    int i2 = this.f87490a;
                    this.f87490a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f87491b = r1;
                }
            };
        }

        public e(ViewGroup viewGroup) {
            this.f87489a = viewGroup;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.c$c  reason: collision with other inner class name */
    public static final class C2112c implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.preloader.c f87486a;

        static {
            Covode.recordClassIndex(54976);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, o oVar) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, Throwable th) {
        }

        C2112c(com.ss.android.ugc.aweme.ecommerce.preloader.c cVar) {
            this.f87486a = cVar;
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, Throwable th) {
            this.f87486a.a(th);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, o oVar, Animatable animatable) {
            this.f87486a.a(oVar);
        }
    }

    public final void setCheckedViewInfo(com.ss.android.ugc.aweme.ecommerce.sku.model.a.a aVar) {
        l.d(aVar, "");
        this.f87475b = aVar;
    }

    public final void setOnItemCheckedListener(b bVar) {
        l.d(bVar, "");
        this.f87478e = bVar;
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private final int a(float f2) {
        Context context = getContext();
        l.b(context, "");
        return (int) n.b(a(context), f2);
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f87487a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.sku.model.a.a f87488b;

        static {
            Covode.recordClassIndex(54977);
        }

        d(c cVar, com.ss.android.ugc.aweme.ecommerce.sku.model.a.a aVar) {
            this.f87487a = cVar;
            this.f87488b = aVar;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.ecommerce.sku.model.a.a aVar;
            ClickAgent.onClick(view);
            if (this.f87488b.f87404a) {
                c cVar = this.f87487a;
                if (l.a(cVar.f87475b, this.f87488b)) {
                    aVar = null;
                } else {
                    aVar = this.f87488b;
                }
                cVar.f87475b = aVar;
                c cVar2 = this.f87487a;
                int childCount = cVar2.getChildCount();
                for (int i2 = cVar2.f87476c; i2 < childCount; i2++) {
                    View childAt = cVar2.getChildAt(i2);
                    int i3 = i2 - cVar2.f87476c;
                    List<com.ss.android.ugc.aweme.ecommerce.sku.model.a.a> list = cVar2.f87474a;
                    if (list == null) {
                        l.a("itemViewInfoList");
                    }
                    if (i3 < list.size()) {
                        List<com.ss.android.ugc.aweme.ecommerce.sku.model.a.a> list2 = cVar2.f87474a;
                        if (list2 == null) {
                            l.a("itemViewInfoList");
                        }
                        l.b(childAt, "");
                        cVar2.a(childAt, list2.get(i3));
                    }
                }
                b bVar = this.f87487a.f87478e;
                if (bVar != null) {
                    bVar.a(this.f87487a.f87477d, this.f87487a.f87475b);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(4744);
        this.f87485m = androidx.core.content.b.c(context, R.color.c5);
        this.f87480h = a(8.0f);
        this.f87481i = a(12.0f);
        this.f87479g = a(8.0f);
        e.a aVar = new e.a();
        aVar.f39828b = n.b(context, 0.5f);
        aVar.f39831e = n.b(context, 2.0f);
        aVar.f39829c = androidx.core.content.b.c(context, R.color.b6);
        com.bytedance.lighten.a.e a2 = aVar.a();
        l.b(a2, "");
        this.q = a2;
        e.a aVar2 = new e.a();
        aVar2.f39828b = n.b(context, 1.0f);
        aVar2.f39831e = n.b(context, 2.0f);
        aVar2.f39829c = androidx.core.content.b.c(context, R.color.bh);
        com.bytedance.lighten.a.e a3 = aVar2.a();
        l.b(a3, "");
        this.r = a3;
        this.s = a(56.0f);
        this.t = gb.a();
        this.u = androidx.core.content.b.a(context, (int) R.drawable.zn);
        this.v = androidx.core.content.b.a(context, (int) R.drawable.zo);
        MethodCollector.o(4744);
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, com.ss.android.ugc.aweme.ecommerce.sku.model.a.a aVar) {
        if (view instanceof TuxTextView) {
            a((TuxTextView) view, aVar);
        }
        if (view instanceof ViewGroup) {
            a((ViewGroup) view, aVar);
        }
    }

    private final void a(TuxTextView tuxTextView, com.ss.android.ugc.aweme.ecommerce.sku.model.a.a aVar) {
        if (!aVar.f87404a) {
            tuxTextView.setBackgroundResource(R.drawable.y6);
            tuxTextView.setTextColor(androidx.core.content.b.c(getContext(), R.color.bz));
            return;
        }
        com.ss.android.ugc.aweme.ecommerce.sku.model.a.a aVar2 = this.f87475b;
        if (aVar2 == null || !l.a(aVar2, aVar)) {
            tuxTextView.setBackgroundResource(R.drawable.y6);
            tuxTextView.setTextColor(androidx.core.content.b.c(getContext(), R.color.bx));
            return;
        }
        tuxTextView.setTextColor(androidx.core.content.b.c(getContext(), R.color.bh));
        tuxTextView.setBackgroundResource(R.drawable.y5);
    }

    private final void a(ViewGroup viewGroup, com.ss.android.ugc.aweme.ecommerce.sku.model.a.a aVar) {
        SmartImageView smartImageView = null;
        TuxTextView tuxTextView = null;
        for (View view : new e(viewGroup)) {
            if (view instanceof SmartImageView) {
                smartImageView = (SmartImageView) view;
            } else if (view instanceof TuxTextView) {
                tuxTextView = (TuxTextView) view;
            }
        }
        if (!aVar.f87404a) {
            viewGroup.setBackgroundResource(R.drawable.y6);
            if (smartImageView != null) {
                smartImageView.setAlpha(0.34f);
            }
            if (tuxTextView != null) {
                tuxTextView.setTextColor(androidx.core.content.b.c(getContext(), R.color.bz));
                return;
            }
            return;
        }
        if (smartImageView != null) {
            smartImageView.setAlpha(1.0f);
            smartImageView.setCircleOptions(this.q);
            smartImageView.setPlaceholderImage(this.u);
        }
        com.ss.android.ugc.aweme.ecommerce.sku.model.a.a aVar2 = this.f87475b;
        if (aVar2 == null || !l.a(aVar2, aVar)) {
            if (tuxTextView != null) {
                tuxTextView.setTextColor(androidx.core.content.b.c(getContext(), R.color.bx));
            }
            viewGroup.setBackgroundResource(R.drawable.y6);
            return;
        }
        if (tuxTextView != null) {
            tuxTextView.setTextColor(androidx.core.content.b.c(getContext(), R.color.bh));
        }
        viewGroup.setBackgroundResource(R.drawable.y5);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r16, int r17) {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.c.onMeasure(int, int):void");
    }

    public final void a(String str, List<com.ss.android.ugc.aweme.ecommerce.sku.model.a.a> list, int i2) {
        View tuxTextView;
        SmartImageView smartImageView;
        TuxTextView tuxTextView2;
        com.bytedance.lighten.a.a.a aVar;
        int i3 = 4664;
        MethodCollector.i(4664);
        if (getContext() == null || list.isEmpty() || str == null) {
            MethodCollector.o(4664);
            return;
        }
        this.f87474a = list;
        this.f87477d = i2;
        this.n = str;
        Context context = getContext();
        l.b(context, "");
        TuxTextView tuxTextView3 = new TuxTextView(context, null, 0, 6);
        tuxTextView3.setTextColor(this.f87485m);
        tuxTextView3.setTuxFont(62);
        tuxTextView3.setText(str);
        tuxTextView3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(tuxTextView3);
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            com.ss.android.ugc.aweme.ecommerce.sku.model.a.a aVar2 = list.get(i4);
            if (aVar2.f87407d == null) {
                Context context2 = getContext();
                l.b(context2, "");
                tuxTextView = new TuxTextView(context2, null, 0, 6);
                ((TuxTextView) tuxTextView).setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                smartImageView = null;
                tuxTextView2 = null;
            } else if (list.size() <= 6) {
                tuxTextView = LayoutInflater.from(getContext()).inflate(R.layout.qv, (ViewGroup) null);
                smartImageView = (SmartImageView) tuxTextView.findViewById(R.id.e56);
                tuxTextView2 = (TuxTextView) tuxTextView.findViewById(R.id.e58);
                l.b(tuxTextView, "");
                tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(a(100.0f), a(127.0f)));
            } else {
                tuxTextView = LayoutInflater.from(getContext()).inflate(R.layout.qu, (ViewGroup) null);
                smartImageView = (SmartImageView) tuxTextView.findViewById(R.id.e55);
                tuxTextView2 = (TuxTextView) tuxTextView.findViewById(R.id.e57);
                l.b(tuxTextView, "");
                tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            }
            if (tuxTextView instanceof ViewGroup) {
                com.ss.android.ugc.aweme.ecommerce.preloader.c cVar = new com.ss.android.ugc.aweme.ecommerce.preloader.c();
                cVar.a("sku_detail");
                cVar.a(i4);
                Image image = aVar2.f87407d;
                if (image != null) {
                    aVar = image.toThumbFirstImageUrlModel();
                } else {
                    aVar = null;
                }
                cVar.a(aVar);
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(aVar2.f87406c);
                }
                v a2 = g.a(aVar2.f87407d);
                a2.w = this.q;
                a2.v = w.CENTER_CROP;
                v a3 = a2.a("SpecLayout");
                a3.E = smartImageView;
                a3.a(new C2112c(cVar));
            } else if (tuxTextView instanceof TuxTextView) {
                TuxTextView tuxTextView4 = (TuxTextView) tuxTextView;
                tuxTextView4.setIncludeFontPadding(false);
                tuxTextView4.setTuxFont(61);
                int i5 = this.f87481i;
                tuxTextView.setPadding(i5, this.f87482j, i5, this.f87483k);
                tuxTextView4.setText(aVar2.f87406c);
                tuxTextView4.setMaxLines(2);
            }
            addView(tuxTextView);
            a(tuxTextView, aVar2);
            tuxTextView.setOnClickListener(new d(this, aVar2));
            i4++;
            i3 = 4664;
        }
        MethodCollector.o(i3);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int intValue;
        int i6;
        MethodCollector.i(4712);
        super.onLayout(z, i2, i3, i4, i5);
        if (getChildCount() == 0) {
            MethodCollector.o(4712);
            return;
        }
        View childAt = getChildAt(0);
        l.b(childAt, "");
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        if (!this.t) {
            childAt.layout(0, 0, measuredWidth, measuredHeight);
        } else {
            childAt.layout(getMeasuredWidth() - measuredWidth, 0, getMeasuredWidth(), measuredHeight);
        }
        int size = this.o.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            List<View> list = this.o.get(i8);
            int size2 = list.size();
            if (i8 == 0) {
                intValue = this.f87484l + measuredHeight;
            } else {
                intValue = this.p.get(i8 - 1).intValue() + this.f87479g;
            }
            i7 += intValue;
            int i9 = 0;
            for (int i10 = 0; i10 < size2; i10++) {
                View view = list.get(i10);
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i10 > 0) {
                    i6 = (this.f87480h * i10) + i9;
                } else {
                    i6 = 0;
                }
                if (!this.t) {
                    view.layout(i6, i7, measuredWidth2 + i6, measuredHeight2 + i7);
                } else {
                    view.layout((getMeasuredWidth() - measuredWidth2) - i6, i7, getMeasuredWidth() - i6, measuredHeight2 + i7);
                }
                i9 += measuredWidth2;
            }
        }
        MethodCollector.o(4712);
    }
}
