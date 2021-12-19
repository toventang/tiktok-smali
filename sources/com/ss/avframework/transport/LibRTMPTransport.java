package com.ss.avframework.transport;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.Transport;
import com.ss.avframework.engine.VsyncModule;
import com.ss.avframework.statics.StaticsReport;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.LibraryLoader;
import com.ss.avframework.utils.TEBundle;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONObject;

public class LibRTMPTransport extends NativeTransport {
    private VsyncModule mVsyncModule;

    static {
        Covode.recordClassIndex(100570);
    }

    private native int nativeAddSeiField(String str, Object obj, int i2, long j2, boolean z, boolean z2, int i3);

    private native void nativeAddUserMetaData(String str, String str2, int i2);

    private native void nativeCreateNative(boolean z, boolean z2, String str);

    private native String nativeGetDnsIP();

    private native long nativeGetInt64Value(int i2);

    private native String nativeGetLocalIP();

    private native String nativeGetRemoteIP();

    private native boolean nativeGetStaticsReport(StaticsReport staticsReport);

    private native void nativeInitRtsJniEnv(Context context);

    private native int nativeSendSeiMsg(String str);

    private native boolean nativeSetupUrl(String str);

    private native void nativeStartTransportInDebug();

    private native void nativeStopTransportInDebug();

    @Override // com.ss.avframework.engine.Transport
    public VsyncModule getVsyncModule() {
        return this.mVsyncModule;
    }

    @Override // com.ss.avframework.engine.Transport
    public String getDnsIP() {
        MethodCollector.i(11021);
        String nativeGetDnsIP = nativeGetDnsIP();
        MethodCollector.o(11021);
        return nativeGetDnsIP;
    }

    @Override // com.ss.avframework.engine.Transport
    public String getLocalIP() {
        MethodCollector.i(11020);
        String nativeGetLocalIP = nativeGetLocalIP();
        MethodCollector.o(11020);
        return nativeGetLocalIP;
    }

    @Override // com.ss.avframework.engine.Transport
    public String getRemoteIP() {
        MethodCollector.i(11019);
        String nativeGetRemoteIP = nativeGetRemoteIP();
        MethodCollector.o(11019);
        return nativeGetRemoteIP;
    }

