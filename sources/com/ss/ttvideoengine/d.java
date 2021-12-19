package com.ss.ttvideoengine;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.strategy.ISelectBitrateListener;
import com.ss.android.ugc.playerkit.model.v;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.medialoader.AVMDLDataLoaderListener;
import com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo;
import com.ss.mediakit.medialoader.AVMDLStartCompleteListener;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.ttvideoengine.ag;
import com.ss.ttvideoengine.bg;
import com.ss.ttvideoengine.c.b;
import com.ss.ttvideoengine.f.e;
import com.ss.ttvideoengine.h.p;
import com.ss.ttvideoengine.j.e;
import com.ss.ttvideoengine.j.o;
import com.ss.ttvideoengine.j.q;
import com.ss.ttvideoengine.l.a;
import com.ss.ttvideoengine.l.e;
import com.ss.ttvideoengine.q.e;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d implements AVMDLDataLoaderListener, AVMDLStartCompleteListener {
    private volatile boolean A;
    private g B;
    private bg C;
    private Exception D;
    private String E;
    private int F;
    private int G;
    private boolean H;
    private int I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private int N;
    private String O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;

    /* renamed from: a  reason: collision with root package name */
    public volatile l f152366a;
    private final com.ss.ttvideoengine.l.e aa;

    /* renamed from: b  reason: collision with root package name */
    public e f152367b;

    /* renamed from: c  reason: collision with root package name */
    at f152368c;

    /* renamed from: d  reason: collision with root package name */
    public volatile int f152369d;

    /* renamed from: e  reason: collision with root package name */
    public g f152370e;

    /* renamed from: f  reason: collision with root package name */
    public g f152371f;

    /* renamed from: g  reason: collision with root package name */
    public g f152372g;

    /* renamed from: h  reason: collision with root package name */
    HashMap<String, ArrayList<aj>> f152373h;

    /* renamed from: i  reason: collision with root package name */
    final ReentrantLock f152374i;

    /* renamed from: j  reason: collision with root package name */
    public AVMDLDataLoader f152375j;

    /* renamed from: k  reason: collision with root package name */
    public AVMDLDataLoaderConfigure f152376k;

    /* renamed from: l  reason: collision with root package name */
    public Context f152377l;

    /* renamed from: m  reason: collision with root package name */
    public c f152378m;
    public com.ss.ttvideoengine.h.k n;
    public p o;
    public long p;
    public boolean q;
    public final ReentrantLock r;
    public int s;
    public ah t;
    public WeakReference<ah> u;
    public int v;
    public boolean w;
    public k x;
    public int y;
    public int z;

    /* access modifiers changed from: package-private */
    public interface l {
        static {
            Covode.recordClassIndex(101547);
        }

        void a(C4065d dVar);
    }

    static {
        Covode.recordClassIndex(101527);
    }

    private static String b(long j2) {
        int i2 = (int) j2;
        if (i2 == 0) {
            return "default";
        }
        if (i2 == 1) {
            return "cellular";
        }
        if (i2 != 2) {
            return null;
        }
        return "wifi";
    }

    public final void b(int i2) {
        a(this, 512, i2);
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final long getInt64Value(int i2, long j2) {
        return 0;
    }

    public static d a() {
        return h.f152465a;
    }

    public final void a(String str) {
        e eVar = this.f152367b;
        if (eVar != null) {
            eVar.a(8, 0, 0, str);
        }
    }

    public final synchronized void a(p pVar) {
        MethodCollector.i(13869);
        this.o = pVar;
        MethodCollector.o(13869);
    }

    public final void a(r rVar) {
        this.r.lock();
        try {
            a(rVar.f153206a, rVar.f153208c, rVar.f153211f, (v) null, rVar);
        } finally {
            this.r.unlock();
        }
    }

    public final void a(v vVar) {
        if (vVar == null || vVar.f153295a == null || vVar.f153296b == null) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "[preload] addTask videoModel input invalid");
            if (vVar != null) {
                vVar.a();
                return;
            }
            return;
        }
        com.ss.ttvideoengine.n.c.a aVar = aj.bS;
        String str = null;
        if (vVar.f153303i > 0 && aVar != null && vVar.f153296b == w.Auto) {
            String m2 = vVar.f153295a.m();
            if (!TextUtils.isEmpty(m2)) {
                e.c.f153200a.b().addMedia(m2, null, null, false);
                HashMap hashMap = new HashMap();
                String str2 = aVar.f153124b;
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("extra_config", str2);
                }
                com.ss.ttvideoengine.n.c.b bVar = new com.ss.ttvideoengine.n.c.b();
                bVar.f153127c = vVar.f153295a;
                Map<String, Integer> a2 = e.c.f153200a.a(vVar.f153295a, 2, hashMap, bVar);
                if (a2 != null) {
                    int intValue = a2.get("video").intValue();
                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "[GearStrategy] gear strategy addTask videoBitrate=" + intValue + " audioBitrate=" + a2.get(DataType.AUDIO).intValue());
                    List<o> b2 = vVar.f153295a.b();
                    if (intValue > 0 && b2 != null) {
                        w wVar = vVar.f153296b;
                        HashMap hashMap2 = new HashMap();
                        Iterator<o> it = b2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            o next = it.next();
                            if (next != null && next.a() != q.f152977b && next.c() != null && ((long) next.a(3)) == ((long) intValue)) {
                                wVar = next.c();
                                if (!TextUtils.isEmpty(next.b(32))) {
                                    hashMap2.put(32, next.b(32));
                                }
                            }
                        }
                        vVar.f153296b = wVar;
                        if (hashMap2.size() > 0) {
                            vVar.f153304j = hashMap2;
                        }
                    }
                }
            }
        }
        o a3 = vVar.f153295a.a(vVar.f153296b, vVar.f153304j, true);
        if (a3 != null) {
            str = a3.b(15);
        }
        if (TextUtils.isEmpty(str)) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "[preload] key invalid.");
            vVar.a();
            return;
        }
        String b3 = vVar.f153295a.b(2);
        if (TextUtils.isEmpty(b3)) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "[preload] videoId invalid.");
            vVar.a();
            return;
        }
        this.r.lock();
        try {
            a(str, b3, vVar.f153297c, vVar, (r) null);
        } finally {
            this.r.unlock();
        }
    }

    public final void a(String str, String str2, String str3, long j2) {
        if (TextUtils.isEmpty(str3)) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "[preload] url invalid.");
            return;
        }
        a(new r(str, str2, j2, new String[]{str3}));
    }

    public final void a(String str, String str2, String[] strArr, long j2, String str3) {
        if (strArr == null || strArr.length == 0) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "urls invalid.");
        } else {
            a(new r(str, str2, j2, strArr, str3));
        }
    }

    public final void a(int i2) {
        int i3;
        this.r.lock();
        if (this.f152376k.mLoaderType == i2 || (i3 = this.V) == i2) {
            this.r.unlock();
        } else if (i3 > 0) {
            this.r.unlock();
        } else {
            try {
                this.f152375j.setIntValue(7227, i2);
            } catch (Exception unused) {
                com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "set backup loader type failed");
            } finally {
                this.r.unlock();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "setLongValue failed, key: " + r4 + ", value: " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        r3.r.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r4, long r5) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.d.a(int, long):void");
    }

    public final void a(int i2, String str, long j2) {
        if (this.f152369d != 0) {
            com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "dataloader not started, not allow set play info");
        } else if (this.X > 0) {
            this.r.lock();
            if (this.aa.f153074a > 0 && this.aa.f153075b > 0) {
                com.ss.ttvideoengine.l.e eVar = this.aa;
                eVar.f153076c.lock();
                if (!eVar.f153077d.containsKey(str)) {
                    if (eVar.f153077d.size() >= 2) {
                        eVar.f153077d.clear();
                    }
                    e.a aVar = new e.a();
                    aVar.f153081d = str;
                    eVar.f153077d.put(str, aVar);
                }
                e.a aVar2 = eVar.f153077d.get(str);
                if (aVar2 != null) {
                    if (i2 == 22) {
                        aVar2.f153080c = j2;
                    } else if (i2 == 23) {
                        aVar2.f153079b = j2;
                        eVar.a(str);
                    } else if (i2 == 25) {
                        com.ss.ttvideoengine.l.e.a("buffering", str);
                    } else if (i2 == 27) {
                        aVar2.f153078a = j2;
                        eVar.a(str);
                    }
                }
                eVar.f153076c.unlock();
            }
            this.r.unlock();
        }
    }

    public final void a(int i2, String str) {
        com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "setStringValue key = " + i2 + ", value = " + str);
        this.r.lock();
        if (i2 == 0) {
            this.f152376k.mCacheDir = str;
        } else if (i2 == 102) {
            this.f152376k.mNetCacheDir = str;
        } else if (i2 == 111) {
            this.f152376k.mDownloadDir = str;
        } else if (i2 == 514) {
            this.f152376k.mLiveContainerString = str;
        } else if (i2 == 1149) {
            this.f152376k.mNetSchedulerConfigStr = str;
        } else if (i2 == 1165) {
            this.f152376k.mDynamicPreconnectConfigStr = str;
        } else if (i2 == 1500) {
            this.f152376k.mMdlExtensionOptsStr = str;
        } else if (i2 == 2101) {
            this.f152376k.mVdpExtGlobalInfo = str;
        } else if (i2 == 9010) {
            this.f152376k.mSocketTraingCenterConfigStr = str;
        } else if (i2 == 9012) {
            this.f152376k.mP2PConfigStr = str;
        } else if (i2 == 107) {
            AVMDLDNSParser.setStringValue(8, str);
        } else if (i2 == 108) {
            AVMDLDNSParser.setStringValue(9, str);
        } else if (i2 == 1106) {
            this.f152376k.mVdpABTestId = str;
        } else if (i2 != 1107) {
            switch (i2) {
                case 9002:
                    this.f152376k.mSettingsDomain = str;
                    break;
                case 9003:
                    this.f152376k.mDmDomain = str;
                    break;
                case 9004:
                    this.f152376k.mForesightDomain = str;
                    break;
                case 9005:
                    this.f152376k.mDomains = str;
                    break;
                case 9006:
                    try {
                        this.f152376k.mKeyDomain = str;
                        break;
                    } catch (Exception unused) {
                        break;
                    } catch (Throwable th) {
                        this.r.unlock();
                        throw th;
                    }
                case 9007:
                    this.f152376k.mKeyToken = str;
                    break;
            }
        } else {
            this.f152376k.mVdpGroupId = str;
        }
        this.r.unlock();
    }

    public final void a(JSONObject jSONObject, long j2) {
        String next;
        if (jSONObject == null) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "ip direct info invalid");
        } else if (com.ss.ttvideoengine.k.h.f153038a == -1 || 1000 * j2 >= com.ss.ttvideoengine.k.h.f153038a) {
            this.r.lock();
            try {
                Iterator<String> keys = jSONObject.keys();
                do {
                    next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    String str = "";
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        str = str + optJSONArray.optString(i2);
                        if (i2 < optJSONArray.length() - 1) {
                            str = str + ",";
                        }
                    }
                    AVMDLDNSParser.updateDNSInfo(next, str, j2);
                    if (!keys.hasNext()) {
                        break;
                    }
                } while (!TextUtils.isEmpty(next));
            } catch (Exception e2) {
                com.ss.ttvideoengine.s.j.e("DataLoaderHelper", e2.toString());
            } finally {
                this.r.unlock();
            }
        } else {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "network did change, dnsinfo is invalid");
        }
    }

    public static void a(C4065d dVar) {
        if (dVar != null && !dVar.p) {
            dVar.p = true;
            if (dVar.c() != null) {
                dVar.c().a(new p(5));
            }
        }
    }

    private static String[] a(String[] strArr) {
        if (strArr == null || strArr.length == 0 || b.a.f152363a.e() == 1) {
            return strArr;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                strArr[i2] = com.ss.ttvideoengine.s.i.b(strArr[i2], "p2p=0");
            }
        }
        return strArr;
    }

    public final String a(String str, String str2, long j2, String[] strArr, w wVar, String str3, o oVar, String str4, String str5, boolean z2, boolean z3, String str6) {
        if (this.f152369d != 0 || TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return null;
        }
        String[] a2 = a((String[]) strArr.clone());
        boolean z4 = false;
        for (int i2 = 0; i2 < a2.length; i2++) {
            if (!n(a2[i2])) {
                com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "not support");
                return a2[i2];
            }
        }
        if (this.f152375j == null) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "start mdl first");
            return null;
        }
        if (this.T == 1) {
            String lowerCase = a2[0].toLowerCase();
            if (z3 || lowerCase.contains(".m3u8?") || lowerCase.endsWith(".m3u8") || lowerCase.contains(".m3u?") || lowerCase.endsWith(".m3u")) {
                z4 = true;
            }
            if (z4) {
                z2 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        this.r.lock();
        try {
            String localAddr = this.f152375j.getLocalAddr();
            if (TextUtils.isEmpty(localAddr)) {
                com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "local host error");
                return null;
            }
            String a3 = a(str, str2, 0, j2, a2, str4, str5, z4, str6);
            if (TextUtils.isEmpty(a3)) {
                this.r.unlock();
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            int i3 = this.G;
            this.G = i3 + 1;
            StringBuffer stringBuffer2 = new StringBuffer();
            com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "proxy url, mInvalidMdlProcotol: " + this.q);
            if (z2 || this.q || !this.H) {
                stringBuffer.append("http://");
                stringBuffer.append(localAddr);
                stringBuffer.append("/");
                stringBuffer.append(i3);
            } else {
                stringBuffer.append("mdl://");
                stringBuffer.append("id");
                stringBuffer.append(i3);
                stringBuffer.append("/");
            }
            stringBuffer.append(a3);
            stringBuffer2.append(a3);
            String auth = this.f152375j.getAuth(a3);
            if (!TextUtils.isEmpty(auth)) {
                stringBuffer.append("&ah=");
                stringBuffer.append(auth);
                stringBuffer2.append("&ah=");
                stringBuffer2.append(auth);
            }
            String stringBuffer3 = stringBuffer.toString();
            com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "_proxyUrl: ".concat(String.valueOf(stringBuffer3)));
            this.r.unlock();
            C4065d c2 = this.B.c(str2);
            if (c2 == null) {
                c2 = new C4065d();
            }
            C4065d.b b2 = c2.b(str);
            if (b2 != null) {
                b2.f152422a = str;
                c2.f152401a = str2;
                b2.f152423b = stringBuffer3;
                b2.f152424c = wVar;
                b2.f152425d = str3;
                b2.f152426e = oVar;
                b2.f152427f = a2;
                b2.f152434m = str4;
                b2.f152428g = str5;
                this.B.a(c2);
            }
            return stringBuffer3;
        } finally {
            this.r.unlock();
        }
    }

    public final String a(String str, String str2, String[] strArr, int i2) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return null;
        }
        return a(str, str2, 0L, 0L, strArr, (String) null, (String) null, 0, (String) null, false, (String) null, i2);
    }

    private void a(String str, String str2, long j2, v vVar, r rVar) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "[preload] key invalid.");
        } else if (this.f152375j == null || this.f152369d != 0) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "[preload] need load mdl first.");
        } else if (this.f152371f.a(str) || this.f152370e.a(str)) {
            com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "[preload] add the same key task.");
        } else {
            w wVar = w.Undefine;
            if (!(vVar == null || vVar.f153296b == null)) {
                wVar = vVar.f153296b;
            }
            String str4 = "unknown";
            if (rVar != null) {
                if (!TextUtils.isEmpty(rVar.f153209d)) {
                    str4 = rVar.f153209d;
                }
                if (!TextUtils.isEmpty(rVar.f153210e)) {
                    str3 = rVar.f153210e;
                }
                str3 = null;
            } else if (vVar != null) {
                if (!TextUtils.isEmpty(vVar.f153305k)) {
                    str4 = vVar.f153305k;
                }
                if (!TextUtils.isEmpty(vVar.f153306l)) {
                    str3 = vVar.f153306l;
                }
                str3 = null;
            } else {
                str4 = null;
                str3 = null;
            }
            C4065d dVar = new C4065d();
            dVar.a(str, wVar, j2);
            dVar.f152401a = str2;
            dVar.f152412l = null;
            dVar.n = vVar;
            dVar.o = rVar;
            dVar.r = str4;
            dVar.s = str3;
            if (rVar != null) {
                dVar.f152408h = rVar.f153212g;
            }
            if (vVar != null) {
                dVar.f152402b = vVar.f153295a;
                dVar.f152408h = vVar.f153307m;
                dVar.f152405e = vVar.f153298d / 1000.0f;
                dVar.f152406f = vVar.f153299e;
                dVar.f152407g = vVar.f153300f;
            }
            if (dVar.f152412l != null) {
                dVar.f152411k = new j(this);
                dVar.f152408h = dVar.f152412l.f153251j;
            }
            if (this.f152370e.a(dVar)) {
                l();
            } else {
                dVar.a(-1002);
            }
        }
    }

    private void a(o oVar, C4065d dVar) {
        if (oVar == null || dVar == null) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "[preload] prepare url info fail. info or taskItem is null");
            return;
        }
        String[] b2 = oVar.b();
        String b3 = oVar.b(15);
        C4065d.b b4 = dVar.b(b3);
        if (b2 == null || b2.length <= 0) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "[preload] url info, urls info invalid");
            dVar.a(-100001);
            return;
        }
        String[] strArr = (String[]) b2.clone();
        boolean z2 = false;
        if (dVar.f152412l != null) {
            z2 = dVar.f152412l.f153248g;
        } else if (dVar.n != null) {
            z2 = dVar.n.f153302h;
        }
        String[] a2 = a(z2, strArr);
        String str = null;
        if (dVar.f152412l != null && dVar.f152412l.p != null && !TextUtils.isEmpty(b3)) {
            String a3 = dVar.f152412l.p.a();
            if (!TextUtils.isEmpty(a3) && a3.contains(b3)) {
                str = a3;
            }
            if (!TextUtils.isEmpty(str)) {
                b3 = com.ss.ttvideoengine.s.i.a(this.f152377l, str);
            }
        } else if (!(dVar.n == null || dVar.n.n == null || TextUtils.isEmpty(b3))) {
            String a4 = dVar.n.n.a();
            if (!TextUtils.isEmpty(a4) && a4.contains(b3)) {
                str = a4;
            }
            if (!TextUtils.isEmpty(str)) {
                b3 = com.ss.ttvideoengine.s.i.a(this.f152377l, str);
            }
        }
        if (b4 == null && (b4 = dVar.b(b3)) == null) {
            dVar.a(-100001);
            return;
        }
        b4.f152422a = b3;
        b4.f152426e = oVar;
        b4.f152425d = oVar.b(5);
        b4.f152424c = oVar.c();
        b4.f152427f = a2;
        b4.f152434m = str;
        b4.f152428g = com.ss.ttvideoengine.s.d.a(oVar, dVar);
        com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "[preload] prepare url info. videoId = " + dVar.f152401a + ", key is " + b3 + ", resolution = " + b4.f152424c.toString());
    }

    private static String[] a(boolean z2, String[] strArr) {
        if (!z2) {
            return strArr;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                strArr[i2] = com.ss.ttvideoengine.s.i.b(strArr[i2], "p2p=0");
            }
        }
        return strArr;
    }

    private void a(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (this.I != 0) {
            long j2 = aVMDLDataLoaderNotifyInfo.code;
            long j3 = aVMDLDataLoaderNotifyInfo.parameter;
            if (j2 > 0 && j3 > 0) {
                double d2 = (double) j2;
                Double.isNaN(d2);
                double d3 = (double) j3;
                Double.isNaN(d3);
                com.ss.android.ugc.h.g.e().a((8.0d * d2) / (d3 / 1000.0d), d2, j3);
            }
        }
    }

    public final void a(aj ajVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f152374i.lock();
                ArrayList<aj> arrayList = this.f152373h.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f152373h.put(str, arrayList);
                }
                if (!arrayList.contains(ajVar)) {
                    arrayList.add(ajVar);
                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "add engine ref,rawKey = " + str + " engine ref count: " + arrayList.size());
                }
            } finally {
                this.f152374i.unlock();
            }
        }
    }

    public final void a(String str, String str2) {
        AVMDLDNSParser.getInstance().setBackUpIP(str, str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.S = 1;
        }
    }

    private void a(C4065d dVar, C4065d.b bVar) {
        if (dVar == null || bVar == null) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "[preload] start mdl preload task fail. track is null");
            return;
        }
        com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "[preload] start mdl preload task.  key = " + bVar.f152422a);
        String str = bVar.n;
        String str2 = bVar.f152422a;
        if (dVar.o != null && dVar.o.f153214i != null) {
            bVar.f152423b = a(str2, dVar.f152401a, dVar.f152408h);
            if (!TextUtils.isEmpty(bVar.f152423b)) {
                this.f152372g.d(str2);
                this.f152372g.a(dVar);
                if (bVar.f152430i > 0 && bVar.f152430i < bVar.f152429h + 102400) {
                    bVar.f152431j += bVar.f152430i;
                    bVar.f152430i = 0;
                }
                com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "[preload] preload offset " + bVar.f152430i + " header size = " + bVar.f152429h + " preload size = " + bVar.f152431j);
                if (bVar.f152430i > 0) {
                    if (bVar.f152429h > 0) {
                        this.f152375j.preloadResource(bVar.f152423b, (int) bVar.f152429h);
                    }
                    this.f152375j.preloadResource(bVar.f152423b, (int) bVar.f152430i, (int) bVar.f152431j);
                } else {
                    this.f152375j.preloadResource(bVar.f152423b, (int) bVar.f152431j);
                }
            } else {
                dVar.a(-100001);
            }
            com.ss.ttvideoengine.s.j.a("DataLoaderHelper", com.a.a("[preload] exect preload task by provider mode, key is %s; videoId = %s proxyurl:%s", new Object[]{str2, dVar.f152401a, bVar.f152423b}));
        } else if (bVar.f152427f != null) {
            String[] strArr = bVar.f152427f;
            boolean a2 = dVar.f152402b != null ? dVar.f152402b.a(e.a.HLS) : false;
            if (strArr.length > 0 && strArr[0].toLowerCase().contains(".m3u")) {
                a2 = true;
            }
            com.ss.ttvideoengine.s.d.a(dVar, bVar);
            bVar.f152423b = a(str2, dVar.f152401a, bVar.f152430i, strArr, bVar.f152434m, bVar.f152428g, dVar.f152408h, str, a2);
            if (!TextUtils.isEmpty(bVar.f152423b)) {
                this.f152372g.d(str2);
                this.f152372g.a(dVar);
                if (bVar.f152430i > 0 && bVar.f152430i < bVar.f152429h + 102400) {
                    bVar.f152431j += bVar.f152430i;
                    bVar.f152430i = 0;
                }
                com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "[preload] preload offset " + bVar.f152430i + " header size = " + bVar.f152429h + " preload size = " + bVar.f152431j);
                if (bVar.f152430i > 0) {
                    if (bVar.f152429h > 0) {
                        this.f152375j.preloadResource(bVar.f152423b, (int) bVar.f152429h);
                    }
                    this.f152375j.preloadResource(bVar.f152423b, (int) bVar.f152430i, (int) bVar.f152431j);
                } else {
                    this.f152375j.preloadResource(bVar.f152423b, (int) bVar.f152431j);
                }
                com.ss.ttvideoengine.s.j.a("DataLoaderHelper", com.a.a("[preload] exect preload task ,key is %s; videoId = %s", new Object[]{bVar.f152422a, dVar.f152401a}));
                return;
            }
            dVar.a(-100001);
        } else {
            dVar.a(-100001);
        }
    }

    public static void a(d dVar, int i2, int i3) {
        if (!com.ss.android.ugc.aweme.lancet.j.a()) {
            dVar.a(i2, i3);
        } else if (i2 != 12) {
            dVar.a(i2, i3);
        } else {
            dVar.a(i2, i3);
            Keva.getRepo("ab_repo_cold_boot").storeInt("dataloader_key_int_preload_stragety", i3);
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$d  reason: collision with other inner class name */
    public class C4065d {

        /* renamed from: a  reason: collision with root package name */
        public String f152401a;

        /* renamed from: b  reason: collision with root package name */
        public com.ss.ttvideoengine.j.e f152402b;

        /* renamed from: c  reason: collision with root package name */
        public com.ss.ttvideoengine.s.c f152403c;

        /* renamed from: d  reason: collision with root package name */
        public long f152404d;

        /* renamed from: e  reason: collision with root package name */
        public float f152405e;

        /* renamed from: f  reason: collision with root package name */
        public long f152406f;

        /* renamed from: g  reason: collision with root package name */
        public long f152407g;

        /* renamed from: h  reason: collision with root package name */
        public int f152408h;

        /* renamed from: i  reason: collision with root package name */
        public w f152409i = w.Undefine;

        /* renamed from: j  reason: collision with root package name */
        public com.ss.ttvideoengine.f.e f152410j;

        /* renamed from: k  reason: collision with root package name */
        public l f152411k;

        /* renamed from: l  reason: collision with root package name */
        public s f152412l;

        /* renamed from: m  reason: collision with root package name */
        public String f152413m;
        public v n;
        public r o;
        public boolean p;
        public com.ss.ttvideoengine.l.b q;
        public String r;
        public String s;
        public List<b> t = new CopyOnWriteArrayList();

        static {
            Covode.recordClassIndex(101534);
        }

        public final void b() {
            com.ss.ttvideoengine.f.e eVar = this.f152410j;
            if (eVar != null) {
                eVar.f152547e = new a(this);
            }
        }

        public final void a() {
            if (this.f152412l != null && this.t.size() == 1) {
                this.t.remove(0);
            }
        }

        public final j c() {
            r rVar = this.o;
            if (rVar != null && rVar.f153215j != null) {
                return this.o.f153215j;
            }
            s sVar = this.f152412l;
            if (sVar != null) {
                return sVar.q;
            }
            v vVar = this.n;
            if (vVar != null) {
                return vVar.o;
            }
            com.ss.ttvideoengine.l.b bVar = this.q;
            if (bVar != null) {
                return bVar.f153063d;
            }
            return null;
        }

        /* renamed from: com.ss.ttvideoengine.d$d$b */
        public class b {

            /* renamed from: a  reason: collision with root package name */
            public String f152422a;

            /* renamed from: b  reason: collision with root package name */
            public String f152423b;

            /* renamed from: c  reason: collision with root package name */
            public w f152424c = w.Undefine;

            /* renamed from: d  reason: collision with root package name */
            public String f152425d;

            /* renamed from: e  reason: collision with root package name */
            public o f152426e;

            /* renamed from: f  reason: collision with root package name */
            public String[] f152427f;

            /* renamed from: g  reason: collision with root package name */
            public String f152428g;

            /* renamed from: h  reason: collision with root package name */
            public long f152429h;

            /* renamed from: i  reason: collision with root package name */
            public long f152430i;

            /* renamed from: j  reason: collision with root package name */
            public long f152431j;

            /* renamed from: k  reason: collision with root package name */
            public long f152432k;

            /* renamed from: l  reason: collision with root package name */
            public long f152433l;

            /* renamed from: m  reason: collision with root package name */
            public String f152434m;
            public String n;

            static {
                Covode.recordClassIndex(101536);
            }

            public b() {
            }
        }

        public C4065d() {
        }

        public final b b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            b a2 = a(str);
            if (a2 != null) {
                return a2;
            }
            b bVar = new b();
            bVar.f152422a = str;
            this.t.add(bVar);
            return bVar;
        }

        public final b a(String str) {
            if (this.t.size() > 0) {
                for (int i2 = 0; i2 < this.t.size(); i2++) {
                    b bVar = this.t.get(i2);
                    if (bVar.f152422a.equals(str)) {
                        return bVar;
                    }
                }
            }
            return null;
        }

        public final void a(int i2) {
            if (c() != null) {
                p pVar = new p(3);
                pVar.f153149e = new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainDataLoaderPreload", i2);
                c().a(pVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.ttvideoengine.d$d$a */
        public class a implements e.a {

            /* renamed from: b  reason: collision with root package name */
            private final WeakReference<C4065d> f152418b;

            static {
                Covode.recordClassIndex(101535);
            }

            @Override // com.ss.ttvideoengine.f.e.a
            public final void a(com.ss.ttvideoengine.s.c cVar) {
            }

            @Override // com.ss.ttvideoengine.f.e.a
            public final void a(String str) {
            }

            public a(C4065d dVar) {
                this.f152418b = new WeakReference<>(dVar);
            }

            @Override // com.ss.ttvideoengine.f.e.a
            public final void a(com.ss.ttvideoengine.j.p pVar, com.ss.ttvideoengine.s.c cVar) {
                C4065d dVar = this.f152418b.get();
                if (dVar != null) {
                    dVar.f152402b = pVar;
                    dVar.f152403c = cVar;
                    if (dVar.f152411k != null) {
                        dVar.f152411k.a(dVar);
                    }
                }
            }

            @Override // com.ss.ttvideoengine.f.e.a
            public final void a(int i2, String str) {
                C4065d dVar = this.f152418b.get();
                if (dVar != null) {
                    if (!(i2 == 0 || i2 == 10)) {
                        dVar.f152403c = new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainFetchingInfo", -7996);
                    }
                    if (dVar.f152411k != null) {
                        dVar.f152411k.a(dVar);
                    }
                }
            }
        }

        public final void a(String str, w wVar, long j2) {
            if (this.t.size() == 0) {
                b bVar = new b();
                bVar.f152422a = str;
                bVar.f152424c = wVar;
                bVar.f152431j = j2;
                this.t.add(bVar);
            } else {
                com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "[preload] DataLoaderTaskItem setup fail");
            }
            this.f152409i = wVar;
            this.f152404d = j2;
        }
    }

    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public static d f152465a = new d((byte) 0);

        static {
            Covode.recordClassIndex(101542);
        }
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public Timer f152392a;

        /* renamed from: b  reason: collision with root package name */
        public a f152393b;

        static {
            Covode.recordClassIndex(101532);
        }

        public class a extends TimerTask {

            /* renamed from: b  reason: collision with root package name */
            private AVMDLDataLoader f152400b;

            static {
                Covode.recordClassIndex(101533);
            }

            public final void run() {
                try {
                    AVMDLDataLoader aVMDLDataLoader = this.f152400b;
                    if (aVMDLDataLoader != null) {
                        aVMDLDataLoader.onLogInfo(70, 0, aVMDLDataLoader.getStringValue(1011));
                    }
                } catch (Exception unused) {
                }
            }

            public a(AVMDLDataLoader aVMDLDataLoader) {
                this.f152400b = aVMDLDataLoader;
            }
        }

        private c() {
        }

        /* synthetic */ c(d dVar, byte b2) {
            this();
        }
    }

    public class e {

        /* renamed from: a  reason: collision with root package name */
        public String f152435a;

        /* renamed from: b  reason: collision with root package name */
        public int f152436b;

        /* renamed from: c  reason: collision with root package name */
        public List<a> f152437c;

        /* renamed from: d  reason: collision with root package name */
        protected boolean f152438d;

        static {
            Covode.recordClassIndex(101537);
        }

        public class a {

            /* renamed from: a  reason: collision with root package name */
            public String f152440a;

            /* renamed from: b  reason: collision with root package name */
            public long f152441b;

            /* renamed from: c  reason: collision with root package name */
            public long f152442c;

            /* renamed from: d  reason: collision with root package name */
            public w f152443d = w.Undefine;

            /* renamed from: e  reason: collision with root package name */
            public List<C4066a> f152444e;

            /* renamed from: f  reason: collision with root package name */
            public String f152445f;

            /* renamed from: g  reason: collision with root package name */
            public com.ss.ttvideoengine.s.c f152446g;

            static {
                Covode.recordClassIndex(101538);
            }

            public final long a() {
                List<C4066a> list = this.f152444e;
                if (list == null || list.size() <= 0) {
                    return 0;
                }
                List<C4066a> list2 = this.f152444e;
                return list2.get(list2.size() - 1).f152449b;
            }

            public final boolean b() {
                long j2;
                long j3 = this.f152442c;
                if (j3 > 0) {
                    j2 = Math.min(j3, this.f152441b);
                } else {
                    j2 = this.f152441b;
                }
                C4066a aVar = null;
                List<C4066a> list = this.f152444e;
                if (list != null) {
                    aVar = list.get(list.size() - 1);
                }
                if (this.f152446g != null) {
                    return true;
                }
                if (aVar == null || this.f152441b <= 0 || aVar.f152448a + aVar.f152449b < j2) {
                    return false;
                }
                return true;
            }

            /* renamed from: com.ss.ttvideoengine.d$e$a$a  reason: collision with other inner class name */
            public class C4066a {

                /* renamed from: a  reason: collision with root package name */
                public long f152448a;

                /* renamed from: b  reason: collision with root package name */
                public long f152449b;

                static {
                    Covode.recordClassIndex(101539);
                }

                public C4066a() {
                }
            }

            public a() {
            }
        }

        public final long a() {
            long j2 = 0;
            if (this.f152437c != null) {
                for (int i2 = 0; i2 < this.f152437c.size(); i2++) {
                    j2 += this.f152437c.get(i2).a();
                }
            }
            return j2;
        }

        public final boolean b() {
            if (this.f152436b != 2) {
                com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "task is not a preload task");
                return false;
            }
            if (this.f152437c != null) {
                for (int i2 = 0; i2 < this.f152437c.size(); i2++) {
                    a aVar = this.f152437c.get(i2);
                    if (!(aVar == null || aVar.b())) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final boolean c() {
            boolean z;
            int i2;
            if (this.f152437c != null) {
                z = true;
                i2 = 0;
                for (int i3 = 0; i3 < this.f152437c.size(); i3++) {
                    a aVar = this.f152437c.get(i3);
                    if (aVar == null || aVar.b()) {
                        i2++;
                    } else {
                        z = false;
                    }
                }
            } else {
                z = true;
                i2 = 0;
            }
            if (!this.f152438d) {
                if (z || (i2 > 0 && this.f152436b == 1)) {
                    return true;
                }
                return false;
            } else if (z || (i2 >= 2 && this.f152436b == 1)) {
                return true;
            } else {
                return false;
            }
        }

        public e() {
        }

        /* access modifiers changed from: package-private */
        public final a a(String str) {
            List<a> list;
            if (!TextUtils.isEmpty(str) && (list = this.f152437c) != null) {
                for (a aVar : list) {
                    if (aVar.f152440a.equals(str)) {
                        return aVar;
                    }
                }
            }
            return null;
        }

        public final void a(C4065d dVar) {
            this.f152435a = dVar.f152401a;
            if (this.f152437c == null) {
                this.f152437c = new ArrayList();
            }
            Iterator<C4065d.b> it = dVar.t.iterator();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                C4065d.b next = it.next();
                a a2 = a(next.f152422a);
                if (a2 == null) {
                    a2 = new a();
                    z = false;
                }
                a2.f152440a = next.f152422a;
                a2.f152441b = next.f152432k;
                a2.f152443d = next.f152424c;
                long j2 = next.f152433l;
                if (a2.f152444e == null) {
                    a2.f152444e = new ArrayList();
                }
                if (a2.f152444e.size() == 0) {
                    a2.f152444e.add(new a.C4066a());
                }
                a2.f152444e.get(0).f152448a = 0;
                a2.f152444e.get(0).f152449b = j2;
                a2.f152445f = next.f152434m;
                a2.f152442c = next.f152431j;
                if (next.f152426e != null) {
                    if (next.f152426e.a() == q.f152976a) {
                        i3++;
                    } else if (next.f152426e.a() == q.f152977b) {
                        i2++;
                    }
                }
                if (!z) {
                    this.f152437c.add(a2);
                }
            }
            if (i2 > 0 && i3 > 0) {
                this.f152438d = true;
            }
        }
    }

    public class g {

        /* renamed from: a  reason: collision with root package name */
        public long f152461a;

        /* renamed from: c  reason: collision with root package name */
        private final ReentrantLock f152463c;

        /* renamed from: d  reason: collision with root package name */
        private final ArrayList<C4065d> f152464d;

        static {
            Covode.recordClassIndex(101541);
        }

        public final long a() {
            this.f152463c.lock();
            long size = (long) this.f152464d.size();
            this.f152463c.unlock();
            return size;
        }

        public final ArrayList<C4065d> d() {
            try {
                this.f152463c.lock();
                ArrayList<C4065d> arrayList = new ArrayList<>();
                arrayList.addAll(this.f152464d);
                return arrayList;
            } finally {
                this.f152463c.unlock();
            }
        }

        private Boolean e() {
            boolean z = false;
            if (this.f152461a < 1) {
                return false;
            }
            if (((long) this.f152464d.size()) >= this.f152461a) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        public final C4065d b() {
            this.f152463c.lock();
            if (this.f152464d.size() == 0) {
                this.f152463c.unlock();
                return null;
            }
            ArrayList<C4065d> arrayList = this.f152464d;
            C4065d dVar = arrayList.get(arrayList.size() - 1);
            this.f152463c.unlock();
            return dVar;
        }

        public final C4065d c() {
            this.f152463c.lock();
            if (this.f152464d.size() == 0) {
                this.f152463c.unlock();
                return null;
            }
            ArrayList<C4065d> arrayList = this.f152464d;
            C4065d dVar = arrayList.get(arrayList.size() - 1);
            this.f152464d.remove(dVar);
            this.f152463c.unlock();
            return dVar;
        }

        private g() {
            this.f152463c = new ReentrantLock();
            this.f152464d = new ArrayList<>();
            this.f152461a = 0;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(C4065d dVar) {
            Boolean bool;
            if (dVar == null || dVar.t.size() == 0) {
                return false;
            }
            Boolean.valueOf(false);
            this.f152463c.lock();
            if (e().booleanValue()) {
                bool = false;
            } else {
                this.f152464d.add(dVar);
                bool = true;
            }
            this.f152463c.unlock();
            return bool.booleanValue();
        }

        public final C4065d d(String str) {
            C4065d dVar = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.f152463c.lock();
            int i2 = 0;
            while (true) {
                if (i2 >= this.f152464d.size()) {
                    break;
                }
                C4065d dVar2 = this.f152464d.get(i2);
                if (dVar2.a(str) != null) {
                    dVar = dVar2;
                    this.f152464d.remove(dVar);
                    break;
                }
                i2++;
            }
            this.f152463c.unlock();
            return dVar;
        }

        public final boolean a(String str) {
            int i2 = 0;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Boolean bool = false;
            this.f152463c.lock();
            while (true) {
                if (i2 >= this.f152464d.size()) {
                    break;
                } else if (this.f152464d.get(i2).a(str) != null) {
                    bool = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f152463c.unlock();
            return bool.booleanValue();
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.ttvideoengine.d.C4065d b(com.ss.ttvideoengine.d.C4065d r4) {
            /*
                r3 = this;
                java.lang.String r0 = r4.f152401a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x0011
                java.lang.String r0 = r4.f152401a
                com.ss.ttvideoengine.d$d r2 = r3.c(r0)
                if (r2 == 0) goto L_0x0012
                return r2
            L_0x0011:
                r2 = 0
            L_0x0012:
                java.util.List<com.ss.ttvideoengine.d$d$b> r0 = r4.t
                java.util.Iterator r1 = r0.iterator()
            L_0x0018:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L_0x002c
                java.lang.Object r0 = r1.next()
                com.ss.ttvideoengine.d$d$b r0 = (com.ss.ttvideoengine.d.C4065d.b) r0
                java.lang.String r0 = r0.f152422a
                com.ss.ttvideoengine.d$d r2 = r3.d(r0)
                if (r2 == 0) goto L_0x0018
            L_0x002c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.d.g.b(com.ss.ttvideoengine.d$d):com.ss.ttvideoengine.d$d");
        }

        public final C4065d c(String str) {
            C4065d dVar = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.f152463c.lock();
            int i2 = 0;
            while (true) {
                if (i2 >= this.f152464d.size()) {
                    break;
                }
                C4065d dVar2 = this.f152464d.get(i2);
                if (!TextUtils.isEmpty(dVar2.f152401a) && dVar2.f152401a.equals(str)) {
                    dVar = dVar2;
                    this.f152464d.remove(dVar);
                    break;
                }
                i2++;
            }
            this.f152463c.unlock();
            return dVar;
        }

        public final C4065d b(String str) {
            C4065d dVar = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.f152463c.lock();
            int i2 = 0;
            while (true) {
                if (i2 >= this.f152464d.size()) {
                    break;
                }
                C4065d dVar2 = this.f152464d.get(i2);
                if (dVar2.a(str) != null) {
                    dVar = dVar2;
                    break;
                }
                i2++;
            }
            this.f152463c.unlock();
            return dVar;
        }

        /* synthetic */ g(d dVar, byte b2) {
            this();
        }
    }

    public final boolean c() {
        boolean z2;
        this.r.lock();
        try {
            if (this.f152369d == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return z2;
        } finally {
            this.r.unlock();
        }
    }

    public final void g() {
        this.r.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.f152375j;
            if (aVMDLDataLoader != null) {
                aVMDLDataLoader.clearNetinfoCache();
            }
        } catch (Throwable unused) {
        }
        this.r.unlock();
    }

    public final long i() {
        return this.f152371f.a() + this.f152372g.a() + this.f152370e.a();
    }

    public static class k {

        /* renamed from: a  reason: collision with root package name */
        private HandlerThread f152470a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f152471b;

        static {
            Covode.recordClassIndex(101545);
        }

        public k() {
            try {
                HandlerThread handlerThread = new HandlerThread("vclould.engine.preload.media");
                this.f152470a = handlerThread;
                handlerThread.start();
                this.f152471b = new Handler(this.f152470a.getLooper()) {
                    /* class com.ss.ttvideoengine.d.k.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(101546);
                    }

                    public final void handleMessage(Message message) {
                        if (message != null) {
                            try {
                                if (!(message.obj instanceof ArrayList)) {
                                    com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "[preload] obj should instance of ArrayList");
                                    return;
                                }
                                ArrayList arrayList = (ArrayList) message.obj;
                                if (arrayList == null) {
                                    com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "[preload] obj should instance of ArrayList");
                                    return;
                                }
                                d dVar = (d) arrayList.get(0);
                                switch (message.what) {
                                    case 111:
                                        if (arrayList.size() == 3) {
                                            com.ss.ttvideoengine.l.c cVar = (com.ss.ttvideoengine.l.c) arrayList.get(1);
                                            String str = (String) arrayList.get(2);
                                            if (dVar != null && cVar != null) {
                                                i iVar = null;
                                                if (cVar.f153065f != null) {
                                                    iVar = new i(cVar.f153065f);
                                                }
                                                String m2 = cVar.f153064e.m();
                                                if (cVar.f153066g != null) {
                                                    JSONObject n = cVar.f153064e.n();
                                                    try {
                                                        n.put("sc_extra", new JSONObject(cVar.f153066g));
                                                        m2 = n.toString();
                                                    } catch (JSONException unused) {
                                                    }
                                                }
                                                e.c.f153200a.b().addMedia(m2, iVar, str, cVar.f153067h);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case 112:
                                        if (arrayList.size() == 3) {
                                            String str2 = (String) arrayList.get(1);
                                            String str3 = (String) arrayList.get(2);
                                            if (dVar != null) {
                                                e.c.f153200a.b().removeMedia(str2, str3);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case 113:
                                        if (arrayList.size() == 3) {
                                            String str4 = (String) arrayList.get(1);
                                            int intValue = ((Integer) arrayList.get(2)).intValue();
                                            if (dVar != null) {
                                                e.c.f153200a.b().removeAllMedia(str4, intValue);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case 114:
                                        if (arrayList.size() == 3) {
                                            String str5 = (String) arrayList.get(1);
                                            int intValue2 = ((Integer) arrayList.get(2)).intValue();
                                            if (dVar != null) {
                                                e.c.f153200a.b().focusMedia(str5, intValue2);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                };
            } catch (Throwable unused) {
                this.f152470a = null;
                this.f152471b = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final String f() {
        AVMDLDataLoader aVMDLDataLoader;
        this.r.lock();
        try {
            if (this.E == null && (aVMDLDataLoader = this.f152375j) != null) {
                this.E = aVMDLDataLoader.getStringValue(11);
            }
            String str = this.E;
            this.r.unlock();
            return str;
        } catch (Exception unused) {
            this.r.unlock();
            return null;
        } catch (Throwable th) {
            this.r.unlock();
            throw th;
        }
    }

    public final void h() {
        if (this.f152375j == null || this.f152369d != 0) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "need start mdl first");
            return;
        }
        this.r.lock();
        try {
            k();
            this.r.unlock();
        } catch (Throwable unused) {
            this.r.unlock();
        }
    }

    public final boolean d() {
        if (this.X > 0 && this.aa.f153074a > 0 && this.aa.f153075b > 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        if (this.f152369d != 0) {
            com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "dataloader not started, not allow set play info");
        } else if (this.Y > 0) {
            this.r.lock();
            this.f152375j.setIntValue(7410, ag.a().f152180b);
            this.f152375j.setIntValue(7409, ag.a.a().c());
            this.r.unlock();
        }
    }

    @Override // com.ss.mediakit.medialoader.AVMDLStartCompleteListener
    public final void onStartComplete() {
        com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "MediaDataLoader start complete");
        com.ss.ttvideoengine.o.a.a().b().a(com.ss.ttvideoengine.o.a.f153133f);
        int i2 = ag.a().f152179a;
        this.v = i2;
        AVMDLDataLoader aVMDLDataLoader = this.f152375j;
        if (aVMDLDataLoader != null) {
            aVMDLDataLoader.setIntValue(7219, i2);
            if (!e.c.f153200a.b().isRunning()) {
                com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "strategy center running failed, set mdl preload strategy back " + this.z);
                this.f152375j.setIntValue(1030, this.z);
            }
        }
    }

    private d() {
        this.f152369d = 1;
        this.f152370e = new g(this, (byte) 0);
        this.f152371f = new g(this, (byte) 0);
        this.f152372g = new g(this, (byte) 0);
        this.B = new g(this, (byte) 0);
        this.f152373h = new HashMap<>();
        this.f152374i = new ReentrantLock();
        this.f152375j = null;
        this.f152376k = null;
        this.f152377l = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.f152378m = null;
        this.n = null;
        this.o = null;
        this.F = 0;
        this.p = -1;
        this.q = true;
        this.G = 0;
        this.H = false;
        this.r = new ReentrantLock();
        this.s = 0;
        this.I = 0;
        this.J = 0;
        this.t = null;
        this.u = null;
        this.v = -1;
        this.K = 0;
        this.L = 0;
        this.M = false;
        this.N = 1;
        this.O = null;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.w = false;
        this.x = null;
        this.U = true;
        this.V = 0;
        this.y = 0;
        this.z = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = new com.ss.ttvideoengine.l.e();
        this.C = bg.a();
        this.f152369d = 1;
        this.f152376k = AVMDLDataLoaderConfigure.getDefaultonfigure();
    }

    private boolean j() {
        String c2;
        if (this.f152366a == null) {
            return true;
        }
        if (this.K == 1 && this.f152377l != null) {
            try {
                String str = this.f152377l.getApplicationInfo().dataDir + "/lib";
                if (!(str == null || (c2 = com.ss.ttvideoengine.s.i.c(new File(str + File.separatorChar + "libavmdl.so"))) == null)) {
                    com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "libavmdl md5: ".concat(String.valueOf(c2)));
                }
            } catch (Exception unused) {
            }
        }
        if (this.f152366a != null && !this.A) {
            if (this.W == 1) {
                try {
                    this.A = this.f152366a.a();
                } catch (Exception unused2) {
                    this.A = false;
                }
            }
            com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "try to load avmdl: " + this.A);
            if (!this.A) {
                this.A = this.f152366a.a();
            }
        }
        return this.A;
    }

    private void k() {
        ArrayList arrayList = new ArrayList();
        if (this.f152371f.a() > 0) {
            while (true) {
                C4065d c2 = this.f152371f.c();
                if (c2 == null) {
                    break;
                } else if (c2.f152408h >= 10000) {
                    arrayList.add(c2);
                } else {
                    if (c2.f152410j != null) {
                        c2.f152410j.a();
                    }
                    a(c2);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.f152371f.a((C4065d) arrayList.get(i2));
            }
            arrayList.clear();
        }
        if (this.f152370e.a() > 0) {
            while (true) {
                C4065d c3 = this.f152370e.c();
                if (c3 == null) {
                    break;
                } else if (c3.f152408h >= 10000) {
                    arrayList.add(c3);
                } else {
                    if (c3.f152410j != null) {
                        c3.f152410j.a();
                    }
                    a(c3);
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.f152370e.a((C4065d) arrayList.get(i3));
            }
            arrayList.clear();
        }
        if (this.f152372g.a() > 0) {
            boolean z2 = false;
            while (true) {
                C4065d c4 = this.f152372g.c();
                if (c4 == null) {
                    break;
                } else if (c4.f152408h >= 10000) {
                    arrayList.add(c4);
                } else {
                    a(c4);
                    z2 = true;
                }
            }
            if (z2) {
                this.f152375j.cancelAll();
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                this.f152372g.a((C4065d) arrayList.get(i4));
            }
            arrayList.clear();
        }
    }

    public final boolean b() {
        boolean z2;
        boolean z3;
        if (this.f152375j != null) {
            return true;
        }
        if (!j()) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", com.a.a("library load fail", new Object[0]));
            return false;
        }
        if (this.f152366a == null && this.W == 1 && this.f152367b != null) {
            com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "try to load mdlv2");
            AVMDLDataLoader.loadAVMDLBaseLibrary();
            this.f152367b.b();
            com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "load mdlv2: false");
        }
        if (this.f152366a != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.F != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (AVMDLDataLoader.init(z2, z3) != 0) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", com.a.a("library has not been loaded", new Object[0]));
            return false;
        }
        com.ss.ttvideoengine.s.j.e("P2PLIB", com.a.a("loadertype:%d NeedDLLoadP2PLib:%d, liveloaderType: %d", new Object[]{Integer.valueOf(this.f152376k.mLoaderType), Integer.valueOf(this.F), Integer.valueOf(this.f152376k.mLiveLoaderType)}));
        if (this.F == 0 && ((this.f152376k.mLoaderType > 0 || (this.f152376k.mLiveLoaderType != 10000 && this.f152376k.mLiveLoaderType >= 7)) && this.f152367b != null)) {
            com.ss.ttvideoengine.s.j.e("P2PLIB", "try to load p2p lib");
            this.f152367b.b();
            com.ss.ttvideoengine.s.j.e("P2PLIB", com.a.a("load p2p lib result:%d", new Object[]{0}));
        }
        try {
            AVMDLDataLoader instance = AVMDLDataLoader.getInstance();
            this.f152375j = instance;
            instance.setConfigure(this.f152376k);
            this.f152375j.setListener(this);
            this.f152375j.setStartCompleteListener(this);
            this.f152378m = new c(this, (byte) 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void l() {
        String str;
        String str2;
        bg.a a2;
        MethodCollector.i(10171);
        if (this.f152375j == null) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "[preload] need load mdl first.");
            MethodCollector.o(10171);
            return;
        }
        C4065d b2 = this.f152370e.b();
        if (b2 == null) {
            MethodCollector.o(10171);
        } else if (this.f152371f.a(b2)) {
            this.f152370e.c();
            if (b2.f152402b == null && b2.o == null) {
                b2.a();
                HashMap hashMap = new HashMap();
                if (b2.f152412l != null && b2.f152412l.f153245d.equals("bytevc2")) {
                    hashMap.put("codec_type", "4");
                } else if (b2.f152412l != null && b2.f152412l.f153245d.equals("bytevc1")) {
                    hashMap.put("codec_type", "3");
                }
                if (b2.f152412l != null && b2.f152412l.f153246e) {
                    hashMap.put("format_type", "dash");
                }
                if (b2.f152412l != null && b2.f152412l.f153247f) {
                    hashMap.put("ssl", "1");
                }
                String str3 = null;
                if (b2.f152412l == null || b2.f152412l.n == null) {
                    str = null;
                    str2 = null;
                } else {
                    str = b2.f152412l.n.a();
                    str2 = b2.f152412l.n.b();
                    if (b2.f152412l.f153249h) {
                        str = com.ss.ttvideoengine.s.i.c(str);
                    }
                    b2.f152413m = str;
                }
                if (this.f152367b != null && TextUtils.isEmpty(b2.f152413m)) {
                    if (b2.f152412l.f153249h) {
                        str = com.ss.ttvideoengine.s.i.c((String) null);
                    } else {
                        str = null;
                    }
                    b2.f152413m = com.ss.ttvideoengine.s.l.a(str);
                    str2 = null;
                }
                int c2 = ag.a.a().c();
                if (c2 != -1) {
                    str = str + com.a.a("&%s=%s", new Object[]{"network_score", Integer.valueOf(c2)});
                    b2.f152413m = com.ss.ttvideoengine.s.l.a(str);
                }
                String a3 = com.ss.ttvideoengine.s.l.a(str);
                synchronized (s.class) {
                    try {
                        a2 = this.C.a(b2.f152401a, a3);
                    } finally {
                        MethodCollector.o(10171);
                    }
                }
                if (a2 == null || a2.f152349c) {
                    if (b2.f152412l != null) {
                        b2.f152410j = new com.ss.ttvideoengine.f.e(this.f152377l, b2.f152412l.a());
                        b2.b();
                        b2.f152410j.f152548f = b2.f152412l.f153253l;
                        b2.f152410j.f152549g = b2.f152412l.f153242a;
                        b2.f152410j.a(true);
                        com.ss.ttvideoengine.f.e eVar = b2.f152410j;
                        if (!(b2.f152412l.f153244c == 2 || b2.f152412l.f153244c == 4)) {
                            str3 = str2;
                        }
                        eVar.a(a3, str3, b2.f152412l.f153244c);
                    }
                    return;
                }
                b2.f152402b = a2.f152347a;
                com.ss.ttvideoengine.s.j.a("DataLoaderHelper", com.a.a("[preload] get videoModel , videoId = %s", new Object[]{b2.f152401a}));
                b(b2);
                MethodCollector.o(10171);
                return;
            }
            b(b2);
            MethodCollector.o(10171);
        } else {
            MethodCollector.o(10171);
        }
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f152382a;

        /* renamed from: b  reason: collision with root package name */
        public long f152383b;

        /* renamed from: c  reason: collision with root package name */
        public long f152384c;

        static {
            Covode.recordClassIndex(101530);
        }

        public a() {
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public long f152388a;

        /* renamed from: b  reason: collision with root package name */
        public long f152389b;

        /* renamed from: c  reason: collision with root package name */
        public String f152390c;

        static {
            Covode.recordClassIndex(101531);
        }

        public b() {
        }
    }

    public final void m(String str) {
        this.B.d(str);
    }

    public class f {

        /* renamed from: a  reason: collision with root package name */
        public String f152451a;

        /* renamed from: b  reason: collision with root package name */
        public String f152452b;

        /* renamed from: c  reason: collision with root package name */
        public String f152453c;

        /* renamed from: d  reason: collision with root package name */
        public long f152454d;

        /* renamed from: e  reason: collision with root package name */
        public long f152455e;

        /* renamed from: f  reason: collision with root package name */
        public w f152456f = w.Undefine;

        /* renamed from: g  reason: collision with root package name */
        public String f152457g;

        /* renamed from: h  reason: collision with root package name */
        public o f152458h;

        /* renamed from: i  reason: collision with root package name */
        public int f152459i;

        static {
            Covode.recordClassIndex(101540);
        }

        public f() {
        }
    }

    public final void a(long j2) {
        e eVar = this.f152367b;
        if (eVar != null) {
            eVar.a(9, 0, j2, "");
        }
    }

    public static void e(int i2) {
        if (i2 == 1) {
            i2 = 1;
        } else if (i2 >= 4) {
            i2 = 5;
        }
        com.ss.ttvideoengine.q.e eVar = e.c.f153200a;
        eVar.b().setIntValue(10000, i2);
        eVar.n = i2;
    }

    public final long d(String str) {
        long j2 = 0;
        if (this.f152369d != 0) {
            return 0;
        }
        this.r.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.f152375j;
            if (aVMDLDataLoader != null) {
                long tryQuickGetCacheSize = aVMDLDataLoader.tryQuickGetCacheSize(str);
                if (tryQuickGetCacheSize > 0) {
                    j2 = tryQuickGetCacheSize;
                }
            }
        } catch (Throwable unused) {
        }
        this.r.unlock();
        return j2;
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getCheckSumInfo(String str) {
        try {
            if (this.f152367b == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f152367b.a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final a j(String str) {
        b f2 = f(str);
        if (f2 == null) {
            return null;
        }
        a aVar = new a();
        aVar.f152383b = f2.f152388a;
        aVar.f152384c = f2.f152389b;
        aVar.f152382a = f2.f152390c;
        return aVar;
    }

    public final void b(String str) {
        if (this.f152369d == 0 && !TextUtils.isEmpty(str)) {
            this.r.lock();
            try {
                Uri parse = Uri.parse(str);
                int port = parse.getPort();
                if (port == -1) {
                    port = 80;
                    if (str.startsWith("https")) {
                        port = 443;
                    }
                }
                AVMDLDataLoader aVMDLDataLoader = this.f152375j;
                if (aVMDLDataLoader != null) {
                    aVMDLDataLoader.preConnectByHost(parse.getHost(), port);
                }
            } finally {
                this.r.unlock();
            }
        }
    }

    public final long c(int i2) {
        long j2;
        this.r.lock();
        long j3 = -1;
        if (i2 != 1003) {
            if (i2 == 1152) {
                j2 = this.f152376k.mMonitorTimeInternal;
            } else if (i2 != 1153) {
                this.r.unlock();
                return -1;
            } else {
                try {
                    j2 = this.f152376k.mMonitorMinAllowLoadSize;
                } catch (Throwable th) {
                    this.r.unlock();
                    throw th;
                }
            }
            this.r.unlock();
            return j2;
        }
        if (this.H) {
            j3 = this.p;
        }
        this.r.unlock();
        return j3;
    }

    public final int d(int i2) {
        if (!com.ss.android.ugc.aweme.lancet.j.a()) {
            return f(i2);
        }
        if (i2 != 12) {
            return f(i2);
        }
        return Keva.getRepo("ab_repo_cold_boot").getInt("dataloader_key_int_preload_stragety", -1);
    }

    public final String e(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.r.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.f152375j;
            if (aVMDLDataLoader != null) {
                str2 = aVMDLDataLoader.getStringValueByStr(str, 1010);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.r.unlock();
            throw th;
        }
        this.r.unlock();
        return str2;
    }

    public final long g(String str) {
        this.r.lock();
        long j2 = 0;
        try {
            if (this.f152375j != null) {
                long cacheSize = this.f152375j.getCacheSize(com.ss.ttvideoengine.s.i.a(this.f152377l, str), str);
                if (cacheSize > 0) {
                    j2 = cacheSize;
                }
            }
        } catch (Throwable unused) {
        }
        this.r.unlock();
        return j2;
    }

    public final long i(String str) {
        long j2 = 0;
        if (this.f152369d != 0) {
            return 0;
        }
        this.r.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.f152375j;
            if (aVMDLDataLoader != null) {
                long cacheSize = aVMDLDataLoader.getCacheSize(str);
                if (cacheSize > 0) {
                    j2 = cacheSize;
                }
            }
        } catch (Throwable unused) {
        }
        this.r.unlock();
        return j2;
    }

    public final boolean l(String str) {
        boolean z2 = false;
        if (this.f152369d != 0) {
            return false;
        }
        this.r.lock();
        try {
            if (this.f152375j != null) {
                if (!TextUtils.isEmpty(str)) {
                    this.f152375j.downloadResource(str);
                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "[downloader] start download resource = ".concat(String.valueOf(str)));
                    z2 = true;
                }
            }
        } catch (Throwable unused) {
        }
        this.r.unlock();
        return z2;
    }

    /* access modifiers changed from: package-private */
    public class j implements l {

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<d> f152469b;

        static {
            Covode.recordClassIndex(101544);
        }

        @Override // com.ss.ttvideoengine.d.l
        public final void a(C4065d dVar) {
            d dVar2 = this.f152469b.get();
            if (dVar2 != null && dVar != null) {
                if (!(dVar.f152402b == null || dVar.c() == null)) {
                    p pVar = new p(4);
                    pVar.f153150f = (com.ss.ttvideoengine.j.p) dVar.f152402b;
                    dVar.c().a(pVar);
                    dVar.f152409i = dVar.f152412l.f153243b;
                }
                if (!(dVar.f152412l == null || dVar.f152412l.o == null)) {
                    dVar.f152409i = dVar.f152412l.f153243b;
                }
                if (dVar.f152412l != null && !dVar.f152412l.f153252k) {
                    dVar2.b(dVar);
                }
                if (dVar.f152403c != null) {
                    if (dVar2.f152367b != null) {
                        dVar2.f152367b.a(dVar.f152401a, dVar.f152403c);
                    }
                    if (dVar.c() != null) {
                        p pVar2 = new p(3);
                        pVar2.f153149e = dVar.f152403c;
                        dVar.c().a(pVar2);
                    }
                }
            }
        }

        public j(d dVar) {
            this.f152469b = new WeakReference<>(dVar);
        }
    }

    private static String[] b(String[] strArr) {
        if (strArr == null || strArr.length <= 1) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr[0]);
        for (int i2 = 1; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            Boolean bool = true;
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (((String) arrayList.get(size)).equals(str)) {
                    bool = false;
                    break;
                } else {
                    size--;
                }
            }
            if (bool.booleanValue()) {
                arrayList.add(str);
            }
        }
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        return strArr2;
    }

    private boolean n(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("mdl://") && !lowerCase.startsWith("http://127.0.0.1") && !lowerCase.startsWith("http://localhost") && !lowerCase.startsWith("file://") && !lowerCase.startsWith("/") && !lowerCase.endsWith(".mpd") && !lowerCase.contains(".mpd?") && (((this.T == 1 && this.w) || (!lowerCase.contains(".m3u8?") && !lowerCase.endsWith(".m3u8"))) && !lowerCase.contains(".m3u?") && !lowerCase.endsWith(".m3u"))) {
            return true;
        }
        return false;
    }

    private ArrayList<aj> o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            this.f152374i.lock();
            ArrayList<aj> arrayList = this.f152373h.get(str);
            if (arrayList != null) {
                ArrayList<aj> arrayList2 = new ArrayList<>();
                arrayList2.addAll(arrayList);
                com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "get engine ref,rawKey = " + str + " engine ref count: " + arrayList2.size());
                return arrayList2;
            }
            this.f152374i.unlock();
            return null;
        } finally {
            this.f152374i.unlock();
        }
    }

    public final JSONObject c(String str) {
        String cDNLog;
        if (this.f152369d != 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        this.r.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.f152375j;
            if (!(aVMDLDataLoader == null || (cDNLog = aVMDLDataLoader.getCDNLog(str)) == null)) {
                JSONObject jSONObject = new JSONObject(cDNLog);
                com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "get cdn log suc" + jSONObject.toString());
                this.r.unlock();
                return jSONObject;
            }
        } catch (Exception e2) {
            com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "get log exception" + e2.toString());
        } catch (Throwable th) {
            this.r.unlock();
            throw th;
        }
        this.r.unlock();
        return null;
    }

    public final b f(String str) {
        b bVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.r.lock();
        try {
            if (this.f152375j != null) {
                if (this.f152369d == 0) {
                    String stringCacheInfo = this.f152375j.getStringCacheInfo(str);
                    if (stringCacheInfo != null) {
                        String[] split = stringCacheInfo.split(",");
                        if (split.length >= 4) {
                            b bVar2 = new b();
                            bVar2.f152390c = split[3];
                            if (!TextUtils.isEmpty(split[0])) {
                                bVar2.f152389b = Long.valueOf(split[0]).longValue();
                            }
                            if (!TextUtils.isEmpty(split[1])) {
                                bVar2.f152388a = Long.valueOf(split[1]).longValue();
                            }
                            com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "get cache info.");
                            bVar = bVar2;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.r.unlock();
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public final void h(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.r.lock();
            try {
                if (this.f152375j == null) {
                    com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "mInnerDataLoader == null");
                } else {
                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", " force remove mdl file. key ".concat(String.valueOf(str)));
                    this.f152375j.forceRemoveFileCache(str);
                }
            } catch (Throwable unused) {
            }
            this.r.unlock();
        }
    }

    public final String k(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("mdl://")) {
                return str;
            }
            int indexOf = str.indexOf("?");
            if (indexOf == -1) {
                return null;
            }
            String localAddr = this.f152375j.getLocalAddr();
            if (TextUtils.isEmpty(localAddr)) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("http://");
            stringBuffer.append(localAddr);
            stringBuffer.append(str.substring(indexOf));
            String stringBuffer2 = stringBuffer.toString();
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "_proxyUrl: ".concat(String.valueOf(stringBuffer2)));
            return stringBuffer2;
        } catch (Exception unused) {
            com.ss.ttvideoengine.s.j.e("DataLoaderHelper", "get proxy url failed: ".concat(String.valueOf(str)));
            return str;
        }
    }

    private static String a(HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : hashMap.keySet()) {
            sb.append(str).append(": ").append(hashMap.get(str)).append("\r\n");
        }
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    private int f(int i2) {
        int i3;
        this.r.lock();
        if (i2 == 7) {
            i3 = this.f152376k.mEnableExternDNS;
        } else if (i2 == 8) {
            i3 = this.f152376k.mEnableSocketReuse;
        } else if (i2 == 12) {
            i3 = this.y;
        } else if (i2 == 90) {
            i3 = this.f152376k.mDNSMainType;
        } else if (i2 == 103) {
            i3 = AVMDLDNSParser.getIntValue(4);
        } else if (i2 == 105) {
            i3 = AVMDLDNSParser.getIntValue(6);
        } else if (i2 == 1001) {
            i3 = this.f152376k.mEnablePreconnect;
        } else if (i2 == 1008) {
            i3 = this.v;
        } else if (i2 == 1150) {
            i3 = this.f152376k.mEnableIOManager;
        } else if (i2 == 9009) {
            i3 = this.w;
        } else if (i2 == 100) {
            i3 = this.f152376k.mMaxTlsVersion;
        } else if (i2 == 101) {
            i3 = this.f152376k.mEnableSessionReuse;
        } else if (i2 == 114) {
            i3 = this.R;
        } else if (i2 != 115) {
            i3 = -1;
        } else {
            try {
                i3 = this.S;
            } catch (Throwable th) {
                this.r.unlock();
                throw th;
            }
        }
        this.r.unlock();
        return i3 == 1 ? 1 : 0;
    }

    private void c(C4065d dVar) {
        ArrayList<C4065d> d2 = this.B.d();
        for (int i2 = 0; i2 < d2.size(); i2++) {
            C4065d dVar2 = d2.get(i2);
            if (!TextUtils.isEmpty(dVar2.f152401a) && !TextUtils.isEmpty(dVar.f152401a) && dVar2.f152401a.equals(dVar.f152401a)) {
                return;
            }
        }
        this.r.lock();
        com.ss.ttvideoengine.l.e eVar = this.aa;
        String str = dVar.f152401a;
        eVar.f153076c.lock();
        if (!eVar.f153077d.containsKey(str)) {
            if (eVar.f153077d.size() >= 2) {
                eVar.f153077d.clear();
            }
            eVar.f153077d.put(str, new e.a());
        }
        com.ss.ttvideoengine.s.j.b("PreloadUtil", "key :" + str + " cache end.");
        e.a aVar = eVar.f153077d.get(str);
        if (aVar != null) {
            aVar.f153082e = true;
            if (!aVar.f153083f) {
                com.ss.ttvideoengine.s.j.b("PreloadUtil", "cached video trigger preload " + str + " cache end ");
                h.f152465a.a(aVar.f153078a);
                aVar.f153083f = true;
            }
        } else {
            com.ss.ttvideoengine.s.j.b("PreloadUtil", "key :" + str + " play info null");
        }
        eVar.f153076c.unlock();
        this.r.unlock();
        ArrayList<aj> o2 = o(dVar.f152401a);
        if (!(o2 == null || o2.size() == 0)) {
            for (int i3 = 0; i3 < o2.size(); i3++) {
                aj ajVar = o2.get(i3);
                if (ajVar.O != null) {
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "notify cache end. source id: " + ajVar.bl);
                    ba baVar = new ba();
                    baVar.f152316a = "mdlcacheend";
                    if (ajVar.ch.b()) {
                        ajVar.ch.b(412, 0, 0, baVar);
                    } else {
                        ajVar.O.a(baVar);
                    }
                }
            }
        }
    }

    private static JSONObject a(JSONObject jSONObject) {
        try {
            long a2 = be.f152335a.a();
            if (a2 > 0) {
                jSONObject.put("_play_waste_data", a2);
            }
            long b2 = be.f152335a.b();
            if (b2 > 0) {
                jSONObject.put("_play_consumed_data", b2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.ss.ttvideoengine.d.C4065d r31) {
        /*
        // Method dump skipped, instructions count: 1309
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.d.b(com.ss.ttvideoengine.d$d):void");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        String str;
        C4065d b2;
        String str2;
        int i2;
        String str3;
        boolean z2;
        g gVar;
        C4065d dVar;
        String str4;
        int i3;
        String str5;
        if (aVMDLDataLoaderNotifyInfo != null) {
            int i4 = aVMDLDataLoaderNotifyInfo.what;
            if (i4 != 8) {
                if (i4 == 24) {
                    e eVar = this.f152367b;
                    if (eVar != null) {
                        eVar.a(30, 0, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                        return;
                    }
                    return;
                } else if (i4 == 70) {
                    aVMDLDataLoaderNotifyInfo.jsonLog = a(aVMDLDataLoaderNotifyInfo.jsonLog);
                    p pVar = this.o;
                    if (pVar != null) {
                        pVar.a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                        return;
                    }
                    e eVar2 = this.f152367b;
                    if (eVar2 != null) {
                        eVar2.a(3, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                    }
                    com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "heart beat msg: " + aVMDLDataLoaderNotifyInfo.logInfo);
                    return;
                } else if (i4 == 700) {
                    com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "KeyIsSpeedTestSampledByTime " + aVMDLDataLoaderNotifyInfo.code);
                    at atVar = this.f152368c;
                    if (atVar != null) {
                        atVar.a(aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.logExtraJsonStr);
                    }
                    if (this.L == 1) {
                        this.f152367b.a(2, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                        return;
                    }
                    return;
                } else if (i4 == 702) {
                    at atVar2 = this.f152368c;
                    if (atVar2 != null) {
                        atVar2.a(aVMDLDataLoaderNotifyInfo.logInfo);
                        return;
                    }
                    return;
                } else if (i4 == 10) {
                    p pVar2 = this.o;
                    if (pVar2 != null) {
                        pVar2.a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                        return;
                    }
                    e eVar3 = this.f152367b;
                    if (eVar3 != null) {
                        eVar3.a(4, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                        com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "live loader log msg: " + aVMDLDataLoaderNotifyInfo.logInfo);
                        return;
                    }
                    return;
                } else if (i4 == 11) {
                    p pVar3 = this.o;
                    if (pVar3 != null) {
                        pVar3.a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                        return;
                    }
                    e eVar4 = this.f152367b;
                    if (eVar4 != null) {
                        eVar4.a(5, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                        com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "live loader log sample msg: " + aVMDLDataLoaderNotifyInfo.logInfo);
                        return;
                    }
                    return;
                } else if (i4 == 901) {
                    com.ss.ttvideoengine.s.j.b("multinetwork", com.a.a("target network:%d current network:%d", new Object[]{Long.valueOf(aVMDLDataLoaderNotifyInfo.parameter), Long.valueOf(aVMDLDataLoaderNotifyInfo.code)}));
                    String b3 = b(aVMDLDataLoaderNotifyInfo.parameter);
                    String b4 = b(aVMDLDataLoaderNotifyInfo.code);
                    if (!TextUtils.isEmpty(b3) && !TextUtils.isEmpty(b4) && this.f152367b != null) {
                        com.ss.ttvideoengine.s.j.b("multinetwork", "do callback target: " + b3 + " current: " + b4);
                        com.ss.ttvideoengine.s.j.b("multinetwork", "end do callback target: " + b3 + " current: " + b4);
                        return;
                    }
                    return;
                } else if (i4 != 902) {
                    switch (i4) {
                        case 0:
                            p pVar4 = this.o;
                            if (pVar4 != null) {
                                pVar4.a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                return;
                            }
                            e eVar5 = this.f152367b;
                            if (eVar5 != null) {
                                eVar5.a(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                            }
                            if (this.n != null && !this.U) {
                                return;
                            }
                            return;
                        case 1:
                            p pVar5 = this.o;
                            if (pVar5 != null) {
                                pVar5.a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                return;
                            }
                            e eVar6 = this.f152367b;
                            if (eVar6 != null) {
                                eVar6.a(1, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                            }
                            if (this.n != null && !this.U) {
                                return;
                            }
                            return;
                        case 2:
                            e eVar7 = this.f152367b;
                            if (eVar7 != null) {
                                eVar7.a(2, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                            }
                            a(aVMDLDataLoaderNotifyInfo);
                            return;
                        case 3:
                        case 4:
                            com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "KeyIsFileCacheProgress log = " + aVMDLDataLoaderNotifyInfo.logInfo + ", task type = " + aVMDLDataLoaderNotifyInfo.parameter + " code = " + ((int) aVMDLDataLoaderNotifyInfo.code));
                            if (aVMDLDataLoaderNotifyInfo.logInfo == null) {
                                return;
                            }
                            if (aVMDLDataLoaderNotifyInfo.parameter == 3) {
                                com.ss.ttvideoengine.e.d.f152491a.a(aVMDLDataLoaderNotifyInfo.logInfo);
                                return;
                            }
                            if (aVMDLDataLoaderNotifyInfo.parameter == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!TextUtils.isEmpty(aVMDLDataLoaderNotifyInfo.logInfo)) {
                                String[] split = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
                                if (split.length >= 4) {
                                    try {
                                        long longValue = Long.valueOf(split[0]).longValue();
                                        long longValue2 = Long.valueOf(split[1]).longValue();
                                        if (longValue2 > 0 || aVMDLDataLoaderNotifyInfo.what == 4) {
                                            String str6 = split[2];
                                            String str7 = split[3];
                                            if (z2) {
                                                dVar = this.f152372g.b(str6);
                                                if (dVar == null) {
                                                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "[preload] preload temItem == null return " + aVMDLDataLoaderNotifyInfo.logInfo);
                                                    if (aVMDLDataLoaderNotifyInfo.what == 4) {
                                                        f fVar = new f();
                                                        fVar.f152455e = longValue;
                                                        fVar.f152454d = longValue2;
                                                        fVar.f152451a = str6;
                                                        fVar.f152459i = 2;
                                                        fVar.f152453c = str7;
                                                        e eVar8 = this.f152367b;
                                                        if (eVar8 != null) {
                                                            eVar8.a(fVar);
                                                            com.ss.ttvideoengine.s.j.a("DataLoaderHelper", " task progress. cache end. key = ".concat(String.valueOf(str6)));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                gVar = this.f152372g;
                                            } else {
                                                dVar = this.B.b(str6);
                                                if (dVar == null) {
                                                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "[preload] play temItem == null return " + aVMDLDataLoaderNotifyInfo.logInfo);
                                                    return;
                                                }
                                                gVar = this.B;
                                            }
                                            C4065d.b a2 = dVar.a(str6);
                                            if (a2 != null) {
                                                a2.f152432k = longValue2;
                                                a2.f152433l = longValue;
                                                a2.f152434m = str7;
                                            }
                                            if (TextUtils.isEmpty(dVar.f152401a)) {
                                                str4 = str6;
                                            } else {
                                                str4 = dVar.f152401a;
                                            }
                                            e a3 = a.C4071a.f153059a.a(str4);
                                            if (a3 == null) {
                                                a3 = new e();
                                            }
                                            a3.f152435a = dVar.f152401a;
                                            if (z2) {
                                                i3 = 2;
                                            } else {
                                                i3 = 1;
                                            }
                                            a3.f152436b = i3;
                                            a3.a(dVar);
                                            if (!(longValue2 != longValue || a2 == null || a2.f152426e == null)) {
                                                StringBuilder sb = new StringBuilder("[preload] ");
                                                if (a2.f152426e.a() == q.f152977b) {
                                                    str5 = "Audio";
                                                } else {
                                                    str5 = "Video";
                                                }
                                                com.ss.ttvideoengine.s.j.a("DataLoaderHelper", sb.append(str5).append(" cache complete key: ").append(str6).toString());
                                            }
                                            e eVar9 = this.f152367b;
                                            if (eVar9 != null) {
                                                eVar9.a(a3);
                                            }
                                            a.C4071a.f153059a.a(str4, a3);
                                            if (a3.c() || ((z2 && a3.b()) || aVMDLDataLoaderNotifyInfo.what == 4)) {
                                                gVar.d(str6);
                                                a.C4071a.f153059a.b(str4);
                                                if (!z2) {
                                                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "[preload] notify vid cache end key: ".concat(String.valueOf(str4)));
                                                    c(dVar);
                                                }
                                                f fVar2 = new f();
                                                fVar2.f152455e = longValue;
                                                fVar2.f152454d = longValue2;
                                                fVar2.f152451a = str6;
                                                fVar2.f152453c = str7;
                                                fVar2.f152456f = a2.f152424c;
                                                fVar2.f152457g = a2.f152425d;
                                                fVar2.f152458h = a2.f152426e;
                                                fVar2.f152452b = dVar.f152401a;
                                                fVar2.f152459i = a3.f152436b;
                                                if (dVar.c() != null && z2) {
                                                    p pVar6 = new p(2);
                                                    pVar6.f153147c = fVar2;
                                                    pVar6.f153148d = a3;
                                                    dVar.c().a(pVar6);
                                                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "[preload] notify end cache size = " + a3.a());
                                                }
                                                e eVar10 = this.f152367b;
                                                if (eVar10 != null) {
                                                    eVar10.a(fVar2);
                                                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", " task progress. cache end. key = " + str6 + ", rawKey = " + str4);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "[preload] mediaSize <= 0 return " + aVMDLDataLoaderNotifyInfo.logInfo);
                                        return;
                                    } catch (Exception unused) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            e eVar11 = this.f152367b;
                            if (eVar11 != null) {
                                eVar11.a(20, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                                return;
                            }
                            return;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            try {
                                JSONObject a4 = com.ss.ttvideoengine.s.a.a(aVMDLDataLoaderNotifyInfo.jsonLog);
                                if (a4 != null) {
                                    e eVar12 = this.f152367b;
                                    if (eVar12 != null) {
                                        eVar12.a(a4);
                                    }
                                    com.ss.ttvideoengine.s.j.b("avmdlcdnlog", "receive log:".concat(String.valueOf(a4)));
                                    return;
                                }
                                return;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                return;
                            }
                        default:
                            switch (i4) {
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                    if (this.f152367b != null && aVMDLDataLoaderNotifyInfo.jsonLog != null) {
                                        this.f152367b.a(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                        return;
                                    }
                                    return;
                                case ABRConfig.ABR_SELECT_SCENE:
                                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "MDL Alog: " + aVMDLDataLoaderNotifyInfo.logInfo);
                                    return;
                                case 15:
                                    p pVar7 = this.o;
                                    if (pVar7 != null) {
                                        pVar7.a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                        return;
                                    } else if (this.f152367b != null && aVMDLDataLoaderNotifyInfo.jsonLog != null) {
                                        this.f152367b.a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                        return;
                                    } else {
                                        return;
                                    }
                                case 16:
                                    e eVar13 = this.f152367b;
                                    if (eVar13 != null) {
                                        eVar13.a(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                        return;
                                    }
                                    return;
                                default:
                                    switch (i4) {
                                        case 19:
                                            p pVar8 = this.o;
                                            if (pVar8 != null) {
                                                pVar8.a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                return;
                                            }
                                            e eVar14 = this.f152367b;
                                            if (eVar14 != null) {
                                                eVar14.a(7, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                return;
                                            }
                                            return;
                                        case v.U:
                                            break;
                                        case 21:
                                            if (aVMDLDataLoaderNotifyInfo.logInfo != null) {
                                                com.ss.ttvideoengine.e.d.f152491a.a(aVMDLDataLoaderNotifyInfo.logInfo);
                                                return;
                                            }
                                            return;
                                        case 22:
                                            if (aVMDLDataLoaderNotifyInfo.logInfo != null) {
                                                String str8 = aVMDLDataLoaderNotifyInfo.logInfo;
                                                com.ss.ttvideoengine.e.d dVar2 = com.ss.ttvideoengine.e.d.f152491a;
                                                if (!TextUtils.isEmpty(str8) && dVar2.f152500j != null) {
                                                    dVar2.f152500j.sendMessage(Message.obtain(dVar2.f152500j, 2, str8));
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            switch (i4) {
                                                case 1000:
                                                case 1001:
                                                case 1002:
                                                case 1003:
                                                    p pVar9 = this.o;
                                                    if (pVar9 != null) {
                                                        pVar9.a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                        return;
                                                    }
                                                    e eVar15 = this.f152367b;
                                                    if (eVar15 != null) {
                                                        eVar15.a(10, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    return;
                                            }
                                    }
                            }
                    }
                } else {
                    com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "KeyIsFileDeleteSizeByUsedTime size: " + aVMDLDataLoaderNotifyInfo.code);
                    e eVar16 = this.f152367b;
                    if (eVar16 != null) {
                        eVar16.a(31, 0, aVMDLDataLoaderNotifyInfo.code, null);
                        return;
                    }
                    return;
                }
            }
            String str9 = "kTTVideoErrorDomainDataLoaderPreload";
            if (aVMDLDataLoaderNotifyInfo.logInfo != null && aVMDLDataLoaderNotifyInfo.parameter == 3) {
                String str10 = aVMDLDataLoaderNotifyInfo.logInfo;
                long j2 = aVMDLDataLoaderNotifyInfo.code;
                com.ss.ttvideoengine.e.d dVar3 = com.ss.ttvideoengine.e.d.f152491a;
                int i5 = (int) j2;
                long j3 = aVMDLDataLoaderNotifyInfo.parameter;
                if (i5 != -5000) {
                    if (i5 == -4000) {
                        str3 = "request invalid.";
                    } else if (i5 == -2000) {
                        str3 = "media data content length invalid";
                    } else if (i5 == -3001) {
                        i2 = -9944;
                        str3 = "server invalid. response status code >= 500";
                    } else if (i5 != -3000) {
                        switch (i5) {
                            case -1002:
                                str3 = "Waiting for too many tasks, > 20";
                                break;
                            case -1001:
                                str3 = "add the same key task.";
                                break;
                            case -1000:
                                str3 = "create preload task fail.";
                                break;
                            default:
                                str3 = "task fail. reply task error.";
                                break;
                        }
                    } else {
                        if (!com.ss.ttvideoengine.k.h.b(this.f152377l)) {
                            i2 = -9960;
                        } else {
                            i2 = -9945;
                        }
                        str3 = "url invalid. response status code >= 400";
                    }
                    i2 = i5;
                } else {
                    i2 = -9948;
                    str3 = "write file fail.";
                }
                if (j3 == 3) {
                    str9 = "kTTVideoErrorDomainDownload";
                }
                com.ss.ttvideoengine.s.c cVar = new com.ss.ttvideoengine.s.c(str9, i2, i5, "key = " + str10 + ", reason = " + str3);
                if (!TextUtils.isEmpty(str10) && dVar3.f152500j != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str10);
                    arrayList.add(cVar);
                    dVar3.f152500j.sendMessage(Message.obtain(dVar3.f152500j, 1, arrayList));
                }
            } else if (aVMDLDataLoaderNotifyInfo.logInfo != null) {
                com.ss.ttvideoengine.s.j.a("DataLoaderHelper", " task fail log = " + aVMDLDataLoaderNotifyInfo.logInfo + ", code = " + aVMDLDataLoaderNotifyInfo.code + ", task type = " + aVMDLDataLoaderNotifyInfo.parameter);
                String[] split2 = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
                if (split2.length > 0 && (b2 = this.f152372g.b((str = split2[0]))) != null) {
                    g gVar2 = this.f152372g;
                    com.ss.ttvideoengine.s.c cVar2 = new com.ss.ttvideoengine.s.c(str9, (int) aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.logInfo);
                    if (TextUtils.isEmpty(b2.f152401a)) {
                        str2 = str;
                    } else {
                        str2 = b2.f152401a;
                    }
                    e a5 = a.C4071a.f153059a.a(str2);
                    if (a5 == null) {
                        a5 = new e();
                    }
                    a5.f152435a = b2.f152401a;
                    a5.f152436b = (int) aVMDLDataLoaderNotifyInfo.parameter;
                    a5.a(b2);
                    e.a a6 = a5.a(str);
                    if (a6 != null) {
                        a6.f152446g = cVar2;
                    }
                    e eVar17 = this.f152367b;
                    if (eVar17 != null) {
                        eVar17.a(a5);
                    }
                    a.C4071a.f153059a.a(str2, a5);
                    if (a5.c() || a5.b()) {
                        gVar2.d(str);
                        com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "pop all task item. videoId = " + b2.f152401a + " key = " + str);
                        a.C4071a.f153059a.b(str2);
                        if (this.f152367b != null) {
                            f fVar3 = new f();
                            fVar3.f152459i = (int) aVMDLDataLoaderNotifyInfo.parameter;
                            fVar3.f152452b = b2.f152401a;
                            fVar3.f152451a = str;
                            if (!(b2.o == null || b2.o.f153207b == null)) {
                                fVar3.f152453c = b2.o.f153207b;
                                fVar3.f152451a = null;
                            }
                            this.f152367b.a(fVar3);
                        }
                        if (b2.c() != null && aVMDLDataLoaderNotifyInfo.parameter == 2) {
                            p pVar10 = new p(3);
                            pVar10.f153149e = cVar2;
                            pVar10.f153148d = a5;
                            pVar10.f153147c = null;
                            b2.c().a(pVar10);
                        }
                    }
                }
            }
        }
    }

    class i implements ISelectBitrateListener {

        /* renamed from: b  reason: collision with root package name */
        private com.ss.ttvideoengine.q.a f152467b;

        static {
            Covode.recordClassIndex(101543);
        }

        i(com.ss.ttvideoengine.q.a aVar) {
            this.f152467b = aVar;
        }

        @Override // com.bytedance.vcloud.strategy.ISelectBitrateListener
        public final String selectBitrateJsonString(String str, int i2) {
            Map<String, Integer> a2;
            com.ss.ttvideoengine.q.a aVar = this.f152467b;
            if (aVar == null || (a2 = aVar.a()) == null) {
                return null;
            }
            return new JSONObject(a2).toString();
        }
    }

    private void a(int i2, int i3) {
        this.r.lock();
        com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "setIntValue key = " + i2 + ", value = " + i3);
        boolean z2 = true;
        if (i2 == 1) {
            this.f152376k.mMaxCacheSize = i3;
        } else if (i2 == 2) {
            this.f152376k.mRWTimeOut = i3;
        } else if (i2 == 3) {
            this.f152376k.mOpenTimeOut = i3;
        } else if (i2 == 4) {
            this.f152376k.mTryCount = i3;
        } else if (i2 == 5) {
            this.f152376k.mLoaderType = i3;
        } else if (i2 == 7) {
            this.f152376k.mEnableExternDNS = i3;
        } else if (i2 == 8) {
            this.f152376k.mEnableSocketReuse = i3;
        } else if (i2 == 9) {
            this.f152376k.mSocketIdleTimeOut = i3;
        } else if (i2 == 55) {
            this.f152376k.mMaxCacheAge = i3;
        } else if (i2 == 56) {
            this.f152376k.mEnableMaxCacheAgeForAllDir = i3;
        } else if (i2 == 60) {
            this.f152376k.mEnablePreloadReUse = i3;
        } else if (i2 == 61) {
            this.s = i3;
        } else if (i2 == 109) {
            b.a.f152363a.f152361l = i3;
        } else if (i2 == 110) {
            b.a.f152363a.p = i3;
        } else if (i2 == 112) {
            this.f152376k.mSpeedSampleInterval = i3;
        } else if (i2 != 113) {
            switch (i2) {
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    this.f152376k.mPreloadParallelNum = i3;
                    AVMDLDataLoader aVMDLDataLoader = this.f152375j;
                    if (aVMDLDataLoader != null) {
                        aVMDLDataLoader.setIntValue(102, i3);
                        break;
                    }
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    if (i3 >= 100) {
                        this.z = this.f152376k.mPreloadStrategy;
                        this.f152376k.mPreloadStrategy = 100;
                    } else {
                        this.z = this.f152376k.mPreloadStrategy;
                        this.f152376k.mPreloadStrategy = i3;
                    }
                    this.y = i3;
                    if (i3 == 200) {
                        this.f152376k.mEnableIOManager = 1;
                        break;
                    }
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    this.f152376k.mCheckSumLevel = i3;
                    break;
                case ABRConfig.ABR_SELECT_SCENE:
                    this.f152376k.mTestSpeedTypeVersion = i3;
                    break;
                case 15:
                    this.F = i3;
                    break;
                case 16:
                    this.f152376k.mLoaderFactoryP2PLevel = i3;
                    break;
                case 17:
                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "set write file notify intervalMS ".concat(String.valueOf(i3)));
                    this.f152376k.mWriteFileNotifyIntervalMS = i3;
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    this.N = i3;
                    break;
                case 19:
                    this.P = i3;
                    break;
                case v.U:
                    this.Q = i3;
                    break;
                case 21:
                    this.f152376k.mEnableDownloaderLog = i3;
                    break;
                case 22:
                    this.f152376k.mEnableTTNetLoader = i3;
                    break;
                case 23:
                    this.f152376k.mTTNetLoaderCronetBufSizeKB = i3;
                    break;
                case 30:
                    this.f152376k.mEncryptVersion = i3;
                    break;
                case 50:
                    this.f152376k.mIsCloseFileCache = i3;
                    break;
                case 80:
                    this.f152376k.mPreloadWaitListType = i3;
                    break;
                case 119:
                    com.ss.ttvideoengine.o.a.a().a(i3);
                    break;
                case 121:
                    this.f152376k.mUseNewSpeedTestForSingle = i3;
                    break;
                case 200:
                    this.f152376k.mEnableEventInfo = i3;
                    break;
                case 500:
                    this.f152376k.mLiveP2pAllow = i3;
                    break;
                case 501:
                    this.f152376k.mLiveLoaderType = i3;
                    break;
                case 502:
                    this.f152376k.mLiveLoaderEnable = i3;
                    break;
                case 505:
                    this.f152376k.mLiveWatchDurationThreshold = i3;
                    break;
                case 506:
                    this.f152376k.mLiveCacheThresholdHttpToP2p = i3;
                    break;
                case 507:
                    this.f152376k.mLiveCacheThresholdP2pToHttp = i3;
                    break;
                case 508:
                    this.f152376k.mLiveMaxTrySwitchP2pTimes = i3;
                    break;
                case 509:
                    this.f152376k.mLiveWaitP2pReadyThreshold = i3;
                    break;
                case 510:
                    this.f152376k.mLiveMobileUploadAllow = i3;
                    break;
                case 511:
                    this.f152376k.mLiveMobileDownloadAllow = i3;
                    break;
                case 512:
                    this.f152376k.mAlogEnable = i3;
                    AVMDLDataLoader aVMDLDataLoader2 = this.f152375j;
                    if (aVMDLDataLoader2 != null) {
                        aVMDLDataLoader2.setIntValue(7225, i3);
                        break;
                    }
                    break;
                case 513:
                    this.f152376k.mLiveRecvDataTimeout = i3;
                    break;
                case 1000:
                    if (this.J == 1) {
                        g();
                        AVMDLDataLoader aVMDLDataLoader3 = this.f152375j;
                        if (aVMDLDataLoader3 != null) {
                            aVMDLDataLoader3.setIntValue(7217, 1);
                            break;
                        }
                    }
                    break;
                case 1001:
                    this.f152376k.mEnablePreconnect = i3;
                    break;
                case 1002:
                    this.f152376k.mPreconnectNum = i3;
                    break;
                case 1004:
                    if (i3 == 0) {
                        z2 = false;
                    }
                    this.q = z2;
                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "setIntValue: mInvalidMdlProcotol: " + this.q);
                    break;
                case 1005:
                    if (i3 != 1) {
                        z2 = false;
                    }
                    this.H = z2;
                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "config DATALOADER_KEY_SET_MDL_PROTOCOL_ENABLE: " + this.H);
                    break;
                case 1006:
                    this.f152376k.mRingBufferSizeKB = i3;
                    break;
                case 1007:
                    this.f152376k.mEnableFileCacheV2 = i3;
                    break;
                case 1009:
                    this.f152376k.mEnableFileRingBuffer = i3;
                    break;
                case 1010:
                    this.f152376k.mEnableUseFileExtendLoaderBuffer = i3;
                    break;
                case 1011:
                    this.J = i3;
                    break;
                case 1100:
                    this.I = i3;
                    break;
                case 1101:
                    this.f152376k.mEnableLoaderPreempt = i3;
                    break;
                case 1102:
                    this.f152376k.mAccessCheckLevel = i3;
                    break;
                case 1103:
                    this.f152376k.mNextDownloadThreshold = i3;
                    break;
                case 1104:
                    AVMDLDataLoader aVMDLDataLoader4 = this.f152375j;
                    if (aVMDLDataLoader4 != null) {
                        aVMDLDataLoader4.setIntValue(7219, i3);
                        break;
                    }
                    break;
                case 1105:
                    this.f152376k.mSocketSendBufferKB = i3;
                    break;
                case 1108:
                    this.f152376k.mEnableSyncDnsForPcdn = i3;
                    break;
                case 1109:
                    AVMDLDataLoader aVMDLDataLoader5 = this.f152375j;
                    if (aVMDLDataLoader5 != null) {
                        aVMDLDataLoader5.setIntValue(7227, i3);
                        break;
                    }
                    break;
                case 1110:
                    this.f152376k.mXYLibValue = i3;
                    break;
                case 1111:
                    this.f152376k.mCheckPreloadLevel = i3;
                    break;
                case 1112:
                    this.L = i3;
                    break;
                case 1113:
                    if (i3 == 0) {
                        z2 = false;
                    }
                    this.M = z2;
                    break;
                case 1115:
                    this.f152376k.mMaxIPV6Num = i3;
                    break;
                case 1116:
                    this.f152376k.mMaxIPV4Num = i3;
                    break;
                case 1117:
                    this.f152376k.mForbidByPassCookie = i3;
                    break;
                case 1118:
                    this.f152376k.mEnableLazyBufferpool = i3;
                    break;
                case 1119:
                    this.f152376k.mSessionTimeout = i3;
                    break;
                case 1120:
                    this.f152376k.mEnableNewBufferpool = i3;
                    break;
                case 1121:
                    this.f152376k.mNewBufferPoolBlockSize = i3;
                    break;
                case 1122:
                    this.f152376k.mNewBufferPoolResidentSize = i3;
                    break;
                case 1123:
                    this.f152376k.mNewBufferPoolGrowBlockCount = i3;
                    break;
                case 1124:
                    this.f152376k.mEnablePlayInfoCache = i3;
                    break;
                case 1125:
                    this.f152376k.mControlCDNRangeType = i3;
                    break;
                case 1126:
                    this.f152376k.mEnableP2PPreDown = i3;
                    break;
                case 1127:
                    this.f152376k.mEnablePlayLog = i3;
                    break;
                case 1128:
                    this.f152376k.mEnableNetScheduler = i3;
                    break;
                case 1129:
                    this.f152376k.mNetSchedulerBlockAllNetErr = i3;
                    break;
                case 1130:
                    this.f152376k.mNetSchedulerBlockErrCount = i3;
                    break;
                case 1131:
                    this.f152376k.mNetSChedulerBlockDurationMs = i3;
                    break;
                case 1132:
                    this.f152376k.mFirstRangeLeftThreshold = i3;
                    break;
                case 1133:
                    this.f152376k.mIsAllowTryTheLastUrl = i3;
                    break;
                case 1134:
                    this.f152376k.mEnableCacheReqRange = i3;
                    break;
                case 1135:
                    this.f152376k.mEnableLoaderSeek = i3;
                    break;
                case 1136:
                    this.f152376k.mP2PPreDownPeerCount = i3;
                    break;
                case 1137:
                    this.f152376k.mEnableDynamicTimeout = i3;
                    break;
                case 1138:
                    this.f152376k.mSocketInitialTimeout = i3;
                    break;
                case 1139:
                    this.f152376k.mMaxSocketReuseCount = i3;
                    break;
                case 1140:
                    AVMDLDNSParser.setIntValue(10, i3);
                    break;
                case 1141:
                    AVMDLDNSParser.setIntValue(2, i3);
                    break;
                case 1143:
                    this.f152376k.mP2PFirstRangeLoaderType = i3;
                    break;
                case 1145:
                    this.f152376k.mMaxAliveHostNum = i3;
                    break;
                case 1146:
                    this.f152376k.mFileExtendSizeKB = i3;
                    break;
                case 1147:
                    this.f152376k.mMinAllowSpeed = i3;
                    break;
                case 1148:
                    this.f152376k.mNetSchedulerBlockHostIpErrCount = i3;
                    break;
                case 1150:
                    this.f152376k.mEnableIOManager = i3;
                    break;
                case 1151:
                    this.f152376k.mEnableOwnVDPPreloadNotify = i3;
                    break;
                case 1154:
                    this.W = i3;
                    break;
                case 1155:
                    this.Z = i3;
                    break;
                case 1156:
                    if (i3 > 0) {
                        this.aa.f153074a = (long) i3;
                        break;
                    }
                    break;
                case 1157:
                    if (i3 > 0) {
                        this.aa.f153075b = (long) i3;
                        break;
                    }
                    break;
                case 1158:
                    this.f152376k.mMaxFileMemCacheSize = i3;
                    break;
                case 1159:
                    this.f152376k.mMaxFileMemCacheNum = i3;
                    break;
                case 1160:
                    if (i3 >= 0) {
                        this.f152376k.mEnableEarlyData = i3;
                        break;
                    }
                    break;
                case 1161:
                    if (i3 > 0) {
                        this.f152376k.mSocketRecvBufferSize = i3;
                        break;
                    }
                    break;
                case 1162:
                    if (i3 > 0) {
                        this.f152376k.mEnableSpeedPredict = i3;
                        break;
                    }
                    break;
                case 1163:
                    this.X = i3;
                    break;
                case 1164:
                    this.f152376k.mEnableUseOriginalUrl = i3;
                    break;
                case 1166:
                    this.f152376k.mEnableLoaderLogExtractUrls = i3;
                    break;
                case 1167:
                    this.f152376k.mMaxLoaderLogNum = i3;
                    break;
                case 1168:
                    this.f152376k.mCheckContentTypeMethod = i3;
                    break;
                case 1169:
                    this.f152376k.mCloseThreadPool = i3;
                    break;
                case 1170:
                    this.Y = i3;
                    break;
                case 1501:
                    this.f152376k.mEnableCellularUp = i3;
                    break;
                case LiveNetAdaptiveHurryTimeSetting.DEFAULT:
                    this.f152376k.mEnableStorageModule = i3;
                    break;
                case 2001:
                    this.f152376k.mStoPlayDldWinSizeKBNM = i3;
                    break;
                case 2002:
                    this.f152376k.mStoPlayDldWinSizeKBLS = i3;
                    break;
                case 2003:
                    this.f152376k.mStoRingBufferSizeKB = i3;
                    break;
                case 2004:
                    this.f152376k.mStoIoWriteLimitKBTh1 = i3;
                    break;
                case 2005:
                    this.f152376k.mStoIoWriteLimitKBTh2 = i3;
                    break;
                case 2006:
                    this.f152376k.mStoMaxIdleTimeSec = i3;
                    break;
                case 2100:
                    if (i3 >= 0) {
                        this.f152376k.mEnableP2pUpload = i3;
                        break;
                    }
                    break;
                case 2102:
                    if (i3 >= 0) {
                        this.f152376k.mDevDiskSizeMB = i3;
                        break;
                    }
                    break;
                case 2104:
                    if (i3 >= 0) {
                        this.f152376k.mDevMemorySizeMB = i3;
                        break;
                    }
                    break;
                case 9000:
                    this.K = i3;
                    break;
                case 9001:
                    this.f152376k.mIgnorePlayInfo = i3;
                    break;
                case 9008:
                    this.T = i3;
                    break;
                default:
                    switch (i2) {
                        case 63:
                            this.f152376k.mMaxIpCountEachDomain = i3;
                            break;
                        case 64:
                            this.f152376k.mEnableIpBucket = i3;
                            break;
                        case 65:
                            this.f152376k.mErrorStateTrustTime = i3;
                            break;
                        case 66:
                            this.f152376k.mOnlyUseCdn = i3;
                            break;
                        default:
                            switch (i2) {
                                case 90:
                                    this.f152376k.mDNSMainType = i3;
                                    AVMDLDNSParser.setIntValue(0, i3);
                                    break;
                                case 91:
                                    this.f152376k.mDNSBackType = i3;
                                    AVMDLDNSParser.setIntValue(1, i3);
                                    break;
                                case 92:
                                    this.f152376k.mMainToBackUpDelayedTime = i3;
                                    AVMDLDNSParser.setIntValue(3, i3);
                                    break;
                                case 93:
                                    this.f152376k.mEnableBenchMarkIOSpeed = i3;
                                    break;
                                case 94:
                                    this.f152376k.mSpeedCoefficientValue = i3;
                                    break;
                                case 95:
                                    b.a.f152363a.f152362m = i3;
                                    break;
                                case 96:
                                    b.a.f152363a.f152358i = i3;
                                    break;
                                case 97:
                                    b.a.f152363a.f152359j = i3;
                                    break;
                                case 98:
                                    b.a.f152363a.f152360k = i3;
                                    break;
                                case 99:
                                    b.a.f152363a.n = i3;
                                    break;
                                case com.bytedance.nita.c.a.f41622a:
                                    this.f152376k.mMaxTlsVersion = i3;
                                    break;
                                case 101:
                                    this.f152376k.mEnableSessionReuse = i3;
                                    break;
                                default:
                                    switch (i2) {
                                        case 103:
                                            AVMDLDNSParser.setIntValue(4, i3);
                                            break;
                                        case 104:
                                            AVMDLDNSParser.setIntValue(5, i3);
                                            break;
                                        case 105:
                                            try {
                                                AVMDLDNSParser.setIntValue(6, i3);
                                                break;
                                            } catch (Exception e2) {
                                                e2.printStackTrace();
                                                break;
                                            } catch (Throwable th) {
                                                this.r.unlock();
                                                throw th;
                                            }
                                        case 106:
                                            AVMDLDNSParser.setIntValue(7, 1);
                                            break;
                                    }
                            }
                    }
            }
        } else {
            this.f152376k.mGlobalSpeedSampleInterval = i3;
            AVMDLDataLoader aVMDLDataLoader6 = this.f152375j;
            if (aVMDLDataLoader6 != null) {
                aVMDLDataLoader6.setIntValue(7370, i3);
            }
        }
        this.r.unlock();
    }

    private static String a(String str, String str2, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String h2 = com.ss.ttvideoengine.s.i.h(str);
        if (TextUtils.isEmpty(h2)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        String h3 = com.ss.ttvideoengine.s.i.h(str2);
        if (!TextUtils.isEmpty(h3)) {
            str = h3;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("?rk=");
        stringBuffer.append(str);
        stringBuffer.append("&k=");
        stringBuffer.append(h2);
        stringBuffer.append("&pv=");
        stringBuffer.append(1);
        if (i2 > 0) {
            stringBuffer.append("&l=");
            stringBuffer.append(i2);
        }
        return stringBuffer.toString();
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getStringValue(int i2, long j2, String str) {
        String str2 = str;
        com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "[preload] getStringValue, key = ".concat(String.valueOf(str2)));
        String str3 = null;
        if (i2 == 1506) {
            g gVar = this.f152372g;
            C4065d b2 = gVar != null ? gVar.b(str2) : null;
            com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "[preload] getStringValue, key = ".concat(String.valueOf(str2)));
            if (!(b2 == null || b2.o == null || b2.o.f153214i == null)) {
                String c2 = b2.o.f153214i.c();
                String[] a2 = b2.o.f153214i.a();
                C4065d.b a3 = b2.a(str2);
                long b3 = b2.o.f153214i.b();
                String d2 = b2.o.f153214i.d();
                if (b2.r != null) {
                    str3 = "tag=" + com.ss.ttvideoengine.s.i.h(b2.r);
                }
                str3 = a(c2, c2, a3.f152430i, b3, a2, d2, str3, false, (String) null);
                if (!TextUtils.isEmpty(c2)) {
                    str2 = c2;
                }
                a3.f152422a = str2;
                com.ss.ttvideoengine.s.j.a("DataLoaderHelper", com.a.a("[preload] get proxxy url from url: %s", new Object[]{str3}));
            }
        } else if (i2 == 1509 && this.f152367b != null && !TextUtils.isEmpty(str2)) {
            HashMap<String, String> a4 = this.f152367b.a();
            if (a4 == null || a4.size() == 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (String str4 : a4.keySet()) {
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(a4.get(str4))) {
                    sb.append(str4).append(": ").append(a4.get(str4)).append("\r\n");
                }
            }
            com.ss.ttvideoengine.s.j.a("DataLoaderHelper", com.a.a("[customheader] get custom header:%s url: %s", new Object[]{str2, sb.toString()}));
            return sb.toString();
        }
        return str3;
    }

    private String a(String str, String str2, long j2, long j3, String[] strArr, String str3, String str4, boolean z2, String str5) {
        return a(str, str2, j2, j3, strArr, str3, str4, 0, (String) null, z2, str5, 0);
    }

    private String a(String str, String str2, long j2, String[] strArr, String str3, String str4, int i2, String str5, boolean z2) {
        return a(str, str2, j2, 0, strArr, str3, str4, i2, str5, z2, (String) null, 0);
    }

    private String a(String str, String str2, long j2, long j3, String[] strArr, String str3, String str4, int i2, String str5, boolean z2, String str6, int i3) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        if (j3 <= 0) {
            j3 = 0;
        }
        for (String str7 : strArr2) {
            if (!n(str7)) {
                return null;
            }
        }
        String[] b2 = b(strArr2);
        String h2 = com.ss.ttvideoengine.s.i.h(str);
        if (TextUtils.isEmpty(h2)) {
            return null;
        }
        TextUtils.isEmpty(str2);
        String[] a2 = a(b2);
        com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "preloadProxyQuery: key = " + str + ", rawKey = " + str2);
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        String h3 = com.ss.ttvideoengine.s.i.h(str);
        if (TextUtils.isEmpty(h3)) {
            h3 = "videoId";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("?rk=");
        stringBuffer.append(h3);
        stringBuffer.append("&k=");
        stringBuffer.append(h2);
        if (j3 > 0) {
            stringBuffer.append("&s=");
            stringBuffer.append(j2 + j3);
        }
        if (i2 > 0) {
            stringBuffer.append("&l=");
            stringBuffer.append(i2);
        }
        if (!TextUtils.isEmpty(str3)) {
            String h4 = com.ss.ttvideoengine.s.i.h(str3);
            if (!TextUtils.isEmpty(h4)) {
                stringBuffer.append("&p=");
                stringBuffer.append(h4);
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            String h5 = com.ss.ttvideoengine.s.i.h(str5);
            if (!TextUtils.isEmpty(h5)) {
                stringBuffer.append("&h=");
                stringBuffer.append(h5);
            }
        }
        if (z2) {
            stringBuffer.append("&ft=1");
        }
        if (i3 > 0) {
            stringBuffer.append("&ev=".concat(String.valueOf(i3)));
        }
        if (!TextUtils.isEmpty(str6)) {
            String h6 = com.ss.ttvideoengine.s.i.h(str6);
            if (!TextUtils.isEmpty(h6)) {
                stringBuffer.append("&dtk=");
                stringBuffer.append(h6);
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i4 = 0; i4 < a2.length; i4++) {
            String i5 = com.ss.ttvideoengine.s.i.i(a2[i4]);
            StringBuffer stringBuffer3 = new StringBuffer();
            if (!TextUtils.isEmpty(i5)) {
                stringBuffer3.append("&u");
                stringBuffer3.append(i4);
                stringBuffer3.append("=");
                stringBuffer3.append(i5);
            }
            if (stringBuffer.length() + stringBuffer2.length() + stringBuffer3.length() + 32 > 3096) {
                break;
            }
            stringBuffer2.append(stringBuffer3);
        }
        if (stringBuffer2.length() <= 0) {
            return null;
        }
        stringBuffer.append(stringBuffer2);
        if (!TextUtils.isEmpty(str4) && stringBuffer.length() + str4.length() + 33 <= 3096) {
            stringBuffer.append("&");
            stringBuffer.append(str4);
        }
        return stringBuffer.toString();
    }
}
