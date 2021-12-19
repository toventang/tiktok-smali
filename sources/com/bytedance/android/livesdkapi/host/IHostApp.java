package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.android.livesdk.model.ab;
import com.bytedance.android.livesdkapi.g.d;
import com.bytedance.covode.number.Covode;
import f.a.b.b;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public interface IHostApp extends com.bytedance.android.live.base.a {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23241a;

        /* renamed from: b  reason: collision with root package name */
        public String f23242b;

        /* renamed from: c  reason: collision with root package name */
        public String f23243c;

        /* renamed from: d  reason: collision with root package name */
        public String f23244d;

        /* renamed from: e  reason: collision with root package name */
        public Map<String, String> f23245e = new HashMap(3);

        static {
            Covode.recordClassIndex(13784);
        }
    }

    static {
        Covode.recordClassIndex(13783);
    }

    d avatarBorderController();

    void bindGifImage(View view, String str, Bitmap.Config config);

    void checkAndShowGuide(e eVar, String str, String str2);

    void checkBindHelpShow(e eVar, String str);

    void enterRecorderActivity(Activity activity);

    String getBgBroadcastServiceName();

    Pair<String, Drawable> getBreathShareAnimShareRes(Context context, String str, String str2);

    int getCurrentPage();

    Class getHostActivity(int i2);

    Typeface getHostTypeface(int i2);

    List<Class> getLiveActivityClass();

    boolean getPushLiveState();

    Activity getTopActivity();

    Uri getUriForFile(Context context, File file);

    void hideStickerView();

    void initImageLib();

    boolean isAppForeground();

    boolean isInMusicallyRegion();

    boolean isNotificationEnabled(Context context);

    boolean isShowStickerView();

    void jumpToAgsStatusPage(Context context, String str);

    com.bytedance.android.livesdkapi.g.e liveCircleView(Context context);

    void openWallet(Activity activity);

    b registerAppEnterForeBackgroundCallback(com.bytedance.android.livesdkapi.depend.a aVar);

    void registerLifeCycleCallback(com.bytedance.android.livesdkapi.depend.b bVar);

    void setCurrentPage(int i2);

    Dialog showDialog(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, com.bytedance.android.livesdkapi.view.a aVar, CharSequence charSequence4, com.bytedance.android.livesdkapi.view.a aVar2, com.bytedance.android.livesdkapi.host.b.a aVar3);

    void showNotificationTipDialog(String str, String str2, String str3, int i2, View view, String str4, a aVar, boolean z, ab abVar);

    void showStickerView(androidx.appcompat.app.d dVar, i iVar, String str, FrameLayout frameLayout, n nVar);

    void startBindMobileFullFragment(Activity activity, String str, String str2, m mVar);

    void startBindPhoneDialogFragment(Activity activity, String str, String str2, m mVar);

    boolean startVideoRecordActivity(Activity activity, String str);

    void transCloudControlCommand(JSONObject jSONObject);

    void tryDownloadGiftImage(String str);

    void tryDownloadImage(String str);
}