    @Override // com.ss.avframework.transport.NativeTransport, com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(11179);
        VsyncModule vsyncModule = this.mVsyncModule;
        if (vsyncModule != null) {
            vsyncModule.release();
            this.mVsyncModule = null;
        }
        super.release();
        MethodCollector.o(11179);
    }

    @Override // com.ss.avframework.engine.Transport
    public synchronized void startTransportInDebug() {
        MethodCollector.i(11338);
        nativeStartTransportInDebug();
        MethodCollector.o(11338);
    }

    @Override // com.ss.avframework.engine.Transport
    public synchronized void stopTransportInDebug() {
        MethodCollector.i(11181);
        nativeStopTransportInDebug();
        MethodCollector.o(11181);
    }

    @Override // com.ss.avframework.transport.NativeTransport, com.ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.registerFeedbackObserber(feedbackObserver);
    }

    @Override // com.ss.avframework.transport.NativeTransport, com.ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.unRegisterFeedbackObserber(feedbackObserver);
    }

    @Override // com.ss.avframework.engine.Transport
    public long getInt64Value(int i2) {
        MethodCollector.i(11022);
        long nativeGetInt64Value = nativeGetInt64Value(i2);
        MethodCollector.o(11022);
        return nativeGetInt64Value;
    }

    @Override // com.ss.avframework.statics.StaticsReport.StaticReportInterface, com.ss.avframework.engine.Transport
    public boolean getStaticsReport(StaticsReport staticsReport) {
        MethodCollector.i(11017);
        super.getStaticsReport(staticsReport);
        boolean nativeGetStaticsReport = nativeGetStaticsReport(staticsReport);
        MethodCollector.o(11017);
        return nativeGetStaticsReport;
    }

    @Override // com.ss.avframework.engine.Transport
    public int sendSeiMsg(String str) {
        MethodCollector.i(10697);
        if (str == null) {
            MethodCollector.o(10697);
            return -2;
        }
        int nativeSendSeiMsg = nativeSendSeiMsg(str);
        MethodCollector.o(10697);
        return nativeSendSeiMsg;
    }

    @Override // com.ss.avframework.engine.Transport
    public synchronized void setVysncModule(VsyncModule vsyncModule) {
        MethodCollector.i(11178);
        VsyncModule vsyncModule2 = this.mVsyncModule;
        if (vsyncModule2 != null) {
            vsyncModule2.release();
        }
        this.mVsyncModule = vsyncModule;
        MethodCollector.o(11178);
    }

    @Override // com.ss.avframework.engine.Transport
    public boolean setupUrl(String str) {
        boolean z;
        String str2;
        MethodCollector.i(10696);
        if (str != null) {
            z = nativeSetupUrl(str);
        } else {
            z = false;
        }
        AVLog.iod("LibRTMPTransport", "Setup url ".concat(String.valueOf(str)));
        TEBundle parameter = getParameter();
        StringBuilder sb = new StringBuilder("config:");
        if (parameter != null) {
            str2 = parameter.toString();
        } else {
            str2 = "null";
        }
        AVLog.iod("LibRTMPTransport", sb.append(str2).toString());
        MethodCollector.o(10696);
        return z;
    }

    @Override // com.ss.avframework.transport.NativeTransport, com.ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void sendPacket(Buffer buffer, int i2) {
        super.sendPacket(buffer, i2);
    }

    @Override // com.ss.avframework.engine.Transport
    public int addSeiField(String str, Object obj, int i2) {
        return addSeiField(str, obj, i2, 0, true, true);
    }

    @Override // com.ss.avframework.engine.Transport
    public void addUserMetaData(String str, String str2, int i2) {
        MethodCollector.i(11016);
        nativeAddUserMetaData(str, str2, i2);
        MethodCollector.o(11016);
    }

    public LibRTMPTransport(boolean z, boolean z2, boolean z3) {
        MethodCollector.i(10531);
        String str = "LibRTMPTransport";
        if (z3) {
            try {
                boolean loadLibrary = LibraryLoader.loadLibrary("volcenginertc");
                AVLog.ioi(str, "RtcNativeLibraryLoader load(" + "volcenginertc" + "): " + loadLibrary);
                if (loadLibrary) {
                    nativeInitRtsJniEnv(ContextUtils.getApplicationContext());
                    str = "RTSTransport";
                }
            } catch (Exception e2) {
                AVLog.logToIODevice(6, str, "RtcNativeLibraryLoader load(" + "volcenginertc" + ") error", e2);
            }
        }
        nativeCreateNative(z, z2, str);
        MethodCollector.i(10531);
        MethodCollector.o(10531);
    }

    @Override // com.ss.avframework.engine.Transport
    public int addSeiField(String str, Object obj, int i2, long j2, boolean z, boolean z2) {
        return addSeiField(str, obj, i2, j2, z, z2, 0);
    }

    @Override // com.ss.avframework.engine.Transport
    public int addSeiField(String str, Object obj, int i2, long j2, boolean z, boolean z2, int i3) {
        MethodCollector.i(10845);
        if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (!byteBuffer.isDirect() || byteBuffer.remaining() != byteBuffer.capacity()) {
                AVLog.ioe("LibRTMPTransport", "A DirectByteBuffer is needed and its remaining size should equals to its capacity.");
                MethodCollector.o(10845);
                return -1;
            }
        } else if (str == null || str.isEmpty()) {
            AVLog.logToIODevice2(6, "LibRTMPTransport", "When value is not a ByteBuffer, a valid key should be specified.", null, "LibRTMPTransport.java::addSeiField", 10000);
            MethodCollector.o(10845);
            return -2;
        } else if (obj != null && !(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
            AVLog.ioe("LibRTMPTransport", "Unsupported value type: " + obj.getClass().getName());
            MethodCollector.o(10845);
            return -3;
        } else if ((i3 & 1 & 1) > 0 && !(obj instanceof JSONObject)) {
            AVLog.ioe("LibRTMPTransport", "value type must be JSONObject when seiFlag is:1");
            MethodCollector.o(10845);
            return -4;
        }
        int nativeAddSeiField = nativeAddSeiField(str, obj, i2, j2, z, z2, i3);
        MethodCollector.o(10845);
        return nativeAddSeiField;
    }
}
