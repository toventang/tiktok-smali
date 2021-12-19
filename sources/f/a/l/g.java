package f.a.l;

import com.bytedance.covode.number.Covode;
import f.a.t;
import f.a.z;

public abstract class g<T> extends t<T> implements z<T> {
    static {
        Covode.recordClassIndex(104930);
    }

    public final g<T> j() {
        if (this instanceof e) {
            return this;
        }
        return new e(this);
    }
}
