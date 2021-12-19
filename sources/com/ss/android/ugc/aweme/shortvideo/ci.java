package com.ss.android.ugc.aweme.shortvideo;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.gamora.recorder.choosemusic.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ci implements c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f125130b = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private static final long f125131f = g.a().l().getMaxDurationResolver().getMaxShootingDuration();

    /* renamed from: a  reason: collision with root package name */
    public final e f125132a;

    /* renamed from: d  reason: collision with root package name */
    private ShortVideoContext f125133d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f125134e;

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.c
    public final void a() {
        this.f125134e = true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82187);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.c
    public final com.bytedance.tux.tooltip.a.b.a c() {
        String string = this.f125132a.getString(R.string.fvy);
        l.b(string, "");
        return new com.bytedance.tux.tooltip.a.b.a(this.f125132a).a(string);
    }

    static {
        Covode.recordClassIndex(82186);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d7  */
    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.tux.tooltip.a.b.a b() {
        /*
        // Method dump skipped, instructions count: 483
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ci.b():com.bytedance.tux.tooltip.a.b.a");
    }

    public ci(e eVar) {
        l.d(eVar, "");
        this.f125132a = eVar;
    }
}
