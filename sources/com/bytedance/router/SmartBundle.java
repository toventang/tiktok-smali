package com.bytedance.router;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

public class SmartBundle {
    private Bundle mBundle;

    static {
        Covode.recordClassIndex(26127);
    }

    public static int com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2, Throwable th) {
        return 0;
    }

    public Bundle getBundle() {
        return this.mBundle;
    }

    public void clear() {
        this.mBundle.clear();
    }

    public ClassLoader getClassLoader() {
        return this.mBundle.getClassLoader();
    }

    public boolean hasFileDescriptors() {
        return this.mBundle.hasFileDescriptors();
    }

    public boolean isEmpty() {
        return this.mBundle.isEmpty();
    }

    public Set<String> keySet() {
        return this.mBundle.keySet();
    }

    public int size() {
        return this.mBundle.size();
    }

    public synchronized String toString() {
        String bundle;
        MethodCollector.i(12540);
        bundle = this.mBundle.toString();
        MethodCollector.o(12540);
        return bundle;
    }

    public boolean containsKey(String str) {
        return this.mBundle.containsKey(str);
    }

    public Object get(String str) {
        return com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get(this.mBundle, str);
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean[] getBooleanArray(String str) {
        return this.mBundle.getBooleanArray(str);
    }

    public Bundle getBundle(String str) {
        return this.mBundle.getBundle(str);
    }

    public byte[] getByteArray(String str) {
        return this.mBundle.getByteArray(str);
    }

    public char getChar(String str) {
        return getChar(str, 0);
    }

    public char[] getCharArray(String str) {
        return this.mBundle.getCharArray(str);
    }

    public CharSequence getCharSequence(String str) {
        return this.mBundle.getCharSequence(str);
    }

    public CharSequence[] getCharSequenceArray(String str) {
        return this.mBundle.getCharSequenceArray(str);
    }

    public ArrayList<CharSequence> getCharSequenceArrayList(String str) {
        return this.mBundle.getCharSequenceArrayList(str);
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public double[] getDoubleArray(String str) {
        return this.mBundle.getDoubleArray(str);
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public float[] getFloatArray(String str) {
        return this.mBundle.getFloatArray(str);
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public int[] getIntArray(String str) {
        return this.mBundle.getIntArray(str);
    }

    public ArrayList<Integer> getIntegerArrayList(String str) {
        return this.mBundle.getIntegerArrayList(str);
    }

    public long getLong(String str) {
        return getLong(str, 0);
    }

    public long[] getLongArray(String str) {
        return this.mBundle.getLongArray(str);
    }

    public <T extends Parcelable> T getParcelable(String str) {
        return (T) this.mBundle.getParcelable(str);
    }

    public Parcelable[] getParcelableArray(String str) {
        return this.mBundle.getParcelableArray(str);
    }

    public <T extends Parcelable> ArrayList<T> getParcelableArrayList(String str) {
        return this.mBundle.getParcelableArrayList(str);
    }

    public Serializable getSerializable(String str) {
        return this.mBundle.getSerializable(str);
    }

    public short getShort(String str) {
        return getShort(str, 0);
    }

    public short[] getShortArray(String str) {
        return this.mBundle.getShortArray(str);
    }

    public <T extends Parcelable> SparseArray<T> getSparseParcelableArray(String str) {
        return this.mBundle.getSparseParcelableArray(str);
    }

    public String getString(String str) {
        return this.mBundle.getString(str);
    }

    public String[] getStringArray(String str) {
        return this.mBundle.getStringArray(str);
    }

    public ArrayList<String> getStringArrayList(String str) {
        return this.mBundle.getStringArrayList(str);
    }

    public void putAll(Bundle bundle) {
        this.mBundle.putAll(bundle);
    }

    public void remove(String str) {
        this.mBundle.remove(str);
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.mBundle.setClassLoader(classLoader);
    }

    SmartBundle(Bundle bundle) {
        this.mBundle = bundle == null ? new Bundle() : bundle;
    }

    public byte getByte(String str) {
        return getByte(str, (byte) 0).byteValue();
    }

    public static Object com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public void putBoolean(String str, boolean z) {
        this.mBundle.putBoolean(str, z);
    }

    public void putBooleanArray(String str, boolean[] zArr) {
        this.mBundle.putBooleanArray(str, zArr);
    }

    public void putBundle(String str, Bundle bundle) {
        this.mBundle.putBundle(str, bundle);
    }

    public void putByte(String str, byte b2) {
        this.mBundle.putByte(str, b2);
    }

    public void putByteArray(String str, byte[] bArr) {
        this.mBundle.putByteArray(str, bArr);
    }

    public void putChar(String str, char c2) {
        this.mBundle.putChar(str, c2);
    }

    public void putCharArray(String str, char[] cArr) {
        this.mBundle.putCharArray(str, cArr);
    }

    public void putCharSequence(String str, CharSequence charSequence) {
        this.mBundle.putCharSequence(str, charSequence);
    }

    public void putCharSequenceArray(String str, CharSequence[] charSequenceArr) {
        this.mBundle.putCharSequenceArray(str, charSequenceArr);
    }

    public void putCharSequenceArrayList(String str, ArrayList<CharSequence> arrayList) {
        this.mBundle.putCharSequenceArrayList(str, arrayList);
    }

    public void putDouble(String str, double d2) {
        this.mBundle.putDouble(str, d2);
    }

    public void putDoubleArray(String str, double[] dArr) {
        this.mBundle.putDoubleArray(str, dArr);
    }

    public void putFloat(String str, float f2) {
        this.mBundle.putFloat(str, f2);
    }

    public void putFloatArray(String str, float[] fArr) {
        this.mBundle.putFloatArray(str, fArr);
    }

    public void putInt(String str, int i2) {
        this.mBundle.putInt(str, i2);
    }

    public void putIntArray(String str, int[] iArr) {
        this.mBundle.putIntArray(str, iArr);
    }

    public void putIntegerArrayList(String str, ArrayList<Integer> arrayList) {
        this.mBundle.putIntegerArrayList(str, arrayList);
    }

    public void putLong(String str, long j2) {
        this.mBundle.putLong(str, j2);
    }

    public void putLongArray(String str, long[] jArr) {
        this.mBundle.putLongArray(str, jArr);
    }

    public void putParcelable(String str, Parcelable parcelable) {
        this.mBundle.putParcelable(str, parcelable);
    }

    public void putParcelableArray(String str, Parcelable[] parcelableArr) {
        this.mBundle.putParcelableArray(str, parcelableArr);
    }

    public void putParcelableArrayList(String str, ArrayList<? extends Parcelable> arrayList) {
        this.mBundle.putParcelableArrayList(str, arrayList);
    }

    public void putSerializable(String str, Serializable serializable) {
        this.mBundle.putSerializable(str, serializable);
    }

    public void putShort(String str, short s) {
        this.mBundle.putShort(str, s);
    }

    public void putShortArray(String str, short[] sArr) {
        this.mBundle.putShortArray(str, sArr);
    }

    public void putSparseParcelableArray(String str, SparseArray<? extends Parcelable> sparseArray) {
        this.mBundle.putSparseParcelableArray(str, sparseArray);
    }

    public void putString(String str, String str2) {
        this.mBundle.putString(str, str2);
    }

    public void putStringArray(String str, String[] strArr) {
        this.mBundle.putStringArray(str, strArr);
    }

    public void putStringArrayList(String str, ArrayList<String> arrayList) {
        this.mBundle.putStringArrayList(str, arrayList);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        this.mBundle.writeToParcel(parcel, i2);
    }

    public CharSequence getCharSequence(String str, CharSequence charSequence) {
        return this.mBundle.getCharSequence(str, charSequence);
    }

    public String getString(String str, String str2) {
        return this.mBundle.getString(str, str2);
    }

    public boolean getBoolean(String str, boolean z) {
        Object com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundle = this.mBundle;
        if (bundle == null || (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str)) == null) {
            return z;
        }
        if (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Boolean.parseBoolean((String) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Boolean", Boolean.valueOf(z), e2);
                return z;
            }
        } else {
            try {
                return ((Boolean) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get).booleanValue();
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Boolean", Boolean.valueOf(z), e3);
                return z;
            }
        }
    }

    public double getDouble(String str, double d2) {
        Object com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundle = this.mBundle;
        if (bundle == null || (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str)) == null) {
            return d2;
        }
        if (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Double.parseDouble((String) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Double", Double.valueOf(d2), e2);
                return d2;
            }
        } else {
            try {
                return ((Double) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get).doubleValue();
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Double", Double.valueOf(d2), e3);
                return d2;
            }
        }
    }

    public float getFloat(String str, float f2) {
        Object com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundle = this.mBundle;
        if (bundle == null || (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str)) == null) {
            return f2;
        }
        if (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Float.parseFloat((String) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Float", Float.valueOf(f2), e2);
                return f2;
            }
        } else {
            try {
                return ((Float) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get).floatValue();
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Float", Float.valueOf(f2), e3);
                return f2;
            }
        }
    }

    public int getInt(String str, int i2) {
        Object com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundle = this.mBundle;
        if (bundle == null || (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str)) == null) {
            return i2;
        }
        if (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Integer.parseInt((String) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Integer", Integer.valueOf(i2), e2);
                return i2;
            }
        } else {
            try {
                return ((Integer) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get).intValue();
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Integer", Integer.valueOf(i2), e3);
                return i2;
            }
        }
    }

    public long getLong(String str, long j2) {
        Object com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundle = this.mBundle;
        if (bundle == null || (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str)) == null) {
            return j2;
        }
        if (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Long.parseLong((String) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Long", Long.valueOf(j2), e2);
                return j2;
            }
        } else {
            try {
                return ((Long) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get).longValue();
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Long", Long.valueOf(j2), e3);
                return j2;
            }
        }
    }

    public Byte getByte(String str, byte b2) {
        Bundle bundle = this.mBundle;
        if (bundle == null) {
            return Byte.valueOf(b2);
        }
        Object com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str);
        if (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get == null) {
            return Byte.valueOf(b2);
        }
        if (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Byte.valueOf(Byte.parseByte((String) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get));
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Byte", Byte.valueOf(b2), e2);
                return Byte.valueOf(b2);
            }
        } else {
            try {
                return (Byte) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Byte", Byte.valueOf(b2), e3);
                return Byte.valueOf(b2);
            }
        }
    }

    public char getChar(String str, char c2) {
        Object com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundle = this.mBundle;
        if (bundle == null || (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str)) == null) {
            return c2;
        }
        if (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            String str2 = (String) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
            if (str2.length() == 1) {
                return str2.charAt(0);
            }
            typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Char", Character.valueOf(c2), null);
            return c2;
        }
        try {
            return ((Character) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get).charValue();
        } catch (ClassCastException e2) {
            typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Char", Character.valueOf(c2), e2);
            return c2;
        }
    }

    public short getShort(String str, short s) {
        Object com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundle = this.mBundle;
        if (bundle == null || (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str)) == null) {
            return s;
        }
        if (com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Short.valueOf(Short.parseShort((String) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get)).shortValue();
            } catch (NumberFormatException e2) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Short", Short.valueOf(s), e2);
                return s;
            }
        } else {
            try {
                return ((Short) com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get).shortValue();
            } catch (ClassCastException e3) {
                typeWarning(str, com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Short", Short.valueOf(s), e3);
                return s;
            }
        }
    }

    private void typeWarning(String str, Object obj, String str2, Object obj2, RuntimeException runtimeException) {
        com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_LogLancet_w("SmartIntent", "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        if (runtimeException != null) {
            com_bytedance_router_SmartBundle_com_ss_android_ugc_aweme_lancet_LogLancet_w("SmartIntent", "Attempt to cast generated internal exception:", runtimeException);
        }
    }
}
