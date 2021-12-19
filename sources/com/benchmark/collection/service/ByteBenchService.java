package com.benchmark.collection.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.benchmark.c;
import com.benchmark.c.b;
import com.benchmark.d;
import com.benchmark.port.nativePort.ApplogUtilsInvoker;
import com.benchmark.port.nativePort.LogcatInvoker;
import com.benchmark.tools.e;
import com.benchmark.tools.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import java.io.File;
import org.json.JSONObject;

public class ByteBenchService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public d f6155a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBenchProcessInterface f6156b;

    /* renamed from: c  reason: collision with root package name */
    public volatile a f6157c = a.INVALID;

    /* renamed from: d  reason: collision with root package name */
    public String f6158d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f6159e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f6160f;

    /* renamed from: g  reason: collision with root package name */
    private final c f6161g = new c.a() {
        /* class com.benchmark.collection.service.ByteBenchService.AnonymousClass1 */

        static {
            Covode.recordClassIndex(2988);
        }

        @Override // com.benchmark.c
        public final void a() {
            a aVar = ByteBenchService.this.f6157c;
            a aVar2 = ByteBenchService.this.f6157c;
            if (aVar == a.START) {
                ByteBenchService.this.f6156b.stopByteBench();
                ByteBenchService.this.f6157c = a.STOP;
                if (ByteBenchService.this.f6155a != null) {
                    ByteBenchService.this.f6155a.a(102, "stop");
                }
            } else if (ByteBenchService.this.f6155a != null) {
                ByteBenchService.this.f6155a.a(102, -1, "stop failed");
            }
        }

        @Override // com.benchmark.c
        public final void a(int i2, String str, String str2, d dVar) {
            ByteBenchService.this.f6155a = dVar;
            if (ByteBenchService.this.f6157c != a.START && ByteBenchService.this.f6157c != a.DESTROY) {
                if (ByteBenchService.this.f6157c == a.INVALID) {
                    ByteBenchService.this.f6156b = new ByteBenchProcessInterface();
                    if (ByteBenchService.this.f6156b.init(str, ByteBenchService.this.f6158d, ByteBenchService.this.f6159e, ByteBenchService.this.f6160f, ByteBenchService.this) < 0) {
                        ByteBenchService.this.f6157c = a.INVALID;
                        return;
                    }
                    ByteBenchService.this.f6156b.setByteBenchCallback(dVar);
                    f.a("ByteBenchService", b.f6095l.f6105j);
                    LogcatInvoker.a(b.f6095l.f6105j);
                    com.benchmark.a.a.a(new e.a() {
                        /* class com.benchmark.collection.service.ByteBenchService.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(2989);
                        }

                        @Override // com.benchmark.tools.e.a
                        public final void a(String str, JSONObject jSONObject) {
                            try {
                                if (ByteBenchService.this.f6155a != null) {
                                    ByteBenchService.this.f6155a.a(str, jSONObject.toString());
                                }
                            } catch (RemoteException e2) {
                                e2.getMessage();
                            }
                        }
                    });
                    ApplogUtilsInvoker.Init();
                    ByteBenchService.this.f6157c = a.INIT;
                }
                if (ByteBenchService.this.f6156b != null) {
                    int loadByteBench = ByteBenchService.this.f6156b.loadByteBench(str2);
                    if (loadByteBench != 0) {
                        ByteBenchService.this.f6157c = a.INVALID;
                        if (ByteBenchService.this.f6155a != null) {
                            ByteBenchService.this.f6155a.a(101, loadByteBench, "init start failed");
                            return;
                        }
                        return;
                    }
                    int startTest = ByteBenchService.this.f6156b.startTest(i2, str2);
                    if (startTest < 0) {
                        if (ByteBenchService.this.f6155a != null) {
                            ByteBenchService.this.f6155a.a(101, startTest, "start failed");
                        }
                        ByteBenchService.this.f6157c = a.INIT;
                        return;
                    }
                    ByteBenchService.this.f6157c = a.START;
                    if (ByteBenchService.this.f6155a != null) {
                        ByteBenchService.this.f6155a.a(101, "start");
                    }
                } else if (ByteBenchService.this.f6155a != null) {
                    ByteBenchService.this.f6155a.a(101, -1, "start failed");
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(2987);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public void onCreate() {
        KevaBuilder.getInstance().setContext(a(this));
        Keva.forceInit();
        b.f6095l.f6096a = a(this);
    }

    public void onDestroy() {
        this.f6157c = a.DESTROY;
        ByteBenchProcessInterface byteBenchProcessInterface = this.f6156b;
        if (byteBenchProcessInterface != null) {
            byteBenchProcessInterface.destroy();
            this.f6156b = null;
        }
        b.f6095l.f6096a = null;
        this.f6157c = a.INVALID;
        super.onDestroy();
    }

    enum a {
        INVALID,
        INIT,
        START,
        STOP,
        DESTROY;

        static {
            Covode.recordClassIndex(2990);
        }
    }

    private static Context a(ByteBenchService byteBenchService) {
        Context applicationContext = byteBenchService.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public IBinder onBind(Intent intent) {
        this.f6157c = a.INVALID;
        this.f6158d = getCacheDir().getPath();
        File externalCacheDir = getExternalCacheDir();
        if (externalCacheDir != null) {
            this.f6159e = externalCacheDir.getPath();
        }
        this.f6160f = getApplicationInfo().nativeLibraryDir;
        b.f6095l.f6105j = intent.getByteExtra("Loglevel", (byte) 3);
        return this.f6161g.asBinder();
    }
}
