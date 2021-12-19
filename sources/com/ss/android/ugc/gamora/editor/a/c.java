package com.ss.android.ugc.gamora.editor.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.ss.ugc.effectplatform.algorithm.e;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.p;
import java.io.File;
import java.net.URI;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static boolean f145679a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f145680b = new c();

    public static final class a implements IFetchResourceListener {
        static {
            Covode.recordClassIndex(95678);
        }

        a() {
        }

        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onSuccess(long j2) {
            c.f145679a = false;
        }

        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onFailure(Exception exc) {
            l.d(exc, "");
            c.f145679a = false;
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(95677);
    }

    public static boolean c() {
        if (b()) {
            return true;
        }
        d();
        return false;
    }

    public static boolean b() {
        if (a().length() <= 0 || !new File(a()).exists()) {
            return false;
        }
        return true;
    }

    private static void d() {
        if (!f145679a) {
            Map<String, List<String>> b2 = ag.b(new p("requirement_ftgru", n.c("unet_denoise_44k_music_model_v1.0")));
            f145679a = true;
            DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"requirement_ftgru"}, b2, new a());
        }
    }

    public static String a() {
        String str;
        try {
            boolean z = false;
            if (!UseKNPlatform.enableKNPlatform || !e.a.b()) {
                str = DownloadableModelSupportResourceFinder.findResourceUri(null, "unet_denoise_44k_music_model_v1.0");
            } else {
                str = e.a.a().a().realFindResourceUri(0, null, "unet_denoise_44k_music_model_v1.0");
            }
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                URI create = URI.create(str);
                l.b(create, "");
                str = create.getPath();
            }
            l.b(str, "");
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
