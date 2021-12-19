package com.ss.android.ugc.aweme.emoji.sysemoji;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.b.a;
import com.ss.android.ugc.aweme.emoji.b.b;
import com.ss.android.ugc.aweme.emoji.sysemoji.g;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class q extends b {

    /* renamed from: b  reason: collision with root package name */
    protected int f89417b;

    /* renamed from: c  reason: collision with root package name */
    private Context f89418c;

    /* renamed from: d  reason: collision with root package name */
    private g f89419d = g.a.a();

    /* renamed from: e  reason: collision with root package name */
    private int f89420e;

    static {
        Covode.recordClassIndex(56183);
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final int a() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.b
    public final int h() {
        return 20;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final int j() {
        return 5;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final String l() {
        return "5";
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final int k() {
        n();
        return this.f89417b;
    }

    private void n() {
        if (this.f89417b == 0) {
            this.f89417b = g.b(this.f89420e);
        }
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final int g() {
        n();
        int i2 = this.f89417b;
        if (i2 == 0) {
            return 1;
        }
        return ((i2 - 1) / 20) + 1;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final String c() {
        String previewEmoji;
        int i2 = this.f89420e;
        h.f89395e.a(i2);
        List<i> list = h.f89394d.get(Integer.valueOf(i2));
        if (list == null || list.size() <= 0 || (previewEmoji = list.get(0).getPreviewEmoji()) == null) {
            return "😃";
        }
        return previewEmoji;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final List<a> m() {
        ArrayList arrayList = new ArrayList();
        List<i> a2 = g.a(this.f89420e);
        if (a2 == null) {
            return arrayList;
        }
        for (i iVar : a2) {
            a aVar = new a();
            aVar.f89105c = iVar.getPreviewEmoji();
            aVar.f89106d = iVar;
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public static List<i> a(List<a> list) {
        if (list == null || list.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            com.ss.android.ugc.aweme.emoji.g.a aVar2 = aVar.f89106d;
            if (aVar2 instanceof i) {
                arrayList.add(aVar2);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final List<a> b(int i2) {
        ArrayList arrayList = new ArrayList();
        List<i> a2 = g.a(this.f89420e, i2 * 20);
        if (a2 == null) {
            return arrayList;
        }
        for (i iVar : a2) {
            a aVar = new a();
            aVar.f89105c = iVar.getPreviewEmoji();
            aVar.f89106d = iVar;
            arrayList.add(aVar);
        }
        a aVar2 = new a();
        aVar2.f89103a = R.drawable.a7k;
        arrayList.add(aVar2);
        return arrayList;
    }

    public q(Context context, int i2) {
        this.f89418c = context;
        this.f89420e = i2;
    }
}
