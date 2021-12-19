package com.bytedance.sdk.bridge.b;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final C1066b f43844d = new C1066b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f43845a;

    /* renamed from: b  reason: collision with root package name */
    public String f43846b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f43847c;

    static {
        Covode.recordClassIndex(26810);
    }

    public enum a {
        SUCCESS(1),
        ERROR(0),
        NOT_FOUND(-2),
        NO_PRIVILEGE(-1),
        PARAMS_ERROR(-3);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(26811);
        }

        private a(int i2) {
            this.value = i2;
        }
    }

    /* renamed from: com.bytedance.sdk.bridge.b.b$b  reason: collision with other inner class name */
    public static final class C1066b {
        static {
            Covode.recordClassIndex(26812);
        }

        private C1066b() {
        }

        public /* synthetic */ C1066b(byte b2) {
            this();
        }
    }

    private b() {
        this.f43845a = a.ERROR.getValue();
    }

    public /* synthetic */ b(byte b2) {
        this();
    }
}
