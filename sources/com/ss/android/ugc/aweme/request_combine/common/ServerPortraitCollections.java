package com.ss.android.ugc.aweme.request_combine.common;

import android.content.Context;
import android.content.SharedPreferences;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.l;
import com.google.gson.o;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.request_combine.PortraitCombineModel;
import com.ss.android.ugc.aweme.request_combine.c.b;
import com.ss.android.ugc.aweme.requestcombine.IServerPortraitService;
import java.util.List;

public class ServerPortraitCollections implements IServerPortraitService {

    /* renamed from: a  reason: collision with root package name */
    private volatile o f120619a;

    /* renamed from: b  reason: collision with root package name */
    private volatile o f120620b;

    static {
        Covode.recordClassIndex(78534);
    }

    /* access modifiers changed from: package-private */
    public class PortraitRequestTask implements w {
        static {
            Covode.recordClassIndex(78537);
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

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        private PortraitRequestTask() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            a.a("PortraitRequestTask");
            try {
                ServerPortraitCollections.this.a(UserPortraitApi.a("bitrate_selection"));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        /* synthetic */ PortraitRequestTask(ServerPortraitCollections serverPortraitCollections, byte b2) {
            this();
        }
    }

    public ServerPortraitCollections() {
        if (b.a.f120618a) {
            i.b(new a(this), i.f4824a);
            ColdLaunchRequestCombinerImpl.b().a(new com.ss.android.ugc.aweme.requestcombine.a() {
                /* class com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(78535);
                }

                @Override // com.ss.android.ugc.aweme.requestcombine.a
                public final void a() {
                    ServerPortraitCollections serverPortraitCollections = ServerPortraitCollections.this;
                    if (ColdLaunchRequestCombinerImpl.b().a()) {
                        PortraitCombineModel portraitCombineModel = (PortraitCombineModel) ColdLaunchRequestCombinerImpl.b().a("/tiktok/v1/efficiency_portrait/");
                        if (portraitCombineModel != null) {
                            if (portraitCombineModel.httpCode == 200 && portraitCombineModel.getPortraitData() != null) {
                                serverPortraitCollections.a(portraitCombineModel.getPortraitData());
                                return;
                            } else if (portraitCombineModel.httpCode == 509) {
                                return;
                            }
                        }
                        serverPortraitCollections.b();
                        return;
                    }
                    serverPortraitCollections.b();
                }

                @Override // com.ss.android.ugc.aweme.requestcombine.a
                public final void a(Throwable th) {
                    ServerPortraitCollections.this.b();
                }
            });
        }
    }

    public final void b() {
        new f.c().b((w) new PortraitRequestTask(this, (byte) 0)).a();
    }

    public static IServerPortraitService d() {
        MethodCollector.i(2499);
        Object a2 = com.ss.android.ugc.b.a(IServerPortraitService.class, false);
        if (a2 != null) {
            IServerPortraitService iServerPortraitService = (IServerPortraitService) a2;
            MethodCollector.o(2499);
            return iServerPortraitService;
        }
        if (com.ss.android.ugc.b.dg == null) {
            synchronized (IServerPortraitService.class) {
                try {
                    if (com.ss.android.ugc.b.dg == null) {
                        com.ss.android.ugc.b.dg = new ServerPortraitCollections();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2499);
                    throw th;
                }
            }
        }
        ServerPortraitCollections serverPortraitCollections = (ServerPortraitCollections) com.ss.android.ugc.b.dg;
        MethodCollector.o(2499);
        return serverPortraitCollections;
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IServerPortraitService
    public final o a() {
        if (this.f120619a != null && this.f120619a.f54898a.size() > 0) {
            return this.f120619a;
        }
        if (this.f120620b == null || this.f120620b.f54898a.size() <= 0) {
            return null;
        }
        return this.f120620b;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c() {
        try {
            if (this.f120620b == null) {
                this.f120620b = (o) new com.google.gson.f().a(d.a(com.bytedance.ies.ugc.appcontext.d.a(), "user_portraits_sp", 0).getString("user_portraits_sp", null), new com.google.gson.b.a<o>() {
                    /* class com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(78536);
                    }
                }.type);
            }
        } catch (Throwable th) {
            com.bytedance.c.a.a.a.b.a(th, "UserPortraitManagerinitConfig error!");
        }
        return null;
    }

    public final synchronized void a(o oVar) {
        MethodCollector.i(2495);
        if (oVar == null) {
            MethodCollector.o(2495);
            return;
        }
        try {
            this.f120619a = oVar;
            o oVar2 = this.f120619a;
            SharedPreferences a2 = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "user_portraits_sp", 0);
            a2.edit().putString("user_portraits_sp", new com.google.gson.f().a((l) oVar2)).apply();
            MethodCollector.o(2495);
        } catch (Exception e2) {
            a.a("", e2);
            MethodCollector.o(2495);
        }
    }
}
