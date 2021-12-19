package com.bytedance.android.livesdk.browser;

import android.view.View;
import com.bytedance.android.live.b.l;
import com.bytedance.android.livesdk.bj;
import com.bytedance.android.livesdk.container.k.c;
import com.bytedance.android.livesdk.lynx.lynxcard.e;
import com.bytedance.android.livesdk.lynx.lynxcard.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class g implements l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14416b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, View> f14417a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(7988);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(7989);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final g f14420a = new g();

        /* renamed from: b  reason: collision with root package name */
        public static final b f14421b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(7990);
        }
    }

    @Override // com.bytedance.android.live.b.l
    public final void a(e eVar) {
        h.f.b.l.d(eVar, "");
        DataChannelGlobal.f34575d.c(com.bytedance.android.livesdk.a.class, eVar);
    }

    public final View a(String str) {
        h.f.b.l.d(str, "");
        View view = this.f14417a.get(str);
        if (view != null) {
            return (c) view;
        }
        return null;
    }

    public final void a(View view) {
        h.f.b.l.d(view, "");
        for (Map.Entry<String, View> entry : this.f14417a.entrySet()) {
            if (h.f.b.l.a(entry.getValue(), view)) {
                this.f14417a.remove(entry.getKey());
            }
        }
    }

    @Override // com.bytedance.android.live.b.l
    public final void a(h hVar) {
        h.f.b.l.d(hVar, "");
        DataChannelGlobal.f34575d.c(bj.class, hVar);
    }
}
