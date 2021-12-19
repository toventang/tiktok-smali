package com.bytedance.router;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class SmartIntent extends Intent {
    static {
        Covode.recordClassIndex(26128);
    }

    public static int com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2, Throwable th) {
        return 0;
    }

    public Uri getData() {
        return super.getData();
    }

    public Bundle getExtras() {
        return com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
    }

    private SmartIntent(Intent intent) {
        super(intent);
    }

    public static Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return super.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isSmartIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent instanceof SmartIntent;
    }

    public static Intent smartIntent(Intent intent) {
        if (intent != null && !(intent instanceof SmartIntent)) {
            return new SmartIntent(intent);
        }
        return intent;
    }

    public static Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public boolean getBooleanExtra(String str, boolean z) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return z;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Boolean.parseBoolean((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Boolean", Boolean.valueOf(z), e2);
                return z;
            }
        } else {
            try {
                return ((Boolean) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).booleanValue();
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Boolean", Boolean.valueOf(z), e3);
                return z;
            }
        }
    }

    public byte getByteExtra(String str, byte b2) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return b2;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Byte.parseByte((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Byte", Byte.valueOf(b2), e2);
                return b2;
            }
        } else {
            try {
                return ((Byte) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).byteValue();
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Byte", Byte.valueOf(b2), e3);
                return b2;
            }
        }
    }

    public double getDoubleExtra(String str, double d2) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return d2;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Double.parseDouble((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Double", Double.valueOf(d2), e2);
                return d2;
            }
        } else {
            try {
                return ((Double) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).doubleValue();
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Double", Double.valueOf(d2), e3);
                return d2;
            }
        }
    }

    public float getFloatExtra(String str, float f2) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return f2;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Float.parseFloat((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Float", Float.valueOf(f2), e2);
                return f2;
            }
        } else {
            try {
                return ((Float) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).floatValue();
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Float", Float.valueOf(f2), e3);
                return f2;
            }
        }
    }

    public int getIntExtra(String str, int i2) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return i2;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Integer.parseInt((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Integer", Integer.valueOf(i2), e2);
                return i2;
            }
        } else {
            try {
                return ((Integer) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).intValue();
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Integer", Integer.valueOf(i2), e3);
                return i2;
            }
        }
    }

    public long getLongExtra(String str, long j2) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return j2;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Long.parseLong((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Long", Long.valueOf(j2), e2);
                return j2;
            }
        } else {
            try {
                return ((Long) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).longValue();
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Long", Long.valueOf(j2), e3);
                return j2;
            }
        }
    }

    public char getCharExtra(String str, char c2) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return c2;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            String str2 = (String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
            if (str2.length() == 1) {
                return str2.charAt(0);
            }
            typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Char", Character.valueOf(c2), null);
            return c2;
        }
        try {
            return ((Character) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).charValue();
        } catch (ClassCastException e2) {
            typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Char", Character.valueOf(c2), e2);
            return c2;
        }
    }

    public short getShortExtra(String str, short s) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return s;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Short.valueOf(Short.parseShort((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get)).shortValue();
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Short", Short.valueOf(s), e2);
                return s;
            }
        } else {
            try {
                return ((Short) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).shortValue();
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Short", Short.valueOf(s), e3);
                return s;
            }
        }
    }

    private void typeWarning(String str, Object obj, String str2, Object obj2, RuntimeException runtimeException) {
        com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_LogLancet_w("SmartIntent", "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        if (runtimeException != null) {
            com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_LogLancet_w("SmartIntent", "Attempt to cast generated internal exception:", runtimeException);
        }
    }
}
