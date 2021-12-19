package com.bytedance.vcloud.networkpredictor;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.mlcomponent_api.MLComponentManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

public class DefaultSpeedPredictor implements Handler.Callback, ISpeedPredictor {
    ReentrantReadWriteLock lock;
    private MLComponentManager mComponentManager;
    private long mHandle;
    public Handler mSpeedUpdateHander;
    final ReentrantReadWriteLock.ReadLock readLock;
    private Thread subThread;
    final ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();

    static {
        Covode.recordClassIndex(28033);
    }

    private native void _close(long j2);

    private native long _create(int i2);

    private native float _getAverageDownloadSpeed(long j2, int i2, int i3, boolean z);

    private native double _getDoubleValue(long j2, int i2, double d2);

    private native Map<String, String> _getDownloadSpeed(long j2, int i2);

    private native int _getIntValue(long j2, int i2, int i3);

    private native float _getLastPredictConfidence(long j2);

    private native long _getLongValue(long j2, int i2, long j3);

    private native SpeedPredictorResultCollection _getMultidimensionalDownloadSpeeds(long j2);

    private native SpeedPredictorResultCollection _getMultidimensionalPredictSpeeds(long j2);

    private native float _getPredictSpeed(long j2, int i2);

    private native String _getVersion();

    private native void _prepare(long j2);

    private native void _release(long j2);

    private native void _setConfigSpeedInfo(long j2, Map<String, String> map);

    private native void _setDoubleValue(long j2, int i2, double d2);

    private native void _setIntValue(long j2, int i2, int i3);

    private native void _setLongValue(long j2, int i2, long j3);

    private native void _setModelComponent(long j2, MLComponentManager mLComponentManager);

    private native void _setSpeedQueueSize(long j2, int i2);

    private native void _setStringValue(long j2, int i2, String str);

    private native void _start(long j2);

    private native void _update(long j2, ArrayList<SpeedPredictorRecord> arrayList, Map<String, Integer> map);

    private native void _updateOldWithStreamId(long j2, ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map);

    private native void _updateWithSizeTime(long j2, long j3, long j4, long j5);

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getPredictSpeed() {
        return getPredictSpeed(0);
    }

