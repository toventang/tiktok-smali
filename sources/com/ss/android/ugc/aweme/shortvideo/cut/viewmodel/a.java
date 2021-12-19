package com.ss.android.ugc.aweme.shortvideo.cut.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final C3285a f126286f = new C3285a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public x.f f126287a;

    /* renamed from: b  reason: collision with root package name */
    public long f126288b;

    /* renamed from: c  reason: collision with root package name */
    public VEListener.s f126289c;

    /* renamed from: d  reason: collision with root package name */
    public final int f126290d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f126291e;

    static {
        Covode.recordClassIndex(82891);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a$a  reason: collision with other inner class name */
    public static final class C3285a {
        static {
            Covode.recordClassIndex(82892);
        }

        private C3285a() {
        }

        public static /* synthetic */ a a() {
            return new a(1, false);
        }

        public /* synthetic */ C3285a(byte b2) {
            this();
        }
    }

    public /* synthetic */ a(int i2) {
        this(i2, true);
    }

    public a(int i2, boolean z) {
        this.f126290d = i2;
        this.f126291e = z;
        this.f126287a = x.f.EDITOR_SEEK_FLAG_LastSeek;
    }

    public /* synthetic */ a(long j2, x.f fVar) {
        this(j2, fVar, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(long j2, x.f fVar, VEListener.s sVar) {
        this(3);
        l.d(fVar, "");
        this.f126288b = j2;
        this.f126287a = fVar;
        this.f126289c = sVar;
    }
}
