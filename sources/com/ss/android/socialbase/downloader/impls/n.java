package com.ss.android.socialbase.downloader.impls;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.downloader.a;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.d;
import com.ss.android.socialbase.downloader.downloader.k;
import com.ss.android.socialbase.downloader.downloader.p;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.k.h;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class n extends a implements ServiceConnection {

    /* renamed from: f  reason: collision with root package name */
    private static final String f60650f = n.class.getSimpleName();

    /* renamed from: g  reason: collision with root package name */
    private k f60651g;

    /* renamed from: h  reason: collision with root package name */
    private p f60652h;

    /* renamed from: i  reason: collision with root package name */
    private int f60653i = -1;

    static {
        Covode.recordClassIndex(37450);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.q
    public final void g() {
        if (this.f60651g == null) {
            a(c.B(), this);
        }
    }

    private void h() {
        SparseArray clone;
        MethodCollector.i(13904);
        try {
            synchronized (this.f60418b) {
                try {
                    clone = this.f60418b.clone();
                    this.f60418b.clear();
                } finally {
                    MethodCollector.o(13904);
                }
            }
            if (!(clone == null || clone.size() <= 0 || c.u() == null)) {
                for (int i2 = 0; i2 < clone.size(); i2++) {
                    List<DownloadTask> list = (List) clone.get(clone.keyAt(i2));
                    if (list != null) {
                        for (DownloadTask downloadTask : list) {
                            try {
                                this.f60651g.a(h.a(downloadTask));
                            } catch (RemoteException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            com.ss.android.socialbase.downloader.e.a.a(f60650f);
            MethodCollector.o(13904);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.q
    public final void a(p pVar) {
        this.f60652h = pVar;
    }

    public void onBindingDied(ComponentName componentName) {
        this.f60651g = null;
        p pVar = this.f60652h;
        if (pVar != null) {
            pVar.i();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.q
    public final void a(int i2) {
        k kVar = this.f60651g;
        if (kVar == null) {
            this.f60653i = i2;
            return;
        }
        try {
            kVar.l(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.q
    public final void c(DownloadTask downloadTask) {
        if (downloadTask != null) {
            d.a().a(downloadTask.getDownloadId(), true);
            a u = c.u();
            if (u != null) {
                u.a(downloadTask);
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        com.ss.android.socialbase.downloader.e.a.b(f60650f, "onServiceDisconnected ");
        this.f60651g = null;
        this.f60419c = false;
        p pVar = this.f60652h;
        if (pVar != null) {
            pVar.i();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.q
    public final IBinder a(Intent intent) {
        if (intent != null && intent.getBooleanExtra("fix_downloader_db_sigbus", false)) {
            try {
                if (com.ss.android.socialbase.downloader.i.a.f60574b == null) {
                    com.ss.android.socialbase.downloader.i.a.f60574b = new JSONObject();
                }
                com.ss.android.socialbase.downloader.i.a.f60574b.put("fix_sigbus_downloader_db", 1);
            } catch (JSONException unused) {
            }
        }
        com.ss.android.socialbase.downloader.e.a.b(f60650f, "onBind IndependentDownloadBinder");
        return new m();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.q
    public final void b(DownloadTask downloadTask) {
        boolean z;
        if (downloadTask != null) {
            String str = f60650f;
            StringBuilder sb = new StringBuilder("tryDownload aidlService == null:");
            if (this.f60651g == null) {
                z = true;
            } else {
                z = false;
            }
            com.ss.android.socialbase.downloader.e.a.b(str, sb.append(z).toString());
            if (this.f60651g == null) {
                a(downloadTask);
                a(c.B(), this);
                return;
            }
            h();
            try {
                this.f60651g.a(h.a(downloadTask));
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.n.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        String str = f60650f;
        com.ss.android.socialbase.downloader.e.a.b(str, "onServiceConnected ");
        this.f60651g = k.a.a(iBinder);
        p pVar = this.f60652h;
        if (pVar != null) {
            pVar.a(iBinder);
        }
        StringBuilder sb = new StringBuilder("onServiceConnected aidlService!=null");
        if (this.f60651g != null) {
            z = true;
        } else {
            z = false;
        }
        com.ss.android.socialbase.downloader.e.a.b(str, sb.append(z).append(" pendingTasks.size:").append(this.f60418b.size()).toString());
        if (this.f60651g != null) {
            d.a().b();
            this.f60419c = true;
            this.f60421e = false;
            int i2 = this.f60653i;
            if (i2 != -1) {
                try {
                    this.f60651g.l(i2);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
            if (this.f60651g != null) {
                h();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a
    public final void a(Context context, ServiceConnection serviceConnection) {
        try {
            com.ss.android.socialbase.downloader.e.a.b(f60650f, "bindService");
            Intent intent = new Intent(context, IndependentProcessDownloadService.class);
            if (g.a()) {
                intent.putExtra("fix_downloader_db_sigbus", com.ss.android.socialbase.downloader.i.a.f60573a.a("fix_sigbus_downloader_db", false));
            }
            if (serviceConnection != null) {
                if (context == null || !(context instanceof Context)) {
                    context.bindService(intent, serviceConnection, 1);
                } else if (!com.ss.android.ugc.aweme.push.downgrade.d.a(context, intent)) {
                    context.bindService(intent, serviceConnection, 1);
                }
            }
            a(context, intent);
        } catch (Throwable unused) {
        }
    }
}
