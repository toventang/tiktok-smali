package com.ss.android.socialbase.downloader.model;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.f;
import com.ss.android.socialbase.downloader.j.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class DownloadChunk implements Parcelable {
    public static final Parcelable.Creator<DownloadChunk> CREATOR = new Parcelable.Creator<DownloadChunk>() {
        /* class com.ss.android.socialbase.downloader.model.DownloadChunk.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37532);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DownloadChunk[] newArray(int i2) {
            return new DownloadChunk[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DownloadChunk createFromParcel(Parcel parcel) {
            return new DownloadChunk(parcel);
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private static final String f60819l = DownloadChunk.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public int f60820a;

    /* renamed from: b  reason: collision with root package name */
    public long f60821b;

    /* renamed from: c  reason: collision with root package name */
    public long f60822c;

    /* renamed from: d  reason: collision with root package name */
    public long f60823d;

    /* renamed from: e  reason: collision with root package name */
    public int f60824e;

    /* renamed from: f  reason: collision with root package name */
    public long f60825f;

    /* renamed from: g  reason: collision with root package name */
    public List<DownloadChunk> f60826g;

    /* renamed from: h  reason: collision with root package name */
    public DownloadChunk f60827h;

    /* renamed from: i  reason: collision with root package name */
    public int f60828i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f60829j;

    /* renamed from: k  reason: collision with root package name */
    public AtomicBoolean f60830k;

    /* renamed from: m  reason: collision with root package name */
    private AtomicLong f60831m;
    private AtomicInteger n;
    private b o;

    public int describeContents() {
        return 0;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f60832a;

        /* renamed from: b  reason: collision with root package name */
        public long f60833b;

        /* renamed from: c  reason: collision with root package name */
        public long f60834c;

        /* renamed from: d  reason: collision with root package name */
        public long f60835d;

        /* renamed from: e  reason: collision with root package name */
        public long f60836e;

        /* renamed from: f  reason: collision with root package name */
        public int f60837f;

        /* renamed from: g  reason: collision with root package name */
        public long f60838g;

        /* renamed from: h  reason: collision with root package name */
        public DownloadChunk f60839h;

        static {
            Covode.recordClassIndex(37533);
        }

        public final DownloadChunk a() {
            return new DownloadChunk(this, (byte) 0);
        }

        public a(int i2) {
            this.f60832a = i2;
        }
    }

    public final boolean b() {
        if (a() == -1) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        List<DownloadChunk> list = this.f60826g;
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    public final long h() {
        AtomicLong atomicLong = this.f60831m;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(37531);
    }

    public final int a() {
        AtomicInteger atomicInteger = this.n;
        if (atomicInteger == null) {
            return -1;
        }
        return atomicInteger.get();
    }

    public final DownloadChunk c() {
        DownloadChunk downloadChunk;
        if (!b()) {
            downloadChunk = this.f60827h;
            if (downloadChunk == null) {
                return null;
            }
        } else {
            downloadChunk = this;
        }
        if (!downloadChunk.d()) {
            return null;
        }
        return downloadChunk.f60826g.get(0);
    }

    public final boolean f() {
        long j2 = this.f60821b;
        if (b()) {
            long j3 = this.f60825f;
            if (j3 > this.f60821b) {
                j2 = j3;
            }
        }
        if (i() - j2 >= this.f60823d) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        DownloadChunk downloadChunk = this.f60827h;
        if (downloadChunk == null) {
            return true;
        }
        if (!downloadChunk.d()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f60827h.f60826g.size(); i2++) {
            DownloadChunk downloadChunk2 = this.f60827h.f60826g.get(i2);
            if (downloadChunk2 != null) {
                int indexOf = this.f60827h.f60826g.indexOf(this);
                if (indexOf > i2 && !downloadChunk2.f()) {
                    return false;
                }
                if (indexOf == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final long g() {
        List<DownloadChunk> list;
        DownloadChunk downloadChunk = this.f60827h;
        if (!(downloadChunk == null || (list = downloadChunk.f60826g) == null)) {
            int indexOf = list.indexOf(this);
            boolean z = false;
            for (int i2 = 0; i2 < this.f60827h.f60826g.size(); i2++) {
                DownloadChunk downloadChunk2 = this.f60827h.f60826g.get(i2);
                if (downloadChunk2 != null) {
                    if (z) {
                        return downloadChunk2.i();
                    }
                    if (indexOf == i2) {
                        z = true;
                    }
                }
            }
        }
        return -1;
    }

    public final long j() {
        long i2 = i() - this.f60821b;
        if (d()) {
            i2 = 0;
            for (int i3 = 0; i3 < this.f60826g.size(); i3++) {
                DownloadChunk downloadChunk = this.f60826g.get(i3);
                if (downloadChunk != null) {
                    i2 += downloadChunk.i() - downloadChunk.f60821b;
                }
            }
        }
        return i2;
    }

    public final long i() {
        if (!b() || !d()) {
            return h();
        }
        long j2 = 0;
        for (int i2 = 0; i2 < this.f60826g.size(); i2++) {
            DownloadChunk downloadChunk = this.f60826g.get(i2);
            if (downloadChunk != null) {
                if (!downloadChunk.f()) {
                    return downloadChunk.h();
                }
                if (j2 < downloadChunk.h()) {
                    j2 = downloadChunk.h();
                }
            }
        }
        return j2;
    }

    private void a(int i2) {
        AtomicInteger atomicInteger = this.n;
        if (atomicInteger == null) {
            this.n = new AtomicInteger(i2);
        } else {
            atomicInteger.set(i2);
        }
    }

    protected DownloadChunk(Parcel parcel) {
        this.f60820a = parcel.readInt();
        this.f60821b = parcel.readLong();
        this.f60831m = new AtomicLong(parcel.readLong());
        this.f60822c = parcel.readLong();
        this.f60823d = parcel.readLong();
        this.f60824e = parcel.readInt();
        this.n = new AtomicInteger(parcel.readInt());
    }

    public final void a(long j2) {
        AtomicLong atomicLong = this.f60831m;
        if (atomicLong != null) {
            atomicLong.set(j2);
        } else {
            this.f60831m = new AtomicLong(j2);
        }
    }

    private DownloadChunk(a aVar) {
        if (aVar != null) {
            this.f60820a = aVar.f60832a;
            this.f60821b = aVar.f60833b;
            this.f60831m = new AtomicLong(aVar.f60834c);
            this.f60822c = aVar.f60835d;
            this.f60823d = aVar.f60836e;
            this.f60824e = aVar.f60837f;
            this.f60825f = aVar.f60838g;
            this.n = new AtomicInteger(-1);
            a(aVar.f60839h);
            this.f60830k = new AtomicBoolean(false);
        }
    }

    public final void a(b bVar) {
        this.o = bVar;
        this.f60825f = i();
    }

    public final long b(boolean z) {
        long i2 = i();
        long j2 = this.f60823d;
        long j3 = this.f60825f;
        long j4 = j2 - (i2 - j3);
        if (!z && i2 == j3) {
            j4 = j2 - (i2 - this.f60821b);
        }
        com.ss.android.socialbase.downloader.e.a.b("DownloadChunk", "contentLength:" + this.f60823d + " curOffset:" + i() + " oldOffset:" + this.f60825f + " retainLen:" + j4);
        if (j4 < 0) {
            return 0;
        }
        return j4;
    }

    public DownloadChunk(Cursor cursor) {
        if (cursor != null) {
            this.f60820a = cursor.getInt(cursor.getColumnIndex("_id"));
            this.f60824e = cursor.getInt(cursor.getColumnIndex("chunkIndex"));
            this.f60821b = cursor.getLong(cursor.getColumnIndex("startOffset"));
            int columnIndex = cursor.getColumnIndex("curOffset");
            if (columnIndex != -1) {
                this.f60831m = new AtomicLong(cursor.getLong(columnIndex));
            } else {
                this.f60831m = new AtomicLong(0);
            }
            this.f60822c = cursor.getLong(cursor.getColumnIndex("endOffset"));
            int columnIndex2 = cursor.getColumnIndex("hostChunkIndex");
            if (columnIndex2 != -1) {
                this.n = new AtomicInteger(cursor.getInt(columnIndex2));
            } else {
                this.n = new AtomicInteger(-1);
            }
            int columnIndex3 = cursor.getColumnIndex("chunkContentLen");
            if (columnIndex3 != -1) {
                this.f60823d = cursor.getLong(columnIndex3);
            }
            this.f60830k = new AtomicBoolean(false);
        }
    }

    public final void a(DownloadChunk downloadChunk) {
        this.f60827h = downloadChunk;
        if (downloadChunk != null) {
            a(downloadChunk.f60824e);
        }
    }

    public final void a(boolean z) {
        AtomicBoolean atomicBoolean = this.f60830k;
        if (atomicBoolean == null) {
            this.f60830k = new AtomicBoolean(z);
        } else {
            atomicBoolean.set(z);
        }
        this.o = null;
    }

    /* synthetic */ DownloadChunk(a aVar, byte b2) {
        this(aVar);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        long j2;
        parcel.writeInt(this.f60820a);
        parcel.writeLong(this.f60821b);
        AtomicLong atomicLong = this.f60831m;
        if (atomicLong != null) {
            j2 = atomicLong.get();
        } else {
            j2 = 0;
        }
        parcel.writeLong(j2);
        parcel.writeLong(this.f60822c);
        parcel.writeLong(this.f60823d);
        parcel.writeInt(this.f60824e);
        int i3 = -1;
        AtomicInteger atomicInteger = this.n;
        if (atomicInteger != null) {
            i3 = atomicInteger.get();
        }
        parcel.writeInt(i3);
    }

    public final List<DownloadChunk> a(int i2, long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        DownloadChunk downloadChunk = this;
        if (!b() || d()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long h2 = h();
        int i3 = 1;
        long b2 = downloadChunk.b(true);
        long j7 = b2 / ((long) i2);
        com.ss.android.socialbase.downloader.e.a.b(f60819l, "retainLen:" + b2 + " divideChunkForReuse chunkSize:" + j7 + " current host downloadChunk index:" + downloadChunk.f60824e);
        int i4 = 0;
        while (i4 < i2) {
            if (i4 == 0) {
                j4 = downloadChunk.f60821b;
                i4 = 0;
            } else {
                int i5 = i2 - 1;
                if (i4 == i5) {
                    j5 = downloadChunk.f60822c;
                    if (j5 > h2) {
                        j6 = (j5 - h2) + 1;
                    } else {
                        j6 = b2 - (((long) i5) * j7);
                    }
                    j4 = h2;
                    a aVar = new a(downloadChunk.f60820a);
                    aVar.f60837f = (-i4) - i3;
                    aVar.f60833b = j4;
                    aVar.f60834c = h2;
                    aVar.f60838g = h2;
                    aVar.f60835d = j5;
                    aVar.f60836e = j6;
                    aVar.f60839h = downloadChunk;
                    DownloadChunk a2 = aVar.a();
                    com.ss.android.socialbase.downloader.e.a.b(f60819l, "divide sub chunk : " + i4 + " startOffset:" + j4 + " curOffset:" + h2 + " endOffset:" + j5 + " contentLen:" + j6);
                    arrayList.add(a2);
                    h2 += j7;
                    i4++;
                    i3 = 1;
                    downloadChunk = this;
                } else {
                    j4 = h2;
                }
            }
            j5 = (h2 + j7) - 1;
            j6 = j7;
            a aVar2 = new a(downloadChunk.f60820a);
            aVar2.f60837f = (-i4) - i3;
            aVar2.f60833b = j4;
            aVar2.f60834c = h2;
            aVar2.f60838g = h2;
            aVar2.f60835d = j5;
            aVar2.f60836e = j6;
            aVar2.f60839h = downloadChunk;
            DownloadChunk a22 = aVar2.a();
            com.ss.android.socialbase.downloader.e.a.b(f60819l, "divide sub chunk : " + i4 + " startOffset:" + j4 + " curOffset:" + h2 + " endOffset:" + j5 + " contentLen:" + j6);
            arrayList.add(a22);
            h2 += j7;
            i4++;
            i3 = 1;
            downloadChunk = this;
        }
        long j8 = 0;
        for (int size = arrayList.size() - 1; size > 0; size--) {
            DownloadChunk downloadChunk2 = (DownloadChunk) arrayList.get(size);
            if (downloadChunk2 != null) {
                j8 += downloadChunk2.f60823d;
            }
        }
        com.ss.android.socialbase.downloader.e.a.b(f60819l, "reuseChunkContentLen:".concat(String.valueOf(j8)));
        DownloadChunk downloadChunk3 = (DownloadChunk) arrayList.get(0);
        if (downloadChunk3 != null) {
            long j9 = this.f60822c;
            if (j9 == 0) {
                j3 = j2 - this.f60821b;
            } else {
                j3 = (j9 - this.f60821b) + 1;
            }
            downloadChunk3.f60823d = j3 - j8;
            downloadChunk3.f60824e = this.f60824e;
            b bVar = this.o;
            if (bVar != null) {
                long j10 = downloadChunk3.f60822c;
                long j11 = this.f60823d - j8;
                if (bVar.f60696a != null) {
                    f fVar = bVar.f60696a;
                    fVar.f60454d = j10;
                    fVar.f60455e = j11;
                }
            }
        }
        this.f60826g = arrayList;
        return arrayList;
    }
}
