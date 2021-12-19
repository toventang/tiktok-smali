package okhttp3.internal.http2;

import com.bytedance.covode.number.Covode;
import k.i;
import okhttp3.Headers;
import okhttp3.internal.Util;

public final class Header {
    public static final i PSEUDO_PREFIX = i.encodeUtf8(":");
    public static final i RESPONSE_STATUS = i.encodeUtf8(":status");
    public static final i TARGET_AUTHORITY = i.encodeUtf8(":authority");
    public static final i TARGET_METHOD = i.encodeUtf8(":method");
    public static final i TARGET_PATH = i.encodeUtf8(":path");
    public static final i TARGET_SCHEME = i.encodeUtf8(":scheme");
    final int hpackSize;
    public final i name;
    public final i value;

    interface Listener {
        static {
            Covode.recordClassIndex(106251);
        }

        void onHeaders(Headers headers);
    }

    public final int hashCode() {
        return ((this.name.hashCode() + 527) * 31) + this.value.hashCode();
    }

    public final String toString() {
        return Util.format("%s: %s", this.name.utf8(), this.value.utf8());
    }

    static {
        Covode.recordClassIndex(106250);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Header) {
            Header header = (Header) obj;
            if (!this.name.equals(header.name) || !this.value.equals(header.value)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Header(i iVar, String str) {
        this(iVar, i.encodeUtf8(str));
    }

    public Header(String str, String str2) {
        this(i.encodeUtf8(str), i.encodeUtf8(str2));
    }

    public Header(i iVar, i iVar2) {
        this.name = iVar;
        this.value = iVar2;
        this.hpackSize = iVar.size() + 32 + iVar2.size();
    }
}
