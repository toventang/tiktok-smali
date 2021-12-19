package d.a.g;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f156642a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(104010);
    }

    public static <T> boolean a(List<? extends T> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean a(Map<?, ?> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }
}
