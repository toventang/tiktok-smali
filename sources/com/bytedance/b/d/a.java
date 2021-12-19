package com.bytedance.b.d;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.apm.q.u;
import com.bytedance.b.d.c;
import com.bytedance.b.k.d.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f26116a = new a();

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.b.d.a.a f26117b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f26118c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.b.k.d.a f26119d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f26120e;

    static {
        Covode.recordClassIndex(15191);
    }

    private synchronized void a() {
        if (!this.f26120e) {
            com.bytedance.b.d.a.a aVar = this.f26117b;
            if (aVar != null && aVar.f26122a && this.f26117b.f26133l) {
                if (com.bytedance.b.e.a.a.c()) {
                    this.f26120e = true;
                    this.f26119d = new com.bytedance.b.k.d.a() {
                        /* class com.bytedance.b.d.a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(15192);
                        }

                        public final void run() {
                            File file;
                            File file2;
                            File file3;
                            System.currentTimeMillis();
                            SharedPreferences a2 = d.a(com.bytedance.b.k.a.f26313g, "monitor_config", 0);
                            long j2 = 0;
                            if (a2 != null) {
                                j2 = a2.getLong("check_disk_last_time", 0);
                            }
                            if (System.currentTimeMillis() - j2 >= 86400000) {
                                c cVar = c.f26146a;
                                com.bytedance.b.d.a.a aVar = a.this.f26117b;
                                b bVar = null;
                                if (aVar != null && !cVar.f26151f) {
                                    cVar.f26155j = aVar;
                                    if (!cVar.f26154i) {
                                        cVar.f26154i = true;
                                        Application application = com.bytedance.b.k.a.f26313g;
                                        try {
                                            application.getPackageName();
                                            if (com.ss.android.ugc.aweme.lancet.d.f107195c == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                                                file = application.getFilesDir();
                                                com.ss.android.ugc.aweme.lancet.d.f107195c = file;
                                            } else {
                                                file = com.ss.android.ugc.aweme.lancet.d.f107195c;
                                            }
                                            cVar.f26147b = file.getParent();
                                            if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                                                file2 = application.getCacheDir();
                                                com.ss.android.ugc.aweme.lancet.d.f107194b = file2;
                                            } else {
                                                file2 = com.ss.android.ugc.aweme.lancet.d.f107194b;
                                            }
                                            cVar.f26148c = file2.getAbsolutePath();
                                            cVar.f26149d = c.a(application);
                                            if (com.ss.android.ugc.aweme.lancet.d.f107193a == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                                                file3 = application.getExternalCacheDir();
                                                com.ss.android.ugc.aweme.lancet.d.f107193a = file3;
                                            } else {
                                                file3 = com.ss.android.ugc.aweme.lancet.d.f107193a;
                                            }
                                            if (file3 != null) {
                                                cVar.f26150e = file3.getAbsolutePath();
                                            }
                                        } catch (Exception unused) {
                                            cVar.f26151f = true;
                                        }
                                    }
                                    cVar.f26152g = cVar.b(aVar.f26132k);
                                    cVar.f26153h = cVar.b(aVar.f26131j);
                                    ArrayList<c.a> arrayList = new ArrayList();
                                    cVar.a(new File(cVar.f26147b), arrayList);
                                    cVar.a(new File(cVar.f26149d), arrayList);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (c.a aVar2 : arrayList) {
                                        Iterator<c.a> it = aVar2.f26164f.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (it.next().f26162d) {
                                                    break;
                                                }
                                            } else {
                                                arrayList2.remove(aVar2);
                                                break;
                                            }
                                        }
                                    }
                                    arrayList.removeAll(arrayList2);
                                    if (com.bytedance.b.e.a.a.r()) {
                                        for (c.a aVar3 : arrayList) {
                                            aVar3.a();
                                        }
                                    }
                                    u<c.b> uVar = new u<>(cVar.f26155j.f26128g);
                                    u<c.b> uVar2 = new u<>(cVar.f26155j.f26129h);
                                    u<c.b> uVar3 = new u<>(cVar.f26155j.f26127f);
                                    List<String> arrayList3 = new ArrayList<>();
                                    arrayList3.add(cVar.f26147b);
                                    arrayList3.add(cVar.f26148c);
                                    cVar.a(cVar.a(cVar.f26147b, uVar, uVar2, uVar3, arrayList3));
                                    arrayList3.clear();
                                    arrayList3.add(cVar.f26150e);
                                    arrayList3.add(cVar.f26149d);
                                    cVar.a(cVar.a(cVar.f26149d, uVar, uVar2, uVar3, arrayList3));
                                    if (com.bytedance.b.e.a.a.r()) {
                                        for (c.b bVar2 : uVar.a()) {
                                            bVar2.a();
                                        }
                                        for (c.b bVar3 : uVar2.a()) {
                                            bVar3.a();
                                        }
                                        for (c.b bVar4 : uVar3.a()) {
                                            bVar4.a();
                                        }
                                    }
                                    cVar.c(arrayList);
                                    bVar = cVar.a(uVar, uVar2, uVar3, arrayList);
                                }
                                if (com.bytedance.b.e.a.a.r()) {
                                    bVar.c();
                                }
                                com.bytedance.b.h.a.a(bVar);
                                a2.edit().putLong("check_disk_last_time", System.currentTimeMillis()).commit();
                            }
                            b.a(com.bytedance.b.k.d.c.LIGHT_WEIGHT).b(a.this.f26119d);
                            if (com.bytedance.b.e.a.a.r()) {
                                System.currentTimeMillis();
                            }
                        }
                    };
                    b.a(com.bytedance.b.k.d.c.LIGHT_WEIGHT).a(this.f26119d);
                }
            }
        }
    }

    public final synchronized void a(com.bytedance.b.d.a.a aVar) {
        if (aVar != null) {
            this.f26117b = aVar;
            if (this.f26118c) {
                com.bytedance.b.j.d.a aVar2 = (com.bytedance.b.j.d.a) com.bytedance.b.j.c.a(com.bytedance.b.j.d.a.class);
                if (aVar2 != null && !aVar2.a()) {
                    a();
                }
            }
        }
    }
}
