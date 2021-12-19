package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ai;
import h.f.b.l;

public abstract class d {
    static {
        Covode.recordClassIndex(85191);
    }

    private d() {
    }

    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f129782a = new a();

        public final String toString() {
            return "Cancel";
        }

        private a() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(85192);
        }
    }

    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public final p f129783a;

        static {
            Covode.recordClassIndex(85193);
        }

        public final String toString() {
            return "Failed error:" + this.f129783a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super((byte) 0);
            l.d(pVar, "");
            this.f129783a = pVar;
        }
    }

    public static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public final ai f129784a;

        static {
            Covode.recordClassIndex(85194);
        }

        public final String toString() {
            return "Success response:" + this.f129784a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ai aiVar) {
            super((byte) 0);
            l.d(aiVar, "");
            this.f129784a = aiVar;
        }
    }

    public /* synthetic */ d(byte b2) {
        this();
    }
}
