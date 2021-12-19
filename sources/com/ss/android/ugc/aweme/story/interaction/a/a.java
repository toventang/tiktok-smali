package com.ss.android.ugc.aweme.story.interaction.a;

import android.content.res.Resources;
import android.os.Bundle;
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
import com.ss.android.ugc.aweme.story.api.IStoryLikedListViewModel;
import com.ss.android.ugc.aweme.story.interaction.api.StoryInteractionApi;
import com.ss.android.ugc.aweme.story.interaction.b.i;
import com.ss.android.ugc.aweme.story.interaction.b.j;
import com.ss.android.ugc.aweme.story.interaction.cell.StoryViewerAndLikerCell;
import com.ss.android.ugc.aweme.story.interaction.vm.StoryLikedListViewModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.p;
import h.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.base.f.a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, f, com.ss.android.ugc.aweme.story.b {

    /* renamed from: k  reason: collision with root package name */
    public static final C3625a f137814k = new C3625a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public StoryLikedListViewModel f137815a;

    /* renamed from: b  reason: collision with root package name */
    public String f137816b = "";

    /* renamed from: c  reason: collision with root package name */
    public Aweme f137817c;

    /* renamed from: d  reason: collision with root package name */
    public int f137818d;

    /* renamed from: e  reason: collision with root package name */
    public e f137819e;

    /* renamed from: j  reason: collision with root package name */
    public j f137820j;

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.ies.powerlist.page.config.b<Long> f137821l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f137822m;
    private h n;
    private SparseArray o;

    static {
        Covode.recordClassIndex(90160);
    }

    public final View a(int i2) {
        if (this.o == null) {
            this.o = new SparseArray();
        }
        View view = (View) this.o.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.o.put(i2, findViewById);
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

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.a$a  reason: collision with other inner class name */
    public static final class C3625a {
        static {
            Covode.recordClassIndex(90161);
        }

        private C3625a() {
        }

        public /* synthetic */ C3625a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.b
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.f.a a() {
        return this;
    }

    private final void j() {
        com.bytedance.ies.powerlist.page.config.b<Long> bVar = this.f137821l;
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
        if (this.f137822m) {
            this.f137822m = false;
            k();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    private final void g() {
        StoryLikedListViewModel storyLikedListViewModel = this.f137815a;
        if (storyLikedListViewModel == null) {
            l.a("likerVM");
        }
        storyLikedListViewModel.a("REFRESH_STORY_LIKED_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        storyLikedListViewModel.a("REFRESH_STORY_LIKED_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
    }

    private final void b() {
        String str;
        User user;
        Aweme aweme = this.f137817c;
        h hVar = this.n;
        String str2 = null;
        if (hVar != null) {
            str = hVar.getEnterFrom();
        } else {
            str = null;
        }
        String str3 = this.f137816b;
        Aweme aweme2 = this.f137817c;
        if (aweme2 != null) {
            user = aweme2.getAuthor();
        } else {
            user = null;
        }
        int a2 = com.ss.android.ugc.aweme.story.b.h.a(user);
        Aweme aweme3 = this.f137817c;
        if (aweme3 != null) {
            str2 = com.ss.android.ugc.aweme.story.d.a.b(aweme3);
        }
        this.f137820j = new j(aweme, str, "like_list", str3, a2, "story", str2);
    }

    private final void k() {
        String str;
        h hVar = this.n;
        String str2 = null;
        if (hVar != null) {
            str = hVar.getEventType();
        } else {
            str = null;
        }
        if (!l.a((Object) "homepage_follow", (Object) str)) {
            h hVar2 = this.n;
            if (hVar2 != null) {
                str2 = hVar2.getEventType();
            }
            if (!l.a((Object) "homepage_hot", (Object) str2)) {
                e();
                return;
            }
        }
        g();
        StoryLikedListViewModel storyLikedListViewModel = this.f137815a;
        if (storyLikedListViewModel == null) {
            l.a("likerVM");
        }
        storyLikedListViewModel.a(this.f137816b, 0);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final String d() {
        Resources resources = d.a().getResources();
        int i2 = this.f137818d;
        String quantityString = resources.getQuantityString(R.plurals.j3, i2, com.ss.android.ugc.aweme.i18n.b.a((long) i2));
        l.b(quantityString, "");
        return quantityString;
    }

    private final void e() {
        StoryLikedListViewModel storyLikedListViewModel = this.f137815a;
        if (storyLikedListViewModel == null) {
            l.a("likerVM");
        }
        Integer num = ((IStoryLikedListViewModel) storyLikedListViewModel).f136723d.get(this.f137816b);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                g();
                return;
            } else if (intValue == 1) {
                j();
                g();
                return;
            } else if (intValue == 2) {
                j();
                g();
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
        g();
    }

    @Override // com.ss.android.ugc.aweme.story.b
    public final void b(Aweme aweme) {
        this.f137817c = aweme;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(e eVar) {
        l.d(eVar, "");
        this.f137819e = eVar;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(h hVar) {
        this.n = hVar;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(Aweme aweme) {
        String str;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        this.f137816b = str;
        this.f137817c = aweme;
        this.f137822m = true;
        b();
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void c(boolean z) {
        int i2;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.em1);
        if (tuxTextView != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxTextView.setVisibility(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        androidx.fragment.app.e requireActivity = requireActivity();
        l.b(requireActivity, "");
        this.f137815a = StoryLikedListViewModel.a.a(requireActivity, requireActivity);
        b();
        k();
    }

    public static final class b extends com.bytedance.ies.powerlist.page.config.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f137823a;

        /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.a$b$b  reason: collision with other inner class name */
        static final class C3627b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final C3627b f137826a = new C3627b();

            static {
                Covode.recordClassIndex(90164);
            }

            C3627b() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(90162);
        }

        /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.a$b$a  reason: collision with other inner class name */
        static final class C3626a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f137824a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h.c.d f137825b;

            static {
                Covode.recordClassIndex(90163);
            }

            C3626a(b bVar, h.c.d dVar) {
                this.f137824a = bVar;
                this.f137825b = dVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                com.ss.android.ugc.aweme.story.model.f fVar = (com.ss.android.ugc.aweme.story.model.f) obj;
                List<User> likedList = fVar.getLikedList();
                if (likedList == null) {
                    likedList = z.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(n.a((Iterable) likedList, 10));
                Iterator<T> it = likedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(i.a(it.next(), this.f137824a.f137823a.f137820j));
                }
                ArrayList arrayList2 = arrayList;
                if (fVar.getHasMore()) {
                    this.f137825b.resumeWith(q.m223constructorimpl(f.a.a(null, Long.valueOf(fVar.getCursor()), arrayList2, 1)));
                } else {
                    this.f137825b.resumeWith(q.m223constructorimpl(f.a.a(arrayList2)));
                }
            }
        }

        @Override // com.bytedance.ies.powerlist.page.config.d
        public final void a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Long>> dVar) {
            List<User> list;
            boolean z;
            int i2;
            Long l2;
            l.d(dVar, "");
            if (this.f137823a.ab_()) {
                StoryLikedListViewModel storyLikedListViewModel = this.f137823a.f137815a;
                if (storyLikedListViewModel == null) {
                    l.a("likerVM");
                }
                com.ss.android.ugc.aweme.story.model.f fVar = ((IStoryLikedListViewModel) storyLikedListViewModel).f136722c.get(this.f137823a.f137816b);
                if (fVar == null || (list = fVar.getLikedList()) == null) {
                    list = z.INSTANCE;
                }
                if (fVar != null) {
                    z = fVar.getHasMore();
                } else {
                    z = false;
                }
                a aVar = this.f137823a;
                if (!z) {
                    i2 = list.size();
                } else {
                    Aweme aweme = aVar.f137817c;
                    if (aweme != null) {
                        i2 = aweme.getUserDigg();
                    } else {
                        i2 = 0;
                    }
                }
                aVar.f137818d = i2;
                e eVar = this.f137823a.f137819e;
                if (eVar != null) {
                    eVar.a(this.f137823a);
                }
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(i.a(it.next(), this.f137823a.f137820j));
                }
                ArrayList arrayList2 = arrayList;
                if (z) {
                    if (fVar != null) {
                        l2 = Long.valueOf(fVar.getCursor());
                    } else {
                        l2 = null;
                    }
                    dVar.resumeWith(q.m223constructorimpl(f.a.a(null, l2, arrayList2, 1)));
                } else {
                    dVar.resumeWith(q.m223constructorimpl(f.a.a(arrayList2)));
                }
                if (!arrayList2.isEmpty()) {
                    LinearLayout linearLayout = (LinearLayout) this.f137823a.a(R.id.avs);
                    l.b(linearLayout, "");
                    linearLayout.setVisibility(8);
                    return;
                }
                LinearLayout linearLayout2 = (LinearLayout) this.f137823a.a(R.id.avs);
                l.b(linearLayout2, "");
                linearLayout2.setVisibility(0);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, c cVar) {
            super(cVar);
            this.f137823a = aVar;
        }

        @Override // com.bytedance.ies.powerlist.page.config.d
        public final /* synthetic */ void b(h.c.d dVar, Object obj) {
            long longValue = ((Number) obj).longValue();
            l.d(dVar, "");
            if (!this.f137823a.ab_()) {
                StoryInteractionApi.f137840a.fetchStoryLikedList(this.f137823a.f137816b, longValue, 30).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C3626a(this, dVar), C3627b.f137826a);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f67014a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != 1000683874) {
                if (hashCode == 1736731135 && str.equals("REFRESH_STORY_LIKED_LIST_FAIL")) {
                    l.a(bVar2.a(), (Object) this.f137816b);
                }
            } else if (str.equals("REFRESH_STORY_LIKED_LIST_SUCCESS") && l.a(((p) bVar2.a()).getFirst(), (Object) this.f137816b)) {
                j();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.em1);
        l.b(tuxTextView, "");
        tuxTextView.setVisibility(8);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("story_id")) == null) {
            str = "";
        }
        this.f137816b = str;
        ((TuxTextView) view.findViewById(R.id.avt)).setText(R.string.dhj);
        ((TuxTextView) view.findViewById(R.id.avp)).setText(R.string.dhk);
        ((PowerList) a(R.id.cb4)).a(StoryViewerAndLikerCell.class);
        RecyclerView recyclerView = (RecyclerView) a(R.id.cb4);
        l.b(recyclerView, "");
        recyclerView.setItemAnimator(null);
        c cVar = new c();
        cVar.f34356a = 10;
        cVar.f34357b = false;
        this.f137821l = new b(this, cVar);
        PowerList powerList = (PowerList) a(R.id.cb4);
        com.bytedance.ies.powerlist.page.config.b<Long> bVar = this.f137821l;
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
