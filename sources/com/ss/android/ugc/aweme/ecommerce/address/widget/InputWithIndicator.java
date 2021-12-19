package com.ss.android.ugc.aweme.ecommerce.address.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.Objects;

public final class InputWithIndicator extends LinearLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final a f84586d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.a<Boolean> f84587a;

    /* renamed from: b  reason: collision with root package name */
    public int f84588b;

    /* renamed from: c  reason: collision with root package name */
    public View.OnClickListener f84589c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f84590e;

    /* renamed from: f  reason: collision with root package name */
    private a f84591f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f84592g;

    /* renamed from: h  reason: collision with root package name */
    private int f84593h;

    /* renamed from: i  reason: collision with root package name */
    private View.OnFocusChangeListener f84594i;

    /* renamed from: j  reason: collision with root package name */
    private h.f.a.b<? super Boolean, z> f84595j;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f84596k;

    static {
        Covode.recordClassIndex(52801);
    }

    public InputWithIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private static /* synthetic */ void getIndicatorType$annotations() {
    }

    public final View a(int i2) {
        if (this.f84596k == null) {
            this.f84596k = new SparseArray();
        }
        View view = (View) this.f84596k.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f84596k.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52805);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean getEnableAutoHide() {
        return this.f84590e;
    }

    public final View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.f84594i;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Boolean, h.z>, h.f.a.b<java.lang.Boolean, h.z> */
    public final h.f.a.b<Boolean, z> getOnIndicatorVisibleChangeListener() {
        return this.f84595j;
    }

    public final EditText getEditText() {
        DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText, "");
        return dmtEditText;
    }

    public final int getInputType() {
        DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText, "");
        return dmtEditText.getInputType();
    }

    static final class b extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ InputWithIndicator this$0;

        static {
            Covode.recordClassIndex(52806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(InputWithIndicator inputWithIndicator) {
            super(0);
            this.this$0 = inputWithIndicator;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            DmtEditText dmtEditText = (DmtEditText) this.this$0.a(R.id.bpu);
            l.b(dmtEditText, "");
            Editable text = dmtEditText.getText();
            boolean z = false;
            if (text != null && text.length() > 0) {
                DmtEditText dmtEditText2 = (DmtEditText) this.this$0.a(R.id.bpu);
                l.b(dmtEditText2, "");
                if (dmtEditText2.isFocused()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    private final a getClearButton() {
        if (this.f84591f == null) {
            Context context = getContext();
            l.b(context, "");
            this.f84591f = new a(context, (byte) 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            a aVar = this.f84591f;
            if (aVar == null) {
                l.b();
            }
            aVar.setLayoutParams(layoutParams);
        }
        a aVar2 = this.f84591f;
        if (aVar2 == null) {
            l.b();
        }
        return aVar2;
    }

    private final ImageView getImageView() {
        MethodCollector.i(4957);
        if (this.f84592g == null) {
            this.f84592g = new ImageView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            ImageView imageView = this.f84592g;
            if (imageView == null) {
                l.b();
            }
            imageView.setLayoutParams(layoutParams);
        }
        ImageView imageView2 = this.f84592g;
        if (imageView2 == null) {
            l.b();
        }
        MethodCollector.o(4957);
        return imageView2;
    }

    public final String getText() {
        String obj;
        DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText, "");
        Editable text = dmtEditText.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj2 = p.b((CharSequence) obj).toString();
        if (obj2 == null) {
            return "";
        }
        return obj2;
    }

    public final void setEnableAutoHide(boolean z) {
        this.f84590e = z;
    }

    public final void setIndicatorSize(int i2) {
        this.f84593h = i2;
    }

    public final void setOnEditTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f84594i = onFocusChangeListener;
    }

    static final class c extends m implements h.f.a.b<Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f84600a = new c();

        static {
            Covode.recordClassIndex(52807);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            bool.booleanValue();
            return z.f158842a;
        }
    }

    public final void setAutoHideRules(h.f.a.a<Boolean> aVar) {
        l.d(aVar, "");
        this.f84587a = aVar;
    }

    public final void setIndicatorClickListener(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        this.f84589c = onClickListener;
    }

    public final void setOnIndicatorVisibleChangeListener(h.f.a.b<? super Boolean, z> bVar) {
        l.d(bVar, "");
        this.f84595j = bVar;
    }

    public final void setContainerPadding(int i2) {
        ((FrameLayout) a(R.id.bpv)).setPadding(i2, i2, i2, i2);
    }

    public final void setMaxLength(int i2) {
        if (i2 > 0) {
            com.ss.android.ugc.aweme.ecommerce.util.c.a((EditText) a(R.id.bpu), i2);
        }
    }

    public final void setHint(String str) {
        DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText, "");
        dmtEditText.setHint(str);
    }

    public final void setInputType(int i2) {
        DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText, "");
        dmtEditText.setInputType(i2);
    }

    public final void setMaxLines(int i2) {
        DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText, "");
        dmtEditText.setMaxLines(i2);
    }

    public final void setTextWatcher(TextWatcher textWatcher) {
        l.d(textWatcher, "");
        ((DmtEditText) a(R.id.bpu)).addTextChangedListener(textWatcher);
    }

    public final void setIndicatorVisible(boolean z) {
        int i2;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        FrameLayout frameLayout = (FrameLayout) a(R.id.bpt);
        l.b(frameLayout, "");
        frameLayout.setVisibility(i2);
        FrameLayout frameLayout2 = (FrameLayout) a(R.id.bpv);
        l.b(frameLayout2, "");
        frameLayout2.setVisibility(i2);
        this.f84595j.invoke(Boolean.valueOf(z));
    }

    public final void setText(CharSequence charSequence) {
        l.d(charSequence, "");
        ((DmtEditText) a(R.id.bpu)).setText(charSequence);
        if (charSequence.length() > 0) {
            DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
            l.b(dmtEditText, "");
            ((DmtEditText) a(R.id.bpu)).setSelection(String.valueOf(dmtEditText.getText()).length());
        }
    }

    private /* synthetic */ InputWithIndicator(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InputWithIndicator(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(5120);
        this.f84590e = true;
        this.f84587a = new b(this);
        this.f84595j = c.f84600a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843091, 16843104, 16843296, R.attr.p5, R.attr.p7, R.attr.p8, R.attr.p9, R.attr.p_, R.attr.pa, R.attr.pb});
        l.b(obtainStyledAttributes, "");
        this.f84588b = obtainStyledAttributes.getInt(4, 0);
        this.f84593h = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        String string = obtainStyledAttributes.getString(7);
        int i2 = obtainStyledAttributes.getInt(0, Integer.MAX_VALUE);
        int i3 = obtainStyledAttributes.getInt(1, 0);
        int i4 = obtainStyledAttributes.getInt(2, 1);
        float f2 = (float) obtainStyledAttributes.getInt(9, 15);
        int color = obtainStyledAttributes.getColor(6, androidx.core.content.b.c(context, R.color.bx));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        View.inflate(context, R.layout.oq, this);
        int resourceId = obtainStyledAttributes.getResourceId(8, 80);
        if (resourceId != 80) {
            DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
            l.b(dmtEditText, "");
            dmtEditText.setId(resourceId);
        }
        obtainStyledAttributes.recycle();
        setMaxLength(i3);
        setMaxLines(i2);
        DmtEditText dmtEditText2 = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText2, "");
        i.a((View) dmtEditText2, (Integer) null, Integer.valueOf(dimensionPixelSize), (Integer) null, Integer.valueOf(dimensionPixelSize), false, 21);
        DmtEditText dmtEditText3 = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText3, "");
        dmtEditText3.setHint(string);
        DmtEditText dmtEditText4 = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText4, "");
        dmtEditText4.setTextSize(f2);
        DmtEditText dmtEditText5 = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText5, "");
        dmtEditText5.setInputType(i4);
        ((DmtEditText) a(R.id.bpu)).setTextColor(color);
        ((DmtEditText) a(R.id.bpu)).addTextChangedListener(new com.ss.android.ugc.aweme.ecommerce.util.l(this) {
            /* class com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ InputWithIndicator f84597a;

            static {
                Covode.recordClassIndex(52802);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f84597a = r1;
            }

            @Override // com.ss.android.ugc.aweme.ecommerce.util.l
            public final void afterTextChanged(Editable editable) {
                if (this.f84597a.getEnableAutoHide()) {
                    InputWithIndicator inputWithIndicator = this.f84597a;
                    inputWithIndicator.setIndicatorVisible(inputWithIndicator.f84587a.invoke().booleanValue());
                }
            }
        });
        ((DmtEditText) a(R.id.bpu)).setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            /* class com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ InputWithIndicator f84598a;

            static {
                Covode.recordClassIndex(52803);
            }

            {
                this.f84598a = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                View.OnFocusChangeListener onEditTextFocusChangeListener = this.f84598a.getOnEditTextFocusChangeListener();
                if (onEditTextFocusChangeListener != null) {
                    onEditTextFocusChangeListener.onFocusChange(view, z);
                }
                InputWithIndicator inputWithIndicator = this.f84598a;
                boolean z2 = false;
                if (z) {
                    DmtEditText dmtEditText = (DmtEditText) inputWithIndicator.a(R.id.bpu);
                    l.b(dmtEditText, "");
                    Editable text = dmtEditText.getText();
                    if (text != null && text.length() > 0) {
                        z2 = true;
                    }
                }
                inputWithIndicator.setIndicatorVisible(z2);
            }
        });
        ((FrameLayout) a(R.id.bpt)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ InputWithIndicator f84599a;

            static {
                Covode.recordClassIndex(52804);
            }

            {
                this.f84599a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f84599a.f84588b == 1) {
                    DmtEditText dmtEditText = (DmtEditText) this.f84599a.a(R.id.bpu);
                    l.b(dmtEditText, "");
                    dmtEditText.setText((CharSequence) null);
                }
                View.OnClickListener onClickListener = this.f84599a.f84589c;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        });
        if (this.f84588b == 1 && this.f84590e) {
            FrameLayout frameLayout = (FrameLayout) a(R.id.bpv);
            l.b(frameLayout, "");
            frameLayout.setVisibility(8);
        }
        if (this.f84593h <= 0) {
            this.f84593h = n.a(16.0d);
        }
        FrameLayout frameLayout2 = (FrameLayout) a(R.id.bpv);
        l.b(frameLayout2, "");
        int i5 = this.f84593h;
        l.d(frameLayout2, "");
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        layoutParams.height = i5;
        layoutParams.width = i5;
        frameLayout2.setLayoutParams(layoutParams);
        if (this.f84588b == 1) {
            a clearButton = getClearButton();
            ((FrameLayout) a(R.id.bpv)).removeAllViews();
            ((FrameLayout) a(R.id.bpv)).addView(clearButton);
        }
        MethodCollector.o(5120);
    }
}
