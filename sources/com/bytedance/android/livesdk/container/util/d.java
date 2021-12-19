package com.bytedance.android.livesdk.container.util;

import com.bytedance.android.livesdk.livesetting.hybrid.EnableLynxDebugBadgeSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.ShowNewContainerLabel;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f16887a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final h f16888b = com.bytedance.android.livesdkapi.m.d.a(a.f16890a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f16889c = com.bytedance.android.livesdkapi.m.d.a(b.f16891a);

    public static boolean a() {
        return ((Boolean) f16889c.getValue()).booleanValue();
    }

    private d() {
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16891a = new b();

        static {
            Covode.recordClassIndex(9381);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostContext.class);
            l.b(a2, "");
            return Boolean.valueOf(((IHostContext) a2).isLocalTest());
        }
    }

    static {
        Covode.recordClassIndex(9379);
    }

    public static boolean b() {
        if (!a() || !ShowNewContainerLabel.INSTANCE.getValue()) {
            return false;
        }
        return true;
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16890a = new a();

        static {
            Covode.recordClassIndex(9380);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostContext.class);
            l.b(a2, "");
            if (!((IHostContext) a2).isLocalTest() || !EnableLynxDebugBadgeSetting.INSTANCE.getValue()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }
}
