package com.ss.bytenn;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.util.ArrayList;

public class API {
    public static String TAG = "BYTENN.API";
    private long engineHandle;

    public static int com_ss_bytenn_API_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static native long nativeCreateEngineInstance();

    public static native int nativeDestroyEngine(long j2);

    public static native Tensor[] nativeGetEngineOutputs(long j2);

    public static native Tensor[] nativeGetInputConfig(long j2);

    public static native int nativeInference(long j2);

    public static native int nativeInitEngine(long j2, ByteNNConfig byteNNConfig);

    public static native int nativeReInferShape(long j2, int i2, int i3);

    public static native int nativeReleaseEngine(long j2);

    public static native int nativeSetEngineInputs(long j2, Tensor[] tensorArr);

    static {
        Covode.recordClassIndex(100700);
        com_ss_bytenn_API_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
        com_ss_bytenn_API_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytennwrapper");
    }

    public a DestroyEngine() {
        MethodCollector.i(5396);
        a aVar = a.values()[nativeDestroyEngine(this.engineHandle)];
        this.engineHandle = 0;
        MethodCollector.o(5396);
        return aVar;
    }

    public a Inference() {
        MethodCollector.i(5173);
        a aVar = a.values()[nativeInference(this.engineHandle)];
        MethodCollector.o(5173);
        return aVar;
    }

    public a ReleaseEngine() {
        MethodCollector.i(5393);
        a aVar = a.values()[nativeReleaseEngine(this.engineHandle)];
        MethodCollector.o(5393);
        return aVar;
    }

    public a CreateEngine() {
        MethodCollector.i(4784);
        long nativeCreateEngineInstance = nativeCreateEngineInstance();
        this.engineHandle = nativeCreateEngineInstance;
        if (nativeCreateEngineInstance == 0) {
            com_ss_bytenn_API_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "createEngine fail");
            a aVar = a.ERR_MEMORY_ALLOC;
            MethodCollector.o(4784);
            return aVar;
        }
        a aVar2 = a.NO_ERROR;
        MethodCollector.o(4784);
        return aVar2;
    }

    public enum a {
        NO_ERROR,
        ERR_MEMORY_ALLOC,
        NOT_IMPLEMENTED,
        ERR_UNEXPECTED,
        ERR_DATANOMATCH,
        INPUT_DATA_ERROR,
        CALL_BACK_STOP,
        BACKEND_FALLBACK,
        NULL_POINTER,
        INVALID_POINTER,
        INVALID_MODEL,
        INFER_SIZE_ERROR,
        NOT_SUPPORT;

        static {
            Covode.recordClassIndex(100701);
        }
    }

    public static void com_ss_bytenn_API_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public a GetEngineInputConfig(ArrayList<Tensor> arrayList) {
        MethodCollector.i(4984);
        Tensor[] nativeGetInputConfig = nativeGetInputConfig(this.engineHandle);
        if (nativeGetInputConfig.length <= 0) {
            a aVar = a.ERR_UNEXPECTED;
            MethodCollector.o(4984);
            return aVar;
        }
        for (Tensor tensor : nativeGetInputConfig) {
            arrayList.add(tensor);
        }
        a aVar2 = a.NO_ERROR;
        MethodCollector.o(4984);
        return aVar2;
    }

    public a GetEngineOutputs(ArrayList<Tensor> arrayList) {
        MethodCollector.i(5391);
        Tensor[] nativeGetEngineOutputs = nativeGetEngineOutputs(this.engineHandle);
        if (nativeGetEngineOutputs.length <= 0) {
            a aVar = a.ERR_UNEXPECTED;
            MethodCollector.o(5391);
            return aVar;
        }
        for (Tensor tensor : nativeGetEngineOutputs) {
            arrayList.add(tensor);
        }
        a aVar2 = a.NO_ERROR;
        MethodCollector.o(5391);
        return aVar2;
    }

    public a InitEngine(ByteNNConfig byteNNConfig) {
        MethodCollector.i(4879);
        int nativeInitEngine = nativeInitEngine(this.engineHandle, byteNNConfig);
        if (a.NO_ERROR != a.values()[nativeInitEngine]) {
            com_ss_bytenn_API_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "InitEngine error code: ".concat(String.valueOf(nativeInitEngine)));
        }
        a aVar = a.values()[nativeInitEngine];
        MethodCollector.o(4879);
        return aVar;
    }

    public a SetEngineInputs(ArrayList<Tensor> arrayList) {
        MethodCollector.i(4887);
        a aVar = a.values()[nativeSetEngineInputs(this.engineHandle, (Tensor[]) arrayList.toArray(new Tensor[arrayList.size()]))];
        MethodCollector.o(4887);
        return aVar;
    }

    public a ReInferShape(int i2, int i3) {
        MethodCollector.i(5368);
        a aVar = a.values()[nativeReInferShape(this.engineHandle, i3, i2)];
        MethodCollector.o(5368);
        return aVar;
    }
}
