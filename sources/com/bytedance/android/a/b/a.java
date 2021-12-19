package com.bytedance.android.a.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.a.b.b.a.e;
import com.bytedance.android.a.b.b.c;
import com.bytedance.android.a.b.c.b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public final class a extends com.bytedance.android.a.a.g.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public b f6680a;

    /* renamed from: b  reason: collision with root package name */
    private C0089a f6681b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.android.a.b.d.b f6682c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.android.a.b.b.a f6683d;

    static {
        Covode.recordClassIndex(3215);
    }

    @Override // com.bytedance.android.a.a.g.a
    public final String b() {
        return "c2s";
    }

    /* renamed from: com.bytedance.android.a.b.a$a  reason: collision with other inner class name */
    public static class C0089a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6684a = true;

        /* renamed from: b  reason: collision with root package name */
        public com.bytedance.android.a.b.a.a f6685b;

        /* renamed from: c  reason: collision with root package name */
        public List<e> f6686c;

        static {
            Covode.recordClassIndex(3216);
        }

        public final a a() {
            return new a(this, (byte) 0);
        }

        public final C0089a a(e... eVarArr) {
            if (this.f6686c == null) {
                this.f6686c = new ArrayList();
            }
            int i2 = 0;
            do {
                e eVar = eVarArr[0];
                if (eVar != null) {
                    this.f6686c.add(eVar);
                }
                i2++;
            } while (i2 <= 0);
            return this;
        }
    }

    @Override // com.bytedance.android.a.a.g.a
    public final void d() {
        a(false);
    }

    @Override // com.bytedance.android.a.a.g.a
    public final void e() {
        a(true);
    }

    @Override // com.bytedance.android.a.a.g.a
    public final void f() {
        com.bytedance.android.a.a.h.a.a("c2s is releasing");
    }

    @Override // com.bytedance.android.a.a.g.c
    public final void a() {
        com.bytedance.android.a.a.f.a aVar = com.bytedance.android.a.a.e.d().f6645c;
        if (aVar != null) {
            String b2 = b();
            if (!TextUtils.isEmpty(b2)) {
                if (aVar.f6664h == null) {
                    aVar.f6664h = new HashMap();
                }
                JSONObject jSONObject = aVar.f6664h.get(b2);
                if (jSONObject != null) {
                    this.f6680a.a(jSONObject);
                    this.f6682c.a(this.f6680a.f6713d);
                }
            }
        }
    }

    @Override // com.bytedance.android.a.a.g.a
    public final void c() {
        b.a aVar = new b.a();
        aVar.f6723a = this.f6681b.f6684a;
        aVar.f6725c = this.f6681b.f6685b;
        this.f6680a = new b(aVar, (byte) 0);
        this.f6683d = new com.bytedance.android.a.b.b.a(this, this.f6681b.f6686c);
        this.f6682c = new com.bytedance.android.a.b.d.a(this);
    }

    private a(C0089a aVar) {
        this.f6681b = aVar;
    }

    private void a(boolean z) {
        if (!this.f6680a.f6670i) {
            com.bytedance.android.a.a.h.a.a("c2s tracker is disabled");
            return;
        }
        List<com.bytedance.android.a.a.d.b> c2 = this.f6682c.c();
        if (!(c2 == null || c2.isEmpty())) {
            b.a().b();
            boolean z2 = false;
            for (com.bytedance.android.a.a.d.b bVar : c2) {
                if (!z || bVar.f6631m) {
                    if (z2 || !com.bytedance.android.a.a.h.e.f6671a.a()) {
                        com.bytedance.android.a.a.h.a.a("try resend cached event when offline");
                        bVar.f6628j++;
                        this.f6682c.c(bVar);
                        z2 = true;
                    } else {
                        a(bVar, true);
                    }
                }
            }
        }
    }

    /* synthetic */ a(C0089a aVar, byte b2) {
        this(aVar);
    }

    private void a(com.bytedance.android.a.a.d.b bVar, boolean z) {
        com.bytedance.android.a.a.h.a.a(bVar.toString());
        List<String> list = bVar.f6624f;
        if (z || bVar.b()) {
            this.f6682c.b(bVar);
        }
        if (!bVar.b()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long uptimeMillis = SystemClock.uptimeMillis();
                c a2 = this.f6683d.a(list.get(i2), bVar);
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                int i3 = this.f6680a.f6718j;
                if (a2 != null && i3 > 0) {
                    com.bytedance.android.a.a.h.a.a("cost:" + uptimeMillis2 + " code:" + a2.f6704a + " msg:" + a2.f6705b);
                }
            }
            return;
        }
        com.bytedance.android.a.a.h.a.a("event expired:" + bVar.toString());
        com.bytedance.android.a.a.h.b.onEventExpired(bVar);
    }

    @Override // com.bytedance.android.a.a.g.c
    public final void a(View view, com.bytedance.android.a.a.d.a aVar) {
        String str;
        if (!(aVar instanceof com.bytedance.android.a.a.d.b)) {
            StringBuilder sb = new StringBuilder("incompatible event type: ");
            if (aVar != null) {
                str = aVar.getClass().getName();
            } else {
                str = "null";
            }
            com.bytedance.android.a.a.h.a.a(sb.append(str).toString());
        } else if (!this.f6680a.f6670i) {
            com.bytedance.android.a.a.h.a.a("c2s tracker is disabled");
        } else {
            com.bytedance.android.a.a.d.b bVar = (com.bytedance.android.a.a.d.b) aVar;
            List<String> list = bVar.f6624f;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : list) {
                    if (TextUtils.isEmpty(str2) || (!str2.startsWith("http://") && !str2.startsWith("https://"))) {
                        com.bytedance.android.a.a.h.a.a("not a valid http url:".concat(String.valueOf(str2)));
                        arrayList.add(str2);
                    }
                }
                list.removeAll(arrayList);
                if (!list.isEmpty()) {
                    bVar.f6624f = list;
                    b.a().a("c2s_network_type_on_trigger", com.bytedance.android.a.a.h.e.f6671a.b(), (JSONObject) null);
                    if (!com.bytedance.android.a.a.h.e.f6671a.a()) {
                        com.bytedance.android.a.a.h.a.a("network not available now, try saving event");
                        if (this.f6680a.f6712c) {
                            bVar.f6628j++;
                            if (!this.f6682c.a(bVar)) {
                                com.bytedance.android.a.a.h.a.a("save event failed when offline");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    a(bVar, false);
                    return;
                }
            }
            com.bytedance.android.a.a.h.a.a("filtered urls is empty");
        }
    }
}
