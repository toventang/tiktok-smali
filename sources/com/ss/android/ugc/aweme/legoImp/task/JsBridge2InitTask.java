package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.i;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.web.jsbridge2.ak;
import com.bytedance.ies.web.jsbridge2.n;
import com.bytedance.ies.web.jsbridge2.x;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.crossplatform.CrossPlatformServiceImpl;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.lego.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.zip.ZipInputStream;

public class JsBridge2InitTask implements a, w {

    /* renamed from: a  reason: collision with root package name */
    public ae f107806a;

    interface NetRequest {
        static {
            Covode.recordClassIndex(69041);
        }

        @t
        b<String> postBody(@ag String str, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list);
    }

    static {
        Covode.recordClassIndex(69035);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final int d() {
        return 1;
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
        return this.f107806a;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        if (z.c()) {
            return ac.IO;
        }
        return ac.CPU;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f107815a;

        static {
            Covode.recordClassIndex(69040);
            int[] iArr = new int[ak.values().length];
            f107815a = iArr;
            try {
                iArr[ak.XSS_CALLBACK_ID_SWITCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public JsBridge2InitTask(ae aeVar) {
        this.f107806a = aeVar;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(final Context context) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            if (c.f99077a.f99078b.getUseBridgeEngineV2().booleanValue()) {
                a(context, currentTimeMillis);
                return;
            }
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
        }
        if (this.f107806a == ae.BOOT_FINISH) {
            SettingsManager.a().a(new i() {
                /* class com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(69036);
                }

                @Override // com.bytedance.ies.abmock.i
                public final void a() {
                    g.b().execute(new l(this, context, currentTimeMillis));
                }
            });
        }
    }

    public final void a(final Context context, long j2) {
        boolean z;
        if (this.f107806a == ae.BOOT_FINISH) {
            z = true;
        } else {
            z = false;
        }
        final ExecutorService b2 = g.b();
        com.bytedance.ies.web.jsbridge2.x.a(z, new n() {
            /* class com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask.AnonymousClass2 */

            static {
                Covode.recordClassIndex(69037);
            }

            @Override // com.bytedance.ies.web.jsbridge2.n
            public final String j() {
                return "https://jsb-va.tiktokv.com/src/server/v2/package";
            }

            @Override // com.bytedance.ies.web.jsbridge2.n
            public final n.e a() {
                return n.e.US;
            }

            @Override // com.bytedance.ies.web.jsbridge2.n
            public final int b() {
                return d.n;
            }

            @Override // com.bytedance.ies.web.jsbridge2.n
            public final Executor i() {
                return b2;
            }

            @Override // com.bytedance.ies.web.jsbridge2.n
            public final String d() {
                return d.f();
            }

            @Override // com.bytedance.ies.web.jsbridge2.n
            public final String e() {
                return AppLog.getServerDeviceId();
            }

            @Override // com.bytedance.ies.web.jsbridge2.n
            public final n.a h() {
                return new n.a() {
                    /* class com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(69038);
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.n.a
                    public final String a(String str, String str2) {
                        return null;
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.n.a
                    public final void b(String str, String str2) {
                        Keva.getRepo("jsbridge2-permission", 1).storeString(str, str2);
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.n.a
                    public final void a(String str, n.a.AbstractC0809a aVar) {
                        aVar.a(Keva.getRepo("jsbridge2-permission", 1).getString(str, ""));
                    }
                };
            }

            @Override // com.bytedance.ies.web.jsbridge2.n
            public final String f() {
                return CrossPlatformServiceImpl.c().b();
            }

            @Override // com.bytedance.ies.web.jsbridge2.n
            public final Collection<String> g() {
                LinkedList linkedList = new LinkedList();
                linkedList.add("webcast");
                return linkedList;
            }

            @Override // com.bytedance.ies.web.jsbridge2.n
            public final String c() {
                MethodCollector.i(5901);
                try {
                    StringBuilder sb = new StringBuilder();
                    ZipInputStream zipInputStream = new ZipInputStream(context.getAssets().open("jsb_whitelist.zip"));
                    if (zipInputStream.getNextEntry() != null) {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = zipInputStream.read(bArr, 0, 1024);
                            if (read < 0) {
                                break;
                            }
                            sb.append(new String(bArr, 0, read));
                        }
                    }
                    zipInputStream.close();
                    String sb2 = sb.toString();
                    MethodCollector.o(5901);
                    return sb2;
                } catch (IOException unused) {
                    MethodCollector.o(5901);
                    return null;
                }
            }

            @Override // com.bytedance.ies.web.jsbridge2.n
            public final void a(String str, String str2, byte[] bArr, n.b bVar) {
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new com.bytedance.retrofit2.client.b("ContentType", str2));
                    bVar.a(((NetRequest) RetrofitUtils.a(str, NetRequest.class)).postBody(str, new TypedByteArray(null, bArr, new String[0]), arrayList).execute().f42630b);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    bVar.a(e2);
                }
            }
        }, new k(z, j2), new x.a() {
            /* class com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask.AnonymousClass3 */

            static {
                Covode.recordClassIndex(69039);
            }

            @Override // com.bytedance.ies.web.jsbridge2.x.a
            public final boolean a(ak akVar) {
                if (AnonymousClass4.f107815a[akVar.ordinal()] != 1) {
                    return false;
                }
                return com.ss.android.ugc.aweme.settings.t.a().f123130a;
            }
        });
    }
}
