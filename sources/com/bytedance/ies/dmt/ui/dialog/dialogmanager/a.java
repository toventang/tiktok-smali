package com.bytedance.ies.dmt.ui.dialog.dialogmanager;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private volatile ArrayList<Integer> f33429a;

    /* renamed from: b  reason: collision with root package name */
    private volatile ArrayList<Integer> f33430b;

    /* renamed from: c  reason: collision with root package name */
    private volatile SparseArray<WeakReference<DialogContext>> f33431c;

    /* renamed from: d  reason: collision with root package name */
    private volatile SparseArray<WeakReference<DialogContext>> f33432d;

    /* renamed from: e  reason: collision with root package name */
    private int f33433e;

    static {
        Covode.recordClassIndex(19943);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.dialog.dialogmanager.a$a  reason: collision with other inner class name */
    public static class C0732a {

        /* renamed from: a  reason: collision with root package name */
        public static a f33434a = new a((byte) 0);

        static {
            Covode.recordClassIndex(19944);
        }
    }

    private a() {
        this.f33429a = new ArrayList<>();
        this.f33430b = new ArrayList<>();
        this.f33431c = new SparseArray<>();
        this.f33432d = new SparseArray<>();
        this.f33433e = 1;
        a(b.d.AGE_GATE);
        a(b.d.POLICY_NOTICE);
    }

    private void a() {
        while (this.f33432d != null && this.f33432d.size() > 0) {
            int keyAt = this.f33432d.keyAt(0);
            WeakReference<DialogContext> weakReference = this.f33432d.get(keyAt);
            if (weakReference == null || weakReference.get() == null) {
                this.f33432d.remove(keyAt);
            } else if (this.f33429a.size() != 0 && weakReference.get().f33420d == null) {
                return;
            } else {
                if (weakReference.get().f33418b == null || a(weakReference.get().f33418b.ordinal())) {
                    this.f33432d.remove(keyAt);
                    this.f33431c.put(keyAt, weakReference);
                    weakReference.get().a();
                    return;
                }
                return;
            }
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    private boolean a(int i2) {
        return this.f33430b.contains(Integer.valueOf(i2));
    }

    private synchronized void a(b.d dVar) {
        MethodCollector.i(1544);
        if (!this.f33429a.contains(Integer.valueOf(dVar.ordinal()))) {
            this.f33429a.add(Integer.valueOf(dVar.ordinal()));
        }
        MethodCollector.o(1544);
    }

    public final synchronized void a(b.a aVar) {
        WeakReference<DialogContext> weakReference;
        MethodCollector.i(1550);
        if (this.f33431c.get(aVar.ordinal()) != null) {
            weakReference = this.f33431c.get(aVar.ordinal());
            this.f33431c.remove(aVar.ordinal());
        } else {
            if (this.f33432d.get(aVar.ordinal()) != null) {
                weakReference = this.f33432d.get(aVar.ordinal());
                this.f33432d.remove(aVar.ordinal());
            }
            a();
            MethodCollector.o(1550);
        }
        if (!(weakReference == null || weakReference.get() == null || weakReference.get().f33420d == null)) {
            b.d dVar = weakReference.get().f33420d;
            if (this.f33429a.contains(Integer.valueOf(dVar.ordinal()))) {
                this.f33429a.remove(Integer.valueOf(dVar.ordinal()));
            }
            if (this.f33431c.size() == 0) {
                a();
            }
            MethodCollector.o(1550);
            return;
        }
        a();
        MethodCollector.o(1550);
    }

    public final synchronized void a(DialogContext dialogContext) {
        MethodCollector.i(1568);
        WeakReference<DialogContext> weakReference = new WeakReference<>(dialogContext);
        if (this.f33429a.size() <= 0 || dialogContext.f33420d != null) {
            if (dialogContext.f33418b != null) {
                int i2 = -1;
                if (dialogContext.f33418b instanceof b.EnumC0733b) {
                    i2 = ((b.EnumC0733b) dialogContext.f33418b).getValue();
                }
                if (dialogContext.f33418b instanceof b.a) {
                    i2 = ((b.a) dialogContext.f33418b).ordinal();
                }
                if (!this.f33430b.contains(Integer.valueOf(i2))) {
                    if (dialogContext.f33423g) {
                        dialogContext.a(null, 0);
                        this.f33432d.put(dialogContext.f33417a.ordinal(), weakReference);
                    }
                    MethodCollector.o(1568);
                    return;
                }
            }
            dialogContext.f33417a.ordinal();
            for (int i3 = 0; i3 < this.f33431c.size(); i3++) {
                WeakReference<DialogContext> valueAt = this.f33431c.valueAt(i3);
                if (valueAt != null && valueAt.get() == null) {
                    this.f33431c.removeAt(i3);
                }
            }
            if (this.f33432d.size() != 0) {
                WeakReference<DialogContext> valueAt2 = this.f33432d.valueAt(0);
                if (valueAt2.get() != null && dialogContext.f33417a.ordinal() < valueAt2.get().f33417a.ordinal()) {
                    if (dialogContext.f33423g) {
                        dialogContext.a(null, 0);
                        this.f33432d.put(dialogContext.f33417a.ordinal(), weakReference);
                    }
                    MethodCollector.o(1568);
                    return;
                }
            }
            if (this.f33431c.size() + 1 <= this.f33433e) {
                this.f33431c.put(dialogContext.f33417a.ordinal(), weakReference);
                dialogContext.a();
                MethodCollector.o(1568);
                return;
            }
            if (dialogContext.f33423g) {
                this.f33432d.put(dialogContext.f33417a.ordinal(), weakReference);
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < this.f33431c.size(); i4++) {
                    arrayList.add(Integer.valueOf(this.f33431c.keyAt(i4)));
                }
                dialogContext.a(arrayList);
            }
            MethodCollector.o(1568);
            return;
        }
        if (dialogContext.f33423g) {
            dialogContext.a(this.f33429a, 0);
            this.f33432d.put(dialogContext.f33417a.ordinal(), weakReference);
        }
        MethodCollector.o(1568);
    }
}
