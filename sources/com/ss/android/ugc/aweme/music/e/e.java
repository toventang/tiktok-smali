package com.ss.android.ugc.aweme.music.e;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.toutiao.proxyserver.g.a;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.HttpUrl;

public final class e {
    static {
        Covode.recordClassIndex(71588);
    }

    public static final String a(UrlModel urlModel) {
        if (urlModel != null) {
            return "UrlModel: " + urlModel.getUrlList();
        }
        return "";
    }

    public static final boolean b(UrlModel urlModel) {
        if (urlModel != null && !TextUtils.isEmpty(urlModel.getUri()) && !b.a((Collection) urlModel.getUrlList())) {
            return true;
        }
        return false;
    }

    public static final String c(UrlModel urlModel) {
        l.d(urlModel, "");
        List<String> urlList = urlModel.getUrlList();
        if (urlList != null) {
            return (String) n.h((List) urlList);
        }
        return null;
    }

    public static final List<String> d(UrlModel urlModel) {
        l.d(urlModel, "");
        List<String> urlList = urlModel.getUrlList();
        if (urlList == null) {
            return z.INSTANCE;
        }
        List<String> g2 = n.g((Collection) urlList);
        g2.remove(c(urlModel));
        return g2;
    }

    public static final boolean a(String str, String str2, String str3) {
        String a2 = a.a(str);
        com.ss.android.ugc.musicprovider.e a3 = com.ss.android.ugc.musicprovider.e.a();
        l.b(a3, "");
        File file = new File(a3.c(), a2);
        if (!file.exists() || !file.isFile()) {
            com.ss.android.ugc.aweme.music.ui.b.a.a(false, str, str2, str3);
            return false;
        }
        com.ss.android.ugc.aweme.music.ui.b.a.a(true, str, str2, str3);
        return true;
    }

    public static final void a(MusicModel musicModel, String str, boolean z) {
        l.d(musicModel, "");
        if (musicModel.isPlayUrlValid()) {
            UrlModel url = musicModel.getUrl();
            l.b(url, "");
            List<String> urlList = url.getUrlList();
            l.b(urlList, "");
            List<String> g2 = n.g((Iterable) urlList);
            ArrayList arrayList = new ArrayList(n.a((Iterable) g2, 10));
            for (String str2 : g2) {
                if (!musicModel.isNeedSetCookie() || !p.b(str2, "http://", false)) {
                    HttpUrl parse = HttpUrl.parse(str2);
                    if (parse != null && parse.queryParameter("ss_is_p_v_ss") == null) {
                        HttpUrl.Builder newBuilder = parse.newBuilder();
                        newBuilder.setQueryParameter("ss_is_p_v_ss", "1");
                        str2 = newBuilder.toString();
                    }
                    l.b(str2, "");
                } else {
                    String musicId = musicModel.getMusicId();
                    com.bytedance.apm.b.a("aweme_music_download_error_rate", -3, new c().a("music_id", musicId).a("fileUrlList", a(musicModel.getUrl())).a("trace", str).a("isHitCache", Boolean.valueOf(z)).a());
                }
                arrayList.add(str2);
            }
            UrlModel url2 = musicModel.getUrl();
            l.b(url2, "");
            url2.setUrlList(arrayList);
        }
    }
}
