package com.ss.android.ugc.aweme.emoji.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.i.b.a;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class b extends com.ss.android.ugc.aweme.emoji.b.b {

    /* renamed from: b  reason: collision with root package name */
    protected int f89345b;

    /* renamed from: c  reason: collision with root package name */
    private Context f89346c;

    /* renamed from: d  reason: collision with root package name */
    private a f89347d = new a();

    static {
        Covode.recordClassIndex(56141);
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
    public final int k() {
        n();
        return this.f89345b;
    }

    private void n() {
        if (this.f89345b == 0) {
            this.f89345b = this.f89347d.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final Drawable d() {
        return this.f89347d.a(this.f89346c);
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final int g() {
        n();
        int i2 = this.f89345b;
        if (i2 == 0) {
            return 1;
        }
        return ((i2 - 1) / 20) + 1;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final String l() {
        return String.valueOf(j());
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final List<com.ss.android.ugc.aweme.emoji.b.a> m() {
        a aVar = this.f89347d;
        return aVar.a(0, aVar.a());
    }

    public b(Context context) {
        this.f89346c = context;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.f, com.ss.android.ugc.aweme.emoji.b.b
    public final List<com.ss.android.ugc.aweme.emoji.b.a> b(int i2) {
        List<com.ss.android.ugc.aweme.emoji.b.a> a2 = this.f89347d.a(i2 * 20, 20);
        com.ss.android.ugc.aweme.emoji.b.a aVar = new com.ss.android.ugc.aweme.emoji.b.a();
        aVar.f89103a = R.drawable.a7k;
        a2.add(aVar);
        return a2;
    }
}
