package com.ss.android.ugc.aweme.kids.a.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(67539);
    }

    private static String a(String str) {
        l.d(str, "");
        if (p.b(str, "http://", false)) {
            return p.b(str, "http://", "https://", false);
        }
        return str;
    }

    private static UrlModel a(UrlModel urlModel) {
        l.d(urlModel, "");
        List<String> urlList = urlModel.getUrlList();
        ArrayList arrayList = null;
        if (urlList != null) {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) urlList, 10));
            for (T t : urlList) {
                arrayList2.add(t != null ? a((String) t) : null);
            }
            arrayList = arrayList2;
        }
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    public static final MusicModel a(MusicModel musicModel) {
        UrlModel urlModel;
        l.d(musicModel, "");
        UrlModel url = musicModel.getUrl();
        UrlModel urlModel2 = null;
        if (url != null) {
            urlModel = a(url);
        } else {
            urlModel = null;
        }
        musicModel.setUrl(urlModel);
        UrlModel strongBeatUrl = musicModel.getStrongBeatUrl();
        if (strongBeatUrl != null) {
            urlModel2 = a(strongBeatUrl);
        }
        musicModel.setStrongBeatUrl(urlModel2);
        return musicModel;
    }
}
