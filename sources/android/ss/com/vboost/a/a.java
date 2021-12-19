package android.ss.com.vboost.a;

import android.ss.com.vboost.CapabilityType;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f388a = a.class.getName();

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<String, String> f389b = new LinkedHashMap<>(64);

    static {
        Covode.recordClassIndex(8);
    }

    public final Set<CapabilityType> a() {
        String str = this.f389b.get("support_capability_set");
        if (str == null) {
            return null;
        }
        TextUtils.SimpleStringSplitter<String> simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
        simpleStringSplitter.setString(str);
        HashSet hashSet = new HashSet();
        for (String str2 : simpleStringSplitter) {
            hashSet.add(CapabilityType.valueOf(Integer.parseInt(str2)));
        }
        if (hashSet.size() == 0) {
            return null;
        }
        return hashSet;
    }

    public final void a(b bVar) {
        b("cpu_core_limit_by", Integer.toString(bVar.ordinal()));
    }

    public final void a(d dVar) {
        a("task_priority_limit_rule", dVar.f398a + "," + dVar.f399b + "," + dVar.f400c);
    }

    public final void a(Set<CapabilityType> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<CapabilityType> it = set.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getIndex());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        a("support_capability_set", sb.toString());
    }

    private void b(String str, String str2) {
        this.f389b.remove(str);
        this.f389b.put(str, str2);
    }

    private void a(String str, String str2) {
        if (str.indexOf(61) == -1 && str.indexOf(59) == -1 && str.indexOf(0) == -1 && str2.indexOf(61) == -1 && str2.indexOf(59) == -1 && str2.indexOf(0) == -1) {
            b(str, str2);
        }
    }

    public final void a(CapabilityType capabilityType, List<c> list) {
        String str;
        String str2;
        String str3 = capabilityType.getName() + "_limit_rule";
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c cVar = list.get(i2);
            sb.append("(");
            String str4 = "1";
            if (cVar.f391a) {
                str = str4;
            } else {
                str = "0";
            }
            sb.append(str).append(":").append(cVar.f392b).append(":").append(cVar.f393c);
            sb.append(",");
            if (cVar.f394d) {
                str2 = str4;
            } else {
                str2 = "0";
            }
            sb.append(str2).append(":").append(cVar.f395e);
            sb.append(",");
            if (!cVar.f396f) {
                str4 = "0";
            }
            sb.append(str4).append(":").append(cVar.f397g);
            sb.append(")");
            if (i2 != list.size() - 1) {
                sb.append(',');
            }
        }
        a(str3, sb.toString());
    }
}
