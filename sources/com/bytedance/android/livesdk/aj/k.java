package com.bytedance.android.livesdk.aj;

import android.content.Context;
import com.bytedance.android.live.n.l;
import com.bytedance.android.livesdk.chatroom.g.d;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.m.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class k implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13852a = ab.a(k.class).b();

    /* renamed from: b  reason: collision with root package name */
    public static l f13853b = new k();

    /* renamed from: c  reason: collision with root package name */
    public static final a f13854c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, com.bytedance.android.live.n.k> f13855d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.android.live.n.k f13856e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f13857f = LiveMultiPlayerEnableSetting.INSTANCE.getValue();

    public static final class a {
        static {
            Covode.recordClassIndex(7704);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private k() {
    }

    static {
        Covode.recordClassIndex(7703);
    }

    private static com.bytedance.android.live.n.k b() {
        i iVar = new i(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context(), (IHostPlugin) com.bytedance.android.live.t.a.a(IHostPlugin.class), new m());
        d.a(f13852a, "create playController -> playController: " + iVar.hashCode());
        return iVar;
    }

    @Override // com.bytedance.android.live.n.l
    public final com.bytedance.android.live.n.k a() {
        int i2;
        String str = f13852a;
        StringBuilder sb = new StringBuilder("get current playController -> playController:");
        com.bytedance.android.live.n.k kVar = this.f13856e;
        if (kVar != null) {
            i2 = kVar.hashCode();
        } else {
            i2 = 0;
        }
        d.a(str, sb.append(i2).toString());
        return this.f13856e;
    }

    private final com.bytedance.android.live.n.k e(String str) {
        com.bytedance.android.live.n.k f2 = f(str);
        if (f2 != null) {
            return f2;
        }
        com.bytedance.android.live.n.k b2 = b();
        this.f13855d.put(str, b2);
        return b2;
    }

    private final com.bytedance.android.live.n.k f(String str) {
        if (this.f13855d.containsKey(str)) {
            return this.f13855d.get(str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.n.l
    public final void c(String str) {
        com.bytedance.android.live.n.k f2;
        if (!this.f13857f) {
            this.f13856e = com.bytedance.android.live.i.b.d.g().a();
        } else if (str != null && (f2 = f(str)) != null) {
            this.f13856e = f2;
            d.a(f13852a, "set current player " + str + " --> " + f2);
            f2.a(false, str);
        }
    }

    @Override // com.bytedance.android.live.n.l
    public final void d(String str) {
        h.f.b.l.d(str, "");
        if (this.f13857f && f(str) != null) {
            d.a(f13852a, "clear cache --> ".concat(String.valueOf(this.f13855d.remove(str))));
        }
    }

    @Override // com.bytedance.android.live.n.l
    public final com.bytedance.android.live.n.k a(String str) {
        int i2;
        String str2 = f13852a;
        d.a(str2, "wanna getPlayerController ->  tag: ".concat(String.valueOf(str)));
        if (!this.f13857f) {
            return com.bytedance.android.live.i.b.d.g().a();
        }
        if (str == null) {
            return null;
        }
        StringBuilder append = new StringBuilder().append(str).append(" matches ---> LivePlayController: ");
        com.bytedance.android.live.n.k e2 = e(str);
        if (e2 != null) {
            i2 = e2.hashCode();
        } else {
            i2 = 0;
        }
        d.a(str2, append.append(i2).toString());
        return e(str);
    }

    @Override // com.bytedance.android.live.n.l
    public final com.bytedance.android.live.n.k b(String str) {
        int i2;
        if (!this.f13857f) {
            return com.bytedance.android.live.i.b.d.g().a();
        }
        if (str == null) {
            return null;
        }
        com.bytedance.android.live.n.k f2 = f(str);
        String str2 = f13852a;
        StringBuilder append = new StringBuilder().append(str).append("  getPlayerController from cache: ");
        if (f2 != null) {
            i2 = f2.hashCode();
        } else {
            i2 = 0;
        }
        d.a(str2, append.append(i2).toString());
        return f2;
    }

    @Override // com.bytedance.android.live.n.l
    public final void a(Context context) {
        String key;
        if (this.f13857f) {
            Iterator<Map.Entry<String, com.bytedance.android.live.n.k>> it = this.f13855d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, com.bytedance.android.live.n.k> next = it.next();
                com.bytedance.android.live.n.k value = next.getValue();
                d.a(f13852a, "releaseAllMultiPlayer()，" + next.getKey() + " delete ");
                if ((next.getKey() == null || (key = next.getKey()) == null || !p.e((CharSequence) key, (CharSequence) "preview")) && value.c(context)) {
                    it.remove();
                }
            }
            this.f13856e = null;
            return;
        }
        com.bytedance.android.live.i.b.d.g().a().c(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context());
    }

    @Override // com.bytedance.android.live.n.l
    public final void a(String str, com.bytedance.android.live.n.k kVar) {
        h.f.b.l.d(kVar, "");
        if (this.f13857f && str != null && f(str) == null) {
            this.f13855d.put(str, kVar);
            d.a(f13852a, "reuse player -> cache PlayerTag : " + str + " into newLivePlayController: " + kVar.hashCode());
        }
    }

    @Override // com.bytedance.android.live.n.l
    public final void a(String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        if (this.f13857f) {
            com.bytedance.android.live.n.k f2 = f(str);
            if (f2 != null) {
                this.f13855d.remove(str);
                this.f13855d.put(str2, f2);
            }
            d.a(f13852a, "reuse playController -> replace reusePlayerTag: " + str + "  into roomPlayerTag: " + str2);
        }
    }
}
