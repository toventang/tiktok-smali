package com.ss.android.ugc.aweme.ug.g;

import android.content.Context;
import android.os.RemoteException;
import b.i;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.dq;
import com.ss.android.ugc.aweme.utils.fz;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f141841a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(92703);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.g.a$a  reason: collision with other inner class name */
    public static final class CallableC3774a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f141842a;

        static {
            Covode.recordClassIndex(92704);
        }

        public CallableC3774a(Context context) {
            this.f141842a = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            final InstallReferrerClient a2 = InstallReferrerClient.a(this.f141842a).a();
            a2.a(new InstallReferrerStateListener(this) {
                /* class com.ss.android.ugc.aweme.ug.g.a.CallableC3774a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ CallableC3774a f141843a;

                static {
                    Covode.recordClassIndex(92705);
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerServiceDisconnected() {
                }

                /* renamed from: com.ss.android.ugc.aweme.ug.g.a$a$1$a  reason: collision with other inner class name */
                static final class CallableC3775a<V> implements Callable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f141845a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ int f141846b;

                    static {
                        Covode.recordClassIndex(92706);
                    }

                    CallableC3775a(AnonymousClass1 r1, int i2) {
                        this.f141845a = r1;
                        this.f141846b = i2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        if (this.f141846b == 0) {
                            try {
                                InstallReferrerClient installReferrerClient = a2;
                                l.b(installReferrerClient, "");
                                String a2 = installReferrerClient.c().a();
                                a.a(a2);
                                fz.a(a2);
                                dq.a(a2);
                                a.b(this.f141845a.f141843a.f141842a);
                                a2.b();
                            } catch (RemoteException e2) {
                                e2.printStackTrace();
                            }
                        }
                        return z.f158842a;
                    }
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerSetupFinished(int i2) {
                    i.b(new CallableC3775a(this, i2), i.f4824a);
                }

                {
                    this.f141843a = r1;
                }
            });
            return z.f158842a;
        }
    }

    public static void a(String str) {
        if (str != null && p.a((CharSequence) str, (CharSequence) "utm_source=tt_wallpaper", false)) {
            r.onEventV3("app_install_from_wallpaper");
        }
    }

    public static void b(Context context) {
        l.d(context, "");
        d.a(context, "preinsatll_appflyer", 0).edit().putBoolean("checkedInstallReferrer", true).apply();
    }

    public static boolean a(Context context) {
        l.d(context, "");
        return d.a(context, "preinsatll_appflyer", 0).getBoolean("checkedInstallReferrer", false);
    }
}
