package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.g.i;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public interface IHostAction extends com.bytedance.android.live.base.a {

    public interface a {
        static {
            Covode.recordClassIndex(13780);
        }

        void a(String str);

        void a(String str, String str2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(13781);
        }

        void a();

        void a(String str, String str2);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public double f23239a;

        /* renamed from: b  reason: collision with root package name */
        public int f23240b;

        static {
            Covode.recordClassIndex(13782);
        }
    }

    static {
        Covode.recordClassIndex(13779);
    }

    void finishLivePlayActivity();

    List<com.bytedance.android.livesdkapi.model.b> getLiveActivityTasksSetting();

    String getReportUrl();

    i getSearchComponent(String str);

    JSONObject getTTSetting();

    c getVideoOnDemandParams();

    void goEditDoBAgeGatePage(Activity activity, String str, a aVar);

    boolean handleSchema(Context context, String str, Bundle bundle);

    boolean handleSchema(Context context, String str, Bundle bundle, boolean z);

    void initLynxEnv();

    void notifyShowLiveIconEntrance(boolean z);

    void openFeedBack(String str, Context context);

    boolean openHostBrowser(String str, Bundle bundle, Context context);

    boolean openHostBrowser(String str, boolean z, String str2, Context context);

    void openLiveBrowser(String str, Bundle bundle, Context context);

    void openLiveBrowser(String str, String str2, Context context);

    void openLiveLynx(String str, Bundle bundle, Context context);

    void openLiveNewHybrid(Uri uri, Context context, Bundle bundle);

    void openRegionListPage(Activity activity, b bVar);

    void openSignActivity(Context context, Intent intent);

    void openUserProfilePage(long j2, Map<String, String> map);

    void openUserProfilePage(Context context, long j2, Bundle bundle);

    void openVideoDetailPage(String str, String str2);

    void switchToLiveTab(int i2, String str);

    boolean tryOpenAdByOpenUrl(Context context, long j2, String str, String str2);

    boolean tryShowKoiRedPackageInLive(String str);
}
