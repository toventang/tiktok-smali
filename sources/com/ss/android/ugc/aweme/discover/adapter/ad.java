package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.ext.list.a;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.discover.adapter.af;
import com.ss.android.ugc.aweme.discover.adapter.ag;
import com.ss.android.ugc.aweme.discover.adapter.ah;
import com.ss.android.ugc.aweme.discover.adapter.viewholder.j;
import com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.ss.android.ugc.aweme.discover.mob.c;
import com.ss.android.ugc.aweme.discover.model.CardType;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.music.k.h;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.p;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.k.x;
import com.ss.android.ugc.aweme.search.k.y;
import com.ss.android.ugc.playerkit.model.v;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ad extends p<SearchMusic> implements com.bytedance.jedi.arch.ext.list.a<SearchMusic>, af.b, i {

    /* renamed from: g  reason: collision with root package name */
    public static final a f80311g = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private final ae f80312h;

    /* renamed from: i  reason: collision with root package name */
    private r f80313i;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.jedi.arch.ext.list.a.b<SearchMusic> f80314j;

    /* renamed from: k  reason: collision with root package name */
    private final MusicPlayHelper f80315k;

    static {
        Covode.recordClassIndex(49994);
    }

    @Override // com.bytedance.jedi.arch.ext.list.a
    public final void a(List<? extends SearchMusic> list, h.f.a.a<z> aVar) {
        l.d(list, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49995);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends j.e<SearchMusic> {
        static {
            Covode.recordClassIndex(49996);
        }

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.j.e
        public final /* synthetic */ boolean a(SearchMusic searchMusic, SearchMusic searchMusic2) {
            l.d(searchMusic, "");
            l.d(searchMusic2, "");
            return false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.j.e
        public final /* synthetic */ boolean b(SearchMusic searchMusic, SearchMusic searchMusic2) {
            l.d(searchMusic, "");
            l.d(searchMusic2, "");
            return false;
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.a
    public final com.bytedance.jedi.arch.ext.list.a.b<SearchMusic> a() {
        return this.f80314j;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final int getItemCount() {
        return super.getItemCount();
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final void ah_() {
        super.ah_();
        new y().o("music_search_result").f();
    }

    public static final class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f80316a;

        static {
            Covode.recordClassIndex(49997);
        }

        c(z.e eVar) {
            this.f80316a = eVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            h.a a2 = h.a(this.f80316a.element);
            a2.a("enter_from", "music_search_result");
            t.a(t.a(), a2.a().toString());
            new x().o("music_search_result").f();
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.jedi.arch.ext.list.a
    public final /* bridge */ /* synthetic */ SearchMusic a(int i2) {
        return a.C0960a.a((com.bytedance.jedi.arch.ext.list.a) this, i2, false);
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<? extends SearchMusic> list) {
        MusicPlayHelper musicPlayHelper = this.f80315k;
        if (musicPlayHelper != null) {
            musicPlayHelper.a();
        }
        com.ss.android.ugc.aweme.search.d.d dVar = this.f80579f;
        if (dVar != null) {
            dVar.f120995a = Integer.MIN_VALUE;
        }
        super.b_(this.f80312h.a(list));
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.af.b
    public final void a(f fVar) {
        l.d(fVar, "");
        List list = this.f76354l;
        l.d(fVar, "");
        List<Music> clusterList = fVar.getClusterList();
        ArrayList arrayList = new ArrayList(n.a((Iterable) clusterList, 10));
        Iterator<T> it = clusterList.iterator();
        while (it.hasNext()) {
            SearchMusic searchMusic = new SearchMusic();
            searchMusic.setMusic(it.next());
            arrayList.add(searchMusic);
        }
        List g2 = n.g((Collection) arrayList);
        int indexOf = list.indexOf(fVar);
        if (indexOf >= 0) {
            list.remove(fVar);
            notifyItemRemoved(indexOf);
            list.addAll(indexOf, g2);
            notifyItemRangeInserted(indexOf, g2.size());
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b(List<? extends SearchMusic> list) {
        ae aeVar = this.f80312h;
        List<SearchMusic> list2 = this.f76354l;
        if (list2 != null && !list2.isEmpty() && list != null && !list.isEmpty()) {
            int indexOf = list.indexOf(n.i((List) aeVar.f80318a));
            if (indexOf < list.size() - 1) {
                if (indexOf <= 0) {
                    aeVar.b(list);
                } else {
                    list2 = aeVar.a(list.subList(indexOf + 1, list.size()));
                    list2.addAll(0, list2);
                    aeVar.b(list);
                }
            }
            list = list2;
        } else if (list != null) {
            aeVar.b(list);
        } else {
            list = null;
        }
        super.b(list);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final int c(int i2) {
        Object obj = this.f76354l.get(i2);
        l.b(obj, "");
        if (ae.a((SearchMusic) obj)) {
            return 17;
        }
        if (((SearchMusic) this.f76354l.get(i2)).getCardType() == CardType.TYPE_MUSICIAN.getValue()) {
            return 18;
        }
        if (((SearchMusic) this.f76354l.get(i2)).getCardType() == CardType.TYPE_TRENDING_SOUNDS_TITLE.getValue()) {
            return 20;
        }
        if (((SearchMusic) this.f76354l.get(i2)).getMusic() != null || ((SearchMusic) this.f76354l.get(i2)).getMusicList() != null) {
            return 16;
        }
        if (((SearchMusic) this.f76354l.get(i2)).getCardType() == CardType.TYPE_USER_NOTE.getValue()) {
            return 19;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.i
    public final int a(Music music) {
        l.d(music, "");
        if (com.bytedance.common.utility.collection.b.a((Collection) this.f76354l)) {
            return -1;
        }
        int i2 = -1;
        for (SearchMusic searchMusic : this.f76354l) {
            if (music == searchMusic.getMusic()) {
                return i2 + 1;
            }
            if (searchMusic.getCardType() == CardType.TYPE_MUSICIAN.getValue() && !com.bytedance.common.utility.collection.b.a((Collection) searchMusic.getMusicList())) {
                List<Music> musicList = searchMusic.getMusicList();
                if (musicList == null) {
                    l.b();
                }
                if (music == n.g((List) musicList)) {
                    return i2 + 1;
                }
            }
            l.b(searchMusic, "");
            if (!ae.a(searchMusic)) {
                if (searchMusic.getCardType() == CardType.TYPE_MUSICIAN.getValue()) {
                    if (!com.bytedance.common.utility.collection.b.a((Collection) searchMusic.getMusicList())) {
                        List<Music> musicList2 = searchMusic.getMusicList();
                        if (musicList2 == null) {
                            l.b();
                        }
                        i2 += musicList2.size();
                    }
                    if (!searchMusic.getHasMore()) {
                    }
                }
                i2++;
            }
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        boolean z;
        MethodCollector.i(2776);
        l.d(viewGroup, "");
        RecyclerView.ViewHolder a_ = super.a_(viewGroup);
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Boolean showMusicFeedbackEntrance = iESSettingsProxy.getShowMusicFeedbackEntrance();
            l.b(showMusicFeedbackEntrance, "");
            z = showMusicFeedbackEntrance.booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            z.e eVar = new z.e();
            eVar.element = "";
            try {
                IESSettingsProxy iESSettingsProxy2 = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                l.b(iESSettingsProxy2, "");
                FeConfigCollection feConfigCollection = iESSettingsProxy2.getFeConfigCollection();
                l.b(feConfigCollection, "");
                FEConfig musicFaq = feConfigCollection.getMusicFaq();
                l.b(musicFaq, "");
                T t = (T) musicFaq.getSchema();
                l.b(t, "");
                eVar.element = t;
            } catch (Exception unused2) {
            }
            SpannableString spannableString = new SpannableString("");
            spannableString.setSpan(new c(eVar), 9, spannableString.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(viewGroup.getContext(), R.color.al)), 9, spannableString.length(), 33);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bjc, (ViewGroup) null);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                textView.setText(spannableString, TextView.BufferType.SPANNABLE);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setTextColor(androidx.core.content.b.c(viewGroup.getContext(), R.color.c5));
                textView.setPadding(0, 20, 0, 0);
                View view = a_.itemView;
                if (view != null) {
                    DmtStatusView dmtStatusView = (DmtStatusView) view;
                    dmtStatusView.setBuilder(dmtStatusView.c().b(textView));
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
                    MethodCollector.o(2776);
                    throw nullPointerException;
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                MethodCollector.o(2776);
                throw nullPointerException2;
            }
        }
        l.b(a_, "");
        MethodCollector.o(2776);
        return a_;
    }

    public static final class d extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f80317a;

        static {
            Covode.recordClassIndex(49998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ViewGroup viewGroup, View view) {
            super(view);
            this.f80317a = viewGroup;
        }
    }

    public /* synthetic */ ad(com.ss.android.ugc.aweme.search.model.d dVar, a.b bVar) {
        this(null, dVar, bVar, null);
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2) {
        MethodCollector.i(2501);
        l.d(viewGroup, "");
        switch (i2) {
            case 16:
                String l2 = l();
                l.b(l2, "");
                l.d(viewGroup, "");
                l.d(l2, "");
                l.d(this, "");
                ah a2 = ah.a.a(viewGroup, this);
                l.d(l2, "");
                a2.f80334g = l2;
                a2.b("search_result");
                MethodCollector.o(2501);
                return a2;
            case 17:
                l.d(viewGroup, "");
                l.d(this, "");
                View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.avw, viewGroup, false);
                l.b(a3, "");
                af afVar = new af(a3, this);
                MethodCollector.o(2501);
                return afVar;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                l.d(viewGroup, "");
                l.d(this, "");
                View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.awx, viewGroup, false);
                l.b(a4, "");
                ai aiVar = new ai(a4, this);
                MethodCollector.o(2501);
                return aiVar;
            case 19:
                ag a5 = ag.a.a(viewGroup);
                MethodCollector.o(2501);
                return a5;
            case v.U /*{ENCODED_INT: 20}*/:
                RecyclerView.ViewHolder a6 = j.a.a(viewGroup);
                MethodCollector.o(2501);
                return a6;
            default:
                d dVar = new d(viewGroup, new View(viewGroup.getContext()));
                MethodCollector.o(2501);
                return dVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.discover.adapter.p, com.ss.android.ugc.aweme.base.widget.g
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        List<Music> musicList;
        String str;
        String str2;
        String str3;
        int i3;
        String str4;
        MethodCollector.i(2538);
        l.d(viewHolder, "");
        try {
            if (viewHolder instanceof p) {
                p pVar = (p) viewHolder;
                Object obj = this.f76354l.get(i2);
                l.b(obj, "");
                SearchMusic searchMusic = (SearchMusic) obj;
                l.d(searchMusic, "");
                r rVar = this.f80313i;
                if (rVar == null) {
                    q a2 = am.a();
                    if (a2 != null) {
                        str2 = a2.c().f121172a;
                        str3 = a2.c().f121173b;
                        i3 = a2.a();
                    } else {
                        str2 = "";
                        str3 = str2;
                        i3 = 0;
                    }
                    LogPbBean logPb = searchMusic.getLogPb();
                    if (logPb == null) {
                        logPb = new LogPbBean();
                    }
                    LogPbBean logPb2 = searchMusic.getLogPb();
                    if (logPb2 == null || (str4 = logPb2.getImprId()) == null) {
                        str4 = "";
                    }
                    String b2 = ac.a.f91473a.b(str4);
                    com.ss.android.ugc.aweme.search.model.d dVar = this.f80577d;
                    l.b(dVar, "");
                    dVar.getEnterMethod();
                    String a3 = c.b.a.a(1);
                    String a4 = c.a.a(1);
                    if (i2 % 10 == 0) {
                        c.a.a("music");
                    }
                    r f2 = r.a.a().f("search_result");
                    f2.f121266a = false;
                    r h2 = f2.g(str2).h(str4);
                    l.b(b2, "");
                    r a5 = h2.i(b2).a(logPb);
                    a5.f121267b = i3;
                    a5.f121278m = i2;
                    r e2 = a5.e(str3);
                    e2.f121268c = 1;
                    rVar = e2.c(a3).d(a4);
                }
                pVar.a(rVar);
            }
            if (viewHolder instanceof ah) {
                Music music = ((SearchMusic) this.f76354l.get(i2)).getMusic();
                String l2 = l();
                l.b(l2, "");
                ((ah) viewHolder).a(music, l2);
            } else if (viewHolder instanceof af) {
                af afVar = (af) viewHolder;
                SearchMusic searchMusic2 = (SearchMusic) this.f76354l.get(i2);
                String l3 = l();
                l.b(l3, "");
                l.d(l3, "");
                if (searchMusic2 instanceof f) {
                    int size = ((f) searchMusic2).getClusterList().size();
                    View view = afVar.itemView;
                    l.b(view, "");
                    Context context = view.getContext();
                    l.b(context, "");
                    String string = context.getResources().getString(R.string.fil);
                    l.b(string, "");
                    TextView textView = afVar.f80320a;
                    String a6 = com.a.a(string, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                    l.b(a6, "");
                    textView.setText(a6);
                    afVar.f80321b = (f) searchMusic2;
                    afVar.f80322c = l3;
                    if (!((f) searchMusic2).isMobShowSent()) {
                        afVar.a("matched_sounds_show", (f) searchMusic2);
                        ((f) searchMusic2).setMobShowSent(true);
                    }
                }
            } else if (viewHolder instanceof ai) {
                ai aiVar = (ai) viewHolder;
                SearchMusic searchMusic3 = (SearchMusic) this.f76354l.get(i2);
                String l4 = l();
                l.b(l4, "");
                l.d(l4, "");
                if (!(searchMusic3 == null || (musicList = searchMusic3.getMusicList()) == null || com.bytedance.common.utility.collection.b.a((Collection) musicList))) {
                    aiVar.f80364f = searchMusic3;
                    aiVar.f80365g = l4;
                    TextView textView2 = aiVar.f80359a;
                    String string2 = aiVar.G().getString(R.string.dc9, ((Music) n.g((List) musicList)).getAuthorName());
                    l.b(string2, "");
                    String a7 = com.a.a(string2, Arrays.copyOf(new Object[0], 0));
                    l.b(a7, "");
                    textView2.setText(a7);
                    aiVar.f80360b.removeAllViews();
                    Iterator<T> it = musicList.iterator();
                    while (it.hasNext()) {
                        ah a8 = ah.a.a(aiVar.f80360b, aiVar);
                        a8.b("search_result");
                        a8.a(aiVar.F());
                        a8.a(it.next(), l4);
                        aiVar.f80360b.addView(a8.I());
                    }
                    int i4 = 8;
                    if (searchMusic3.getHasMore()) {
                        aiVar.f80361c.setVisibility(0);
                        aiVar.f80363e.setVisibility(8);
                    } else {
                        aiVar.f80361c.setVisibility(8);
                        aiVar.f80363e.setVisibility(0);
                    }
                    View view2 = aiVar.f80362d;
                    if (!(aiVar.getAdapterPosition() == 0 || aiVar.getAdapterPosition() == 1)) {
                        i4 = 0;
                    }
                    view2.setVisibility(i4);
                    if (!searchMusic3.getHasMobShow()) {
                        com.ss.android.ugc.aweme.search.k.a aVar = (com.ss.android.ugc.aweme.search.k.a) new com.ss.android.ugc.aweme.search.k.a().o("search_result");
                        SearchMusic searchMusic4 = aiVar.f80364f;
                        if (searchMusic4 == null) {
                            l.b();
                        }
                        List<Music> musicList2 = searchMusic4.getMusicList();
                        if (musicList2 == null) {
                            l.b();
                        }
                        com.ss.android.ugc.aweme.search.k.a aVar2 = (com.ss.android.ugc.aweme.search.k.a) aVar.c("music_num", String.valueOf(musicList2.size()));
                        SearchMusic searchMusic5 = aiVar.f80364f;
                        if (searchMusic5 == null) {
                            l.b();
                        }
                        com.ss.android.ugc.aweme.search.k.a aVar3 = (com.ss.android.ugc.aweme.search.k.a) aVar2.c("music_list", ai.a(searchMusic5));
                        SearchMusic searchMusic6 = aiVar.f80364f;
                        if (searchMusic6 == null) {
                            l.b();
                        }
                        if (searchMusic6.getHasMore()) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        com.ss.android.ugc.aweme.search.k.a aVar4 = (com.ss.android.ugc.aweme.search.k.a) ((com.ss.android.ugc.aweme.search.k.a) aVar3.c("is_more_sounds", str)).b(aiVar.f80365g);
                        ac acVar = ac.a.f91473a;
                        SearchMusic searchMusic7 = aiVar.f80364f;
                        if (searchMusic7 == null) {
                            l.b();
                        }
                        List<Music> musicList3 = searchMusic7.getMusicList();
                        if (musicList3 == null) {
                            l.b();
                        }
                        ((com.ss.android.ugc.aweme.search.k.a) aVar4.c(acVar.a(musicList3.get(0).getRequestId()))).f();
                        searchMusic3.setHasMobShow(true);
                    }
                }
            } else if (viewHolder instanceof ag) {
                ((ag) viewHolder).a();
            }
            com.ss.android.ugc.aweme.search.d.d dVar2 = this.f80579f;
            if (dVar2 != null) {
                dVar2.a(i2, c());
                MethodCollector.o(2538);
                return;
            }
            MethodCollector.o(2538);
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.search.d.d dVar3 = this.f80579f;
            if (dVar3 != null) {
                dVar3.a(i2, c());
            }
            MethodCollector.o(2538);
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ad(MusicPlayHelper musicPlayHelper, com.ss.android.ugc.aweme.search.model.d dVar, a.b bVar, com.ss.android.ugc.aweme.search.d.b bVar2) {
        super(dVar, bVar, bVar2);
        l.d(bVar, "");
        this.f80315k = musicPlayHelper;
        this.f80312h = new ae();
        this.f80314j = new com.bytedance.jedi.arch.ext.list.a.b<>(this, new b(), (byte) 0);
    }
}
