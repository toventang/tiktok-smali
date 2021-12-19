package com.ss.avframework.engine;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.utils.TEBundle;

public class SITICalculator extends NativeObject {
    private int mCurCplxCategory = -1;
    public ISITIEventObserver mISITIEventObserver;
    private final Handler mWorkHandler;

    public interface ISITIEventObserver {
        static {
            Covode.recordClassIndex(99827);
        }

        void onBitrateChanged(int i2, String str);
    }

    static {
        Covode.recordClassIndex(99824);
    }

    private native void nativeCreate(int i2, int i3, int i4);

    private native String nativeGetPerformance();

    private native void nativeSetParameters(TEBundle tEBundle);

    public int getCurPlxCategory() {
        return this.mCurCplxCategory;
    }

    public String GetPerformance() {
        MethodCollector.i(12562);
        String nativeGetPerformance = nativeGetPerformance();
        MethodCollector.o(12562);
        return nativeGetPerformance;
    }

    public boolean isValid() {
        if (this.mNativeObj != 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(12673);
        this.mWorkHandler.post(new Runnable() {
            /* class com.ss.avframework.engine.SITICalculator.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99826);
            }

            public void run() {
                SITICalculator.super.release();
            }
        });
        MethodCollector.o(12673);
    }

    public void setSITIEventObserver(ISITIEventObserver iSITIEventObserver) {
        this.mISITIEventObserver = iSITIEventObserver;
    }

    public void setParameters(TEBundle tEBundle) {
        MethodCollector.i(12561);
        nativeSetParameters(tEBundle);
        MethodCollector.o(12561);
    }

    public void onStrategyCalculated(final int i2, final String str) {
        this.mCurCplxCategory = i2;
        this.mWorkHandler.post(new Runnable() {
            /* class com.ss.avframework.engine.SITICalculator.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99825);
            }

            public void run() {
                if (SITICalculator.this.mISITIEventObserver != null) {
                    SITICalculator.this.mISITIEventObserver.onBitrateChanged(i2, str);
                }
            }
        });
    }

    public SITICalculator(Handler handler, int i2, int i3) {
        MethodCollector.i(12560);
        nativeCreate(1, i2, i3);
        this.mWorkHandler = handler;
        MethodCollector.o(12560);
    }
}
