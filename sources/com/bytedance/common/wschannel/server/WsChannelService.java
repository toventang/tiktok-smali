package com.bytedance.common.wschannel.server;

import android.content.Intent;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.app.c;
import com.bytedance.common.wschannel.app.d;
import com.bytedance.common.wschannel.d.a;
import com.bytedance.common.wschannel.d.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

public class WsChannelService extends com.bytedance.common.wschannel.app.a {
    static {
        Covode.recordClassIndex(16079);
    }

    @Override // com.bytedance.common.wschannel.app.a
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.common.wschannel.app.a
    public void onCreate() {
        Logger.debug();
        super.onCreate();
        i.a(this);
    }

    static int a(IWsApp iWsApp) {
        if (iWsApp == null) {
            return Integer.MIN_VALUE;
        }
        return iWsApp.a();
    }

    @Override // com.bytedance.common.wschannel.app.a, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        super.handleMsg(message);
        if (message != null) {
            Logger.debug();
            i.a(this).handleMsg(message);
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final int f27318a;

        /* renamed from: b  reason: collision with root package name */
        final byte[] f27319b;

        /* renamed from: c  reason: collision with root package name */
        final long f27320c;

        static {
            Covode.recordClassIndex(16080);
        }

        a(int i2, byte[] bArr, long j2) {
            this.f27318a = i2;
            this.f27319b = bArr;
            this.f27320c = j2;
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        Logger.debug();
        if (intent != null) {
            String action = intent.getAction();
            if ("com.bytedance.article.wschannel.appstate".equals(action)) {
                int intExtra = intent.getIntExtra("app_state", -1);
                Message message = new Message();
                message.what = 2;
                message.arg1 = intExtra;
                handleMsg(message);
            } else if ("com.bytedance.article.wschannel.networkstate".equals(action)) {
                int intExtra2 = intent.getIntExtra("network_state", -1);
                Message message2 = new Message();
                message2.what = 3;
                message2.arg1 = intExtra2;
                handleMsg(message2);
            }
            try {
                String a2 = a(intent, "key_link_progress_change");
                WsConstants.setLinkProcessChangeListenerClassName(a2);
                b bVar = b.a.f27211a;
                if (a2 != null) {
                    try {
                        Object newInstance = Class.forName(a2).newInstance();
                        if (newInstance instanceof d) {
                            bVar.f27210a = (d) newInstance;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception unused) {
            }
            try {
                String a3 = a(intent, "key_connection_change");
                WsConstants.setConnectionChangeListenerClassName(a3);
                com.bytedance.common.wschannel.d.a aVar = a.C0584a.f27209a;
                if (a3 != null) {
                    try {
                        Object newInstance2 = Class.forName(a3).newInstance();
                        if (newInstance2 instanceof c) {
                            aVar.f27208a = (c) newInstance2;
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (Exception unused2) {
            }
        }
        if (com.bytedance.common.wschannel.e.a.a()) {
            return 2;
        }
        return 1;
    }
}
