package com.ss.android.ugc.aweme.ftc.b;

import androidx.fragment.app.e;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.d;
import h.f.b.l;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final long f97448e = g.a().l().getMaxDurationResolver().getMaxShootingDuration();

    /* renamed from: f  reason: collision with root package name */
    public static final a f97449f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final e f97450a;

    /* renamed from: b  reason: collision with root package name */
    final m f97451b;

    /* renamed from: c  reason: collision with root package name */
    final a f97452c;

    /* renamed from: d  reason: collision with root package name */
    public final ShortVideoContext f97453d;

    public static final class a {
        static {
            Covode.recordClassIndex(61924);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.ftc.f.a a() {
        return (com.ss.android.ugc.aweme.ftc.f.a) ApiCenter.a.a(this.f97450a).b(com.ss.android.ugc.aweme.ftc.f.a.class);
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        com.ss.android.ugc.aweme.sticker.model.a aVar = this.f97453d.f124757b.r;
        if (aVar != null) {
            return aVar.getMaxDuration();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        com.ss.android.ugc.aweme.sticker.model.a aVar = this.f97453d.f124757b.r;
        if (aVar == null || aVar.isMultiBgVideo()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(61923);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.b$b  reason: collision with other inner class name */
    public static final class C2346b implements k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97454a;

        static {
            Covode.recordClassIndex(61925);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2346b(b bVar) {
            this.f97454a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a
        public final void a(d dVar) {
            this.f97454a.f97453d.aw = k.a(dVar);
        }
    }

    public b(e eVar, m mVar, a aVar, ShortVideoContext shortVideoContext) {
        l.d(eVar, "");
        l.d(mVar, "");
        l.d(aVar, "");
        l.d(shortVideoContext, "");
        this.f97450a = eVar;
        this.f97451b = mVar;
        this.f97452c = aVar;
        this.f97453d = shortVideoContext;
    }
}
