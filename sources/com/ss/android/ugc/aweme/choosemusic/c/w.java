package com.ss.android.ugc.aweme.choosemusic.c;

import android.view.View;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.d.a;
import com.ss.android.ugc.aweme.choosemusic.d.b;
import com.ss.android.ugc.aweme.choosemusic.model.f;
import com.ss.android.ugc.aweme.choosemusic.view.l;
import com.ss.android.ugc.aweme.choosemusic.view.m;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.a;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.r;

public class w extends i implements a<Music>, h.a, a.AbstractC1744a {

    /* renamed from: m  reason: collision with root package name */
    public b f70518m;
    private com.ss.android.ugc.aweme.choosemusic.b n;

    static {
        Covode.recordClassIndex(43481);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final void a(com.ss.android.ugc.aweme.choosemusic.b.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String b() {
        return "user_collected_music_list";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.choosemusic.d.a
    public final /* bridge */ /* synthetic */ void b(Music music) {
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
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final boolean g() {
        return false;
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.choosemusic.c.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(339, new g(w.class, "onEvent", com.ss.android.ugc.aweme.music.f.b.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final int o() {
        return 1;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final String p() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final int q() {
        return R.layout.a1a;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.a
    public final void t() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.a
    public final void v() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.c.i, com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final void a() {
        super.a();
        this.f70467d.b(this.f70470k);
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        if (this.f70469j == null) {
            return null;
        }
        return ((m) this.f70469j).f70841b;
    }

    /* renamed from: s */
    public final com.ss.android.ugc.aweme.choosemusic.a.b k() {
        if (this.f70469j != null) {
            return (com.ss.android.ugc.aweme.choosemusic.a.b) this.f70469j.c();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.a
    public final void u() {
        if (this.f70467d != null) {
            this.f70467d.b(this.f70470k);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.c.i, com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final DataCenter e() {
        this.f70468e = super.e();
        this.f70468e.a("music_collect_status", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("music_index", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        return this.f70468e;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    /* renamed from: l */
    public final void w() {
        if (this.f70467d != null && this.f70468e != null) {
            com.ss.android.ugc.aweme.arch.b bVar = (com.ss.android.ugc.aweme.arch.b) this.f70468e.a("user_collected_music_list");
            if ((this.f70469j instanceof m) && ((m) this.f70469j).f70849j) {
                if (this.f70469j != null) {
                    this.f70469j.a();
                }
                if (bVar != null) {
                    com.ss.android.ugc.aweme.choosemusic.model.b bVar2 = this.f70467d;
                    int intValue = ((Integer) bVar.a("list_cursor")).intValue();
                    int i2 = this.f70470k;
                    if (!bVar2.f70646g) {
                        bVar2.f70646g = true;
                        ChooseMusicApi.a(intValue, 20, i2).a(new f(bVar2), i.f4826c, null);
                    }
                }
            }
        }
    }

    @r
    public void onEvent(com.ss.android.ugc.aweme.music.f.b bVar) {
        if (this.f70468e != null && bVar != null) {
            this.f70468e.a("music_collect_status", new com.ss.android.ugc.aweme.choosemusic.b.a(0, bVar.f111483a, -1, -1, bVar.f111484b));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final c b(View view) {
        com.ss.android.ugc.aweme.choosemusic.view.r rVar = new com.ss.android.ugc.aweme.choosemusic.view.r(getContext(), view, this, this, this, this.f70471l);
        rVar.a(new b() {
            /* class com.ss.android.ugc.aweme.choosemusic.c.w.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43482);
            }

            @Override // com.ss.android.ugc.aweme.choosemusic.d.b
            public final void a(MusicDownloadPlayHelper.a aVar) {
                if (w.this.f70518m != null) {
                    w.this.f70518m.a(aVar);
                }
            }

            @Override // com.ss.android.ugc.aweme.choosemusic.d.b
            public final void b(MusicModel musicModel) {
                if (w.this.f70518m != null) {
                    w.this.f70518m.b(musicModel);
                }
            }

            @Override // com.ss.android.ugc.aweme.choosemusic.d.b
            public final void a(MusicModel musicModel) {
                if (w.this.f70518m != null) {
                    w.this.f70518m.a(musicModel);
                }
            }

            @Override // com.ss.android.ugc.aweme.choosemusic.d.b
            public final void a(MusicModel musicModel, com.ss.android.ugc.aweme.choosemusic.b bVar) {
                if (w.this.f70518m != null) {
                    w.this.f70518m.a(musicModel, bVar);
                }
                if (((Integer) w.this.f70468e.b("music_position", (Object) -1)).intValue() == -2) {
                    w.this.f70468e.a("music_position", (Object) -1);
                    w.this.f70468e.a("music_index", (Object) -1);
                }
            }
        });
        com.ss.android.ugc.aweme.choosemusic.b bVar = new com.ss.android.ugc.aweme.choosemusic.b("change_music_page", "favorite_song", "", com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a);
        this.n = bVar;
        rVar.a(bVar);
        rVar.a(false);
        rVar.a(new x(this));
        return rVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        RecyclerView recyclerView;
        MusicModel musicModel;
        boolean z2;
        super.setUserVisibleHint(z);
        if (z && (m() instanceof RecyclerView) && (recyclerView = (RecyclerView) m()) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int m2 = linearLayoutManager.m();
            com.ss.android.ugc.aweme.common.a.f c2 = this.f70469j.c();
            if (c2 != null) {
                List e2 = c2.e();
                if (!com.bytedance.common.utility.collection.b.a((Collection) e2)) {
                    for (int k2 = linearLayoutManager.k(); k2 < m2; k2++) {
                        if (k2 >= 0 && k2 < e2.size() && (musicModel = (MusicModel) e2.get(k2)) != null) {
                            com.ss.android.ugc.aweme.choosemusic.b bVar = this.n;
                            String musicId = musicModel.getMusicId();
                            if (musicModel.getMatchedPGCSoundInfo() != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            com.ss.android.ugc.aweme.choosemusic.utils.b.a(bVar, musicId, k2, true, z2);
                        }
                    }
                }
            }
        }
        if (this.f70469j instanceof com.ss.android.ugc.aweme.choosemusic.view.r) {
            ((l) this.f70469j).a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        super.onChanged(bVar);
        if (ab_()) {
            String str = bVar.f67014a;
            str.hashCode();
            if (str.equals("music_collect_status")) {
                com.ss.android.ugc.aweme.choosemusic.b.a aVar = (com.ss.android.ugc.aweme.choosemusic.b.a) bVar.a();
                if (aVar.f70389a == 0 && aVar.f70392d == 1) {
                    MusicModel musicModel = aVar.f70393e;
                    if (!(this.f70469j == null || this.f70469j.c() == null)) {
                        List e2 = this.f70469j.c().e();
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
                            this.f70469j.a(e2, false);
                            return;
                        }
                        e2.add(0, musicModel);
                        this.f70469j.c().notifyItemInserted(0);
                        if ((this.f70469j instanceof m) && ((m) this.f70469j).f70841b != null) {
                            ((m) this.f70469j).f70841b.b(0);
                        }
                    }
                }
            } else if (str.equals("music_index") && ((Integer) this.f70468e.b("music_position", (Object) -1)).intValue() == -2) {
                k().a();
            }
        }
    }
}
