package com.ss.android.vesdk;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.audio.a;
import com.ss.android.vesdk.audio.c;
import com.ss.android.vesdk.audio.d;
import com.ss.android.vesdk.audio.e;
import com.ss.android.vesdk.audio.h;
import com.ss.android.vesdk.audio.i;
import com.ss.android.vesdk.audio.j;
import com.ss.android.vesdk.m;

public final class l implements a {

    /* renamed from: a  reason: collision with root package name */
    a<h> f151347a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public c f151348b = null;

    /* renamed from: c  reason: collision with root package name */
    private e f151349c;

    static {
        Covode.recordClassIndex(99528);
    }

    public final void a() {
        this.f151349c.f150967b = true;
    }

    public final void b() {
        this.f151349c.f150967b = false;
    }

    public l() {
        e eVar = new e();
        this.f151349c = eVar;
        eVar.f150970e = new d() {
            /* class com.ss.android.vesdk.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99529);
            }

            @Override // com.ss.android.vesdk.audio.d
            public final void a(j jVar) {
                for (h hVar : l.this.f151347a.c()) {
                    hVar.onReceive(jVar);
                }
            }

            @Override // com.ss.android.vesdk.audio.d
            public final void a(int i2, int i3, String str) {
                for (h hVar : l.this.f151347a.c()) {
                    hVar.onError(i2, i3, str);
                }
            }

            @Override // com.ss.android.vesdk.audio.d
            public final void a(int i2, int i3, double d2, Object obj) {
                for (h hVar : l.this.f151347a.c()) {
                    hVar.onInfo(i2, i3, d2, obj);
                }
            }
        };
    }

    @Override // com.ss.android.vesdk.audio.a
    public final void release(PrivacyCert privacyCert) {
        this.f151349c.release(privacyCert);
    }

    @Override // com.ss.android.vesdk.audio.a
    public final int start(PrivacyCert privacyCert) {
        return this.f151349c.start(privacyCert);
    }

    @Override // com.ss.android.vesdk.audio.a
    public final int stop(PrivacyCert privacyCert) {
        return this.f151349c.stop(privacyCert);
    }

    public final void a(i iVar) {
        if (iVar != null) {
            this.f151349c.f150976k = iVar;
        }
    }

    public final boolean b(h hVar) {
        return this.f151347a.b(hVar);
    }

    public final boolean a(h hVar) {
        return this.f151347a.a(hVar);
    }

    @Override // com.ss.android.vesdk.audio.a
    public final int init(m mVar) {
        m.a aVar = new m.a(mVar);
        aVar.f151360a.f151354d = ((Integer) u.a().a("ve_audio_source_type", (Object) 1)).intValue();
        return this.f151349c.init(aVar.f151360a);
    }
}
