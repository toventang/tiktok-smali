package com.bytedance.keva.adapter.xml;

import android.util.Xml;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public class XmlUtils {
    static {
        Covode.recordClassIndex(24528);
    }

    public static final void nextElement(XmlPullParser xmlPullParser) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return;
            }
        } while (next != 1);
    }

    public static final ArrayList readListXml(InputStream inputStream) {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        return (ArrayList) readValueXml(newPullParser, new String[1]);
    }

    public static final HashMap readMapXml(InputStream inputStream) {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        return (HashMap) readValueXml(newPullParser, new String[1]);
    }

    public static final HashSet readSetXml(InputStream inputStream) {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        return (HashSet) readValueXml(newPullParser, new String[1]);
    }

    public static void skipCurrentTag(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }

    public static final int parseUnsignedIntAttribute(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int length = charSequence2.length();
        int i2 = 0;
        int i3 = 16;
        if ('0' == charSequence2.charAt(0)) {
            if (length - 1 == 0) {
                return 0;
            }
            char charAt = charSequence2.charAt(1);
            if ('x' == charAt || 'X' == charAt) {
                i2 = 2;
                return (int) Long.parseLong(charSequence2.substring(i2), i3);
            }
            i3 = 8;
        } else if ('#' != charSequence2.charAt(0)) {
            i3 = 10;
            return (int) Long.parseLong(charSequence2.substring(i2), i3);
        }
        i2 = 1;
        return (int) Long.parseLong(charSequence2.substring(i2), i3);
    }

    public static final int convertValueToUnsignedInt(String str, int i2) {
        if (str == null) {
            return i2;
        }
        return parseUnsignedIntAttribute(str);
    }

    public static final boolean convertValueToBoolean(CharSequence charSequence, boolean z) {
        if (charSequence == null) {
            return z;
        }
        if (charSequence.equals("1") || charSequence.equals("true") || charSequence.equals("TRUE")) {
            return true;
        }
        return false;
    }

    public static boolean nextElementWithin(XmlPullParser xmlPullParser, int i2) {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return false;
            }
            if (next == 3) {
                if (xmlPullParser.getDepth() == i2) {
                    return false;
                }
            } else if (next == 2 && xmlPullParser.getDepth() == i2 + 1) {
                return true;
            }
        }
    }

    public static final void writeListXml(List list, OutputStream outputStream) {
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(outputStream, "utf-8");
        newSerializer.startDocument(null, true);
        newSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        writeListXml(list, null, newSerializer);
        newSerializer.endDocument();
    }

    public static final void writeMapXml(Map map, OutputStream outputStream) {
        FastXmlSerializer fastXmlSerializer = new FastXmlSerializer();
        fastXmlSerializer.setOutput(outputStream, "utf-8");
        fastXmlSerializer.startDocument(null, true);
        fastXmlSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        writeMapXml(map, null, fastXmlSerializer);
        fastXmlSerializer.endDocument();
    }

    public static final void beginDocument(XmlPullParser xmlPullParser, String str) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                if (!xmlPullParser.getName().equals(str)) {
                    throw new XmlPullParserException("Unexpected start tag: found " + xmlPullParser.getName() + ", expected " + str);
                }
                return;
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    public static final int convertValueToInt(CharSequence charSequence, int i2) {
        int i3;
        int i4;
        if (charSequence == null) {
            return i2;
        }
        String charSequence2 = charSequence.toString();
        int length = charSequence2.length();
        int i5 = 10;
        if ('-' == charSequence2.charAt(0)) {
            i3 = -1;
            i4 = 1;
        } else {
            i3 = 1;
            i4 = 0;
        }
        if ('0' != charSequence2.charAt(i4)) {
            if ('#' == charSequence2.charAt(i4)) {
                i4++;
            }
            return Integer.parseInt(charSequence2.substring(i4), i5) * i3;
        } else if (i4 == length - 1) {
            return 0;
        } else {
            int i6 = i4 + 1;
            char charAt = charSequence2.charAt(i6);
            if ('x' == charAt || 'X' == charAt) {
                i4 += 2;
            } else {
                i5 = 8;
                i4 = i6;
                return Integer.parseInt(charSequence2.substring(i4), i5) * i3;
            }
        }
        i5 = 16;
        return Integer.parseInt(charSequence2.substring(i4), i5) * i3;
    }

    public static final Object readValueXml(XmlPullParser xmlPullParser, String[] strArr) {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                throw new XmlPullParserException("Unexpected end tag at: " + xmlPullParser.getName());
            } else if (eventType != 4) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    throw new XmlPullParserException("Unexpected end of document");
                }
            } else {
                throw new XmlPullParserException("Unexpected text: " + xmlPullParser.getText());
            }
        }
        return readThisValueXml(xmlPullParser, strArr);
    }

    private static final Object readThisValueXml(XmlPullParser xmlPullParser, String[] strArr) {
        int next;
        Object obj = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, StringSet.name);
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals("string")) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    } else if (next2 == 3) {
                        if (xmlPullParser.getName().equals("string")) {
                            strArr[0] = attributeValue;
                            return str;
                        }
                        throw new XmlPullParserException("Unexpected end tag in <string>: " + xmlPullParser.getName());
                    } else if (next2 == 4) {
                        str = str + xmlPullParser.getText();
                    } else if (next2 == 2) {
                        throw new XmlPullParserException("Unexpected start tag in <string>: " + xmlPullParser.getName());
                    }
                }
            } else if (name.equals("int")) {
                obj = Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            } else if (name.equals("long")) {
                obj = Long.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("float")) {
                obj = Float.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("double")) {
                obj = Double.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("boolean")) {
                obj = Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("int-array")) {
                xmlPullParser.next();
                int[] readThisIntArrayXml = readThisIntArrayXml(xmlPullParser, "int-array", strArr);
                strArr[0] = attributeValue;
                return readThisIntArrayXml;
            } else if (name.equals("map")) {
                xmlPullParser.next();
                HashMap readThisMapXml = readThisMapXml(xmlPullParser, "map", strArr);
                strArr[0] = attributeValue;
                return readThisMapXml;
            } else if (name.equals("list")) {
                xmlPullParser.next();
                ArrayList readThisListXml = readThisListXml(xmlPullParser, "list", strArr);
                strArr[0] = attributeValue;
                return readThisListXml;
            } else if (name.equals("set")) {
                xmlPullParser.next();
                HashSet readThisSetXml = readThisSetXml(xmlPullParser, "set", strArr);
                strArr[0] = attributeValue;
                return readThisSetXml;
            } else {
                throw new XmlPullParserException("Unknown tag: ".concat(String.valueOf(name)));
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                throw new XmlPullParserException("Unexpected end of document in <" + name + ">");
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return obj;
                }
                throw new XmlPullParserException("Unexpected end tag in <" + name + ">: " + xmlPullParser.getName());
            } else if (next == 4) {
                throw new XmlPullParserException("Unexpected text in <" + name + ">: " + xmlPullParser.getName());
            }
        } while (next != 2);
        throw new XmlPullParserException("Unexpected start tag in <" + name + ">: " + xmlPullParser.getName());
    }

    public static final int convertValueToList(CharSequence charSequence, String[] strArr, int i2) {
        if (charSequence != null) {
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (charSequence.equals(strArr[i3])) {
                    return i3;
                }
            }
        }
        return i2;
    }

    public static final void writeIntArrayXml(int[] iArr, String str, XmlSerializer xmlSerializer) {
        if (iArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "int-array");
        if (str != null) {
            xmlSerializer.attribute(null, StringSet.name, str);
        }
        int length = iArr.length;
        xmlSerializer.attribute(null, "num", Integer.toString(length));
        for (int i2 : iArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Integer.toString(i2));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "int-array");
    }

    public static final void writeListXml(List list, String str, XmlSerializer xmlSerializer) {
        if (list == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "list");
        if (str != null) {
            xmlSerializer.attribute(null, StringSet.name, str);
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            writeValueXml(list.get(i2), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "list");
    }

    public static final void writeMapXml(Map map, String str, XmlSerializer xmlSerializer) {
        if (map == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "map");
        if (str != null) {
            xmlSerializer.attribute(null, StringSet.name, str);
        }
        for (Map.Entry entry : map.entrySet()) {
            writeValueXml(entry.getValue(), (String) entry.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag(null, "map");
    }

    public static final void writeSetXml(Set set, String str, XmlSerializer xmlSerializer) {
        if (set == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "set");
        if (str != null) {
            xmlSerializer.attribute(null, StringSet.name, str);
        }
        for (Object obj : set) {
            writeValueXml(obj, null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "set");
    }

    public static final ArrayList readThisListXml(XmlPullParser xmlPullParser, String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(readThisValueXml(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final HashSet readThisSetXml(XmlPullParser xmlPullParser, String str, String[] strArr) {
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(readThisValueXml(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final void writeByteArrayXml(byte[] bArr, String str, XmlSerializer xmlSerializer) {
        int i2;
        int i3;
        if (bArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "byte-array");
        if (str != null) {
            xmlSerializer.attribute(null, StringSet.name, str);
        }
        int length = bArr.length;
        xmlSerializer.attribute(null, "num", Integer.toString(length));
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i4 = b2 >> 4;
            if (i4 >= 10) {
                i2 = (i4 + 97) - 10;
            } else {
                i2 = i4 + 48;
            }
            sb.append(i2);
            int i5 = b2 & 255;
            if (i5 >= 10) {
                i3 = (i5 + 97) - 10;
            } else {
                i3 = i5 + 48;
            }
            sb.append(i3);
        }
        xmlSerializer.text(sb.toString());
        xmlSerializer.endTag(null, "byte-array");
    }

    public static final int[] readThisIntArrayXml(XmlPullParser xmlPullParser, String str, String[] strArr) {
        try {
            int[] iArr = new int[Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"))];
            int i2 = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            iArr[i2] = Integer.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i2++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    public static final HashMap readThisMapXml(XmlPullParser xmlPullParser, String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                Object readThisValueXml = readThisValueXml(xmlPullParser, strArr);
                if (strArr[0] != null) {
                    hashMap.put(strArr[0], readThisValueXml);
                } else {
                    throw new XmlPullParserException("Map value without name attribute: " + xmlPullParser.getName());
                }
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashMap;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final void writeValueXml(Object obj, String str, XmlSerializer xmlSerializer) {
        String str2;
        if (obj == null) {
            xmlSerializer.startTag(null, "null");
            if (str != null) {
                xmlSerializer.attribute(null, StringSet.name, str);
            }
            xmlSerializer.endTag(null, "null");
        } else if (obj instanceof String) {
            xmlSerializer.startTag(null, "string");
            if (str != null) {
                xmlSerializer.attribute(null, StringSet.name, str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, "string");
        } else {
            if (obj instanceof Integer) {
                str2 = "int";
            } else if (obj instanceof Long) {
                str2 = "long";
            } else if (obj instanceof Float) {
                str2 = "float";
            } else if (obj instanceof Double) {
                str2 = "double";
            } else if (obj instanceof Boolean) {
                str2 = "boolean";
            } else if (obj instanceof byte[]) {
                writeByteArrayXml((byte[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof int[]) {
                writeIntArrayXml((int[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Map) {
                writeMapXml((Map) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof List) {
                writeListXml((List) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Set) {
                writeSetXml((Set) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof CharSequence) {
                xmlSerializer.startTag(null, "string");
                if (str != null) {
                    xmlSerializer.attribute(null, StringSet.name, str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag(null, "string");
                return;
            } else {
                throw new RuntimeException("writeValueXml: unable to write " + str + ", class " + obj.getClass() + ", value " + obj);
            }
            xmlSerializer.startTag(null, str2);
            if (str != null) {
                xmlSerializer.attribute(null, StringSet.name, str);
            }
            xmlSerializer.attribute(null, "value", obj.toString());
            xmlSerializer.endTag(null, str2);
        }
    }
}
