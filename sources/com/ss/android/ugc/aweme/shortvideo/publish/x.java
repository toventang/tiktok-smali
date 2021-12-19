package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class x {
    static {
        Covode.recordClassIndex(85253);
    }

    private x() {
    }

    public static final class b extends x {

        /* renamed from: a  reason: collision with root package name */
        public static final b f129903a = new b();

        public final String toString() {
            return "PublishState:New";
        }

        private b() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(85255);
        }
    }

    public static final class c extends x {

        /* renamed from: a  reason: collision with root package name */
        public static final c f129904a = new c();

        private c() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(85256);
        }
    }

    public static final class a extends x {

        /* renamed from: a  reason: collision with root package name */
        public final d f129901a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f129902b;

        static {
            Covode.recordClassIndex(85254);
        }

        public final String toString() {
            return "PublishState:Finish result:" + this.f129901a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, Object obj) {
            super((byte) 0);
            l.d(dVar, "");
            this.f129901a = dVar;
            this.f129902b = obj;
        }
    }

    public static final class d extends x {

        /* renamed from: a  reason: collision with root package name */
        public final int f129905a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f129906b;

        static {
            Covode.recordClassIndex(85257);
        }

        public final String toString() {
            return "PublishState:Running progress:" + this.f129905a;
        }

        public d(int i2, Object obj) {
            super((byte) 0);
            this.f129905a = i2;
            this.f129906b = obj;
        }
    }

    public /* synthetic */ x(byte b2) {
        this();
    }
}
