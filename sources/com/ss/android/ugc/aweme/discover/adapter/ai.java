package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.k.b;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.h;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ai extends b implements i {

    /* renamed from: h  reason: collision with root package name */
    public static final a f80358h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final TextView f80359a;

    /* renamed from: b  reason: collision with root package name */
    final ViewGroup f80360b;

    /* renamed from: c  reason: collision with root package name */
    final View f80361c;

    /* renamed from: d  reason: collision with root package name */
    final View f80362d;

    /* renamed from: e  reason: collision with root package name */
    final Space f80363e;

    /* renamed from: f  reason: collision with root package name */
    public SearchMusic f80364f;

    /* renamed from: g  reason: collision with root package name */
    String f80365g;

    /* renamed from: i  reason: collision with root package name */
    private final i f80366i;

    static {
        Covode.recordClassIndex(50021);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50023);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        String str;
        b o = new h().o("search_result");
        SearchMusic searchMusic = this.f80364f;
        if (searchMusic == null) {
            l.b();
        }
        List<Music> musicList = searchMusic.getMusicList();
        if (musicList == null) {
            l.b();
        }
        b c2 = o.c("music_num", String.valueOf(musicList.size()));
        SearchMusic searchMusic2 = this.f80364f;
        if (searchMusic2 == null) {
            l.b();
        }
        b c3 = c2.c("music_list", a(searchMusic2));
        SearchMusic searchMusic3 = this.f80364f;
        if (searchMusic3 == null) {
            l.b();
        }
        if (searchMusic3.getHasMore()) {
            str = "1";
        } else {
            str = "0";
        }
        c b2 = ((c) c3.c("is_more_sounds", str)).b(this.f80365g);
        ac acVar = ac.a.f91473a;
        SearchMusic searchMusic4 = this.f80364f;
        if (searchMusic4 == null) {
            l.b();
        }
        List<Music> musicList2 = searchMusic4.getMusicList();
        if (musicList2 == null) {
            l.b();
        }
        b2.c(acVar.a(musicList2.get(0).getRequestId())).f();
    }

    static String a(SearchMusic searchMusic) {
        StringBuilder sb = new StringBuilder();
        List<Music> musicList = searchMusic.getMusicList();
        if (musicList == null) {
            l.b();
        }
        Iterator<T> it = musicList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getMid()).append(",");
        }
        p.a((CharSequence) sb, (CharSequence) ",");
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.i
    public final int a(Music music) {
        l.d(music, "");
        i iVar = this.f80366i;
        SearchMusic searchMusic = this.f80364f;
        if (searchMusic == null) {
            l.b();
        }
        List<Music> musicList = searchMusic.getMusicList();
        if (musicList == null) {
            l.b();
        }
        int a2 = iVar.a((Music) n.g((List) musicList));
        SearchMusic searchMusic2 = this.f80364f;
        if (searchMusic2 == null) {
            l.b();
        }
        List<Music> musicList2 = searchMusic2.getMusicList();
        if (musicList2 == null) {
            l.b();
        }
        return a2 + musicList2.indexOf(music);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ai(View view, i iVar) {
        super(view);
        l.d(view, "");
        l.d(iVar, "");
        this.f80366i = iVar;
        View findViewById = view.findViewById(R.id.title);
        l.b(findViewById, "");
        this.f80359a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.adh);
        l.b(findViewById2, "");
        this.f80360b = (ViewGroup) findViewById2;
        View findViewById3 = view.findViewById(R.id.fi3);
        l.b(findViewById3, "");
        this.f80361c = findViewById3;
        View findViewById4 = view.findViewById(R.id.enx);
        l.b(findViewById4, "");
        this.f80362d = findViewById4;
        View findViewById5 = view.findViewById(R.id.v0);
        l.b(findViewById5, "");
        this.f80363e = (Space) findViewById5;
        findViewById3.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.discover.adapter.ai.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ai f80367a;

            static {
                Covode.recordClassIndex(50022);
            }

            {
                this.f80367a = r1;
            }

            public final void onClick(View view) {
                List<Music> musicList;
                ClickAgent.onClick(view);
                SearchMusic searchMusic = this.f80367a.f80364f;
                if (searchMusic != null && (musicList = searchMusic.getMusicList()) != null && !com.bytedance.common.utility.collection.b.a((Collection) musicList)) {
                    int a2 = this.f80367a.a((Music) n.i((List) musicList)) + 1;
                    Context G = this.f80367a.G();
                    String authorName = ((Music) n.g((List) musicList)).getAuthorName();
                    l.b(authorName, "");
                    l.d(G, "");
                    l.d(authorName, "");
                    Intent intent = new Intent(G, MusicianMusicListActivity.class);
                    intent.putExtra("param_music_author", authorName);
                    intent.putExtra("param_holder_postion", a2);
                    com.ss.android.ugc.tiktok.security.a.a.a(intent, G);
                    G.startActivity(intent);
                    this.f80367a.a();
                }
            }
        });
    }
}
