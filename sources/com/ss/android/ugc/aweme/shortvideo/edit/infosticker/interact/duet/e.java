package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.c;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b;
import com.ss.android.ugc.aweme.utils.ic;
import com.ss.android.ugc.tools.view.b.c;
import com.ss.android.ugc.tools.view.widget.AVStatusView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class e extends Fragment implements com.bytedance.tux.navigation.a, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.c {

    /* renamed from: l  reason: collision with root package name */
    public static final a f127337l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f127338a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.c f127339b;

    /* renamed from: c  reason: collision with root package name */
    public EditText f127340c;

    /* renamed from: d  reason: collision with root package name */
    public ImageButton f127341d;

    /* renamed from: e  reason: collision with root package name */
    public TuxTextView f127342e;

    /* renamed from: f  reason: collision with root package name */
    public View f127343f;

    /* renamed from: g  reason: collision with root package name */
    public b.f f127344g;

    /* renamed from: h  reason: collision with root package name */
    public List<? extends User> f127345h;

    /* renamed from: i  reason: collision with root package name */
    public b.a.C3327a f127346i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashSet<User> f127347j;

    /* renamed from: k  reason: collision with root package name */
    public final m<User, Boolean, z> f127348k;

    /* renamed from: m  reason: collision with root package name */
    private boolean f127349m;
    private DuetStickerSearchViewModel n;
    private final h.h o;
    private final h.h p;
    private final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b q;
    private HashMap r;

    static {
        Covode.recordClassIndex(83505);
    }

    public final HashSet<String> f() {
        return (HashSet) this.o.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.e g() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.e) this.p.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.c
    public final void i() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.c
    public final void j() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83507);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static abstract class b extends c.b {
        static {
            Covode.recordClassIndex(83508);
        }

        private b() {
        }

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f127351a = new a();

            private a() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(83509);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$b$b  reason: collision with other inner class name */
        public static final class C3309b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C3309b f127352a = new C3309b();

            private C3309b() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(83510);
            }
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$e  reason: collision with other inner class name */
    static final class C3310e extends h.f.b.m implements h.f.a.a<HashSet<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3310e f127353a = new C3310e();

        static {
            Covode.recordClassIndex(83513);
        }

        C3310e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f127358a = new j();

        static {
            Covode.recordClassIndex(83518);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.e invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.e();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(83511);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a.b.a(this.this$0, b.a.f127351a);
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(83512);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a.b.a(this.this$0, b.C3309b.f127352a);
            return z.f158842a;
        }
    }

    public e() {
        this(new LinkedHashSet(0), null);
    }

    public final RecyclerView b() {
        RecyclerView recyclerView = this.f127338a;
        if (recyclerView == null) {
            l.a("recyclerView");
        }
        return recyclerView;
    }

    public final ImageButton c() {
        ImageButton imageButton = this.f127341d;
        if (imageButton == null) {
            l.a("clearSearchInput");
        }
        return imageButton;
    }

    public final TuxTextView d() {
        TuxTextView tuxTextView = this.f127342e;
        if (tuxTextView == null) {
            l.a("duetSearchUserNoticeText");
        }
        return tuxTextView;
    }

    public final View e() {
        View view = this.f127343f;
        if (view == null) {
            l.a("lineView");
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f127344g.c();
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.r;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final com.ss.android.ugc.aweme.search.model.g h() {
        return new com.ss.android.ugc.aweme.search.model.g(6, null, this.f127339b.f127294h, "at_user", 20, n.k(f()));
    }

    private void k() {
        if (!g().c()) {
            g().f127623c = this;
        }
        this.q.a().a(new i(this), b.i.f4826c, this.f127344g.b());
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        String str;
        String str2;
        String str3;
        Resources resources;
        Resources resources2;
        Resources resources3;
        TuxNavBar.a aVar = new TuxNavBar.a();
        com.bytedance.tux.navigation.a.c[] cVarArr = new com.bytedance.tux.navigation.a.c[1];
        com.bytedance.tux.navigation.a.e eVar = new com.bytedance.tux.navigation.a.e();
        Context context = getContext();
        if (context == null || (resources3 = context.getResources()) == null || (str = resources3.getString(R.string.be9)) == null) {
            str = "";
        }
        l.b(str, "");
        cVarArr[0] = eVar.a(str).a(com.bytedance.tux.navigation.a.f.SECONDARY).a((h.f.a.a<z>) new c(this));
        TuxNavBar.a a2 = aVar.a(cVarArr);
        com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
        Context context2 = getContext();
        if (context2 == null || (resources2 = context2.getResources()) == null || (str2 = resources2.getString(R.string.a7t)) == null) {
            str2 = "";
        }
        l.b(str2, "");
        TuxNavBar.a a3 = a2.a(gVar.a(str2));
        com.bytedance.tux.navigation.a.c[] cVarArr2 = new com.bytedance.tux.navigation.a.c[1];
        com.bytedance.tux.navigation.a.e eVar2 = new com.bytedance.tux.navigation.a.e();
        Context context3 = getContext();
        if (context3 == null || (resources = context3.getResources()) == null || (str3 = resources.getString(R.string.bba)) == null) {
            str3 = "";
        }
        l.b(str3, "");
        cVarArr2[0] = eVar2.a(str3).a((h.f.a.a<z>) new d(this));
        return a3.b(cVarArr2);
    }

    public static final class h implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127356a;

        static {
            Covode.recordClassIndex(83516);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(e eVar) {
            this.f127356a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            if (r0.length() != 0) goto L_0x0011;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
            /*
                r2 = this;
                if (r3 == 0) goto L_0x000f
                java.lang.String r0 = r3.toString()
                r1 = 0
                if (r0 == 0) goto L_0x000f
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0011
            L_0x000f:
                r1 = 8
            L_0x0011:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e r0 = r2.f127356a
                android.widget.ImageButton r0 = r0.c()
                int r0 = r0.getVisibility()
                if (r0 == r1) goto L_0x0026
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e r0 = r2.f127356a
                android.widget.ImageButton r0 = r0.c()
                r0.setVisibility(r1)
            L_0x0026:
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
                java.util.Objects.requireNonNull(r1, r0)
                java.lang.CharSequence r0 = h.m.p.b(r1)
                java.lang.String r1 = r0.toString()
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e r0 = r2.f127356a
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.c r0 = r0.f127339b
                java.lang.String r0 = r0.f127294h
                boolean r0 = h.f.b.l.a(r0, r1)
                if (r0 == 0) goto L_0x0044
                return
            L_0x0044:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e r0 = r2.f127356a
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.c r0 = r0.f127339b
                r0.a(r1)
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e r0 = r2.f127356a
                r0.a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e.h.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127355a;

        static {
            Covode.recordClassIndex(83515);
        }

        g(e eVar) {
            this.f127355a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            EditText editText = this.f127355a.f127340c;
            if (editText == null) {
                l.a("searchEditText");
            }
            editText.setText(new Editable.Factory().newEditable(""));
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127354a;

        static {
            Covode.recordClassIndex(83514);
        }

        f(e eVar) {
            this.f127354a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
            if (linkedHashSet == null || linkedHashSet.isEmpty()) {
                this.f127354a.d().setVisibility(8);
                this.f127354a.e().setVisibility(8);
                return;
            }
            this.f127354a.d().setVisibility(0);
            this.f127354a.e().setVisibility(0);
            this.f127354a.d().setText(d.a.a(d.a.a(this.f127354a.getContext(), linkedHashSet)));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127359a;

        static {
            Covode.recordClassIndex(83519);
        }

        k(e eVar) {
            this.f127359a = eVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            l.b(iVar, "");
            if (!iVar.b() && !iVar.c()) {
                this.f127359a.f127339b.f127289c.clear();
                this.f127359a.f127339b.f127289c.addAll((Collection) iVar.d());
                this.f127359a.f127339b.notifyDataSetChanged();
                this.f127359a.b().b(0);
            }
            this.f127359a.g().a(true, this.f127359a.h());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127357a;

        static {
            Covode.recordClassIndex(83517);
        }

        i(e eVar) {
            this.f127357a = eVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            Iterable iterable;
            com.ss.android.ugc.aweme.port.in.z A = com.ss.android.ugc.aweme.port.in.g.a().A();
            l.b(iVar, "");
            if (iVar.b() || iVar.c() || !A.b()) {
                Toast makeText = Toast.makeText(this.f127357a.getContext(), "no data", 0);
                if (Build.VERSION.SDK_INT == 25) {
                    ic.a(makeText);
                }
                makeText.show();
            } else {
                e eVar = this.f127357a;
                b.a.C3327a aVar = (b.a.C3327a) iVar.d();
                eVar.f127346i = aVar;
                if (aVar != null) {
                    eVar.f127345h = aVar.f127742f;
                }
                b.a.C3327a aVar2 = this.f127357a.f127346i;
                if (aVar2 == null || (iterable = aVar2.f127742f) == null) {
                    iterable = new ArrayList();
                }
                this.f127357a.f127339b.f127289c.clear();
                this.f127357a.f127339b.f127290d.clear();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.addAll(this.f127357a.f127339b.f127287a);
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    User user = (User) obj;
                    Iterator<T> it = this.f127357a.f127339b.f127287a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (TextUtils.equals(next.getSecUid(), user.getSecUid())) {
                            if (next != null) {
                            }
                        }
                    }
                    arrayList.add(obj);
                }
                linkedHashSet.addAll(arrayList);
                this.f127357a.f127339b.f127289c.addAll(linkedHashSet);
                this.f127357a.f127339b.notifyDataSetChanged();
                this.f127357a.b().b(0);
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.c
    public final void a(com.ss.android.ugc.aweme.search.model.h hVar) {
        String userId;
        l.d(hVar, "");
        this.f127339b.e();
        this.f127349m = false;
        if (this.f127339b.f127294h.length() == 0) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.c cVar = this.f127339b;
            if (cVar.n != null) {
                ((AVStatusView) cVar.n.itemView).c();
            }
            cVar.f150029j = 1;
            return;
        }
        ArrayList<com.ss.android.ugc.aweme.search.model.e> arrayList = this.f127339b.f127290d;
        arrayList.clear();
        List<? extends com.ss.android.ugc.aweme.search.model.e> list = hVar.f121536a;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : list) {
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b bVar = this.q;
                String userId2 = t.f121524g.getUserId();
                if (userId2 == null) {
                    userId2 = "";
                }
                if (!bVar.a(userId2)) {
                    arrayList2.add(t);
                }
            }
            ArrayList arrayList3 = arrayList2;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                arrayList.addAll(arrayList3);
            }
        }
        List<String> list2 = this.f127339b.f127288b;
        list2.clear();
        List<? extends com.ss.android.ugc.aweme.search.model.e> list3 = hVar.f121536a;
        if (list3 != null) {
            for (T t2 : list3) {
                if (t2.f121524g.getMentionBlockType() == 1 && (userId = t2.f121524g.getUserId()) != null) {
                    list2.add(userId);
                }
            }
        }
        this.f127339b.notifyDataSetChanged();
        f().addAll(this.f127339b.b());
    }

    public final void a(String str) {
        l.d(str, "");
        f().clear();
        this.f127339b.a(str);
        if (!TextUtils.isEmpty(str)) {
            if (!g().c()) {
                g().f127623c = this;
            }
            ArrayList arrayList = new ArrayList();
            b.a.C3327a aVar = this.f127346i;
            if (aVar != null) {
                arrayList.addAll(aVar.f127737a);
                arrayList.addAll(aVar.f127738b);
                arrayList.addAll(aVar.f127737a);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                User user = (User) obj;
                if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
                    arrayList2.add(obj);
                }
            }
            this.q.a(str, arrayList2).a(new k(this), b.i.f4826c, this.f127344g.b());
            return;
        }
        List<? extends User> list = this.f127345h;
        if (list == null || list.isEmpty()) {
            k();
            return;
        }
        this.f127339b.f127289c.clear();
        this.f127339b.f127290d.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f127339b.f127287a);
        Collection collection = this.f127345h;
        if (collection == null) {
            collection = new ArrayList();
        }
        linkedHashSet.addAll(collection);
        this.f127339b.f127289c.addAll(linkedHashSet);
        this.f127339b.notifyDataSetChanged();
        RecyclerView recyclerView = this.f127338a;
        if (recyclerView == null) {
            l.a("recyclerView");
        }
        recyclerView.b(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.profile.model.User, ? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(LinkedHashSet<User> linkedHashSet, m<? super User, ? super Boolean, z> mVar) {
        l.d(linkedHashSet, "");
        this.f127347j = linkedHashSet;
        this.f127348k = mVar;
        this.f127339b = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.c();
        this.f127344g = new b.f();
        this.o = h.i.a((h.f.a.a) C3310e.f127353a);
        this.p = h.i.a((h.f.a.a) j.f127358a);
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b bVar = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b();
        boolean z = true;
        bVar.f127732a = true;
        this.q = bVar;
        this.f127339b.f127293g = mVar;
        this.f127339b.f127287a.addAll(linkedHashSet);
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.c cVar = this.f127339b;
        cVar.f127291e = cVar.f127287a.size() < 30 ? false : z;
        this.f127339b.o = new c.a(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f127350a;

            static {
                Covode.recordClassIndex(83506);
            }

            {
                this.f127350a = r1;
            }

            @Override // com.ss.android.ugc.tools.view.b.c.a
            public final void a() {
                this.f127350a.f().size();
                this.f127350a.f127339b.d();
                this.f127350a.g().a(false, this.f127350a.h());
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        t<LinkedHashSet<User>> tVar;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.aqq);
        l.b(findViewById, "");
        this.f127338a = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.aqm);
        l.b(findViewById2, "");
        this.f127340c = (EditText) findViewById2;
        View findViewById3 = view.findViewById(R.id.aq_);
        l.b(findViewById3, "");
        this.f127341d = (ImageButton) findViewById3;
        View findViewById4 = view.findViewById(R.id.aqo);
        l.b(findViewById4, "");
        this.f127342e = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.aqn);
        l.b(findViewById5, "");
        this.f127343f = findViewById5;
        RecyclerView recyclerView = this.f127338a;
        if (recyclerView == null) {
            l.a("recyclerView");
        }
        recyclerView.setAdapter(this.f127339b);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(1);
        RecyclerView recyclerView2 = this.f127338a;
        if (recyclerView2 == null) {
            l.a("recyclerView");
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        DuetStickerSearchViewModel duetStickerSearchViewModel = (DuetStickerSearchViewModel) ae.a(this, (ad.b) null).a(DuetStickerSearchViewModel.class);
        this.n = duetStickerSearchViewModel;
        if (!(duetStickerSearchViewModel == null || (tVar = duetStickerSearchViewModel.f127263a) == null)) {
            tVar.observe(this, new f(this));
        }
        DuetStickerSearchViewModel duetStickerSearchViewModel2 = this.n;
        if (duetStickerSearchViewModel2 != null) {
            duetStickerSearchViewModel2.a(this.f127339b.f127287a);
        }
        this.f127339b.f127292f = this.n;
        ImageButton imageButton = this.f127341d;
        if (imageButton == null) {
            l.a("clearSearchInput");
        }
        imageButton.setOnClickListener(new g(this));
        EditText editText = this.f127340c;
        if (editText == null) {
            l.a("searchEditText");
        }
        editText.addTextChangedListener(new h(this));
        k();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.e7, viewGroup, false);
    }
}
