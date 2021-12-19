package org.eclipse.mat.json;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONStringer {
    private final String indent;
    final StringBuilder out;
    private final List<Scope> stack;

    static {
        Covode.recordClassIndex(106458);
    }

    public JSONStringer array() {
        return open(Scope.EMPTY_ARRAY, "[");
    }

    public JSONStringer endArray() {
        return close(Scope.EMPTY_ARRAY, Scope.NONEMPTY_ARRAY, "]");
    }

    public JSONStringer endObject() {
        return close(Scope.EMPTY_OBJECT, Scope.NONEMPTY_OBJECT, "}");
    }

    public JSONStringer object() {
        return open(Scope.EMPTY_OBJECT, "{");
    }

    public JSONStringer() {
        this.out = new StringBuilder();
        this.stack = new ArrayList();
        this.indent = null;
    }

    private void newline() {
        if (this.indent != null) {
            this.out.append("\n");
            for (int i2 = 0; i2 < this.stack.size(); i2++) {
                this.out.append(this.indent);
            }
        }
    }

    private Scope peek() {
        if (!this.stack.isEmpty()) {
            List<Scope> list = this.stack;
            return list.get(list.size() - 1);
        }
        throw new JSONException("Nesting problem");
    }

    public String toString() {
        if (this.out.length() == 0) {
            return null;
        }
        return this.out.toString();
    }

    private void beforeKey() {
        Scope peek = peek();
        if (peek == Scope.NONEMPTY_OBJECT) {
            this.out.append(',');
        } else if (peek != Scope.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        newline();
        replaceTop(Scope.DANGLING_KEY);
    }

    /* access modifiers changed from: package-private */
    public enum Scope {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL;

        static {
            Covode.recordClassIndex(106459);
        }
    }

    private void beforeValue() {
        String str;
        if (!this.stack.isEmpty()) {
            Scope peek = peek();
            if (peek == Scope.EMPTY_ARRAY) {
                replaceTop(Scope.NONEMPTY_ARRAY);
                newline();
            } else if (peek == Scope.NONEMPTY_ARRAY) {
                this.out.append(',');
                newline();
            } else if (peek == Scope.DANGLING_KEY) {
                StringBuilder sb = this.out;
                if (this.indent == null) {
                    str = ":";
                } else {
                    str = ": ";
                }
                sb.append(str);
                replaceTop(Scope.NONEMPTY_OBJECT);
            } else if (peek != Scope.NULL) {
                throw new JSONException("Nesting problem");
            }
        }
    }

    private void replaceTop(Scope scope) {
        List<Scope> list = this.stack;
        list.set(list.size() - 1, scope);
    }

    public JSONStringer key(String str) {
        if (str != null) {
            beforeKey();
            string(str);
            return this;
        }
        throw new JSONException("Names must be non-null");
    }

    public JSONStringer value(long j2) {
        if (!this.stack.isEmpty()) {
            beforeValue();
            this.out.append(j2);
            return this;
        }
        throw new JSONException("Nesting problem");
    }

    JSONStringer(int i2) {
        this.out = new StringBuilder();
        this.stack = new ArrayList();
        char[] cArr = new char[i2];
        Arrays.fill(cArr, ' ');
        this.indent = new String(cArr);
    }

    public JSONStringer value(double d2) {
        if (!this.stack.isEmpty()) {
            beforeValue();
            this.out.append(JSONObject.numberToString(Double.valueOf(d2)));
            return this;
        }
        throw new JSONException("Nesting problem");
    }

    public JSONStringer value(Object obj) {
        if (this.stack.isEmpty()) {
            throw new JSONException("Nesting problem");
        } else if (obj instanceof JSONArray) {
            ((JSONArray) obj).writeTo(this);
            return this;
        } else if (obj instanceof JSONObject) {
            ((JSONObject) obj).writeTo(this);
            return this;
        } else {
            beforeValue();
            if (obj == null || (obj instanceof Boolean) || obj == JSONObject.NULL) {
                this.out.append(obj);
            } else if (obj instanceof Number) {
                this.out.append(JSONObject.numberToString((Number) obj));
            } else {
                string(obj.toString());
            }
            return this;
        }
    }

    private void string(String str) {
        this.out.append("\"");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\f') {
                this.out.append("\\f");
            } else if (charAt == '\r') {
                this.out.append("\\r");
            } else if (charAt == '\"' || charAt == '/' || charAt == '\\') {
                this.out.append('\\').append(charAt);
            } else {
                switch (charAt) {
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        this.out.append("\\b");
                        continue;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        this.out.append("\\t");
                        continue;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        this.out.append("\\n");
                        continue;
                    default:
                        if (charAt > 31) {
                            this.out.append(charAt);
                            break;
                        } else {
                            this.out.append(a.a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                            continue;
                        }
                }
            }
        }
        this.out.append("\"");
    }

    public JSONStringer value(boolean z) {
        if (!this.stack.isEmpty()) {
            beforeValue();
            this.out.append(z);
            return this;
        }
        throw new JSONException("Nesting problem");
    }

    /* access modifiers changed from: package-private */
    public JSONStringer open(Scope scope, String str) {
        if (!this.stack.isEmpty() || this.out.length() <= 0) {
            beforeValue();
            this.stack.add(scope);
            this.out.append(str);
            return this;
        }
        throw new JSONException("Nesting problem: multiple top-level roots");
    }

    /* access modifiers changed from: package-private */
    public JSONStringer close(Scope scope, Scope scope2, String str) {
        Scope peek = peek();
        if (peek == scope2 || peek == scope) {
            List<Scope> list = this.stack;
            list.remove(list.size() - 1);
            if (peek == scope2) {
                newline();
            }
            this.out.append(str);
            return this;
        }
        throw new JSONException("Nesting problem");
    }
}
