package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.android.live.core.f.b.e;
import com.bytedance.android.live.core.f.c;
import com.bytedance.android.livesdk.livesetting.other.TTliveGeckoFileInfoReportEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.TTliveGeckoLoadResourceStateSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.c.d;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.lancet.k;
import h.f.b.l;
import java.io.File;
import java.util.HashMap;

public final class HSAnimImageView extends HSImageView {

    /* renamed from: d  reason: collision with root package name */
    public static int f9263d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static int f9264e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static int f9265f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static int[] f9266g;

    /* renamed from: h  reason: collision with root package name */
    public static String[] f9267h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f9268i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.facebook.fresco.animation.c.b f9269a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9270b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9271c;

    /* renamed from: j  reason: collision with root package name */
    private String f9272j = "";

    /* renamed from: k  reason: collision with root package name */
    private com.facebook.drawee.h.a f9273k;

    /* renamed from: l  reason: collision with root package name */
    private com.facebook.fresco.animation.c.a f9274l;

    public static final String a(String str, String str2) {
        return f9268i.a(str, str2);
    }

    public static final String b(String str, String str2) {
        return f9268i.a(str, str2, false);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4734);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static String a(String str) {
            l.d(str, "");
            if (!TextUtils.isEmpty(str)) {
                return "file://".concat(String.valueOf(str));
            }
            return "";
        }

