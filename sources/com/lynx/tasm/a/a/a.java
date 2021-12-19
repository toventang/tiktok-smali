package com.lynx.tasm.a.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.a.b;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public b[] f55598a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, c> f55599b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<LynxUI> f55600c;

    static {
        Covode.recordClassIndex(34810);
    }

    private LynxUI c() {
        return this.f55600c.get();
    }

    public final void b() {
        HashMap<String, c> hashMap = this.f55599b;
        if (hashMap != null) {
            for (c cVar : hashMap.values()) {
                cVar.a();
            }
            this.f55599b = null;
            this.f55598a = null;
        }
    }

    public final void a() {
        c cVar;
        if (this.f55598a == null) {
            return;
        }
        if (!(c().getHeight() == 0 && c().getWidth() == 0)) {
            HashMap<String, c> hashMap = new HashMap<>();
            b[] bVarArr = this.f55598a;
            for (b bVar : bVarArr) {
                if (bVar != null && !TextUtils.isEmpty(bVar.f55633a)) {
                    HashMap<String, c> hashMap2 = this.f55599b;
                    if (hashMap2 == null || (cVar = hashMap2.get(bVar.f55633a)) == null) {
                        cVar = new c(c().mView, c());
                    } else {
                        this.f55599b.remove(bVar.f55633a);
                    }
                    hashMap.put(bVar.f55633a, cVar);
                }
            }
            HashMap<String, c> hashMap3 = this.f55599b;
            if (hashMap3 != null) {
                for (c cVar2 : hashMap3.values()) {
                    cVar2.a();
                }
            }
            b[] bVarArr2 = this.f55598a;
            for (b bVar2 : bVarArr2) {
                if (bVar2 != null && !TextUtils.isEmpty(bVar2.f55633a)) {
                    hashMap.get(bVar2.f55633a).a(bVar2);
                }
            }
            this.f55599b = hashMap;
        }
    }

    public a(LynxUI lynxUI) {
        this.f55600c = new WeakReference<>(lynxUI);
    }

    public final void a(String str, Object obj) {
        HashMap<String, c> hashMap = this.f55599b;
        if (hashMap != null) {
            for (c cVar : hashMap.values()) {
                if (cVar.f55605b.containsKey(str)) {
                    cVar.f55605b.put(str, obj);
                }
                if (str.equals("BackgroundColor") && cVar.f55605b.containsKey("Color")) {
                    cVar.f55605b.put("Color", obj);
                }
            }
        }
    }
}
