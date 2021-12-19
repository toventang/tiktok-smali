package com.snapchat.kit.sdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import java.util.List;

/* access modifiers changed from: package-private */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final Context f57377a;

    /* renamed from: b  reason: collision with root package name */
    public final String f57378b;

    /* renamed from: c  reason: collision with root package name */
    public final String f57379c;

    /* renamed from: d  reason: collision with root package name */
    final List<String> f57380d;

    /* renamed from: e  reason: collision with root package name */
    public final SnapKitInitType f57381e;

    /* renamed from: f  reason: collision with root package name */
    public final KitPluginType f57382f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f57383g;

    /* renamed from: h  reason: collision with root package name */
    final String f57384h;

    static {
        Covode.recordClassIndex(35862);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        r1 = new com.snapchat.kit.sdk.core.security.InsecureEncryptDecrypt();
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ExcHandler: p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:8:0x0026] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.snapchat.kit.sdk.core.security.SecureSharedPreferences a(com.google.gson.f r8, android.content.SharedPreferences r9) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.n.a(com.google.gson.f, android.content.SharedPreferences):com.snapchat.kit.sdk.core.security.SecureSharedPreferences");
    }

    n(Context context, String str, String str2, List<String> list, SnapKitInitType snapKitInitType, KitPluginType kitPluginType, boolean z, String str3) {
        this.f57377a = context;
        this.f57378b = str;
        this.f57379c = str2;
        this.f57380d = list;
        this.f57381e = snapKitInitType;
        this.f57382f = kitPluginType;
        this.f57383g = z;
        this.f57384h = str3;
    }
}
