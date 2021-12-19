package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract class AFEvent {

    /* renamed from: ı  reason: contains not printable characters */
    WeakReference<Context> f7;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public String f8;

    /* renamed from: ǃ  reason: contains not printable characters */
    public Intent f9;

    /* renamed from: ȷ  reason: contains not printable characters */
    boolean f10;

    /* renamed from: ɨ  reason: contains not printable characters */
    public int f11;

    /* renamed from: ɩ  reason: contains not printable characters */
    AppsFlyerTrackingRequestListener f12;

    /* renamed from: ɪ  reason: contains not printable characters */
    private Map<String, Object> f13;

    /* renamed from: ɹ  reason: contains not printable characters */
    String f14;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final boolean f15;

    /* renamed from: ɿ  reason: contains not printable characters */
    private byte[] f16;

    /* renamed from: Ι  reason: contains not printable characters */
    Map<String, Object> f17;

    /* renamed from: ι  reason: contains not printable characters */
    Context f18;

    /* renamed from: І  reason: contains not printable characters */
    String f19;

    /* renamed from: і  reason: contains not printable characters */
    String f20;

    /* renamed from: Ӏ  reason: contains not printable characters */
    String f21;

    /* renamed from: ӏ  reason: contains not printable characters */
    private String f22;

    static {
        Covode.recordClassIndex(2640);
    }

    public Intent intent() {
        return this.f9;
    }

    public boolean isEncrypt() {
        return this.f15;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m4() {
        return this.f10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final byte[] m5() {
        return this.f16;
    }

    public AFEvent() {
        this(null, null, null);
    }

    public String key() {
        return this.f22;
    }

    public Map<String, Object> params() {
        return this.f13;
    }

    public String urlString() {
        return this.f20;
    }

    public AFEvent weakContext() {
        this.f7 = new WeakReference<>(this.f18);
        this.f18 = null;
        return this;
    }

    public Context context() {
        Context context = this.f18;
        if (context != null) {
            return context;
        }
        WeakReference<Context> weakReference = this.f7;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final AFEvent m3() {
        if (context() != null) {
            this.f18 = com_appsflyer_AFEvent_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context());
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public AFEvent context(Context context) {
        this.f18 = context;
        return this;
    }

    public AFEvent key(String str) {
        this.f22 = str;
        return this;
    }

    public AFEvent params(Map<String, ?> map) {
        this.f13 = map;
        return this;
    }

    public AFEvent post(byte[] bArr) {
        this.f16 = bArr;
        return this;
    }

    public AFEvent urlString(String str) {
        this.f20 = str;
        return this;
    }

    public static Context com_appsflyer_AFEvent_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: protected */
    public String addChannel(String str) {
        String configuredChannel = AppsFlyerLibCore.getInstance().getConfiguredChannel(context());
        if (configuredChannel != null) {
            return Uri.parse(str).buildUpon().appendQueryParameter("channel", configuredChannel).build().toString();
        }
        return str;
    }

    public AFEvent(String str, Boolean bool, Context context) {
        boolean z;
        this.f21 = str;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        this.f15 = z;
        this.f18 = context;
    }
}
