package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.b.f;
import com.ss.android.socialbase.downloader.downloader.l;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.segment.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class k implements l {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<DownloadInfo> f60643a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<List<DownloadChunk>> f60644b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<Map<Long, i>> f60645c = new SparseArray<>();

    static {
        Covode.recordClassIndex(37447);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void a(int i2, int i3, int i4, int i5) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void b(int i2, List<DownloadChunk> list) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void b(DownloadChunk downloadChunk) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized void a(DownloadChunk downloadChunk) {
        MethodCollector.i(14368);
        int i2 = downloadChunk.f60820a;
        List<DownloadChunk> list = this.f60644b.get(i2);
        if (list == null) {
            list = new ArrayList<>();
            this.f60644b.put(i2, list);
        }
        list.add(downloadChunk);
        MethodCollector.o(14368);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized boolean a(DownloadInfo downloadInfo) {
        MethodCollector.i(14453);
        boolean z = true;
        if (downloadInfo == null) {
            MethodCollector.o(14453);
            return true;
        }
        if (this.f60643a.get(downloadInfo.getId()) == null) {
            z = false;
        }
        this.f60643a.put(downloadInfo.getId(), downloadInfo);
        MethodCollector.o(14453);
        return z;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized boolean a(int i2, Map<Long, i> map) {
        MethodCollector.i(12156);
        this.f60645c.put(i2, map);
        MethodCollector.o(12156);
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized List<DownloadInfo> b() {
        MethodCollector.i(14342);
        if (this.f60643a.size() == 0) {
            MethodCollector.o(14342);
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f60643a.size());
        for (int i2 = 0; i2 < this.f60643a.size(); i2++) {
            DownloadInfo valueAt = this.f60643a.valueAt(i2);
            if (valueAt != null) {
                arrayList.add(valueAt);
            }
        }
        MethodCollector.o(14342);
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized void c() {
        MethodCollector.i(14472);
        this.f60643a.clear();
        this.f60644b.clear();
        MethodCollector.o(14472);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void b(DownloadInfo downloadInfo) {
        a(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean f(int i2) {
        e(i2);
        d(i2);
        l(i2);
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo g(int i2) {
        DownloadInfo b2 = b(i2);
        if (b2 != null) {
            b2.setStatus(2);
        }
        return b2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo h(int i2) {
        DownloadInfo b2 = b(i2);
        if (b2 != null) {
            b2.setStatus(5);
            b2.setFirstDownload(false);
        }
        return b2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo i(int i2) {
        DownloadInfo b2 = b(i2);
        if (b2 != null) {
            b2.setStatus(1);
        }
        return b2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo j(int i2) {
        DownloadInfo b2 = b(i2);
        if (b2 != null) {
            b2.setStatus(-7);
        }
        return b2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized DownloadInfo b(int i2) {
        DownloadInfo downloadInfo;
        MethodCollector.i(14187);
        try {
            downloadInfo = this.f60643a.get(i2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        MethodCollector.o(14187);
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized void d(int i2) {
        MethodCollector.i(14344);
        this.f60644b.remove(i2);
        MethodCollector.o(14344);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized boolean e(int i2) {
        MethodCollector.i(14469);
        this.f60643a.remove(i2);
        MethodCollector.o(14469);
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized Map<Long, i> k(int i2) {
        Map<Long, i> map;
        MethodCollector.i(12009);
        map = this.f60645c.get(i2);
        MethodCollector.o(12009);
        return map;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized void l(int i2) {
        MethodCollector.i(12302);
        this.f60645c.remove(i2);
        MethodCollector.o(12302);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized List<DownloadChunk> c(int i2) {
        List<DownloadChunk> list;
        MethodCollector.i(14343);
        list = this.f60644b.get(i2);
        MethodCollector.o(14343);
        return list;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized List<i> m(int i2) {
        MethodCollector.i(11855);
        Map<Long, i> map = this.f60645c.get(i2);
        if (map != null) {
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList(map.values());
                MethodCollector.o(11855);
                return arrayList;
            }
        }
        MethodCollector.o(11855);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized List<DownloadInfo> c(String str) {
        MethodCollector.i(14311);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(14311);
            return null;
        } else if (this.f60643a.size() == 0) {
            MethodCollector.o(14311);
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f60643a.size(); i2++) {
                DownloadInfo downloadInfo = this.f60643a.get(this.f60643a.keyAt(i2));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && downloadInfo.getStatus() == -3) {
                    arrayList.add(downloadInfo);
                }
            }
            MethodCollector.o(14311);
            return arrayList;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized List<DownloadInfo> d(String str) {
        boolean z;
        MethodCollector.i(14341);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(14341);
            return null;
        } else if (this.f60643a.size() == 0) {
            MethodCollector.o(14341);
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f60643a.size(); i2++) {
                DownloadInfo downloadInfo = this.f60643a.get(this.f60643a.keyAt(i2));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str)) {
                    int status = downloadInfo.getStatus();
                    if (status == -1 || status == -2 || status == -7 || status == -4 || status == -5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(downloadInfo);
                    }
                }
            }
            MethodCollector.o(14341);
            return arrayList;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized List<DownloadInfo> a(String str) {
        ArrayList arrayList;
        MethodCollector.i(14217);
        arrayList = new ArrayList();
        try {
            int size = this.f60643a.size();
            for (int i2 = 0; i2 < size; i2++) {
                DownloadInfo valueAt = this.f60643a.valueAt(i2);
                if (str != null && str.equals(valueAt.getUrl())) {
                    arrayList.add(valueAt);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        MethodCollector.o(14217);
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized List<DownloadInfo> b(String str) {
        MethodCollector.i(14275);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(14275);
            return null;
        } else if (this.f60643a.size() == 0) {
            MethodCollector.o(14275);
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f60643a.size(); i2++) {
                DownloadInfo downloadInfo = this.f60643a.get(this.f60643a.keyAt(i2));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && f.e(downloadInfo.getStatus())) {
                    arrayList.add(downloadInfo);
                }
            }
            MethodCollector.o(14275);
            return arrayList;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo d(int i2, long j2) {
        DownloadInfo b2 = b(i2);
        if (b2 != null) {
            b2.setCurBytes(j2, false);
            b2.setStatus(-2);
        }
        return b2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized DownloadInfo a(int i2, int i3) {
        DownloadInfo b2;
        MethodCollector.i(14437);
        b2 = b(i2);
        if (b2 != null) {
            b2.setChunkCount(i3);
        }
        MethodCollector.o(14437);
        return b2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo c(int i2, long j2) {
        DownloadInfo b2 = b(i2);
        if (b2 != null) {
            b2.setCurBytes(j2, false);
            b2.setStatus(-3);
            b2.setFirstDownload(false);
            b2.setFirstSuccess(false);
        }
        return b2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo a(int i2, long j2) {
        DownloadInfo b2 = b(i2);
        if (b2 != null) {
            b2.setCurBytes(j2, false);
            if (!(b2.getStatus() == -3 || b2.getStatus() == -2 || f.e(b2.getStatus()) || b2.getStatus() == -4)) {
                b2.setStatus(4);
            }
        }
        return b2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo b(int i2, long j2) {
        DownloadInfo b2 = b(i2);
        if (b2 != null) {
            b2.setCurBytes(j2, false);
            b2.setStatus(-1);
            b2.setFirstDownload(false);
        }
        return b2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized void a(int i2, List<DownloadChunk> list) {
        MethodCollector.i(11688);
        if (list == null) {
            MethodCollector.o(11688);
            return;
        }
        d(i2);
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null) {
                a(downloadChunk);
                if (downloadChunk.d()) {
                    for (DownloadChunk downloadChunk2 : downloadChunk.f60826g) {
                        a(downloadChunk2);
                    }
                }
            }
        }
        MethodCollector.o(11688);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized void a(int i2, int i3, long j2) {
        MethodCollector.i(14386);
        List<DownloadChunk> c2 = c(i2);
        if (c2 == null) {
            MethodCollector.o(14386);
            return;
        }
        for (DownloadChunk downloadChunk : c2) {
            if (downloadChunk != null && downloadChunk.f60824e == i3) {
                downloadChunk.a(j2);
                MethodCollector.o(14386);
                return;
            }
        }
        MethodCollector.o(14386);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo a(int i2, long j2, String str, String str2) {
        DownloadInfo b2 = b(i2);
        if (b2 != null) {
            b2.setTotalBytes(j2);
            b2.seteTag(str);
            if (TextUtils.isEmpty(b2.getName()) && !TextUtils.isEmpty(str2)) {
                b2.setName(str2);
            }
            b2.setStatus(3);
        }
        return b2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final synchronized void a(int i2, int i3, int i4, long j2) {
        MethodCollector.i(14422);
        List<DownloadChunk> c2 = c(i2);
        if (c2 == null) {
            MethodCollector.o(14422);
            return;
        }
        Iterator<DownloadChunk> it = c2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DownloadChunk next = it.next();
            if (next != null && next.f60824e == i4 && !next.d()) {
                if (next.f60826g != null) {
                    for (DownloadChunk downloadChunk : next.f60826g) {
                        if (downloadChunk != null && downloadChunk.f60824e == i3) {
                            downloadChunk.a(j2);
                            MethodCollector.o(14422);
                            return;
                        }
                    }
                    MethodCollector.o(14422);
                    return;
                }
            }
        }
        MethodCollector.o(14422);
    }
}
