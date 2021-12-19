package com.ss.android.ugc.aweme.discover.lynx.delegate;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.discover.lynx.e.b;
import h.f.b.l;
import org.json.JSONObject;

public final class d extends a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f81483c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final LifecycleDelegate f81484d;

    static {
        Covode.recordClassIndex(50640);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50641);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(Context context) {
            l.d(context, "");
            return new b(context);
        }
    }

    public final void d() {
        LynxView lynxView = this.f81477b.f81413d;
        if (lynxView != null) {
            lynxView.onEnterBackground();
        }
        LifecycleDelegate lifecycleDelegate = this.f81484d;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, "recycled");
        lifecycleDelegate.a("pageScroll", jSONObject);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
        LifecycleDelegate lifecycleDelegate = new LifecycleDelegate(bVar);
        this.f81484d = lifecycleDelegate;
        a(new j(bVar));
        a(lifecycleDelegate);
    }
}
