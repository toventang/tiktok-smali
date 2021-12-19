package com.bytedance.sdk.a.k.b.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.k.a.b;
import com.bytedance.sdk.a.k.c.c;
import java.util.Collections;
import net.openid.appauth.d;
import net.openid.appauth.e;
import net.openid.appauth.g;
import net.openid.appauth.h;
import net.openid.appauth.i;
import net.openid.appauth.p;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public i f43375a;

    /* renamed from: b  reason: collision with root package name */
    private String f43376b;

    static {
        Covode.recordClassIndex(26579);
    }

    /* renamed from: com.bytedance.sdk.a.k.b.a.a$a  reason: collision with other inner class name */
    static class C1047a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        com.bytedance.sdk.a.k.c.b f43378a;

        /* renamed from: b  reason: collision with root package name */
        Context f43379b;

        /* renamed from: c  reason: collision with root package name */
        h f43380c;

        static {
            Covode.recordClassIndex(26581);
        }

        @Override // com.bytedance.sdk.a.k.a.b.a
        public final void a() {
            if (this.f43378a != null) {
                this.f43378a = null;
            }
            if (this.f43379b != null) {
                this.f43379b = null;
            }
            h hVar = this.f43380c;
            if (hVar != null && !hVar.f159681d) {
                hVar.f159679b.a();
                hVar.f159681d = true;
            }
        }

        @Override // com.bytedance.sdk.a.k.c.a
        public final void a(int i2, Intent intent) {
            if (i2 != 100) {
                return;
            }
            if (intent == null) {
                try {
                    com.bytedance.sdk.a.k.c.b bVar = this.f43378a;
                    if (bVar != null) {
                        bVar.a(new c("activity result null"));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    com.bytedance.sdk.a.k.c.b bVar2 = this.f43378a;
                    if (bVar2 != null) {
                        bVar2.a(new c(e2.getMessage()));
                    }
                }
            } else {
                g a2 = g.a(intent);
                e fromIntent = e.fromIntent(intent);
                final d dVar = new d(a2, fromIntent);
                if (a2 != null) {
                    if (this.f43379b == null) {
                        com.bytedance.sdk.a.k.c.b bVar3 = this.f43378a;
                        if (bVar3 != null) {
                            bVar3.a(new c("context null"));
                            return;
                        }
                        return;
                    }
                    this.f43380c.a(a2.a(Collections.emptyMap()), new h.b() {
                        /* class com.bytedance.sdk.a.k.b.a.a.C1047a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(26582);
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
                        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0  */
                        @Override // net.openid.appauth.h.b
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void a(net.openid.appauth.s r8, net.openid.appauth.e r9) {
                            /*
                            // Method dump skipped, instructions count: 218
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.a.k.b.a.a.C1047a.AnonymousClass1.a(net.openid.appauth.s, net.openid.appauth.e):void");
                        }
                    });
                } else if (fromIntent != null) {
                    c cVar = new c(fromIntent.code, fromIntent.error, fromIntent.errorDescription);
                    if (fromIntent.code == e.b.f159618c.code) {
                        cVar.f43388b = true;
                    }
                    com.bytedance.sdk.a.k.c.b bVar4 = this.f43378a;
                    if (bVar4 != null) {
                        bVar4.a(cVar);
                    }
                } else {
                    com.bytedance.sdk.a.k.c.b bVar5 = this.f43378a;
                    if (bVar5 != null) {
                        bVar5.a(new c("response null"));
                    }
                }
            }
        }

        private C1047a(Context context, h hVar, com.bytedance.sdk.a.k.c.b bVar) {
            this.f43379b = context;
            this.f43380c = hVar;
            this.f43378a = bVar;
        }

        static void a(Bundle bundle, String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(str, str2);
            }
        }

        /* synthetic */ C1047a(Context context, h hVar, com.bytedance.sdk.a.k.c.b bVar, byte b2) {
            this(context, hVar, bVar);
        }
    }

    private static Context a(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public a(String str, String str2) {
        try {
            this.f43376b = str2;
            if (!TextUtils.isEmpty(str) && Patterns.WEB_URL.matcher(str2).matches()) {
                Uri parse = Uri.parse(str);
                AnonymousClass1 r4 = new i.b() {
                    /* class com.bytedance.sdk.a.k.b.a.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(26580);
                    }

                    @Override // net.openid.appauth.i.b
                    public final void a(i iVar, e eVar) {
                        if (eVar == null) {
                            a.this.f43375a = iVar;
                        } else {
                            eVar.printStackTrace();
                        }
                    }
                };
                Uri build = parse.buildUpon().appendPath(".well-known").appendPath("openid-configuration").build();
                net.openid.appauth.b.b bVar = net.openid.appauth.b.b.f159590a;
                p.a(build, "openIDConnectDiscoveryUri cannot be null");
                p.a(r4, "callback cannot be null");
                p.a(bVar, "connectionBuilder must not be null");
                new i.a(build, bVar, r4).execute(new Void[0]);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public a(String str, String str2, String str3) {
        try {
            this.f43376b = str3;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Patterns.WEB_URL.matcher(str).matches() && Patterns.WEB_URL.matcher(str2).matches()) {
                this.f43375a = new i(Uri.parse(str), Uri.parse(str2));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        if (r7.f43396c.equals(r3) != false) goto L_0x005f;
     */
    @Override // com.bytedance.sdk.a.k.a.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.sdk.a.k.a.b.a a(android.app.Activity r6, com.bytedance.sdk.a.k.c.f r7, com.bytedance.sdk.a.k.c.b r8) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.a.k.b.a.a.a(android.app.Activity, com.bytedance.sdk.a.k.c.f, com.bytedance.sdk.a.k.c.b):com.bytedance.sdk.a.k.a.b$a");
    }
}
