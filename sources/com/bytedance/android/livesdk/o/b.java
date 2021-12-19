package com.bytedance.android.livesdk.o;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Pair;
import com.bytedance.android.live.i.b.b;
import com.bytedance.android.live.i.b.d;
import com.bytedance.android.live.n.f;
import com.bytedance.android.live.network.h;
import com.bytedance.android.livesdk.livesetting.pullstream.DnsOptMethodSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkEnableTfoPreconnectSetting;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.ss.optimizer.live.sdk.a.c;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private com.ss.optimizer.live.sdk.dns.a f19991a;

    static {
        Covode.recordClassIndex(11808);
    }

    private b() {
    }

    @Override // com.bytedance.android.live.n.f
    public final com.ss.optimizer.live.sdk.dns.a b() {
        return this.f19991a;
    }

    @Override // com.bytedance.android.live.n.f
    public final void a() {
        String str;
        boolean z;
        try {
            if (!i.a.a.a.a.a.a(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context())) {
                return;
            }
        } catch (Throwable unused) {
        }
        if (DnsOptMethodSetting.INSTANCE.getValue() == 1 && d.g().c().b() == null) {
            if (com.bytedance.android.live.t.a.a(IHostApp.class) == null || ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).isInMusicallyRegion()) {
                str = "https://hotapi-va.tiktokv.com";
            } else {
                str = "https://hotapi-sg.tiktokv.com";
            }
            c.a aVar = new c.a();
            aVar.f151660b = str;
            aVar.f151662d = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getUpdateVersionCode();
            aVar.f151663e = new com.ss.optimizer.live.sdk.a.b() {
                /* class com.bytedance.android.livesdk.o.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(11809);
                }

                @Override // com.ss.optimizer.live.sdk.a.b
                public final String a(String str) {
                    return new String(h.a().a(str, null, null).a().f23268e);
                }

                @Override // com.ss.optimizer.live.sdk.a.b
                public final String a(String str, byte[] bArr, String str2) {
                    return new String(h.a().a(str, null, str2, bArr).a().f23268e);
                }
            };
            aVar.f151665g = LiveSdkEnableTfoPreconnectSetting.INSTANCE.getValue();
            com.ss.optimizer.live.sdk.a.d.a().a(aVar.a());
            Context applicationContext = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context().getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            com.ss.optimizer.live.sdk.dns.a aVar2 = new com.ss.optimizer.live.sdk.dns.a(applicationContext);
            aVar2.f151692a = new a();
            com.ss.optimizer.live.sdk.dns.b.b.a().f151733e = aVar2.f151692a;
            com.ss.optimizer.live.sdk.dns.b.b a2 = com.ss.optimizer.live.sdk.dns.b.b.a();
            if (a2.f151733e != null) {
                a2.f151738j = ((Integer) a2.f151733e.a("min_start_play_buffer", Integer.valueOf(com.ss.optimizer.live.sdk.dns.b.b.f151729a))).intValue();
                a2.f151739k = ((Integer) a2.f151733e.a("max_start_play_buffer", Integer.valueOf(com.ss.optimizer.live.sdk.dns.b.b.f151730b))).intValue();
                a2.f151740l = ((Double) a2.f151733e.a("attenuation_coefficient", Double.valueOf(com.ss.optimizer.live.sdk.dns.b.b.f151732d))).doubleValue();
                a2.f151741m = ((Integer) a2.f151733e.a("attenuation_time_offset", 1000)).intValue();
            }
            double d2 = 0.0d;
            double d3 = 0.0d;
            for (int i2 = 0; i2 < a2.f151736h.length; i2++) {
                d3 += Math.cbrt((double) (8 - a2.f151736h[i2]));
            }
            int i3 = a2.f151739k - a2.f151738j;
            int i4 = a2.f151738j;
            int i5 = 1;
            while (i5 < a2.f151736h.length) {
                d2 += Math.cbrt((double) (8 - a2.f151736h[i5]));
                double d4 = (double) a2.f151738j;
                double d5 = (double) i3;
                Double.isNaN(d5);
                Double.isNaN(d4);
                int i6 = (int) (d4 + ((d2 / d3) * d5));
                a2.f151737i.put(Integer.valueOf(a2.f151736h[i5 - 1]), new Pair(Integer.valueOf(i4), Integer.valueOf(i6)));
                i5++;
                i4 = i6;
            }
            if (i5 == a2.f151736h.length) {
                z = true;
                a2.f151737i.put(Integer.valueOf(a2.f151736h[i5 - 1]), new Pair(Integer.valueOf(i4), Integer.valueOf(a2.f151739k)));
            } else {
                z = true;
            }
            d.g().c().a(aVar2);
            try {
                aVar2.f151698h = z;
                com.ss.optimizer.live.sdk.dns.a.a(aVar2.f151694c, aVar2.f151695d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                com.ss.optimizer.live.sdk.a.d.a().f151670c.a();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.bytedance.android.live.n.f
    public final void a(com.ss.optimizer.live.sdk.dns.a aVar) {
        this.f19991a = aVar;
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public static final class a implements b.AbstractC0153b<f> {
        static {
            Covode.recordClassIndex(11810);
        }

        @Override // com.bytedance.android.live.i.b.b.AbstractC0153b
        public final b.AbstractC0153b.a<f> a(b.AbstractC0153b.a<f> aVar) {
            aVar.f9912a = (R) new b((byte) 0);
            aVar.f9913b = true;
            return aVar;
        }
    }
}
