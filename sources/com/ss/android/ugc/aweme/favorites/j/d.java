package com.ss.android.ugc.aweme.favorites.j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<CrossPlatformWebView> f90679a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f90680b = new d();

    /* renamed from: c  reason: collision with root package name */
    private static String f90681c = "";

    /* renamed from: d  reason: collision with root package name */
    private static final String f90682d = "loadMoreItem";

    /* renamed from: e  reason: collision with root package name */
    private static final String f90683e = "itemStateChange";

    private d() {
    }

    @Override // com.ss.android.ugc.aweme.favorites.j.c
    public final boolean a() {
        if (f90679a != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(56963);
    }

    @Override // com.ss.android.ugc.aweme.favorites.j.c
    public final void a(Aweme aweme, String str) {
        String str2;
        CrossPlatformWebView crossPlatformWebView;
        CrossPlatformWebView crossPlatformWebView2;
        CrossPlatformWebView crossPlatformWebView3;
        l.d(aweme, "");
        WeakReference<CrossPlatformWebView> weakReference = f90679a;
        String str3 = null;
        if (!(weakReference == null || weakReference.get() == null)) {
            try {
                JSONObject jSONObject = new JSONObject();
                WeakReference<CrossPlatformWebView> weakReference2 = f90679a;
                if (weakReference2 == null || (crossPlatformWebView3 = weakReference2.get()) == null) {
                    str2 = null;
                } else {
                    str2 = crossPlatformWebView3.getReactId();
                }
                jSONObject.put("reactId", str2);
                jSONObject.put("awemeId", aweme.getAid());
                AwemeStatistics statistics = aweme.getStatistics();
                l.b(statistics, "");
                jSONObject.put("star", statistics.getDiggCount());
                AwemeStatistics statistics2 = aweme.getStatistics();
                l.b(statistics2, "");
                jSONObject.put(UGCMonitor.EVENT_COMMENT, statistics2.getCommentCount());
                AwemeStatistics statistics3 = aweme.getStatistics();
                l.b(statistics3, "");
                jSONObject.put("share", statistics3.getShareCount());
                jSONObject.put("from", str);
                WeakReference<CrossPlatformWebView> weakReference3 = f90679a;
                if (!(weakReference3 == null || (crossPlatformWebView = weakReference3.get()) == null)) {
                    String str4 = f90683e;
                    WeakReference<CrossPlatformWebView> weakReference4 = f90679a;
                    if (!(weakReference4 == null || (crossPlatformWebView2 = weakReference4.get()) == null)) {
                        str3 = crossPlatformWebView2.getReactId();
                    }
                    crossPlatformWebView.a(str4, jSONObject, str3);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (TextUtils.equals(str, "exit")) {
            CrossPlatformLegacyServiceImpl.f();
        }
    }
}
