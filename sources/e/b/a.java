package e.b;

import com.bytedance.covode.number.Covode;

public final class a implements b {
    static {
        Covode.recordClassIndex(104291);
    }

    @Override // e.b.b
    public final boolean a(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (!(charAt == 0 || charAt == '\t' || charAt == '\n' || charAt == '\r' || ((charAt >= ' ' && charAt <= 55295) || ((charAt >= 57344 && charAt <= 65533) || (charAt >= 0 && charAt <= 65535))))) {
                return true;
            }
        }
        return false;
    }
}
