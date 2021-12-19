package com.bytedance.ies.ugc.aweme.commercialize.scene.impl.d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.c;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.Objects;

public final class a implements com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34720a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static b f34721b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f34722c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f34723d = a.class.getSimpleName();

    private a() {
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final boolean a(Aweme aweme, Context context, int i2) {
        b bVar;
        if (aweme == null || context == null || !aweme.isAd() || (bVar = f34721b) == null) {
            return false;
        }
        return bVar.a(aweme, context, i2);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void a(Aweme aweme, Context context, boolean z, boolean z2) {
        b bVar;
        f34722c = false;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f34721b) != null) {
            bVar.a(aweme, context, z, z2);
        }
    }

    private static boolean a() {
        if (!f34722c) {
            return false;
        }
        f34722c = false;
        return true;
    }

    static {
        Covode.recordClassIndex(20814);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void a(Context context) {
        b bVar = f34721b;
        if (bVar != null) {
            bVar.a(context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.a
    public final void a(c cVar) {
        l.d(cVar, "");
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.b bVar = cVar.f34651b;
        Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.video.IVideoAdSceneCallback");
        f34721b = (b) bVar;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void b(Aweme aweme, Context context) {
        b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f34721b) != null) {
            bVar.b(aweme, context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void c(Aweme aweme, Context context) {
        b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f34721b) != null) {
            bVar.d(aweme, context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void d(Aweme aweme, Context context) {
        b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f34721b) != null) {
            bVar.e(aweme, context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void e(Aweme aweme, Context context) {
        b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f34721b) != null) {
            bVar.f(aweme, context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void f(Aweme aweme, Context context) {
        b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f34721b) != null) {
            bVar.g(aweme, context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void a(Aweme aweme, Context context) {
        b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f34721b) != null) {
            bVar.a(aweme, context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void a(Aweme aweme, Context context, com.ss.android.ugc.aweme.commercialize.d.b bVar) {
        b bVar2;
        if (aweme != null && context != null && aweme.isAd() && (bVar2 = f34721b) != null) {
            bVar2.a(aweme, context, bVar);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void a(Aweme aweme, Context context, boolean z) {
        b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f34721b) != null) {
            bVar.a(aweme, context, z);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void a(Aweme aweme, Context context, int i2, int i3) {
        b bVar;
        b bVar2;
        if (aweme != null && context != null && aweme.isAd()) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        f34722c = true;
                        b bVar3 = f34721b;
                        if (bVar3 != null) {
                            bVar3.c(aweme, context);
                        }
                    }
                } else if (!a() && (bVar2 = f34721b) != null) {
                    bVar2.c(aweme, context, i3);
                }
            } else if (!a() && (bVar = f34721b) != null) {
                bVar.b(aweme, context, i3);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void a(Aweme aweme, Context context, long j2, int i2) {
        b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f34721b) != null) {
            bVar.a(aweme, context, j2, i2);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void a(Aweme aweme, Context context, String str, long j2, int i2) {
        b bVar;
        l.d(str, "");
        if (aweme != null && context != null && aweme.isAd() && (bVar = f34721b) != null) {
            bVar.a(aweme, context, str, j2, i2);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a
    public final void a(Aweme aweme, Context context, Aweme aweme2, String str, long j2, int i2, String str2) {
        b bVar;
        if (aweme != null && context != null && (bVar = f34721b) != null) {
            bVar.a(aweme, context, aweme2, str, j2, i2, str2);
        }
    }
}
