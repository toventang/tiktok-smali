package com.ss.android.socialbase.downloader.downloader;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.c.d;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

public interface v extends l {
    static {
        Covode.recordClassIndex(37370);
    }

    void a(SparseArray<DownloadInfo> sparseArray, SparseArray<List<DownloadChunk>> sparseArray2, d dVar);
}
