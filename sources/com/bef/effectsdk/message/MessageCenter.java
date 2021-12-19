package com.bef.effectsdk.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public class MessageCenter {
    private static final List<Listener> sListeners = new ArrayList();
    private static HandlerThread sMessageCenterThread;
    private static final Object sMessageCenterThreadLock = new Object();
    private static Handler sMessageHandler;

    public interface Listener {
        static {
            Covode.recordClassIndex(2888);
        }

        void onMessageReceived(int i2, int i3, int i4, String str);
    }

    static {
        Covode.recordClassIndex(2887);
    }

    public static void removeAllListener() {
        MethodCollector.i(1380);
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                list.clear();
                destroy();
            } finally {
                MethodCollector.o(1380);
            }
        }
    }

    public static void destroy() {
        MethodCollector.i(1390);
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    synchronized (sMessageCenterThreadLock) {
                        try {
                            Handler handler = sMessageHandler;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                                sMessageHandler = null;
                            }
                            HandlerThread handlerThread = sMessageCenterThread;
                            if (handlerThread != null) {
                                handlerThread.quit();
                                sMessageCenterThread = null;
                            }
                        } finally {
                            MethodCollector.o(1390);
                        }
                    }
                    list.clear();
                }
            } finally {
                MethodCollector.o(1390);
            }
        }
    }

    public static void init() {
        MethodCollector.i(1386);
        synchronized (sMessageCenterThreadLock) {
            try {
                HandlerThread handlerThread = sMessageCenterThread;
                if (handlerThread == null || !handlerThread.isAlive() || sMessageCenterThread.getLooper() == null) {
                    HandlerThread handlerThread2 = new HandlerThread("MessageCenter");
                    sMessageCenterThread = handlerThread2;
                    handlerThread2.start();
                    sMessageHandler = new MessageHandler(sMessageCenterThread.getLooper());
                }
            } finally {
                MethodCollector.o(1386);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class MessageHandler extends Handler {
        static {
            Covode.recordClassIndex(2889);
        }

        public MessageHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            MessageCenter.handleMessage(message);
        }
    }

    public static void addListener(Listener listener) {
        MethodCollector.i(1377);
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    init();
                }
                list.add(listener);
            } finally {
                MethodCollector.o(1377);
            }
        }
    }

    public static void removeListener(Listener listener) {
        MethodCollector.i(1379);
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                list.remove(listener);
                if (list.isEmpty()) {
                    destroy();
                }
            } finally {
                MethodCollector.o(1379);
            }
        }
    }

    public static void setListener(Listener listener) {
        MethodCollector.i(1375);
        synchronized (sListeners) {
            try {
                addListener(listener);
            } finally {
                MethodCollector.o(1375);
            }
        }
    }

    public static void handleMessage(Message message) {
        MethodCollector.i(1394);
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                for (Listener listener : list) {
                    listener.onMessageReceived(message.what, message.arg1, message.arg2, (String) message.obj);
                }
            } finally {
                MethodCollector.o(1394);
            }
        }
    }

    private static void postMessage(int i2, int i3, int i4, String str) {
        MethodCollector.i(1391);
        synchronized (sMessageCenterThreadLock) {
            try {
                Handler handler = sMessageHandler;
                if (handler != null) {
                    Message.obtain(handler, i2, i3, i4, str).sendToTarget();
                    MethodCollector.o(1391);
                }
            } finally {
                MethodCollector.o(1391);
            }
        }
    }
}
