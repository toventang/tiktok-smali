package com.ss.android.ugc.aweme.donation.detail;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class b extends Fragment implements h.a, com.ss.android.ugc.aweme.common.e.c<com.ss.android.ugc.aweme.donation.e> {

    /* renamed from: e  reason: collision with root package name */
    public static final String f82970e = "DonationFragment";

    /* renamed from: f  reason: collision with root package name */
    public static int f82971f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static final a f82972g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final e f82973a = new e();

    /* renamed from: b  reason: collision with root package name */
    public boolean f82974b;

    /* renamed from: c  reason: collision with root package name */
    public a f82975c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f82976d;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f82977h = h.i.a((h.f.a.a) new f(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f82978i = h.i.a((h.f.a.a) new g(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f82979j = h.i.a((h.f.a.a) new i(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f82980k = h.i.a((h.f.a.a) new s(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f82981l = h.i.a((h.f.a.a) new C1950b(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f82982m = h.i.a((h.f.a.a) new d(this));
    private final h.h n = h.i.a((h.f.a.a) new j(this));
    private final h.h o = h.i.a((h.f.a.a) new q(this));
    private final h.h p = h.i.a((h.f.a.a) new e(this));
    private final h.h q = h.i.a((h.f.a.a) new h(this));
    private final h.h r = h.i.a((h.f.a.a) new k(this));
    private final h.h s = h.i.a((h.f.a.a) new c(this));
    private SparseArray t;

    private View a(int i2) {
        if (this.t == null) {
            this.t = new SparseArray();
        }
        View view = (View) this.t.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.t.put(i2, findViewById);
        return findViewById;
    }

    private final Integer p() {
        return (Integer) this.n.getValue();
    }

    private final Integer q() {
        return (Integer) this.q.getValue();
    }

    public final String a() {
        return (String) this.f82977h.getValue();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    public final String c() {
        return (String) this.f82978i.getValue();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<com.ss.android.ugc.aweme.donation.e> list, boolean z) {
    }

    public final String d() {
        return (String) this.f82979j.getValue();
    }

    public final String h() {
        return (String) this.f82981l.getValue();
    }

    public final Aweme i() {
        return (Aweme) this.f82982m.getValue();
    }

    public final String j() {
        return (String) this.o.getValue();
    }

    public final String k() {
        return (String) this.p.getValue();
    }

    public final String m() {
        return (String) this.r.getValue();
    }

    public final String n() {
        return (String) this.s.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51733);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void o() {
        if (!this.f82976d) {
            this.f82976d = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        a aVar = this.f82975c;
        if (aVar == null) {
            h.f.b.l.a("mAdapter");
        }
        aVar.ag_();
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$b  reason: collision with other inner class name */
    static final class C1950b extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1950b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return arguments.getString("aid");
            }
            return null;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Aweme> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Aweme invoke() {
            IAwemeService b2 = AwemeService.b();
            String h2 = this.this$0.h();
            if (h2 == null) {
                h2 = "";
            }
            return b2.b(h2);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return arguments.getString("sticker_id");
            }
            return null;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (string = arguments.getString("enter_from", "")) == null) {
                return "";
            }
            return string;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51739);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (string = arguments.getString("enter_method", "")) == null) {
                return "";
            }
            return string;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return Integer.valueOf(arguments.getInt(StringSet.type, 0));
            }
            return null;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51742);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return Integer.valueOf(arguments.getInt("ngo_id", 0));
            }
            return null;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51750);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return arguments.getString("profile_uid");
            }
            return null;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.this$0.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("should_dim_bg", false);
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(51732);
    }

    private final void r() {
        a aVar = this.f82975c;
        if (aVar == null) {
            h.f.b.l.a("mAdapter");
        }
        aVar.ah_();
        a aVar2 = this.f82975c;
        if (aVar2 == null) {
            h.f.b.l.a("mAdapter");
        }
        aVar2.d(false);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        ((DmtStatusView) a(R.id.e_o)).f();
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.d1p);
        h.f.b.l.b(constraintLayout, "");
        constraintLayout.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        this.f82973a.a(4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f82973a.h();
        this.f82973a.cd_();
        super.onDestroyView();
        SparseArray sparseArray = this.t;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String h2;
            String k2 = this.this$0.k();
            if ((k2 == null || k2.length() == 0) && (h2 = this.this$0.h()) != null && h2.length() != 0) {
                return "donation_sticker";
            }
            String k3 = this.this$0.k();
            if (k3 == null || k3.length() == 0) {
                return "";
            }
            return "donation_effect";
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null && (string = arguments.getString("log_pb")) != null) {
                return string;
            }
            ac acVar = ac.a.f91473a;
            String h2 = this.this$0.h();
            Bundle arguments2 = this.this$0.getArguments();
            int i2 = -1;
            if (arguments2 != null) {
                i2 = arguments2.getInt("page_type", -1);
            }
            String a2 = acVar.a(com.ss.android.ugc.aweme.metrics.ac.a(h2, i2));
            if (a2 == null) {
                return "";
            }
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        a aVar = this.f82975c;
        if (aVar == null) {
            h.f.b.l.a("mAdapter");
        }
        if (aVar.v) {
            a aVar2 = this.f82975c;
            if (aVar2 == null) {
                h.f.b.l.a("mAdapter");
            }
            aVar2.d(false);
            a aVar3 = this.f82975c;
            if (aVar3 == null) {
                h.f.b.l.a("mAdapter");
            }
            aVar3.notifyDataSetChanged();
            r();
        }
        a(true);
    }

    static final class k extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51743);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            T t;
            List<InteractStickerStruct> interactStickerStructs;
            T t2;
            Bundle arguments = this.this$0.getArguments();
            String str = null;
            if (arguments == null || arguments.getString("ngo_name") == null) {
                Aweme i2 = this.this$0.i();
                if (i2 == null || (interactStickerStructs = i2.getInteractStickerStructs()) == null) {
                    t = null;
                } else {
                    Iterator<T> it = interactStickerStructs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it.next();
                        T t3 = t2;
                        h.f.b.l.b(t3, "");
                        if (t3.getType() == 6) {
                            break;
                        }
                    }
                    t = t2;
                    if (t != null) {
                        str = t.getAttr();
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                if (t == null) {
                    h.f.b.l.b();
                }
                return new JSONObject(t.getAttr()).optString("donation_name", "");
            }
            Bundle arguments2 = this.this$0.getArguments();
            if (arguments2 != null) {
                return arguments2.getString("ngo_name");
            }
            return null;
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82994a;

        static {
            Covode.recordClassIndex(51749);
        }

        p(b bVar) {
            this.f82994a = bVar;
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
                com.ss.android.ugc.aweme.donation.detail.b r0 = r1.f82994a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.donation.detail.b.p.onClick(android.view.View):void");
        }
    }

    public static final class r extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82995a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82996b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f82997c;

        static {
            Covode.recordClassIndex(51751);
        }

        public final void updateDrawState(TextPaint textPaint) {
            h.f.b.l.d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f82997c);
        }

        public final void onClick(View view) {
            h.f.b.l.d(view, "");
            b bVar = this.f82995a;
            bVar.a(this.f82996b, bVar.a());
        }

        r(b bVar, String str, int i2) {
            this.f82995a = bVar;
            this.f82996b = str;
            this.f82997c = i2;
        }
    }

    public static final class m extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f82986b;

        static {
            Covode.recordClassIndex(51745);
        }

        public final void onClick(View view) {
            h.f.b.l.d(view, "");
            this.f82985a.a(com.ss.android.ugc.aweme.donation.d.a().f82964a, this.f82985a.a());
        }

        public final void updateDrawState(TextPaint textPaint) {
            h.f.b.l.d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f82986b);
            textPaint.setUnderlineText(false);
        }

        m(b bVar, int i2) {
            this.f82985a = bVar;
            this.f82986b = i2;
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82987a;

        static {
            Covode.recordClassIndex(51746);
        }

        n(b bVar) {
            this.f82987a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f82987a.f82973a.a(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        a aVar = this.f82975c;
        if (aVar == null) {
            h.f.b.l.a("mAdapter");
        }
        aVar.a((RecyclerView) a(R.id.aom), false);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        a aVar = this.f82975c;
        if (aVar == null) {
            h.f.b.l.a("mAdapter");
        }
        if (aVar.v) {
            a aVar2 = this.f82975c;
            if (aVar2 == null) {
                h.f.b.l.a("mAdapter");
            }
            aVar2.d(false);
            a aVar3 = this.f82975c;
            if (aVar3 == null) {
                h.f.b.l.a("mAdapter");
            }
            aVar3.notifyDataSetChanged();
        }
        ((DmtStatusView) a(R.id.e_o)).h();
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.d1p);
        h.f.b.l.b(constraintLayout, "");
        constraintLayout.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        String h2 = h();
        String str2 = "";
        if (h2 == null) {
            h2 = str2;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", h2);
        Aweme i2 = i();
        if ((i2 == null || (str = i2.getAuthorUid()) == null) && (str = j()) == null) {
            str = str2;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str);
        Integer p2 = p();
        if (p2 != null) {
            str2 = p2;
        }
        com.ss.android.ugc.aweme.common.r.a("donation_panel_show", a3.a("ngo_id", (Object) str2).a("enter_from", a()).a("enter_method", c()).a("log_pb", d()).a("ngo_name", m()).a("anchor_type", n()).f66730a);
    }

    /* access modifiers changed from: package-private */
    public static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82983a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.donation.a f82984b;

        static {
            Covode.recordClassIndex(51744);
        }

        l(b bVar, com.ss.android.ugc.aweme.donation.a aVar) {
            this.f82983a = bVar;
            this.f82984b = aVar;
        }

        public final void onClick(View view) {
            String authorUid;
            ClickAgent.onClick(view);
            this.f82983a.o();
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            String h2 = this.f82983a.h();
            String str = "";
            if (h2 == null) {
                h2 = str;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", h2);
            Aweme i2 = this.f82983a.i();
            if (!(i2 == null || (authorUid = i2.getAuthorUid()) == null)) {
                str = authorUid;
            }
            com.ss.android.ugc.aweme.common.r.a("donation_h5_entrance_click", a2.a("author_id", str).a("enter_from", this.f82983a.a()).a("ngo_name", this.f82983a.m()).a("enter_method", "donation_panel").a("log_pb", this.f82983a.d()).f66730a);
            com.ss.android.ugc.aweme.donation.a aVar = this.f82984b;
            if (aVar != null && aVar.f82956a != null) {
                String str2 = this.f82984b.f82956a;
                if (str2 == null) {
                    h.f.b.l.b();
                }
                if (str2.length() > 0) {
                    this.f82983a.a(this.f82984b.f82956a, this.f82983a.a());
                }
            }
        }
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82988a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f82989b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f82990c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f82991d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.c f82992e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ JSONObject f82993f;

        static {
            Covode.recordClassIndex(51747);
        }

        o(b bVar, View view, Context context, z.e eVar, z.c cVar, JSONObject jSONObject) {
            this.f82988a = bVar;
            this.f82989b = view;
            this.f82990c = context;
            this.f82991d = eVar;
            this.f82992e = cVar;
            this.f82993f = jSONObject;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(this.f82989b, 1200)) {
                T t = this.f82988a.f82973a.f76396h;
                h.f.b.l.b(t, "");
                com.ss.android.ugc.aweme.donation.f fVar = t.mData.f82958a;
                String str4 = null;
                if (fVar != null) {
                    str = fVar.f83029b;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f82990c).a(this.f82990c.getString(R.string.bb3)).a();
                    return;
                }
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                String h2 = this.f82988a.h();
                if (h2 == null) {
                    h2 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", h2);
                Aweme i2 = this.f82988a.i();
                if (i2 == null || (str2 = i2.getAuthorUid()) == null) {
                    str2 = this.f82988a.j();
                    if (str2 == null) {
                        str2 = "";
                    }
                    h.f.b.l.b(str2, "");
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str2);
                T t2 = this.f82988a.f82973a.f76396h;
                h.f.b.l.b(t2, "");
                com.ss.android.ugc.aweme.donation.f fVar2 = t2.mData.f82958a;
                if (fVar2 != null) {
                    str3 = fVar2.f83029b;
                } else {
                    str3 = null;
                }
                com.ss.android.ugc.aweme.common.r.a("donation_panel_donate_click", a3.a("link", str3).a("link_type", "nonprofit").a("enter_from", this.f82988a.a()).a("enter_method", this.f82988a.c()).a("log_pb", this.f82988a.d()).a("ngo_name", this.f82988a.m()).a("anchor_type", this.f82988a.n()).f66730a);
                this.f82988a.o();
                this.f82988a.f82974b = true;
                if (this.f82991d.element != null && this.f82992e.element > 0) {
                    androidx.fragment.app.e activity = this.f82988a.getActivity();
                    T t3 = this.f82991d.element;
                    int i3 = this.f82992e.element;
                    T t4 = this.f82988a.f82973a.f76396h;
                    h.f.b.l.b(t4, "");
                    com.ss.android.ugc.aweme.donation.f fVar3 = t4.mData.f82958a;
                    if (fVar3 != null) {
                        str4 = fVar3.f83029b;
                    }
                    com.ss.android.ugc.aweme.donation.token.a.a(activity, t3, i3, str4, this.f82993f.toString(), new h.f.a.b<String, h.z>(this) {
                        /* class com.ss.android.ugc.aweme.donation.detail.b.o.AnonymousClass1 */
                        final /* synthetic */ o this$0;

                        static {
                            Covode.recordClassIndex(51748);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ h.z invoke(String str) {
                            this.this$0.f82988a.a(str, this.this$0.f82988a.a());
                            return h.z.f158842a;
                        }
                    });
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r14) {
        /*
        // Method dump skipped, instructions count: 762
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.donation.detail.b.a(boolean):void");
    }

    private static View a(Context context, int i2) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(R.attr.bj);
        tuxTextView.setText(i2);
        return tuxTextView;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<com.ss.android.ugc.aweme.donation.e> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            a aVar = this.f82975c;
            if (aVar == null) {
                h.f.b.l.a("mAdapter");
            }
            aVar.d(false);
        } else {
            a aVar2 = this.f82975c;
            if (aVar2 == null) {
                h.f.b.l.a("mAdapter");
            }
            aVar2.ai_();
        }
        a aVar3 = this.f82975c;
        if (aVar3 == null) {
            h.f.b.l.a("mAdapter");
        }
        aVar3.b(list);
    }

    public final void a(String str, String str2) {
        String str3;
        h.f.b.l.d(str2, "");
        if (getActivity() != null || getContext() != null) {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            Context context = getContext();
            if (context == null || (str3 = context.getString(R.string.bav)) == null) {
                str3 = "";
            }
            bundle.putString("title", str3);
            bundle.putString("enter_from", str2);
            bundle.putString("hide_more", "false");
            Context activity = getActivity();
            if (activity == null && (activity = getContext()) == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            DonationWebPageDialogActivity.a.a(activity, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<com.ss.android.ugc.aweme.donation.e> list, boolean z) {
        a aVar = this.f82975c;
        if (aVar == null) {
            h.f.b.l.a("mAdapter");
        }
        aVar.d(true);
        if (!z) {
            r();
        } else {
            a aVar2 = this.f82975c;
            if (aVar2 == null) {
                h.f.b.l.a("mAdapter");
            }
            aVar2.ai_();
        }
        a(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long l2;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        View a2 = a(context, (int) R.string.cyt);
        a2.setOnClickListener(new n(this));
        DmtStatusView.a c2 = DmtStatusView.a.a(context).b(a(context, (int) R.string.bat)).c(a2);
        c2.f33605g = 0;
        ((DmtStatusView) a(R.id.e_o)).setBuilder(c2);
        a aVar = new a(this);
        aVar.a((h.a) this);
        RecyclerView recyclerView = (RecyclerView) a(R.id.aom);
        h.f.b.l.b(recyclerView, "");
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.aom);
        h.f.b.l.b(recyclerView2, "");
        recyclerView2.setAdapter(aVar);
        this.f82975c = aVar;
        z.e eVar = new z.e();
        Long l3 = null;
        eVar.element = null;
        z.c cVar = new z.c();
        cVar.element = -1;
        Integer q2 = q();
        if (q2 != null && q2.intValue() == 4) {
            eVar.element = (T) k();
            cVar.element = 4;
        } else {
            Integer q3 = q();
            if (q3 != null && q3.intValue() == 3) {
                eVar.element = (T) j();
                cVar.element = 3;
            } else {
                Integer q4 = q();
                if (q4 != null && q4.intValue() == 1) {
                    eVar.element = (T) h();
                    cVar.element = 1;
                } else {
                    String h2 = h();
                    if (h2 == null || h2.length() == 0) {
                        String j2 = j();
                        if (j2 == null || j2.length() == 0) {
                            String k2 = k();
                            if (!(k2 == null || k2.length() == 0)) {
                                eVar.element = (T) k();
                                cVar.element = 4;
                            }
                        } else {
                            eVar.element = (T) j();
                            cVar.element = 3;
                        }
                    } else {
                        eVar.element = (T) h();
                        cVar.element = 1;
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        String k3 = k();
        if (!(k3 == null || k3.length() == 0)) {
            try {
                String k4 = k();
                if (k4 != null) {
                    l2 = Long.valueOf(Long.parseLong(k4));
                } else {
                    l2 = null;
                }
                jSONObject.put("effect_id", l2);
            } catch (NumberFormatException unused) {
            }
        }
        ((TuxButton) a(R.id.ao0)).setOnClickListener(new o(this, view, context, eVar, cVar, jSONObject));
        ((TuxIconView) a(R.id.qb)).setOnClickListener(new p(this));
        e eVar2 = this.f82973a;
        long j3 = 0L;
        try {
            T t2 = eVar.element;
            if (t2 != null) {
                l3 = Long.valueOf(Long.parseLong(t2));
            }
            j3 = l3;
        } catch (NumberFormatException unused2) {
        }
        eVar2.a((com.ss.android.ugc.aweme.common.b) new d(h(), p(), j(), j3, Integer.valueOf(cVar.element), jSONObject.toString()));
        eVar2.a_(this);
        eVar2.a(1);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.y4, viewGroup, false);
    }
}
