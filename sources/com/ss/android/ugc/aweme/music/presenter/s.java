package com.ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.choosemusic.model.aj;
import com.ss.android.ugc.aweme.choosemusic.model.ap;
import com.ss.android.ugc.aweme.choosemusic.model.aq;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.h.c;
import com.ss.android.ugc.aweme.discover.helper.j;
import com.ss.android.ugc.aweme.discover.helper.m;
import com.ss.android.ugc.aweme.discover.model.DynamicMusicModel;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.MusicTitleModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.AwemeSearchMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.h;
import com.ss.android.ugc.aweme.setting.bl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.fu;
import com.ss.android.ugc.musicprovider.interfaces.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

public final class s implements d {

    /* renamed from: a  reason: collision with root package name */
    public f f111614a;

    /* renamed from: b  reason: collision with root package name */
    public e f111615b;

    /* renamed from: c  reason: collision with root package name */
    public a f111616c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.musicprovider.d f111617d;

    /* renamed from: e  reason: collision with root package name */
    public String f111618e;

    /* renamed from: f  reason: collision with root package name */
    public String f111619f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f111620g;

    /* renamed from: h  reason: collision with root package name */
    private List<MusicModel> f111621h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f111622i = true;

    /* renamed from: j  reason: collision with root package name */
    private String f111623j = "";

    /* renamed from: k  reason: collision with root package name */
    private c f111624k = h.f121133a.f().a();

    /* renamed from: l  reason: collision with root package name */
    private j f111625l;

    static {
        Covode.recordClassIndex(71723);
    }

    @Override // com.ss.android.ugc.musicprovider.interfaces.d
    public final void b() {
        this.f111620g = false;
        f fVar = this.f111614a;
        if (fVar != null) {
            fVar.a(null, false, true);
        }
    }

    public final com.ss.android.ugc.musicprovider.d a() {
        if (this.f111617d == null) {
            com.ss.android.ugc.musicprovider.d dVar = new com.ss.android.ugc.musicprovider.d();
            this.f111617d = dVar;
            dVar.a(this);
        }
        return this.f111617d;
    }

    public s(f fVar) {
        this.f111614a = fVar;
        this.f111616c = new a();
        this.f111621h = new ArrayList();
        if (!bl.a()) {
            a();
        }
        this.f111620g = false;
    }

