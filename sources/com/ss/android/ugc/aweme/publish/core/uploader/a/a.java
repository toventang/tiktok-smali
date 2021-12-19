package com.ss.android.ugc.aweme.publish.core.uploader.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.tools.utils.q;
import com.ss.bduploader.BDUploadUtil;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f118640a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static AtomicBoolean f118641b = new AtomicBoolean(false);

    private a() {
    }

    static {
        Covode.recordClassIndex(77049);
    }

    public static void a() {
        if (f118641b.compareAndSet(false, true)) {
            BDUploadUtil.setSDKConfigDir(b());
        }
    }

    private static String b() {
        String c2 = g.a().g().c().c("upload-config-dir");
        File g2 = g.a().g().c().g(c2);
        if (!g2.exists() && !g2.mkdirs()) {
            q.a("upload-config-dir", new Throwable("create upload config dir failed!"));
        }
        return c2;
    }

    public static int a(int i2) {
        g.a().o().h().a();
        return i2;
    }
}
