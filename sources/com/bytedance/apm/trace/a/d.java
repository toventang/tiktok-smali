package com.bytedance.apm.trace.a;

import com.bytedance.apm.trace.model.a;
import com.bytedance.apm.trace.model.cross.NativeSpan;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public a f25284a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25285b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25286c;

    static {
        Covode.recordClassIndex(14728);
    }

    public final synchronized void a(String str, ArrayList<NativeSpan> arrayList) {
        if (!this.f25286c) {
            if (this.f25285b) {
                boolean z = true;
                Iterator<NativeSpan> it = arrayList.iterator();
                while (it.hasNext()) {
                    NativeSpan next = it.next();
                    if (next != null) {
                        c parseToSpan = next.parseToSpan(this.f25284a);
                        if (z) {
                            parseToSpan.a(Long.parseLong(str));
                        }
                        parseToSpan.a(next.getStartTime(), next.getFinishTime());
                        z = false;
                    }
                }
            }
        }
    }

    public final synchronized void b(String str, ArrayList<NativeSpan> arrayList) {
        if (!this.f25286c) {
            if (this.f25285b) {
                boolean z = true;
                Iterator<NativeSpan> it = arrayList.iterator();
                while (it.hasNext()) {
                    NativeSpan next = it.next();
                    if (next != null) {
                        c parseToSpan = next.parseToSpan(this.f25284a);
                        if (z) {
                            parseToSpan.b(Long.parseLong(str));
                        }
                        parseToSpan.a(next.getStartTime(), next.getFinishTime());
                        z = false;
                    }
                }
            }
        }
    }
}
