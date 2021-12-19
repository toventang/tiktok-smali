package com.ss.android.ugc.aweme.homepage.story.container;

import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class b {

    /* renamed from: g  reason: collision with root package name */
    public static final a f99295g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f99296a;

    /* renamed from: b  reason: collision with root package name */
    public String f99297b;

    /* renamed from: c  reason: collision with root package name */
    public String f99298c;

    /* renamed from: d  reason: collision with root package name */
    public String f99299d;

    /* renamed from: e  reason: collision with root package name */
    public long f99300e;

    /* renamed from: f  reason: collision with root package name */
    public final m<EnumC2428b, String, z> f99301f;

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.b$b  reason: collision with other inner class name */
    public enum EnumC2428b {
        EnterFrom,
        EnterMethod;

        static {
            Covode.recordClassIndex(63258);
        }
    }

    static {
        Covode.recordClassIndex(63256);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63257);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ b() {
        this(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.homepage.story.container.b$b, ? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(m<? super EnumC2428b, ? super String, z> mVar) {
        this.f99301f = mVar;
        this.f99296a = "homepage_hot";
        this.f99297b = "";
        this.f99298c = "";
        this.f99299d = "";
    }

    public final void a(String str) {
        l.d(str, "");
        if (l.a((Object) str, (Object) "click_upper_left_camera") || l.a((Object) str, (Object) "slide_right") || l.a((Object) str, (Object) "click_westwindow_camera")) {
            this.f99297b = str;
        }
    }

    public final void b(String str) {
        l.d(str, "");
        if (l.a((Object) str, (Object) "click") || l.a((Object) str, (Object) "slide") || l.a((Object) str, (Object) "auto") || l.a((Object) str, (Object) "publish")) {
            this.f99298c = str;
            m<EnumC2428b, String, z> mVar = this.f99301f;
            if (mVar != null) {
                mVar.invoke(EnumC2428b.EnterMethod, str);
            }
        }
    }

    public final void c(String str) {
        l.d(str, "");
        if (l.a((Object) str, (Object) "click") || l.a((Object) str, (Object) "slide_left") || l.a((Object) str, (Object) "slide_up") || l.a((Object) str, (Object) "slide_down") || l.a((Object) str, (Object) "shoot") || l.a((Object) str, (Object) "close_publish")) {
            this.f99299d = str;
        }
    }
}
