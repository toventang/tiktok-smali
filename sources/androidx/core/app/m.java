package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f2245a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f2246b;

    /* renamed from: c  reason: collision with root package name */
    public String f2247c;

    /* renamed from: d  reason: collision with root package name */
    public String f2248d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2249e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2250f;

    static {
        Covode.recordClassIndex(692);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f2251a;

        /* renamed from: b  reason: collision with root package name */
        IconCompat f2252b;

        /* renamed from: c  reason: collision with root package name */
        String f2253c;

        /* renamed from: d  reason: collision with root package name */
        String f2254d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2255e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2256f;

        static {
            Covode.recordClassIndex(693);
        }

        public final m a() {
            return new m(this);
        }
    }

    public final Bundle a() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence(StringSet.name, this.f2245a);
        IconCompat iconCompat = this.f2246b;
        if (iconCompat != null) {
            bundle = iconCompat.c();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f2247c);
        bundle2.putString("key", this.f2248d);
        bundle2.putBoolean("isBot", this.f2249e);
        bundle2.putBoolean("isImportant", this.f2250f);
        return bundle2;
    }

    public final Person b() {
        Icon icon;
        Person.Builder name = new Person.Builder().setName(this.f2245a);
        IconCompat iconCompat = this.f2246b;
        if (iconCompat != null) {
            icon = iconCompat.b();
        } else {
            icon = null;
        }
        return name.setIcon(icon).setUri(this.f2247c).setKey(this.f2248d).setBot(this.f2249e).setImportant(this.f2250f).build();
    }

    m(a aVar) {
        this.f2245a = aVar.f2251a;
        this.f2246b = aVar.f2252b;
        this.f2247c = aVar.f2253c;
        this.f2248d = aVar.f2254d;
        this.f2249e = aVar.f2255e;
        this.f2250f = aVar.f2256f;
    }
}
