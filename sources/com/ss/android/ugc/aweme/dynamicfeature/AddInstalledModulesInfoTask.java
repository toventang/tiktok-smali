package com.ss.android.ugc.aweme.dynamicfeature;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import h.a.ag;
import h.a.i;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.v;
import java.util.List;
import java.util.Map;

public final class AddInstalledModulesInfoTask implements w {
    static {
        Covode.recordClassIndex(52490);
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

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f84174a;

        static {
            Covode.recordClassIndex(52491);
        }

        a(Context context) {
            this.f84174a = context;
        }

        public final void run() {
            Npth.addAttachUserData(new AttachUserData(this) {
                /* class com.ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f84175a;

                static {
                    Covode.recordClassIndex(52492);
                }

                {
                    this.f84175a = r1;
                }

                @Override // com.bytedance.crash.AttachUserData
                public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                    String str;
                    ApplicationInfo applicationInfo;
                    IPluginService d2 = AabPluginServiceImpl.d();
                    StringBuilder sb = new StringBuilder("Installed by Morpheus: ");
                    String str2 = null;
                    if (d2 != null) {
                        str = n.a(d2.a(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 63);
                    } else {
                        str = null;
                    }
                    String sb2 = sb.append(str).toString();
                    StringBuilder sb3 = new StringBuilder("Fused: ");
                    PackageManager packageManager = this.f84175a.f84174a.getPackageManager();
                    String packageName = this.f84175a.f84174a.getPackageName();
                    if (TextUtils.equals(packageName, d.a().getPackageName())) {
                        if (com.ss.android.ugc.aweme.lancet.c.b.f107191a == null) {
                            com.ss.android.ugc.aweme.lancet.c.b.f107191a = packageManager.getApplicationInfo(packageName, 128);
                        }
                        applicationInfo = com.ss.android.ugc.aweme.lancet.c.b.f107191a;
                    } else {
                        applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                    }
                    String sb4 = sb3.append(applicationInfo.metaData.getString("com.android.dynamic.apk.fused.modules")).toString();
                    StringBuilder sb5 = new StringBuilder("Split modules: ");
                    try {
                        String[] strArr = this.f84175a.f84174a.getApplicationInfo().splitNames;
                        if (strArr != null) {
                            str2 = i.a(strArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 63);
                        }
                    } catch (Throwable unused) {
                        str2 = "[NOT SUPPORT]";
                    }
                    return ag.a(v.a("Installed_Dynamic_Features", n.a(n.b(sb2, sb4, sb5.append(str2).toString()), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62)));
                }
            }, CrashType.ALL);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        if (Build.VERSION.SDK_INT >= 21) {
            e.a(new a(context));
        }
    }
}
