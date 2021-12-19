package com.ss.android.ugc.aweme.profile.editprofile.pronouns.b;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.views.PronounsEditText;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class k extends com.bytedance.assem.arch.d.a implements n {

    /* renamed from: k  reason: collision with root package name */
    public static final d f116200k = new d((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    boolean f116201j;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f116202l = h.i.a((h.f.a.a) new p(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f116203m = h.i.a((h.f.a.a) new o(this));
    private final h.h n = h.i.a((h.f.a.a) new n(this));
    private final h.h o = h.i.a((h.f.a.a) new m(this));
    private final h.h p = h.i.a((h.f.a.a) new C2967k(this));
    private final h.h q = h.i.a((h.f.a.a) new l(this));
    private final h.h r = h.i.a((h.f.a.a) i.f116208a);
    private final h.h s = h.i.a((h.f.a.a) j.f116209a);
    private final com.bytedance.assem.arch.extensions.i t = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));
    private final com.bytedance.assem.arch.viewModel.b u;
    private SparseArray v;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.b, com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.b> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(74976);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.b invoke(com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.b bVar) {
            h.f.b.l.c(bVar, "");
            return bVar;
        }
    }

    static final class r<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final r f116211a = new r();

        static {
            Covode.recordClassIndex(74992);
        }

        r() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class t implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final t f116212a = new t();

        static {
            Covode.recordClassIndex(74994);
        }

        t() {
        }

        public final boolean onLongClick(View view) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(74974);
    }

    private final TuxTextView C() {
        return (TuxTextView) this.q.getValue();
    }

    private final f.a.b.a D() {
        return (f.a.b.a) this.s.getValue();
    }

    public final PronounsEditText u() {
        return (PronounsEditText) this.n.getValue();
    }

    /* access modifiers changed from: package-private */
    public final PowerList v() {
        return (PowerList) this.o.getValue();
    }

    /* access modifiers changed from: package-private */
    public final View w() {
        return (View) this.p.getValue();
    }

    public final f.a.l.b<String> x() {
        return (f.a.l.b) this.r.getValue();
    }

    /* access modifiers changed from: package-private */
    public final d y() {
        return (d) this.t.getValue();
    }

    public final ProfileEditPronounsSearchAndDisplayViewModel z() {
        return (ProfileEditPronounsSearchAndDisplayViewModel) this.u.getValue();
    }

    public static final class d {
        static {
            Covode.recordClassIndex(74978);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.n
    public final boolean A() {
        return this.f116201j;
    }

    static final class i extends h.f.b.m implements h.f.a.a<f.a.l.b<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f116208a = new i();

        static {
            Covode.recordClassIndex(74983);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.l.b<String> invoke() {
            return new f.a.l.b();
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f116209a = new j();

        static {
            Covode.recordClassIndex(74984);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ m e() {
        return new m();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$k  reason: collision with other inner class name */
    static final class C2967k extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(74985);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2967k(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.s().findViewById(R.id.dct);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(74986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.s().findViewById(R.id.dcs);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<PowerList> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(74987);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PowerList invoke() {
            return this.this$0.s().findViewById(R.id.dcz);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<PronounsEditText> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(74988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PronounsEditText invoke() {
            return this.this$0.s().findViewById(R.id.dcu);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(74989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.s().findViewById(R.id.dcw);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(74990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.s().findViewById(R.id.dcv);
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(74996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            ad.b a2 = dagger.hilt.android.internal.b.a.a(com.bytedance.assem.arch.extensions.b.b(this.this$0));
            if (a2 == null) {
                h.f.b.l.b();
            }
            return a2;
        }
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        D().dispose();
        super.p();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(74975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<d> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(74977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.d invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.d> r1 = com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.d.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k.c.invoke():java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.n
    public final String B() {
        ProfileEditPronounsSearchAndDisplayViewModel z = z();
        if (z.f116232k.isEmpty()) {
            return "";
        }
        return h.a.n.a(z.f116232k, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
    }

    static final class s extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ Context $this_apply;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(74993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(Context context, k kVar) {
            super(0);
            this.$this_apply = context;
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.z();
            Context context = this.$this_apply;
            h.f.b.l.d(context, "");
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            h.f.b.l.b(iESSettingsProxy, "");
            FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
            h.f.b.l.b(feedbackConf, "");
            String str = feedbackConf.getNormalEntry().toString();
            int a2 = h.m.p.a((CharSequence) str, "hide_nav_bar", 0, false, 6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(0, a2);
            h.f.b.l.b(substring, "");
            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) substring).append((CharSequence) URLEncoder.encode("id=6420&"));
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring2 = str.substring(a2);
            h.f.b.l.b(substring2, "");
            String spannableStringBuilder2 = append.append((CharSequence) substring2).toString();
            h.f.b.l.b(spannableStringBuilder2, "");
            SmartRouter.buildRoute(context, new com.ss.android.common.util.g(spannableStringBuilder2).a()).open();
            return z.f158842a;
        }
    }

    public k() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        v vVar = new v(this);
        h.k.c a2 = ab.a(ProfileEditPronounsSearchAndDisplayViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.c(this, true), vVar, bVar2, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.d(this, true));
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.c(this, false), vVar, bVar2, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.d(this, false));
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), com.bytedance.assem.arch.extensions.u.a((ag) this, false), vVar, bVar2, com.bytedance.assem.arch.extensions.u.b(this), com.bytedance.assem.arch.extensions.u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.u = bVar;
    }

    public static final class g extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f116206a;

        static {
            Covode.recordClassIndex(74981);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(k kVar) {
            this.f116206a = kVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            if (i2 == 1) {
                KeyboardUtils.c(this.f116206a.u());
            }
        }
    }

    public static final class h implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f116207a;

        static {
            Covode.recordClassIndex(74982);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(k kVar) {
            this.f116207a = kVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            h.f.b.l.d(editable, "");
            k kVar = this.f116207a;
            ProfileEditPronounsSearchAndDisplayViewModel z = kVar.z();
            d y = kVar.y();
            if (y != null) {
                str = y.f116188b;
            } else {
                str = null;
            }
            boolean a2 = h.f.b.l.a((Object) h.a.n.a(z.f116232k, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62), (Object) str);
            boolean z2 = true;
            if (!a2) {
                ((i) com.bytedance.assem.arch.service.d.a(kVar, ab.a(i.class))).w();
            } else {
                ((i) com.bytedance.assem.arch.service.d.a(kVar, ab.a(i.class))).v();
                z2 = false;
            }
            kVar.f116201j = z2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0050  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void beforeTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
            /*
            // Method dump skipped, instructions count: 230
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k.h.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h.f.b.l.d(charSequence, "");
            k kVar = this.f116207a;
            ProfileEditPronounsSearchAndDisplayViewModel z = kVar.z();
            PronounsEditText u = kVar.u();
            h.f.b.l.d(u, "");
            if (z.f116231j.length() != z.n || !z.a((EditText) u, z.f116231j.length())) {
                ProfileEditPronounsSearchAndDisplayViewModel z2 = kVar.z();
                PronounsEditText u2 = kVar.u();
                h.f.b.l.d(u2, "");
                if (z2.a((EditText) u2, z2.f116231j.length() + 20)) {
                    kVar.a(1);
                    return;
                }
                String obj = charSequence.subSequence(this.f116207a.z().f116231j.length(), charSequence.length()).toString();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj2 = h.m.p.b((CharSequence) obj).toString();
                if (obj2.length() == 0) {
                    k kVar2 = this.f116207a;
                    kVar2.w().setVisibility(8);
                    kVar2.v().setVisibility(8);
                    return;
                }
                this.f116207a.x().onNext(obj2);
                return;
            }
            kVar.u().setCursorVisible(false);
            kVar.a(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        int i3;
        if (i2 == 0) {
            i3 = R.string.f08;
        } else if (i2 != 1) {
            i3 = R.string.de2;
        } else {
            i3 = R.string.d31;
        }
        new com.bytedance.tux.g.b(s()).e(i3).b();
    }

    public final void a(List<String> list) {
        v().getState().a();
        if (list.isEmpty()) {
            w().setVisibility(0);
            v().setVisibility(8);
            return;
        }
        v().setVisibility(0);
        w().setVisibility(8);
        com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state = v().getState();
        z();
        h.f.b.l.d(list, "");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(new com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.a(str));
        }
        state.a(arrayList);
    }

    static final class q<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f116210a;

        static {
            Covode.recordClassIndex(74991);
        }

        q(k kVar) {
            this.f116210a = kVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<String> arrayList;
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                ProfileEditPronounsSearchAndDisplayViewModel z = this.f116210a.z();
                h.f.b.l.b(str, "");
                h.f.b.l.d(str, "");
                com.ss.android.ugc.aweme.profile.editprofile.pronouns.c.a aVar = new com.ss.android.ugc.aweme.profile.editprofile.pronouns.c.a(str, z.f116231j.length());
                if (z.f116233l.containsKey(aVar)) {
                    arrayList = z.f116233l.get(aVar);
                    if (arrayList == null) {
                        return;
                    }
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    ArrayList<com.ss.android.ugc.aweme.profile.editprofile.pronouns.c.b> arrayList2 = new ArrayList();
                    int size = z.f116234m.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        int a2 = h.m.p.a((CharSequence) z.f116234m.get(i2), str, 0, true);
                        int size2 = h.m.p.c(z.f116234m.get(i2), new String[]{"/"}).size();
                        if (a2 != -1 && !linkedHashSet.contains(z.f116234m.get(i2)) && size2 <= z.n - z.f116231j.length()) {
                            linkedHashSet.add(z.f116234m.get(i2));
                            arrayList2.add(new com.ss.android.ugc.aweme.profile.editprofile.pronouns.c.b(z.f116234m.get(i2), a2, i2));
                        }
                    }
                    h.a.n.a((List) arrayList2, (Comparator) ProfileEditPronounsSearchAndDisplayViewModel.d.f116239a);
                    arrayList = new ArrayList<>();
                    for (com.ss.android.ugc.aweme.profile.editprofile.pronouns.c.b bVar : arrayList2) {
                        arrayList.add(bVar.f116216a);
                    }
                    z.f116233l.put(aVar, arrayList);
                }
                this.f116210a.a(arrayList);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.n
    public final void b(int i2) {
        int i3;
        boolean z;
        ProfileEditPronounsSearchAndDisplayViewModel z2 = z();
        PronounsEditText u2 = u();
        if (this.v == null) {
            this.v = new SparseArray();
        }
        View view = (View) this.v.get(R.id.fbk);
        if (view == null) {
            View s2 = s();
            if (s2 == null) {
                view = null;
            } else {
                view = s2.findViewById(R.id.fbk);
                this.v.put(R.id.fbk, view);
            }
        }
        h.f.b.l.b(view, "");
        View view2 = (View) this.f116202l.getValue();
        h.f.b.l.d(u2, "");
        h.f.b.l.d(view, "");
        h.f.b.l.d(view2, "");
        if (i2 > 0 && z2.o == null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            int[] iArr = {0, 0};
            view.getLocationInWindow(iArr);
            if (((float) (rect.bottom - iArr[1])) >= i.a.a.a.a.b.a(78.0f)) {
                z = true;
            } else {
                z = false;
            }
            z2.o = Boolean.valueOf(z);
        }
        Boolean bool = z2.o;
        if (bool != null) {
            bool.booleanValue();
            if (i2 > 0) {
                Editable text = u2.getText();
                if (text != null) {
                    i3 = text.length();
                } else {
                    i3 = 0;
                }
                if (i3 != z2.f116231j.length()) {
                    z2.a(false, view2);
                    if (u2.getMaxLines() != 1) {
                        u2.setMaxLines(1);
                        return;
                    }
                    return;
                }
            }
            z2.a(true, view2);
            if (i2 <= 0 && u2.getMaxLines() == 1) {
                u2.setMaxLines(z2.p);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        int i2;
        String str;
        h.f.b.l.d(view, "");
        ProfileEditPronounsSearchAndDisplayViewModel z = z();
        com.ss.android.ugc.aweme.profile.editprofile.pronouns.api.a aVar = (com.ss.android.ugc.aweme.profile.editprofile.pronouns.api.a) com.ss.android.ugc.aweme.profile.editprofile.pronouns.api.b.f116177b.getValue();
        Integer num = aVar.f116174a;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = z.n;
        }
        z.n = i2;
        List<String> list = aVar.f116175b;
        if (list == null) {
            list = z.f116234m;
        }
        z.f116234m = list;
        Context ar_ = ar_();
        if (ar_ != null) {
            ProfileEditPronounsSearchAndDisplayViewModel z2 = z();
            d y = y();
            if (y == null || (str = y.f116188b) == null) {
                str = "";
            }
            h.f.b.l.d(ar_, "");
            h.f.b.l.d(str, "");
            if (!h.f.b.l.a((Object) str, (Object) "")) {
                z2.a(ar_, h.m.p.b(str, new String[]{"/"}));
            }
        }
        f.a.a(this, z(), l.f116213a, (com.bytedance.assem.arch.viewModel.k) null, new u(this), 6);
        Context ar_2 = ar_();
        if (ar_2 != null) {
            String string = ar_2.getString(R.string.f04);
            h.f.b.l.b(string, "");
            String a2 = com.a.a(string, Arrays.copyOf(new Object[]{Integer.valueOf(z().n)}, 1));
            h.f.b.l.b(a2, "");
            ((TuxTextView) this.f116203m.getValue()).setText(a2);
        }
        f.a.b.b a3 = x().f(300, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new q(this), r.f116211a);
        h.f.b.l.b(a3, "");
        f.a.j.a.a(a3, D());
        PronounsEditText u2 = u();
        Editable text = u2.getText();
        if (text != null) {
            u().setSelection(text.length());
        }
        u2.setFocusable(true);
        u2.setFocusableInTouchMode(true);
        u2.requestFocus();
        u2.setOnLongClickListener(t.f116212a);
        u2.setLongClickable(false);
        u2.setTextIsSelectable(false);
        u2.setMovementMethod(com.ss.android.ugc.aweme.profile.editprofile.pronouns.views.a.f116248a);
        u().setOnEditorActionListener(e.f116204a);
        u().addTextChangedListener(new h(this));
        u().setOnFocusChangeListener(f.f116205a);
        PowerList v2 = v();
        v2.a(PronounCell.class);
        v2.setLifecycleOwner(this);
        v2.setItemAnimator(null);
        v().a(new g(this));
        Context ar_3 = ar_();
        if (ar_3 != null) {
            C().setMovementMethod(com.bytedance.tux.f.b.f45048a);
            String string2 = ar_3.getString(R.string.chr);
            h.f.b.l.b(string2, "");
            String string3 = ar_3.getString(R.string.chs);
            h.f.b.l.b(string3, "");
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) string2);
            com.bytedance.tux.f.c a4 = new com.bytedance.tux.f.c().a(string3);
            a4.f45050b = false;
            a4.f45052d = 1;
            a4.f45051c = 42;
            a4.f45054f = new s(ar_3, this);
            append.append((CharSequence) " ").append(a4.a(ar_3));
            C().setText(append);
        }
    }

    static final class f implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f116205a = new f();

        static {
            Covode.recordClassIndex(74980);
        }

        f() {
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                KeyboardUtils.b(view);
            } else {
                KeyboardUtils.c(view);
            }
        }
    }

    static final class u extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(74995);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(k kVar) {
            super(2);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            h.f.b.l.d(pVar, "");
            this.this$0.u().setText(this.this$0.z().f116231j);
            this.this$0.u().setSelectionMinIndex(this.this$0.z().f116231j.length());
            if (this.this$0.z().f116231j.length() >= this.this$0.z().n) {
                this.this$0.u().setCursorVisible(false);
            } else {
                this.this$0.u().setCursorVisible(true);
                this.this$0.u().setSelection(this.this$0.z().f116231j.length());
            }
            return z.f158842a;
        }
    }

    static final class e implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        public static final e f116204a = new e();

        static {
            Covode.recordClassIndex(74979);
        }

        e() {
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                return false;
            }
            return true;
        }
    }
}
