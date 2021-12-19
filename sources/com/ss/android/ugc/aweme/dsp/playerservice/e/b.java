package com.ss.android.ugc.aweme.dsp.playerservice.e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.common.model.BaseDspFeedResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playerservice.b.d;
import com.ss.android.ugc.aweme.dsp.playerservice.b.h;
import com.ss.android.ugc.aweme.dsp.playerservice.e.a.a;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.cg;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class b implements d, i, j {

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList<c> f83535c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f83536d = true;

    /* renamed from: e  reason: collision with root package name */
    public int f83537e;

    static {
        Covode.recordClassIndex(52138);
    }

    public boolean a(c cVar) {
        l.d(cVar, "");
        return false;
    }

    public abstract a e();

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new g(b.class, "onVideoEvent", ag.class, ThreadMode.MAIN, 0, false));
        hashMap.put(86, new g(b.class, "onDspMusicCollectEvent", com.ss.android.ugc.aweme.dsp.common.a.a.class, ThreadMode.BACKGROUND, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.d
    public final List<c> b() {
        return this.f83535c;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.d
    public void c() {
        cg.a(this);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.d
    public void d() {
        cg.b(this);
    }

    public final List<c> a(BaseDspFeedResponse baseDspFeedResponse) {
        l.d(baseDspFeedResponse, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = baseDspFeedResponse.getDspList().iterator();
        while (it.hasNext()) {
            String str = baseDspFeedResponse.extra.logid;
            l.b(str, "");
            arrayList.add(a(it.next(), str));
        }
        return arrayList;
    }

    public final int c(c cVar) {
        l.d(cVar, "");
        int i2 = 0;
        for (c cVar2 : this.f83535c) {
            if (l.a((Object) cVar.a(), (Object) cVar2.a())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @r(a = ThreadMode.BACKGROUND)
    public final void onDspMusicCollectEvent(com.ss.android.ugc.aweme.dsp.common.a.a aVar) {
        l.d(aVar, "");
        if (!this.f83535c.isEmpty()) {
            for (T t : this.f83535c) {
                if (aVar.f83278a.contains(t.a())) {
                    t.a(aVar.f83279b);
                }
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onVideoEvent(ag agVar) {
        long j2;
        l.d(agVar, "");
        if (agVar.f93450a == 13) {
            Object obj = agVar.f93451b;
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            boolean z = false;
            if (!(str == null || str.length() == 0)) {
                Bundle bundle = agVar.f93452c;
                int i2 = -1;
                if (bundle != null) {
                    i2 = bundle.getInt("user_digged", -1);
                }
                CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f83535c;
                ArrayList arrayList = new ArrayList();
                for (T t : copyOnWriteArrayList) {
                    if (l.a((Object) t.c().getAweme().getAid(), (Object) str)) {
                        arrayList.add(t);
                    }
                }
                ArrayList<c> arrayList2 = arrayList;
                ArrayList<Aweme> arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
                for (c cVar : arrayList2) {
                    arrayList3.add(cVar.c().getAweme());
                }
                for (Aweme aweme : arrayList3) {
                    AwemeStatistics statistics = aweme.getStatistics();
                    l.b(statistics, "");
                    long diggCount = statistics.getDiggCount();
                    if (aweme.isLike() && i2 == 0) {
                        j2 = -1;
                    } else if (!aweme.isLike() && i2 == 1) {
                        j2 = 1;
                    }
                    long j3 = diggCount + j2;
                    aweme.setUserDigg(i2);
                    AwemeStatistics statistics2 = aweme.getStatistics();
                    l.b(statistics2, "");
                    statistics2.setDiggCount(j3);
                }
                if (i2 == 1) {
                    z = true;
                }
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.r(z, str));
            }
        }
    }

    public final com.ss.android.ugc.aweme.dsp.playpage.model.a a(DspStruct dspStruct, String str) {
        String str2;
        String str3;
        String str4;
        MatchedSoundInfo matchedSongInfo;
        l.d(dspStruct, "");
        l.d(str, "");
        com.ss.android.ugc.aweme.dsp.playpage.model.a aVar = new com.ss.android.ugc.aweme.dsp.playpage.model.a(dspStruct);
        h hVar = aVar.f83720b;
        String groupId = dspStruct.getAweme().getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        hVar.a(groupId);
        String authorUid = dspStruct.getAweme().getAuthorUid();
        if (authorUid == null) {
            authorUid = "";
        }
        hVar.b(authorUid);
        Music music = dspStruct.getAweme().getMusic();
        if (music == null || (str2 = music.getMid()) == null) {
            str2 = "";
        }
        hVar.c(str2);
        Dsp dsp = dspStruct.getAweme().getDsp();
        if (dsp == null || (str3 = dsp.getFullClipId()) == null) {
            str3 = "";
        }
        hVar.d(str3);
        Music music2 = dspStruct.getAweme().getMusic();
        if (music2 == null || (matchedSongInfo = music2.getMatchedSongInfo()) == null || (str4 = matchedSongInfo.getId()) == null) {
            str4 = "";
        }
        hVar.e(str4);
        hVar.f(a().f83391c);
        hVar.g(a().f83393e);
        hVar.h(a().f83392d);
        hVar.i(str);
        hVar.j("");
        return aVar;
    }
}
