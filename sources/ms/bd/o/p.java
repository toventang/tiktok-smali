package ms.bd.o;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
public class p implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f159538a;

    static {
        Covode.recordClassIndex(105940);
    }

    p(String str) {
        this.f159538a = str;
    }

    public boolean accept(File file, String str) {
        return str.startsWith(this.f159538a);
    }
}
