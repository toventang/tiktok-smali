package com.bytedance.vcloud.mlcomponent_api;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MLComponentManager {
    ReentrantReadWriteLock lock;
    private long mModelComponentHandle;
    private String mName;
    final ReentrantReadWriteLock.ReadLock readLock;
    final ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();

    static {
        Covode.recordClassIndex(28028);
    }

    private native ArrayList _calculate(long j2, Map map);

    private native long _createMLComponent(String str);

    private native boolean _enable(long j2);

    private native boolean _prepareAlreadyFinish(long j2);

    private native void _release(long j2);

    private native void _setDownloader(long j2, IMLComponentDownLoader iMLComponentDownLoader);

    private native void _setEngineStateListener(long j2, IMLComponentStateListener iMLComponentStateListener);

    private native void _setLoggerEventListener(long j2, IMLComponentLogger iMLComponentLogger);

    private native void _setMLConfigModel(long j2, IMLComponentConfigModel iMLComponentConfigModel);

    /* access modifiers changed from: package-private */
    public void loadNecessaryMLEngine() {
        MLEngineImpLoader.loadPredictTFEngineLibrary();
        if (!MLEngineImpLoader.isPredictTFEngineLibraryLoaded) {
            MLComponentLog.e("mlComponent", "no tfengine for networkPredict");
        }
    }

    public boolean enable() {
        MethodCollector.i(5767);
        this.readLock.lock();
        long j2 = this.mModelComponentHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(5767);
            return false;
        }
        boolean _enable = _enable(j2);
        this.readLock.unlock();
        MethodCollector.o(5767);
        return _enable;
    }

    public boolean prepareAlreadFinish() {
        MethodCollector.i(5500);
        this.readLock.lock();
        long j2 = this.mModelComponentHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(5500);
            return false;
        }
        boolean _prepareAlreadyFinish = _prepareAlreadyFinish(j2);
        this.readLock.unlock();
        MethodCollector.o(5500);
        return _prepareAlreadyFinish;
    }

    public void release() {
        MethodCollector.i(5612);
        this.writeLock.lock();
        long j2 = this.mModelComponentHandle;
        if (j2 == 0) {
            this.writeLock.unlock();
            MethodCollector.o(5612);
            return;
        }
        _release(j2);
        this.mModelComponentHandle = 0;
        this.writeLock.unlock();
        MethodCollector.o(5612);
    }

    public ArrayList calculate(Map map) {
        MethodCollector.i(5523);
        this.readLock.lock();
        long j2 = this.mModelComponentHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(5523);
            return null;
        }
        ArrayList _calculate = _calculate(j2, map);
        this.readLock.unlock();
        MethodCollector.o(5523);
        return _calculate;
    }

    public MLComponentManager setDownloader(IMLComponentDownLoader iMLComponentDownLoader) {
        MethodCollector.i(5429);
        this.readLock.lock();
        long j2 = this.mModelComponentHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(5429);
            return this;
        }
        _setDownloader(j2, iMLComponentDownLoader);
        this.readLock.unlock();
        MethodCollector.o(5429);
        return this;
    }

    public MLComponentManager setEngineStateListener(IMLComponentStateListener iMLComponentStateListener) {
        MethodCollector.i(5427);
        this.readLock.lock();
        long j2 = this.mModelComponentHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(5427);
            return this;
        }
        _setEngineStateListener(j2, iMLComponentStateListener);
        this.readLock.unlock();
        MethodCollector.o(5427);
        return this;
    }

    public MLComponentManager setLoggerEventListener(IMLComponentLogger iMLComponentLogger) {
        MethodCollector.i(5419);
        this.readLock.lock();
        long j2 = this.mModelComponentHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(5419);
            return this;
        }
        _setLoggerEventListener(j2, iMLComponentLogger);
        this.readLock.unlock();
        MethodCollector.o(5419);
        return this;
    }

    public MLComponentManager setMLComponentModel(IMLComponentConfigModel iMLComponentConfigModel) {
        MethodCollector.i(5432);
        this.readLock.lock();
        long j2 = this.mModelComponentHandle;
        if (j2 == 0) {
            this.readLock.unlock();
            MethodCollector.o(5432);
            return this;
        }
        _setMLConfigModel(j2, iMLComponentConfigModel);
        this.readLock.unlock();
        MethodCollector.o(5432);
        return this;
    }

    public MLComponentManager(String str) {
        MethodCollector.i(5407);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(false);
        this.lock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.mName = str;
        MLComponentJniLoader.loadLibrary();
        if (!MLComponentJniLoader.isLibraryLoaded) {
            MLComponentLog.e("mlComponent", "[mlComponent] no mlcomponent native loaded");
            MethodCollector.o(5407);
            return;
        }
        long _createMLComponent = _createMLComponent(str);
        this.mModelComponentHandle = _createMLComponent;
        if (_createMLComponent == 0) {
            MLComponentLog.e("mlComponent", "[mlcomponent] mlcomponent native new fail");
        }
        loadNecessaryMLEngine();
        MethodCollector.o(5407);
    }
}
