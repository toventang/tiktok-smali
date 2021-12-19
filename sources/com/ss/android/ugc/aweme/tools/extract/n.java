package com.ss.android.ugc.aweme.tools.extract;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    final Context f140101a;

    /* renamed from: b  reason: collision with root package name */
    public String f140102b;

    static {
        Covode.recordClassIndex(91546);
    }

    public final String a() {
        return this.f140102b + File.separator + "extract-frame-" + System.currentTimeMillis() + ".jpg";
    }

    public final String b() {
        return this.f140102b + File.separator + "extract-frame-" + System.currentTimeMillis() + "_hq.jpg";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(android.app.Application r3) {
        /*
            r2 = this;
            android.content.Context r1 = r3.getApplicationContext()
            boolean r0 = com.ss.android.ugc.aweme.lancet.a.a.f107168c
            if (r0 != 0) goto L_0x000c
        L_0x0008:
            r2.<init>(r1)
            return
        L_0x000c:
            if (r1 == 0) goto L_0x000f
            goto L_0x0008
        L_0x000f:
            android.app.Application r1 = com.ss.android.ugc.aweme.lancet.a.a.f107166a
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.extract.n.<init>(android.app.Application):void");
    }

    public static File a(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private n(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f140101a = applicationContext;
        this.f140102b = a(applicationContext).getAbsolutePath();
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        return this.f140102b + File.separator + "extract-frame-" + str + "_" + System.currentTimeMillis() + ".jpg";
    }

    public final void a(String str, String str2, String str3) {
        this.f140102b = str + File.separator + str2 + File.separator + str3;
        File file = new File(this.f140102b);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
