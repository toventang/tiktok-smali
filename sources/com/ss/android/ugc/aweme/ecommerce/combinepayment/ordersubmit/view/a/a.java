package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.g;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.p;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f85038a;

    /* renamed from: b  reason: collision with root package name */
    private int f85039b;

    /* renamed from: c  reason: collision with root package name */
    private final p f85040c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<z> f85041d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<z> f85042e;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f85043f;

    static {
        Covode.recordClassIndex(53162);
    }

    public final View a(int i2) {
        if (this.f85043f == null) {
            this.f85043f = new SparseArray();
        }
        View view = (View) this.f85043f.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f85043f.put(i2, findViewById);
        return findViewById;
    }

    public final h.f.a.a<z> getLogInputAction() {
        return this.f85042e;
    }

    public final h.f.a.a<z> getUpdateValidity() {
        return this.f85041d;
    }

    public final g getReason() {
        String str = this.f85040c.f84996b;
        if (str == null) {
            str = "";
        }
        DmtEditText dmtEditText = (DmtEditText) a(R.id.dgj);
        l.b(dmtEditText, "");
        return new g(str, String.valueOf(dmtEditText.getText()));
    }

    public final void a() {
        boolean z;
        int i2;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.dgh);
        l.b(tuxTextView, "");
        tuxTextView.setText(String.valueOf(((DmtEditText) a(R.id.dgj)).length()));
        if (((DmtEditText) a(R.id.dgj)).length() <= this.f85039b) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.f85038a) {
            this.f85038a = z;
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.dgh);
            Context context = getContext();
            l.b(context, "");
            Resources resources = context.getResources();
            if (this.f85038a) {
                i2 = R.color.c5;
            } else {
                i2 = R.color.bd;
            }
            tuxTextView2.setTextColor(resources.getColor(i2));
            h.f.a.a<z> aVar = this.f85041d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.a$a  reason: collision with other inner class name */
    public static final class C2036a extends com.ss.android.ugc.aweme.ecommerce.util.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f85044a;

        static {
            Covode.recordClassIndex(53163);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2036a(a aVar) {
            this.f85044a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.util.l
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            this.f85044a.a();
        }
    }

    static final class b implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f85045a;

        static {
            Covode.recordClassIndex(53164);
        }

        b(a aVar) {
            this.f85045a = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z && this.f85045a.getLogInputAction() != null) {
                this.f85045a.getLogInputAction().invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context, p pVar, h.f.a.a<z> aVar, h.f.a.a<z> aVar2) {
        super(context, null, 0);
        l.d(context, "");
        l.d(pVar, "");
        MethodCollector.i(7372);
        this.f85040c = pVar;
        this.f85041d = aVar;
        this.f85042e = aVar2;
        this.f85039b = 200;
        this.f85038a = true;
        com.a.a(LayoutInflater.from(context), R.layout.p4, this, true);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.dgk);
        l.b(tuxTextView, "");
        String str = pVar.f84997c;
        if (str == null) {
            Context context2 = getContext();
            l.b(context2, "");
            str = context2.getResources().getString(R.string.bgz);
        }
        tuxTextView.setText(str);
        Integer num = pVar.f84999e;
        if (num != null) {
            this.f85039b = num.intValue();
        }
        DmtEditText dmtEditText = (DmtEditText) a(R.id.dgj);
        l.b(dmtEditText, "");
        String str2 = pVar.f84998d;
        if (str2 == null) {
            Context context3 = getContext();
            l.b(context3, "");
            str2 = context3.getResources().getString(R.string.bgx);
        }
        dmtEditText.setHint(str2);
        a();
        ((DmtEditText) a(R.id.dgj)).addTextChangedListener(new C2036a(this));
        ((DmtEditText) a(R.id.dgj)).setOnFocusChangeListener(new b(this));
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.dgi);
        l.b(tuxTextView2, "");
        tuxTextView2.setText("/" + this.f85039b);
        MethodCollector.o(7372);
    }

    public /* synthetic */ a(Context context, p pVar, h.f.a.a aVar, h.f.a.a aVar2, byte b2) {
        this(context, pVar, aVar, aVar2);
    }
}
