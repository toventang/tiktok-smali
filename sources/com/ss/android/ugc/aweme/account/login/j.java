package com.ss.android.ugc.aweme.account.login;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.account.base.a.a;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.login.z;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.a.af;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    final h.h f63465a = h.i.a(h.m.NONE, new n(this));

    /* renamed from: b  reason: collision with root package name */
    final h.h f63466b = h.i.a(h.m.NONE, new b(this));

    /* renamed from: c  reason: collision with root package name */
    public Dialog f63467c;

    /* renamed from: d  reason: collision with root package name */
    public Dialog f63468d;

    /* renamed from: e  reason: collision with root package name */
    public Dialog f63469e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.login.a.j f63470f;

    /* renamed from: g  reason: collision with root package name */
    public final int f63471g;

    /* renamed from: h  reason: collision with root package name */
    public final I18nSignUpActivity f63472h;

    /* renamed from: i  reason: collision with root package name */
    public final View f63473i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f63474j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f63475k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f63476l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f63477m;
    private final h.h n = h.i.a(h.m.NONE, new m(this));
    private final h.h o = h.i.a(h.m.NONE, new l(this));
    private final h.h p = h.i.a(h.m.NONE, new a(this));
    private final h.h q = h.i.a(h.m.NONE, new o(this));
    private final boolean r;

    static {
        Covode.recordClassIndex(39112);
    }

    private final TextView b() {
        return (TextView) this.o.getValue();
    }

    private final TextView c() {
        return (TextView) this.q.getValue();
    }

    public final RecyclerView a() {
        return (RecyclerView) this.p.getValue();
    }

    static final class b extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(39114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.f63472h.findViewById(R.id.an6);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(39124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f63473i.findViewById(R.id.cfr);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(39125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.f63472h.findViewById(R.id.a4m);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(39126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f63472h.findViewById(R.id.em8);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(39127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f63473i.findViewById(R.id.f_c);
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(39113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            RecyclerView recyclerView = (RecyclerView) this.this$0.f63473i.findViewById(R.id.a4n);
            RecyclerView recyclerView2 = (RecyclerView) this.this$0.f63473i.findViewById(R.id.a4o);
            if (this.this$0.f63477m) {
                h.f.b.l.b(recyclerView, "");
                recyclerView.setVisibility(8);
                h.f.b.l.b(recyclerView2, "");
                recyclerView2.setVisibility(0);
                recyclerView2.setNestedScrollingEnabled(true);
                return recyclerView2;
            }
            h.f.b.l.b(recyclerView, "");
            recyclerView.setVisibility(0);
            h.f.b.l.b(recyclerView2, "");
            recyclerView2.setVisibility(8);
            return recyclerView;
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.account.login.a.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63479a;

        static {
            Covode.recordClassIndex(39116);
        }

        @Override // com.ss.android.ugc.aweme.account.login.a.l
        public final void a() {
            r.onEventV3("signup_channel_unfold");
            List<? extends com.ss.android.ugc.aweme.account.login.a.h> g2 = h.a.n.g((Collection) this.f63479a.f63472h.q());
            com.ss.android.ugc.aweme.account.login.a.j a2 = j.a(this.f63479a);
            h.j.g a3 = h.j.h.a(0, g2.size() - Math.min(this.f63479a.f63471g, this.f63479a.f63472h.q().size()));
            ArrayList arrayList = new ArrayList(h.a.n.a(a3, 10));
            Iterator it = a3.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((af) it).a() + this.f63479a.f63471g));
            }
            a2.a(arrayList);
            j.a(this.f63479a).b(g2);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(j jVar) {
            this.f63479a = jVar;
        }
    }

    public static final class h implements com.ss.android.ugc.aweme.account.login.a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63483a;

        static {
            Covode.recordClassIndex(39120);
        }

        @Override // com.ss.android.ugc.aweme.account.login.a.c
        public final void a() {
            String e2 = this.f63483a.f63472h.e();
            h.f.b.l.b(e2, "");
            String f2 = this.f63483a.f63472h.f();
            h.f.b.l.b(f2, "");
            h.f.b.l.d(e2, "");
            h.f.b.l.d(f2, "");
            r.a("click_guestmode", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", e2).a("enter_method", f2).f66730a);
            IGuestModeService d2 = GuestModeServiceImpl.d();
            I18nSignUpActivity i18nSignUpActivity = this.f63483a.f63472h;
            Bundle bundle = new Bundle();
            bundle.putString("enter_method", this.f63483a.f63472h.f());
            bundle.putString("enter_from", this.f63483a.f63472h.e());
            d2.a(i18nSignUpActivity, bundle);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(j jVar) {
            this.f63483a = jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$j  reason: collision with other inner class name */
    public static final class C1413j implements com.ss.android.ugc.aweme.account.login.a.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63485a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IGuestModeService f63486b;

        static {
            Covode.recordClassIndex(39122);
        }

        @Override // com.ss.android.ugc.aweme.account.login.a.l
        public final void a() {
            r.onEventV3("signup_channel_unfold");
            List<? extends com.ss.android.ugc.aweme.account.login.a.h> g2 = h.a.n.g((Collection) this.f63485a.f63472h.p());
            com.ss.android.ugc.aweme.account.login.a.j a2 = j.a(this.f63485a);
            h.j.g a3 = h.j.h.a(0, g2.size() - Math.min(this.f63485a.f63471g, this.f63485a.f63472h.p().size()));
            ArrayList arrayList = new ArrayList(h.a.n.a(a3, 10));
            Iterator it = a3.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((af) it).a() + this.f63485a.f63471g));
            }
            a2.a(arrayList);
            if (this.f63486b.b() && !this.f63486b.c()) {
                g2.add(com.ss.android.ugc.aweme.account.login.a.b.f63249a);
            }
            this.f63485a.f63472h.f63188c = true;
            this.f63485a.f63472h.a(this.f63485a.f63474j);
            j.a(this.f63485a).b(g2);
        }

        C1413j(j jVar, IGuestModeService iGuestModeService) {
            this.f63485a = jVar;
            this.f63486b = iGuestModeService;
        }
    }

    private final void d() {
        int i2;
        IGuestModeService d2 = GuestModeServiceImpl.d();
        I18nSignUpActivity i18nSignUpActivity = this.f63472h;
        TextView c2 = c();
        e eVar = new e(this);
        f fVar = new f(this);
        g gVar = new g(this);
        if (z.f65126a.contains(com.ss.android.ugc.aweme.language.d.a().toUpperCase())) {
            if (!this.f63474j || !d2.b() || d2.c()) {
                i2 = R.string.atc;
            } else {
                i2 = R.string.atb;
            }
        } else if (!this.f63474j || !d2.b() || d2.c()) {
            i2 = R.string.atk;
        } else {
            i2 = R.string.atj;
        }
        try {
            String string = i18nSignUpActivity.getString(R.string.atf);
            String string2 = i18nSignUpActivity.getString(R.string.ate);
            String string3 = i18nSignUpActivity.getString(R.string.atd);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i18nSignUpActivity.getString(i2, string, string2, string3));
            int c3 = androidx.core.content.b.c(i18nSignUpActivity, R.color.a2);
            int c4 = androidx.core.content.b.c(i18nSignUpActivity, R.color.a2);
            z.AnonymousClass6 r9 = new com.ss.android.ugc.aweme.account.views.c(c3, c4, eVar) {
                /* class com.ss.android.ugc.aweme.account.login.z.AnonymousClass6 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View.OnClickListener f65132a;

                static {
                    Covode.recordClassIndex(40033);
                }

                public final void onClick(View view) {
                    View.OnClickListener onClickListener = this.f65132a;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }

                @Override // com.ss.android.ugc.aweme.account.views.c
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setFakeBoldText(true);
                    textPaint.setUnderlineText(false);
                }

                {
                    this.f65132a = r3;
                }
            };
            z.AnonymousClass7 r7 = new com.ss.android.ugc.aweme.account.views.c(c3, c4, fVar) {
                /* class com.ss.android.ugc.aweme.account.login.z.AnonymousClass7 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View.OnClickListener f65133a;

                static {
                    Covode.recordClassIndex(40034);
                }

                public final void onClick(View view) {
                    View.OnClickListener onClickListener = this.f65133a;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }

                @Override // com.ss.android.ugc.aweme.account.views.c
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setFakeBoldText(true);
                    textPaint.setUnderlineText(false);
                }

                {
                    this.f65133a = r3;
                }
            };
            z.AnonymousClass8 r6 = new com.ss.android.ugc.aweme.account.views.c(c3, c4, gVar) {
                /* class com.ss.android.ugc.aweme.account.login.z.AnonymousClass8 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View.OnClickListener f65134a;

                static {
                    Covode.recordClassIndex(40035);
                }

                public final void onClick(View view) {
                    View.OnClickListener onClickListener = this.f65134a;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }

                @Override // com.ss.android.ugc.aweme.account.views.c
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setFakeBoldText(true);
                    textPaint.setUnderlineText(false);
                }

                {
                    this.f65134a = r3;
                }
            };
            String lowerCase = spannableStringBuilder.toString().toLowerCase(Locale.getDefault());
            int indexOf = lowerCase.indexOf(string.toLowerCase(Locale.getDefault()));
            int indexOf2 = lowerCase.indexOf(string2.toLowerCase(Locale.getDefault()));
            int indexOf3 = lowerCase.indexOf(string3.toLowerCase(Locale.getDefault()));
            if (indexOf < 0 || indexOf2 < 0) {
                com.ss.android.ugc.aweme.account.m.b.a("text_highlight_not_match", "", new com.ss.android.ugc.aweme.app.f.c().a("enter_from", "login").a());
            }
            spannableStringBuilder.setSpan(r9, indexOf, string.length() + indexOf, 34);
            spannableStringBuilder.setSpan(r7, indexOf2, string2.length() + indexOf2, 34);
            if (indexOf3 >= 0) {
                spannableStringBuilder.setSpan(r6, indexOf3, string3.length() + indexOf3, 34);
            }
            c2.setHighlightColor(androidx.core.content.b.c(i18nSignUpActivity, R.color.c9));
            c2.setText(spannableStringBuilder);
            c2.setMovementMethod(com.ss.android.ugc.aweme.account.views.a.a());
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static final class k extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63487a;

        static {
            Covode.recordClassIndex(39123);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(j jVar) {
            this.f63487a = jVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            View childAt = this.f63487a.a().getChildAt(0);
            if (childAt != null && childAt.getParent() != null) {
                RecyclerView.ViewHolder a2 = this.f63487a.a().a(childAt);
                float f2 = 1.0f;
                if (a2 instanceof com.ss.android.ugc.aweme.account.login.a.e) {
                    com.ss.android.ugc.aweme.account.login.a.e eVar = (com.ss.android.ugc.aweme.account.login.a.e) a2;
                    if (eVar.f63259a.getHeight() > 0) {
                        int top = eVar.f63260b.getTop();
                        int top2 = eVar.f63259a.getTop();
                        if (top >= 0) {
                            f2 = 0.0f;
                        } else if (top > (-(eVar.f63259a.getHeight() + top2))) {
                            f2 = ((float) (Math.abs(top) - top2)) / ((float) eVar.f63259a.getHeight());
                        }
                    }
                }
                ((TextView) this.f63487a.f63465a.getValue()).setAlpha(f2);
                ((View) this.f63487a.f63466b.getValue()).setAlpha(f2);
            }
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.account.login.a.j a(j jVar) {
        com.ss.android.ugc.aweme.account.login.a.j jVar2 = jVar.f63470f;
        if (jVar2 == null) {
            h.f.b.l.a("adapter");
        }
        return jVar2;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63478a;

        static {
            Covode.recordClassIndex(39115);
        }

        c(j jVar) {
            this.f63478a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f63478a.f63475k || this.f63478a.f63476l) {
                I18nSignUpActivity i18nSignUpActivity = this.f63478a.f63472h;
                if ((i18nSignUpActivity instanceof I18nSignUpActivity) && i18nSignUpActivity != null) {
                    i18nSignUpActivity.o();
                    i18nSignUpActivity.b("click_login_signup");
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.account.n.m.a(this.f63478a.f63472h).withParam(new Bundle(this.f63478a.f63472h.h())).open();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63480a;

        static {
            Covode.recordClassIndex(39117);
        }

        e(j jVar) {
            this.f63480a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f63480a.f63472h.isFinishing()) {
                if (this.f63480a.f63467c == null) {
                    j jVar = this.f63480a;
                    a.C1386a aVar = new a.C1386a();
                    aVar.f62886a = com.ss.android.ugc.aweme.account.util.o.a("terms-of-use");
                    jVar.f63467c = aVar.a(this.f63480a.f63472h);
                }
                Dialog dialog = this.f63480a.f63467c;
                if (dialog == null) {
                    h.f.b.l.b();
                }
                dialog.show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63481a;

        static {
            Covode.recordClassIndex(39118);
        }

        f(j jVar) {
            this.f63481a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f63481a.f63472h.isFinishing()) {
                if (this.f63481a.f63468d == null) {
                    j jVar = this.f63481a;
                    a.C1386a aVar = new a.C1386a();
                    aVar.f62886a = com.ss.android.ugc.aweme.account.util.o.a("privacy-policy");
                    jVar.f63468d = aVar.a(this.f63481a.f63472h);
                }
                Dialog dialog = this.f63481a.f63468d;
                if (dialog == null) {
                    h.f.b.l.b();
                }
                dialog.show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63482a;

        static {
            Covode.recordClassIndex(39119);
        }

        g(j jVar) {
            this.f63482a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f63482a.f63472h.isFinishing()) {
                if (this.f63482a.f63469e == null) {
                    j jVar = this.f63482a;
                    a.C1386a aVar = new a.C1386a();
                    aVar.f62886a = com.ss.android.ugc.aweme.account.util.o.a("cookie-policy");
                    jVar.f63469e = aVar.a(this.f63482a.f63472h);
                }
                Dialog dialog = this.f63482a.f63469e;
                if (dialog == null) {
                    h.f.b.l.b();
                }
                dialog.show();
            }
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63484a;

        static {
            Covode.recordClassIndex(39121);
        }

        i(j jVar) {
            this.f63484a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            I18nSignUpActivity i18nSignUpActivity = this.f63484a.f63472h;
            if ((i18nSignUpActivity instanceof I18nSignUpActivity) && i18nSignUpActivity != null) {
                i18nSignUpActivity.o();
                i18nSignUpActivity.b("click_login_signup");
            }
            r.a("click_login", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", this.f63484a.f63472h.f()).f62575a);
        }
    }

    private final SpannableStringBuilder a(int i2, int i3) {
        String string = this.f63472h.getString(i3);
        h.f.b.l.b(string, "");
        String string2 = this.f63472h.getString(i2, new Object[]{string});
        h.f.b.l.b(string2, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int a2 = p.a((CharSequence) string2, string, 0, false, 6);
        int c2 = androidx.core.content.b.c(this.f63472h, R.color.bh);
        spannableStringBuilder.setSpan(new I18nLoginViewV2$getBottomText$1(c2, c2), a2, string.length() + a2, 34);
        return spannableStringBuilder;
    }

    public j(I18nSignUpActivity i18nSignUpActivity, View view, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        List g2;
        h.f.b.l.d(i18nSignUpActivity, "");
        h.f.b.l.d(view, "");
        this.f63472h = i18nSignUpActivity;
        this.f63473i = view;
        this.f63474j = z;
        this.r = z2;
        this.f63475k = z3;
        this.f63476l = z4;
        this.f63477m = z5;
        int r2 = i18nSignUpActivity.r();
        this.f63471g = r2;
        a().a(new k(this));
        b().setOnTouchListener(new com.ss.android.ugc.aweme.ai.a(0.5f));
        if (z) {
            List g3 = h.a.n.g((Collection) i18nSignUpActivity.p().subList(0, Math.min(i18nSignUpActivity.r(), i18nSignUpActivity.p().size())));
            if (i18nSignUpActivity.p().size() > i18nSignUpActivity.r()) {
                g3.add(com.ss.android.ugc.aweme.account.login.a.k.f63301a);
                i18nSignUpActivity.f63188c = false;
            }
            IGuestModeService d2 = GuestModeServiceImpl.d();
            if (d2.b() && !d2.c()) {
                g3.add(com.ss.android.ugc.aweme.account.login.a.b.f63249a);
            }
            com.ss.android.ugc.aweme.account.login.a.j jVar = new com.ss.android.ugc.aweme.account.login.a.j(g3, z, 1, z2, z5);
            this.f63470f = jVar;
            h hVar = new h(this);
            h.f.b.l.d(hVar, "");
            jVar.f63293a = hVar;
            RecyclerView a2 = a();
            com.ss.android.ugc.aweme.account.login.a.j jVar2 = this.f63470f;
            if (jVar2 == null) {
                h.f.b.l.a("adapter");
            }
            a2.setAdapter(jVar2);
            a().setLayoutManager(new LinearLayoutManager());
            b().setText(a(R.string.aqj, R.string.aqk));
            b().setOnClickListener(new i(this));
            d();
            com.ss.android.ugc.aweme.account.login.a.j jVar3 = this.f63470f;
            if (jVar3 == null) {
                h.f.b.l.a("adapter");
            }
            jVar3.a(new C1413j(this, d2));
        } else {
            if (com.ss.android.ugc.aweme.account.experiment.j.b()) {
                g2 = h.a.n.g((Collection) i18nSignUpActivity.q().subList(0, Math.min(r2, i18nSignUpActivity.q().size())));
            } else {
                g2 = h.a.n.g((Collection) i18nSignUpActivity.q());
            }
            c().setVisibility(8);
            if (com.ss.android.ugc.aweme.account.experiment.j.a()) {
                c().setVisibility(0);
                d();
            }
            if (com.ss.android.ugc.aweme.account.experiment.j.b() && i18nSignUpActivity.q().size() > r2) {
                g2.add(com.ss.android.ugc.aweme.account.login.a.k.f63301a);
            }
            this.f63470f = new com.ss.android.ugc.aweme.account.login.a.j(g2, false, r2, z2, z5);
            RecyclerView a3 = a();
            com.ss.android.ugc.aweme.account.login.a.j jVar4 = this.f63470f;
            if (jVar4 == null) {
                h.f.b.l.a("adapter");
            }
            a3.setAdapter(jVar4);
            b().setOnClickListener(new c(this));
            com.ss.android.ugc.aweme.account.login.a.j jVar5 = this.f63470f;
            if (jVar5 == null) {
                h.f.b.l.a("adapter");
            }
            jVar5.a(new d(this));
            b().setText(a(R.string.aow, R.string.aox));
            view.setBackgroundResource(R.color.f159928l);
            a().setLayoutManager(new LinearLayoutManager());
        }
        com.ss.android.ugc.aweme.account.login.a.j jVar6 = this.f63470f;
        if (jVar6 == null) {
            h.f.b.l.a("adapter");
        }
        jVar6.notifyDataSetChanged();
    }
}
