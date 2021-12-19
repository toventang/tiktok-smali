package com.bytedance.webx.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.a.a;
import com.bytedance.webx.d.c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.webx.d.b f45915a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f45916b;

    /* renamed from: c  reason: collision with root package name */
    private String f45917c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f45918d;

    /* renamed from: e  reason: collision with root package name */
    private a f45919e;

    /* renamed from: f  reason: collision with root package name */
    private a f45920f;

    static {
        Covode.recordClassIndex(28071);
    }

    public b(com.bytedance.webx.d.b bVar) {
        this.f45915a = bVar;
    }

    public final void a(String str, int i2) {
        Boolean bool;
        if (str != null && str.startsWith("http") && !str.equals(this.f45917c)) {
            this.f45917c = str;
            try {
                this.f45918d = Uri.parse(str);
                String a2 = a.a(this.f45915a.d().f46007h, this.f45918d);
                if (a2 == null) {
                    a2 = this.f45918d.getQueryParameter("bdwk_extension");
                }
                if (i2 == 0) {
                    List<a.C1135a> a3 = a.a(0, a2);
                    if (this.f45919e == null) {
                        this.f45919e = new a();
                    }
                    for (a.C1135a aVar : a3) {
                        this.f45919e.a(aVar);
                    }
                }
                if (this.f45919e == null) {
                    com.bytedance.webx.b.a.a.a("AddressProcessor");
                    return;
                }
                List<a.C1135a> a4 = a.a(1, a2);
                a aVar2 = this.f45920f;
                if (aVar2 == null) {
                    this.f45920f = new a();
                } else {
                    aVar2.f45907a.clear();
                }
                for (a.C1135a aVar3 : a4) {
                    this.f45920f.a(aVar3);
                }
                a aVar4 = this.f45920f;
                for (Map.Entry<String, a.C1135a> entry : this.f45919e.f45907a.entrySet()) {
                    if (!aVar4.f45907a.containsKey(entry.getKey())) {
                        aVar4.f45907a.put(entry.getKey(), entry.getValue());
                    }
                }
                a aVar5 = this.f45920f;
                if (aVar5 != null && !aVar5.f45907a.isEmpty()) {
                    Iterator<c> c2 = this.f45915a.c();
                    while (c2.hasNext()) {
                        c next = c2.next();
                        if (next instanceof com.bytedance.webx.a) {
                            com.bytedance.webx.a aVar6 = (com.bytedance.webx.a) next;
                            if (aVar6.c()) {
                                a.C1135a aVar7 = aVar5.f45907a.get(aVar6.f45904g);
                                if (!(aVar7 == null || aVar7.f45909b == null)) {
                                    String str2 = aVar7.f45909b;
                                    str2.hashCode();
                                    if (str2.equals("0")) {
                                        bool = false;
                                    } else if (!str2.equals("1")) {
                                        bool = false;
                                    } else {
                                        bool = true;
                                    }
                                    if (bool != null) {
                                        aVar6.f45905h = bool.booleanValue();
                                        this.f45916b = true;
                                    }
                                }
                                aVar6.f45905h = aVar6.f45906i;
                            }
                        }
                    }
                } else if (this.f45916b) {
                    Iterator<c> c3 = this.f45915a.c();
                    while (c3.hasNext()) {
                        c next2 = c3.next();
                        if (next2 instanceof com.bytedance.webx.a) {
                            com.bytedance.webx.a aVar8 = (com.bytedance.webx.a) next2;
                            if (aVar8.c()) {
                                aVar8.f45905h = aVar8.f45906i;
                            }
                        }
                    }
                    this.f45916b = false;
                }
            } catch (Exception unused) {
                com.bytedance.webx.b.a.a.a("AddressProcessor");
            }
        }
    }
}
