package com.google.android.play.core.assetpacks;

import com.a;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class bp {

    /* renamed from: a  reason: collision with root package name */
    private static final b f52905a = new b("ExtractorTaskFinder");

    /* renamed from: b  reason: collision with root package name */
    private final bm f52906b;

    /* renamed from: c  reason: collision with root package name */
    private final ac f52907c;

    /* renamed from: d  reason: collision with root package name */
    private final aj f52908d;

    static {
        Covode.recordClassIndex(32708);
    }

    bp(bm bmVar, ac acVar, aj ajVar) {
        this.f52906b = bmVar;
        this.f52907c = acVar;
        this.f52908d = ajVar;
    }

    private final boolean a(bj bjVar, bk bkVar) {
        ac acVar = this.f52907c;
        bi biVar = bjVar.f52885c;
        return new cm(acVar, biVar.f52878a, bjVar.f52884b, biVar.f52879b, bkVar.f52886a).d();
    }

    private static boolean a(bk bkVar) {
        int i2 = bkVar.f52891f;
        return i2 == 1 || i2 == 2;
    }

    /* access modifiers changed from: package-private */
    public final bo a() {
        int i2;
        try {
            this.f52906b.f52897f.lock();
            ArrayList<bj> arrayList = new ArrayList();
            for (bj bjVar : this.f52906b.f52896e.values()) {
                if (bw.c(bjVar.f52885c.f52880c)) {
                    arrayList.add(bjVar);
                }
            }
            if (!arrayList.isEmpty()) {
                for (bj bjVar2 : arrayList) {
                    try {
                        ac acVar = this.f52907c;
                        bi biVar = bjVar2.f52885c;
                        if (acVar.e(biVar.f52878a, bjVar2.f52884b, biVar.f52879b) == bjVar2.f52885c.f52882e.size()) {
                            f52905a.a("Found final move task for session %s with pack %s.", Integer.valueOf(bjVar2.f52883a), bjVar2.f52885c.f52878a);
                            int i3 = bjVar2.f52883a;
                            bi biVar2 = bjVar2.f52885c;
                            return new cc(i3, biVar2.f52878a, bjVar2.f52884b, biVar2.f52879b);
                        }
                    } catch (IOException e2) {
                        throw new au(a.a("Failed to check number of completed merges for session %s, pack %s", new Object[]{Integer.valueOf(bjVar2.f52883a), bjVar2.f52885c.f52878a}), e2, bjVar2.f52883a);
                    }
                }
                for (bj bjVar3 : arrayList) {
                    if (bw.c(bjVar3.f52885c.f52880c)) {
                        for (bk bkVar : bjVar3.f52885c.f52882e) {
                            ac acVar2 = this.f52907c;
                            bi biVar3 = bjVar3.f52885c;
                            if (acVar2.b(biVar3.f52878a, bjVar3.f52884b, biVar3.f52879b, bkVar.f52886a).exists()) {
                                f52905a.a("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(bjVar3.f52883a), bjVar3.f52885c.f52878a, bkVar.f52886a);
                                int i4 = bjVar3.f52883a;
                                bi biVar4 = bjVar3.f52885c;
                                bz bzVar = new bz(i4, biVar4.f52878a, bjVar3.f52884b, biVar4.f52879b, bkVar.f52886a);
                                this.f52906b.f52897f.unlock();
                                return bzVar;
                            }
                        }
                        continue;
                    }
                }
                for (bj bjVar4 : arrayList) {
                    if (bw.c(bjVar4.f52885c.f52880c)) {
                        for (bk bkVar2 : bjVar4.f52885c.f52882e) {
                            if (a(bjVar4, bkVar2)) {
                                ac acVar3 = this.f52907c;
                                bi biVar5 = bjVar4.f52885c;
                                if (acVar3.a(biVar5.f52878a, bjVar4.f52884b, biVar5.f52879b, bkVar2.f52886a).exists()) {
                                    f52905a.a("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(bjVar4.f52883a), bjVar4.f52885c.f52878a, bkVar2.f52886a);
                                    int i5 = bjVar4.f52883a;
                                    bi biVar6 = bjVar4.f52885c;
                                    cp cpVar = new cp(i5, biVar6.f52878a, bjVar4.f52884b, biVar6.f52879b, bkVar2.f52886a, bkVar2.f52887b);
                                    this.f52906b.f52897f.unlock();
                                    return cpVar;
                                }
                            }
                        }
                        continue;
                    }
                }
                for (bj bjVar5 : arrayList) {
                    if (bw.c(bjVar5.f52885c.f52880c)) {
                        for (bk bkVar3 : bjVar5.f52885c.f52882e) {
                            if (!a(bkVar3)) {
                                ac acVar4 = this.f52907c;
                                bi biVar7 = bjVar5.f52885c;
                                try {
                                    i2 = new cm(acVar4, biVar7.f52878a, bjVar5.f52884b, biVar7.f52879b, bkVar3.f52886a).c();
                                    if (i2 == -1) {
                                        continue;
                                    } else if (bkVar3.f52889d.get(i2).f52877a) {
                                        f52905a.a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", Integer.valueOf(bkVar3.f52890e), Integer.valueOf(bjVar5.f52883a), bjVar5.f52885c.f52878a, bkVar3.f52886a, Integer.valueOf(i2));
                                        InputStream a2 = this.f52908d.a(bjVar5.f52883a, bjVar5.f52885c.f52878a, bkVar3.f52886a, i2);
                                        int i6 = bjVar5.f52883a;
                                        bi biVar8 = bjVar5.f52885c;
                                        String str = biVar8.f52878a;
                                        int i7 = bjVar5.f52884b;
                                        long j2 = biVar8.f52879b;
                                        String str2 = bkVar3.f52886a;
                                        int i8 = bkVar3.f52890e;
                                        int size = bkVar3.f52889d.size();
                                        bi biVar9 = bjVar5.f52885c;
                                        ar arVar = new ar(i6, str, i7, j2, str2, i8, i2, size, biVar9.f52881d, biVar9.f52880c, a2);
                                        this.f52906b.f52897f.unlock();
                                        return arVar;
                                    }
                                } catch (IOException e3) {
                                    f52905a.b("Slice checkpoint corrupt, restarting extraction. %s", e3);
                                    i2 = 0;
                                }
                            }
                        }
                        continue;
                    }
                }
                for (bj bjVar6 : arrayList) {
                    if (bw.c(bjVar6.f52885c.f52880c)) {
                        for (bk bkVar4 : bjVar6.f52885c.f52882e) {
                            if (a(bkVar4) && bkVar4.f52889d.get(0).f52877a && !a(bjVar6, bkVar4)) {
                                f52905a.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", Integer.valueOf(bkVar4.f52891f), Integer.valueOf(bjVar6.f52883a), bjVar6.f52885c.f52878a, bkVar4.f52886a);
                                InputStream a3 = this.f52908d.a(bjVar6.f52883a, bjVar6.f52885c.f52878a, bkVar4.f52886a, 0);
                                int i9 = bjVar6.f52883a;
                                String str3 = bjVar6.f52885c.f52878a;
                                ci ciVar = new ci(i9, str3, this.f52907c.b(str3), this.f52907c.c(bjVar6.f52885c.f52878a), bjVar6.f52884b, bjVar6.f52885c.f52879b, bkVar4.f52891f, bkVar4.f52886a, bkVar4.f52888c, a3);
                                this.f52906b.f52897f.unlock();
                                return ciVar;
                            }
                        }
                        continue;
                    }
                }
                this.f52906b.f52897f.unlock();
                return null;
            }
            this.f52906b.f52897f.unlock();
            return null;
        } finally {
            this.f52906b.f52897f.unlock();
        }
    }
}
