package com.ss.android.ugc.aweme.profile;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final Keva f116479a = Keva.getRepo("repo_local_cover");

    static {
        Covode.recordClassIndex(75187);
    }

    public final UrlModel a(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String string = this.f116479a.getString(str, "");
        l.b(string, "");
        if (!new File(string).exists()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String uri = Uri.fromFile(new File(string)).toString();
        l.b(uri, "");
        arrayList.add(uri);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(arrayList);
        return urlModel;
    }
}
