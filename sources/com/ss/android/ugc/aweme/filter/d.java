package com.ss.android.ugc.aweme.filter;

import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.tools.utils.u;
import java.io.File;
import java.io.IOException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f95497a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f95498b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f95499c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f95500d;

    static {
        Covode.recordClassIndex(60502);
        String absolutePath = new File(i.f115645a.getFilesDir(), "filter").getAbsolutePath();
        f95499c = absolutePath;
        File file = new File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath2 = new File(absolutePath, "reshape").getAbsolutePath();
        f95497a = absolutePath2;
        File file2 = new File(absolutePath2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        String absolutePath3 = new File(absolutePath, "smooth").getAbsolutePath();
        f95498b = absolutePath3;
        File file3 = new File(absolutePath3);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        String absolutePath4 = new File(absolutePath, "contour").getAbsolutePath();
        f95500d = absolutePath4;
        File file4 = new File(absolutePath4);
        if (file4.exists()) {
            file4.mkdirs();
        }
        a();
    }

    public static boolean a() {
        MethodCollector.i(2647);
        AssetManager assets = i.f115645a.getAssets();
        boolean ulikeBeautyCopied = g.a().e().getUlikeBeautyCopied(false);
        try {
            String str = f95497a;
            if (!com.ss.android.ugc.tools.utils.i.a(str) || !ulikeBeautyCopied) {
                u.a(assets.open("reshape.zip"), str);
            }
            String str2 = f95498b;
            if (!com.ss.android.ugc.tools.utils.i.a(str2) || !ulikeBeautyCopied) {
                u.a(assets.open("smooth.zip"), str2);
            }
            g.a().e().setUlikeBeautyCopied(true);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        MethodCollector.o(2647);
        return false;
    }
}
