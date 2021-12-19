package com.ss.android.ugc.aweme.video.hashtag.helper;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.f;
import com.ss.android.ugc.aweme.video.hashtag.b;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f143430a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(93858);
    }

    public static final List<b> a(List<? extends AVChallenge> list, f fVar) {
        List<? extends e> list2;
        boolean z;
        boolean z2;
        LinkedList linkedList = new LinkedList();
        if (fVar != null) {
            list2 = fVar.f128471a;
            z2 = fVar.f128472b;
            z = fVar.f128473c;
        } else {
            list2 = null;
            z = false;
            z2 = true;
        }
        if (list != null && z2) {
            a(linkedList, list, list2);
        }
        a(linkedList, list2);
        int i2 = 20;
        if (list2 != null && !list2.isEmpty() && !z) {
            i2 = ((e) list2.get(list2.size() - 1)).f126659b + 1;
        }
        if (i2 <= linkedList.size() - 1) {
            return linkedList.subList(0, i2);
        }
        return linkedList;
    }

    private static void a(List<b> list, List<? extends e> list2) {
        if (list2 != null) {
            for (e eVar : list2) {
                b bVar = new b();
                bVar.f143398b = 2;
                if (eVar.f126658a == 0) {
                    bVar.f143402f = "recommendation";
                } else {
                    bVar.f143402f = "commercial";
                }
                bVar.f143397a = eVar.f126660c;
                if (eVar.f126658a == 2) {
                    bVar.f143399c = 2131232468;
                } else if (eVar.f126658a == 3) {
                    bVar.f143399c = 2131232634;
                } else {
                    bVar.f143399c = -1;
                }
                bVar.f143401e = eVar.f126661d;
                if (eVar.f126659b > list.size()) {
                    list.add(bVar);
                } else if (eVar.f126659b < 0) {
                    list.add(0, bVar);
                } else {
                    list.add(eVar.f126659b, bVar);
                }
            }
        }
    }

    private static void a(List<b> list, List<? extends AVChallenge> list2, List<? extends e> list3) {
        HashSet hashSet = new HashSet();
        if (list3 != null) {
            for (e eVar : list3) {
                hashSet.add(eVar.f126660c.challengeName);
            }
        }
        for (AVChallenge aVChallenge : list2) {
            b bVar = new b();
            bVar.f143398b = 2;
            bVar.f143402f = "history";
            bVar.f143397a = aVChallenge;
            bVar.f143399c = 2131232633;
            bVar.f143400d = true;
            if (!hashSet.contains(aVChallenge.getChallengeName())) {
                list.add(bVar);
            }
        }
    }
}
