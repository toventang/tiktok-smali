package androidx.core.content.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.content.a.d;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Shader f2269a;

    /* renamed from: b  reason: collision with root package name */
    public int f2270b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorStateList f2271c;

    static {
        Covode.recordClassIndex(707);
    }

    public final boolean a() {
        if (this.f2269a != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (a() || this.f2270b != 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        ColorStateList colorStateList;
        if (this.f2269a != null || (colorStateList = this.f2271c) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    static b a(int i2) {
        return new b(null, null, i2);
    }

    public final boolean a(int[] iArr) {
        if (b()) {
            ColorStateList colorStateList = this.f2271c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2270b) {
                this.f2270b = colorForState;
                return true;
            }
        }
        return false;
    }

    private b(Shader shader, ColorStateList colorStateList, int i2) {
        this.f2269a = shader;
        this.f2271c = colorStateList;
        this.f2270b = i2;
    }

    public static b a(Resources resources, int i2, Resources.Theme theme) {
        int next;
        Shader shader;
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    String name = xml.getName();
                    int hashCode = name.hashCode();
                    if (hashCode != 89650992) {
                        if (hashCode == 1191572447 && name.equals("selector")) {
                            ColorStateList a2 = a.a(resources, xml, asAttributeSet, theme);
                            try {
                                return new b(null, a2, a2.getDefaultColor());
                            } catch (Exception unused) {
                                return null;
                            }
                        }
                    } else if (name.equals("gradient")) {
                        String name2 = xml.getName();
                        if (name2.equals("gradient")) {
                            TypedArray a3 = h.a(resources, theme, asAttributeSet, new int[]{16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051});
                            float a4 = h.a(a3, (XmlPullParser) xml, "startX", 8, 0.0f);
                            float a5 = h.a(a3, (XmlPullParser) xml, "startY", 9, 0.0f);
                            float a6 = h.a(a3, (XmlPullParser) xml, "endX", 10, 0.0f);
                            float a7 = h.a(a3, (XmlPullParser) xml, "endY", 11, 0.0f);
                            float a8 = h.a(a3, (XmlPullParser) xml, "centerX", 3, 0.0f);
                            float a9 = h.a(a3, (XmlPullParser) xml, "centerY", 4, 0.0f);
                            int a10 = h.a(a3, (XmlPullParser) xml, StringSet.type, 2, 0);
                            int a11 = h.a(a3, xml, "startColor", 0);
                            boolean a12 = h.a(xml, "centerColor");
                            int a13 = h.a(a3, xml, "centerColor", 7);
                            int a14 = h.a(a3, xml, "endColor", 1);
                            int a15 = h.a(a3, (XmlPullParser) xml, "tileMode", 6, 0);
                            float a16 = h.a(a3, (XmlPullParser) xml, "gradientRadius", 5, 0.0f);
                            a3.recycle();
                            d.a a17 = d.a(resources, xml, asAttributeSet, theme);
                            if (a17 == null) {
                                if (a12) {
                                    a17 = new d.a(a11, a13, a14);
                                } else {
                                    a17 = new d.a(a11, a14);
                                }
                            }
                            if (a10 != 1) {
                                if (a10 != 2) {
                                    shader = new LinearGradient(a4, a5, a6, a7, a17.f2282a, a17.f2283b, d.a(a15));
                                } else {
                                    shader = new SweepGradient(a8, a9, a17.f2282a, a17.f2283b);
                                }
                            } else if (a16 > 0.0f) {
                                shader = new RadialGradient(a8, a9, a16, a17.f2282a, a17.f2283b, d.a(a15));
                            } else {
                                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                            }
                            return new b(shader, null, 0);
                        }
                        throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
                    }
                    throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (Exception unused2) {
            return null;
        }
    }
}
