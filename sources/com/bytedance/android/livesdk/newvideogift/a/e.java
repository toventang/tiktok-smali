package com.bytedance.android.livesdk.newvideogift.a;

import android.content.Context;
import android.util.SparseArray;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.livesetting.gift.GiftPlayerAutoReleaseSwitchSetting;
import com.bytedance.android.livesdkapi.depend.d.a.a;
import com.bytedance.android.livesdkapi.depend.d.a.b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.covode.number.Covode;

public final class e implements b {

    /* renamed from: c  reason: collision with root package name */
    private static SparseArray<a> f19893c = new SparseArray<>(2);

    /* renamed from: d  reason: collision with root package name */
    private static int f19894d;

    /* renamed from: e  reason: collision with root package name */
    private static e f19895e;

    /* renamed from: a  reason: collision with root package name */
    private final IHostPlugin f19896a;

    /* renamed from: b  reason: collision with root package name */
    private Context f19897b;

    static {
        Covode.recordClassIndex(11776);
    }

    public static boolean b() {
        if (f19893c.get(f19894d) != null) {
            return true;
        }
        return false;
    }

    public static e a() {
        if (f19895e == null) {
            f19895e = new e(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context(), (IHostPlugin) com.bytedance.android.live.t.a.a(IHostPlugin.class));
        }
        return f19895e;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.b
    public final a a(int i2) {
        return f19893c.get(i2);
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.b
    public final void b(int i2) {
        a aVar = f19893c.get(i2);
        com.bytedance.android.live.core.c.a.a(3, "GiftCtlManager", "manager release() called with [" + aVar + "]");
        if (aVar != null) {
            aVar.c();
            f19893c.remove(i2);
            com.bytedance.android.live.core.c.a.a(4, "GiftCtlManager", "release player ".concat(String.valueOf(i2)));
        }
    }

    private e(Context context, IHostPlugin iHostPlugin) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f19897b = applicationContext;
        this.f19896a = iHostPlugin;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.b
    public final a b(int i2, m mVar) {
        int i3 = f19894d;
        if (i2 == i3 && a(i3) != null) {
            return a(f19894d);
        }
        f19894d = i2;
        d dVar = new d(this.f19897b, this.f19896a);
        dVar.a(mVar);
        f19893c.put(i2, dVar);
        com.bytedance.android.live.core.c.a.a(4, "GiftCtlManager", "create new player ".concat(String.valueOf(i2)));
        return dVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.b
    public final a a(int i2, m mVar) {
        int i3 = f19894d;
        if (i2 == i3 && a(i3) != null) {
            return a(f19894d);
        }
        if (GiftPlayerAutoReleaseSwitchSetting.INSTANCE.getValue().f19785a) {
            return null;
        }
        f19894d = i2;
        d dVar = new d(this.f19897b, this.f19896a);
        dVar.a(mVar);
        f19893c.put(i2, dVar);
        com.bytedance.android.live.core.c.a.a(4, "GiftCtlManager", "create new player ".concat(String.valueOf(i2)));
        return dVar;
    }
}
