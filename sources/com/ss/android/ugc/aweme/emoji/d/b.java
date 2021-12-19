package com.ss.android.ugc.aweme.emoji.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.emoji.g.a;
import com.ss.android.ugc.aweme.emoji.systembigemoji.c;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class b extends c {

    /* renamed from: b  reason: collision with root package name */
    public List<a> f89120b;

    static {
        Covode.recordClassIndex(56049);
    }

    public static boolean c(int i2) {
        return i2 > 0;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final int a() {
        return 2131231994;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final int j() {
        return 4;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final String l() {
        return "4";
    }

    public b() {
        this.f89107a = 1;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final String e() {
        return d.a().getString(R.string.bmo);
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final int g() {
        int size;
        if (this.f89431c == null || this.f89431c.size() == 0 || (size = ((this.f89431c.size() - 1) / 8) + 1) < 2) {
            return 2;
        }
        return size;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b, com.ss.android.ugc.aweme.emoji.systembigemoji.c
    public final List<com.ss.android.ugc.aweme.emoji.b.a> b(int i2) {
        ArrayList arrayList = new ArrayList(8);
        a(arrayList, i2);
        a(arrayList);
        return arrayList;
    }

    private static void a(List<com.ss.android.ugc.aweme.emoji.b.a> list) {
        while (list.size() < 8) {
            list.add(new com.ss.android.ugc.aweme.emoji.b.a());
        }
    }

    private void a(List<com.ss.android.ugc.aweme.emoji.b.a> list, int i2) {
        if (this.f89431c != null) {
            int min = Math.min(this.f89431c.size(), (i2 + 1) * 8);
            for (int i3 = i2 * 8; i3 < min; i3++) {
                a aVar = (a) this.f89431c.get(i3);
                if (aVar != null) {
                    com.ss.android.ugc.aweme.emoji.b.a aVar2 = new com.ss.android.ugc.aweme.emoji.b.a();
                    aVar2.f89105c = com.ss.android.ugc.aweme.emoji.d.a.a.b(aVar);
                    aVar2.f89106d = aVar;
                    list.add(aVar2);
                } else if (i3 == 8) {
                    com.ss.android.ugc.aweme.emoji.b.a aVar3 = new com.ss.android.ugc.aweme.emoji.b.a();
                    aVar3.f89103a = 2131231993;
                    a aVar4 = new a();
                    aVar4.setStickerType(10);
                    aVar4.setDisplayName(d.a().getString(R.string.bn7));
                    aVar3.f89106d = aVar4;
                    list.add(aVar3);
                } else {
                    list.add(new com.ss.android.ugc.aweme.emoji.b.a());
                }
            }
        }
    }
}
