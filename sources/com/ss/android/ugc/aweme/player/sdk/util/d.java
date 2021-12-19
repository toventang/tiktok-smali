package com.ss.android.ugc.aweme.player.sdk.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Locale;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f115449a;

    /* renamed from: b  reason: collision with root package name */
    public static b f115450b;

    /* renamed from: c  reason: collision with root package name */
    public static b f115451c;

    /* renamed from: d  reason: collision with root package name */
    private static String f115452d;

    /* renamed from: e  reason: collision with root package name */
    private static final a f115453e = new a((byte) 0);

    public static class a {

        public interface c {
            static {
                Covode.recordClassIndex(74116);
            }

            boolean a(MediaCodecInfo mediaCodecInfo);
        }

        static {
            Covode.recordClassIndex(74113);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.player.sdk.util.d$a$d  reason: collision with other inner class name */
        public static class C2949d implements c {

            /* renamed from: a  reason: collision with root package name */
            private final String f115456a;

            static {
                Covode.recordClassIndex(74117);
            }

            public C2949d(String str) {
                this.f115456a = str;
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.util.d.a.c
            public final boolean a(MediaCodecInfo mediaCodecInfo) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equalsIgnoreCase(this.f115456a)) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.player.sdk.util.d$a$a  reason: collision with other inner class name */
        public static class C2948a implements c {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f115454a = true;

            static {
                Covode.recordClassIndex(74114);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.util.d.a.c
            public final boolean a(MediaCodecInfo mediaCodecInfo) {
                if (!this.f115454a || mediaCodecInfo.isEncoder()) {
                    return false;
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public static class b implements c {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f115455a = true;

            static {
                Covode.recordClassIndex(74115);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.util.d.a.c
            public final boolean a(MediaCodecInfo mediaCodecInfo) {
                if (this.f115455a) {
                    String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.US);
                    if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || "omx.qcom.video.decoder.hevcswvdec".equals(lowerCase) || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || (!lowerCase.startsWith("omx.") && !lowerCase.startsWith("c2.")))) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
        }

        public static MediaCodecInfo a(c... cVarArr) {
            try {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i2 = 0; i2 < codecCount; i2++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                    if (codecInfoAt != null) {
                        boolean z = true;
                        com.a.a("selectCodec: name: %s, index:%s, type:%s", new Object[]{codecInfoAt.getName(), Integer.valueOf(i2), Arrays.toString(codecInfoAt.getSupportedTypes())});
                        for (c cVar : cVarArr) {
                            z = cVar.a(codecInfoAt);
                            if (!z) {
                                break;
                            }
                        }
                        if (z) {
                            return codecInfoAt;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                com.ss.android.ugc.aweme.player.sdk.a.a("selectCodec", th);
                return null;
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f115457a;

        /* renamed from: b  reason: collision with root package name */
        public int f115458b;

        /* renamed from: c  reason: collision with root package name */
        int f115459c;

        static {
            Covode.recordClassIndex(74118);
        }

        private b() {
            this.f115457a = "";
            this.f115458b = -1;
            this.f115459c = -1;
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(74112);
    }

    public static String a() {
        try {
            if (f115452d == null) {
                f115452d = Build.HARDWARE;
            }
        } catch (Throwable unused) {
            f115452d = null;
        }
        return f115452d;
    }

    public static int b() {
        if (f115450b == null) {
            f115450b = a("video/avc");
        }
        b bVar = f115450b;
        if (bVar != null) {
            return bVar.f115459c;
        }
        return -1;
    }

    public static int c() {
        if (f115451c == null) {
            f115451c = a("video/hevc");
        }
        b bVar = f115451c;
        if (bVar != null) {
            return bVar.f115459c;
        }
        return -1;
    }

    public static b a(String str) {
        Exception e2;
        b bVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.toLowerCase().equals("video/avc") && !str.toLowerCase().equals("video/hevc")) {
            return null;
        }
        try {
            MediaCodecInfo a2 = a.a(new a.C2948a(), new a.b(), new a.C2949d(str));
            if (a2 == null) {
                return null;
            }
            b bVar2 = new b((byte) 0);
            try {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(str);
                bVar2.f115459c = capabilitiesForType.getVideoCapabilities().getSupportedHeights().getUpper().intValue();
                bVar2.f115458b = capabilitiesForType.getVideoCapabilities().getSupportedWidths().getUpper().intValue();
                bVar2.f115457a = a2.getName().toLowerCase(Locale.US);
                return bVar2;
            } catch (Exception e3) {
                e2 = e3;
                bVar = bVar2;
            }
        } catch (Exception e4) {
            e2 = e4;
            com.ss.android.ugc.aweme.player.sdk.a.a("heightUpperLimitForByteVc1", e2);
            return bVar;
        }
    }
}
