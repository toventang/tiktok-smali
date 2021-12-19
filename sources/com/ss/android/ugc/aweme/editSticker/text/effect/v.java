package com.ss.android.ugc.aweme.editSticker.text.effect;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class v {

    /* renamed from: a */
    private final int f88600a = 50;

    /* renamed from: b */
    private final LruCache<String, StaticLayout> f88601b = new a(50, 50);

    static {
        Covode.recordClassIndex(55756);
    }

    public static final class a extends LruCache<String, StaticLayout> {

        /* renamed from: a */
        final /* synthetic */ int f88602a;

        static {
            Covode.recordClassIndex(55757);
        }

        @Override // android.util.LruCache
        public final StaticLayout create(String str) {
            l.d(str, "");
            return null;
        }

        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, String str, StaticLayout staticLayout, StaticLayout staticLayout2) {
            l.d(str, "");
            l.d(staticLayout, "");
        }

        @Override // android.util.LruCache
        public final int sizeOf(String str, StaticLayout staticLayout) {
            l.d(str, "");
            l.d(staticLayout, "");
            return 1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i2, int i3) {
            super(i3);
            this.f88602a = i2;
        }
    }

    /* access modifiers changed from: public */
    private StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i2, int i3, Layout.Alignment alignment, float f2, float f3, int i4) {
        l.d(charSequence, "");
        l.d(textPaint, "");
        l.d(alignment, "");
        String sb = new StringBuilder().append(charSequence).append('-').append(0).append('-').append(i3).append('-').append(textPaint).append('-').append(i2).append('-').append(alignment).append('-').append(f2).append('-').append(f3).append('-').append(true).append('-').append(i4).append('-').append((Object) null).toString();
        l.d(sb, "");
        StaticLayout staticLayout = this.f88601b.get(sb);
        if (staticLayout == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = StaticLayout.Builder.obtain(charSequence, 0, i3, textPaint, i2).setAlignment(alignment).setLineSpacing(f3, f2).setIncludePad(true).setEllipsizedWidth(i4).setEllipsize(null).build();
            } else {
                staticLayout = new StaticLayout(charSequence, 0, i3, textPaint, i2, alignment, f2, f3, true, null, i4);
            }
            l.b(staticLayout, "");
        }
        l.d(sb, "");
        l.d(staticLayout, "");
        this.f88601b.put(sb, staticLayout);
        return staticLayout;
    }
}
