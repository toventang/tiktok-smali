package com.bytedance.push.k;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public List<b> f42219a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public String f42220b;

    /* renamed from: c  reason: collision with root package name */
    public String f42221c;

    /* renamed from: d  reason: collision with root package name */
    public String f42222d;

    /* renamed from: e  reason: collision with root package name */
    public String f42223e;

    static {
        Covode.recordClassIndex(25798);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        List<String> f42225a;

        /* renamed from: b  reason: collision with root package name */
        List<String> f42226b;

        /* renamed from: c  reason: collision with root package name */
        Uri f42227c;

        /* renamed from: d  reason: collision with root package name */
        String f42228d;

        static {
            Covode.recordClassIndex(25800);
        }

        public final int hashCode() {
            int i2;
            int i3;
            int i4;
            List<String> list = this.f42225a;
            int i5 = 0;
            if (list != null) {
                i2 = list.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = i2 * 31;
            List<String> list2 = this.f42226b;
            if (list2 != null) {
                i3 = list2.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            String str = this.f42228d;
            if (str != null) {
                i4 = str.hashCode();
            } else {
                i4 = 0;
            }
            int i8 = (i7 + i4) * 31;
            Uri uri = this.f42227c;
            if (uri != null) {
                i5 = uri.hashCode();
            }
            return i8 + i5;
        }

        public final String toString() {
            return "IntentFilter{actions=" + this.f42225a + ", categories=" + this.f42226b + ", data=" + this.f42227c + ", mimetype=" + this.f42228d + '}';
        }

        public b(List<String> list) {
            this(list, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            List<String> list = this.f42225a;
            if (list == null ? bVar.f42225a != null : !list.equals(bVar.f42225a)) {
                return false;
            }
            List<String> list2 = this.f42226b;
            if (list2 == null ? bVar.f42226b != null : !list2.equals(bVar.f42226b)) {
                return false;
            }
            String str = this.f42228d;
            if (str == null ? bVar.f42228d != null : !str.equals(bVar.f42228d)) {
                return false;
            }
            Uri uri = this.f42227c;
            Uri uri2 = bVar.f42227c;
            if (uri != null) {
                return uri.equals(uri2);
            }
            if (uri2 == null) {
                return true;
            }
            return false;
        }

        public b(List<String> list, List<String> list2) {
            this.f42225a = list;
            this.f42226b = list2;
        }
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        List<b> list = this.f42219a;
        int i6 = 0;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = i2 * 31;
        String str = this.f42220b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str2 = this.f42221c;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str3 = this.f42222d;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        String str4 = this.f42223e;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i10 + i6;
    }

    public final String toString() {
        return "Component{name='" + this.f42220b + '\'' + ", intentFilter=" + this.f42219a + ", processName='" + this.f42221c + '\'' + ", permission='" + this.f42222d + '\'' + ", authorities='" + this.f42223e + '\'' + '}';
    }

    /* renamed from: com.bytedance.push.k.a$a  reason: collision with other inner class name */
    public static class C1033a {

        /* renamed from: a  reason: collision with root package name */
        public a f42224a;

        static {
            Covode.recordClassIndex(25799);
        }

        public static C1033a c(String str) {
            return new C1033a(str);
        }

        public final C1033a a(b bVar) {
            this.f42224a.f42219a.add(bVar);
            return this;
        }

        public final C1033a b(String str) {
            this.f42224a.f42222d = str;
            return this;
        }

        private C1033a(String str) {
            this.f42224a = new a(str);
        }

        public final C1033a a(String str) {
            this.f42224a.f42221c = str;
            return this;
        }
    }

    public a(String str) {
        this.f42220b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        List<b> list = this.f42219a;
        if (list == null ? aVar.f42219a != null : !list.equals(aVar.f42219a)) {
            return false;
        }
        String str = this.f42220b;
        if (str == null ? aVar.f42220b != null : !str.equals(aVar.f42220b)) {
            return false;
        }
        String str2 = this.f42221c;
        if (str2 == null ? aVar.f42221c != null : !str2.equals(aVar.f42221c)) {
            return false;
        }
        String str3 = this.f42222d;
        if (str3 == null ? aVar.f42222d != null : !str3.equals(aVar.f42222d)) {
            return false;
        }
        String str4 = this.f42223e;
        String str5 = aVar.f42223e;
        if (str4 == null ? str5 == null : str4.equals(str5)) {
            return true;
        }
        return false;
    }
}
