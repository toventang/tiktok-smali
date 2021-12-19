package com.ss.android.ugc.aweme.shortvideo.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import h.f.b.l;
import java.util.List;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final d f129929a;

    /* renamed from: b  reason: collision with root package name */
    public final String f129930b;

    /* renamed from: c  reason: collision with root package name */
    public final String f129931c;

    /* renamed from: d  reason: collision with root package name */
    public final String f129932d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f129933e;

    static {
        Covode.recordClassIndex(85273);
    }

    public /* synthetic */ b(d dVar, String str, String str2, String str3) {
        this(dVar, str, str2, str3, false);
    }

    public static class a extends b {

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f129934f;

        static {
            Covode.recordClassIndex(85274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List<String> list, d dVar, String str, String str2, String str3) {
            super(dVar, str, str2, str3);
            l.d(list, "");
            l.d(dVar, "");
            this.f129934f = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.q.b$b  reason: collision with other inner class name */
    public static final class C3384b extends a {

        /* renamed from: g  reason: collision with root package name */
        public final boolean f129935g = true;

        static {
            Covode.recordClassIndex(85275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3384b(List<String> list, d dVar, String str, String str2, String str3) {
            super(list, dVar, str, str2, str3);
            l.d(list, "");
            l.d(dVar, "");
        }
    }

    private b(d dVar, String str, String str2, String str3, boolean z) {
        this.f129929a = dVar;
        this.f129930b = str;
        this.f129931c = str2;
        this.f129932d = str3;
        this.f129933e = z;
    }

    public /* synthetic */ b(d dVar, String str, String str2, String str3, boolean z, byte b2) {
        this(dVar, str, str2, str3, z);
    }

    public static final class d extends b {

        /* renamed from: f  reason: collision with root package name */
        public final String f129938f;

        /* renamed from: g  reason: collision with root package name */
        public long f129939g;

        /* renamed from: h  reason: collision with root package name */
        public long f129940h;

        static {
            Covode.recordClassIndex(85277);
        }

        public /* synthetic */ d(String str, long j2, d dVar, String str2, String str3, boolean z) {
            this(str, j2, dVar, "", str2, str3, z);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private d(String str, long j2, d dVar, String str2, String str3, String str4, boolean z) {
            super(dVar, str2, str3, str4, z, (byte) 0);
            l.d(str, "");
            l.d(dVar, "");
            this.f129938f = str;
            this.f129939g = 0;
            this.f129940h = j2;
        }
    }

    public static final class c extends b {

        /* renamed from: f  reason: collision with root package name */
        public final ExtractFramesModel f129936f;

        /* renamed from: g  reason: collision with root package name */
        public final long f129937g;

        static {
            Covode.recordClassIndex(85276);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ExtractFramesModel extractFramesModel, long j2, d dVar, String str, String str2, String str3, boolean z) {
            super(dVar, str, str2, str3, z, (byte) 0);
            l.d(dVar, "");
            this.f129936f = extractFramesModel;
            this.f129937g = j2;
        }
    }
}
