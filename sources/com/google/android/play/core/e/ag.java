package com.google.android.play.core.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.an;
import com.google.android.play.core.d.q;
import com.kakao.usermgmt.StringSet;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    private static ai f53231a;

    static {
        Covode.recordClassIndex(32901);
    }

    private ag() {
    }

    private static String a(String str, XmlPullParser xmlPullParser) {
        for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
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
            if (i2 == 0) {
                return;
            }
        }
    }

    public static synchronized ai a(Context context) {
        ai aiVar;
        synchronized (ag.class) {
            MethodCollector.i(9431);
            if (f53231a == null) {
                x xVar = new x((byte) 0);
                xVar.f53349a = new au(q.a(context));
                an.a(xVar.f53349a, au.class);
                f53231a = new y(xVar.f53349a);
            }
            aiVar = f53231a;
            MethodCollector.o(9431);
        }
        return aiVar;
    }

    static ad a(XmlPullParser xmlPullParser, ac acVar) {
        String a2;
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (!xmlPullParser.getName().equals("module") || (a2 = a(StringSet.name, xmlPullParser)) == null) {
                                    a(xmlPullParser);
                                } else {
                                    while (xmlPullParser.next() != 3) {
                                        if (xmlPullParser.getEventType() == 2) {
                                            if (xmlPullParser.getName().equals("language")) {
                                                while (xmlPullParser.next() != 3) {
                                                    if (xmlPullParser.getEventType() == 2) {
                                                        if (xmlPullParser.getName().equals("entry")) {
                                                            String a3 = a("key", xmlPullParser);
                                                            String a4 = a("split", xmlPullParser);
                                                            a(xmlPullParser);
                                                            if (!(a3 == null || a4 == null)) {
                                                                if (!acVar.f53223a.containsKey(a3)) {
                                                                    acVar.f53223a.put(a3, new HashMap());
                                                                }
                                                                acVar.f53223a.get(a3).put(a2, a4);
                                                            }
                                                        } else {
                                                            a(xmlPullParser);
                                                        }
                                                    }
                                                }
                                            } else {
                                                a(xmlPullParser);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        a(xmlPullParser);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                return null;
            }
        }
        return acVar.a();
    }
}
