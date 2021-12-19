package com.bytedance.ies.ugc.statisticlogger.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.a.a;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.io.RandomAccessFile;
import java.util.List;
import org.json.JSONObject;

public final class SetAppTrackTask implements w {
    static {
        Covode.recordClassIndex(21154);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: finally extract failed */
    private static String a(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            long length = randomAccessFile.length() - 2;
            randomAccessFile.seek(length);
            int read = (randomAccessFile.read() & 255) | ((randomAccessFile.read() & 255) << 8);
            if (read == 0) {
                randomAccessFile.close();
                return null;
            }
            randomAccessFile.seek(length - ((long) read));
            byte[] bArr = new byte[read];
            randomAccessFile.read(bArr);
            String obj = bArr.toString();
            randomAccessFile.close();
            return obj;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        try {
            String a2 = a(context.getPackageCodePath());
            if (!TextUtils.isEmpty(a2)) {
                AppLog.setAppTrack(new JSONObject(a2));
                SharedPreferences.Editor edit = d.a(context, a.f59402a, 0).edit();
                edit.putString("app_track", a2);
                edit.apply();
            }
        } catch (Throwable unused) {
        }
    }
}
