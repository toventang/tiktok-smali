package com.ss.android.ugc.aweme.discover.service;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.a.ak;
import com.ss.android.ugc.aweme.discover.adapter.ag;
import com.ss.android.ugc.aweme.discover.adapter.viewholder.j;
import com.ss.android.ugc.aweme.discover.helper.aa;
import com.ss.android.ugc.aweme.discover.helper.ab;
import com.ss.android.ugc.aweme.discover.helper.ac;
import com.ss.android.ugc.aweme.discover.helper.i;
import com.ss.android.ugc.aweme.discover.helper.k;
import com.ss.android.ugc.aweme.discover.helper.v;
import com.ss.android.ugc.aweme.discover.k.d;
import com.ss.android.ugc.aweme.discover.lynx.e.a;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.SearchUserFeedback;
import com.ss.android.ugc.aweme.discover.service.c;
import com.ss.android.ugc.aweme.discover.ui.Dialog.d;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.search.g.g;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.e;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class a implements com.ss.android.ugc.aweme.discover.h.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82038b = new a();

    private a() {
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final void a(String str, Fragment fragment) {
        l.d(str, "");
        if (fragment != null && (fragment instanceof com.ss.android.ugc.aweme.discover.ui.a.b)) {
            ((com.ss.android.ugc.aweme.discover.ui.a.b) fragment).c();
            com.ss.android.ugc.aweme.discover.ui.a.b.a.a a2 = com.ss.android.ugc.aweme.discover.ui.a.b.a.b.f82221b.a(str);
            if (a2 != null) {
                com.ss.android.ugc.aweme.search.g.c cVar = a2.f82216b;
                if (cVar != null) {
                    cVar.reset();
                }
                com.ss.android.ugc.aweme.search.g.c cVar2 = a2.f82217c;
                if (cVar2 != null) {
                    cVar2.reset();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final void a(com.ss.android.ugc.aweme.search.g.b bVar, Fragment fragment) {
        g gVar;
        Map<String, String> map;
        Map<String, String> map2;
        if (fragment != null && (fragment instanceof com.ss.android.ugc.aweme.discover.ui.a.b)) {
            com.ss.android.ugc.aweme.discover.ui.a.b bVar2 = (com.ss.android.ugc.aweme.discover.ui.a.b) fragment;
            bVar2.f82205c = bVar;
            g gVar2 = null;
            if (bVar != null) {
                gVar = bVar.getFilterByStruct();
                gVar2 = bVar.getSortTypeStruct();
            } else {
                gVar = null;
            }
            Map<String, String> map3 = bVar2.f82206d;
            e eVar = new e();
            q a2 = am.a();
            com.ss.android.ugc.aweme.search.k.c f2 = eVar.f(j.a(a2 != null ? a2.a() : 0));
            if (map3 == null) {
                map3 = new LinkedHashMap<>();
            }
            com.ss.android.ugc.aweme.search.k.b b2 = f2.b(map3);
            if (gVar == null || (map = gVar.getLogInfo()) == null) {
                map = new LinkedHashMap<>();
            }
            com.ss.android.ugc.aweme.search.k.b b3 = b2.b(map);
            if (gVar2 == null || (map2 = gVar2.getLogInfo()) == null) {
                map2 = new LinkedHashMap<>();
            }
            b3.b(map2).f();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final boolean a(String str) {
        l.d(str, "");
        d.a a2 = d.a(str);
        String schema = a2 != null ? a2.getSchema() : null;
        return (schema == null || schema.length() == 0) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final void a(i.a aVar) {
        l.d(aVar, "");
        v.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final void a(String str, MusicModel musicModel, int i2) {
        l.d(str, "");
        if (musicModel != null) {
            b.i.b(new b(musicModel, str, i2), r.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final void a(String str, MusicModel musicModel, int i2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (musicModel != null) {
            b.i.b(new CallableC1920a(musicModel, str, str2, i2), r.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final com.ss.android.ugc.aweme.discover.helper.j b() {
        return new ab();
    }

    static {
        Covode.recordClassIndex(51061);
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final com.ss.android.ugc.aweme.discover.h.c a() {
        if (com.ss.android.ugc.aweme.discover.k.a.a() == null) {
            return null;
        }
        return new aa();
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final boolean c() {
        if (!com.ss.android.ugc.aweme.discover.ui.a.b.a.b.a(com.ss.android.ugc.aweme.discover.ui.a.b.a.b.f82221b.a("music")) || !ak.f80153a) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.service.a$a  reason: collision with other inner class name */
    static final class CallableC1920a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicModel f82039a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82040b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f82041c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f82042d;

        static {
            Covode.recordClassIndex(51062);
        }

        CallableC1920a(MusicModel musicModel, String str, String str2, int i2) {
            this.f82039a = musicModel;
            this.f82040b = str;
            this.f82041c = str2;
            this.f82042d = i2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            MusicModel musicModel = this.f82039a;
            if (musicModel == null) {
                l.b();
            }
            LogPbBean logPb = musicModel.getLogPb();
            l.b(logPb, "");
            logPb.getImprId();
            LogPbBean logPb2 = this.f82039a.getLogPb();
            l.b(logPb2, "");
            String imprId = logPb2.getImprId();
            GsonProvider c2 = GsonHolder.c();
            l.b(c2, "");
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "general_search").a("search_id", this.f82039a.getSearchId()).a("search_keyword", this.f82039a.getSearchKeyWords()).a("log_pb", c2.b().b(this.f82039a.getLogPb())).a("impr_id", imprId).a("enter_from", this.f82040b).a("button_type", this.f82041c).a("is_aladdin", "1").a("search_result_id", this.f82039a.getMusicId()).a("token_type", "music").a("is_aladdin", "0").a("rank", String.valueOf(this.f82042d));
            MusicModel musicModel2 = this.f82039a;
            if (!(musicModel2 == null || musicModel2.getMusic() == null)) {
                Music music = this.f82039a.getMusic();
                l.b(music, "");
                if (music.getMusicTags() != null) {
                    GsonProvider c3 = GsonHolder.c();
                    l.b(c3, "");
                    f b2 = c3.b();
                    Music music2 = this.f82039a.getMusic();
                    l.b(music2, "");
                    a2.a("music_tag_info", b2.b(music2.getMusicTags()));
                    r.a("search_result_click", a2.f66730a);
                    return null;
                }
            }
            a2.a("music_tag_info", "");
            r.a("search_result_click", a2.f66730a);
            return null;
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicModel f82043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82044b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f82045c;

        static {
            Covode.recordClassIndex(51063);
        }

        b(MusicModel musicModel, String str, int i2) {
            this.f82043a = musicModel;
            this.f82044b = str;
            this.f82045c = i2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            MusicModel musicModel = this.f82043a;
            if (musicModel == null) {
                l.b();
            }
            LogPbBean logPb = musicModel.getLogPb();
            l.b(logPb, "");
            logPb.getImprId();
            LogPbBean logPb2 = this.f82043a.getLogPb();
            l.b(logPb2, "");
            String imprId = logPb2.getImprId();
            GsonProvider c2 = GsonHolder.c();
            l.b(c2, "");
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "general_search").a("search_id", this.f82043a.getSearchId()).a("search_keyword", this.f82043a.getSearchKeyWords()).a("log_pb", c2.b().b(this.f82043a.getLogPb())).a("impr_id", imprId).a("enter_from", this.f82044b).a("is_aladdin", "1").a("search_result_id", this.f82043a.getMusicId()).a("token_type", "music").a("is_aladdin", "0").a("rank", String.valueOf(this.f82045c));
            MusicModel musicModel2 = this.f82043a;
            if (!(musicModel2 == null || musicModel2.getMusic() == null)) {
                Music music = this.f82043a.getMusic();
                l.b(music, "");
                if (music.getMusicTags() != null) {
                    GsonProvider c3 = GsonHolder.c();
                    l.b(c3, "");
                    f b2 = c3.b();
                    Music music2 = this.f82043a.getMusic();
                    l.b(music2, "");
                    a2.a("music_tag_info", b2.b(music2.getMusicTags()));
                    r.a("search_result_show", a2.f66730a);
                    return null;
                }
            }
            a2.a("music_tag_info", "");
            r.a("search_result_show", a2.f66730a);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final com.ss.android.ugc.aweme.discover.h.a a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        return ag.a.a(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final com.ss.android.ugc.aweme.discover.mixfeed.e.a b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        return a.C1902a.a(viewGroup, null);
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final RecyclerView.ViewHolder d(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        return j.a.a(viewGroup);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f82046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f82047b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f82048c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f82049d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fragment f82050e;

        static {
            Covode.recordClassIndex(51064);
        }

        c(androidx.fragment.app.e eVar, View.OnClickListener onClickListener, Map map, View.OnClickListener onClickListener2, Fragment fragment) {
            this.f82046a = eVar;
            this.f82047b = onClickListener;
            this.f82048c = map;
            this.f82049d = onClickListener2;
            this.f82050e = fragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a.a("close_filter", this.f82048c);
            View.OnClickListener onClickListener = this.f82049d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final RecyclerView.ViewHolder c(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.avb, viewGroup, false);
        l.b(a2, "");
        return new com.ss.android.ugc.aweme.discover.adapter.viewholder.g(a2);
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final k a(k.b bVar) {
        l.d(bVar, "");
        return new ac(bVar);
    }

    public static void a(String str, Map<String, String> map) {
        l.d(str, "");
        l.d(map, "");
        new com.ss.android.ugc.aweme.search.k.f().r("by_all").a(map).a("button_type", str).f();
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final SpannableString a(Context context, String str, List<? extends Position> list) {
        SpannableString spannableString;
        l.d(context, "");
        l.d(str, "");
        if (str == null) {
            str = "";
        }
        if (context == null || TextUtils.isEmpty(str) || com.bytedance.common.utility.collection.b.a((Collection) list)) {
            spannableString = new SpannableString(str);
        } else {
            spannableString = new SpannableString(str);
            for (Position position : list) {
                if (position != null) {
                    int begin = position.getBegin();
                    int end = position.getEnd() + 1;
                    int max = Math.max(0, begin);
                    if (!TextUtils.isEmpty(spannableString) && max <= end && max < spannableString.length() && end <= spannableString.length()) {
                        spannableString.setSpan(new StyleSpan(1), max, end, 17);
                    }
                }
            }
        }
        l.b(spannableString, "");
        return spannableString;
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final Fragment a(String str, boolean z, com.ss.android.ugc.aweme.search.g.e eVar) {
        String schema;
        l.d(str, "");
        l.d(eVar, "");
        com.ss.android.ugc.aweme.discover.ui.a.b bVar = new com.ss.android.ugc.aweme.discover.ui.a.b();
        bVar.f82203a = eVar;
        com.ss.android.ugc.aweme.discover.ui.a.b.a.a a2 = com.ss.android.ugc.aweme.discover.ui.a.b.a.b.f82221b.a(str);
        if (com.ss.android.ugc.aweme.discover.ui.a.b.a.b.a(a2) && a2 != null) {
            com.ss.android.ugc.aweme.search.g.c cVar = a2.f82216b;
            if (cVar != null) {
                cVar.reset();
            }
            com.ss.android.ugc.aweme.search.g.c cVar2 = a2.f82217c;
            if (cVar2 != null) {
                cVar2.reset();
            }
        }
        com.ss.android.ugc.aweme.discover.ui.a.a.a.a a3 = bVar.a();
        List<? extends Object> list = null;
        if (!z) {
            a2 = null;
        }
        a3.f82192a = a2;
        com.ss.android.ugc.aweme.discover.ui.a.a.a.a a4 = bVar.a();
        d.a a5 = d.a(str);
        if (!(a5 == null || (schema = a5.getSchema()) == null || schema.length() == 0)) {
            list = n.c(new SearchUserFeedback(schema));
        }
        a4.f82193b = list;
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final void a(RecyclerView recyclerView, List<MusicTag> list, View.OnClickListener onClickListener) {
        l.d(recyclerView, "");
        l.d(list, "");
        l.d(onClickListener, "");
        Context context = recyclerView.getContext();
        l.b(context, "");
        l.d(context, "");
        l.d(list, "");
        l.d(onClickListener, "");
        recyclerView.setVisibility(0);
        if (recyclerView.getAdapter() == null) {
            recyclerView.setLayoutManager(new SearchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1(recyclerView, context, onClickListener, list));
            recyclerView.setAdapter(new b(onClickListener, recyclerView));
            if (gb.a(context)) {
                recyclerView.addOnAttachStateChangeListener(new c.a(recyclerView, context, onClickListener, list));
            }
        }
        if (recyclerView.getAdapter() != null) {
            RecyclerView.a adapter = recyclerView.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.service.SearchMusicTagAdapter");
            b bVar = (b) adapter;
            l.d(list, "");
            bVar.f82052b = new int[2];
            bVar.f82051a.clear();
            bVar.f82051a.addAll(list);
            bVar.notifyDataSetChanged();
            RecyclerView.i layoutManager = bVar.f82053c.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.e(0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.h.b
    public final void a(androidx.fragment.app.e eVar, Fragment fragment, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, Map<String, String> map) {
        String str;
        String str2;
        Fragment fragment2;
        String string;
        String str3 = "";
        l.d(fragment, str3);
        l.d(onClickListener, str3);
        l.d(map, str3);
        if (eVar != null) {
            d.b bVar = new d.b();
            Resources resources = eVar.getResources();
            if (resources == null || (str = resources.getString(R.string.dc8)) == null) {
                str = str3;
            }
            bVar.a(str);
            Resources resources2 = eVar.getResources();
            if (resources2 == null || (str2 = resources2.getString(R.string.a9k)) == null) {
                str2 = str3;
            }
            bVar.b(str2);
            Resources resources3 = eVar.getResources();
            if (!(resources3 == null || (string = resources3.getString(R.string.v9)) == null)) {
                str3 = string;
            }
            bVar.c(str3);
            bVar.f82127i = onClickListener;
            bVar.f82126h = false;
            bVar.f82125g = R.color.bz;
            bVar.f82124f = R.color.bh;
            bVar.f82122d = new c(eVar, onClickListener, map, onClickListener2, fragment);
            boolean z = fragment instanceof com.ss.android.ugc.aweme.discover.ui.a.b;
            if (!z) {
                fragment2 = null;
            } else {
                fragment2 = fragment;
            }
            com.ss.android.ugc.aweme.discover.ui.a.b bVar2 = (com.ss.android.ugc.aweme.discover.ui.a.b) fragment2;
            if (bVar2 != null) {
                bVar.f82120b = com.ss.android.ugc.aweme.discover.helper.c.a(eVar, bVar2.a().f82192a, ((com.ss.android.ugc.aweme.discover.ui.a.b) fragment).f82209k);
                bVar.f82128j = com.ss.android.ugc.aweme.discover.helper.c.a(bVar2.a().f82192a);
            }
            com.ss.android.ugc.aweme.discover.ui.Dialog.d a2 = d.a.a(R.id.dqk, eVar, fragment, bVar);
            if (z) {
                com.ss.android.ugc.aweme.discover.ui.a.b bVar3 = (com.ss.android.ugc.aweme.discover.ui.a.b) fragment;
                bVar3.f82204b = a2;
                bVar3.f82206d = map;
            }
            a("open_filter", map);
        }
    }
}
