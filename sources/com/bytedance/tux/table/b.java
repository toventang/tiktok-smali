package com.bytedance.tux.table;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public abstract class b extends Enum<b> {
    public static final b PADDING_16;
    public static final b PADDING_32;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ b[] f45408a;

    static {
        Covode.recordClassIndex(27647);
        a aVar = new a("PADDING_16");
        PADDING_16 = aVar;
        C1115b bVar = new C1115b("PADDING_32");
        PADDING_32 = bVar;
        f45408a = new b[]{aVar, bVar};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f45408a.clone();
    }

    public abstract int toPx();

    static final class a extends b {
        static {
            Covode.recordClassIndex(27648);
        }

        @Override // com.bytedance.tux.table.b
        public final int toPx() {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            return h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(String str) {
            super(str, 0, null);
        }
    }

    /* renamed from: com.bytedance.tux.table.b$b  reason: collision with other inner class name */
    static final class C1115b extends b {
        static {
            Covode.recordClassIndex(27649);
        }

        @Override // com.bytedance.tux.table.b
        public final int toPx() {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            return h.g.a.a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics()));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1115b(String str) {
            super(str, 1, null);
        }
    }

    private b(String str, int i2) {
    }

    public /* synthetic */ b(String str, int i2, g gVar) {
        this(str, i2);
    }
}
