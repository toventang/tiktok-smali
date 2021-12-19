package com.bytedance.android.livesdk.ai;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class c {

    /* renamed from: g  reason: collision with root package name */
    public static final h f13745g = i.a((h.f.a.a) C0289c.f13754a);

    /* renamed from: h  reason: collision with root package name */
    public static final b f13746h = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f13747a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13748b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13749c;

    /* renamed from: d  reason: collision with root package name */
    public long f13750d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f13751e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13752f;

    public enum a {
        LIVE_END,
        BACK_APP,
        BLOCK_USER,
        CLOSE_MINI_WINDOW;

        static {
            Covode.recordClassIndex(7651);
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(7652);
        }

        public static c a() {
            return (c) c.f13745g.getValue();
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ai.c$c  reason: collision with other inner class name */
    static final class C0289c extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0289c f13754a = new C0289c();

        static {
            Covode.recordClassIndex(7653);
        }

        C0289c() {
            super(0);
        }

        /* renamed from: com.bytedance.android.livesdk.ai.c$c$a */
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public boolean f13755a = true;

            static {
                Covode.recordClassIndex(7654);
            }

            @Override // com.bytedance.android.livesdk.ai.b
            public final void a(Activity activity) {
                l.d(activity, "");
            }

            @Override // com.bytedance.android.livesdk.ai.b
            public final void a(Activity activity, Bundle bundle) {
                l.d(activity, "");
                l.d(bundle, "");
            }

            @Override // com.bytedance.android.livesdk.ai.b
            public final void b(Activity activity) {
                l.d(activity, "");
            }

            @Override // com.bytedance.android.livesdk.ai.b
            public final void d(Activity activity) {
                l.d(activity, "");
            }

            @Override // com.bytedance.android.livesdk.ai.b
            public final void e(Activity activity) {
                l.d(activity, "");
            }

            a() {
            }

            @Override // com.bytedance.android.livesdk.ai.b
            public final void f(Activity activity) {
                l.d(activity, "");
                if (b.a().f13752f) {
                    b.a().a(a.CLOSE_MINI_WINDOW, "mini_window");
                }
                b.a().f13749c = false;
            }

            @Override // com.bytedance.android.livesdk.ai.b
            public final void c(Activity activity) {
                String str;
                l.d(activity, "");
                if (!b.a().f13751e) {
                    this.f13755a = true;
                    c a2 = b.a();
                    a aVar = a.BACK_APP;
                    if (b.a().f13752f) {
                        str = "mini_window";
                    } else {
                        str = "voice_only";
                    }
                    a2.a(aVar, str);
                }
            }

            @Override // com.bytedance.android.livesdk.ai.b
            public final void a(Context context, Intent intent) {
                Class<?> cls;
                l.d(intent, "");
                if (!b.a().f13751e) {
                    b.a().f13749c = true;
                    if (context instanceof Activity) {
                        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostApp.class);
                        l.b(a2, "");
                        List<Class> liveActivityClass = ((IHostApp) a2).getLiveActivityClass();
                        l.b(liveActivityClass, "");
                        Iterator<T> it = liveActivityClass.iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            if (l.a((Object) context.getClass(), (Object) it.next())) {
                                z = true;
                            }
                        }
                        if (a.b()) {
                            if (z && !((Activity) context).isInPictureInPictureMode()) {
                                b.a().f13747a = true;
                            }
                            if (this.f13755a) {
                                this.f13755a = false;
                                b.a().a("mini_window");
                            }
                        } else if (this.f13755a) {
                            this.f13755a = false;
                            b.a().a("voice_only");
                        }
                    } else {
                        com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(IHostApp.class);
                        l.b(a3, "");
                        List<Class> liveActivityClass2 = ((IHostApp) a3).getLiveActivityClass();
                        com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(IHostApp.class);
                        l.b(a4, "");
                        Activity topActivity = ((IHostApp) a4).getTopActivity();
                        l.b(liveActivityClass2, "");
                        boolean z2 = false;
                        for (T t : liveActivityClass2) {
                            if (topActivity != null) {
                                cls = topActivity.getClass();
                            } else {
                                cls = null;
                            }
                            if (l.a((Object) cls, (Object) t)) {
                                z2 = true;
                            }
                        }
                        if (a.b()) {
                            if (z2) {
                                l.b(topActivity, "");
                                if (!topActivity.isInPictureInPictureMode()) {
                                    b.a().f13747a = true;
                                }
                            }
                            if (this.f13755a) {
                                this.f13755a = false;
                                b.a().a("mini_window");
                            }
                        } else if (this.f13755a) {
                            this.f13755a = false;
                            b.a().a("voice_only");
                        }
                    }
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            Context e2 = y.e();
            l.b(e2, "");
            ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).registerLifeCycleCallback(new e(e2, new a()));
            return new c();
        }
    }

    static {
        Covode.recordClassIndex(7650);
    }

    public final void a(String str) {
        l.d(str, "");
        if (!this.f13748b) {
            this.f13749c = true;
            this.f13750d = SystemClock.elapsedRealtime();
            b.a.a("livesdk_live_exit_backgroud").a().a("backstage_type", str).b();
        }
    }

    public final void a(a aVar, String str) {
        l.d(aVar, "");
        l.d(str, "");
        if (this.f13749c) {
            this.f13749c = false;
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_live_backstage_watch_duration").a().a("backstage_type", str);
            String name = aVar.name();
            Locale locale = Locale.US;
            l.b(locale, "");
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase(locale);
            l.b(lowerCase, "");
            a2.a("end_type", lowerCase).a("duration", SystemClock.elapsedRealtime() - this.f13750d).b();
        }
    }
}
