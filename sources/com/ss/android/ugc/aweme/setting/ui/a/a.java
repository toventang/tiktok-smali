package com.ss.android.ugc.aweme.setting.ui.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.page.privacy.sug.SuggestAccountSetApi;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.concurrent.TimeUnit;

public final class a extends com.google.android.material.bottomsheet.b {

    /* renamed from: c  reason: collision with root package name */
    public static final C3181a f122792c = new C3181a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f122793a = true;

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f122794b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f122795d = true;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f122796e;

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final e f122799a = new e();

        static {
            Covode.recordClassIndex(80608);
        }

        e() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(80603);
    }

    private View a(int i2) {
        if (this.f122796e == null) {
            this.f122796e = new SparseArray();
        }
        View view = (View) this.f122796e.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f122796e.put(i2, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.a.a$a  reason: collision with other inner class name */
    public static final class C3181a {
        static {
            Covode.recordClassIndex(80604);
        }

        private C3181a() {
        }

        public /* synthetic */ C3181a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f122796e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122797a;

        static {
            Covode.recordClassIndex(80605);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f122797a = aVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i2;
            Resources resources;
            l.d(textPaint, "");
            Context context = this.f122797a.getContext();
            if (context == null || (resources = context.getResources()) == null) {
                i2 = 0;
            } else {
                i2 = resources.getColor(R.color.bh);
            }
            textPaint.setColor(i2);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            r.a("confirm_link_privacy_pop_up", v.a("click", "result"));
            a.a(this.f122797a).dispose();
            a aVar = this.f122797a;
            boolean z = aVar.f122793a;
            Context context = aVar.getContext();
            if (context == null) {
                l.b();
            }
            l.b(context, "");
            TuxTextCell tuxTextCell = new TuxTextCell(context, null, 0, 6);
            Context context2 = aVar.getContext();
            if (context2 == null) {
                l.b();
            }
            l.b(context2, "");
            c.j jVar = new c.j(context2);
            jVar.c(z);
            jVar.a(new g(jVar));
            tuxTextCell.setAccessory(jVar);
            tuxTextCell.setIcon((com.bytedance.tux.c.a) null);
            tuxTextCell.setTitle(aVar.getString(R.string.dnh));
            tuxTextCell.setSubtitle(aVar.getString(R.string.dng));
            tuxTextCell.setOnClickListener(new h(tuxTextCell));
            a.C1112a aVar2 = new a.C1112a();
            TuxNavBar.a aVar3 = new TuxNavBar.a();
            com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
            String string = aVar.getString(R.string.cbx);
            l.b(string, "");
            TuxNavBar.a b2 = aVar3.a(gVar.a(string)).b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small).a((h.f.a.a<z>) new c(aVar)));
            b2.f45188d = true;
            aVar2.a(b2).a(tuxTextCell).a(new i(aVar)).f45299a.show(aVar.getChildFragmentManager(), "PrivacyDialog");
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122798a;

        static {
            Covode.recordClassIndex(80607);
        }

        d(a aVar) {
            this.f122798a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f122798a.dismissAllowingStateLoss();
        }
    }

    static final class i implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122805a;

        static {
            Covode.recordClassIndex(80614);
        }

        i(a aVar) {
            this.f122805a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f122805a.dismiss();
        }
    }

    static final class h extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ TuxTextCell $cell;

        static {
            Covode.recordClassIndex(80613);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(TuxTextCell tuxTextCell) {
            super(1);
            this.$cell = tuxTextCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
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
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(java.lang.Boolean r2) {
            /*
                r1 = this;
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                r2.booleanValue()
                com.bytedance.tux.table.cell.TuxTextCell r0 = r1.$cell
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.a.a.h.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final /* synthetic */ f.a.b.b a(a aVar) {
        f.a.b.b bVar = aVar.f122794b;
        if (bVar == null) {
            l.a("disposable");
        }
        return bVar;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.a0x);
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122800a;

        static {
            Covode.recordClassIndex(80609);
        }

        f(a aVar) {
            this.f122800a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("confirm_link_privacy_pop_up", v.a("close", "result"));
            a.a(this.f122800a).dispose();
            this.f122800a.dismiss();
        }
    }

    static final class g implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.j f122801a;

        static {
            Covode.recordClassIndex(80610);
        }

        g(c.j jVar) {
            this.f122801a = jVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, final boolean z) {
            String str;
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            int i2 = 1;
            r.a("account_auth_switch", v.a("link", "account_type"), v.a(str, "to_status"), v.a("link_pop_up", "enter_from"));
            if (!z) {
                i2 = 2;
            }
            l.d("sug_to_who_share_link", "");
            ((SuggestAccountSetApi.RealApi) SuggestAccountSetApi.f122529a.getValue()).setSuggestPrivacySettings("sug_to_who_share_link", i2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(AnonymousClass1.f122802a, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.setting.ui.a.a.g.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f122803a;

                static {
                    Covode.recordClassIndex(80612);
                }

                {
                    this.f122803a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    d.a.e.b.a("SuggestAccountPrivacyGuideDialog", "dz[setSuggestPrivacySettings failed]", null);
                    this.f122803a.f122801a.c(!z);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f122795d = arguments.getBoolean("is_sharer");
            this.f122793a = arguments.getBoolean("privacy_toggle");
        }
        f.a.b.b d2 = t.b((Object) true).e(10, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new d(this));
        l.b(d2, "");
        this.f122794b = d2;
        ((LinearLayout) a(R.id.adh)).setOnClickListener(e.f122799a);
        ((TuxIconView) a(R.id.a7l)).setOnClickListener(new f(this));
        TuxTextView tuxTextView = (TuxTextView) a(R.id.boa);
        l.b(tuxTextView, "");
        if (this.f122793a) {
            string = getString(R.string.cbx);
            l.b(string, "");
            if (this.f122795d) {
                string2 = getString(R.string.cwx);
                l.b(string2, "");
            } else {
                string2 = getString(R.string.cww);
                l.b(string2, "");
            }
        } else {
            string = getString(R.string.cbw);
            l.b(string, "");
            if (this.f122795d) {
                string2 = getString(R.string.cwv);
                l.b(string2, "");
            } else {
                string2 = getString(R.string.cwu);
                l.b(string2, "");
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string2);
        if (this.f122793a) {
            spannableStringBuilder.append((CharSequence) " ");
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new b(this), 0, string.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        tuxTextView.setText(spannableStringBuilder);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.boa);
        l.b(tuxTextView2, "");
        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ayl, viewGroup, false);
    }
}
