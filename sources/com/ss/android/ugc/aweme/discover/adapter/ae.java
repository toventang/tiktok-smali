package com.ss.android.ugc.aweme.discover.adapter;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.CardType;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.music.model.Music;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    final List<SearchMusic> f80318a = new ArrayList();

    static {
        Covode.recordClassIndex(49999);
    }

    public static boolean a(SearchMusic searchMusic) {
        l.d(searchMusic, "");
        return searchMusic instanceof f;
    }

    /* access modifiers changed from: package-private */
    public final void b(List<? extends SearchMusic> list) {
        if (list != null) {
            this.f80318a.clear();
            this.f80318a.addAll(list);
        }
    }

    public final List<SearchMusic> a(List<? extends SearchMusic> list) {
        if (b.a((Collection) list)) {
            return new ArrayList();
        }
        b(list);
        if (list == null) {
            l.b();
        }
        List g2 = n.g((Collection) list);
        ListIterator listIterator = g2.listIterator();
        while (listIterator.hasNext()) {
            SearchMusic searchMusic = (SearchMusic) listIterator.next();
            if (searchMusic.getCardType() == CardType.TYPE_CLUSTER.getValue() && !b.a((Collection) searchMusic.getMusicList())) {
                listIterator.remove();
                SearchMusic searchMusic2 = new SearchMusic();
                searchMusic2.setCardType(CardType.TYPE_NORMAL.getValue());
                List<Music> musicList = searchMusic.getMusicList();
                if (musicList == null) {
                    l.b();
                }
                searchMusic2.setMusic((Music) n.g((List) musicList));
                searchMusic2.setLogPb(searchMusic.getLogPb());
                listIterator.add(searchMusic2);
                f fVar = new f(false, null, 3, null);
                List<Music> clusterList = fVar.getClusterList();
                List<Music> musicList2 = searchMusic.getMusicList();
                if (musicList2 == null) {
                    l.b();
                }
                List<Music> musicList3 = searchMusic.getMusicList();
                if (musicList3 == null) {
                    l.b();
                }
                clusterList.addAll(musicList2.subList(1, musicList3.size()));
                listIterator.add(fVar);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : g2) {
            SearchMusic searchMusic3 = (SearchMusic) obj;
            if (!(searchMusic3 instanceof f) || ((f) searchMusic3).getClusterList().size() > 0) {
                arrayList.add(obj);
            }
        }
        return n.g((Collection) arrayList);
    }
}
