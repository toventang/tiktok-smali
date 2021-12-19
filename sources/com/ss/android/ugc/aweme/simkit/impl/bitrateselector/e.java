package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.d;
import h.f.b.l;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final e f133537a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static int f133538b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Float> f133539c = new ConcurrentHashMap<>(50);

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentLinkedQueue<String> f133540d = new ConcurrentLinkedQueue<>();

    private e() {
    }

    static {
        Covode.recordClassIndex(87360);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [com.ss.android.ugc.f.a.a.a.a.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0232, code lost:
        if (r0 == null) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0234, code lost:
        r0 = r0.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0238, code lost:
        r17 = (int) r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0216  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.player.sdk.b.e r28) {
        /*
        // Method dump skipped, instructions count: 1016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.e.a(com.ss.android.ugc.aweme.player.sdk.b.e):void");
    }

    static final class a<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133541a = new a();

        static {
            Covode.recordClassIndex(87361);
        }

        a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            com.ss.android.ugc.playerkit.simapicommon.a.e eVar = (com.ss.android.ugc.playerkit.simapicommon.a.e) obj;
            com.ss.android.ugc.playerkit.simapicommon.a.e eVar2 = (com.ss.android.ugc.playerkit.simapicommon.a.e) obj2;
            l.c(eVar, "");
            l.c(eVar2, "");
            return eVar2.getBitRate() - eVar.getBitRate();
        }
    }
}
