package com.ss.android.ugc.aweme.ftc.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e implements i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f97466b = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private static final long f97467f = g.a().l().getMaxDurationResolver().getMaxShootingDuration();

    /* renamed from: a  reason: collision with root package name */
    public final androidx.fragment.app.e f97468a;

    /* renamed from: d  reason: collision with root package name */
    private ShortVideoContext f97469d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f97470e;

    @Override // com.ss.android.ugc.aweme.ftc.b.i
    public final void a() {
        this.f97470e = true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61929);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.b.i
    public final com.bytedance.tux.tooltip.a.b.a c() {
        String string = this.f97468a.getString(R.string.fvy);
        l.b(string, "");
        if (this.f97468a != null) {
            return new com.bytedance.tux.tooltip.a.b.a(this.f97468a).a(string);
        }
        return null;
    }

    static {
        Covode.recordClassIndex(61928);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0149  */
    @Override // com.ss.android.ugc.aweme.ftc.b.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.tux.tooltip.a.b.a b() {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.b.e.b():com.bytedance.tux.tooltip.a.b.a");
    }

    public e(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        this.f97468a = eVar;
    }
}
