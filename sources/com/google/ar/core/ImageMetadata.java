package com.google.ar.core;

import android.util.Rational;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.FatalException;

public class ImageMetadata {
    private final long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;
    private final ad sketchEntry;

    static {
        Covode.recordClassIndex(33021);
    }

    protected ImageMetadata() {
    }

    private native void nativeDestroyMetadataEntry(long j2, long j3);

    private native long[] nativeGetAllKeys(long j2, long j3);

    private native byte[] nativeGetByteArrayFromMetadataEntry(long j2, long j3);

    private native byte nativeGetByteFromMetadataEntry(long j2, long j3);

    private native double[] nativeGetDoubleArrayFromMetadataEntry(long j2, long j3);

    private native double nativeGetDoubleFromMetadataEntry(long j2, long j3);

    private native float[] nativeGetFloatArrayFromMetadataEntry(long j2, long j3);

    private native float nativeGetFloatFromMetadataEntry(long j2, long j3);

    private native int[] nativeGetIntArrayFromMetadataEntry(long j2, long j3);

    private native int nativeGetIntFromMetadataEntry(long j2, long j3);

    private native long[] nativeGetLongArrayFromMetadataEntry(long j2, long j3);

    private native long nativeGetLongFromMetadataEntry(long j2, long j3);

    private native long nativeGetMetadataEntry(long j2, long j3, int i2);

    private native int nativeGetMetadataEntryValueCount(long j2, long j3);

    private native int nativeGetMetadataEntryValueType(long j2, long j3);

    private native Rational[] nativeGetRationalArrayFromMetadataEntry(long j2, long j3);

    private native Rational nativeGetRationalFromMetadataEntry(long j2, long j3);

    static native void nativeLoadSymbols();

