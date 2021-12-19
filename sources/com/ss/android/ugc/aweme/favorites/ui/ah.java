package com.ss.android.ugc.aweme.favorites.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;

public final class ah extends Fragment {

    /* renamed from: g */
    public static final a f90842g = new a((byte) 0);

    /* renamed from: a */
    public TuxSpinner f90843a;

    /* renamed from: b */
    public EditText f90844b;

    /* renamed from: c */
    public ImageView f90845c;

    /* renamed from: d */
    public TextView f90846d;

    /* renamed from: e */
    public TextView f90847e;

    /* renamed from: f */
    public b f90848f;

    /* renamed from: h */
    private f.a.b.b f90849h;

    /* renamed from: i */
    private SparseArray f90850i;

    public interface b {
        static {
            Covode.recordClassIndex(57103);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(57101);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57102);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ah a(String str, String str2, String str3, boolean z, b bVar) {
            l.d(str, "");
            l.d(str3, "");
            ah ahVar = new ah();
            Bundle bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("btnName", str3);
            bundle.putBoolean("cancelStyle", z);
            bundle.putString("defaultInput", str2);
            ahVar.setArguments(bundle);
            ahVar.f90848f = bVar;
            return ahVar;
        }

        public static void a(androidx.fragment.app.i iVar, String str, String str2, String str3, b bVar) {
            l.d(iVar, "");
            l.d(str, "");
            l.d(str3, "");
            new a.C1112a().a(1).a(a(str, str2, str3, true, bVar)).f45299a.show(iVar, "VideoCollectionChoose");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f90850i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ah f90860a;

        static {
            Covode.recordClassIndex(57112);
        }

        k(ah ahVar) {
            this.f90860a = ahVar;
        }

        public final void run() {
            ah.a(this.f90860a).requestFocus();
            KeyboardUtils.b(ah.a(this.f90860a));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        f.a.b.b bVar;
        super.onDestroy();
        f.a.b.b bVar2 = this.f90849h;
        if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f90849h) != null) {
            bVar.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
    }

    static final class j implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ View f90859a;

        static {
            Covode.recordClassIndex(57111);
        }