        public final String a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            return a(str, str2, false);
        }

        private static boolean d(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            File tTLiveGeckoResourceFile = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getTTLiveGeckoResourceFile(str, str2);
            if (tTLiveGeckoResourceFile != null) {
                return tTLiveGeckoResourceFile.exists();
            }
            return false;
        }

        private static String b(String str, String str2) {
            IHostContext iHostContext;
            File tTLiveGeckoResourceFile;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (iHostContext = (IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)) == null || (tTLiveGeckoResourceFile = iHostContext.getTTLiveGeckoResourceFile(str, str2)) == null || !tTLiveGeckoResourceFile.exists()) {
                return "";
            }
            String absolutePath = tTLiveGeckoResourceFile.getAbsolutePath();
            l.b(absolutePath, "");
            return a(absolutePath);
        }

        private static String c(String str, String str2) {
            IHostContext iHostContext;
            String tTLiveGeckoCdnUrl;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (iHostContext = (IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)) == null || (tTLiveGeckoCdnUrl = iHostContext.getTTLiveGeckoCdnUrl(str, str2)) == null) {
                return "";
            }
            return tTLiveGeckoCdnUrl;
        }

        private static String a(int i2, String str, String str2) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                while (i2 >= 0) {
                    String[] strArr = HSAnimImageView.f9267h;
                    if (strArr == null) {
                        l.a("mArrayValue");
                    }
                    String str3 = strArr[i2];
                    if (d(str, str3 + File.separator + str2)) {
                        return str3;
                    }
                    i2--;
                }
            }
            return "";
        }

        private final String b(String str, String str2, boolean z) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                a(str, str2, "", "", z);
                return "";
            }
            String a2 = a(str, str2, z, false);
            if (TextUtils.isEmpty(a2)) {
                a2 = b(str, str2, z, false);
            }
            a(str, str2, "", a2, z);
            return a2;
        }

        public final String a(String str, String str2, boolean z) {
            l.d(str, "");
            l.d(str2, "");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                a(str, str2, "", "", z);
                return "";
            }
            int value = TTliveGeckoLoadResourceStateSetting.INSTANCE.getValue();
            if (value == 1) {
                return a(str, str2, z, true);
            }
            if (value != 2) {
                return b(str, str2, z);
            }
            return b(str, str2, z, true);
        }

        private static String a(String str, String str2, boolean z, boolean z2) {
            String b2;
            Context applicationContext;
            String str3 = "";
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                if (z2) {
                    a(str, str2, str3, str3, z);
                }
                return str3;
            }
            if (z && (applicationContext = GlobalContext.getApplicationContext()) != null) {
                if (HSAnimImageView.f9263d <= 0) {
                    e a2 = c.a(applicationContext);
                    HSAnimImageView.f9263d = a2.f9056a;
                    HSAnimImageView.f9264e = a2.f9057b;
                    HSAnimImageView.f9265f = a2.f9058c;
                }
                if (HSAnimImageView.f9266g == null || HSAnimImageView.f9267h == null) {
                    HSAnimImageView.f9266g = new int[]{120, 160, 240, 320, 480, 640};
                    HSAnimImageView.f9267h = new String[]{"ldpi", "mdpi", "hdpi", "xhdpi", "xxhdpi", "xxxhdpi"};
                }
                int[] iArr = HSAnimImageView.f9266g;
                if (iArr == null) {
                    l.a("mArrayKey");
                }
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    int[] iArr2 = HSAnimImageView.f9266g;
                    if (iArr2 == null) {
                        l.a("mArrayKey");
                    }
                    if (iArr2[i3] >= HSAnimImageView.f9263d) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                    int[] iArr3 = HSAnimImageView.f9266g;
                    if (iArr3 == null) {
                        l.a("mArrayKey");
                    }
                    int length2 = iArr3.length;
                    int i4 = i2;
                    while (true) {
                        if (i4 >= length2) {
                            break;
                        }
                        String[] strArr = HSAnimImageView.f9267h;
                        if (strArr == null) {
                            l.a("mArrayValue");
                        }
                        String str4 = strArr[i4];
                        if (d(str, str4 + File.separator + str2)) {
                            str3 = str4;
                            break;
                        }
                        i4++;
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = a(i2, str, str2);
                }
            }
            if (TextUtils.isEmpty(str3)) {
                b2 = b(str, str2);
            } else {
                b2 = b(str, str3 + File.separator + str2);
            }
            if (z2) {
                a(str, str2, str3, b2, z);
            }
            return b2;
        }

        private static String b(String str, String str2, boolean z, boolean z2) {
            String c2;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                if (z2) {
                    a(str, str2, "", "", z);
                }
                return "";
            }
            if (z) {
                c2 = c(str, "xhdpi" + File.separator + str2);
            } else {
                c2 = c(str, str2);
            }
            if (z2) {
                a(str, str2, "", c2, z);
            }
            return c2;
        }

        private static void a(String str, String str2, String str3, String str4, boolean z) {
            Context applicationContext;
            if (TTliveGeckoFileInfoReportEnableSetting.INSTANCE.getValue()) {
                HashMap hashMap = new HashMap();
                hashMap.put("channel", str);
                hashMap.put("filename", str2);
                hashMap.put("drawable", str3);
                hashMap.put("path", str4);
                hashMap.put("use_resolution", Integer.valueOf(!z ? 1 : 0));
                hashMap.put("is_use_resolution", Integer.valueOf(TextUtils.isEmpty(str3) ? 1 : 0));
                if ((HSAnimImageView.f9263d <= 0 || HSAnimImageView.f9264e <= 0 || HSAnimImageView.f9265f <= 0) && (applicationContext = GlobalContext.getApplicationContext()) != null) {
                    e a2 = c.a(applicationContext);
                    HSAnimImageView.f9263d = a2.f9056a;
                    HSAnimImageView.f9264e = a2.f9057b;
                    HSAnimImageView.f9265f = a2.f9058c;
                }
                hashMap.put("dpi", Integer.valueOf(HSAnimImageView.f9263d));
                hashMap.put("width", Integer.valueOf(HSAnimImageView.f9264e));
                hashMap.put("height", Integer.valueOf(HSAnimImageView.f9265f));
                com.bytedance.android.live.core.d.c.a("ttlive_gecko_file_info_report", 1, hashMap);
            }
        }
    }

    public final com.facebook.fresco.animation.c.a getAnimatedDrawable2() {
        return this.f9274l;
    }

    public final boolean getUseWrapContent() {
        return this.f9271c;
    }

    @Override // com.facebook.drawee.view.c
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public final void b() {
        this.f9270b = false;
        com.facebook.fresco.animation.c.a aVar = this.f9274l;
        if (aVar != null) {
            aVar.stop();
        }
    }

    public final boolean c() {
        com.facebook.fresco.animation.c.a aVar = this.f9274l;
        if (aVar != null) {
            return aVar.isRunning();
        }
        return false;
    }

    static {
        Covode.recordClassIndex(4733);
    }

    public final void a() {
        this.f9270b = true;
        if (this.f9273k == null) {
            com.facebook.drawee.a.a.e a2 = com.facebook.drawee.a.a.c.b().a(this.f9272j);
            a2.f47322j = false;
            a2.f47319g = new b(this);
            this.f9273k = a2.e();
        }
        setController(this.f9273k);
    }

    public final void setAnimatedDrawable2(com.facebook.fresco.animation.c.a aVar) {
        this.f9274l = aVar;
    }

    public final void setAutoPlay(boolean z) {
        this.f9270b = z;
    }

    public final void setUseWrapContent(boolean z) {
        this.f9271c = z;
    }

    public static final class b implements d<f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HSAnimImageView f9275a;

        static {
            Covode.recordClassIndex(4735);
        }

        @Override // com.facebook.drawee.c.d
        public final void onFailure(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onRelease(String str) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onSubmit(String str, Object obj) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(HSAnimImageView hSAnimImageView) {
            this.f9275a = hSAnimImageView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d
        public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            f fVar2 = fVar;
            if (this.f9275a.getUseWrapContent() && fVar2 != null) {
                HSAnimImageView hSAnimImageView = this.f9275a;
                int width = fVar2.getWidth();
                int height = fVar2.getHeight();
                int measuredWidth = hSAnimImageView.getMeasuredWidth();
                int measuredHeight = hSAnimImageView.getMeasuredHeight();
                if (measuredHeight > measuredWidth) {
                    measuredWidth = (width / height) * measuredHeight;
                } else {
                    measuredHeight = (height / width) * measuredWidth;
                }
                hSAnimImageView.getLayoutParams().height = measuredHeight;
                hSAnimImageView.getLayoutParams().width = measuredWidth;
                hSAnimImageView.setLayoutParams(hSAnimImageView.getLayoutParams());
            }
            if (animatable instanceof com.facebook.fresco.animation.c.a) {
                com.facebook.fresco.animation.c.a aVar = (com.facebook.fresco.animation.c.a) animatable;
                aVar.a(this.f9275a.f9269a);
                if (this.f9275a.f9270b) {
                    animatable.start();
                }
                this.f9275a.setAnimatedDrawable2(aVar);
            }
        }
    }

    public HSAnimImageView(Context context) {
        super(context);
    }

    public final HSAnimImageView a(com.facebook.fresco.animation.c.b bVar) {
        l.d(bVar, "");
        this.f9269a = bVar;
        return this;
    }

    public final HSAnimImageView a(String str) {
        l.d(str, "");
        this.f9272j = str;
        return this;
    }

    public HSAnimImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
