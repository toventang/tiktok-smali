package com.ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.playerkit.model.v;
import com.ss.android.ugc.playerkit.model.x;
import java.io.File;
import java.util.List;
import java.util.Map;

public interface i {
    static {
        Covode.recordClassIndex(94039);
    }

    long a(String str);

    g a(a aVar);

    Object a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, String str, String[] strArr);

    void a(f fVar);

    void a(k kVar);

    void a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, String str, d dVar);

    void a(Map<String, String> map);

    boolean a();

    boolean a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar);

    boolean a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, int i2, n nVar);

    boolean a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, int i2, n nVar, g.a aVar, List<com.ss.android.ugc.playerkit.simapicommon.a.i> list, List<com.ss.android.ugc.playerkit.simapicommon.a.i> list2, int i3);

    boolean a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, int i2, List<com.ss.android.ugc.playerkit.simapicommon.a.i> list, List<com.ss.android.ugc.playerkit.simapicommon.a.i> list2, int i3);

    long b(String str);

    File b();

    boolean b(com.ss.android.ugc.playerkit.simapicommon.a.i iVar);

    boolean b(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, int i2, n nVar);

    int c(com.ss.android.ugc.playerkit.simapicommon.a.i iVar);

    void c();

    int d(com.ss.android.ugc.playerkit.simapicommon.a.i iVar);

    void d();

    long e(com.ss.android.ugc.playerkit.simapicommon.a.i iVar);

    g e();

    String f();

    boolean f(com.ss.android.ugc.playerkit.simapicommon.a.i iVar);

    boolean g();

    boolean g(com.ss.android.ugc.playerkit.simapicommon.a.i iVar);

    void h(com.ss.android.ugc.playerkit.simapicommon.a.i iVar);

    void i(com.ss.android.ugc.playerkit.simapicommon.a.i iVar);

    m j(com.ss.android.ugc.playerkit.simapicommon.a.i iVar);

    List<x> k(com.ss.android.ugc.playerkit.simapicommon.a.i iVar);

    List<v> l(com.ss.android.ugc.playerkit.simapicommon.a.i iVar);

    v m(com.ss.android.ugc.playerkit.simapicommon.a.i iVar);

    public enum a {
        VideoCache("com.ss.android.ugc.aweme.video.preload.VideoCachePreloader", "cache"),
        MediaLoader("com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader", "cachev2");
        
        String cacheDir;
        String type;

        public final String getCacheDirName() {
            return this.cacheDir;
        }

        public final String getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(94040);
        }

        private a(String str, String str2) {
            this.type = str;
            this.cacheDir = str2;
        }
    }
}
