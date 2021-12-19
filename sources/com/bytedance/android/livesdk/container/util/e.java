package com.bytedance.android.livesdk.container.util;

import android.graphics.Typeface;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.text.r;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f16892a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(9382);
    }

    public static final class a implements r.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16893a = new a();

        static {
            Covode.recordClassIndex(9383);
        }

        a() {
        }

        @Override // com.lynx.tasm.behavior.shadow.text.r.a
        public final Typeface a(String str, int i2) {
            if (l.a((Object) str, (Object) "live_font")) {
                return ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).getHostTypeface(i2);
            }
            return null;
        }
    }
}
