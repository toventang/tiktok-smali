package com.bytedance.platform.a.b.c.a;

import android.util.Printer;
import com.bytedance.covode.number.Covode;

public final class e extends a implements Printer {

    /* renamed from: c  reason: collision with root package name */
    public Printer f41882c;

    static {
        Covode.recordClassIndex(25590);
    }

    public e(b bVar) {
        super("TriggerFromLooperPrinter", bVar);
    }

    public final void println(String str) {
        if (str.charAt(0) == '<' && this.f41875b != null) {
            this.f41875b.a();
        }
        Printer printer = this.f41882c;
        if (printer != null) {
            printer.println(str);
        }
    }
}
