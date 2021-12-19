package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class ae {

    /* renamed from: a  reason: collision with root package name */
    public final String f129701a;

    static {
        Covode.recordClassIndex(85150);
    }

    public static final class a extends ae {

        /* renamed from: b  reason: collision with root package name */
        public final String f129702b;

        static {
            Covode.recordClassIndex(85151);
        }

        public final String toString() {
            return "HwReEncode:" + this.f129702b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(str2, (byte) 0);
            l.d(str, "");
            l.d(str2, "");
            this.f129702b = str;
        }
    }

    public static final class c extends ae {

        /* renamed from: b  reason: collision with root package name */
        public final String f129703b;

        static {
            Covode.recordClassIndex(85153);
        }

        public final String toString() {
            return "SwReEncode:" + this.f129703b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(str2, (byte) 0);
            l.d(str, "");
            l.d(str2, "");
            this.f129703b = str;
        }
    }

    private ae(String str) {
        this.f129701a = str;
    }

    public static final class b extends ae {
        static {
            Covode.recordClassIndex(85152);
        }

        public final String toString() {
            return "SkipReEncode";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(str, (byte) 0);
            l.d(str, "");
        }
    }

    public /* synthetic */ ae(String str, byte b2) {
        this(str);
    }
}
