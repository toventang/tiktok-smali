package com.bytedance.apm.block.a;

import com.bytedance.covode.number.Covode;

public class d {

    /* renamed from: b  reason: collision with root package name */
    static volatile boolean f24574b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile d f24575c;

    /* renamed from: a  reason: collision with root package name */
    public b f24576a = new a();

    public interface b {
        static {
            Covode.recordClassIndex(14471);
        }
    }

    static {
        Covode.recordClassIndex(14468);
    }

    static class a implements b {
        static {
            Covode.recordClassIndex(14470);
        }

        a() {
        }
    }

    private d() {
    }

    public static d a() {
        if (f24575c == null) {
            synchronized (d.class) {
                if (f24575c == null) {
                    f24575c = new d();
                }
            }
        }
        return f24575c;
    }
}
