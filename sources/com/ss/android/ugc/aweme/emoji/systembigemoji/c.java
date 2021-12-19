package com.ss.android.ugc.aweme.emoji.systembigemoji;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.b.b;
import com.ss.android.ugc.aweme.emoji.g.a;
import java.util.ArrayList;
import java.util.List;

public class c extends b {

    /* renamed from: c  reason: collision with root package name */
    public List<a> f89431c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.emoji.emojichoose.model.b f89432d;

    static {
        Covode.recordClassIndex(56194);
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public int a() {
        return 2131231996;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public int j() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final String b() {
        return this.f89432d.getIconUrl();
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final Drawable d() {
        return super.d();
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public String e() {
        return this.f89432d.getDisplayName();
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.b
    public final int h() {
        if (i()) {
            return 8;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public boolean i() {
        List<a> list = this.f89431c;
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final int k() {
        List<a> list = this.f89431c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public int g() {
        if (!i()) {
            return 1;
        }
        return ((this.f89431c.size() - 1) / 8) + 1;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public String l() {
        return j() + "-" + this.f89432d.getId();
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final List<com.ss.android.ugc.aweme.emoji.b.a> m() {
        a aVar;
        ArrayList arrayList = new ArrayList(8);
        for (int i2 = 0; i2 < this.f89431c.size(); i2++) {
            com.ss.android.ugc.aweme.emoji.b.a aVar2 = new com.ss.android.ugc.aweme.emoji.b.a();
            if (i2 >= 0 && i2 < this.f89431c.size() && (aVar = this.f89431c.get(i2)) != null) {
                aVar2.f89105c = com.ss.android.ugc.aweme.emoji.d.a.a.b(aVar);
                aVar2.f89106d = aVar;
            }
            arrayList.add(aVar2);
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public List<com.ss.android.ugc.aweme.emoji.b.a> b(int i2) {
        a aVar;
        ArrayList arrayList = new ArrayList(8);
        for (int i3 = i2 * 8; i3 < (i2 + 1) * 8; i3++) {
            com.ss.android.ugc.aweme.emoji.b.a aVar2 = new com.ss.android.ugc.aweme.emoji.b.a();
            if (i3 >= 0 && i3 < this.f89431c.size() && (aVar = this.f89431c.get(i3)) != null) {
                aVar2.f89105c = com.ss.android.ugc.aweme.emoji.d.a.a.b(aVar);
                aVar2.f89106d = aVar;
            }
            arrayList.add(aVar2);
        }
        return arrayList;
    }
}
