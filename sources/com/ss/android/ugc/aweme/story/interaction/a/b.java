package com.ss.android.ugc.aweme.story.interaction.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.config.c;
import com.bytedance.ies.powerlist.page.f;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.f.e;
import com.ss.android.ugc.aweme.comment.f.f;
import com.ss.android.ugc.aweme.comment.i.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.interaction.api.StoryInteractionApi;
import com.ss.android.ugc.aweme.story.interaction.b.j;
import com.ss.android.ugc.aweme.story.interaction.cell.StoryViewerAndLikerCell;
import com.ss.android.ugc.aweme.story.interaction.vm.StoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.model.i;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.p;
import h.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends com.ss.android.ugc.aweme.base.f.a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, f, com.ss.android.ugc.aweme.story.b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f137827l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public StoryViewerListViewModel f137828a;

    /* renamed from: b  reason: collision with root package name */
    public String f137829b = "";

    /* renamed from: c  reason: collision with root package name */
    public int f137830c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f137831d;

    /* renamed from: e  reason: collision with root package name */
    public j f137832e;

    /* renamed from: j  reason: collision with root package name */
    public int f137833j;

    /* renamed from: k  reason: collision with root package name */
    public e f137834k;

    /* renamed from: m  reason: collision with root package name */
    private String f137835m = "";
    private com.bytedance.ies.powerlist.page.config.b<Long> n;
    private boolean o;
    private h p;
    private boolean q;
    private SparseArray r;

    static {
        Covode.recordClassIndex(90165);
    }

    public final View a(int i2) {
        if (this.r == null) {
            this.r = new SparseArray();
        }
        View view = (View) this.r.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.r.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void b(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void i() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90166);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.b
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.f.a a() {
        return this;
    }

    private final void j() {
        com.bytedance.ies.powerlist.page.config.b<Long> bVar = this.n;
        if (bVar == null) {
            l.a("config");
        }
        bVar.f34367c.e();
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final RecyclerView c() {
        PowerList powerList = (PowerList) a(R.id.cb4);
        l.b(powerList, "");
        return powerList;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void h() {
        if (this.o) {
            this.o = true;
            e();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.r;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public b() {
        this.f137830c = com.ss.android.ugc.aweme.story.c.b.a() != 1 ? 2 : 1;
    }

    private final void g() {
        StoryViewerListViewModel storyViewerListViewModel = this.f137828a;
        if (storyViewerListViewModel == null) {
            l.a("viewerVM");
        }
        storyViewerListViewModel.a("REFRESH_STORY_VIEWER_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        storyViewerListViewModel.a("REFRESH_STORY_VIEWER_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
    }

    private final void b() {
        String str;
        User user;
        Aweme aweme = this.f137831d;
        h hVar = this.p;
        String str2 = null;
        if (hVar != null) {
            str = hVar.getEnterFrom();
        } else {
            str = null;
        }
        String str3 = this.f137829b;
        Aweme aweme2 = this.f137831d;
        if (aweme2 != null) {
            user = aweme2.getAuthor();
        } else {
            user = null;
        }
        int a2 = com.ss.android.ugc.aweme.story.b.h.a(user);
        Aweme aweme3 = this.f137831d;
        if (aweme3 != null) {
            str2 = com.ss.android.ugc.aweme.story.d.a.b(aweme3);
        }
        this.f137832e = new j(aweme, str, "viewer_list", str3, a2, "story", str2);
    }

    private final void e() {
        StoryViewerListViewModel storyViewerListViewModel = this.f137828a;
        if (storyViewerListViewModel == null) {
            l.a("viewerVM");
        }
        Integer num = ((IStoryViewerListViewModel) storyViewerListViewModel).f136726d.get(this.f137829b);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                g();
                return;
            } else if (intValue == 1) {
                j();
                return;
            } else if (intValue == 2) {
                j();
                return;
            } else if (intValue == 3) {
                return;
            } else {
                if (intValue == 4) {
                    j();
                    return;
                }
            }
        }
        j();
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final String d() {
        if (this.f137833j > 999) {
            String string = d.a().getResources().getString(R.string.hcb);
            l.b(string, "");
            return string;
        }
        Resources resources = d.a().getResources();
        int i2 = this.f137833j;
        String quantityString = resources.getQuantityString(R.plurals.j2, i2, String.valueOf(i2));
        l.b(quantityString, "");
        return quantityString;
    }

    @Override // com.ss.android.ugc.aweme.story.b
    public final void b(Aweme aweme) {
        this.f137831d = aweme;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(e eVar) {
        l.d(eVar, "");
        this.f137834k = eVar;
    }

    public static final /* synthetic */ StoryViewerListViewModel a(b bVar) {
        StoryViewerListViewModel storyViewerListViewModel = bVar.f137828a;
        if (storyViewerListViewModel == null) {
            l.a("viewerVM");
        }
        return storyViewerListViewModel;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(h hVar) {
        this.p = hVar;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        androidx.fragment.app.e requireActivity = requireActivity();
        l.b(requireActivity, "");
        this.f137828a = StoryViewerListViewModel.a.a(requireActivity, requireActivity);
        b();
        e();
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void c(boolean z) {
        int i2;
        this.q = z;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.em1);
        int i3 = 0;
        if (tuxTextView != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxTextView.setVisibility(i2);
        }
        View a2 = a(R.id.an6);
        if (a2 != null) {
            if (!z) {
                i3 = 8;
            }
            a2.setVisibility(i3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.b$b  reason: collision with other inner class name */
    public static final class C3628b extends com.bytedance.ies.powerlist.page.config.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137836a;

        /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.b$b$b  reason: collision with other inner class name */
        static final class C3629b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final C3629b f137839a = new C3629b();

            static {
                Covode.recordClassIndex(90169);
            }

            C3629b() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(90167);
        }

        /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.b$b$a */
        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3628b f137837a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h.c.d f137838b;

            static {
                Covode.recordClassIndex(90168);
            }

            a(C3628b bVar, h.c.d dVar) {
                this.f137837a = bVar;
                this.f137838b = dVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                i iVar = (i) obj;
                List<com.ss.android.ugc.aweme.story.model.h> viewerList = iVar.getViewerList();
                if (viewerList == null) {
                    viewerList = z.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(n.a((Iterable) viewerList, 10));
                Iterator<T> it = viewerList.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.ss.android.ugc.aweme.story.interaction.b.i.a(it.next(), this.f137837a.f137836a.f137830c, this.f137837a.f137836a.f137832e));
                }
                ArrayList arrayList2 = arrayList;
                if (iVar.getHasMore()) {
                    this.f137838b.resumeWith(q.m223constructorimpl(f.a.a(null, Long.valueOf(iVar.getCursor()), arrayList2, 1)));
                } else {
                    this.f137838b.resumeWith(q.m223constructorimpl(f.a.a(arrayList2)));
                }
            }
        }

        @Override // com.bytedance.ies.powerlist.page.config.d
        public final void a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Long>> dVar) {
            List<com.ss.android.ugc.aweme.story.model.h> list;
            int i2;
            l.d(dVar, "");
            if (this.f137836a.ab_()) {
                i iVar = ((IStoryViewerListViewModel) b.a(this.f137836a)).f136725c.get(this.f137836a.f137829b);
                if (iVar == null || (list = iVar.getViewerList()) == null) {
                    list = z.INSTANCE;
                }
                b bVar = this.f137836a;
                i iVar2 = ((IStoryViewerListViewModel) b.a(bVar)).f136725c.get(this.f137836a.f137829b);
                if (iVar2 != null) {
                    i2 = iVar2.getTotal();
                } else {
                    i2 = 0;
                }
                bVar.f137833j = i2;
                e eVar = this.f137836a.f137834k;
                if (eVar != null) {
                    eVar.a(this.f137836a);
                }
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.ss.android.ugc.aweme.story.interaction.b.i.a(it.next(), this.f137836a.f137830c, this.f137836a.f137832e));
                }
                ArrayList arrayList2 = arrayList;
                if (iVar == null || !iVar.getHasMore()) {
                    dVar.resumeWith(q.m223constructorimpl(f.a.a(arrayList2)));
                } else {
                    dVar.resumeWith(q.m223constructorimpl(f.a.a(null, Long.valueOf(iVar.getCursor()), arrayList2, 1)));
                }
                if (!arrayList2.isEmpty()) {
                    LinearLayout linearLayout = (LinearLayout) this.f137836a.a(R.id.avs);
                    l.b(linearLayout, "");
                    linearLayout.setVisibility(8);
                    return;
                }
                LinearLayout linearLayout2 = (LinearLayout) this.f137836a.a(R.id.avs);
                l.b(linearLayout2, "");
                linearLayout2.setVisibility(0);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3628b(b bVar, c cVar) {
            super(cVar);
            this.f137836a = bVar;
        }

        @Override // com.bytedance.ies.powerlist.page.config.d
        public final /* synthetic */ void b(h.c.d dVar, Object obj) {
            long longValue = ((Number) obj).longValue();
            l.d(dVar, "");
            if (this.f137836a.ab_()) {
                return;
            }
            if (TextUtils.isEmpty(this.f137836a.f137829b)) {
                com.ss.android.ugc.aweme.story.j.a.c("StoryViewerListFragment", "dz[story id is empty]");
            } else {
                StoryInteractionApi.f137840a.getStoryViewerList(this.f137836a.f137829b, longValue, 30, null).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this, dVar), C3629b.f137839a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(Aweme aweme) {
        String str;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        this.f137829b = str;
        this.f137831d = aweme;
        this.o = true;
        b();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f67014a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -738219936) {
                if (hashCode == 1436898145 && str.equals("REFRESH_STORY_VIEWER_LIST_SUCCESS") && l.a(((p) bVar2.a()).getFirst(), (Object) this.f137829b)) {
                    j();
                }
            } else if (str.equals("REFRESH_STORY_VIEWER_LIST_FAIL")) {
                l.a(bVar2.a(), (Object) this.f137829b);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        int i2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("story_id")) == null) {
            str = "";
        }
        this.f137829b = str;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("viewer_id")) == null) {
            str2 = "";
        }
        this.f137835m = str2;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.em1);
        l.b(tuxTextView, "");
        int i3 = 8;
        if (this.q) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
        View a2 = a(R.id.an6);
        l.b(a2, "");
        if (this.q) {
            i3 = 0;
        }
        a2.setVisibility(i3);
        ((TuxTextView) view.findViewById(R.id.avt)).setText(R.string.h8t);
        ((TuxTextView) view.findViewById(R.id.avp)).setText(R.string.h8s);
        ((PowerList) a(R.id.cb4)).a(StoryViewerAndLikerCell.class);
        RecyclerView recyclerView = (RecyclerView) a(R.id.cb4);
        l.b(recyclerView, "");
        recyclerView.setItemAnimator(null);
        c cVar = new c();
        cVar.f34356a = 10;
        cVar.f34357b = false;
        this.n = new C3628b(this, cVar);
        PowerList powerList = (PowerList) a(R.id.cb4);
        com.bytedance.ies.powerlist.page.config.b<Long> bVar = this.n;
        if (bVar == null) {
            l.a("config");
        }
        powerList.a(bVar);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b27, viewGroup, false);
    }
}
