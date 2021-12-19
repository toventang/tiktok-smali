package okhttp3;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k.f;
import k.g;
import okhttp3.internal.Util;

public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.get("application/x-www-form-urlencoded");
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return CONTENT_TYPE;
    }

    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        static {
            Covode.recordClassIndex(106149);
        }

        public Builder() {
            this(null);
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public Builder(Charset charset2) {
            this.names = new ArrayList();
            this.values = new ArrayList();
            this.charset = charset2;
        }

        public final Builder add(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
            this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
            return this;
        }

        public final Builder addEncoded(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
            this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
            return this;
        }
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return writeOrCountBytes(null, true);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    static {
        Covode.recordClassIndex(106148);
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(g gVar) {
        writeOrCountBytes(gVar, false);
    }

    public final String encodedName(int i2) {
        return this.encodedNames.get(i2);
    }

    public final String encodedValue(int i2) {
        return this.encodedValues.get(i2);
    }

    public final String name(int i2) {
        return HttpUrl.percentDecode(encodedName(i2), true);
    }

    public final String value(int i2) {
        return HttpUrl.percentDecode(encodedValue(i2), true);
    }

    FormBody(List<String> list, List<String> list2) {
        this.encodedNames = Util.immutableList(list);
        this.encodedValues = Util.immutableList(list2);
    }

    private long writeOrCountBytes(g gVar, boolean z) {
        f a2;
        if (z) {
            a2 = new f();
        } else {
            a2 = gVar.a();
        }
        int size = this.encodedNames.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                a2.a(38);
            }
            a2.a(this.encodedNames.get(i2));
            a2.a(61);
            a2.a(this.encodedValues.get(i2));
        }
        if (!z) {
            return 0;
        }
        long j2 = a2.f158864b;
        a2.v();
        return j2;
    }
}
