package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.video.hashtag.b;
import java.util.HashSet;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f127631a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(83676);
    }

    public static void a(List<b> list, List<? extends AVChallenge> list2) {
        if (list2 != null) {
            for (AVChallenge aVChallenge : list2) {
                b bVar = new b();
                bVar.f143398b = 2;
                bVar.f143402f = "history";
                bVar.f143397a = aVChallenge;
                bVar.f143400d = true;
                list.add(bVar);
            }
        }
    }

    public static void a(List<b> list, List<? extends AVChallenge> list2, List<? extends e> list3) {
        HashSet hashSet = new HashSet();
        if (list2 != null) {
            for (AVChallenge aVChallenge : list2) {
                hashSet.add(aVChallenge.challengeName);
            }
        }
        for (e eVar : list3) {
            if (!hashSet.contains(eVar.f126660c.challengeName)) {
                b bVar = new b();
                bVar.f143398b = 2;
                if (eVar.f126658a == 4) {
                    bVar.f143402f = "history";
                } else if (eVar.f126658a == 0) {
                    bVar.f143402f = "recommendation";
                } else {
                    bVar.f143402f = "commercial";
                }
                bVar.f143397a = eVar.f126660c;
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
}