    private static native void nativeReleaseImageMetadata(long j2, long j3);

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(13356);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeReleaseImageMetadata(this.nativeSymbolTableHandle, j2);
        }
        super.finalize();
        MethodCollector.o(13356);
    }

    public long[] getKeys() {
        MethodCollector.i(13436);
        long[] nativeGetAllKeys = nativeGetAllKeys(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetAllKeys != null) {
            MethodCollector.o(13436);
            return nativeGetAllKeys;
        }
        FatalException fatalException = new FatalException("Unknown error in ImageMetadata.getKeys().");
        MethodCollector.o(13436);
        throw fatalException;
    }

    public byte getByte(int i2) {
        MethodCollector.i(13584);
        getMetdataEntry(i2, this.sketchEntry);
        ad adVar = this.sketchEntry;
        if (adVar.f53398b == 0 && adVar.f53399c == 1) {
            byte nativeGetByteFromMetadataEntry = nativeGetByteFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f53397a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f53397a);
            MethodCollector.o(13584);
            return nativeGetByteFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i2)}));
        MethodCollector.o(13584);
        throw illegalArgumentException;
    }

    public byte[] getByteArray(int i2) {
        MethodCollector.i(13938);
        getMetdataEntry(i2, this.sketchEntry);
        ad adVar = this.sketchEntry;
        if (adVar.f53398b == 0) {
            byte[] nativeGetByteArrayFromMetadataEntry = nativeGetByteArrayFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f53397a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f53397a);
            MethodCollector.o(13938);
            return nativeGetByteArrayFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i2)}));
        MethodCollector.o(13938);
        throw illegalArgumentException;
    }

    public double getDouble(int i2) {
        MethodCollector.i(13830);
        getMetdataEntry(i2, this.sketchEntry);
        ad adVar = this.sketchEntry;
        if (adVar.f53398b == 4 && adVar.f53399c == 1) {
            double nativeGetDoubleFromMetadataEntry = nativeGetDoubleFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f53397a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f53397a);
            MethodCollector.o(13830);
            return nativeGetDoubleFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i2)}));
        MethodCollector.o(13830);
        throw illegalArgumentException;
    }

    public double[] getDoubleArray(int i2) {
        MethodCollector.i(14090);
        getMetdataEntry(i2, this.sketchEntry);
        ad adVar = this.sketchEntry;
        if (adVar.f53398b == 4) {
            double[] nativeGetDoubleArrayFromMetadataEntry = nativeGetDoubleArrayFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f53397a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f53397a);
            MethodCollector.o(14090);
            return nativeGetDoubleArrayFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i2)}));
        MethodCollector.o(14090);
        throw illegalArgumentException;
    }

    public float getFloat(int i2) {
        MethodCollector.i(13725);
        getMetdataEntry(i2, this.sketchEntry);
        ad adVar = this.sketchEntry;
        if (adVar.f53398b == 2 && adVar.f53399c == 1) {
            float nativeGetFloatFromMetadataEntry = nativeGetFloatFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f53397a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f53397a);
            MethodCollector.o(13725);
            return nativeGetFloatFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i2)}));
        MethodCollector.o(13725);
        throw illegalArgumentException;
    }

    public float[] getFloatArray(int i2) {
        MethodCollector.i(14048);
        getMetdataEntry(i2, this.sketchEntry);
        ad adVar = this.sketchEntry;
        if (adVar.f53398b == 2) {
            float[] nativeGetFloatArrayFromMetadataEntry = nativeGetFloatArrayFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f53397a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f53397a);
            MethodCollector.o(14048);
            return nativeGetFloatArrayFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i2)}));
        MethodCollector.o(14048);
        throw illegalArgumentException;
    }

    public int getInt(int i2) {
        MethodCollector.i(13661);
        getMetdataEntry(i2, this.sketchEntry);
        ad adVar = this.sketchEntry;
        if (adVar.f53398b == 1 && adVar.f53399c == 1) {
            int nativeGetIntFromMetadataEntry = nativeGetIntFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f53397a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f53397a);
            MethodCollector.o(13661);
            return nativeGetIntFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i2)}));
        MethodCollector.o(13661);
        throw illegalArgumentException;
    }

    public int[] getIntArray(int i2) {
        MethodCollector.i(13989);
        getMetdataEntry(i2, this.sketchEntry);
        ad adVar = this.sketchEntry;
        if (adVar.f53398b == 1) {
            int[] nativeGetIntArrayFromMetadataEntry = nativeGetIntArrayFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f53397a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f53397a);
            MethodCollector.o(13989);
            return nativeGetIntArrayFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i2)}));
        MethodCollector.o(13989);
        throw illegalArgumentException;
    }

    public long getLong(int i2) {
        MethodCollector.i(13780);
        getMetdataEntry(i2, this.sketchEntry);
        ad adVar = this.sketchEntry;
        if (adVar.f53398b == 3 && adVar.f53399c == 1) {
            long nativeGetLongFromMetadataEntry = nativeGetLongFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f53397a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f53397a);
            MethodCollector.o(13780);
            return nativeGetLongFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Wrong return type for ImageMetadata key: %1$d, type: %2$d, count: %3$d.", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.sketchEntry.f53398b), Integer.valueOf(this.sketchEntry.f53399c)}));
        MethodCollector.o(13780);
        throw illegalArgumentException;
    }

    public long[] getLongArray(int i2) {
        MethodCollector.i(14050);
        getMetdataEntry(i2, this.sketchEntry);
        ad adVar = this.sketchEntry;
        if (adVar.f53398b == 3) {
            long[] nativeGetLongArrayFromMetadataEntry = nativeGetLongArrayFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f53397a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f53397a);
            MethodCollector.o(14050);
            return nativeGetLongArrayFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i2)}));
        MethodCollector.o(14050);
        throw illegalArgumentException;
    }

    public Rational getRational(int i2) {
        MethodCollector.i(13935);
        getMetdataEntry(i2, this.sketchEntry);
        ad adVar = this.sketchEntry;
        if (adVar.f53398b == 5 && adVar.f53399c == 1) {
            Rational nativeGetRationalFromMetadataEntry = nativeGetRationalFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f53397a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f53397a);
            MethodCollector.o(13935);
            return nativeGetRationalFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i2)}));
        MethodCollector.o(13935);
        throw illegalArgumentException;
    }

    public Rational[] getRationalArray(int i2) {
        MethodCollector.i(14091);
        getMetdataEntry(i2, this.sketchEntry);
        ad adVar = this.sketchEntry;
        if (adVar.f53398b == 5) {
            Rational[] nativeGetRationalArrayFromMetadataEntry = nativeGetRationalArrayFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f53397a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f53397a);
            MethodCollector.o(14091);
            return nativeGetRationalArrayFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i2)}));
        MethodCollector.o(14091);
        throw illegalArgumentException;
    }

    ImageMetadata(long j2, Session session2) {
        this.session = session2;
        this.nativeHandle = j2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        this.sketchEntry = new ad();
    }

    private void getMetdataEntry(int i2, ad adVar) {
        MethodCollector.i(14157);
        long nativeGetMetadataEntry = nativeGetMetadataEntry(this.session.nativeWrapperHandle, this.nativeHandle, i2);
        adVar.f53397a = nativeGetMetadataEntry;
        if (nativeGetMetadataEntry != 0) {
            adVar.f53398b = nativeGetMetadataEntryValueType(this.session.nativeWrapperHandle, nativeGetMetadataEntry);
            adVar.f53399c = nativeGetMetadataEntryValueCount(this.session.nativeWrapperHandle, adVar.f53397a);
            MethodCollector.o(14157);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Invalid ImageMetadata key: %1$d", new Object[]{Integer.valueOf(i2)}));
        MethodCollector.o(14157);
        throw illegalArgumentException;
    }
}
