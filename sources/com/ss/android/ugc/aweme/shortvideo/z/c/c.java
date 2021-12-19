package com.ss.android.ugc.aweme.shortvideo.z.c;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.z.c.b;
import com.ss.android.ugc.aweme.utils.fc;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

public final class c extends com.google.android.material.bottomsheet.a implements androidx.lifecycle.m {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sharedar.g f133053a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f133054b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.fragment.app.e f133055c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f133056d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f133057e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f133058f;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f133059j;

    static {
        Covode.recordClassIndex(86999);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final androidx.lifecycle.n getLifecycle() {
        return (androidx.lifecycle.n) this.f133056d.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.z.d.a b() {
        return (com.ss.android.ugc.aweme.shortvideo.z.d.a) this.f133057e.getValue();
    }

    public final a c() {
        return (a) this.f133058f.getValue();
    }

    static final class n extends h.f.b.m implements h.f.a.a<androidx.lifecycle.n> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(87013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.n invoke() {
            return new androidx.lifecycle.n(this.this$0);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.z.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f133074a = new q();

        static {
            Covode.recordClassIndex(87016);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.z.d.a invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.z.d.a();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<a> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(87000);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(this.this$0.b());
        }
    }

    @Override // androidx.appcompat.app.h
    public final void onStop() {
        getLifecycle().a(i.a.ON_STOP);
        super.onStop();
    }

    public final void dismiss() {
        View view;
        Window window = getWindow();
        if (window != null) {
            view = window.getCurrentFocus();
        } else {
            view = null;
        }
        KeyboardUtils.c(view);
        super.dismiss();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLifecycle().a(i.a.ON_DESTROY);
        b().f133094i.a((CancellationException) null);
    }

    static final class e implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133064a;

        static {
            Covode.recordClassIndex(87004);
        }

        e(c cVar) {
            this.f133064a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            boolean z;
            if (this.f133064a.f133054b) {
                z = this.f133064a.b().f133092g;
            } else {
                z = this.f133064a.b().f133091f;
            }
            if (!z) {
                this.f133064a.c().ah_();
            } else {
                this.f133064a.c().ag_();
            }
            if (this.f133064a.f133054b) {
                com.ss.android.ugc.aweme.shortvideo.z.d.a b2 = this.f133064a.b();
                DmtEditText dmtEditText = (DmtEditText) this.f133064a.findViewById(R.id.dtp);
                h.f.b.l.b(dmtEditText, "");
                b2.a(String.valueOf(dmtEditText.getText()), true);
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.z.d.a.a(this.f133064a.b(), true, null, 2);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<b> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(87015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            DmtStatusView dmtStatusView = (DmtStatusView) this.this$0.findViewById(R.id.e_o);
            h.f.b.l.b(dmtStatusView, "");
            RecyclerView recyclerView = (RecyclerView) this.this$0.findViewById(R.id.clc);
            h.f.b.l.b(recyclerView, "");
            View findViewById = this.this$0.findViewById(R.id.e28);
            h.f.b.l.b(findViewById, "");
            LinearLayout linearLayout = (LinearLayout) this.this$0.findViewById(R.id.cgh);
            h.f.b.l.b(linearLayout, "");
            androidx.fragment.app.e eVar = this.this$0.f133055c;
            c cVar = this.this$0;
            return new b(dmtStatusView, recyclerView, findViewById, linearLayout, eVar, cVar, cVar.b());
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133060a;

        static {
            Covode.recordClassIndex(87001);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(600);
            this.f133060a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            List<com.ss.android.ugc.aweme.shortvideo.z.a.a> value = this.f133060a.b().f133087b.getValue();
            if (value != null) {
                h.f.b.l.b(value, "");
                h.f.a.b<? super List<? extends User>, z> bVar = this.f133060a.f133053a.f124498b;
                if (bVar != null) {
                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) value, 10));
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().f133036a);
                    }
                    bVar.invoke(arrayList);
                }
                this.f133060a.dismiss();
            }
        }
    }

    public static final class h implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133067a;

