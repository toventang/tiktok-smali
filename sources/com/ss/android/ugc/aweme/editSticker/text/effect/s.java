package com.ss.android.ugc.aweme.editSticker.text.effect;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final int f88590a = 50;

    /* renamed from: b  reason: collision with root package name */
    private final LruCache<String, LinearGradient> f88591b = new a(50, 50);

    static {
        Covode.recordClassIndex(55751);
    }

    private LinearGradient a(String str) {
        l.d(str, "");
        return this.f88591b.get(str);
    }

    public static final class a extends LruCache<String, LinearGradient> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f88592a;

        static {
            Covode.recordClassIndex(55752);
        }

        /* access modifiers changed from: protected */
        @Override // android.util.LruCache
        public final LinearGradient create(String str) {
            l.d(str, "");
            return null;
        }

        /* access modifiers changed from: protected */
        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, String str, LinearGradient linearGradient, LinearGradient linearGradient2) {
            l.d(str, "");
            l.d(linearGradient, "");
        }

        /* access modifiers changed from: protected */
        @Override // android.util.LruCache
        public final int sizeOf(String str, LinearGradient linearGradient) {
            l.d(str, "");
            l.d(linearGradient, "");
            return 1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i2, int i3) {
            super(i3);
            this.f88592a = i2;
        }
    }

    private void a(String str, LinearGradient linearGradient) {
        l.d(str, "");
        l.d(linearGradient, "");
        this.f88591b.put(str, linearGradient);
    }

    public final LinearGradient a(int i2, int i3, int i4, int i5) {
        String sb = new StringBuilder().append(i2).append('-').append(i3).append('-').append(0).append('-').append(0).append('-').append(i4).append('-').append(i5).toString();
        LinearGradient a2 = a(sb);
        if (a2 == null) {
            a2 = new LinearGradient(0.0f, 0.0f, (float) i4, (float) i5, i2, i3, Shader.TileMode.REPEAT);
        }
        a(sb, a2);
        return a2;
    }
}