    private static List<MusicModel> a(List<MusicModel> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (MusicModel musicModel : list) {
            if (musicModel instanceof aq) {
                arrayList.add(musicModel);
            } else if (musicModel instanceof ap) {
                arrayList.add(musicModel);
            } else if (musicModel instanceof DynamicMusicModel) {
                arrayList.add(musicModel);
            } else if (musicModel instanceof MusicTitleModel) {
                arrayList.add(musicModel);
            } else if (!(musicModel == null || musicModel.getMusic() == null || !hashSet.add(musicModel.getMusic().getMid()))) {
                arrayList.add(musicModel);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.musicprovider.interfaces.d
    public final synchronized void a(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        long j2;
        boolean z2;
        boolean z3;
        String str6;
        boolean z4;
        MethodCollector.i(5736);
        boolean z5 = false;
        this.f111620g = false;
        AwemeSearchMusicList a2 = a.a(str);
        if (a2 != null) {
            if (!(a2.globalDoodleConfig == null || this.f111614a == null || TextUtils.equals(a2.globalDoodleConfig.getRequestKeyword(), this.f111618e))) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("enter_from", "choose_music");
                    jSONObject.put("search_type", "music");
                    jSONObject.put("search_from", this.f111623j);
                    if (!z) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    jSONObject.put("is_refresh", z4);
                    jSONObject.put("is_server_keyword_null", TextUtils.isEmpty(a2.globalDoodleConfig.getRequestKeyword()));
                    r.a("search_keyword_conflict", jSONObject);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            f fVar = this.f111614a;
            if (fVar != null) {
                fu fuVar = new fu();
                fuVar.put(LogPbBean.class, a2.logPb);
                fVar.a(fuVar);
            }
        }
        ArrayList<MusicModel> a3 = this.f111616c.a(a2);
        if (!b.a((Collection) a3)) {
            if (!z) {
                if (a2.logPb != null) {
                    str6 = a2.logPb.getImprId();
                } else {
                    str6 = "";
                }
                this.f111619f = str6;
            }
            c cVar = this.f111624k;
            if (!z && cVar != null) {
                cVar.b();
            }
            GlobalDoodleConfig globalDoodleConfig = a2.globalDoodleConfig;
            if (globalDoodleConfig == null || globalDoodleConfig.getSoundsListType() != 2) {
                z2 = false;
            } else {
                z2 = true;
            }
            j jVar = this.f111625l;
            if (z2) {
                if (jVar == null) {
                    jVar = h.f121133a.f().b();
                    this.f111625l = jVar;
                }
                if (!z) {
                    ap apVar = new ap();
                    apVar.setLogPb(a2.logPb);
                    a3.add(0, apVar);
                    jVar.a();
                }
            }
            int size = a3.size();
            for (int i2 = 0; i2 < size; i2++) {
                MusicModel musicModel = a3.get(i2);
                musicModel.setSearchKeyWords(this.f111618e);
                musicModel.setSearchId(this.f111619f);
                c cVar2 = this.f111624k;
                if (cVar2 != null) {
                    boolean z6 = !a2.isHasMore();
                    if (i2 == size - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar2.a(z6 & z3, t.f111626a, new u(i2));
                }
                GlobalDoodleConfig globalDoodleConfig2 = a2.globalDoodleConfig;
                Music music = musicModel.getMusic();
                j jVar2 = this.f111625l;
                if (!(music == null || globalDoodleConfig2 == null)) {
                    musicModel.setSoundsListType(globalDoodleConfig2.getSoundsListType());
                    music.setSoundsListType(globalDoodleConfig2.getSoundsListType());
                    if (jVar2 != null) {
                        jVar2.a(new w(music, musicModel));
                    }
                }
            }
            c cVar3 = this.f111624k;
            if (cVar3 != null) {
                cVar3.a(new v(size, a2, a3));
            }
        }
        if (!z) {
            this.f111621h.clear();
        }
        if (a3 != null) {
            this.f111621h.addAll(a3);
        }
        if (!(this.f111615b == null || a2 == null || a2.correctInfo == null)) {
            a2.correctInfo.setLogPb(a2.logPb);
        }
        if (this.f111614a != null) {
            GlobalDoodleConfig globalDoodleConfig3 = a2.globalDoodleConfig;
            f fVar2 = this.f111614a;
            List<MusicModel> a4 = a(this.f111621h);
            if (globalDoodleConfig3 == null || globalDoodleConfig3.getDisplayFilterBar() == 1) {
                z5 = true;
            }
            fVar2.a(a4, z, z5);
        }
        if (!z && a2 != null) {
            if (a2.globalDoodleConfig != null) {
                str2 = a2.globalDoodleConfig.getRequestKeyword();
            } else {
                str2 = "";
            }
            if (a2.logPb != null) {
                str3 = a2.logPb.getImprId();
            } else {
                str3 = "";
            }
            if (a2.globalDoodleConfig != null) {
                str4 = a2.globalDoodleConfig.getSearchChannel();
            } else {
                str4 = "";
            }
            if (a2.globalDoodleConfig != null) {
                str5 = a2.globalDoodleConfig.getNewSource();
            } else {
                str5 = "";
            }
            if (a2.extra != null) {
                j2 = a2.extra.now;
            } else {
                j2 = 0;
            }
            SearchServiceImpl.t().n().a(new m(str2, str3, str4, str5, Long.valueOf(j2)));
        }
        MethodCollector.o(5736);
    }

    public final void a(aj ajVar, String str, String str2, boolean z, int i2, int i3, int i4, String str3) {
        this.f111620g = true;
        this.f111622i = z;
        this.f111623j = str3;
        if (!AccountService.a().e().isChildrenMode()) {
            a().a(this.f111616c.a(str, false, str2, z, i2, i3, i4, ajVar.b(), ajVar.c(), ""), false);
            this.f111618e = str;
        }
    }
}
