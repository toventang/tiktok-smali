package com.bytedance.tux.f;

import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.style.CharacterStyle;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.List;
import org.xml.sax.XMLReader;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1102a f45023a = new C1102a((byte) 0);

    static {
        Covode.recordClassIndex(27470);
    }

    /* renamed from: com.bytedance.tux.f.a$a  reason: collision with other inner class name */
    public static final class C1102a {
        static {
            Covode.recordClassIndex(27471);
        }

        private C1102a() {
        }

        public /* synthetic */ C1102a(byte b2) {
            this();
        }

        /* renamed from: com.bytedance.tux.f.a$a$a  reason: collision with other inner class name */
        public static final class C1103a implements Html.TagHandler {

            /* renamed from: a  reason: collision with root package name */
            private final Spannable[] f45024a;

            static {
                Covode.recordClassIndex(27472);
            }

            public C1103a(Spannable[] spannableArr) {
                l.c(spannableArr, "");
                this.f45024a = spannableArr;
            }

            public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
                l.c(str, "");
                l.c(editable, "");
                l.c(xMLReader, "");
                if (p.b(str, "tux-span-", false) && !z) {
                    Integer valueOf = Integer.valueOf((String) n.i((List) p.b(str, new String[]{"-"})));
                    Spannable[] spannableArr = this.f45024a;
                    l.a((Object) valueOf, "");
                    Spannable spannable = spannableArr[valueOf.intValue()];
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(0, spannable.length(), CharacterStyle.class);
                    l.a((Object) characterStyleArr, "");
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        int spanStart = spannable.getSpanStart(characterStyle);
                        int spanEnd = spannable.getSpanEnd(characterStyle);
                        if (editable.getSpanStart(characterStyle) < 0) {
                            int length = editable.length() - spannable.length();
                            editable.setSpan(characterStyle, spanStart + length, spanEnd + length, spannable.getSpanFlags(characterStyle));
                        }
                    }
                }
            }
        }
    }
}
