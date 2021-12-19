package com.ss.android.ugc.aweme.tools.beauty.e.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import h.a.n;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f138924a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(90838);
    }

    public static void a(ComposerBeauty composerBeauty, int i2, String str) {
        Object obj;
        l.d(composerBeauty, "");
        l.d(str, "");
        com.ss.android.ugc.aweme.dependence.beauty.a.c("monitorBeautyItemDownload  code:" + i2 + " effect:" + composerBeauty.getEffect().getName());
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("code", String.valueOf(i2));
        hashMap.put("msg", str);
        hashMap.put("effect_id", composerBeauty.getEffect().getEffectId());
        hashMap.put("effect_name", composerBeauty.getEffect().getName());
        List<String> urlList = composerBeauty.getEffect().getFileUrl().getUrlList();
        if (urlList != null) {
            obj = n.h((List) urlList);
        } else {
            obj = null;
        }
        hashMap.put("download_url", String.valueOf(obj));
        b bVar = com.ss.android.ugc.aweme.tools.beauty.e.a.q;
        if (bVar != null) {
            bVar.a("beauty_resource_download", hashMap);
        }
    }

    public static void b(ComposerBeauty composerBeauty, int i2, String str) {
        l.d(composerBeauty, "");
        l.d(str, "");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("code", String.valueOf(i2));
        hashMap.put("msg", str);
        hashMap.put("effect_id", composerBeauty.getEffect().getEffectId());
        hashMap.put("effect_name", composerBeauty.getEffect().getName());
        hashMap.put("unzip_path", composerBeauty.getEffect().getUnzipPath());
        b bVar = com.ss.android.ugc.aweme.tools.beauty.e.a.q;
        if (bVar != null) {
            bVar.a("beauty_resource_unzip", hashMap);
        }
    }

    public static void a(String str, int i2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.aweme.dependence.beauty.a.c("monitorBeautyListFetch panel:" + str + " code:" + i2 + " msg:" + str2);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("panel", str);
        hashMap.put("msg", str2);
        hashMap.put("code", String.valueOf(i2));
        b bVar = com.ss.android.ugc.aweme.tools.beauty.e.a.q;
        if (bVar != null) {
            bVar.a("beauty_fetch_effect_list", hashMap);
        }
    }
}
