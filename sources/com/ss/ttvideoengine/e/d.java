package com.ss.ttvideoengine.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.d.c;
import com.ss.ttvideoengine.s.i;
import com.ss.ttvideoengine.s.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f152491a = new d();

    /* renamed from: b  reason: collision with root package name */
    public f f152492b;

    /* renamed from: c  reason: collision with root package name */
    public long f152493c;

    /* renamed from: d  reason: collision with root package name */
    public long f152494d;

    /* renamed from: e  reason: collision with root package name */
    public long f152495e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<a> f152496f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<a> f152497g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<Long> f152498h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f152499i;

    /* renamed from: j  reason: collision with root package name */
    public Handler f152500j;

    /* renamed from: k  reason: collision with root package name */
    public Context f152501k;

    /* renamed from: l  reason: collision with root package name */
    public c f152502l;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<a> f152503m;
    private ArrayList<a> n;
    private b o;

    static {
        Covode.recordClassIndex(101560);
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        HandlerThread f152507a;

        /* renamed from: b  reason: collision with root package name */
        Handler f152508b;

        static {
            Covode.recordClassIndex(101562);
        }

        public b() {
            try {
                HandlerThread handlerThread = new HandlerThread("vclould.engine.download.tasks");
                this.f152507a = handlerThread;
                handlerThread.start();
                this.f152508b = new Handler(this.f152507a.getLooper()) {
                    /* class com.ss.ttvideoengine.e.d.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(101563);
                    }

                    public final void handleMessage(Message message) {
                        a aVar;
                        if (message != null) {
                            try {
                                if (!(message.obj instanceof ArrayList)) {
                                    j.b("TTVideoEngine.Downloader", "[downloader] obj should instance of ArrayList");
                                    return;
                                }
                                ArrayList arrayList = (ArrayList) message.obj;
                                if (arrayList == null) {
                                    j.b("TTVideoEngine.Downloader", "[downloader] obj should instance of ArrayList");
                                    return;
                                }
                                d dVar = (d) arrayList.get(0);
                                int i2 = message.what;
                                if (i2 == 10) {
                                    dVar.f152502l = new c(dVar.f152501k, "TTVideoEngine_download_database_v01");
                                    if (dVar.f152502l != null && dVar.f152502l.f152395a) {
                                        j.b("TTVideoEngine.Downloader", "[downloader] open db success");
                                        dVar.f152497g = dVar.a();
                                        if (dVar.f152500j != null) {
                                            dVar.f152500j.sendMessage(Message.obtain(dVar.f152500j, 4));
                                        }
                                    } else if (dVar.f152500j != null) {
                                        dVar.f152500j.sendMessage(Message.obtain(dVar.f152500j, 5));
                                    }
                                } else if (i2 == 11 && arrayList.size() == 2 && (aVar = (a) arrayList.get(1)) != null) {
                                    dVar.a(aVar.f152504a, aVar.f152505b);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                };
            } catch (Throwable unused) {
                this.f152507a = null;
                this.f152508b = null;
            }
        }
    }

    private d() {
        this.f152494d = 1073741824;
        this.o = new b();
        this.f152495e = -1;
        this.f152496f = new ArrayList<>();
        this.f152498h = new ArrayList<>();
        this.f152503m = new ArrayList<>();
        this.n = new ArrayList<>();
        this.f152493c = 1;
        this.f152494d = 1073741824;
        this.f152499i = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x015e A[Catch:{ all -> 0x016d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<com.ss.ttvideoengine.e.a> a() {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.e.d.a():java.util.ArrayList");
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        a f152504a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<a> f152505b;

        static {
            Covode.recordClassIndex(101561);
        }

        private a() {
        }

        /* synthetic */ a(d dVar, byte b2) {
            this();
        }
    }

    public final void a(String str) {
        Handler handler;
        if (!TextUtils.isEmpty(str) && (handler = this.f152500j) != null) {
            handler.sendMessage(Message.obtain(handler, 0, str));
        }
    }

    private static String a(ArrayList<Long> arrayList) {
        StringBuilder sb = new StringBuilder(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append(arrayList.get(i2));
            if (i2 < arrayList.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private static ArrayList<String> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split == null || split.length <= 0) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str2 : split) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(str2);
                    }
                } catch (Throwable unused) {
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(a aVar) {
        this.f152496f.remove(aVar);
        this.f152498h.remove(Long.valueOf(aVar.f152474b));
        this.f152503m.remove(aVar);
        aVar.a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainDownload", -9995, 0, "task info: " + aVar.toString()));
    }

    /* access modifiers changed from: package-private */
    public final void b(a aVar) {
        if (!this.n.contains(aVar)) {
            this.n.add(aVar);
        }
        if (this.f152503m.contains(aVar)) {
            j.a("TTVideoEngine.Downloader", "[downloader] resume task. is waiting,  task = " + aVar.toString());
            this.f152503m.remove(aVar);
        }
        if (aVar.f152476d >= 1) {
            int i2 = (aVar.f152477e > 1 ? 1 : (aVar.f152477e == 1 ? 0 : -1));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(a aVar) {
        if (((long) this.n.size()) < this.f152493c || (this.n.contains(aVar) && (aVar.f152478f == 3 || aVar.f152478f == 5))) {
            long c2 = i.c(this.f152501k);
            j.a("TTVideoEngine.Downloader", "[downloader] get free size, size = " + c2 + ", limite = " + this.f152494d);
            if (c2 > this.f152494d) {
                return true;
            }
            aVar.a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainDownload", -9947, 0, "available size is less than 1073741824 M"));
            return false;
        }
        aVar.a(1);
        if (!this.f152503m.contains(aVar)) {
            this.f152503m.add(aVar);
        }
        j.b("TTVideoEngine.Downloader", "[downloader] task is waiting, task info " + aVar.toString());
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar, com.ss.ttvideoengine.s.c cVar) {
        if (!aVar.f152483k || aVar.f152484l) {
            if (cVar != null) {
                j.b("TTVideoEngine.Downloader", "[downloader] error info " + cVar.toString());
            }
            aVar.f152483k = true;
            a aVar2 = new a(this, (byte) 0);
            aVar2.f152504a = aVar;
            aVar2.f152505b = new ArrayList<>(this.f152496f);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            arrayList.add(aVar2);
            b bVar = this.o;
            if (!(bVar.f152508b == null || bVar.f152507a == null)) {
                Message obtain = Message.obtain();
                obtain.what = 11;
                obtain.obj = arrayList;
                bVar.f152508b.sendMessage(obtain);
            }
            j.b("TTVideoEngine.Downloader", "[downloader] task complete, task info = " + aVar.toString());
            if (this.n.contains(aVar)) {
                this.n.remove(aVar);
            }
            if (((long) this.n.size()) == this.f152493c) {
                j.b("TTVideoEngine.Downloader", "[downloader] running task count is " + this.n.size() + " max count is " + this.f152493c);
            } else if (this.f152503m.size() <= 0) {
                j.b("TTVideoEngine.Downloader", "[downloader] waiting task is empty");
            } else {
                a aVar3 = this.f152503m.get(0);
                this.f152503m.remove(aVar3);
                aVar3.a();
                j.b("TTVideoEngine.Downloader", "[downloader] auto resume waiting task: " + aVar3.toString());
            }
        } else {
            j.b("TTVideoEngine.Downloader", "[downloader] task did finished, info = " + aVar.toString());
        }
    }

    public final void a(a aVar, ArrayList<a> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!arrayList2.contains(Long.valueOf(next.f152474b))) {
                arrayList2.add(Long.valueOf(next.f152474b));
            }
        }
        Collections.sort(arrayList2);
        String a2 = a(arrayList2);
        this.f152502l.a("index", a2);
        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(this.f152501k, "TTVideoEngine_download_index_v01", 0).edit();
        edit.putString("index", a2);
        edit.commit();
        String jSONObject = aVar.c().toString();
        String valueOf = String.valueOf(aVar.f152474b);
        j.a("TTVideoEngine.Downloader", "[downloader] write task. key " + valueOf + " value: " + jSONObject);
        if (arrayList.contains(aVar)) {
            if (!this.f152502l.a(valueOf, jSONObject)) {
                j.e("TTVideoEngine.Downloader", "[downloader] save task fail, videoid = " + aVar.f152485m + " taskIdentifier = " + aVar.f152474b);
                aVar.a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainDownload", -9949, -1, jSONObject));
            }
        } else if (!this.f152502l.a(valueOf)) {
            j.e("TTVideoEngine.Downloader", "[downloader] remve task fail, videoid = " + aVar.f152485m + " taskIdentifier = " + aVar.f152474b);
            aVar.a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainDownload", -9949, -1, jSONObject));
        }
    }
}
