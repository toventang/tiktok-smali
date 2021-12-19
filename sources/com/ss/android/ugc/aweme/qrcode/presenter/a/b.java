package com.ss.android.ugc.aweme.qrcode.presenter.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.c;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    a f119758a;

    /* renamed from: b  reason: collision with root package name */
    i f119759b;

    /* renamed from: c  reason: collision with root package name */
    private QrCodeScanService f119760c = QrCodeScanImpl.b();

    public interface a {
        static {
            Covode.recordClassIndex(77818);
        }
    }

    static {
        Covode.recordClassIndex(77817);
    }

    public b(a aVar) {
        this.f119758a = aVar;
    }

    public final void a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            String a2 = this.f119760c.a(str);
            if (context != null) {
                QrCodeScanImpl.b();
                if (TextUtils.equals(Uri.parse(a2).getQueryParameter("use_spark"), "1")) {
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.a(a2);
                    c.a.a(context, sparkContext).a();
                    return;
                }
                Intent intent = new Intent(context, CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                bundle.putBoolean("show_not_official_content_warning", false);
                bundle.putBoolean("hide_nav_bar", false);
                bundle.putBoolean("use_webview_title", true);
                bundle.putBoolean("safeTemplate", true);
                intent.putExtra("hide_more", false);
                intent.putExtra("enter_from", "qr_code");
                intent.putExtra("need_sec_link", true);
                intent.putExtra("sec_link_scene", "qrcode");
                intent.putExtra("need_detect_2_jump", true);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(a2));
                com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                context.startActivity(intent);
            }
        }
    }
}
