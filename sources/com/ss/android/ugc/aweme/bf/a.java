package com.ss.android.ugc.aweme.bf;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.IKevaPreLoader;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.keva.ext.preload.KevaPreLoader;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.experiment.eb;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.UUID;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static String f68642a = UUID.randomUUID().toString();

    static {
        Covode.recordClassIndex(42247);
    }

    private static File b(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public static void a(Context context) {
        d.a(context, c.a(context));
        KevaBuilder instance = KevaBuilder.getInstance();
        instance.setContext(context);
        instance.setMonitor(new b());
        instance.setPortedRepoName("aweme_ported_sp_repo");
        instance.setExecutor(g.a());
        if (eb.a(context)) {
            instance.setPreLoader(KevaPreLoader.makePreLoader(new File(b(context), "keva"), new KevaPreLoader.PreloadConfig(30000, 100, 604800000), g.a()));
            IKevaPreLoader preLoader = KevaPreLoader.getPreLoader();
            if (preLoader != null) {
                preLoader.preload();
            }
        }
    }
}
