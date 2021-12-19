package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.v;

public final class cf {

    /* renamed from: a  reason: collision with root package name */
    public static final v f159085a = new v("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final v f159086b = new v("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c  reason: collision with root package name */
    public static final v f159087c = new v("COMPLETING_RETRY");

    /* renamed from: d  reason: collision with root package name */
    public static final v f159088d = new v("TOO_LATE_TO_CANCEL");

    /* renamed from: e  reason: collision with root package name */
    public static final v f159089e = new v("SEALED");

    /* renamed from: f  reason: collision with root package name */
    public static final bk f159090f = new bk(false);

    /* renamed from: g  reason: collision with root package name */
    public static final bk f159091g = new bk(true);

    static {
        Covode.recordClassIndex(105597);
    }

    public static final Object a(Object obj) {
        if (obj instanceof bu) {
            return new bv((bu) obj);
        }
        return obj;
    }

    public static final Object b(Object obj) {
        Object obj2;
        bu buVar;
        if (!(obj instanceof bv)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        bv bvVar = (bv) obj2;
        return (bvVar == null || (buVar = bvVar.f159056a) == null) ? obj : buVar;
    }
}
