package com.google.android.play.core.assetpacks;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.ax;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

final class af extends ax {

    /* renamed from: a  reason: collision with root package name */
    private final File f52777a;

    /* renamed from: b  reason: collision with root package name */
    private final File f52778b;

    /* renamed from: c  reason: collision with root package name */
    private final NavigableMap<Long, File> f52779c = new TreeMap();

    static {
        Covode.recordClassIndex(32671);
    }

    af(File file, File file2) {
        this.f52777a = file;
        this.f52778b = file2;
        List<File> a2 = co.a(file, file2);
        if (!a2.isEmpty()) {
            long j2 = 0;
            for (File file3 : a2) {
                this.f52779c.put(Long.valueOf(j2), file3);
                j2 += file3.length();
            }
            return;
        }
        throw new au(a.a("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    private final InputStream a(long j2, Long l2) {
        MethodCollector.i(9037);
        FileInputStream fileInputStream = new FileInputStream((File) this.f52779c.get(l2));
        if (fileInputStream.skip(j2 - l2.longValue()) == j2 - l2.longValue()) {
            MethodCollector.o(9037);
            return fileInputStream;
        }
        au auVar = new au(a.a("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l2}));
        MethodCollector.o(9037);
        throw auVar;
    }

    @Override // com.google.android.play.core.b.ax
    public final long a() {
        Map.Entry<Long, File> lastEntry = this.f52779c.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    @Override // com.google.android.play.core.b.ax
    public final InputStream a(long j2, long j3) {
        MethodCollector.i(9036);
        if (j2 < 0 || j3 < 0) {
            au auVar = new au(a.a("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j2), Long.valueOf(j3)}));
            MethodCollector.o(9036);
            throw auVar;
        }
        long j4 = j2 + j3;
        if (j4 <= a()) {
            Long floorKey = this.f52779c.floorKey(Long.valueOf(j2));
            Long floorKey2 = this.f52779c.floorKey(Long.valueOf(j4));
            if (floorKey.equals(floorKey2)) {
                ae aeVar = new ae(a(j2, floorKey), j3);
                MethodCollector.o(9036);
                return aeVar;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(a(j2, floorKey));
            Collection<File> values = this.f52779c.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new bx(Collections.enumeration(values)));
            }
            arrayList.add(new ae(new FileInputStream((File) this.f52779c.get(floorKey2)), j3 - (floorKey2.longValue() - j2)));
            SequenceInputStream sequenceInputStream = new SequenceInputStream(Collections.enumeration(arrayList));
            MethodCollector.o(9036);
            return sequenceInputStream;
        }
        au auVar2 = new au(a.a("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(a()), Long.valueOf(j4)}));
        MethodCollector.o(9036);
        throw auVar2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
