package com.bytedance.geckox;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.policy.b.a;
import com.bytedance.geckox.policy.v4.b;
import com.bytedance.geckox.utils.h;
import h.f.b.l;
import java.io.File;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public e f29770a;

    /* renamed from: b  reason: collision with root package name */
    private File f29771b;

    /* renamed from: c  reason: collision with root package name */
    private a f29772c;

    static {
        Covode.recordClassIndex(17278);
    }

    private c(e eVar) {
        this.f29770a = eVar;
        this.f29771b = eVar.o;
        a aVar = new a();
        this.f29772c = aVar;
        aVar.f29953c = eVar;
    }

    public final void a(String str) {
        if (this.f29770a != null && !TextUtils.isEmpty(str)) {
            this.f29770a.f29792k = str;
            if (f.a().b() != null) {
                f.a().b().deviceId = str;
            }
        }
    }

    private boolean a(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map != null && !map.isEmpty()) {
            List<String> list = this.f29770a.f29787f;
            for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                boolean z = false;
                for (String str : list) {
                    if (TextUtils.equals(str, entry.getKey())) {
                        z = true;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public static c a(e eVar) {
        if (eVar != null) {
            List<String> list = eVar.f29787f;
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("access key empty");
            }
            try {
                for (String str : eVar.f29787f) {
                    f.a().a(str, eVar.o.getAbsolutePath());
                }
            } catch (IllegalArgumentException e2) {
                com.bytedance.geckox.i.a.a("gecko client register root dir failed", e2.getMessage());
            }
            h.a(eVar.f29782a);
            c cVar = new c(eVar);
            String a2 = eVar.a();
            l.c(a2, "");
            l.c(cVar, "");
            if (d.f29777a.get(a2) == null) {
                d.f29777a.put(a2, cVar);
            }
            com.bytedance.geckox.policy.e.a a3 = com.bytedance.geckox.policy.e.a.a();
            if (a3.f29988c.compareAndSet(false, true)) {
                a3.f29987a = eVar;
                com.bytedance.geckox.policy.e.a.f29985b = System.currentTimeMillis();
            }
            b a4 = b.a();
            if (a4.f30020b == null) {
                a4.f30020b = eVar;
            }
            GeckoGlobalConfig d2 = f.a().d();
            if (d2 != null) {
                a4.f30020b.f29790i = Long.valueOf(d2.getAppId());
                a4.f30020b.f29786e = d2.getNetWork();
            }
            f a5 = f.a();
            com.bytedance.geckox.statistic.a aVar = eVar.f29785d;
            if (a5.f29850j == null) {
                a5.f29850j = aVar;
            }
            return cVar;
        }
        throw new IllegalArgumentException("config == null");
    }

    public final void a(Map<String, List<CheckRequestBodyModel.TargetChannel>> map, com.bytedance.geckox.f.a aVar) {
        a("default", map, aVar);
    }

    public final void a(String str, Map<String, List<CheckRequestBodyModel.TargetChannel>> map, com.bytedance.geckox.f.a aVar) {
        a(str, map, new OptionCheckUpdateParams().setListener(aVar));
    }

    public final void a(final String str, final Map<String, List<CheckRequestBodyModel.TargetChannel>> map, final OptionCheckUpdateParams optionCheckUpdateParams) {
        boolean g2 = f.a().g();
        com.bytedance.geckox.i.a.a("gecko update enable:", Boolean.valueOf(g2));
        if (!g2) {
            if (optionCheckUpdateParams != null && optionCheckUpdateParams.getListener() != null) {
                optionCheckUpdateParams.getListener().a((Map<String, List<Pair<String, Long>>>) null, new IllegalStateException("gecko is disabled"));
            }
        } else if (a(map)) {
            if (TextUtils.isEmpty(str)) {
                str = "default";
            }
            if (optionCheckUpdateParams == null) {
                optionCheckUpdateParams = new OptionCheckUpdateParams();
            }
            if (optionCheckUpdateParams.isLazyUpdate()) {
                this.f29772c.a(str, map, optionCheckUpdateParams);
                return;
            }
            boolean a2 = f.a().a(optionCheckUpdateParams.isEnableThrottle());
            com.bytedance.geckox.i.a.a("gecko update throttle enable:", Boolean.valueOf(a2));
            optionCheckUpdateParams.setEnableThrottle(a2);
            if (!optionCheckUpdateParams.isLazyUpdate() && this.f29770a.p && optionCheckUpdateParams.getLoopLevel() != null) {
                com.bytedance.geckox.policy.loop.b.a().a(str, this.f29770a.f29787f, map, optionCheckUpdateParams);
            }
            optionCheckUpdateParams.setInnerRequestByUser(true);
            this.f29770a.f29784c.execute(new Runnable() {
                /* class com.bytedance.geckox.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(17279);
                }

                /* JADX INFO: finally extract failed */
                /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
                    com.bytedance.geckox.i.a.a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d3, code lost:
                    r0 = r9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dd, code lost:
                    r9.getListener().a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e6, code lost:
                    if (r2 != null) goto L_0x00e8;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e8, code lost:
                    r2.a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:36:0x00eb, code lost:
                    com.bytedance.geckox.i.a.a("all channel update finished");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f2, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f3, code lost:
                    r1 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f4, code lost:
                    r0 = r9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fe, code lost:
                    r9.getListener().a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:44:0x0107, code lost:
                    if (r2 != null) goto L_0x0109;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:45:0x0109, code lost:
                    r2.a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:46:0x010c, code lost:
                    com.bytedance.geckox.i.a.a("all channel update finished");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:47:0x0113, code lost:
                    throw r1;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00d0 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 276
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.c.AnonymousClass1.run():void");
                }
            });
        } else {
            throw new IllegalArgumentException("target keys are not in deployments keys");
        }
    }
}
