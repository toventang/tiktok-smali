package com.bytedance.ies.xbridge.n.d;

import com.bytedance.covode.number.Covode;

public final class c extends com.bytedance.ies.xbridge.model.c.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f36339c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f36340a;

    /* renamed from: b  reason: collision with root package name */
    public C0874c f36341b;

    /* renamed from: com.bytedance.ies.xbridge.n.d.c$c  reason: collision with other inner class name */
    public static final class C0874c {

        /* renamed from: a  reason: collision with root package name */
        public Integer f36343a;

        static {
            Covode.recordClassIndex(21775);
        }
    }

    static {
        Covode.recordClassIndex(21772);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21773);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public enum b {
        SELECT("select"),
        DISMISS("dismiss");
        
        private final String action;

        public final String getAction() {
            return this.action;
        }

        static {
            Covode.recordClassIndex(21774);
        }

        private b(String str) {
            this.action = str;
        }
    }
}
