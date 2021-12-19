package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class LocalBroadcastManager {
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final HashMap<String, ArrayList<b>> mActions = new HashMap<>();
    private final Context mAppContext;
    private final Handler mHandler;
    private final ArrayList<a> mPendingBroadcasts = new ArrayList<>();
    private final HashMap<BroadcastReceiver, ArrayList<b>> mReceivers = new HashMap<>();

    public static int androidx_localbroadcastmanager_content_LocalBroadcastManager_com_ss_android_ugc_aweme_lancet_LogLancet_v(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(1375);
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final IntentFilter f3627a;

        /* renamed from: b  reason: collision with root package name */
        final BroadcastReceiver f3628b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3629c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3630d;

        static {
            Covode.recordClassIndex(1378);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f3628b);
            sb.append(" filter=");
            sb.append(this.f3627a);
            if (this.f3630d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }

        b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f3627a = intentFilter;
            this.f3628b = broadcastReceiver;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r5 = r7[r6];
        r4 = r5.f3626b.size();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r3 >= r4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r1 = r5.f3626b.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r1.f3630d != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r1.f3628b.onReceive(r9.mAppContext, r5.f3625a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r6 >= r8) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r6 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void executePendingBroadcasts() {
        /*
            r9 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$b>> r1 = r9.mReceivers
            monitor-enter(r1)
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$a> r0 = r9.mPendingBroadcasts     // Catch:{ all -> 0x0045 }
            int r8 = r0.size()     // Catch:{ all -> 0x0045 }
            if (r8 > 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            goto L_0x0044
        L_0x000d:
            androidx.localbroadcastmanager.content.LocalBroadcastManager$a[] r7 = new androidx.localbroadcastmanager.content.LocalBroadcastManager.a[r8]     // Catch:{ all -> 0x0045 }
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$a> r0 = r9.mPendingBroadcasts     // Catch:{ all -> 0x0045 }
            r0.toArray(r7)     // Catch:{ all -> 0x0045 }
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$a> r0 = r9.mPendingBroadcasts     // Catch:{ all -> 0x0045 }
            r0.clear()     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            r0 = 0
            r6 = 0
        L_0x001c:
            r5 = r7[r6]
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$b> r0 = r5.f3626b
            int r4 = r0.size()
            r3 = 0
        L_0x0025:
            if (r3 >= r4) goto L_0x003f
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$b> r0 = r5.f3626b
            java.lang.Object r1 = r0.get(r3)
            androidx.localbroadcastmanager.content.LocalBroadcastManager$b r1 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.b) r1
            boolean r0 = r1.f3630d
            if (r0 != 0) goto L_0x003c
            android.content.BroadcastReceiver r2 = r1.f3628b
            android.content.Context r1 = r9.mAppContext
            android.content.Intent r0 = r5.f3625a
            r2.onReceive(r1, r0)
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x0025
        L_0x003f:
            int r6 = r6 + 1
            if (r6 >= r8) goto L_0x0000
            goto L_0x001c
        L_0x0044:
            return
        L_0x0045:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.localbroadcastmanager.content.LocalBroadcastManager.executePendingBroadcasts():void");
    }

    public static Context androidx_localbroadcastmanager_content_LocalBroadcastManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final void sendBroadcastSync(Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    public static LocalBroadcastManager getInstance(Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            if (mInstance == null) {
                mInstance = new LocalBroadcastManager(androidx_localbroadcastmanager_content_LocalBroadcastManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context));
            }
            localBroadcastManager = mInstance;
        }
        return localBroadcastManager;
    }

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new Handler(context.getMainLooper()) {
            /* class androidx.localbroadcastmanager.content.LocalBroadcastManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1376);
            }

            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    LocalBroadcastManager.this.executePendingBroadcasts();
                }
            }
        };
    }

    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            ArrayList<b> remove = this.mReceivers.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    b bVar = remove.get(size);
                    bVar.f3630d = true;
                    for (int i2 = 0; i2 < bVar.f3627a.countActions(); i2++) {
                        String action = bVar.f3627a.getAction(i2);
                        ArrayList<b> arrayList = this.mActions.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                b bVar2 = arrayList.get(size2);
                                if (bVar2.f3628b == broadcastReceiver) {
                                    bVar2.f3630d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.mActions.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean sendBroadcast(Intent intent) {
        boolean z;
        String str;
        String str2;
        String str3;
        synchronized (this.mReceivers) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            if ((intent.getFlags() & 8) != 0) {
                z = true;
                androidx_localbroadcastmanager_content_LocalBroadcastManager_com_ss_android_ugc_aweme_lancet_LogLancet_v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            } else {
                z = false;
            }
            ArrayList<b> arrayList = this.mActions.get(intent.getAction());
            if (arrayList != null) {
                if (z) {
                    androidx_localbroadcastmanager_content_LocalBroadcastManager_com_ss_android_ugc_aweme_lancet_LogLancet_v("LocalBroadcastManager", "Action list: ".concat(String.valueOf(arrayList)));
                }
                ArrayList arrayList2 = null;
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    b bVar = arrayList.get(i2);
                    if (z) {
                        androidx_localbroadcastmanager_content_LocalBroadcastManager_com_ss_android_ugc_aweme_lancet_LogLancet_v("LocalBroadcastManager", "Matching against filter " + bVar.f3627a);
                    }
                    if (bVar.f3629c) {
                        if (z) {
                            androidx_localbroadcastmanager_content_LocalBroadcastManager_com_ss_android_ugc_aweme_lancet_LogLancet_v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        str2 = action;
                        str = resolveTypeIfNeeded;
                    } else {
                        str2 = action;
                        str = resolveTypeIfNeeded;
                        int match = bVar.f3627a.match(str2, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                androidx_localbroadcastmanager_content_LocalBroadcastManager_com_ss_android_ugc_aweme_lancet_LogLancet_v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(bVar);
                            bVar.f3629c = true;
                        } else if (z) {
                            if (match == -4) {
                                str3 = "category";
                            } else if (match == -3) {
                                str3 = "action";
                            } else if (match == -2) {
                                str3 = "data";
                            } else if (match != -1) {
                                str3 = "unknown reason";
                            } else {
                                str3 = StringSet.type;
                            }
                            androidx_localbroadcastmanager_content_LocalBroadcastManager_com_ss_android_ugc_aweme_lancet_LogLancet_v("LocalBroadcastManager", "  Filter did not match: ".concat(str3));
                        }
                    }
                    i2++;
                    action = str2;
                    resolveTypeIfNeeded = str;
                }
                if (arrayList2 != null) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        ((b) arrayList2.get(i3)).f3629c = false;
                    }
                    this.mPendingBroadcasts.add(new a(intent, arrayList2));
                    if (!this.mHandler.hasMessages(1)) {
                        this.mHandler.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f3625a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<b> f3626b;

        static {
            Covode.recordClassIndex(1377);
        }

        a(Intent intent, ArrayList<b> arrayList) {
            this.f3625a = intent;
            this.f3626b = arrayList;
        }
    }

    public final void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            b bVar = new b(intentFilter, broadcastReceiver);
            ArrayList<b> arrayList = this.mReceivers.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.mReceivers.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                String action = intentFilter.getAction(i2);
                ArrayList<b> arrayList2 = this.mActions.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.mActions.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }
}
