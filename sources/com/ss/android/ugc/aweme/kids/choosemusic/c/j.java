package com.ss.android.ugc.aweme.kids.choosemusic.c;

import android.view.View;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.kids.a.h.d;
import com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.kids.choosemusic.d.a;
import com.ss.android.ugc.aweme.kids.choosemusic.d.b;
import com.ss.android.ugc.aweme.kids.choosemusic.e.l;
import com.ss.android.ugc.aweme.kids.choosemusic.h.e;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.r;

public class j extends d implements h.a, a<Music>, a {

    /* renamed from: l  reason: collision with root package name */
    public b f105562l;

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.choosemusic.a f105563m;

    static {
        Covode.recordClassIndex(67618);
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String b() {
        return "user_collected_music_list";
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.a
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String c() {
        return "refresh_status_user_collected_music";
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String d() {
        return "loadmore_status_user_collected_music";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d
    public final boolean g() {
        return false;
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.kids.choosemusic.c.d
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(312, new g(j.class, "onEvent", com.ss.android.ugc.aweme.kids.a.d.a.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d
    public final int n() {
        return 1;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d
    public final String o() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.a
    public final void r() {
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d, com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final void a() {
        super.a();
        this.f105530d.b();
    }

    public final View m() {
        if (this.f105532j == null) {
            return null;
        }
        return ((e) this.f105532j).f105692b;
    }

    /* renamed from: p */
    public final com.ss.android.ugc.aweme.kids.choosemusic.a.b k() {
        if (this.f105532j != null) {
            return (com.ss.android.ugc.aweme.kids.choosemusic.a.b) this.f105532j.c();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.a
    public final void q() {
        if (this.f105530d != null) {
            this.f105530d.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d, com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final DataCenter e() {
        this.f105531e = super.e();
        this.f105531e.a("music_collect_status", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("music_index", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        return this.f105531e;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    /* renamed from: l */
    public final void s() {
        if (this.f105530d != null && this.f105531e != null) {
            com.ss.android.ugc.aweme.arch.b bVar = (com.ss.android.ugc.aweme.arch.b) this.f105531e.a("user_collected_music_list");
            if ((this.f105532j instanceof e) && ((e) this.f105532j).f105699i) {
                if (this.f105532j != null) {
                    this.f105532j.a();
                }
                com.ss.android.ugc.aweme.kids.choosemusic.e.a aVar = this.f105530d;
                int intValue = ((Integer) bVar.a("list_cursor")).intValue();
                if (!aVar.f105594f) {
                    aVar.f105594f = true;
                    ChooseMusicApi.a(intValue).a(new l(aVar), i.f4826c, null);
                }
            }
        }
    }

    @r
    public void onEvent(com.ss.android.ugc.aweme.kids.a.d.a aVar) {
        if (this.f105531e != null && aVar != null) {
            this.f105531e.a("music_collect_status", new com.ss.android.ugc.aweme.kids.choosemusic.b.a(0, aVar.f105300a, -1, -1, aVar.f105301b));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d
    public final c b(View view) {
        com.ss.android.ugc.aweme.kids.choosemusic.h.j jVar = new com.ss.android.ugc.aweme.kids.choosemusic.h.j(getContext(), view, this, this, this, this.f105533k);
        jVar.a(new b() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.c.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67619);
            }

            @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.b
            public final void a(d.a aVar) {
                if (j.this.f105562l != null) {
                    j.this.f105562l.a(aVar);
                }
            }

            @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.b
            public final void b(MusicModel musicModel) {
                if (j.this.f105562l != null) {
                    j.this.f105562l.b(musicModel);
                }
            }

            @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.b
            public final void a(MusicModel musicModel) {
                if (j.this.f105562l != null) {
                    j.this.f105562l.a(musicModel);
                }
            }

            @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.b
            public final void a(MusicModel musicModel, com.ss.android.ugc.aweme.kids.choosemusic.a aVar) {
                if (j.this.f105562l != null) {
                    j.this.f105562l.a(musicModel, aVar);
                }
                if (((Integer) j.this.f105531e.b("music_position", (Object) -1)).intValue() == -2) {
                    j.this.f105531e.a("music_position", (Object) -1);
                    j.this.f105531e.a("music_index", (Object) -1);
                }
            }
        });
        com.ss.android.ugc.aweme.kids.choosemusic.a aVar = new com.ss.android.ugc.aweme.kids.choosemusic.a("change_music_page", "favorite_song", "", com.ss.android.ugc.aweme.kids.choosemusic.g.c.f105649a);
        this.f105563m = aVar;
        jVar.a(aVar);
        jVar.a(false);
        jVar.a(new k(this));
        return jVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        RecyclerView recyclerView;
        MusicModel musicModel;
        super.setUserVisibleHint(z);
        if (z && (m() instanceof RecyclerView) && (recyclerView = (RecyclerView) m()) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int m2 = linearLayoutManager.m();
            f c2 = this.f105532j.c();
            if (c2 != null) {
                List e2 = c2.e();
                if (!com.bytedance.common.utility.collection.b.a((Collection) e2)) {
                    for (int k2 = linearLayoutManager.k(); k2 < m2; k2++) {
                        if (k2 >= 0 && k2 < e2.size() && (musicModel = (MusicModel) e2.get(k2)) != null) {
                            com.ss.android.ugc.aweme.kids.choosemusic.a aVar = this.f105563m;
                            String musicId = musicModel.getMusicId();
                            musicModel.getMatchedPGCSoundInfo();
                            com.ss.android.ugc.aweme.kids.choosemusic.g.c.a(aVar, musicId, k2, true);
                        }
                    }
                }
            }
        }
        if (this.f105532j instanceof com.ss.android.ugc.aweme.kids.choosemusic.h.j) {
            ((com.ss.android.ugc.aweme.kids.choosemusic.h.d) this.f105532j).a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        super.onChanged(bVar);
        if (ab_()) {
            String str = bVar.f67014a;
            str.hashCode();
            if (str.equals("music_collect_status")) {
                com.ss.android.ugc.aweme.kids.choosemusic.b.a aVar = (com.ss.android.ugc.aweme.kids.choosemusic.b.a) bVar.a();
                if (aVar.f105496a == 0 && aVar.f105499d == 1) {
                    MusicModel musicModel = aVar.f105500e;
                    if (!(this.f105532j == null || this.f105532j.c() == null)) {
                        List e2 = this.f105532j.c().e();
                        if (e2 == null) {
                            e2 = new ArrayList();
                        }
                        for (int i2 = 0; i2 < e2.size(); i2++) {
                            if (musicModel.getMusicId().equals(((MusicModel) e2.get(i2)).getMusicId())) {
                                return;
                            }
                        }
                        if (e2.size() == 0) {
                            e2.add(musicModel);
                            this.f105532j.a(e2, false);
                            return;
                        }
                        e2.add(0, musicModel);
                        this.f105532j.c().notifyItemInserted(0);
                        if ((this.f105532j instanceof e) && ((e) this.f105532j).f105692b != null) {
                            ((e) this.f105532j).f105692b.b(0);
                        }
                    }
                }
            } else if (str.equals("music_index") && ((Integer) this.f105531e.b("music_position", (Object) -1)).intValue() == -2) {
                k().l();
            }
        }
    }
}
