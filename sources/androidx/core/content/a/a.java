package androidx.core.content.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Xml;
import com.bytedance.covode.number.Covode;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class a {
    static {
        Covode.recordClassIndex(706);
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return a(resources, xmlPullParser, asAttributeSet, theme);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return b(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList b(android.content.res.Resources r15, org.xmlpull.v1.XmlPullParser r16, android.util.AttributeSet r17, android.content.res.Resources.Theme r18) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.a.a.b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
