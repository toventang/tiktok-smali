package com.samsung.sdk.sperf;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.samsung.android.perfsdkservice.IPerfSDKService;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

/* access modifiers changed from: package-private */
public class SessionControl {
    private static SessionControl instance;
    public LocalSocket client;
    public DataInputStream in;
    private Object localSocketObject;
    private IPerfSDKService mService;
    public DataOutputStream out;
    private Vector<SPerfListener> perfSDKListerners;
    public LocalServerSocket server;
    public String socketName = ("PERFSDK_SOC_" + Long.toString(Double.doubleToLongBits(Math.random()), 36).substring(0, 5));

    static {
        Covode.recordClassIndex(35509);
    }

    private SessionControl() {
        createServer();
        SPerfUtil.log("Make Server for connection with PerfSDK Server");
        this.localSocketObject = getService();
        this.perfSDKListerners = new Vector<>();
    }

    public static SessionControl createInstance() {
        if (instance == null) {
            instance = new SessionControl();
        }
        SessionControl sessionControl = instance;
        if (sessionControl == null || (sessionControl.getDataInputStream() != null && sessionControl.getDataOutputStream() != null)) {
            return instance;
        }
        instance = null;
        return null;
    }

    private void createServer() {
        new Thread(new Runnable() {
            /* class com.samsung.sdk.sperf.SessionControl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35510);
            }

            public void run() {
                MethodCollector.i(2097);
                try {
                    SessionControl.this.server = new LocalServerSocket(SessionControl.this.socketName);
                    SessionControl sessionControl = SessionControl.this;
                    sessionControl.client = sessionControl.server.accept();
                    SessionControl.this.in = new DataInputStream(SessionControl.this.client.getInputStream());
                    SessionControl.this.out = new DataOutputStream(SessionControl.this.client.getOutputStream());
                    MethodCollector.o(2097);
                } catch (IOException e2) {
                    e2.printStackTrace();
                    try {
                        SessionControl.this.server.close();
                        SessionControl.this.server = null;
                        MethodCollector.o(2097);
                    } catch (IOException unused) {
                        SessionControl.this.server = null;
                        MethodCollector.o(2097);
                    }
                }
            }
        }).start();
    }

    public void addListerner(SPerfListener sPerfListener) {
        Vector<SPerfListener> vector = this.perfSDKListerners;
        if (vector != null) {
            vector.add(sPerfListener);
        }
    }

    public Object callback(Object obj) {
        return obj;
    }

    public DataInputStream getDataInputStream() {
        return this.in;
    }

    public DataOutputStream getDataOutputStream() {
        return this.out;
    }

    public Object getService() {
        if (this.localSocketObject == null) {
            try {
                IBinder service = ServiceManager.getService("perfsdkservice");
                if (service != null) {
                    this.mService = IPerfSDKService.Stub.asInterface(service);
                    SPerfUtil.log("Get mService Interface");
                }
                IPerfSDKService iPerfSDKService = this.mService;
                if (iPerfSDKService != null) {
                    try {
                        this.localSocketObject = Integer.valueOf(iPerfSDKService.initPerfSDK(this.socketName));
                        String allowedPkgName = this.mService.getAllowedPkgName();
                        if (allowedPkgName != null && allowedPkgName.length() > 0) {
                            Boost.setNativePkgName(allowedPkgName);
                        }
                        SPerfUtil.log("Do initPerfSDK");
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (NoSuchMethodError e3) {
                e3.printStackTrace();
            }
        }
        return this.localSocketObject;
    }

    public void notifyReleaseToListener() {
        Iterator<SPerfListener> it = this.perfSDKListerners.iterator();
        while (it.hasNext()) {
            it.next().onReleasedByTimeout();
        }
    }

    public void notifyyWarningLevelToListener(int i2) {
        Iterator<SPerfListener> it = this.perfSDKListerners.iterator();
        while (it.hasNext()) {
            it.next().onHighTempWarning(i2);
        }
    }

    public boolean removeListener(SPerfListener sPerfListener) {
        Vector<SPerfListener> vector = this.perfSDKListerners;
        if (vector == null) {
            return false;
        }
        return vector.remove(sPerfListener);
    }
}
