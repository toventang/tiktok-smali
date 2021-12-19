package com.ss.android.ugc.aweme.emoji.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.emoji.b.a;
import com.ss.android.ugc.aweme.emoji.systembigemoji.c;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class b extends c {
    static {
        Covode.recordClassIndex(56130);
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final int a() {
        return 2131231995;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final int j() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final String l() {
        return "3";
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final String e() {
        return d.a().getString(R.string.bmq);
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final int g() {
        if (this.f89431c == null || this.f89431c.size() == 0) {
            return 1;
        }
        return ((this.f89431c.size() - 1) / 8) + 1;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final List<a> b(int i2) {
        ArrayList arrayList = new ArrayList(8);
        a(arrayList, i2);
        a(arrayList);
        return arrayList;
    }

    private static void a(List<a> list) {
        while (list.size() < 8) {
            list.add(new a());
        }
    }

    private void a(List<a> list, int i2) {
        if (this.f89431c != null) {
            int min = Math.min(this.f89431c.size(), (i2 + 1) * 8);
            for (int i3 = i2 * 8; i3 < min; i3++) {
                com.ss.android.ugc.aweme.emoji.g.a aVar = (com.ss.android.ugc.aweme.emoji.g.a) this.f89431c.get(i3);
                a aVar2 = new a();
                if (aVar == null) {
                    com.ss.android.ugc.aweme.emoji.g.a aVar3 = new com.ss.android.ugc.aweme.emoji.g.a();
                    aVar3.setStickerType(2);
                    aVar2.f89106d = aVar3;
                    aVar2.f89103a = 2131231984;
                    aVar2.f89105c = d.a().getString(R.string.bmq);
                } else {
                    aVar2.f89105c = com.ss.android.ugc.aweme.emoji.d.a.a.b(aVar);
                    aVar2.f89106d = aVar;
                }
                list.add(aVar2);
            }
        }
    }
}
