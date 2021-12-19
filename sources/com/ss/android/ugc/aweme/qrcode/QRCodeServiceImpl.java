package com.ss.android.ugc.aweme.qrcode;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.qrcode.e.g;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.util.am;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.io.File;

public final class QRCodeServiceImpl implements IQRCodeService {
    static {
        Covode.recordClassIndex(77750);
    }

    public static IQRCodeService a() {
        MethodCollector.i(1468);
        Object a2 = b.a(IQRCodeService.class, false);
        if (a2 != null) {
            IQRCodeService iQRCodeService = (IQRCodeService) a2;
            MethodCollector.o(1468);
            return iQRCodeService;
        }
        if (b.de == null) {
            synchronized (IQRCodeService.class) {
                try {
                    if (b.de == null) {
                        b.de = new QRCodeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1468);
                    throw th;
                }
            }
        }
        QRCodeServiceImpl qRCodeServiceImpl = (QRCodeServiceImpl) b.de;
        MethodCollector.o(1468);
        return qRCodeServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final int a(String str) {
        return c.a(str);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            context.sendBroadcast(intent);
        }
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void a(Context context, boolean z, boolean z2) {
        l.d(context, "");
        QRCodePermissionActivity.a(context, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final b a(View view, String str, boolean z) {
        String str2;
        l.d(view, "");
        l.d(str, "");
        if (!z) {
            return new b(g.a(view, str, view.getContext()), null, z);
        }
        String g2 = am.g(view.getContext());
        Bitmap a2 = g.a(view);
        if (a2 != null) {
            view.setDrawingCacheEnabled(false);
            if (BitmapUtils.saveBitmapToSD(a2, g2, str)) {
                str2 = g2 + "/" + str;
                return new b(null, str2, z);
            }
        }
        str2 = null;
        return new b(null, str2, z);
    }
}
