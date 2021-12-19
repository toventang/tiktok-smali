package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class InputWithIndicator extends LinearLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final a f65372e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.a<Boolean> f65373a;

    /* renamed from: b  reason: collision with root package name */
    public b f65374b;

    /* renamed from: c  reason: collision with root package name */
    public int f65375c;

    /* renamed from: d  reason: collision with root package name */
    public int f65376d;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f65377f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f65378g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f65379h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f65380i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f65381j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f65382k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f65383l;

    /* renamed from: m  reason: collision with root package name */
    private int f65384m;
    private HashMap n;

    public interface b {
        static {
            Covode.recordClassIndex(40194);
        }

        void b(int i2);
    }

    static {
        Covode.recordClassIndex(40190);
    }

    public InputWithIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final ImageView getCheckImageView() {
        return (ImageView) this.f65378g.getValue();
    }

    private final ImageView getClearButton() {
        return (ImageView) this.f65377f.getValue();
    }

    private final ImageView getEyeCloseImageView() {
        return (ImageView) this.f65380i.getValue();
    }

    private final ImageView getEyeOpenImageView() {
        return (ImageView) this.f65379h.getValue();
    }

    private final LoadingCircleView getLoadingView() {
        return (LoadingCircleView) this.f65381j.getValue();
    }

    private static /* synthetic */ void getPrimaryIndicatorType$annotations() {
    }

    private static /* synthetic */ void getSecondaryIndicatorType$annotations() {
    }

    public final View b(int i2) {
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.n.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final int getDefaultIndicatorSize() {
        return ((Number) this.f65383l.getValue()).intValue();
    }

    public final int getDefaultPadding() {
        return ((Number) this.f65382k.getValue()).intValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40193);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class f extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f65388a = new f();

        static {
            Covode.recordClassIndex(40199);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(n.a(28.0d));
        }
    }

    static final class g extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f65389a = new g();

        static {
            Covode.recordClassIndex(40200);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(n.a(6.0d));
        }
    }

    public final EditText getEditText() {
        DmtEditText dmtEditText = (DmtEditText) b(R.id.bpu);
        l.b(dmtEditText, "");
        return dmtEditText;
    }

    static final class c extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ InputWithIndicator this$0;

        static {
            Covode.recordClassIndex(40195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(InputWithIndicator inputWithIndicator) {
            super(0);
            this.this$0 = inputWithIndicator;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            DmtEditText dmtEditText = (DmtEditText) this.this$0.b(R.id.bpu);
            l.b(dmtEditText, "");
            Editable text = dmtEditText.getText();
            boolean z = false;
            if (text != null && text.length() > 0) {
                DmtEditText dmtEditText2 = (DmtEditText) this.this$0.b(R.id.bpu);
                l.b(dmtEditText2, "");
                if (dmtEditText2.isFocused()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ InputWithIndicator this$0;

        static {
            Covode.recordClassIndex(40196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(InputWithIndicator inputWithIndicator) {
            super(0);
            this.this$0 = inputWithIndicator;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            ImageView a2 = this.this$0.a(2131231081);
            a2.setPadding(this.this$0.getDefaultPadding(), this.this$0.getDefaultPadding(), this.this$0.getDefaultPadding(), this.this$0.getDefaultPadding());
            return a2;
        }
    }

    static final class e extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ InputWithIndicator this$0;

        static {
            Covode.recordClassIndex(40197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(InputWithIndicator inputWithIndicator) {
            super(0);
            this.this$0 = inputWithIndicator;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            ImageView a2 = this.this$0.a(R.drawable.j7);
            a2.setPadding(this.this$0.getDefaultPadding(), this.this$0.getDefaultPadding(), this.this$0.getDefaultPadding(), this.this$0.getDefaultPadding());
            a2.setOnClickListener(new a(this));
            return a2;
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f65387a;

            static {
                Covode.recordClassIndex(40198);
            }

            a(e eVar) {
                this.f65387a = eVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f65387a.this$0.setText("");
                b bVar = this.f65387a.this$0.f65374b;
                if (bVar != null) {
                    bVar.b(1);
                }
            }
        }
    }

    static final class h extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ InputWithIndicator this$0;

        static {
            Covode.recordClassIndex(40201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(InputWithIndicator inputWithIndicator) {
            super(0);
            this.this$0 = inputWithIndicator;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            ImageView a2 = this.this$0.a(R.drawable.ja);
            a2.setOnClickListener(new a(this));
            a2.setPadding(this.this$0.getDefaultPadding() / 2, 0, this.this$0.getDefaultPadding() / 2, 0);
            return a2;
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f65390a;

            static {
                Covode.recordClassIndex(40202);
            }

            a(h hVar) {
                this.f65390a = hVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f65390a.this$0.f65375c == 4) {
                    this.f65390a.this$0.a(5, this.f65390a.this$0.f65376d);
                } else {
                    this.f65390a.this$0.a(this.f65390a.this$0.f65375c, 5);
                }
                b bVar = this.f65390a.this$0.f65374b;
                if (bVar != null) {
                    bVar.b(4);
                }
            }
        }
    }

    static final class i extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ InputWithIndicator this$0;

        static {
            Covode.recordClassIndex(40203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(InputWithIndicator inputWithIndicator) {
            super(0);
            this.this$0 = inputWithIndicator;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            ImageView a2 = this.this$0.a(R.drawable.j_);
            a2.setOnClickListener(new a(this));
            a2.setPadding(this.this$0.getDefaultPadding() / 2, 0, this.this$0.getDefaultPadding() / 2, 0);
            return a2;
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f65391a;

            static {
                Covode.recordClassIndex(40204);
            }

            a(i iVar) {
                this.f65391a = iVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f65391a.this$0.f65375c == 5) {
                    this.f65391a.this$0.a(4, this.f65391a.this$0.f65376d);
                } else {
                    this.f65391a.this$0.a(this.f65391a.this$0.f65375c, 4);
                }
                b bVar = this.f65391a.this$0.f65374b;
                if (bVar != null) {
                    bVar.b(5);
                }
            }
        }
    }

    public final String getText() {
        String obj;
        DmtEditText dmtEditText = (DmtEditText) b(R.id.bpu);
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

    static final class j extends m implements h.f.a.a<LoadingCircleView> {
        final /* synthetic */ Context $context;
        final /* synthetic */ InputWithIndicator this$0;

        static {
            Covode.recordClassIndex(40205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(InputWithIndicator inputWithIndicator, Context context) {
            super(0);
            this.this$0 = inputWithIndicator;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LoadingCircleView invoke() {
            LoadingCircleView loadingCircleView = new LoadingCircleView(this.$context, (AttributeSet) null, 6);
            loadingCircleView.setLoadingColor(androidx.core.content.b.c(this.$context, R.color.bz));
            loadingCircleView.setLineWidth((float) n.a(3.0d));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.this$0.getDefaultIndicatorSize(), this.this$0.getDefaultIndicatorSize());
            layoutParams.gravity = 16;
            loadingCircleView.setLayoutParams(layoutParams);
            loadingCircleView.setPadding(this.this$0.getDefaultPadding(), this.this$0.getDefaultPadding(), this.this$0.getDefaultPadding(), this.this$0.getDefaultPadding());
            loadingCircleView.a();
            return loadingCircleView;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x007e */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.ss.android.ugc.aweme.account.ui.LoadingCircleView] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.ui.InputWithIndicator.a():void");
    }

    public final void setAutoHideRules(h.f.a.a<Boolean> aVar) {
        l.d(aVar, "");
        this.f65373a = aVar;
    }

    public final void setListener(b bVar) {
        l.d(bVar, "");
        this.f65374b = bVar;
    }

    public final void setContainerPadding(int i2) {
        ((LinearLayout) b(R.id.bpv)).setPadding(i2, i2, i2, i2);
    }

    public final void setIndicatorVisible(boolean z) {
        int i2;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        LinearLayout linearLayout = (LinearLayout) b(R.id.bpv);
        l.b(linearLayout, "");
        linearLayout.setVisibility(i2);
    }

    public final void setTextWatcher(TextWatcher textWatcher) {
        l.d(textWatcher, "");
        ((DmtEditText) b(R.id.bpu)).addTextChangedListener(textWatcher);
    }

    private final void a(List<? extends View> list) {
        MethodCollector.i(9632);
        ((LinearLayout) b(R.id.bpv)).removeAllViews();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((LinearLayout) b(R.id.bpv)).addView(it.next());
        }
        invalidate();
        MethodCollector.o(9632);
    }

    private final void c(int i2) {
        DmtEditText dmtEditText = (DmtEditText) b(R.id.bpu);
        l.b(dmtEditText, "");
        int selectionStart = dmtEditText.getSelectionStart();
        DmtEditText dmtEditText2 = (DmtEditText) b(R.id.bpu);
        l.b(dmtEditText2, "");
        int selectionEnd = dmtEditText2.getSelectionEnd();
        DmtEditText dmtEditText3 = (DmtEditText) b(R.id.bpu);
        l.b(dmtEditText3, "");
        dmtEditText3.setInputType(i2);
        ((DmtEditText) b(R.id.bpu)).setSelection(selectionStart, selectionEnd);
    }

    public final void setText(CharSequence charSequence) {
        l.d(charSequence, "");
        ((DmtEditText) b(R.id.bpu)).setText(charSequence);
        if (charSequence.length() > 0) {
            ((DmtEditText) b(R.id.bpu)).setSelection(charSequence.length());
        }
    }

    public final ImageView a(int i2) {
        MethodCollector.i(9482);
        ImageView imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getDefaultIndicatorSize(), getDefaultIndicatorSize());
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(i2);
        MethodCollector.o(9482);
        return imageView;
    }

    public final void a(int i2, int i3) {
        if (i3 != this.f65376d || i2 != this.f65375c) {
            this.f65376d = i3;
            this.f65375c = i2;
            a();
        }
    }

    private /* synthetic */ InputWithIndicator(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InputWithIndicator(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9809);
        this.f65373a = new c(this);
        this.f65377f = h.i.a((h.f.a.a) new e(this));
        this.f65378g = h.i.a((h.f.a.a) new d(this));
        this.f65379h = h.i.a((h.f.a.a) new i(this));
        this.f65380i = h.i.a((h.f.a.a) new h(this));
        this.f65381j = h.i.a((h.f.a.a) new j(this, context));
        this.f65382k = h.i.a((h.f.a.a) g.f65389a);
        this.f65383l = h.i.a((h.f.a.a) f.f65388a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843091, 16843104, 16843296, R.attr.wu, R.attr.ww, R.attr.x3, R.attr.x4, R.attr.x5, R.attr.x6, R.attr.ab5});
        l.b(obtainStyledAttributes, "");
        this.f65375c = obtainStyledAttributes.getInt(3, 0);
        this.f65376d = obtainStyledAttributes.getInt(9, 0);
        this.f65384m = obtainStyledAttributes.getDimensionPixelSize(4, n.a(28.0d));
        String string = obtainStyledAttributes.getString(6);
        int i2 = obtainStyledAttributes.getInt(0, 1);
        int i3 = obtainStyledAttributes.getInt(1, 0);
        int i4 = obtainStyledAttributes.getInt(2, 1);
        float f2 = (float) obtainStyledAttributes.getInt(8, 15);
        int color = obtainStyledAttributes.getColor(5, androidx.core.content.b.c(context, R.color.bx));
        View.inflate(context, R.layout.gi, this);
        int resourceId = obtainStyledAttributes.getResourceId(7, 80);
        if (resourceId != 80) {
            DmtEditText dmtEditText = (DmtEditText) b(R.id.bpu);
            l.b(dmtEditText, "");
            dmtEditText.setId(resourceId);
        }
        obtainStyledAttributes.recycle();
        if (i3 > 0) {
            com.ss.android.ugc.aweme.account.n.c.a((EditText) b(R.id.bpu), i3);
        }
        DmtEditText dmtEditText2 = (DmtEditText) b(R.id.bpu);
        l.b(dmtEditText2, "");
        dmtEditText2.setMaxLines(i2);
        DmtEditText dmtEditText3 = (DmtEditText) b(R.id.bpu);
        l.b(dmtEditText3, "");
        dmtEditText3.setHint(string);
        DmtEditText dmtEditText4 = (DmtEditText) b(R.id.bpu);
        l.b(dmtEditText4, "");
        dmtEditText4.setTextSize(f2);
        if (i4 != 129) {
            DmtEditText dmtEditText5 = (DmtEditText) b(R.id.bpu);
            l.b(dmtEditText5, "");
            dmtEditText5.setInputType(i4);
        }
        ((DmtEditText) b(R.id.bpu)).setTextColor(color);
        ((DmtEditText) b(R.id.bpu)).addTextChangedListener(new com.ss.android.ugc.aweme.account.i(this) {
            /* class com.ss.android.ugc.aweme.account.ui.InputWithIndicator.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ InputWithIndicator f65385a;

            static {
                Covode.recordClassIndex(40191);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f65385a = r1;
            }

            @Override // com.ss.android.ugc.aweme.account.i
            public final void afterTextChanged(Editable editable) {
                InputWithIndicator inputWithIndicator = this.f65385a;
                inputWithIndicator.setIndicatorVisible(inputWithIndicator.f65373a.invoke().booleanValue());
            }
        });
        ((DmtEditText) b(R.id.bpu)).setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            /* class com.ss.android.ugc.aweme.account.ui.InputWithIndicator.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ InputWithIndicator f65386a;

            static {
                Covode.recordClassIndex(40192);
            }

            {
                this.f65386a = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                InputWithIndicator inputWithIndicator = this.f65386a;
                boolean z2 = false;
                if (z) {
                    DmtEditText dmtEditText = (DmtEditText) inputWithIndicator.b(R.id.bpu);
                    l.b(dmtEditText, "");
                    Editable text = dmtEditText.getText();
                    if (text != null && text.length() > 0) {
                        z2 = true;
                    }
                }
                inputWithIndicator.setIndicatorVisible(z2);
            }
        });
        if (this.f65375c == 1) {
            LinearLayout linearLayout = (LinearLayout) b(R.id.bpv);
            l.b(linearLayout, "");
            linearLayout.setVisibility(8);
        }
        ((DmtEditText) b(R.id.bpu)).setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
        a();
        MethodCollector.o(9809);
    }
}