        static {
            Covode.recordClassIndex(87007);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(c cVar) {
            this.f133067a = cVar;
        }

        public final void afterTextChanged(Editable editable) {
            int i2;
            h.f.b.l.d(editable, "");
            if (editable.length() == 0) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            ImageButton imageButton = (ImageButton) this.f133067a.findViewById(R.id.a71);
            h.f.b.l.b(imageButton, "");
            if (imageButton.getVisibility() != i2) {
                ImageButton imageButton2 = (ImageButton) this.f133067a.findViewById(R.id.a71);
                h.f.b.l.b(imageButton2, "");
                imageButton2.setVisibility(i2);
            }
            String obj = editable.toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj2 = h.m.p.b((CharSequence) obj).toString();
            if (obj2.length() == 0) {
                this.f133067a.b().a(h.a.z.INSTANCE);
                a c2 = this.f133067a.c();
                List<com.ss.android.ugc.aweme.shortvideo.z.a.a> value = this.f133067a.b().f133086a.getValue();
                if (value == null) {
                    value = h.a.z.INSTANCE;
                }
                c2.a(value);
                return;
            }
            if (this.f133067a.c().getItemCount() == 0) {
                ((DmtStatusView) this.f133067a.findViewById(R.id.e_o)).f();
            }
            this.f133067a.b().a(obj2, false);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f133069a = new j();

        static {
            Covode.recordClassIndex(87009);
        }

        j() {
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC3446c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133061a;

        static {
            Covode.recordClassIndex(87002);
        }

        View$OnClickListenerC3446c(c cVar) {
            this.f133061a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f133061a.dismiss();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133065a;

        static {
            Covode.recordClassIndex(87005);
        }

        f(c cVar) {
            this.f133065a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f133065a.dismiss();
        }
    }

    static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133070a;

        static {
            Covode.recordClassIndex(87010);
        }

        k(c cVar) {
            this.f133070a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List<com.ss.android.ugc.aweme.shortvideo.z.a.a> list = (List) obj;
            if (list != null) {
                this.f133070a.f133054b = false;
                this.f133070a.c().a(list);
                this.f133070a.c().ai_();
            }
        }
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133073a;

        static {
            Covode.recordClassIndex(87014);
        }

        o(c cVar) {
            this.f133073a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.login.c.a(this.f133073a.f133055c, "share_page", "share_page");
            this.f133073a.dismiss();
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133068a;

        static {
            Covode.recordClassIndex(87008);
        }

        i(c cVar) {
            this.f133068a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((DmtEditText) this.f133068a.findViewById(R.id.dtp)).setText("");
            ((DmtEditText) this.f133068a.findViewById(R.id.dtp)).clearFocus();
            this.f133068a.b().a(h.a.z.INSTANCE);
            com.ss.android.ugc.aweme.common.f.e.a(this.f133068a.f133055c, this.f133068a.findViewById(R.id.dtp));
        }
    }

    static final class l<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133071a;

        static {
            Covode.recordClassIndex(87011);
        }

        l(c cVar) {
            this.f133071a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            List list = (List) obj;
            c cVar = this.f133071a;
            h.f.b.l.b(list, "");
            Window window = cVar.getWindow();
            if (window != null) {
                view = window.getCurrentFocus();
            } else {
                view = null;
            }
            KeyboardUtils.c(view);
            boolean z = !list.isEmpty();
            TuxButton tuxButton = (TuxButton) cVar.findViewById(R.id.f0o);
            h.f.b.l.b(tuxButton, "");
            tuxButton.setEnabled(z);
        }
    }

    static final class m<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133072a;

        static {
            Covode.recordClassIndex(87012);
        }

        m(c cVar) {
            this.f133072a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            List<com.ss.android.ugc.aweme.shortvideo.z.a.a> list = (List) obj;
            if (list != null) {
                String str2 = this.f133072a.b().f133089d;
                DmtEditText dmtEditText = (DmtEditText) this.f133072a.findViewById(R.id.dtp);
                h.f.b.l.b(dmtEditText, "");
                Editable text = dmtEditText.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                if (h.f.b.l.a((Object) str2, (Object) str)) {
                    this.f133072a.f133054b = true;
                    this.f133072a.c().a(list);
                    this.f133072a.c().ai_();
                }
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        getLifecycle().a(i.a.ON_RESUME);
        super.onCreate(bundle);
        setContentView(R.layout.ep);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.setStatusBarColor(0);
            }
            window.setLayout(-1, -1);
            window.setSoftInputMode(16);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = R.style.u7;
            }
        }
        if (!com.ss.android.ugc.aweme.port.in.g.a().A().b()) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.cjr);
            h.f.b.l.b(linearLayout, "");
            linearLayout.setVisibility(0);
            ((TextView) findViewById(R.id.e48)).setOnClickListener(new o(this));
            TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.cny);
            if (tuxIconView != null) {
                tuxIconView.setOnClickListener(new View$OnClickListenerC3446c(this));
            }
        } else {
            Window window2 = getWindow();
            if (window2 != null) {
                fc.a(window2);
            }
            TuxIconView tuxIconView2 = (TuxIconView) findViewById(R.id.cny);
            if (tuxIconView2 != null) {
                tuxIconView2.setOnClickListener(new f(this));
            }
            ((DmtEditText) findViewById(R.id.dtp)).setHint(R.string.drv);
            ((DmtEditText) findViewById(R.id.dtp)).setOnKeyListener(new g(this));
            ((DmtEditText) findViewById(R.id.dtp)).addTextChangedListener(new h(this));
            ((ImageButton) findViewById(R.id.a71)).setOnClickListener(new i(this));
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.clc);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAdapter(c());
            recyclerView.a(new d(recyclerView, recyclerView.getContext(), this));
            c().d(true);
            c().a("");
            c().a(new e(this));
            ((TuxButton) findViewById(R.id.f0o)).setOnClickListener(new b(this));
            if (!this.f133053a.f124497a) {
                ((TuxButton) findViewById(R.id.f0o)).setText(R.string.fum);
            }
            b bVar = (b) this.f133059j.getValue();
            bVar.f133044a.setBuilder(new DmtStatusView.a(bVar.f133045b).a());
            bVar.f133044a.f();
            bVar.f133047d.f133086a.observe(bVar.f133046c, new b.a(bVar));
            bVar.f133047d.f133088c.observe(bVar.f133046c, new b.C3445b(bVar));
            com.ss.android.ugc.aweme.shortvideo.z.d.a.a(b(), false, j.f133069a, 1);
            b().f133086a.observe(this, new k(this));
            b().f133087b.observe(this, new l(this));
            b().f133088c.observe(this, new m(this));
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.aea);
        h.f.b.l.b(linearLayout2, "");
        linearLayout2.getLayoutParams().height = h.g.a.a(((float) com.ss.android.ugc.aweme.base.utils.i.a(getContext())) * 0.65f);
        ((LinearLayout) findViewById(R.id.aea)).requestLayout();
    }

    public static final class d extends com.ss.android.ugc.aweme.framework.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView f133062a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f133063b;

        static {
            Covode.recordClassIndex(87003);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n, com.ss.android.ugc.aweme.framework.b.a
        public final void a(RecyclerView recyclerView, int i2) {
            View view;
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 == 1) {
                Window window = this.f133063b.getWindow();
                if (window != null) {
                    view = window.getCurrentFocus();
                } else {
                    view = null;
                }
                KeyboardUtils.c(view);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(RecyclerView recyclerView, Context context, c cVar) {
            super(context);
            this.f133062a = recyclerView;
            this.f133063b = cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(androidx.fragment.app.e eVar, h.f.a.b<? super com.ss.android.ugc.aweme.sharedar.g, z> bVar) {
        super(eVar, R.style.u8);
        h.f.b.l.d(eVar, "");
        this.f133055c = eVar;
        com.ss.android.ugc.aweme.sharedar.g gVar = new com.ss.android.ugc.aweme.sharedar.g();
        this.f133053a = gVar;
        if (bVar != null) {
            bVar.invoke(gVar);
        }
        this.f133056d = h.i.a((h.f.a.a) new n(this));
        this.f133057e = h.i.a((h.f.a.a) q.f133074a);
        this.f133058f = h.i.a((h.f.a.a) new a(this));
        this.f133059j = h.i.a((h.f.a.a) new p(this));
    }

    static final class g implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133066a;

        static {
            Covode.recordClassIndex(87006);
        }

        g(c cVar) {
            this.f133066a = cVar;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (i2 != 66) {
                return false;
            }
            com.ss.android.ugc.aweme.common.f.e.a(this.f133066a.f133055c, this.f133066a.findViewById(R.id.dtp));
            return true;
        }
    }
}
