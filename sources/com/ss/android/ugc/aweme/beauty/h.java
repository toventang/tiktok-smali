package com.ss.android.ugc.aweme.beauty;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.tools.beauty.e.a.e;
import com.ss.android.ugc.aweme.tools.beauty.h.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f68634a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final Keva f68635b;

    public static final class a extends com.google.gson.b.a<List<? extends UlikeBeautyData>> {
        static {
            Covode.recordClassIndex(42236);
        }

        a() {
        }
    }

    private h() {
    }

    static {
        Covode.recordClassIndex(42235);
        Keva repo = Keva.getRepo("ulike_repo");
        l.b(repo, "");
        f68635b = repo;
    }

    public static ArrayList<UlikeBeautyData> a() {
        Void r0;
        String str;
        Keva keva = f68635b;
        String string = keva.getString("ulike_download_config", "");
        if (TextUtils.isEmpty(string)) {
            e eVar = com.ss.android.ugc.aweme.tools.beauty.e.a.f138921k;
            if (eVar != null) {
                str = eVar.a();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                keva.storeString("ulike_download_config", str);
                string = str;
            }
        }
        try {
            if (TextUtils.isEmpty(string)) {
                r0 = null;
            } else {
                r0 = (Void) b.a().a(string, new a().type);
            }
            return (ArrayList) r0;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.dependence.beauty.a.b("getUlikeBeautyDataList " + e2.getMessage());
            return null;
        }
    }
}
