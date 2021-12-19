package com.ss.android.ugc.aweme.push.downgrade;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.push.downgrade.notice.MainProcessWsChannelService;
import java.util.List;

public class OptimizePushProcessImpl implements a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f118875a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f118876b;

    static {
        Covode.recordClassIndex(77225);
    }

    public static class StartPushProcessTask implements w {
        static {
            Covode.recordClassIndex(77226);
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
            return ae.BACKGROUND;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            if (!d.f118881b.booleanValue() || Build.VERSION.SDK_INT >= 26) {
                com.ss.android.di.push.a.a().startPushProcess(context);
            } else {
                Intent intent = new Intent("com.ss.android.message.action.PUSH_SERVICE");
                intent.setPackage(context.getPackageName());
                a(context, intent);
            }
            com.ss.android.di.push.a.a().removeRedBadge(context);
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl.StartPushProcessTask.a(android.content.Context, android.content.Intent):android.content.ComponentName");
        }
    }

    private static boolean a() {
        if (!f.f34637l || s.a().booleanValue()) {
            return true;
        }
        return false;
    }

    public static class a implements f.a.d.f<Boolean> {
        static {
            Covode.recordClassIndex(77227);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Boolean bool) {
            if (bool.booleanValue() && !OptimizePushProcessImpl.f118876b) {
                OptimizePushProcessImpl.f118876b = true;
                h.f118886a = true;
                new f.c().b((w) new StartPushProcessTask()).a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.push.downgrade.a
    public final boolean a(Context context, Intent intent) {
        boolean z;
        ComponentName component;
        MethodCollector.i(7387);
        Log.getStackTraceString(new RuntimeException("Intent:" + intent.toUri(0)));
        if (context == null || (component = intent.getComponent()) == null || !TextUtils.equals(context.getPackageName(), component.getPackageName()) || !TextUtils.equals(component.getClassName(), WsChannelService.class.getName())) {
            if (a() && e.a(context) && !h.c(context)) {
                ComponentName component2 = intent.getComponent();
                if (component2 == null) {
                    z = f.a(context, intent);
                } else if (TextUtils.equals(context.getPackageName(), component2.getPackageName())) {
                    if (!f.f118884a) {
                        synchronized (f.class) {
                            try {
                                if (!f.f118884a) {
                                    f.a(context);
                                    f.f118884a = true;
                                }
                            } catch (Throwable th) {
                                MethodCollector.o(7387);
                                throw th;
                            }
                        }
                    }
                    if (!f.f118885b.isEmpty()) {
                        z = f.f118885b.contains(component2.getClassName());
                    } else {
                        z = f.a(context, intent);
                    }
                }
                if (z) {
                    if (!f118875a) {
                        synchronized (OptimizePushProcessImpl.class) {
                            try {
                                if (!f118875a) {
                                    f118875a = true;
                                    com.bytedance.ies.ugc.appcontext.f.g().d(new a());
                                }
                            } finally {
                                MethodCollector.o(7387);
                            }
                        }
                    }
                    return true;
                }
            }
        } else if (i.f118891a || (a() && e.a(context) && !h.c(context))) {
            i.f118891a = true;
            intent.setComponent(new ComponentName(context, MainProcessWsChannelService.class));
        }
        MethodCollector.o(7387);
        return false;
    }
}
