package com.ss.android.ugc.aweme.ecommerce.semipdp.a;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<z> f87270a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<z> f87271b;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f87272c;

    static {
        Covode.recordClassIndex(54782);
    }

    public final View a(int i2) {
        if (this.f87272c == null) {
            this.f87272c = new SparseArray();
        }
        View view = (View) this.f87272c.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f87272c.put(i2, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a.a$a  reason: collision with other inner class name */
    public static final class C2105a extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87273a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f87274b;

        static {
            Covode.recordClassIndex(54783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2105a(a aVar) {
            super(700);
            this.f87274b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            h.f.a.a<z> aVar;
            if (view != null && (aVar = this.f87274b.f87271b) != null) {
                aVar.invoke();
            }
        }
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87275a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f87276b;

        static {
            Covode.recordClassIndex(54784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(700);
            this.f87276b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            h.f.a.a<z> aVar;
            if (view != null && (aVar = this.f87276b.f87270a) != null) {
                aVar.invoke();
            }
        }
    }

    public final void setBottomText(String str) {
        l.d(str, "");
        TuxButton tuxButton = (TuxButton) a(R.id.a1d);
        l.b(tuxButton, "");
        tuxButton.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, h.f.a.a<z> aVar, h.f.a.a<z> aVar2) {
        super(context);
        l.d(context, "");
        MethodCollector.i(4349);
        this.f87270a = aVar;
        this.f87271b = aVar2;
        com.a.a(LayoutInflater.from(context), R.layout.o7, this, true);
        TuxButton tuxButton = (TuxButton) a(R.id.a1d);
        l.b(tuxButton, "");
        tuxButton.setOnClickListener(new C2105a(this));
        TuxIconView tuxIconView = (TuxIconView) a(R.id.dyd);
        l.b(tuxIconView, "");
        tuxIconView.setOnClickListener(new b(this));
        MethodCollector.o(4349);
    }
}
