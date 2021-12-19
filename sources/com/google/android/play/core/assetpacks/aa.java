package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.google.android.play.core.b.au;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.cd;
import com.google.android.play.core.b.cg;
import java.util.Arrays;

final class aa extends cd {

    /* renamed from: a  reason: collision with root package name */
    private final b f52763a = new b("AssetPackExtractionService");

    /* renamed from: b  reason: collision with root package name */
    private final Context f52764b;

    /* renamed from: c  reason: collision with root package name */
    private final AssetPackExtractionService f52765c;

    /* renamed from: d  reason: collision with root package name */
    private final ac f52766d;

    static {
        Covode.recordClassIndex(32666);
    }

    aa(Context context, AssetPackExtractionService assetPackExtractionService, ac acVar) {
        this.f52764b = context;
        this.f52765c = assetPackExtractionService;
        this.f52766d = acVar;
    }

    @Override // com.google.android.play.core.b.ce
    public final void a(Bundle bundle, cg cgVar) {
        Object[] packagesForUid;
        this.f52763a.a("updateServiceState AIDL call", new Object[0]);
        if (au.a(this.f52764b)) {
            PackageManager packageManager = this.f52764b.getPackageManager();
            int callingUid = Binder.getCallingUid();
            Pair<Boolean, Object> a2 = a.a(packageManager, new Object[]{Integer.valueOf(callingUid)}, 101310, "java.lang.String[]", false, null);
            if (((Boolean) a2.first).booleanValue()) {
                packagesForUid = (Object[]) a2.second;
            } else {
                packagesForUid = packageManager.getPackagesForUid(callingUid);
                a.a(packagesForUid, packageManager, new Object[]{Integer.valueOf(callingUid)}, 101310, "com_google_android_play_core_assetpacks_b_android_content_pm_PackageManager_getPackagesForUid(Landroid/content/pm/PackageManager;I)[Ljava/lang/String;");
            }
            if (packagesForUid != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
                cgVar.a(this.f52765c.a(bundle), new Bundle());
                return;
            }
        }
        cgVar.a(new Bundle());
        this.f52765c.a();
    }

    @Override // com.google.android.play.core.b.ce
    public final void a(cg cgVar) {
        ac.c(this.f52766d.c());
        cgVar.b(new Bundle());
    }
}
