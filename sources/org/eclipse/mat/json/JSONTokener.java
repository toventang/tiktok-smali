package org.eclipse.mat.json;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public class JSONTokener {
    private final String in;
    private int pos;

    static {
        Covode.recordClassIndex(106460);
    }

    public static int dehexchar(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'A';
        if (c2 < 'A' || c2 > 'F') {
            c3 = 'a';
            if (c2 < 'a' || c2 > 'f') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public void back() {
        int i2 = this.pos - 1;
        this.pos = i2;
        if (i2 == -1) {
            this.pos = 0;
        }
    }

    public boolean more() {
        if (this.pos < this.in.length()) {
            return true;
        }
        return false;
    }

    public char nextClean() {
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal == -1) {
            return 0;
        }
        return (char) nextCleanInternal;
    }

    public char next() {
        if (this.pos >= this.in.length()) {
            return 0;
        }
        String str = this.in;
        int i2 = this.pos;
        this.pos = i2 + 1;
        return str.charAt(i2);
    }

    public String toString() {
        return " at character " + this.pos + " of " + this.in;
    }

    public Object nextValue() {
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal == -1) {
            throw syntaxError("End of input");
        } else if (nextCleanInternal == 34 || nextCleanInternal == 39) {
            return nextString((char) nextCleanInternal);
        } else {
            if (nextCleanInternal == 91) {
                return readArray();
            }
            if (nextCleanInternal == 123) {
                return readObject();
            }
            this.pos--;
            return readLiteral();
        }
    }

    private int nextCleanInternal() {
        while (this.pos < this.in.length()) {
            String str = this.in;
            int i2 = this.pos;
            this.pos = i2 + 1;
            char charAt = str.charAt(i2);
            if (!(charAt == '\t' || charAt == '\n' || charAt == '\r' || charAt == ' ')) {
                if (charAt != '/' || this.pos == this.in.length()) {
                    return charAt;
                }
                char charAt2 = this.in.charAt(this.pos);
                if (charAt2 != '*' && charAt2 != '/') {
                    return charAt;
                }
                skipComment();
            }
        }
        return -1;
    }

    private JSONArray readArray() {
        JSONArray jSONArray = new JSONArray();
        boolean z = false;
        while (true) {
            int nextCleanInternal = nextCleanInternal();
            if (nextCleanInternal != -1) {
                if (nextCleanInternal == 44 || nextCleanInternal == 59) {
                    jSONArray.put((Object) null);
                } else if (nextCleanInternal != 93) {
                    this.pos--;
                    jSONArray.put(nextValue());
                    int nextCleanInternal2 = nextCleanInternal();
                    if (!(nextCleanInternal2 == 44 || nextCleanInternal2 == 59)) {
                        if (nextCleanInternal2 == 93) {
                            return jSONArray;
                        }
                        throw syntaxError("Unterminated array");
                    }
                } else {
                    if (z) {
                        jSONArray.put((Object) null);
                    }
                    return jSONArray;
                }
                z = true;
            } else {
                throw syntaxError("Unterminated array");
            }
        }
    }

    private char readEscapeCharacter() {
        String str = this.in;
        int i2 = this.pos;
        this.pos = i2 + 1;
        char charAt = str.charAt(i2);
        if (charAt == 'b') {
            return '\b';
        }
        if (charAt == 'f') {
            return '\f';
        }
        if (charAt == 'n') {
            return '\n';
        }
        if (charAt == 'r') {
            return '\r';
        }
        if (charAt == 't') {
            return '\t';
        }
        if (charAt != 'u') {
            return charAt;
        }
        if (this.pos + 4 <= this.in.length()) {
            String str2 = this.in;
            int i3 = this.pos;
            String substring = str2.substring(i3, i3 + 4);
            this.pos += 4;
            return (char) Integer.parseInt(substring, 16);
        }
        throw syntaxError("Unterminated escape sequence");
    }

    private void skipComment() {
        String str = this.in;
        int i2 = this.pos;
        this.pos = i2 + 1;
        if (str.charAt(i2) == '*') {
            int indexOf = this.in.indexOf("*/", this.pos);
            if (indexOf != -1) {
                this.pos = indexOf + 2;
                return;
            }
            throw syntaxError("Unterminated comment");
        }
        while (this.pos < this.in.length()) {
            char charAt = this.in.charAt(this.pos);
            if (charAt == '\r' || charAt == '\n') {
                this.pos++;
                return;
            }
            this.pos++;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0086 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object readLiteral() {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.mat.json.JSONTokener.readLiteral():java.lang.Object");
    }

    private JSONObject readObject() {
        JSONObject jSONObject = new JSONObject();
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal == 125) {
            return jSONObject;
        }
        if (nextCleanInternal != -1) {
            this.pos--;
        }
        while (true) {
            Object nextValue = nextValue();
            if (nextValue instanceof String) {
                int nextCleanInternal2 = nextCleanInternal();
                if (nextCleanInternal2 == 58 || nextCleanInternal2 == 61) {
                    if (this.pos < this.in.length() && this.in.charAt(this.pos) == '>') {
                        this.pos++;
                    }
                    jSONObject.put((String) nextValue, nextValue());
                    int nextCleanInternal3 = nextCleanInternal();
                    if (nextCleanInternal3 != 44 && nextCleanInternal3 != 59) {
                        if (nextCleanInternal3 == 125) {
                            return jSONObject;
                        }
                        throw syntaxError("Unterminated object");
                    }
                } else {
                    throw syntaxError("Expected ':' after ".concat(String.valueOf(nextValue)));
                }
            } else if (nextValue == null) {
                throw syntaxError("Names cannot be null");
            } else {
                throw syntaxError("Names must be strings, but " + nextValue + " is of type " + nextValue.getClass().getName());
            }
        }
    }

    public JSONTokener(String str) {
        this.in = str;
    }

    public String nextTo(char c2) {
        return nextToInternal(String.valueOf(c2)).trim();
    }

    public char skipTo(char c2) {
        int indexOf = this.in.indexOf(c2, this.pos);
        if (indexOf == -1) {
            return 0;
        }
        this.pos = indexOf;
        return c2;
    }

    public String nextTo(String str) {
        Objects.requireNonNull(str);
        return nextToInternal(str).trim();
    }

    public void skipPast(String str) {
        int length;
        int indexOf = this.in.indexOf(str, this.pos);
        if (indexOf == -1) {
            length = this.in.length();
        } else {
            length = str.length() + indexOf;
        }
        this.pos = length;
    }

    public JSONException syntaxError(String str) {
        return new JSONException(str + this);
    }

    private String nextToInternal(String str) {
        int i2 = this.pos;
        while (this.pos < this.in.length()) {
            char charAt = this.in.charAt(this.pos);
            if (charAt == '\r' || charAt == '\n' || str.indexOf(charAt) != -1) {
                return this.in.substring(i2, this.pos);
            }
            this.pos++;
        }
        return this.in.substring(i2);
    }

    public char next(char c2) {
        char next = next();
        if (next == c2) {
            return next;
        }
        throw syntaxError("Expected " + c2 + " but was " + next);
    }

    public String next(int i2) {
        if (this.pos + i2 <= this.in.length()) {
            String str = this.in;
            int i3 = this.pos;
            String substring = str.substring(i3, i3 + i2);
            this.pos += i2;
            return substring;
        }
        throw syntaxError(i2 + " is out of bounds");
    }

    public String nextString(char c2) {
        int i2 = this.pos;
        StringBuilder sb = null;
        while (this.pos < this.in.length()) {
            String str = this.in;
            int i3 = this.pos;
            this.pos = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt == c2) {
                if (sb == null) {
                    return new String(this.in.substring(i2, this.pos - 1));
                }
                sb.append((CharSequence) this.in, i2, this.pos - 1);
                return sb.toString();
            } else if (charAt == '\\') {
                if (this.pos != this.in.length()) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append((CharSequence) this.in, i2, this.pos - 1);
                    sb.append(readEscapeCharacter());
                    i2 = this.pos;
                } else {
                    throw syntaxError("Unterminated escape sequence");
                }
            }
        }
        throw syntaxError("Unterminated string");
    }
}
