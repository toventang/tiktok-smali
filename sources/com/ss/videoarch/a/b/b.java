package com.ss.videoarch.a.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.medialoader.AVMDLDataLoaderListener;
import com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo;
import com.ss.ttm.player.m;
import java.net.URLEncoder;

public final class b implements AVMDLDataLoaderListener {

    /* renamed from: a  reason: collision with root package name */
    public AVMDLDataLoaderConfigure f154221a;

    /* renamed from: b  reason: collision with root package name */
    public a f154222b;

    /* renamed from: c  reason: collision with root package name */
    public m f154223c;

    static {
        Covode.recordClassIndex(102844);
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getCheckSumInfo(String str) {
        return null;
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getStringValue(int i2, long j2, String str) {
        return null;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static b f154224a = new b((byte) 0);

        static {
            Covode.recordClassIndex(102845);
        }
    }

    private b() {
        this.f154221a = AVMDLDataLoaderConfigure.getDefaultonfigure();
    }

    public static boolean a() {
        if (AVMDLDataLoader.getInstance() == null) {
            return false;
        }
        return AVMDLDataLoader.getInstance().isRunning();
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        a aVar;
        if (aVMDLDataLoaderNotifyInfo != null && this.f154222b != null) {
            int i2 = aVMDLDataLoaderNotifyInfo.what;
            if (i2 == 9) {
                a aVar2 = this.f154222b;
                if (aVar2 != null) {
                    aVar2.a((int) aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                }
            } else if (i2 == 12 && (aVar = this.f154222b) != null) {
                aVar.b((int) aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
            }
        }
    }

    public static long a(int i2) {
        AVMDLDataLoader instance = AVMDLDataLoader.getInstance();
        if (i2 != 7218) {
            switch (i2) {
                case 8100:
                    if (instance == null) {
                        return -1;
                    }
                    return instance.getLongValue(8100);
                case 8101:
                    if (instance == null) {
                        return -1;
                    }
                    return instance.getLongValue(8101);
                case 8102:
                    if (instance != null && instance.getLongValue(8102) == 1) {
                        return 1;
                    }
                    return 0;
                default:
                    return -1;
            }
        } else if (instance == null) {
            return -1;
        } else {
            return instance.getLongValue(7218);
        }
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final long getInt64Value(int i2, long j2) {
        a aVar;
        if (i2 == 8003) {
            m mVar = this.f154223c;
            if (mVar != null) {
                return mVar.a(73, 0L);
            }
            return j2;
        } else if (i2 == 8004 && (aVar = this.f154222b) != null) {
            return aVar.a(j2);
        } else {
            return j2;
        }
    }

    public static String a(String str, Boolean bool) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            if (!lowerCase.startsWith("http://127.0.0.1") && !lowerCase.startsWith("http://localhost") && !lowerCase.startsWith("file://") && !lowerCase.startsWith("/") && !lowerCase.endsWith(".mpd") && !lowerCase.contains(".mpd?") && !lowerCase.contains(".m3u8?") && !lowerCase.endsWith(".m3u8")) {
                z = true;
            }
        }
        if (!z) {
            return str;
        }
        String localAddr = AVMDLDataLoader.getInstance().getLocalAddr();
        if (TextUtils.isEmpty(localAddr)) {
            return null;
        }
        try {
            str2 = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        String str3 = localAddr + "?rk=v02004b50000bh9ajqhdli3lfv2rgsgg&k=426161df8c5ce110209a6fc6641e049ddfrfgaf&u0=" + str2;
        if (bool.booleanValue()) {
            return "mdl://".concat(String.valueOf(str3));
        }
        return "http://".concat(String.valueOf(str3));
    }

    public static void a(int i2, String str, int i3) {
        AVMDLDataLoader instance = AVMDLDataLoader.getInstance();
        if (instance != null) {
            if (i2 == 7213 || i2 == 7215) {
                instance.setInt64ValueByStrKey(i2, str, (long) i3);
            } else {
                instance.setInt64ValueByStrKey(i2, str, System.currentTimeMillis());
            }
        }
    }
}
