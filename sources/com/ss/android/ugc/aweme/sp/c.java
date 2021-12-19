package com.ss.android.ugc.aweme.sp;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

public final class c implements XmlSerializer {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f133976a = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* renamed from: b  reason: collision with root package name */
    private final char[] f133977b = new char[8192];

    /* renamed from: c  reason: collision with root package name */
    private int f133978c;

    /* renamed from: d  reason: collision with root package name */
    private Writer f133979d;

    /* renamed from: e  reason: collision with root package name */
    private OutputStream f133980e;

    /* renamed from: f  reason: collision with root package name */
    private CharsetEncoder f133981f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f133982g = ByteBuffer.allocate(8192);

    /* renamed from: h  reason: collision with root package name */
    private boolean f133983h;

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() {
        flush();
    }

    public final int getDepth() {
        throw new UnsupportedOperationException();
    }

    public final String getName() {
        throw new UnsupportedOperationException();
    }

    public final String getNamespace() {
        throw new UnsupportedOperationException();
    }

    private void a() {
        MethodCollector.i(14166);
        int position = this.f133982g.position();
        if (position > 0) {
            this.f133982g.flip();
            this.f133980e.write(this.f133982g.array(), 0, position);
            this.f133982g.clear();
        }
        MethodCollector.o(14166);
    }

    static {
        Covode.recordClassIndex(87663);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() {
        MethodCollector.i(14199);
        int i2 = this.f133978c;
        if (i2 > 0) {
            if (this.f133980e != null) {
                CharBuffer wrap = CharBuffer.wrap(this.f133977b, 0, i2);
                CoderResult encode = this.f133981f.encode(wrap, this.f133982g, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        a();
                        encode = this.f133981f.encode(wrap, this.f133982g, true);
                    } else {
                        a();
                        this.f133980e.flush();
                    }
                }
                IOException iOException = new IOException(encode.toString());
                MethodCollector.o(14199);
                throw iOException;
            }
            this.f133979d.write(this.f133977b, 0, i2);
            this.f133979d.flush();
            this.f133978c = 0;
        }
        MethodCollector.o(14199);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.f133979d = writer;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    public final boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public final Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    private void a(String str) {
        a(str, 0, str.length());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) {
        if (this.f133983h) {
            a(">");
            this.f133983h = false;
        }
        b(str);
        return this;
    }

    private void a(char c2) {
        int i2 = this.f133978c;
        if (i2 >= 8191) {
            flush();
            i2 = this.f133978c;
        }
        this.f133977b[i2] = c2;
        this.f133978c = i2 + 1;
    }

    private void b(String str) {
        String str2;
        int length = str.length();
        String[] strArr = f133976a;
        char length2 = (char) strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i3 < i2) {
                    a(str, i3, i2 - i3);
                }
                i3 = i2 + 1;
                a(str2);
            }
            i2++;
        }
        if (i3 < i2) {
            a(str, i3, i2 - i3);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setFeature(String str, boolean z) {
        if (!str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) {
        if (this.f133983h) {
            a(">\n");
        }
        a('<');
        if (str != null) {
            a(str);
            a(':');
        }
        a(str2);
        this.f133983h = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) {
        if (this.f133983h) {
            a(" />\n");
        } else {
            a("</");
            if (str != null) {
                a(str);
                a(':');
            }
            a(str2);
            a(">\n");
        }
        this.f133983h = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) {
        if (outputStream != null) {
            try {
                this.f133981f = Charset.forName(str).newEncoder();
                this.f133980e = outputStream;
            } catch (IllegalCharsetNameException e2) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
            } catch (UnsupportedCharsetException e3) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e3));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) {
        String str2;
        StringBuilder sb = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        a(sb.append(str2).append("' ?>\n").toString());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) {
        a(' ');
        if (str != null) {
            a(str);
            a(':');
        }
        a(str2);
        a("=\"");
        b(str3);
        a('\"');
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i2, int i3) {
        String str;
        if (this.f133983h) {
            a(">");
            this.f133983h = false;
        }
        String[] strArr = f133976a;
        char length = (char) strArr.length;
        int i4 = i3 + i2;
        int i5 = i2;
        while (i2 < i4) {
            char c2 = cArr[i2];
            if (c2 < length && (str = strArr[c2]) != null) {
                if (i5 < i2) {
                    a(cArr, i5, i2 - i5);
                }
                i5 = i2 + 1;
                a(str);
            }
            i2++;
        }
        if (i5 < i2) {
            a(cArr, i5, i2 - i5);
        }
        return this;
    }

    private void a(String str, int i2, int i3) {
        int i4;
        if (i3 > 8192) {
            int i5 = i3 + i2;
            while (i2 < i5) {
                int i6 = i2 + 8192;
                if (i6 < i5) {
                    i4 = 8192;
                } else {
                    i4 = i5 - i2;
                }
                a(str, i2, i4);
                i2 = i6;
            }
            return;
        }
        int i7 = this.f133978c;
        if (i7 + i3 > 8192) {
            flush();
            i7 = this.f133978c;
        }
        str.getChars(i2, i2 + i3, this.f133977b, i7);
        this.f133978c = i7 + i3;
    }

    private void a(char[] cArr, int i2, int i3) {
        int i4;
        if (i3 > 8192) {
            int i5 = i3 + i2;
            while (i2 < i5) {
                int i6 = i2 + 8192;
                if (i6 < i5) {
                    i4 = 8192;
                } else {
                    i4 = i5 - i2;
                }
                a(cArr, i2, i4);
                i2 = i6;
            }
            return;
        }
        int i7 = this.f133978c;
        if (i7 + i3 > 8192) {
            flush();
            i7 = this.f133978c;
        }
        System.arraycopy(cArr, i2, this.f133977b, i7, i3);
        this.f133978c = i7 + i3;
    }
}
