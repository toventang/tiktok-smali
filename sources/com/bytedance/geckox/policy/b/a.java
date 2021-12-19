package com.bytedance.geckox.policy.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.e;
import com.bytedance.geckox.f;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, UpdatePackage> f29951a;

    /* renamed from: b  reason: collision with root package name */
    public static Map<String, UpdatePackage> f29952b;

    /* renamed from: c  reason: collision with root package name */
    public e f29953c;

    static {
        Covode.recordClassIndex(17386);
    }

    public static void a(String str, UpdatePackage updatePackage) {
        if (f29951a == null) {
            f29951a = new ConcurrentHashMap();
        }
        f29951a.put(str, updatePackage);
    }

    public final void a(final String str, final Map<String, List<CheckRequestBodyModel.TargetChannel>> map, final OptionCheckUpdateParams optionCheckUpdateParams) {
        GlobalConfigSettings e2 = f.a().e();
        if (e2 != null && e2.getReqMeta() != null && e2.getReqMeta().getLazy() != null) {
            this.f29953c.f29784c.execute(new Runnable() {
                /* class com.bytedance.geckox.policy.b.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(17387);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
                    com.bytedance.geckox.i.a.a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:63:0x01bd, code lost:
                    r1 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:64:0x01be, code lost:
                    if (r5 != null) goto L_0x01c0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c0, code lost:
                    r5.a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c3, code lost:
                    com.bytedance.geckox.i.a.a("lazy update finished");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ca, code lost:
                    throw r1;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:68:0x01cb, code lost:
                    if (r5 != null) goto L_0x01cd;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:69:0x01cd, code lost:
                    r5.a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d0, code lost:
                    com.bytedance.geckox.i.a.a("lazy update finished");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d7, code lost:
                    return;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x01b9 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                    // Method dump skipped, instructions count: 472
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.policy.b.a.AnonymousClass1.run():void");
                }
            });
        }
    }
}
