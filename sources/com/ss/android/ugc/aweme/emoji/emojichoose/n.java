package com.ss.android.ugc.aweme.emoji.emojichoose;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.emoji.b.f;
import com.ss.android.ugc.aweme.emoji.g.a;
import com.ss.android.ugc.aweme.emoji.i.b;
import com.ss.android.ugc.aweme.emoji.sysemoji.q;
import com.ss.android.ugc.aweme.emoji.systembigemoji.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public f f89283a;

    /* renamed from: b  reason: collision with root package name */
    public List<f> f89284b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f89285c;

    /* renamed from: d  reason: collision with root package name */
    private b f89286d;

    /* renamed from: e  reason: collision with root package name */
    private q f89287e;

    /* renamed from: f  reason: collision with root package name */
    private d f89288f;

    static {
        Covode.recordClassIndex(56108);
    }

    public final int c() {
        return this.f89284b.size();
    }

    public final int b() {
        f fVar = this.f89283a;
        if (fVar == null) {
            return 0;
        }
        return fVar.f();
    }

    private void d() {
        if (this.f89288f.f89223a) {
            if (this.f89286d == null) {
                this.f89286d = new b(d.a());
            }
            a(this.f89286d);
        }
    }

    private void e() {
        if (this.f89288f.f89227e) {
            if (this.f89287e == null) {
                this.f89287e = new q(d.a(), this.f89288f.f89229g);
            }
            a(this.f89287e);
        }
    }

    public final void a() {
        LinkedHashMap<com.ss.android.ugc.aweme.emoji.emojichoose.model.b, List<a>> linkedHashMap;
        this.f89284b.clear();
        d();
        e();
        if (this.f89288f.f89226d && (linkedHashMap = com.ss.android.ugc.aweme.emoji.systembigemoji.a.f89422a) != null && !linkedHashMap.isEmpty()) {
            for (Map.Entry<com.ss.android.ugc.aweme.emoji.emojichoose.model.b, List<a>> entry : linkedHashMap.entrySet()) {
                c cVar = new c();
                cVar.f89432d = entry.getKey();
                cVar.f89431c = entry.getValue();
                a(cVar);
            }
        }
        if (this.f89285c >= c()) {
            a(0);
        }
    }

    public n(d dVar) {
        this.f89288f = dVar;
        d();
        e();
        a(0);
    }

    private void a(f fVar) {
        if (this.f89284b == null) {
            this.f89284b = new ArrayList();
        }
        this.f89284b.add(fVar);
    }

    public final f b(int i2) {
        return this.f89284b.get(i2);
    }

    public final void a(int i2) {
        if (i2 >= 0 && i2 < c()) {
            this.f89285c = i2;
            this.f89283a = this.f89284b.get(i2);
        }
    }
}
