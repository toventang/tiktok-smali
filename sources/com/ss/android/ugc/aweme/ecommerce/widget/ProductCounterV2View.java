package com.ss.android.ugc.aweme.ecommerce.widget;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class ProductCounterV2View extends LinearLayout {

    /* renamed from: g  reason: collision with root package name */
    public static final a f87601g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f87602a;

    /* renamed from: b  reason: collision with root package name */
    public int f87603b;

    /* renamed from: c  reason: collision with root package name */
    public String f87604c;

    /* renamed from: d  reason: collision with root package name */
    public m<? super Integer, ? super String, z> f87605d;

    /* renamed from: e  reason: collision with root package name */
    public m<? super Boolean, ? super Integer, z> f87606e;

    /* renamed from: f  reason: collision with root package name */
    public h.f.a.a<z> f87607f;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f87608h;

    static {
        Covode.recordClassIndex(55068);
    }

    public ProductCounterV2View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f87608h == null) {
            this.f87608h = new SparseArray();
        }
        View view = (View) this.f87608h.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f87608h.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55070);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class f extends NumberKeyListener {
        static {
            Covode.recordClassIndex(55076);
        }

        public final int getInputType() {
            return 3;
        }

        f() {
        }

        /* access modifiers changed from: protected */
        public final char[] getAcceptedChars() {
            return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        }
    }

    public final EditText getInput() {
        DmtEditText dmtEditText = (DmtEditText) a(R.id.ag2);
        l.b(dmtEditText, "");
        return dmtEditText;
    }

    public final void a() {
        int i2;
        int c2 = androidx.core.content.b.c(getContext(), R.color.bz);
        int c3 = androidx.core.content.b.c(getContext(), R.color.bx);
        TuxIconView tuxIconView = (TuxIconView) a(R.id.ag4);
        if (this.f87602a >= this.f87603b) {
            i2 = c2;
        } else {
            i2 = c3;
        }
        tuxIconView.setTintColor(i2);
        TuxIconView tuxIconView2 = (TuxIconView) a(R.id.ag3);
        if (this.f87602a > 1) {
            c2 = c3;
        }
        tuxIconView2.setTintColor(c2);
    }

    public final void setClickListener(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f87607f = aVar;
    }

    public final void setKeyBoardHeightListener(m<? super Boolean, ? super Integer, z> mVar) {
        l.d(mVar, "");
        this.f87606e = mVar;
    }

    public final void setQuantityChangeListener(m<? super Integer, ? super String, z> mVar) {
        l.d(mVar, "");
        this.f87605d = mVar;
    }

    public final void setSkuId(String str) {
        l.d(str, "");
        this.f87604c = str;
    }

    public static final /* synthetic */ h.f.a.a a(ProductCounterV2View productCounterV2View) {
        h.f.a.a<z> aVar = productCounterV2View.f87607f;
        if (aVar == null) {
            l.a("clickListener");
        }
        return aVar;
    }

    public final void setMaxQuantity(Integer num) {
        int i2;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 200;
        }
        this.f87603b = i2;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductCounterV2View f87615a;

        static {
            Covode.recordClassIndex(55075);
        }

        e(ProductCounterV2View productCounterV2View) {
            this.f87615a = productCounterV2View;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f87615a.f87602a > 1) {
                this.f87615a.f87605d.invoke(Integer.valueOf(this.f87615a.f87602a - 1), this.f87615a.f87604c);
            } else {
                new com.bytedance.tux.g.b(this.f87615a).e(R.string.bgr).b();
            }
            ProductCounterV2View.a(this.f87615a).invoke();
        }
    }

    public final void setQuantity(int i2) {
        this.f87602a = i2;
        ((DmtEditText) a(R.id.ag2)).setText(String.valueOf(this.f87602a));
        if (((DmtEditText) a(R.id.ag2)).hasFocus()) {
            ((DmtEditText) a(R.id.ag2)).setSelection(String.valueOf(this.f87602a).length());
        }
        a();
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductCounterV2View f87614a;

        static {
            Covode.recordClassIndex(55074);
        }

        d(ProductCounterV2View productCounterV2View) {
            this.f87614a = productCounterV2View;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f87614a.f87602a < this.f87614a.f87603b) {
                this.f87614a.f87605d.invoke(Integer.valueOf(this.f87614a.f87602a + 1), this.f87614a.f87604c);
            } else {
                Context context = this.f87614a.getContext();
                l.b(context, "");
                String string = context.getResources().getString(R.string.bgq, Integer.valueOf(this.f87614a.f87603b));
                l.b(string, "");
                new com.bytedance.tux.g.b(this.f87614a).a(string).b();
            }
            ProductCounterV2View.a(this.f87614a).invoke();
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DmtEditText f87612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProductCounterV2View f87613b;

        static {
            Covode.recordClassIndex(55073);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void afterTextChanged(Editable editable) {
            int parseInt;
            l.d(editable, "");
            String obj = editable.toString();
            ProductCounterV2View productCounterV2View = this.f87613b;
            if (obj.length() == 0) {
                parseInt = 0;
            } else {
                parseInt = Integer.parseInt(obj);
            }
            productCounterV2View.f87602a = parseInt;
            if (this.f87613b.f87602a > this.f87613b.f87603b) {
                ProductCounterV2View productCounterV2View2 = this.f87613b;
                productCounterV2View2.f87602a = productCounterV2View2.f87603b;
                Context context = this.f87612a.getContext();
                l.b(context, "");
                String string = context.getResources().getString(R.string.bgq, Integer.valueOf(this.f87613b.f87603b));
                l.b(string, "");
                new com.bytedance.tux.g.b(this.f87613b).a(string).b();
                ((DmtEditText) this.f87612a.findViewById(R.id.ag2)).setText(String.valueOf(this.f87613b.f87602a));
                this.f87612a.setSelection(String.valueOf(this.f87613b.f87602a).length());
            } else if (this.f87613b.f87602a <= 0) {
                com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(this.f87613b);
                Context context2 = this.f87612a.getContext();
                l.b(context2, "");
                bVar.a(context2.getResources().getString(R.string.bgr)).b();
            }
            this.f87613b.a();
        }

        c(DmtEditText dmtEditText, ProductCounterV2View productCounterV2View) {
            this.f87612a = dmtEditText;
            this.f87613b = productCounterV2View;
        }
    }

    static final class g extends h.f.b.m implements m<Integer, String, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f87616a = new g();

        static {
            Covode.recordClassIndex(55077);
        }

        g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, String str) {
            num.intValue();
            l.d(str, "");
            return z.f158842a;
        }
    }

    static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DmtEditText f87609a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProductCounterV2View f87610b;

        static {
            Covode.recordClassIndex(55071);
        }

        b(DmtEditText dmtEditText, ProductCounterV2View productCounterV2View) {
            this.f87609a = dmtEditText;
            this.f87610b = productCounterV2View;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            if (motionEvent.getAction() == 1) {
                this.f87609a.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f87611a;

                    static {
                        Covode.recordClassIndex(55072);
                    }

                    {
                        this.f87611a = r1;
                    }

                    public final void run() {
                        int i2;
                        DmtEditText dmtEditText = this.f87611a.f87609a;
                        Editable text = this.f87611a.f87609a.getText();
                        if (text != null) {
                            i2 = text.length();
                        } else {
                            i2 = 0;
                        }
                        dmtEditText.setSelection(i2);
                    }
                });
            }
            ProductCounterV2View.a(this.f87610b).invoke();
            return false;
        }
    }

    private /* synthetic */ ProductCounterV2View(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ProductCounterV2View(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(5478);
        this.f87603b = 200;
        this.f87604c = "";
        this.f87605d = g.f87616a;
        com.a.a(LayoutInflater.from(context), R.layout.q9, this, true);
        if (context instanceof androidx.appcompat.app.d) {
            new KeyBoardVisibilityUtil((androidx.core.app.d) context, 32, new m<Boolean, Integer, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View.AnonymousClass1 */
                final /* synthetic */ ProductCounterV2View this$0;

                static {
                    Covode.recordClassIndex(55069);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ z invoke(Boolean bool, Integer num) {
                    boolean booleanValue = bool.booleanValue();
                    int intValue = num.intValue();
                    if (!booleanValue && ((DmtEditText) this.this$0.a(R.id.ag2)).hasFocus()) {
                        if (this.this$0.f87602a <= 0) {
                            this.this$0.f87602a = 1;
                            ((DmtEditText) this.this$0.a(R.id.ag2)).setText(String.valueOf(this.this$0.f87602a));
                        }
                        this.this$0.f87605d.invoke(Integer.valueOf(this.this$0.f87602a), this.this$0.f87604c);
                        ((DmtEditText) this.this$0.a(R.id.ag2)).clearFocus();
                    }
                    m<? super Boolean, ? super Integer, z> mVar = this.this$0.f87606e;
                    if (mVar == null) {
                        l.a("keyBoardHeightListener");
                    }
                    mVar.invoke(Boolean.valueOf(booleanValue), Integer.valueOf(intValue));
                    return z.f158842a;
                }
            });
        }
        ((TuxIconView) a(R.id.ag4)).setOnClickListener(new d(this));
        ((TuxIconView) a(R.id.ag3)).setOnClickListener(new e(this));
        DmtEditText dmtEditText = (DmtEditText) a(R.id.ag2);
        dmtEditText.setOnTouchListener(new b(dmtEditText, this));
        dmtEditText.addTextChangedListener(new c(dmtEditText, this));
        dmtEditText.setKeyListener(new f());
        if (gb.a()) {
            int i2 = Build.VERSION.SDK_INT;
            TuxIconView tuxIconView = (TuxIconView) a(R.id.ag3);
            l.b(tuxIconView, "");
            tuxIconView.setBackground(androidx.core.content.b.a(getContext(), (int) R.drawable.xq));
            TuxIconView tuxIconView2 = (TuxIconView) a(R.id.ag4);
            l.b(tuxIconView2, "");
            tuxIconView2.setBackground(androidx.core.content.b.a(getContext(), (int) R.drawable.xp));
        }
        MethodCollector.o(5478);
    }
}
