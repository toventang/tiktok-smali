package com.bytedance.keva.adapter.xml;

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

public class FastXmlSerializer implements XmlSerializer {
    private static final String[] ESCAPE_TABLE = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    private ByteBuffer mBytes = ByteBuffer.allocate(8192);
    private CharsetEncoder mCharset;
    private boolean mInTag;
    private OutputStream mOutputStream;
    private int mPos;
    private final char[] mText = new char[8192];
    private Writer mWriter;

    @Override // org.xmlpull.v1.XmlSerializer
    public void endDocument() {
        flush();
    }

    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    private void flushBytes() {
        MethodCollector.i(11248);
        int position = this.mBytes.position();
        if (position > 0) {
            this.mBytes.flip();
            this.mOutputStream.write(this.mBytes.array(), 0, position);
            this.mBytes.clear();
        }
        MethodCollector.o(11248);
    }

    static {
        Covode.recordClassIndex(24527);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() {
        MethodCollector.i(11250);
        int i2 = this.mPos;
        if (i2 > 0) {
            if (this.mOutputStream != null) {
                CharBuffer wrap = CharBuffer.wrap(this.mText, 0, i2);
                CoderResult encode = this.mCharset.encode(wrap, this.mBytes, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        flushBytes();
                        encode = this.mCharset.encode(wrap, this.mBytes, true);
                    } else {
                        flushBytes();
                        this.mOutputStream.flush();
                    }
                }
                IOException iOException = new IOException(encode.toString());
                MethodCollector.o(11250);
                throw iOException;
            }
            this.mWriter.write(this.mText, 0, i2);
            this.mWriter.flush();
            this.mPos = 0;
        }
        MethodCollector.o(11250);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(Writer writer) {
        this.mWriter = writer;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void comment(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    private void append(String str) {
        append(str, 0, str.length());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) {
        if (this.mInTag) {
            append(">");
            this.mInTag = false;
        }
        escapeAndAppendString(str);
        return this;
    }

    private void append(char c2) {
        int i2 = this.mPos;
        if (i2 >= 8191) {
            flush();
            i2 = this.mPos;
        }
        this.mText[i2] = c2;
        this.mPos = i2 + 1;
    }

    private void escapeAndAppendString(String str) {
        String str2;
        int length = str.length();
        String[] strArr = ESCAPE_TABLE;
        char length2 = (char) strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i3 < i2) {
                    append(str, i3, i2 - i3);
                }
                i3 = i2 + 1;
                append(str2);
            }
            i2++;
        }
        if (i3 < i2) {
            append(str, i3, i2 - i3);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setFeature(String str, boolean z) {
        if (!str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) {
        if (this.mInTag) {
            append(">\n");
        }
        append('<');
        if (str != null) {
            append(str);
            append(':');
        }
        append(str2);
        this.mInTag = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer endTag(String str, String str2) {
        if (this.mInTag) {
            append(" />\n");
        } else {
            append("</");
            if (str != null) {
                append(str);
                append(':');
            }
            append(str2);
            append(">\n");
        }
        this.mInTag = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(OutputStream outputStream, String str) {
        if (outputStream != null) {
            try {
                this.mCharset = Charset.forName(str).newEncoder();
                this.mOutputStream = outputStream;
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
    public void startDocument(String str, Boolean bool) {
        String str2;
        StringBuilder sb = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        append(sb.append(str2).append("' ?>\n").toString());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer attribute(String str, String str2, String str3) {
        append(' ');
        if (str != null) {
            append(str);
            append(':');
        }
        append(str2);
        append("=\"");
        escapeAndAppendString(str3);
        append('\"');
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i2, int i3) {
        if (this.mInTag) {
            append(">");
            this.mInTag = false;
        }
        escapeAndAppendString(cArr, i2, i3);
        return this;
    }

    private void append(String str, int i2, int i3) {
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
                append(str, i2, i4);
                i2 = i6;
            }
            return;
        }
        int i7 = this.mPos;
        if (i7 + i3 > 8192) {
            flush();
            i7 = this.mPos;
        }
        str.getChars(i2, i2 + i3, this.mText, i7);
        this.mPos = i7 + i3;
    }

    private void append(char[] cArr, int i2, int i3) {
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
                append(cArr, i2, i4);
                i2 = i6;
            }
            return;
        }
        int i7 = this.mPos;
        if (i7 + i3 > 8192) {
            flush();
            i7 = this.mPos;
        }
        System.arraycopy(cArr, i2, this.mText, i7, i3);
        this.mPos = i7 + i3;
    }

    private void escapeAndAppendString(char[] cArr, int i2, int i3) {
        String str;
        String[] strArr = ESCAPE_TABLE;
        char length = (char) strArr.length;
        int i4 = i3 + i2;
        int i5 = i2;
        while (i2 < i4) {
            char c2 = cArr[i2];
            if (c2 < length && (str = strArr[c2]) != null) {
                if (i5 < i2) {
                    append(cArr, i5, i2 - i5);
                }
                i5 = i2 + 1;
                append(str);
            }
            i2++;
        }
        if (i5 < i2) {
            append(cArr, i5, i2 - i5);
        }
    }
}
