package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.services.apm.api.f;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.io.File;
import java.util.List;

public final class CovodeCollectTask implements w {

    /* renamed from: b  reason: collision with root package name */
    public static final a f107764b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f107765a = Keva.getRepo("covode");

    static {
        Covode.recordClassIndex(68959);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68960);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static final class c implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CovodeCollectTask f107767a;

        static {
            Covode.recordClassIndex(68962);
        }

        @Override // com.bytedance.services.apm.api.f
        public final void a() {
            this.f107767a.f107765a.storeLong("covode_upload_time", System.currentTimeMillis());
            int i2 = this.f107767a.f107765a.getInt("upload_interval_day", 0);
            int i3 = 1;
            if (i2 != 0 && (i3 = i2 << 1) > 8) {
                i3 = 8;
            }
            this.f107767a.f107765a.storeInt("upload_interval_day", i3);
        }

        @Override // com.bytedance.services.apm.api.f
        public final void a(String str) {
            com.bytedance.services.apm.api.a.a(str);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(CovodeCollectTask covodeCollectTask) {
            this.f107767a = covodeCollectTask;
        }
    }

    public static final class b implements Covode.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CovodeCollectTask f107766a;

        static {
            Covode.recordClassIndex(68961);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(CovodeCollectTask covodeCollectTask) {
            this.f107766a = covodeCollectTask;
        }

        @Override // com.bytedance.covode.number.Covode.b
        public final boolean a(File file) {
            return this.f107766a.a(file);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        Covode.reportCollections(new b(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if ((java.lang.System.currentTimeMillis() - r3) >= ((long) (r12.f107765a.getInt("upload_interval_day", 0) * 86400000))) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (com.ss.android.ugc.aweme.experiment.es.f89968c.getValue().intValue() == com.ss.android.ugc.aweme.experiment.es.f89967b) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.io.File r13) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.CovodeCollectTask.a(java.io.File):boolean");
    }
}
