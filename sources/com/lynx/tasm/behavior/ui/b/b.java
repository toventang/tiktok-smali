package com.lynx.tasm.behavior.ui.b;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static Class f56141b;

    /* renamed from: a  reason: collision with root package name */
    public a f56142a;

    /* renamed from: c  reason: collision with root package name */
    private Constructor f56143c;

    static {
        Covode.recordClassIndex(35063);
    }

    public b() {
        Constructor constructor;
        try {
            if (f56141b == null) {
                f56141b = Class.forName("com.lynx.canvas.CanvasManager");
            }
            Object obj = null;
            if (this.f56143c == null) {
                Class cls = f56141b;
                if (cls != null) {
                    constructor = cls.getConstructor(new Class[0]);
                } else {
                    constructor = null;
                }
                this.f56143c = constructor;
            }
            Constructor constructor2 = this.f56143c;
            obj = constructor2 != null ? constructor2.newInstance(new Object[0]) : obj;
            if (obj instanceof a) {
                this.f56142a = (a) obj;
            }
        } catch (Exception unused) {
        }
    }
}
