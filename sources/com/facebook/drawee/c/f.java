package com.facebook.drawee.c;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public class f<INFO> implements d<INFO> {

    /* renamed from: a  reason: collision with root package name */
    private final List<d<? super INFO>> f47333a = new ArrayList(2);

    static {
        Covode.recordClassIndex(28756);
    }

    public final synchronized void a() {
        MethodCollector.i(1761);
        this.f47333a.clear();
        MethodCollector.o(1761);
    }

    public final synchronized void b(d<? super INFO> dVar) {
        MethodCollector.i(1759);
        int indexOf = this.f47333a.indexOf(dVar);
        if (indexOf != -1) {
            this.f47333a.set(indexOf, null);
        }
        MethodCollector.o(1759);
    }

    public final synchronized void a(d<? super INFO> dVar) {
        MethodCollector.i(1758);
        this.f47333a.add(dVar);
        MethodCollector.o(1758);
    }

    @Override // com.facebook.drawee.c.d
    public synchronized void onRelease(String str) {
        MethodCollector.i(1771);
        int size = this.f47333a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                d<? super INFO> dVar = this.f47333a.get(i2);
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            } catch (Exception unused) {
            }
        }
        MethodCollector.o(1771);
    }

    @Override // com.facebook.drawee.c.d
    public void onIntermediateImageFailed(String str, Throwable th) {
        int size = this.f47333a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                d<? super INFO> dVar = this.f47333a.get(i2);
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.facebook.drawee.c.d
    public void onIntermediateImageSet(String str, INFO info) {
        int size = this.f47333a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                d<? super INFO> dVar = this.f47333a.get(i2);
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, info);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.facebook.drawee.c.d
    public synchronized void onFailure(String str, Throwable th) {
        MethodCollector.i(1769);
        int size = this.f47333a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                d<? super INFO> dVar = this.f47333a.get(i2);
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            } catch (Exception unused) {
            }
        }
        MethodCollector.o(1769);
    }

    @Override // com.facebook.drawee.c.d
    public synchronized void onSubmit(String str, Object obj) {
        MethodCollector.i(1762);
        int size = this.f47333a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                d<? super INFO> dVar = this.f47333a.get(i2);
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            } catch (Exception unused) {
            }
        }
        MethodCollector.o(1762);
    }

    @Override // com.facebook.drawee.c.d
    public synchronized void onFinalImageSet(String str, INFO info, Animatable animatable) {
        MethodCollector.i(1765);
        int size = this.f47333a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                d<? super INFO> dVar = this.f47333a.get(i2);
                if (dVar != null) {
                    dVar.onFinalImageSet(str, info, animatable);
                }
            } catch (Exception unused) {
            }
        }
        MethodCollector.o(1765);
    }
}
