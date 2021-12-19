package com.ss.android.ugc.gamora.editor.sticker.donation;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.searchbar.SearchBar;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.ss.android.ugc.gamora.editor.sticker.donation.a;
import com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel;
import com.ss.android.ugc.tools.view.b.c;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.m.p;
import h.z;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

public final class f extends androidx.fragment.app.d implements com.bytedance.ies.dmt.ui.searchbar.b, q, com.ss.android.ugc.gamora.editor.sticker.donation.a.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f146570b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public i f146571a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f146572c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f146573d = h.i.a((h.f.a.a) new g(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f146574e = h.i.a((h.f.a.a) new C3923f(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f146575f = h.i.a((h.f.a.a) new i(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f146576g = h.i.a((h.f.a.a) new h(this));

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.gamora.editor.sticker.donation.c.b f146577h;

    /* renamed from: i  reason: collision with root package name */
    private HashMap f146578i;

    static {
        Covode.recordClassIndex(96453);
    }

    public final View a(int i2) {
        if (this.f146578i == null) {
            this.f146578i = new HashMap();
        }
        View view = (View) this.f146578i.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f146578i.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final b c() {
        return (b) this.f146573d.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.sticker.donation.a.c d() {
        return (com.ss.android.ugc.gamora.editor.sticker.donation.a.c) this.f146574e.getValue();
    }

    public final OrganizationListViewModel e() {
        return (OrganizationListViewModel) this.f146575f.getValue();
    }

    public final j f() {
        return (j) this.f146576g.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96454);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.f$f  reason: collision with other inner class name */
    static final class C3923f extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.donation.a.c> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(96459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3923f(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.donation.a.c invoke() {
            f fVar = this.this$0;
            return new com.ss.android.ugc.gamora.editor.sticker.donation.a.c(fVar, fVar.c());
        }
    }

    public final String i() {
        if (c() == null) {
            return "personal_homepage";
        }
        return "video_edit_page";
    }

    public final String j() {
        if (c() == null) {
            return "click_profile_nonprofit";
        }
        return "click_sticker";
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f146578i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f146580a;

        static {
            Covode.recordClassIndex(96456);
        }

        c(f fVar) {
            this.f146580a = fVar;
        }

        @Override // com.ss.android.ugc.tools.view.b.c.a
        public final void a() {
            OrganizationListViewModel e2 = this.f146580a.e();
            if (e2.f146590b == 1) {
                e2.b_(new OrganizationListViewModel.h(e2));
            }
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<b> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(96460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            Serializable serializable;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("mob_params");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof b)) {
                return null;
            }
            return serializable;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<OrganizationListViewModel> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(96462);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ OrganizationListViewModel invoke() {
            JediViewModel a2 = t.a(this.this$0.requireActivity()).a(OrganizationListViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f146582a;

        static {
            Covode.recordClassIndex(96463);
        }

        j(f fVar) {
            this.f146582a = fVar;
        }

        public final void run() {
            Window window;
            Dialog dialog = this.f146582a.getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setWindowAnimations(R.style.v9);
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            view.postDelayed(new j(this), 50);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        Dialog dialog;
        Window window;
        if (!(this.f146572c || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null)) {
            window.setWindowAnimations(0);
        }
        super.onStop();
    }

    static final class h extends h.f.b.m implements h.f.a.a<j> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(96461);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            String str;
            Context context = this.this$0.getContext();
            String str2 = null;
            if (context == null) {
                return null;
            }
            l.b(context, "");
            b c2 = this.this$0.c();
            if (c2 != null) {
                str = c2.getShootWay();
            } else {
                str = null;
            }
            b c3 = this.this$0.c();
            if (c3 != null) {
                str2 = c3.getCreationId();
            }
            return new j(context, str, str2);
        }
    }

    @Override // com.bytedance.ies.dmt.ui.searchbar.b
    public final void b() {
        String i2 = i();
        String j2 = j();
        l.d(i2, "");
        l.d(j2, "");
        r.a("clear_search_bar", new com.ss.android.ugc.tools.f.b().a("enter_from", i2).a("search_type", "ngo_list").a("user_id", com.ss.android.ugc.gamora.editor.sticker.donation.b.a.a()).a("enter_method", j2).f149193a);
    }

    public final void g() {
        LinearLayout linearLayout = (LinearLayout) a(R.id.cfx);
        l.b(linearLayout, "");
        linearLayout.setVisibility(8);
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (com.ss.android.ugc.aweme.shortvideo.s.c.a(context)) {
            e().a();
        } else {
            ((DmtStatusView) a(R.id.apw)).h();
        }
    }

    public final void h() {
        e().b();
        d().c();
        SearchBar searchBar = (SearchBar) a(R.id.dw2);
        if (searchBar != null) {
            searchBar.b();
        }
        LinearLayout linearLayout = (LinearLayout) a(R.id.cfx);
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // com.bytedance.ies.dmt.ui.searchbar.b
    public final void a() {
        String i2 = i();
        String j2 = j();
        l.d(i2, "");
        l.d(j2, "");
        r.a("cancel_search_bar", new com.ss.android.ugc.tools.f.b().a("enter_from", i2).a("search_type", "ngo_list").a("user_id", com.ss.android.ugc.gamora.editor.sticker.donation.b.a.a()).a("enter_method", j2).f149193a);
        g();
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f146581a;

        static {
            Covode.recordClassIndex(96458);
        }

        e(f fVar) {
            this.f146581a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f146581a.g();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.yb);
        f.a.b.b unused = selectSubscribe(e(), g.f146583a, new ah(), new d(this));
    }

    @Override // androidx.fragment.app.d
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f146572c = true;
        i iVar = this.f146571a;
        if (iVar != null) {
            iVar.a();
        }
        h();
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        l.b(onCreateDialog, "");
        i iVar = this.f146571a;
        if (iVar != null) {
            iVar.b();
        }
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.v9);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f146579a;

        static {
            Covode.recordClassIndex(96455);
        }

        b(f fVar) {
            this.f146579a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String i2 = this.f146579a.i();
            String j2 = this.f146579a.j();
            l.d(i2, "");
            l.d(j2, "");
            r.a("close_search_bar", new com.ss.android.ugc.tools.f.b().a("enter_from", i2).a("search_type", "ngo_list").a("user_id", com.ss.android.ugc.gamora.editor.sticker.donation.b.a.a()).a("enter_method", j2).f149193a);
            this.f146579a.h();
            this.f146579a.dismiss();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.a.a
    public final void b(com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar) {
        l.d(bVar, "");
        this.f146577h = bVar;
        Bundle bundle = new Bundle();
        bundle.putString("url", bVar.getDetailUrl());
        bundle.putString("title", getString(R.string.bav));
        bundle.putString("enter_from", "org_detail_page");
        startActivityForResult(SmartRouter.buildRoute(getContext(), "aweme://donation/web/page").withParam(bundle).buildIntent(), 12580);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.a.a
    public final void a(com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar) {
        l.d(bVar, "");
        if (bVar instanceof com.ss.android.ugc.gamora.editor.sticker.donation.c.e) {
            String i2 = i();
            String j2 = j();
            String donateLink = bVar.getDonateLink();
            if (donateLink == null) {
                l.b();
            }
            l.d(i2, "");
            l.d(j2, "");
            l.d(donateLink, "");
            r.a("click_search_bar_result", new com.ss.android.ugc.tools.f.b().a("enter_from", i2).a("search_type", "ngo_list").a("user_id", com.ss.android.ugc.gamora.editor.sticker.donation.b.a.a()).a("enter_method", j2).a("link", donateLink).a("link_type", "nonprofit").f149193a);
        }
        i iVar = this.f146571a;
        if (iVar != null) {
            iVar.a(bVar);
        }
        ((SearchBar) a(R.id.dw2)).a();
        dismiss();
    }

    @Override // com.bytedance.ies.dmt.ui.searchbar.b
    public final void a(String str) {
        if (a(R.id.cfx) != null) {
            LinearLayout linearLayout = (LinearLayout) a(R.id.cfx);
            l.b(linearLayout, "");
            linearLayout.setVisibility(8);
            if (str != null && str.length() != 0) {
                Context context = getContext();
                if (context == null) {
                    return;
                }
                if (com.ss.android.ugc.aweme.shortvideo.s.c.a(context)) {
                    OrganizationListViewModel e2 = e();
                    if (!str.equals(e2.f146592d)) {
                        e2.g();
                        e2.f146592d = str;
                        e2.b(false);
                    } else if (e2.f146590b == 1) {
                        e2.b(true);
                    }
                } else {
                    ((DmtStatusView) a(R.id.apw)).h();
                }
            } else if (((DmtEditText) ((SearchBar) a(R.id.dw2)).a(R.id.ay6)).hasFocus()) {
                d().c();
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.a, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(96457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
            if (r0 != null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
            if (r3 == null) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
            r3 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
            r1 = r1 + r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
            if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0159;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
            r8 = new android.text.SpannableString(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
            if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x00a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
            r8.setSpan(new android.text.style.StyleSpan(1), h.m.p.a((java.lang.CharSequence) r1, r3, 0, false, 6), r1.length(), 17);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
            r0 = (android.widget.LinearLayout) r7.a(com.zhiliaoapp.musically.R.id.cft);
            h.f.b.l.b(r0, r2);
            r0.setVisibility(0);
            r0 = (com.bytedance.tux.input.TuxTextView) r7.a(com.zhiliaoapp.musically.R.id.f2o);
            h.f.b.l.b(r0, r2);
            r0.setText(r8);
            ((com.ss.android.ugc.aweme.widgetcompat.RemoteImageView) r7.a(com.zhiliaoapp.musically.R.id.c23)).setImageResource(2131230971);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0159, code lost:
            r1 = (android.widget.LinearLayout) r7.a(com.zhiliaoapp.musically.R.id.cft);
            h.f.b.l.b(r1, r2);
            r1.setVisibility(8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x019d, code lost:
            if (r0 == null) goto L_0x019f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b7, code lost:
            if (r1 == null) goto L_0x01b9;
         */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i r11, com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.a r12) {
            /*
            // Method dump skipped, instructions count: 507
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.donation.f.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            l.b(context, "");
            ((TuxTextView) a(R.id.f9l)).setTuxFont(33);
            RecyclerView recyclerView = (RecyclerView) a(R.id.djs);
            l.b(recyclerView, "");
            recyclerView.setLayoutManager(new LinearLayoutManager());
            d().d(true);
            RecyclerView recyclerView2 = (RecyclerView) a(R.id.djs);
            l.b(recyclerView2, "");
            recyclerView2.setAdapter(d());
            SearchBar searchBar = (SearchBar) a(R.id.dw2);
            l.b(searchBar, "");
            searchBar.setVisibility(0);
            ((SearchBar) a(R.id.dw2)).setSearchBarEventHandler(this);
            String string = getString(R.string.bb6);
            l.b(string, "");
            String string2 = getString(R.string.bb5, string);
            l.b(string2, "");
            SpannableString spannableString = new SpannableString(string2);
            if (p.a((CharSequence) string2, string, 0, false, 6) != -1) {
                spannableString.setSpan(f(), p.a((CharSequence) string2, string, 0, false, 6), string2.length(), 18);
            }
            TuxTextView tuxTextView = (TuxTextView) a(R.id.f4t);
            l.b(tuxTextView, "");
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.f4t);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(spannableString);
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.f4t);
            l.b(tuxTextView3, "");
            tuxTextView3.setHighlightColor(0);
            TuxTextView tuxTextView4 = (TuxTextView) a(R.id.f4t);
            l.b(tuxTextView4, "");
            tuxTextView4.setVisibility(8);
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                l.b();
            }
            MtEmptyView a2 = MtEmptyView.a(activity);
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 == null) {
                l.b();
            }
            a2.setStatus(new d.a(activity2).f33648a);
            ((DmtStatusView) a(R.id.apw)).setBuilder(DmtStatusView.a.a(getActivity()).a().a(R.string.h2z, R.string.h2y, R.string.h35, new e(this)).b(a2));
            ((RemoteImageView) a(R.id.bve)).setOnClickListener(new b(this));
            d().o = new c(this);
            g();
        }
    }

    @Override // com.bytedance.ies.dmt.ui.searchbar.b
    public final void a(boolean z, String str) {
        if (!z) {
            return;
        }
        if (str == null || str.length() == 0) {
            String i2 = i();
            String j2 = j();
            l.d(i2, "");
            l.d(j2, "");
            r.a("enter_search_bar", new com.ss.android.ugc.tools.f.b().a("enter_from", i2).a("search_type", "ngo_list").a("user_id", com.ss.android.ugc.gamora.editor.sticker.donation.b.a.a()).a("enter_method", j2).f149193a);
            d().c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ye, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar;
        String str;
        String str2;
        String str3;
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1 && i2 == 12580 && (bVar = this.f146577h) != null) {
            dismiss();
            i iVar = this.f146571a;
            if (iVar != null) {
                iVar.a(bVar);
            }
            b c2 = c();
            String str4 = null;
            if (c2 != null) {
                str = c2.getShootWay();
            } else {
                str = null;
            }
            b c3 = c();
            if (c3 != null) {
                str2 = c3.getCreationId();
            } else {
                str2 = null;
            }
            String name = bVar.getName();
            b c4 = c();
            if (c4 != null) {
                str3 = c4.getContentSource();
            } else {
                str3 = null;
            }
            b c5 = c();
            if (c5 != null) {
                str4 = c5.getContentType();
            }
            JSONObject jSONObject = new JSONObject();
            a.a(jSONObject, new a.b(str, str2, name, str3, str4));
            com.ss.android.ugc.aweme.utils.d.a("add_donation_sticker", jSONObject);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
