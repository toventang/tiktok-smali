package com.ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final b f140852a;

    /* renamed from: b  reason: collision with root package name */
    public final a f140853b;

    /* renamed from: c  reason: collision with root package name */
    public final int f140854c;

    /* renamed from: d  reason: collision with root package name */
    public final float f140855d;

    public enum a {
        MAIN_TEMPLATE,
        ICON_LIST;

        static {
            Covode.recordClassIndex(91969);
        }
    }

    public enum b {
        START,
        SCROLL;

        static {
            Covode.recordClassIndex(91970);
        }
    }

    static {
        Covode.recordClassIndex(91968);
    }

    public g(b bVar, a aVar, byte b2) {
        this(bVar, aVar);
    }

    public /* synthetic */ g(b bVar, a aVar) {
        this(bVar, aVar, 0, 0.0f);
    }

    public g(b bVar, a aVar, int i2, float f2) {
        l.d(bVar, "");
        l.d(aVar, "");
        this.f140852a = bVar;
        this.f140853b = aVar;
        this.f140854c = i2;
        this.f140855d = f2;
    }
}
