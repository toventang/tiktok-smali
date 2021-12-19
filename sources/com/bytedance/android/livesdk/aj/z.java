package com.bytedance.android.livesdk.aj;

import android.content.Context;
import android.util.SparseIntArray;
import com.bytedance.android.live.i.b.d;
import com.bytedance.android.livesdk.aj.b.a;
import com.bytedance.android.livesdk.ao.e;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.android.livesdk.livesetting.pullstream.DnsOptMethodSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHttpkDegradeEnabledSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.PlayerEnableUploadTimeLineSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.videoarch.a.b;
import com.ss.videoarch.a.g;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    final Context f13922a;

    /* renamed from: b  reason: collision with root package name */
    boolean f13923b;

    /* renamed from: c  reason: collision with root package name */
    boolean f13924c = true;

    /* renamed from: d  reason: collision with root package name */
    SparseIntArray f13925d;

    /* renamed from: e  reason: collision with root package name */
    a f13926e;

    /* renamed from: f  reason: collision with root package name */
    g f13927f;

    /* renamed from: g  reason: collision with root package name */
    aa f13928g;

    static {
        Covode.recordClassIndex(7723);
    }

    public final g a() {
        int i2;
        this.f13928g = new aa(this.f13926e);
        g.a a2 = g.a(a(this.f13922a));
        a2.f154347h = 300000;
        a2.f154343d = new ab();
        a2.f154345f = false;
        a2.f154346g = false;
        if (this.f13923b) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        a2.f154348i = i2;
        a2.f154341b = this.f13928g;
        a2.f154344e = new b() {
            /* class com.bytedance.android.livesdk.aj.z.AnonymousClass1 */

            static {
                Covode.recordClassIndex(7724);
            }

            @Override // com.ss.videoarch.a.b
            public final <T> T a(String str, T t) {
                return (T) e.a(str, t);
            }
        };
        if (ThreadPoolOptExperiment.INSTANCE.isEnablePlayer()) {
            l.a a3 = l.a(o.SERIAL);
            a3.f79173b = "player-work-threads";
            a2.r = com.ss.android.ugc.aweme.cw.g.a(a3.a());
        }
        this.f13927f = a2.a();
        if (PlayerEnableUploadTimeLineSetting.INSTANCE.getValue()) {
            this.f13927f.a();
        }
        if (DnsOptMethodSetting.INSTANCE.getValue() == 1) {
            this.f13927f.a(d.g().c().b());
        }
        if (LiveHttpkDegradeEnabledSetting.INSTANCE.getValue()) {
            this.f13927f.a(39, 1);
        }
        return this.f13927f;
    }

    public z(Context context) {
        this.f13922a = context;
        this.f13925d = new SparseIntArray();
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }
}
