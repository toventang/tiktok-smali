package com.ss.android.ugc.aweme.qrcode.presenter;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import java.util.ArrayList;

public interface QrCodeScanService {
    static {
        Covode.recordClassIndex(77814);
    }

    String a(String str);

    void a();

    void a(Context context, String str);

    void a(Context context, String str, String str2);

    void a(Context context, ArrayList<String> arrayList);

    void a(String str, Activity activity, IMovieReuseService.b bVar);

    void a(String str, String str2, Activity activity, boolean z, IMainService.DownLoadFinishListener downLoadFinishListener);

    boolean a(Activity activity, String str, String str2);

    void b(Context context, String str, String str2);

    void c(Context context, String str, String str2);
}
