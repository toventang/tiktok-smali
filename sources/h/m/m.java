package h.m;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import java.util.regex.Matcher;

public final class m {
    static {
        Covode.recordClassIndex(105361);
    }

    public static final class a extends h.f.b.m implements b<T, Boolean> {
        final /* synthetic */ int $value$inlined;

        static {
            Covode.recordClassIndex(105362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i2) {
            super(1);
            this.$value$inlined = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.valueOf(invoke((Enum) obj));
        }

        public final boolean invoke(T t) {
            T t2 = t;
            if ((this.$value$inlined & t2.getMask()) == t2.getValue()) {
                return true;
            }
            return false;
        }
    }

    public static final int a(Iterable<? extends f> iterable) {
        int i2 = 0;
        for (f fVar : iterable) {
            i2 |= fVar.getValue();
        }
        return i2;
    }

    public static final j a(Matcher matcher, int i2, CharSequence charSequence) {
        if (!matcher.find(i2)) {
            return null;
        }
        return new k(matcher, charSequence);
    }
}
