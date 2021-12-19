package com.ss.android.ugc.aweme.ecommerce.semipdp.a;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.track.d;
import com.ss.android.ugc.aweme.ecommerce.util.h;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public final class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public float f87277a = ((float) (h.f87567a / 3));

    /* renamed from: b  reason: collision with root package name */
    public boolean f87278b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f87279c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f87280d;

    /* renamed from: e  reason: collision with root package name */
    public final h.f.a.a<z> f87281e;

    /* renamed from: f  reason: collision with root package name */
    public final h.f.a.a<z> f87282f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f87283g;

    static {
        Covode.recordClassIndex(54785);
    }

    public final View a(int i2) {
        if (this.f87283g == null) {
            this.f87283g = new SparseArray();
        }
        View view = (View) this.f87283g.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f87283g.put(i2, findViewById);
        return findViewById;
    }

    public final boolean getShowedCartEntry() {
        return this.f87280d;
    }

    public final void setShowedCartEntry(boolean z) {
        this.f87280d = z;
    }

    public static final class a extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87284a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f87285b;

        static {
            Covode.recordClassIndex(54786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            super(700);
            this.f87285b = bVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            h.f.a.a<z> aVar;
            if (view != null && (aVar = this.f87285b.f87281e) != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a.b$b  reason: collision with other inner class name */
    public static final class C2106b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87286a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f87287b;

        static {
            Covode.recordClassIndex(54787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2106b(b bVar) {
            super(700);
            this.f87287b = bVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            h.f.a.a<z> aVar;
            if (view != null && (aVar = this.f87287b.f87282f) != null) {
                aVar.invoke();
            }
        }
    }

    public static final class c extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87288a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SemiPdpStarter.SemiPdpEnterParams f87289b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f87290c;

        static {
            Covode.recordClassIndex(54788);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            HashMap<String, Object> hashMap;
            if (view != null) {
                SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.f87289b;
                HashMap hashMap2 = new HashMap();
                if (semiPdpEnterParams == null || (hashMap = semiPdpEnterParams.getTrackParams()) == null) {
                    hashMap = new HashMap<>();
                }
                hashMap2.putAll(hashMap);
                hashMap2.put("page_name", "semi_product_detail");
                d.a("tiktokec_cart_entrance_click", hashMap2);
                h.f.a.a aVar = this.f87290c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, h.f.a.a aVar) {
            super(700);
            this.f87289b = semiPdpEnterParams;
            this.f87290c = aVar;
        }
    }

    public final void setSpecialIllegalState(boolean z) {
        this.f87278b = z;
        int i2 = 8;
        if (z) {
            TuxIconView tuxIconView = (TuxIconView) a(R.id.co2);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(8);
            ((TuxIconView) a(R.id.a7u)).setTintColor(androidx.core.content.b.c(getContext(), R.color.bx));
            return;
        }
        TuxIconView tuxIconView2 = (TuxIconView) a(R.id.co2);
        l.b(tuxIconView2, "");
        if (this.f87279c) {
            i2 = 0;
        }
        tuxIconView2.setVisibility(i2);
        ((TuxIconView) a(R.id.a7u)).setTintColor(androidx.core.content.b.c(getContext(), R.color.a9));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, h.f.a.a<z> aVar, h.f.a.a<z> aVar2) {
        super(context);
        l.d(context, "");
        MethodCollector.i(3550);
        this.f87281e = aVar;
        this.f87282f = aVar2;
        com.a.a(LayoutInflater.from(context), R.layout.pp, this, true);
        TuxIconView tuxIconView = (TuxIconView) a(R.id.a7u);
        l.b(tuxIconView, "");
        tuxIconView.setOnClickListener(new a(this));
        TuxIconView tuxIconView2 = (TuxIconView) a(R.id.co2);
        l.b(tuxIconView2, "");
        tuxIconView2.setOnClickListener(new C2106b(this));
        int e2 = n.e(context);
        ((ConstraintLayout) a(R.id.bf_)).setPadding(getPaddingLeft(), e2, getPaddingRight(), getPaddingBottom());
        View a2 = a(R.id.bf9);
        l.b(a2, "");
        a2.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (((float) e2) + n.b(context, 44.0f))));
        MethodCollector.o(3550);
    }
}
