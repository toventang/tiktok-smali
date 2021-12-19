package com.ss.android.ugc.playerkit.videoview.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.player.sdk.api.l;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.session.b;
import com.ss.android.ugc.playerkit.videoview.b.c;
import com.ss.android.ugc.playerkit.videoview.b.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f148919a = new a();

    /* renamed from: b  reason: collision with root package name */
    public c f148920b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.playerkit.videoview.b.a f148921c = new e();

    static {
        Covode.recordClassIndex(98063);
    }

    private a() {
    }

    public final void a(String str) {
        b c2 = c(str);
        if (c2 != null) {
            c2.f148861a = System.currentTimeMillis();
        }
    }

    public final l b(String str) {
        com.ss.android.ugc.playerkit.videoview.b.a aVar = this.f148921c;
        c(str);
        return aVar.a();
    }

    public final b c(String str) {
        MethodCollector.i(3516);
        b bVar = null;
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(3516);
            return null;
        }
        Session b2 = com.ss.android.ugc.playerkit.session.a.f148854a.b(str);
        if (b2 != null) {
            if (b2.state == null) {
                synchronized (this) {
                    try {
                        if (b2.state == null) {
                            bVar = new b();
                            b2.state = bVar;
                        }
                    } finally {
                        MethodCollector.o(3516);
                    }
                }
            } else {
                bVar = b2.state;
            }
        }
        return bVar;
    }

    public final void a(String str, int i2, int i3) {
        b c2 = c(str);
        if (c2 != null) {
            c2.f148862b = i2;
            c2.f148863c = i3;
        }
    }
}
