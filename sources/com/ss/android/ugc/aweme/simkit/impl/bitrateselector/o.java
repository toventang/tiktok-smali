package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.b.c;
import com.ss.android.ugc.aweme.simkit.api.b;
import com.ss.android.ugc.aweme.simkit.d;
import com.ss.android.ugc.f.a.a.a.a.f;
import com.ss.android.ugc.f.a.a.a.b.f;
import com.ss.android.ugc.f.a.a.a.b.g;
import com.ss.android.ugc.playerkit.simapicommon.a.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* access modifiers changed from: package-private */
public final class o implements b {

    /* renamed from: a  reason: collision with root package name */
    private static int f133563a = -1;

    /* renamed from: b  reason: collision with root package name */
    private static ConcurrentHashMap<String, Float> f133564b = new ConcurrentHashMap<>(50);

    /* renamed from: c  reason: collision with root package name */
    private static ConcurrentLinkedQueue<String> f133565c = new ConcurrentLinkedQueue<>();

    /* renamed from: d  reason: collision with root package name */
    private BitrateFilter f133566d = new BitrateFilter();

    o() {
    }

    static {
        Covode.recordClassIndex(87371);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.b
    public final com.ss.android.ugc.aweme.player.sdk.b.b a(String str, c cVar) {
        f a2;
        if (cVar == null) {
            return null;
        }
        int a3 = (int) d.a().f().a();
        if (d.a().b().getCommonConfig().isUseLastNetworkSpeed()) {
            if (((double) a3) <= 0.0d) {
                a3 = f133563a;
                if (a3 <= 0) {
                    a3 = d.a().b().getCommonConfig().getLastNetworkSpeed();
                }
                d.a().f().a((double) a3);
            } else {
                f133563a = a3;
            }
        }
        List<Pair<com.ss.android.ugc.aweme.player.sdk.b.b, Integer>> a4 = cVar.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<com.ss.android.ugc.aweme.player.sdk.b.b, Integer> pair : a4) {
            e eVar = new e();
            eVar.setBitRate(((Integer) pair.second).intValue());
            arrayList.add(eVar);
            arrayList2.add(pair.first);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        if (arrayList.size() == 1) {
            a2 = new f();
            a2.f145547a = (com.ss.android.ugc.f.a.a.a.a.c) arrayList.get(0);
        } else {
            g d2 = d.a().d();
            if (d2 == null || (a2 = d2.a(arrayList, new f.b().a(a3).f145566a)) == null) {
                return null;
            }
        }
        int indexOf = arrayList.indexOf(a2.f145547a);
        if (indexOf < 0 || indexOf >= arrayList2.size()) {
            return null;
        }
        com.ss.android.ugc.aweme.player.sdk.b.b a5 = cVar.a((com.ss.android.ugc.aweme.player.sdk.b.b) arrayList2.get(indexOf));
        new StringBuilder("getProperResolution result:").append(a5).append(", orig resolution:").append(arrayList2.get(indexOf)).append(", bitrate:").append(a2.f145547a).append(", with speed:").append(a3).append(", sourceId:").append(str);
        return a5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.ss.android.ugc.playerkit.simapicommon.a.i, com.ss.android.ugc.playerkit.simapicommon.a.g] */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.ss.android.ugc.f.a.a.a.a.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03ce, code lost:
        if (r2 != null) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02d4, code lost:
        if (r0 == null) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02d6, code lost:
        r10 = r0.intValue();
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0236  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.ugc.aweme.simkit.api.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.f.a.a.a.a.c a(com.ss.android.ugc.playerkit.simapicommon.a.i r28, boolean r29) {
        /*
        // Method dump skipped, instructions count: 1033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.o.a(com.ss.android.ugc.playerkit.simapicommon.a.i, boolean):com.ss.android.ugc.f.a.a.a.a.c");
    }
}
