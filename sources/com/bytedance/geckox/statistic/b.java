package com.bytedance.geckox.statistic;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.e;
import com.bytedance.geckox.e.c;
import com.bytedance.geckox.e.o;
import com.bytedance.geckox.e.p;
import com.bytedance.geckox.f;
import com.bytedance.geckox.g;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.statistic.model.d;
import com.bytedance.q.b.a;
import com.bytedance.q.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30052a;

    /* renamed from: b  reason: collision with root package name */
    static e f30053b;

    static {
        Covode.recordClassIndex(17454);
    }

    public static a a(final com.bytedance.geckox.f.a aVar) {
        return new a() {
            /* class com.bytedance.geckox.statistic.b.AnonymousClass13 */

            static {
                Covode.recordClassIndex(17459);
            }

            @Override // com.bytedance.q.b.a
            public final <T> void a(com.bytedance.q.b<T> bVar, d dVar, Throwable th) {
                super.a(bVar, dVar, th);
                b(bVar, dVar, th);
            }

            @Override // com.bytedance.q.b.a
            public final <T> void b(com.bytedance.q.b<T> bVar, d dVar, Throwable th) {
                super.b(bVar, dVar, th);
                UpdatePackage updatePackage = (UpdatePackage) bVar.b(c.class);
                com.bytedance.geckox.i.a.a("onUpdateFailed", updatePackage.toString(), th.getMessage());
                if (!updatePackage.getIsZstd() || updatePackage.getUpdateWithPatch() || !updatePackage.hasFallback()) {
                    String channel = updatePackage.getChannel();
                    com.bytedance.geckox.f.a aVar = aVar;
                    if (aVar != null) {
                        aVar.a(channel, th);
                        aVar.c(updatePackage, th);
                    }
                    List<com.bytedance.geckox.f.a> b2 = com.bytedance.geckox.f.c.a().b(updatePackage.getAccessKey(), channel);
                    if (!(b2 == null || b2.isEmpty())) {
                        for (com.bytedance.geckox.f.a aVar2 : b2) {
                            aVar2.a(channel, th);
                            aVar2.c(updatePackage, th);
                        }
                        return;
                    }
                    return;
                }
                com.bytedance.geckox.f.a aVar3 = aVar;
                com.bytedance.geckox.i.a.a("update failed with zstd, now use zip!", updatePackage.toString());
                OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                optionCheckUpdateParams.setChannelUpdatePriority(2);
                optionCheckUpdateParams.setListener(aVar3);
                GeckoGlobalConfig d2 = f.a().d();
                if (d2 != null && b.f30053b == null) {
                    e.a a2 = new e.a(d2.getContext()).a(d2.getAppId());
                    a2.f29804j = d2.getDeviceId();
                    a2.f29795a = d2.getNetWork();
                    a2.f29800f = d2.getStatisticMonitor();
                    a2.f29805k = d2.getHost();
                    b.f30053b = a2.b("gecko").a("gecko").b();
                }
                try {
                    g.a(b.f30053b, optionCheckUpdateParams).a(Arrays.asList(updatePackage.fallbackInstance()));
                } catch (Exception e2) {
                    com.bytedance.geckox.i.a.a("update failed with zstd and zip!", e2.getMessage());
                }
            }
        };
    }

    public static a b(final com.bytedance.geckox.f.a aVar) {
        return new a() {
            /* class com.bytedance.geckox.statistic.b.AnonymousClass14 */

            static {
                Covode.recordClassIndex(17460);
            }

            @Override // com.bytedance.q.b.a
            public final <T> void c(com.bytedance.q.b<T> bVar, d dVar) {
                super.c(bVar, dVar);
                Pair pair = (Pair) bVar.a(p.class);
                UpdatePackage updatePackage = (UpdatePackage) pair.first;
                String channel = updatePackage.getChannel();
                com.bytedance.geckox.f.a aVar = aVar;
                if (aVar != null) {
                    aVar.a(channel, ((Long) pair.second).longValue());
                    aVar.a(updatePackage, ((Long) pair.second).longValue());
                }
                List<com.bytedance.geckox.f.a> b2 = com.bytedance.geckox.f.c.a().b(updatePackage.getAccessKey(), channel);
                if (!(b2 == null || b2.isEmpty())) {
                    for (com.bytedance.geckox.f.a aVar2 : b2) {
                        aVar2.a(channel, ((Long) pair.second).longValue());
                        aVar2.a(updatePackage, ((Long) pair.second).longValue());
                    }
                }
            }
        };
    }

    public static a c(final com.bytedance.geckox.f.a aVar) {
        return new a() {
            /* class com.bytedance.geckox.statistic.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(17461);
            }

            @Override // com.bytedance.q.b.a
            public final <T> void b(com.bytedance.q.b<T> bVar, d dVar) {
                super.b(bVar, dVar);
                UpdatePackage updatePackage = (UpdatePackage) bVar.b(com.bytedance.geckox.e.d.class);
                com.bytedance.geckox.f.a aVar = aVar;
                if (aVar != null) {
                    aVar.b(updatePackage);
                }
                com.bytedance.geckox.f.c.a();
                List<com.bytedance.geckox.f.a> a2 = com.bytedance.geckox.f.c.a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a2 == null || a2.isEmpty())) {
                    for (com.bytedance.geckox.f.a aVar2 : a2) {
                        aVar2.b(updatePackage);
                    }
                }
            }

            @Override // com.bytedance.q.b.a
            public final <T> void a(com.bytedance.q.b<T> bVar, d dVar, Throwable th) {
                super.a(bVar, dVar, th);
                UpdatePackage updatePackage = (UpdatePackage) bVar.b(com.bytedance.geckox.e.d.class);
                com.bytedance.geckox.f.a aVar = aVar;
                if (aVar != null) {
                    aVar.a(updatePackage, th);
                }
                com.bytedance.geckox.f.c.a();
                List<com.bytedance.geckox.f.a> a2 = com.bytedance.geckox.f.c.a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a2 == null || a2.isEmpty())) {
                    for (com.bytedance.geckox.f.a aVar2 : a2) {
                        aVar2.a(updatePackage, th);
                    }
                }
            }
        };
    }

    public static a d(final com.bytedance.geckox.f.a aVar) {
        return new a() {
            /* class com.bytedance.geckox.statistic.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(17462);
            }

            @Override // com.bytedance.q.b.a
            public final <T> void a(com.bytedance.q.b<T> bVar, d dVar, Throwable th) {
                super.a(bVar, dVar, th);
                UpdatePackage updatePackage = (UpdatePackage) bVar.b(com.bytedance.geckox.e.d.class);
                com.bytedance.geckox.f.a aVar = aVar;
                if (aVar != null) {
                    aVar.a(updatePackage, th);
                }
                com.bytedance.geckox.f.c.a();
                List<com.bytedance.geckox.f.a> a2 = com.bytedance.geckox.f.c.a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a2 == null || a2.isEmpty())) {
                    for (com.bytedance.geckox.f.a aVar2 : a2) {
                        aVar2.a(updatePackage, th);
                    }
                }
            }
        };
    }

    public static a e(final com.bytedance.geckox.f.a aVar) {
        return new a() {
            /* class com.bytedance.geckox.statistic.b.AnonymousClass4 */

            static {
                Covode.recordClassIndex(17463);
            }

            @Override // com.bytedance.q.b.a
            public final <T> void a(com.bytedance.q.b<T> bVar, d dVar) {
                super.a(bVar, dVar);
                UpdatePackage updatePackage = (UpdatePackage) bVar.a(com.bytedance.geckox.e.d.class);
                com.bytedance.geckox.i.a.a("getRetryDownloadListener onStart", updatePackage.toString());
                com.bytedance.geckox.f.a aVar = aVar;
                if (aVar != null) {
                    aVar.a(updatePackage);
                }
                com.bytedance.geckox.f.c.a();
                List<com.bytedance.geckox.f.a> a2 = com.bytedance.geckox.f.c.a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a2 == null || a2.isEmpty())) {
                    for (com.bytedance.geckox.f.a aVar2 : a2) {
                        aVar2.a(updatePackage);
                    }
                }
            }

            @Override // com.bytedance.q.b.a
            public final <T> void a(com.bytedance.q.b<T> bVar, d dVar, Throwable th) {
                if ((th instanceof com.bytedance.geckox.c.d) || (th instanceof com.bytedance.geckox.c.e)) {
                    super.a(bVar, dVar, th);
                    UpdatePackage updatePackage = (UpdatePackage) bVar.a(com.bytedance.geckox.e.d.class);
                    com.bytedance.geckox.i.a.a("getRetryDownloadListener onException", updatePackage.toString(), th.getMessage());
                    com.bytedance.geckox.f.a aVar = aVar;
                    if (aVar != null) {
                        aVar.b(updatePackage, th);
                    }
                    if (!(updatePackage.getContent() == null || updatePackage.getContent().getStrategy() == null || updatePackage.getContent().getStrategy().getDeleteIfFail() != 1)) {
                        com.bytedance.geckox.i.a.a("del_if_download_failed");
                        String accessKey = updatePackage.getAccessKey();
                        String channel = updatePackage.getChannel();
                        String str = f.a().f29842a.get(accessKey);
                        if (str != null) {
                            com.bytedance.geckox.b.b.a(new File(new File(str, accessKey), channel));
                        }
                    }
                    com.bytedance.geckox.f.c.a();
                    List<com.bytedance.geckox.f.a> a2 = com.bytedance.geckox.f.c.a(updatePackage.getAccessKey(), updatePackage.getChannel());
                    if (!(a2 == null || a2.isEmpty())) {
                        for (com.bytedance.geckox.f.a aVar2 : a2) {
                            aVar2.b(updatePackage, th);
                        }
                    }
                }
            }
        };
    }

    public static a f(final com.bytedance.geckox.f.a aVar) {
        return new a() {
            /* class com.bytedance.geckox.statistic.b.AnonymousClass5 */

            static {
                Covode.recordClassIndex(17464);
            }

            @Override // com.bytedance.q.b.a
            public final <T> void b(com.bytedance.q.b<T> bVar, d dVar) {
                super.b(bVar, dVar);
                UpdatePackage updatePackage = (UpdatePackage) bVar.a(com.bytedance.geckox.e.d.class);
                com.bytedance.geckox.i.a.a("downloadListener onEnd", updatePackage.toString());
                com.bytedance.geckox.f.a aVar = aVar;
                if (aVar != null) {
                    aVar.c(updatePackage);
                }
                com.bytedance.geckox.f.c.a();
                List<com.bytedance.geckox.f.a> a2 = com.bytedance.geckox.f.c.a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a2 == null || a2.isEmpty())) {
                    for (com.bytedance.geckox.f.a aVar2 : a2) {
                        aVar2.c(updatePackage);
                    }
                }
            }
        };
    }

    public static a a(final Class<? extends d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>>> cls, final com.bytedance.geckox.f.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new a() {
            /* class com.bytedance.geckox.statistic.b.AnonymousClass6 */

            static {
                Covode.recordClassIndex(17465);
            }

            @Override // com.bytedance.q.b.a
            public final <T> void b(com.bytedance.q.b<T> bVar, d dVar) {
                super.b(bVar, dVar);
                Map<String, List<Pair<String, Long>>> map = (Map) bVar.a(cls);
                HashMap hashMap = new HashMap();
                for (UpdatePackage updatePackage : (List) bVar.b(cls)) {
                    String accessKey = updatePackage.getAccessKey();
                    List list = (List) hashMap.get(accessKey);
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(updatePackage);
                    hashMap.put(accessKey, list);
                }
                aVar.a(map, hashMap);
            }

            @Override // com.bytedance.q.b.a
            public final <T> void a(com.bytedance.q.b<T> bVar, d dVar, Throwable th) {
                super.a(bVar, dVar, th);
                Map<String, List<Pair<String, Long>>> map = (Map) bVar.a(cls);
                if (th instanceof com.bytedance.q.a.e) {
                    aVar.a(((com.bytedance.q.a.e) th).getCode(), map, th);
                } else {
                    aVar.a(map, th);
                }
            }
        };
    }

    public static <T> com.bytedance.geckox.statistic.model.d a(com.bytedance.q.b<T> bVar, boolean z) {
        UpdatePackage updatePackage = (UpdatePackage) bVar.a(o.class);
        com.bytedance.geckox.statistic.model.d statisticModel = updatePackage.getStatisticModel();
        if (statisticModel == null) {
            statisticModel = new com.bytedance.geckox.statistic.model.d();
            statisticModel.f30099b = ((Integer) bVar.a("req_type")).intValue();
            statisticModel.f30100c = ((Integer) bVar.a("sync_task_id")).intValue();
            statisticModel.f30098a = ((Integer) bVar.a("update_priority")).intValue();
            statisticModel.o = SystemClock.uptimeMillis();
            updatePackage.setStatisticModel(statisticModel);
            if (!z) {
                statisticModel.f30102e = true;
                com.bytedance.geckox.i.a.b();
            }
        }
        return statisticModel;
    }

    public static <T> void a(com.bytedance.q.b<T> bVar, int i2, Throwable th) {
        UpdatePackage updatePackage = (UpdatePackage) bVar.a(o.class);
        com.bytedance.geckox.statistic.model.d a2 = a((com.bytedance.q.b) bVar, false);
        a2.f30105h = 0;
        a2.f30107j = 0;
        a2.f30108k = 0;
        a2.f30109l = 0;
        a2.f30110m = 0;
        a2.n = 0;
        d.a a3 = a2.a(updatePackage, false);
        a3.f30112b = false;
        a3.f30113c = i2;
        a3.f30114d = th.getMessage();
        if (updatePackage.isLastStep()) {
            a2.f30101d = false;
            a2.f30103f = SystemClock.uptimeMillis() - a2.o;
            c.a(updatePackage);
        }
    }
}
