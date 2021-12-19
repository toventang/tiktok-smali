package com.ss.avframework.utils;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.NativeObject;

public class TEBundle extends NativeObject {
    static {
        Covode.recordClassIndex(100607);
    }

    private native void nativeClear();

    private native long nativeClone();

    private native boolean nativeContains(String str);

    private native long nativeCopyFrom(long j2);

    private native void nativeCreate();

    private native void nativeDump();

    private native boolean nativeGetBool(String str);

    private native TEBundle nativeGetBundle(String str);

    private native double nativeGetDouble(String str);

    private native int nativeGetInt(String str);

    private native long nativeGetLong(String str);

    private native Object nativeGetObj(String str);

    private native String nativeGetString(String str);

    private native void nativeRelease();

    private native void nativeRemove(String str);

    private native void nativeSetBool(String str, boolean z);

    private native void nativeSetBundle(String str, TEBundle tEBundle);

    private native void nativeSetDouble(String str, double d2);

    private native void nativeSetInt(String str, int i2);

    private native void nativeSetLong(String str, long j2);

    private native void nativeSetObj(String str, Object obj);

    private native void nativeSetString(String str, String str2);

    private native String nativeToString();

    private native void nativeUpdateFrom(TEBundle tEBundle);

    @Override // com.ss.avframework.engine.NativeObject
    public void finalize() {
        release();
    }

    public TEBundle() {
        MethodCollector.i(12922);
        nativeCreate();
        MethodCollector.o(12922);
    }

    public void clear() {
        MethodCollector.i(14550);
        nativeClear();
        MethodCollector.o(14550);
    }

    public void dump() {
        MethodCollector.i(14548);
        nativeDump();
        MethodCollector.o(14548);
    }

    public String toString() {
        MethodCollector.i(14565);
        String nativeToString = nativeToString();
        MethodCollector.o(14565);
        return nativeToString;
    }

    public TEBundle copy() {
        MethodCollector.i(13108);
        TEBundle tEBundle = new TEBundle(nativeClone());
        MethodCollector.o(13108);
        return tEBundle;
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(14563);
        if (this.mNativeObj != 0) {
            nativeRelease();
            this.mNativeObj = 0;
        }
        MethodCollector.o(14563);
    }

    protected TEBundle(long j2) {
        this.mNativeObj = j2;
    }

    public boolean contains(String str) {
        MethodCollector.i(14514);
        boolean nativeContains = nativeContains(str);
        MethodCollector.o(14514);
        return nativeContains;
    }

    public boolean getBool(String str) {
        MethodCollector.i(14461);
        boolean nativeGetBool = nativeGetBool(str);
        MethodCollector.o(14461);
        return nativeGetBool;
    }

    public TEBundle getBundle(String str) {
        MethodCollector.i(14501);
        TEBundle nativeGetBundle = nativeGetBundle(str);
        MethodCollector.o(14501);
        return nativeGetBundle;
    }

    public double getDouble(String str) {
        MethodCollector.i(14476);
        double nativeGetDouble = nativeGetDouble(str);
        MethodCollector.o(14476);
        return nativeGetDouble;
    }

    public int getInt(String str) {
        MethodCollector.i(14447);
        int nativeGetInt = nativeGetInt(str);
        MethodCollector.o(14447);
        return nativeGetInt;
    }

    public long getLong(String str) {
        MethodCollector.i(14460);
        long nativeGetLong = nativeGetLong(str);
        MethodCollector.o(14460);
        return nativeGetLong;
    }

    public Object getObject(String str) {
        MethodCollector.i(14498);
        Object nativeGetObj = nativeGetObj(str);
        MethodCollector.o(14498);
        return nativeGetObj;
    }

    public String getString(String str) {
        MethodCollector.i(14546);
        String nativeGetString = nativeGetString(str);
        MethodCollector.o(14546);
        return nativeGetString;
    }

    public void remove(String str) {
        MethodCollector.i(14547);
        nativeRemove(str);
        MethodCollector.o(14547);
    }

    public void updateFrom(TEBundle tEBundle) {
        MethodCollector.i(13191);
        if (tEBundle != null) {
            nativeUpdateFrom(tEBundle);
            MethodCollector.o(13191);
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Bad parameters");
        MethodCollector.o(13191);
        throw androidRuntimeException;
    }

    public TEBundle(TEBundle tEBundle) {
        MethodCollector.i(12923);
        if (tEBundle != null) {
            this.mNativeObj = nativeCopyFrom(tEBundle.mNativeObj);
            MethodCollector.o(12923);
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Bad parameters");
        MethodCollector.o(12923);
        throw androidRuntimeException;
    }

    public void setBool(String str, boolean z) {
        MethodCollector.i(14415);
        nativeSetBool(str, z);
        MethodCollector.o(14415);
    }

    public void setBundle(String str, TEBundle tEBundle) {
        MethodCollector.i(14432);
        nativeSetBundle(str, tEBundle);
        MethodCollector.o(14432);
    }

    public void setDouble(String str, double d2) {
        MethodCollector.i(14416);
        nativeSetDouble(str, d2);
        MethodCollector.o(14416);
    }

    public void setInt(String str, int i2) {
        MethodCollector.i(14363);
        nativeSetInt(str, i2);
        MethodCollector.o(14363);
    }

    public void setLong(String str, long j2) {
        MethodCollector.i(14414);
        nativeSetLong(str, j2);
        MethodCollector.o(14414);
    }

    public void setString(String str, String str2) {
        MethodCollector.i(14536);
        nativeSetString(str, str2);
        MethodCollector.o(14536);
    }

    public void setObject(String str, Object obj) {
        MethodCollector.i(14446);
        nativeSetObj(str, obj);
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("No implament");
        MethodCollector.o(14446);
        throw androidRuntimeException;
    }

    public boolean equal(String str, Object obj) {
        boolean contains = contains(str);
        if (!contains) {
            return contains;
        }
        if (obj instanceof Integer) {
            if (getInt(str) == ((Integer) obj).intValue()) {
                return true;
            }
            return false;
        } else if (obj instanceof Long) {
            if (getLong(str) == ((Long) obj).longValue()) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return getString(str).equalsIgnoreCase((String) obj);
        } else {
            if (obj instanceof Boolean) {
                if (getBool(str) == ((Boolean) obj).booleanValue()) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Double)) {
                throw new AndroidRuntimeException("Not found Object type");
            } else if (getDouble(str) == ((Double) obj).doubleValue()) {
                return true;
            } else {
                return false;
            }
        }
    }
}
