package androidx.core.content.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class c {

    public interface a {
        static {
            Covode.recordClassIndex(709);
        }
    }

    static {
        Covode.recordClassIndex(708);
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final C0028c[] f2272a;

        static {
            Covode.recordClassIndex(710);
        }

        public b(C0028c[] cVarArr) {
            this.f2272a = cVarArr;
        }
    }

    private static List<byte[]> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    private static void a(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next != 3) {
                continue;
            } else {
                i2--;
            }
            if (i2 <= 0) {
                return;
            }
        }
    }

    public static a a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                xmlPullParser.require(2, null, "font-family");
                if (xmlPullParser.getName().equals("font-family")) {
                    return b(xmlPullParser, resources);
                }
                a(xmlPullParser);
                return null;
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> a(Resources resources, int i2) {
        int i3;
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i3 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i3 = typedValue.type;
            }
            if (i3 == 1) {
                for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                    int resourceId = obtainTypedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        arrayList.add(a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(a(resources.getStringArray(i2)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static a b(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.uj, R.attr.uk, R.attr.ul, R.attr.um, R.attr.un, R.attr.uo});
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(4);
        String string3 = obtainAttributes.getString(5);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(2, 1);
        int integer2 = obtainAttributes.getInteger(3, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(c(xmlPullParser, resources));
                    } else {
                        a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b((C0028c[]) arrayList.toArray(new C0028c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        return new d(new androidx.core.e.a(string, string2, string3, a(resources, resourceId)), integer, integer2);
    }

    private static C0028c c(XmlPullParser xmlPullParser, Resources resources) {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{16844082, 16844083, 16844095, 16844143, 16844144, R.attr.uh, R.attr.up, R.attr.ur, R.attr.us, R.attr.al5});
        int i2 = 8;
        if (!obtainAttributes.hasValue(8)) {
            i2 = 1;
        }
        int i3 = obtainAttributes.getInt(i2, 400);
        int i4 = 6;
        if (!obtainAttributes.hasValue(6)) {
            i4 = 2;
        }
        if (1 == obtainAttributes.getInt(i4, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i5 = 9;
        if (!obtainAttributes.hasValue(9)) {
            i5 = 3;
        }
        int i6 = 7;
        if (!obtainAttributes.hasValue(7)) {
            i6 = 4;
        }
        String string = obtainAttributes.getString(i6);
        int i7 = obtainAttributes.getInt(i5, 0);
        int i8 = 5;
        if (!obtainAttributes.hasValue(5)) {
            i8 = 0;
        }
        int resourceId = obtainAttributes.getResourceId(i8, 0);
        String string2 = obtainAttributes.getString(i8);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        return new C0028c(string2, i3, z, string, i7, resourceId);
    }

    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.core.e.a f2279a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2280b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2281c;

        static {
            Covode.recordClassIndex(712);
        }

        public d(androidx.core.e.a aVar, int i2, int i3) {
            this.f2279a = aVar;
            this.f2281c = i2;
            this.f2280b = i3;
        }
    }

    /* renamed from: androidx.core.content.a.c$c  reason: collision with other inner class name */
    public static final class C0028c {

        /* renamed from: a  reason: collision with root package name */
        public final String f2273a;

        /* renamed from: b  reason: collision with root package name */
        public int f2274b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2275c;

        /* renamed from: d  reason: collision with root package name */
        public String f2276d;

        /* renamed from: e  reason: collision with root package name */
        public int f2277e;

        /* renamed from: f  reason: collision with root package name */
        public int f2278f;

        static {
            Covode.recordClassIndex(711);
        }

        public C0028c(String str, int i2, boolean z, String str2, int i3, int i4) {
            this.f2273a = str;
            this.f2274b = i2;
            this.f2275c = z;
            this.f2276d = str2;
            this.f2277e = i3;
            this.f2278f = i4;
        }
    }
}
