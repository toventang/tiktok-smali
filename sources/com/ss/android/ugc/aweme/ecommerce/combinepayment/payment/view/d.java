package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.h.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.h.i;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.zhiliaoapp.musically.R;
import h.a.af;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class d extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f85476a;

    /* renamed from: b  reason: collision with root package name */
    private final int f85477b;

    /* renamed from: c  reason: collision with root package name */
    private final int f85478c;

    /* renamed from: d  reason: collision with root package name */
    private final e f85479d;

    /* renamed from: e  reason: collision with root package name */
    private final View f85480e;

    /* renamed from: f  reason: collision with root package name */
    private PaymentViewModel f85481f;

    /* renamed from: g  reason: collision with root package name */
    private h.f.a.b<? super String, z> f85482g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f85483h;

    /* renamed from: i  reason: collision with root package name */
    private o f85484i;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f85485j;

    static {
        Covode.recordClassIndex(53481);
    }

    public final View a(int i2) {
        if (this.f85485j == null) {
            this.f85485j = new SparseArray();
        }
        View view = (View) this.f85485j.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f85485j.put(i2, findViewById);
        return findViewById;
    }

    public final e getCircleOption() {
        return this.f85479d;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.String, h.z>, h.f.a.b<java.lang.String, h.z> */
    public final h.f.a.b<String, z> getOnCheckedListener() {
        return this.f85482g;
    }

    public final o getPaymentMethod() {
        return this.f85484i;
    }

    public final PaymentViewModel getPaymentViewModel() {
        return this.f85481f;
    }

    private final List<String> getAllCardIcons() {
        List<o> list;
        o oVar = this.f85484i;
        if (oVar == null || (list = oVar.f85341h) == null) {
            return h.a.z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().f85338e;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f85488a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f85489b;

        static {
            Covode.recordClassIndex(53484);
        }

        b(String str, d dVar) {
            this.f85488a = str;
            this.f85489b = dVar;
        }

        public final void run() {
            TuxTextView tuxTextView = (TuxTextView) this.f85489b.a(R.id.ak7);
            l.b(tuxTextView, "");
            TextPaint paint = tuxTextView.getPaint();
            l.b(paint, "");
            TuxTextView tuxTextView2 = (TuxTextView) this.f85489b.a(R.id.ak7);
            l.b(tuxTextView2, "");
            paint.setTextSize(tuxTextView2.getTextSize());
            float measureText = paint.measureText(this.f85488a);
            TuxTextView tuxTextView3 = (TuxTextView) this.f85489b.a(R.id.ak7);
            l.b(tuxTextView3, "");
            if (measureText > ((float) tuxTextView3.getWidth())) {
                TuxTextView tuxTextView4 = (TuxTextView) this.f85489b.a(R.id.ak7);
                l.b(tuxTextView4, "");
                tuxTextView4.setVisibility(8);
                this.f85489b.a(this.f85488a);
            }
        }
    }

    static final class a extends m implements h.f.a.b<String, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f85487a = new a();

        static {
            Covode.recordClassIndex(53483);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(String str) {
            return z.f158842a;
        }
    }

    public final void setPaymentViewModel(PaymentViewModel paymentViewModel) {
        this.f85481f = paymentViewModel;
    }

    public final void setOnCheckedListener(h.f.a.b<? super String, z> bVar) {
        l.d(bVar, "");
        this.f85482g = bVar;
    }

    public final void a(String str) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.edc);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.edc);
        l.b(tuxTextView2, "");
        tuxTextView2.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(5042);
        this.f85476a = (int) n.b(context, 4.0f);
        this.f85477b = (int) n.b(context, 22.0f);
        this.f85478c = (int) n.b(context, 14.0f);
        e.a aVar = new e.a();
        aVar.f39831e = n.b(context, 2.0f);
        this.f85479d = aVar.a();
        this.f85482g = a.f85487a;
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        setBackgroundColor(androidx.core.content.b.c(context, R.color.r));
        View inflate = View.inflate(context, R.layout.pe, this);
        l.b(inflate, "");
        this.f85480e = inflate;
        inflate.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f85486a;

            static {
                Covode.recordClassIndex(53482);
            }

            {
                this.f85486a = r1;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                h.f.a.b<String, z> onCheckedListener = this.f85486a.getOnCheckedListener();
                o paymentMethod = this.f85486a.getPaymentMethod();
                if (paymentMethod != null) {
                    str = paymentMethod.f85334a;
                } else {
                    str = null;
                }
                onCheckedListener.invoke(str);
            }
        });
        v.a(a(R.id.dgn), (Drawable) null);
        MethodCollector.o(5042);
    }

    public final void setChecked(boolean z) {
        int i2;
        MethodCollector.i(5016);
        this.f85483h = z;
        TuxRadio tuxRadio = (TuxRadio) a(R.id.dgn);
        l.b(tuxRadio, "");
        tuxRadio.setChecked(z);
        o oVar = this.f85484i;
        if (!l.a((Object) (oVar != null ? oVar.f85334a : null), (Object) "pm_pi_ccdc_all") || !z) {
            ((LinearLayout) a(R.id.a2l)).removeAllViews();
            MethodCollector.o(5016);
            return;
        }
        List<String> allCardIcons = getAllCardIcons();
        ViewGroup viewGroup = (ViewGroup) a(R.id.a2l);
        viewGroup.removeAllViews();
        if (allCardIcons.size() > 6) {
            allCardIcons = allCardIcons.subList(0, 6);
        }
        l.b(viewGroup, "");
        int size = allCardIcons.size();
        for (int childCount = viewGroup.getChildCount(); childCount < size; childCount++) {
            SmartImageView smartImageView = new SmartImageView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f85477b, this.f85478c);
            layoutParams.weight = 1.0f;
            smartImageView.setLayoutParams(layoutParams);
            smartImageView.setBackgroundResource(R.drawable.xu);
            viewGroup.addView(smartImageView);
        }
        int childCount2 = viewGroup.getChildCount();
        for (int size2 = allCardIcons.size(); size2 < childCount2; size2++) {
            View childAt = viewGroup.getChildAt(size2);
            if (childAt != null) {
                childAt.setVisibility(8);
            }
        }
        Iterator it = h.a.n.a((Collection<?>) allCardIcons).iterator();
        while (it.hasNext()) {
            int a2 = ((af) it).a();
            View childAt2 = viewGroup.getChildAt(a2);
            if (childAt2 != null && (childAt2 instanceof SmartImageView)) {
                if (a2 != h.a.n.a((List) allCardIcons)) {
                    i2 = this.f85476a;
                } else {
                    i2 = 0;
                }
                i.b(childAt2, null, null, Integer.valueOf(i2), null, false, 27);
                String str = allCardIcons.get(a2);
                String str2 = str;
                if (str2 == null || str2.length() == 0) {
                    str = null;
                }
                String str3 = str;
                if (str3 == null) {
                    str3 = " ";
                }
                com.bytedance.lighten.a.v a3 = r.a(str3);
                a3.f39916l = R.color.v;
                a3.v = w.FIT_XY;
                a3.F = (ImageView) childAt2;
                a3.c();
                ((SmartImageView) childAt2).setCircleOptions(this.f85479d);
            }
        }
        MethodCollector.o(5016);
    }

    public final void setPaymentMethod(o oVar) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a aVar;
        this.f85484i = oVar;
        Boolean bool2 = null;
        if (oVar != null) {
            str = oVar.f85338e;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0 || str == null) {
            str = " ";
        }
        com.bytedance.lighten.a.v a2 = r.a(str);
        a2.f39916l = R.color.v;
        a2.F = (ImageView) this.f85480e.findViewById(R.id.d2k);
        a2.c();
        e.a aVar2 = new e.a();
        aVar2.f39831e = n.b(getContext(), 2.0f);
        ((SmartImageView) this.f85480e.findViewById(R.id.d2k)).setCircleOptions(aVar2.a());
        TuxTextView tuxTextView = (TuxTextView) this.f85480e.findViewById(R.id.d2l);
        l.b(tuxTextView, "");
        o oVar2 = this.f85484i;
        if (oVar2 != null) {
            str2 = oVar2.f85335b;
        } else {
            str2 = null;
        }
        tuxTextView.setText(str2);
        ((TuxTextView) this.f85480e.findViewById(R.id.d2l)).setTextColor(androidx.core.content.b.c(getContext(), R.color.bx));
        SmartImageView smartImageView = (SmartImageView) this.f85480e.findViewById(R.id.d2k);
        l.b(smartImageView, "");
        smartImageView.setAlpha(1.0f);
        o oVar3 = this.f85484i;
        if (!(oVar3 == null || (aVar = oVar3.t) == null || !l.a((Object) false, (Object) aVar.f85272a))) {
            ((TuxTextView) this.f85480e.findViewById(R.id.d2l)).setTextColor(androidx.core.content.b.c(getContext(), R.color.bz));
            SmartImageView smartImageView2 = (SmartImageView) this.f85480e.findViewById(R.id.d2k);
            l.b(smartImageView2, "");
            smartImageView2.setAlpha(0.3f);
        }
        o oVar4 = this.f85484i;
        if (oVar4 != null) {
            bool = oVar4.o;
        } else {
            bool = null;
        }
        if (l.a((Object) bool, (Object) true)) {
            ((TuxTextView) a(R.id.ak7)).setBackgroundResource(R.drawable.xj);
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.ak7);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(getContext().getString(R.string.biw));
            ((TuxTextView) a(R.id.ak7)).setTextColor(androidx.core.content.b.c(getContext(), R.color.c5));
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.ak7);
            l.b(tuxTextView3, "");
            tuxTextView3.setVisibility(0);
        } else {
            TuxTextView tuxTextView4 = (TuxTextView) a(R.id.ak7);
            l.b(tuxTextView4, "");
            tuxTextView4.setVisibility(8);
        }
        o oVar5 = this.f85484i;
        if (oVar5 == null || (str3 = oVar5.f85345l) == null || str3.length() <= 0) {
            TuxTextView tuxTextView5 = (TuxTextView) a(R.id.edc);
            l.b(tuxTextView5, "");
            tuxTextView5.setVisibility(8);
            return;
        }
        o oVar6 = this.f85484i;
        if (oVar6 != null) {
            bool2 = oVar6.o;
        }
        if (l.a((Object) bool2, (Object) true)) {
            a(str3);
            return;
        }
        TuxTextView tuxTextView6 = (TuxTextView) a(R.id.ak7);
        l.b(tuxTextView6, "");
        tuxTextView6.setVisibility(0);
        ((TuxTextView) a(R.id.ak7)).setBackgroundResource(R.drawable.xx);
        ((TuxTextView) a(R.id.ak7)).setTextColor(androidx.core.content.b.c(getContext(), R.color.bh));
        TuxTextView tuxTextView7 = (TuxTextView) a(R.id.ak7);
        l.b(tuxTextView7, "");
        tuxTextView7.setText(str3);
        ((TuxTextView) a(R.id.ak7)).post(new b(str3, this));
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }
}
