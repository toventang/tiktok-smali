package com.bytedance.ug.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class p implements j {

    /* renamed from: a  reason: collision with root package name */
    private final f f45750a;

    /* renamed from: b  reason: collision with root package name */
    private k f45751b;

    /* renamed from: c  reason: collision with root package name */
    private List<l> f45752c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    private AtomicInteger f45753d = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(27838);
    }

    private j a(l lVar) {
        this.f45752c.add(lVar);
        return this;
    }

    p(f fVar) {
        l gVar;
        this.f45750a = fVar;
        a(new m(fVar.f45730b));
        if (fVar.f45732d) {
            int i2 = fVar.f45733e;
            if (i2 != 1) {
                gVar = i2 == 2 ? new g() : gVar;
            } else {
                gVar = new h(fVar.f45729a, fVar.f45730b);
            }
            a(gVar);
        }
        this.f45751b = new c(fVar.f45730b, fVar.f45731c);
    }

    @Override // com.bytedance.ug.a.j
    public final void a(String str, int i2, String str2) {
        a(str, i2, str2, null);
    }

    @Override // com.bytedance.ug.a.j
    public final void a(String str, int i2, String str2, JSONObject jSONObject) {
        if (i2 != 0 && TextUtils.isEmpty(str2)) {
            str2 = "other error";
        }
        a aVar = new a(this.f45753d.addAndGet(1));
        aVar.f45718a = this.f45750a.f45730b;
        aVar.f45719b = this.f45750a.f45731c;
        aVar.f45721d = str;
        aVar.f45723f = i2;
        aVar.f45725h = jSONObject;
        aVar.f45722e = str2;
        aVar.f45724g = String.valueOf(System.currentTimeMillis());
        this.f45751b.a("ug_sdk_action_check", aVar.a());
        for (l lVar : this.f45752c) {
            lVar.a(aVar);
        }
    }
}
