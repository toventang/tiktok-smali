package com.bytedance.lottie.c.b;

import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.a.b;
import com.bytedance.lottie.a.a.f;
import com.bytedance.lottie.c.a.a;
import com.bytedance.lottie.c.a.d;
import com.bytedance.lottie.i;

public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Path.FillType f40554a;

    /* renamed from: b  reason: collision with root package name */
    public final String f40555b;

    /* renamed from: c  reason: collision with root package name */
    public final a f40556c;

    /* renamed from: d  reason: collision with root package name */
    public final d f40557d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f40558e;

    static {
        Covode.recordClassIndex(24904);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f40558e + '}';
    }

    @Override // com.bytedance.lottie.c.b.b
    public final b a(i iVar, com.bytedance.lottie.c.c.a aVar) {
        return new f(iVar, aVar, this);
    }

    public m(String str, boolean z, Path.FillType fillType, a aVar, d dVar) {
        this.f40555b = str;
        this.f40558e = z;
        this.f40554a = fillType;
        this.f40556c = aVar;
        this.f40557d = dVar;
    }
}
