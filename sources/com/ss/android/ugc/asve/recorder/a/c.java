package com.ss.android.ugc.asve.recorder.a;

import android.text.TextUtils;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.a.b;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.audio.h;
import com.ss.android.vesdk.audio.j;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import com.ss.android.vesdk.l;
import com.ss.android.vesdk.m;

public final class c implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f62138c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final l f62139a = new l();

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.asve.a.b f62140b;

    /* renamed from: d  reason: collision with root package name */
    private h f62141d;

    /* renamed from: e  reason: collision with root package name */
    private String f62142e;

    /* renamed from: f  reason: collision with root package name */
    private final ax f62143f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.asve.context.h f62144g;

    static {
        Covode.recordClassIndex(38193);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38194);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.a.a
    public final l a() {
        return this.f62139a;
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.a.c$c  reason: collision with other inner class name */
    public static final class C1357c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62147a;

        static {
            Covode.recordClassIndex(38196);
        }

        @Override // com.ss.android.ugc.asve.a.b.a
        public final void a() {
            this.f62147a.f62139a.b();
        }

        @Override // com.ss.android.ugc.asve.a.b.a
        public final void b() {
            this.f62147a.f62139a.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1357c(c cVar) {
            this.f62147a = cVar;
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.a.a
    public final void b() {
        this.f62139a.release(null);
        this.f62139a.b(this.f62141d);
        if (TextUtils.equals(this.f62142e, "record")) {
            this.f62142e = null;
            this.f62143f.b(false);
            this.f62139a.b(null);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.a.b
    public final void c(PrivacyCert privacyCert) {
        a(privacyCert);
    }

    @Override // com.ss.android.ugc.asve.recorder.a.b
    public final void d(PrivacyCert privacyCert) {
        b(privacyCert);
    }

    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62146a;

        static {
            Covode.recordClassIndex(38195);
        }

        @Override // com.ss.android.vesdk.audio.h
        public final void onError(int i2, int i3, String str) {
        }

        @Override // com.ss.android.vesdk.audio.h
        public final void onReceive(j jVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f62146a = cVar;
        }

        @Override // com.ss.android.vesdk.audio.h
        public final void onInfo(int i2, int i3, double d2, Object obj) {
            com.ss.android.ugc.asve.a.b bVar;
            if (i2 == aj.M) {
                com.ss.android.ugc.asve.a.b bVar2 = this.f62146a.f62140b;
                if (bVar2 != null) {
                    bVar2.j();
                }
            } else if (i2 == aj.N) {
                com.ss.android.ugc.asve.a.b bVar3 = this.f62146a.f62140b;
                if (bVar3 != null) {
                    bVar3.l();
                }
            } else if (i2 == aj.O && (bVar = this.f62146a.f62140b) != null) {
                bVar.n();
            }
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.a.a
    public final int a(int i2) {
        return this.f62143f.I().a(i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.a.a
    public final int b(int i2) {
        return this.f62143f.I().b(i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.a.a
    public final int a(double d2) {
        VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter = new VEAudioLoudnessBalanceFilter();
        vEAudioLoudnessBalanceFilter.targetLoudness = d2;
        return this.f62143f.I().a(vEAudioLoudnessBalanceFilter);
    }

    @Override // com.ss.android.ugc.asve.recorder.a.a
    public final int b(String str) {
        h.f.b.l.d(str, "");
        return this.f62143f.I().a(new com.ss.android.vesdk.a.a("audio mic detect delay", str));
    }

    @Override // com.ss.android.ugc.asve.recorder.a.a
    public final void a(PrivacyCert privacyCert) {
        com.ss.android.ugc.asve.a.b bVar;
        com.ss.android.ugc.asve.a.b bVar2 = this.f62140b;
        if (bVar2 != null) {
            bVar2.k();
        }
        int start = this.f62139a.start(privacyCert);
        if (start != 0 && (bVar = this.f62140b) != null) {
            bVar.b(start, "Mic open failed in earlier stage");
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.a.a
    public final void a(com.ss.android.ugc.asve.a.b bVar) {
        this.f62140b = bVar;
        if (bVar != null) {
            bVar.a(new C1357c(this));
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.a.a
    public final void b(PrivacyCert privacyCert) {
        com.ss.android.ugc.asve.a.b bVar;
        com.ss.android.ugc.asve.a.b bVar2 = this.f62140b;
        if (bVar2 != null) {
            bVar2.m();
        }
        int stop = this.f62139a.stop(privacyCert);
        if (stop != 0 && (bVar = this.f62140b) != null) {
            bVar.c(stop, "Mic close failed in earlier stage");
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.a.a
    public final void a(String str) {
        m.a aVar;
        com.ss.android.ugc.asve.a.b bVar;
        h.f.b.l.d(str, "");
        b bVar2 = new b(this);
        this.f62141d = bVar2;
        this.f62142e = str;
        this.f62139a.a(bVar2);
        int hashCode = str.hashCode();
        if (hashCode != -934908847) {
            if (hashCode == 106541 && str.equals("ktv")) {
                aVar = new m.a(null).a(true);
            }
            throw new IllegalArgumentException("not a supported mode ".concat(String.valueOf(str)));
        }
        if (str.equals("record")) {
            this.f62143f.b(true);
            aVar = new m.a();
            com.ss.android.ugc.asve.context.h hVar = this.f62144g;
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(hVar, "");
            if (hVar.k().invoke().booleanValue()) {
                aVar.a(1);
            }
        }
        throw new IllegalArgumentException("not a supported mode ".concat(String.valueOf(str)));
        com.ss.android.ugc.asve.a.b bVar3 = this.f62140b;
        if (bVar3 != null) {
            bVar3.i();
        }
        if (this.f62139a.init(aVar.f151360a) != 0 && (bVar = this.f62140b) != null) {
            bVar.a("Mic init failed in earlier stage");
        }
    }

    public c(ax axVar, com.ss.android.ugc.asve.context.h hVar) {
        h.f.b.l.d(axVar, "");
        h.f.b.l.d(hVar, "");
        this.f62143f = axVar;
        this.f62144g = hVar;
    }
}
