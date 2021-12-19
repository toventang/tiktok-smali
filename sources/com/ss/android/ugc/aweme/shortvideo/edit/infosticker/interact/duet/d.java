package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.c;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.bytedance.tux.table.header.TuxTableHeader;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public final class d extends Fragment implements com.bytedance.tux.navigation.a {

    /* renamed from: m  reason: collision with root package name */
    public static final a f127319m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f127320a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.b f127321b;

    /* renamed from: c  reason: collision with root package name */
    com.bytedance.tux.sheet.sheet.a f127322c;

    /* renamed from: d  reason: collision with root package name */
    public TuxTextCell f127323d;

    /* renamed from: e  reason: collision with root package name */
    public TuxTextView f127324e;

    /* renamed from: f  reason: collision with root package name */
    public TuxTableHeader f127325f;

    /* renamed from: g  reason: collision with root package name */
    public DuetStickerRecommendViewModel f127326g;

    /* renamed from: h  reason: collision with root package name */
    public b.f f127327h;

    /* renamed from: i  reason: collision with root package name */
    public e f127328i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashSet<User> f127329j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f127330k;

    /* renamed from: l  reason: collision with root package name */
    public final VideoPublishEditModel f127331l;
    private View n;
    private final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b o;
    private HashMap p;

    static {
        Covode.recordClassIndex(83493);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83496);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Spanned a(String str) {
            l.d(str, "");
            SpannableString valueOf = SpannableString.valueOf(Html.fromHtml(str));
            StyleSpan[] styleSpanArr = (StyleSpan[]) valueOf.getSpans(0, str.length(), StyleSpan.class);
            l.b(styleSpanArr, "");
            for (StyleSpan styleSpan : styleSpanArr) {
                int spanStart = valueOf.getSpanStart(styleSpan);
                int spanEnd = valueOf.getSpanEnd(styleSpan);
                valueOf.removeSpan(styleSpan);
                valueOf.setSpan(new com.bytedance.tux.f.a.b(62), spanStart, spanEnd, 17);
            }
            l.b(valueOf, "");
            return valueOf;
        }

        public static String a(Context context, LinkedHashSet<User> linkedHashSet) {
            l.d(linkedHashSet, "");
            if (context == null || linkedHashSet.isEmpty()) {
                return "";
            }
            List k2 = n.k(linkedHashSet);
            int size = k2.size();
            if (size == 1) {
                String string = context.getResources().getString(R.string.bei, "<b>" + ((User) k2.get(0)).getNickname() + "</b>");
                l.b(string, "");
                return string;
            } else if (size != 2) {
                String quantityString = context.getResources().getQuantityString(R.plurals.b6, 2, "<b>" + ((User) k2.get(0)).getNickname() + "</b>", "<b>" + (k2.size() - 1) + "</b>");
                l.b(quantityString, "");
                return quantityString;
            } else {
                String string2 = context.getResources().getString(R.string.bej, "<b>" + ((User) k2.get(0)).getNickname() + "</b>", "<b>" + ((User) k2.get(1)).getNickname() + "</b>");
                l.b(string2, "");
                return string2;
            }
        }
    }

    public static abstract class b extends c.b {
        static {
            Covode.recordClassIndex(83497);
        }

        private b() {
        }

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f127332a = new a();

            private a() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(83498);
            }
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(83499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a.b.a(this.this$0, b.a.f127332a);
            return z.f158842a;
        }
    }

    public d() {
        this(new LinkedHashSet(0), false, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f127327h.c();
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        String str;
        Resources resources;
        TuxNavBar.a aVar = new TuxNavBar.a();
        com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null || (str = resources.getString(R.string.bem)) == null) {
            str = "";
        }
        l.b(str, "");
        TuxNavBar.a b2 = aVar.a(gVar.a(str)).b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small).a((h.f.a.a<z>) new c(this)));
        b2.f45188d = true;
        return b2;
    }

    public static final class e extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127334a;

        static {
            Covode.recordClassIndex(83501);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(d dVar) {
            this.f127334a = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, int i2, RecyclerView recyclerView) {
            l.d(rect, "");
            l.d(recyclerView, "");
            super.getItemOffsets(rect, i2, recyclerView);
            if (i2 == 0) {
                rect.left = (int) com.ss.android.ttve.utils.b.b(this.f127334a.getContext(), 16.0f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d$d  reason: collision with other inner class name */
    static final class C3308d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127333a;

        static {
            Covode.recordClassIndex(83500);
        }

        C3308d(d dVar) {
            this.f127333a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
            TuxTextView tuxTextView = this.f127333a.f127324e;
            if (tuxTextView == null) {
                l.a("selectUserText");
            }
            Context context = this.f127333a.getContext();
            l.b(linkedHashSet, "");
            tuxTextView.setText(a.a(a.a(context, linkedHashSet)));
        }
    }

    static final class h implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127336a;

        static {
            Covode.recordClassIndex(83504);
        }

        h(d dVar) {
            this.f127336a = dVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            LinkedHashSet<User> linkedHashSet;
            l.b(dialogInterface, "");
            com.bytedance.tux.sheet.c a2 = a.b.a(dialogInterface);
            if (!l.a(a2, c.a.f45282a) && !l.a(a2, e.b.a.f127351a)) {
                d dVar = this.f127336a;
                e eVar = dVar.f127328i;
                if (eVar == null || (linkedHashSet = eVar.f127339b.f127287a) == null) {
                    linkedHashSet = new LinkedHashSet<>();
                }
                dVar.a(linkedHashSet);
            }
        }
    }

    static final class f<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127335a;

        static {
            Covode.recordClassIndex(83502);
        }

        f(d dVar) {
            this.f127335a = dVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            List g2;
            com.ss.android.ugc.aweme.port.in.z A = com.ss.android.ugc.aweme.port.in.g.a().A();
            l.b(iVar, "");
            if (iVar.b() || iVar.c() || !A.b()) {
                Toast makeText = Toast.makeText(this.f127335a.getContext(), "no data", 0);
                if (Build.VERSION.SDK_INT == 25) {
                    ic.a(makeText);
                }
                makeText.show();
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f127335a.f127329j);
                List<User> list = ((b.a.C3327a) iVar.d()).f127742f;
                ArrayList arrayList2 = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (TextUtils.equals(((User) next).getSecUid(), t2.getSecUid())) {
                            if (next != null) {
                            }
                        }
                    }
                    arrayList2.add(t);
                }
                arrayList.addAll(arrayList2);
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.b bVar = this.f127335a.f127321b;
                List<String> list2 = ((b.a.C3327a) iVar.d()).f127743g;
                l.d(list2, "");
                bVar.f127279f = list2;
                if (arrayList.size() > 15) {
                    g2 = n.g((Collection) n.d((Iterable) arrayList, 15));
                } else {
                    g2 = n.g((Collection) arrayList);
                }
                g2.add(new User());
                this.f127335a.f127321b.f127280g.addAll(g2);
                this.f127335a.f127321b.notifyDataSetChanged();
                RecyclerView recyclerView = this.f127335a.f127320a;
                if (recyclerView == null) {
                    l.a("recommendUserRecyclerView");
                }
                recyclerView.b(0);
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cd, code lost:
        r9.add(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.LinkedHashSet<com.ss.android.ugc.aweme.profile.model.User> r11) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d.a(java.util.LinkedHashSet):void");
    }

    static final /* synthetic */ class g extends j implements h.f.a.m<User, Boolean, z> {
        static {
            Covode.recordClassIndex(83503);
        }

        g(d dVar) {
            super(2, dVar, d.class, "mobSelectUser", "mobSelectUser(Lcom/ss/android/ugc/aweme/profile/model/User;Z)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(User user, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            ((d) this.receiver).a(user, booleanValue);
            return z.f158842a;
        }
    }

    public final void a(User user, boolean z) {
        String str;
        String str2;
        if (user != null) {
            com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
            l.b(bVar, "");
            VideoPublishEditModel videoPublishEditModel = this.f127331l;
            String str3 = null;
            if (videoPublishEditModel != null) {
                str = videoPublishEditModel.creationId;
            } else {
                str = null;
            }
            bVar.a("creation_id", str);
            com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.g.a().A().e();
            if (e2 != null) {
                str3 = e2.c();
            }
            com.ss.android.ugc.tools.f.b a2 = bVar.a("user_id", str3).a("invite_user_id", user.getUid());
            if (z) {
                str2 = "click head";
            } else {
                str2 = "search";
            }
            a2.a("click_method", str2);
            r.a("invite_people_to_duet", bVar.f149193a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Resources resources;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (getView() != null) {
            View view2 = getView();
            Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.View");
            this.n = view2;
            if (view2 == null) {
                l.a("rootView");
            }
            View findViewById = view2.findViewById(R.id.aqp);
            l.b(findViewById, "");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            this.f127320a = recyclerView;
            if (recyclerView == null) {
                l.a("recommendUserRecyclerView");
            }
            recyclerView.b(new e(this));
            View view3 = this.n;
            if (view3 == null) {
                l.a("rootView");
            }
            View findViewById2 = view3.findViewById(R.id.br7);
            l.b(findViewById2, "");
            TuxTableHeader tuxTableHeader = (TuxTableHeader) findViewById2;
            this.f127325f = tuxTableHeader;
            if (tuxTableHeader == null) {
                l.a("inviteHeader");
            }
            Context context = getContext();
            if (context == null || (resources = context.getResources()) == null || (str = resources.getString(R.string.beh)) == null) {
                str = "Invite people to Duet";
            }
            tuxTableHeader.setTitle(str);
            TuxTableHeader tuxTableHeader2 = this.f127325f;
            if (tuxTableHeader2 == null) {
                l.a("inviteHeader");
            }
            tuxTableHeader2.setHeaderSize(com.bytedance.tux.table.a.SMALL);
            TuxTableHeader tuxTableHeader3 = this.f127325f;
            if (tuxTableHeader3 == null) {
                l.a("inviteHeader");
            }
            tuxTableHeader3.setShowSeparator(true);
            RecyclerView recyclerView2 = this.f127320a;
            if (recyclerView2 == null) {
                l.a("recommendUserRecyclerView");
            }
            recyclerView2.setAdapter(this.f127321b);
            View view4 = this.n;
            if (view4 == null) {
                l.a("rootView");
            }
            View findViewById3 = view4.findViewById(R.id.aq8);
            l.b(findViewById3, "");
            TuxTextCell tuxTextCell = (TuxTextCell) findViewById3;
            this.f127323d = tuxTextCell;
            if (tuxTextCell == null) {
                l.a("useMicSwitch");
            }
            tuxTextCell.setWithSeparator(false);
            TuxTextCell tuxTextCell2 = this.f127323d;
            if (tuxTextCell2 == null) {
                l.a("useMicSwitch");
            }
            tuxTextCell2.setInset(com.bytedance.tux.table.b.PADDING_16);
            TuxTextCell tuxTextCell3 = this.f127323d;
            if (tuxTextCell3 == null) {
                l.a("useMicSwitch");
            }
            tuxTextCell3.setIcon((com.bytedance.tux.c.a) null);
            TuxTextCell tuxTextCell4 = this.f127323d;
            if (tuxTextCell4 == null) {
                l.a("useMicSwitch");
            }
            c.b accessory = tuxTextCell4.getAccessory();
            if (!(accessory instanceof c.j)) {
                accessory = null;
            }
            c.e eVar = (c.e) accessory;
            if (eVar != null) {
                eVar.c(this.f127330k);
            }
            View view5 = this.n;
            if (view5 == null) {
                l.a("rootView");
            }
            View findViewById4 = view5.findViewById(R.id.aqr);
            l.b(findViewById4, "");
            TuxTextView tuxTextView = (TuxTextView) findViewById4;
            this.f127324e = tuxTextView;
            if (tuxTextView == null) {
                l.a("selectUserText");
            }
            tuxTextView.setText(a.a(a.a(getContext(), this.f127329j)));
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.b(0);
            RecyclerView recyclerView3 = this.f127320a;
            if (recyclerView3 == null) {
                l.a("recommendUserRecyclerView");
            }
            recyclerView3.setLayoutManager(linearLayoutManager);
            this.o.a().a(new f(this), i.f4826c, this.f127327h.b());
        }
        ac a2 = ae.a(this, (ad.b) null).a(DuetStickerRecommendViewModel.class);
        l.b(a2, "");
        DuetStickerRecommendViewModel duetStickerRecommendViewModel = (DuetStickerRecommendViewModel) a2;
        this.f127326g = duetStickerRecommendViewModel;
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.b bVar = this.f127321b;
        if (duetStickerRecommendViewModel == null) {
            l.a("duetStickerRecommendViewModel");
        }
        bVar.f127277d = duetStickerRecommendViewModel;
        DuetStickerRecommendViewModel duetStickerRecommendViewModel2 = this.f127326g;
        if (duetStickerRecommendViewModel2 == null) {
            l.a("duetStickerRecommendViewModel");
        }
        duetStickerRecommendViewModel2.f127262a.observe(this, new C3308d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.e9, viewGroup, false);
    }

    public d(LinkedHashSet<User> linkedHashSet, boolean z, VideoPublishEditModel videoPublishEditModel) {
        l.d(linkedHashSet, "");
        this.f127329j = linkedHashSet;
        this.f127330k = z;
        this.f127331l = videoPublishEditModel;
        this.f127321b = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.b();
        this.f127327h = new b.f();
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b bVar = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b();
        boolean z2 = true;
        bVar.f127732a = true;
        this.o = bVar;
        this.f127321b.f127278e = new h.f.a.m<User, Boolean, z>(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(83494);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(User user, Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                ((d) this.receiver).a(user, booleanValue);
                return z.f158842a;
            }
        };
        this.f127321b.f127274a.addAll(linkedHashSet);
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.b bVar2 = this.f127321b;
        bVar2.f127276c = bVar2.f127274a.size() < 30 ? false : z2;
        this.f127321b.f127275b = new h.f.a.a<z>(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(83495);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                Activity activity;
                d dVar = (d) this.receiver;
                e eVar = new e(dVar.f127321b.f127274a, new g(dVar));
                dVar.f127328i = eVar;
                dVar.f127322c = new a.C1112a().a(1).b(dh.e(dVar.getContext()) - dh.c(dVar.getContext())).c().a(new h(dVar)).b(false).a(eVar).f45299a;
                com.bytedance.tux.sheet.sheet.a aVar = dVar.f127322c;
                if (aVar != null) {
                    Context context = dVar.getContext();
                    androidx.fragment.app.i iVar = null;
                    if (context != null) {
                        while (true) {
                            if (!(context instanceof Activity)) {
                                if (context instanceof ContextWrapper) {
                                    context = ((ContextWrapper) context).getBaseContext();
                                    if (context == null) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                activity = (Activity) context;
                                break;
                            }
                        }
                    }
                    activity = null;
                    if (!(activity instanceof androidx.fragment.app.e)) {
                        activity = null;
                    }
                    androidx.fragment.app.e eVar2 = (androidx.fragment.app.e) activity;
                    if (eVar2 != null) {
                        iVar = eVar2.getSupportFragmentManager();
                    }
                    aVar.show(iVar, "DuetSearchUserDialog");
                }
                return z.f158842a;
            }
        };
    }
}
