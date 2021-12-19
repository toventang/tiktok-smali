package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface IHostShare extends com.bytedance.android.live.base.a {

    public interface a {
        static {
            Covode.recordClassIndex(13790);
        }

        void a(List<com.bytedance.android.live.base.model.b> list);
    }

    public interface b {
        static {
            Covode.recordClassIndex(13791);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(13789);
    }

    Pair<String, Drawable> getBreathShareAnimShareRes(Context context, String str, String str2);

    String getBundleKey(int i2);

    Dialog getLongPressShareDialog(Activity activity, c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar);

    Dialog getShareDialog(Activity activity, c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar);

    void getShortUrl(String str, b bVar);

    void getUrlModelAndShowAnim(a aVar);

    boolean isImChannel(String str);

    boolean isShareAvailable(String str, Activity activity);

    void share(Activity activity, c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar);

    void showReportDialog(Activity activity, c cVar, String str);
}
