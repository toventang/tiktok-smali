package com.ss.android.ugc.aweme.kids.a.c;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

public final class e {
    static {
        Covode.recordClassIndex(67486);
    }

    public static final String a(UrlModel urlModel) {
        if (urlModel != null) {
            return "UrlModel: " + urlModel.getUrlList();
        }
        return "";
    }

    public static final String b(UrlModel urlModel) {
        l.d(urlModel, "");
        List<String> urlList = urlModel.getUrlList();
        if (urlList != null) {
            return (String) n.h((List) urlList);
        }
        return null;
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
                    b.a("aweme_music_download_error_rate", -3, new c().a("music_id", musicId).a("fileUrlList", a(musicModel.getUrl())).a("trace", str).a("isHitCache", Boolean.valueOf(z)).a());
                }
                arrayList.add(str2);
            }
            UrlModel url2 = musicModel.getUrl();
            l.b(url2, "");
            url2.setUrlList(arrayList);
        }
    }
}
