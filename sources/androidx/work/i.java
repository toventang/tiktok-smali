package androidx.work;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public UUID f4508a;

    /* renamed from: b  reason: collision with root package name */
    public a f4509b;

    /* renamed from: c  reason: collision with root package name */
    public e f4510c;

    /* renamed from: d  reason: collision with root package name */
    public Set<String> f4511d;

    static {
        Covode.recordClassIndex(1756);
    }

    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            if (this == SUCCEEDED || this == FAILED || this == CANCELLED) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(1757);
        }
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        UUID uuid = this.f4508a;
        int i5 = 0;
        if (uuid != null) {
            i2 = uuid.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = i2 * 31;
        a aVar = this.f4509b;
        if (aVar != null) {
            i3 = aVar.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        e eVar = this.f4510c;
        if (eVar != null) {
            i4 = eVar.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        Set<String> set = this.f4511d;
        if (set != null) {
            i5 = set.hashCode();
        }
        return i8 + i5;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.f4508a + '\'' + ", mState=" + this.f4509b + ", mOutputData=" + this.f4510c + ", mTags=" + this.f4511d + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            i iVar = (i) obj;
            UUID uuid = this.f4508a;
            if (uuid == null ? iVar.f4508a != null : !uuid.equals(iVar.f4508a)) {
                return false;
            }
            if (this.f4509b != iVar.f4509b) {
                return false;
            }
            e eVar = this.f4510c;
            if (eVar == null ? iVar.f4510c != null : !eVar.equals(iVar.f4510c)) {
                return false;
            }
            Set<String> set = this.f4511d;
            Set<String> set2 = iVar.f4511d;
            if (set != null) {
                return set.equals(set2);
            }
            if (set2 == null) {
                return true;
            }
        }
        return false;
    }

    public i(UUID uuid, a aVar, e eVar, List<String> list) {
        this.f4508a = uuid;
        this.f4509b = aVar;
        this.f4510c = eVar;
        this.f4511d = new HashSet(list);
    }
}
