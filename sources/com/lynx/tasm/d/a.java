package com.lynx.tasm.d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f56555a;

    /* renamed from: b  reason: collision with root package name */
    public List<Pair<EnumC1269a, String>> f56556b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public d f56557c;

    static {
        Covode.recordClassIndex(35278);
    }

    /* renamed from: com.lynx.tasm.d.a$a  reason: collision with other inner class name */
    public enum EnumC1269a {
        URL,
        LOCAL;

        static {
            Covode.recordClassIndex(35279);
        }
    }

    public final void a(String str) {
        this.f56556b.add(new Pair<>(EnumC1269a.URL, str));
    }

    public final void b(String str) {
        this.f56556b.add(new Pair<>(EnumC1269a.LOCAL, str));
    }
}
