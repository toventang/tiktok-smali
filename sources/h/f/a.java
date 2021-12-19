package h.f;

import com.bytedance.covode.number.Covode;
import h.f.b.d;
import h.f.b.l;
import h.k.c;
import java.util.Objects;

public final class a {
    static {
        Covode.recordClassIndex(105174);
    }

    public static final <T> Class<T> a(c<T> cVar) {
        l.d(cVar, "");
        Class<T> cls = (Class<T>) ((d) cVar).a();
        Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<T>");
        return cls;
    }

    public static final <T> Class<T> b(c<T> cVar) {
        l.d(cVar, "");
        Class<T> cls = (Class<T>) ((d) cVar).a();
        if (!cls.isPrimitive()) {
            Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<T>");
            return cls;
        }
        String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        cls = (Class<T>) Double.class;
                        break;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        cls = (Class<T>) Integer.class;
                        break;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        cls = (Class<T>) Byte.class;
                        break;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        cls = (Class<T>) Character.class;
                        break;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        cls = (Class<T>) Long.class;
                        break;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        cls = (Class<T>) Void.class;
                        break;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        cls = (Class<T>) Boolean.class;
                        break;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        cls = (Class<T>) Float.class;
                        break;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        cls = (Class<T>) Short.class;
                        break;
                    }
                    break;
            }
        }
        Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<T>");
        return cls;
    }
}
