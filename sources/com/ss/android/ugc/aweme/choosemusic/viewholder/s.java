package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.b;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.l;
import java.util.List;

public final class s extends a {
    static {
        Covode.recordClassIndex(43720);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.viewholder.a
    public final void a() {
        this.f70889j.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.viewholder.a
    public final void c() {
        b bVar = this.y;
        l.b(bVar, "");
        if (TextUtils.equals("search_music", bVar.f70379a)) {
            if (this.w != null) {
                MusicModel musicModel = this.w;
                l.b(musicModel, "");
                if (musicModel.getMusic() != null) {
                    MusicModel musicModel2 = this.w;
                    l.b(musicModel2, "");
                    Music music = musicModel2.getMusic();
                    l.b(music, "");
                    if (music.getMusicTags() != null) {
                        MusicModel musicModel3 = this.w;
                        l.b(musicModel3, "");
                        Music music2 = musicModel3.getMusic();
                        l.b(music2, "");
                        if (music2.getMusicTags().size() > 0) {
                            com.ss.android.ugc.aweme.discover.h.b f2 = SearchServiceImpl.t().f();
                            RecyclerView recyclerView = this.t;
                            l.b(recyclerView, "");
                            MusicModel musicModel4 = this.w;
                            l.b(musicModel4, "");
                            Music music3 = musicModel4.getMusic();
                            l.b(music3, "");
                            List<MusicTag> musicTags = music3.getMusicTags();
                            l.b(musicTags, "");
                            f2.a(recyclerView, musicTags, new a(this));
                            com.ss.android.ugc.aweme.discover.h.b f3 = SearchServiceImpl.t().f();
                            b bVar2 = this.y;
                            l.b(bVar2, "");
                            String str = bVar2.f70379a;
                            l.b(str, "");
                            f3.a(str, this.w, getAdapterPosition());
                        }
                    }
                }
            }
            if (this.t != null) {
                RecyclerView recyclerView2 = this.t;
                l.b(recyclerView2, "");
                recyclerView2.setVisibility(8);
                this.t.removeAllViews();
            }
            com.ss.android.ugc.aweme.discover.h.b f32 = SearchServiceImpl.t().f();
            b bVar22 = this.y;
            l.b(bVar22, "");
            String str2 = bVar22.f70379a;
            l.b(str2, "");
            f32.a(str2, this.w, getAdapterPosition());
        }
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f71008a;

        static {
            Covode.recordClassIndex(43721);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(s sVar) {
            this.f71008a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            s sVar = this.f71008a;
            sVar.a(sVar.o);
        }
    }

    public s(View view, int i2) {
        super(view, i2);
    }
}