        j(View view) {
            this.f90859a = view;
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            this.f90859a.getWindowVisibleDisplayFrame(rect);
            Context context = this.f90859a.getContext();
            l.b(context, "");
            Resources resources = context.getResources();
            l.b(resources, "");
            int i2 = resources.getDisplayMetrics().heightPixels;
            int i3 = rect.bottom;
            if (i2 < i3) {
                i2 = i3;
            }
            int i4 = i2 - i3;
            if (i4 != 0) {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                int a2 = i4 + h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
                if (this.f90859a.getPaddingBottom() != a2) {
                    this.f90859a.setPadding(0, 0, 0, a2);
                }
            } else if (this.f90859a.getPaddingBottom() != 0) {
                this.f90859a.setPadding(0, 0, 0, 0);
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ah f90853a;

        static {
            Covode.recordClassIndex(57106);
        }

        e(ah ahVar) {
            this.f90853a = ahVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.favorites.ui.ah r0 = r1.f90853a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.ui.ah.e.onClick(android.view.View):void");
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ah f90854a;

        static {
            Covode.recordClassIndex(57107);
        }

        f(ah ahVar) {
            this.f90854a = ahVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a.b.b(this.f90854a);
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ah f90855a;

        static {
            Covode.recordClassIndex(57108);
        }

        g(ah ahVar) {
            this.f90855a = ahVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ah.a(this.f90855a).setText("");
        }
    }

    public static final /* synthetic */ EditText a(ah ahVar) {
        EditText editText = ahVar.f90844b;
        if (editText == null) {
            l.a("etInput");
        }
        return editText;
    }

    public static final /* synthetic */ TuxSpinner b(ah ahVar) {
        TuxSpinner tuxSpinner = ahVar.f90843a;
        if (tuxSpinner == null) {
            l.a("loading");
        }
        return tuxSpinner;
    }

    public static final /* synthetic */ ImageView c(ah ahVar) {
        ImageView imageView = ahVar.f90845c;
        if (imageView == null) {
            l.a("ivClearAll");
        }
        return imageView;
    }

    public static final /* synthetic */ TextView d(ah ahVar) {
        TextView textView = ahVar.f90846d;
        if (textView == null) {
            l.a("tvEditHint");
        }
        return textView;
    }

    public static final /* synthetic */ TextView e(ah ahVar) {
        TextView textView = ahVar.f90847e;
        if (textView == null) {
            l.a("submit");
        }
        return textView;
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ah f90858a;

        static {
            Covode.recordClassIndex(57110);
        }

        i(ah ahVar) {
            this.f90858a = ahVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r3)
                com.ss.android.ugc.aweme.favorites.ui.ah r0 = r2.f90858a
                com.ss.android.ugc.aweme.favorites.ui.ah$b r1 = r0.f90848f
                if (r1 == 0) goto L_0x001a
                com.ss.android.ugc.aweme.favorites.ui.ah r0 = r2.f90858a
                android.widget.EditText r0 = com.ss.android.ugc.aweme.favorites.ui.ah.a(r0)
                android.text.Editable r0 = r0.getEditableText()
                java.lang.String r0 = r0.toString()
                r1.a(r0)
            L_0x001a:
                com.ss.android.ugc.aweme.favorites.ui.ah r0 = r2.f90858a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.ui.ah.i.onClick(android.view.View):void");
        }
    }

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ ah f90852a;

        static {
            Covode.recordClassIndex(57105);
        }

        d(ah ahVar) {
            this.f90852a = ahVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ah.b(this.f90852a).setVisibility(8);
            ah.c(this.f90852a).setVisibility(0);
            ah.d(this.f90852a).setVisibility(0);
            ah.d(this.f90852a).setText(this.f90852a.getText(R.string.btg));
            ah.e(this.f90852a).setEnabled(false);
        }
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ ah f90851a;

        static {
            Covode.recordClassIndex(57104);
        }

        c(ah ahVar) {
            this.f90851a = ahVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (!l.a((Object) ((com.ss.android.ugc.aweme.favorites.api.h) obj).f90470a, (Object) true)) {
                ah.b(this.f90851a).setVisibility(8);
                ah.c(this.f90851a).setVisibility(0);
                ah.d(this.f90851a).setVisibility(0);
                ah.d(this.f90851a).setText(this.f90851a.getText(R.string.btg));
                ah.e(this.f90851a).setEnabled(false);
                return;
            }
            ah.b(this.f90851a).setVisibility(8);
            ah.c(this.f90851a).setVisibility(0);
            ah.d(this.f90851a).setVisibility(8);
            ah.e(this.f90851a).setEnabled(true);
        }
    }

    public static final class h implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ah f90856a;

        /* renamed from: b */
        final /* synthetic */ TextView f90857b;

        static {
            Covode.recordClassIndex(57109);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void afterTextChanged(Editable editable) {
            int i2;
            String str;
            String obj;
            if (editable == null || (obj = editable.toString()) == null) {
                i2 = 0;
            } else {
                i2 = obj.length();
            }
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(androidx.core.content.b.c(ah.a(this.f90856a).getContext(), R.color.ly));
            a.C0730a aVar = new a.C0730a();
            if (i2 > 30) {
                aVar.a(a.b.a(i2), foregroundColorSpan, 33);
            } else {
                aVar.a(a.b.a(i2));
            }
            aVar.c("/");
            aVar.a(a.b.a(30));
            com.bytedance.ies.dmt.ui.d.a aVar2 = aVar.f33382a;
            TextView textView = this.f90857b;
            l.b(textView, "");
            textView.setText(aVar2);
            ah ahVar = this.f90856a;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            ahVar.a(str);
        }

        h(ah ahVar, TextView textView) {
            this.f90856a = ahVar;
            this.f90857b = textView;
        }
    }

    public final void a(String str) {
        f.a.b.b bVar;
        TextView textView = this.f90847e;
        if (textView == null) {
            l.a("submit");
        }
        textView.setEnabled(false);
        ImageView imageView = this.f90845c;
        if (imageView == null) {
            l.a("ivClearAll");
        }
        imageView.setVisibility(8);
        TextView textView2 = this.f90846d;
        if (textView2 == null) {
            l.a("tvEditHint");
        }
        textView2.setVisibility(8);
        f.a.b.b bVar2 = this.f90849h;
        if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f90849h) == null)) {
            bVar.dispose();
        }
        if (str != null && str.length() != 0 && !p.a((CharSequence) str)) {
            if (str.length() > 30) {
                ImageView imageView2 = this.f90845c;
                if (imageView2 == null) {
                    l.a("ivClearAll");
                }
                imageView2.setVisibility(0);
                TextView textView3 = this.f90846d;
                if (textView3 == null) {
                    l.a("tvEditHint");
                }
                textView3.setVisibility(0);
                TuxSpinner tuxSpinner = this.f90843a;
                if (tuxSpinner == null) {
                    l.a("loading");
                }
                tuxSpinner.setVisibility(8);
                TextView textView4 = this.f90846d;
                if (textView4 == null) {
                    l.a("tvEditHint");
                }
                textView4.setText(getText(R.string.bt5));
                TextView textView5 = this.f90847e;
                if (textView5 == null) {
                    l.a("submit");
                }
                textView5.setEnabled(false);
                return;
            }
            TextView textView6 = this.f90846d;
            if (textView6 == null) {
                l.a("tvEditHint");
            }
            textView6.setVisibility(8);
            TuxSpinner tuxSpinner2 = this.f90843a;
            if (tuxSpinner2 == null) {
                l.a("loading");
            }
            tuxSpinner2.setVisibility(0);
            this.f90849h = new com.ss.android.ugc.aweme.favorites.e.j().f90621b.a(str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this), new d(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i2;
        String obj;
        String string;
        String str2 = "";
        l.d(view, str2);
        View findViewById = view.findViewById(R.id.eeq);
        l.b(findViewById, str2);
        this.f90847e = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.eyy);
        l.b(findViewById2, str2);
        this.f90846d = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bvc);
        l.b(findViewById3, str2);
        this.f90845c = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ay0);
        l.b(findViewById4, str2);
        this.f90844b = (EditText) findViewById4;
        TextView textView = (TextView) view.findViewById(R.id.ez0);
        TextView textView2 = (TextView) view.findViewById(R.id.title);
        View findViewById5 = view.findViewById(R.id.a1p);
        View findViewById6 = view.findViewById(R.id.q9);
        View findViewById7 = view.findViewById(R.id.chg);
        l.b(findViewById7, str2);
        this.f90843a = (TuxSpinner) findViewById7;
        l.b(textView2, str2);
        Bundle arguments = getArguments();
        String str3 = null;
        if (arguments != null) {
            str = arguments.getString("title");
        } else {
            str = null;
        }
        textView2.setText(str);
        TextView textView3 = this.f90847e;
        if (textView3 == null) {
            l.a("submit");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str3 = arguments2.getString("btnName");
        }
        textView3.setText(str3);
        EditText editText = this.f90844b;
        if (editText == null) {
            l.a("etInput");
        }
        editText.setHint(R.string.bt7);
        findViewById5.setOnClickListener(new e(this));
        findViewById6.setOnClickListener(new f(this));
        l.b(findViewById5, str2);
        Bundle arguments3 = getArguments();
        int i3 = 8;
        int i4 = 0;
        if (arguments3 == null || !arguments3.getBoolean("cancelStyle")) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        findViewById5.setVisibility(i2);
        l.b(findViewById6, str2);
        Bundle arguments4 = getArguments();
        if (arguments4 == null || !arguments4.getBoolean("cancelStyle")) {
            i3 = 0;
        }
        findViewById6.setVisibility(i3);
        ImageView imageView = this.f90845c;
        if (imageView == null) {
            l.a("ivClearAll");
        }
        imageView.setOnClickListener(new g(this));
        EditText editText2 = this.f90844b;
        if (editText2 == null) {
            l.a("etInput");
        }
        editText2.addTextChangedListener(new h(this, textView));
        EditText editText3 = this.f90844b;
        if (editText3 == null) {
            l.a("etInput");
        }
        Bundle arguments5 = getArguments();
        if (!(arguments5 == null || (string = arguments5.getString("defaultInput")) == null)) {
            str2 = string;
        }
        editText3.setText(str2);
        EditText editText4 = this.f90844b;
        if (editText4 == null) {
            l.a("etInput");
        }
        EditText editText5 = this.f90844b;
        if (editText5 == null) {
            l.a("etInput");
        }
        Editable editableText = editText5.getEditableText();
        if (!(editableText == null || (obj = editableText.toString()) == null)) {
            i4 = obj.length();
        }
        editText4.setSelection(i4);
        TextView textView4 = this.f90847e;
        if (textView4 == null) {
            l.a("submit");
        }
        textView4.setOnClickListener(new i(this));
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new j(view));
        }
        EditText editText6 = this.f90844b;
        if (editText6 == null) {
            l.a("etInput");
        }
        editText6.postDelayed(new k(this), 200);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.zu, viewGroup, false);
    }
}