    private void resetSpeedPredictor() {
        Handler handler = this.mSpeedUpdateHander;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mSpeedUpdateHander.getLooper().quit();
            this.mSpeedUpdateHander = null;
            this.subThread = null;
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getVersion() {
        MethodCollector.i(3261);
        if (this.mHandle == 0) {
            MethodCollector.o(3261);
            return "j_1.3.0";
        }
        String _getVersion = _getVersion();
        MethodCollector.o(3261);
        return _getVersion;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void close() {
        MethodCollector.i(3279);
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3279);
            return;
        }
        _close(j2);
        this.readLock.unlock();
        MethodCollector.o(3279);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getLastPredictConfidence() {
        MethodCollector.i(3696);
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3696);
            return -1.0f;
        }
        float _getLastPredictConfidence = _getLastPredictConfidence(j2);
        this.readLock.unlock();
        MethodCollector.o(3696);
        return _getLastPredictConfidence;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getMultidimensionalDownloadSpeeds() {
        MethodCollector.i(3711);
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3711);
            return null;
        }
        String speedPredictorResultArrayToString = speedPredictorResultArrayToString(_getMultidimensionalDownloadSpeeds(j2).getResultCollection());
        this.readLock.unlock();
        MethodCollector.o(3711);
        return speedPredictorResultArrayToString;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public SpeedPredictorResultCollection getMultidimensionalDownloadSpeedsObj() {
        MethodCollector.i(3718);
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3718);
            return null;
        }
        SpeedPredictorResultCollection _getMultidimensionalDownloadSpeeds = _getMultidimensionalDownloadSpeeds(j2);
        this.readLock.unlock();
        MethodCollector.o(3718);
        return _getMultidimensionalDownloadSpeeds;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getMultidimensionalPredictSpeeds() {
        MethodCollector.i(3715);
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3715);
            return null;
        }
        SpeedPredictorResultCollection _getMultidimensionalPredictSpeeds = _getMultidimensionalPredictSpeeds(j2);
        if (_getMultidimensionalPredictSpeeds != null) {
            this.readLock.unlock();
            String speedPredictorResultArrayToString = speedPredictorResultArrayToString(_getMultidimensionalPredictSpeeds.getResultCollection());
            MethodCollector.o(3715);
            return speedPredictorResultArrayToString;
        }
        this.readLock.unlock();
        MethodCollector.o(3715);
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public SpeedPredictorResultCollection getMultidimensionalPredictSpeedsObj() {
        MethodCollector.i(3723);
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3723);
            return null;
        }
        SpeedPredictorResultCollection _getMultidimensionalPredictSpeeds = _getMultidimensionalPredictSpeeds(j2);
        this.readLock.unlock();
        MethodCollector.o(3723);
        return _getMultidimensionalPredictSpeeds;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void prepare() {
        MethodCollector.i(3273);
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3273);
            return;
        }
        _prepare(j2);
        this.readLock.unlock();
        MethodCollector.o(3273);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void release() {
        MethodCollector.i(3973);
        this.writeLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.writeLock.unlock();
            MethodCollector.o(3973);
            return;
        }
        _close(j2);
        _release(this.mHandle);
        this.mHandle = 0;
        resetSpeedPredictor();
        this.writeLock.unlock();
        MethodCollector.o(3973);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void start() {
        MethodCollector.i(3277);
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3277);
            return;
        }
        _start(j2);
        this.readLock.unlock();
        MethodCollector.o(3277);
    }

    public boolean handleMessage(Message message) {
        MethodCollector.i(4163);
        if (message.what == 0) {
            SpeedPredictorNotifyInfo speedPredictorNotifyInfo = (SpeedPredictorNotifyInfo) message.obj;
            _updateOldWithStreamId(this.mHandle, speedPredictorNotifyInfo.mSpeedRecord, speedPredictorNotifyInfo.mStreamIdMediaTypeMap);
        }
        MethodCollector.o(4163);
        return true;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public Map<String, String> getDownloadSpeed(int i2) {
        MethodCollector.i(3698);
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3698);
            return null;
        }
        Map<String, String> _getDownloadSpeed = _getDownloadSpeed(j2, i2);
        this.readLock.unlock();
        MethodCollector.o(3698);
        return _getDownloadSpeed;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getPredictSpeed(int i2) {
        MethodCollector.i(3695);
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3695);
            return -1.0f;
        }
        float _getPredictSpeed = _getPredictSpeed(j2, i2);
        this.readLock.unlock();
        MethodCollector.o(3695);
        return _getPredictSpeed;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void setConfigInfo(Map map) {
        MethodCollector.i(3267);
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3267);
            return;
        }
        _setConfigSpeedInfo(j2, map);
        this.readLock.unlock();
        MethodCollector.o(3267);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void setModelComponent(MLComponentManager mLComponentManager) {
        MethodCollector.i(3265);
        this.mComponentManager = mLComponentManager;
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3265);
            return;
        }
        _setModelComponent(j2, this.mComponentManager);
        this.readLock.unlock();
        MethodCollector.o(3265);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void setSpeedQueueSize(int i2) {
        MethodCollector.i(3269);
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3269);
            return;
        }
        _setSpeedQueueSize(j2, i2);
        this.readLock.unlock();
        MethodCollector.o(3269);
    }

    public DefaultSpeedPredictor(int i2) {
        MethodCollector.i(2898);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(false);
        this.lock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        SpeedPredictorJniLoader.loadLibrary();
        if (!SpeedPredictorJniLoader.isLibraryLoaded) {
            SpeedPredictorLog.e("SpeedPredictor", "[SpeedPredictor] no predictor native loaded");
            MethodCollector.o(2898);
            return;
        }
        this.mHandle = _create(i2);
        SpeedPredictorConfig.setLoglevel(0);
        _setIntValue(this.mHandle, 0, SpeedPredictorConfig.getLogLevel());
        MethodCollector.o(2898);
    }

    private String speedPredictorResultArrayToString(ArrayList<SpeedPredictorResult> arrayList) {
        JSONObject jsonObject;
        if (arrayList == null) {
            try {
                throw new NullPointerException("size");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator<SpeedPredictorResult> it = arrayList.iterator();
            while (it.hasNext()) {
                SpeedPredictorResult next = it.next();
                if (!(next == null || (jsonObject = next.toJsonObject()) == null)) {
                    jSONArray.put(jsonObject);
                }
            }
            if (jSONArray.length() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data", jSONArray);
                return jSONObject.toString();
            }
            return null;
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map) {
        MethodCollector.i(3706);
        this.readLock.lock();
        if (this.mHandle == 0) {
            this.readLock.unlock();
            MethodCollector.o(3706);
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (this.subThread == null) {
                AnonymousClass1 r1 = new Thread() {
                    /* class com.bytedance.vcloud.networkpredictor.DefaultSpeedPredictor.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(28034);
                    }

                    public void run() {
                        if (Looper.myLooper() == null) {
                            Looper.prepare();
                        }
                        DefaultSpeedPredictor.this.mSpeedUpdateHander = new Handler(this);
                        Looper.loop();
                    }
                };
                this.subThread = r1;
                r1.setName("speed_predict_update_thread");
                this.subThread.start();
            }
            if (this.mSpeedUpdateHander != null) {
                SpeedPredictorNotifyInfo speedPredictorNotifyInfo = new SpeedPredictorNotifyInfo();
                speedPredictorNotifyInfo.what = 0;
                speedPredictorNotifyInfo.mSpeedRecord = iSpeedRecordOld;
                speedPredictorNotifyInfo.mStreamIdMediaTypeMap = map;
                Message obtainMessage = this.mSpeedUpdateHander.obtainMessage();
                obtainMessage.what = 0;
                obtainMessage.obj = speedPredictorNotifyInfo;
                obtainMessage.sendToTarget();
            }
        } else {
            _updateOldWithStreamId(this.mHandle, iSpeedRecordOld, map);
        }
        this.readLock.unlock();
        MethodCollector.o(3706);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(String str, Map<String, Integer> map) {
        MethodCollector.i(3702);
        this.readLock.lock();
        if (this.mHandle == 0 || str == null || str.length() < 0 || map == null || map.size() < 0) {
            this.readLock.unlock();
            MethodCollector.o(3702);
            return;
        }
        this.readLock.unlock();
        try {
            JSONArray optJSONArray = new JSONObject(str).optJSONArray("data");
            ArrayList<SpeedPredictorRecord> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i2);
                    SpeedPredictorRecord speedPredictorRecord = new SpeedPredictorRecord();
                    speedPredictorRecord.extractFields(jSONObject);
                    arrayList.add(speedPredictorRecord);
                } catch (Throwable unused) {
                }
            }
            this.readLock.lock();
            _update(this.mHandle, arrayList, map);
            this.readLock.unlock();
            MethodCollector.o(3702);
        } catch (Exception unused2) {
            MethodCollector.o(3702);
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getAverageDownloadSpeed(int i2, int i3, boolean z) {
        MethodCollector.i(3962);
        this.readLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3962);
            return -1.0f;
        }
        float _getAverageDownloadSpeed = _getAverageDownloadSpeed(j2, i2, i3, z);
        this.readLock.unlock();
        MethodCollector.o(3962);
        return _getAverageDownloadSpeed;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(long j2, long j3, long j4) {
        MethodCollector.i(3708);
        this.readLock.lock();
        long j5 = this.mHandle;
        if (j5 == 0) {
            this.readLock.unlock();
            MethodCollector.o(3708);
            return;
        }
        _updateWithSizeTime(j5, j2, j3, j4);
        this.readLock.unlock();
        MethodCollector.o(3708);
    }
}
