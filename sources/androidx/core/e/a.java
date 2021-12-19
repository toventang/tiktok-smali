package androidx.core.e;

import android.util.Base64;
import androidx.core.g.g;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f2301a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2302b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2303c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f2304d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2305e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2306f;

    static {
        Covode.recordClassIndex(735);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2301a + ", mProviderPackage: " + this.f2302b + ", mQuery: " + this.f2303c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f2304d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f2304d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2305e);
        return sb.toString();
    }

    public a(String str, String str2, String str3) {
        String str4 = (String) g.a(str);
        this.f2301a = str4;
        String str5 = (String) g.a(str2);
        this.f2302b = str5;
        String str6 = (String) g.a(str3);
        this.f2303c = str6;
        this.f2304d = null;
        this.f2305e = R.array.f159888l;
        this.f2306f = str4 + "-" + str5 + "-" + str6;
    }

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        String str4 = (String) g.a(str);
        this.f2301a = str4;
        String str5 = (String) g.a(str2);
        this.f2302b = str5;
        String str6 = (String) g.a(str3);
        this.f2303c = str6;
        this.f2304d = (List) g.a(list);
        this.f2305e = 0;
        this.f2306f = str4 + "-" + str5 + "-" + str6;
    }
}
