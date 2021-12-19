package com.facebook.imagepipeline.o;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.h;
import com.facebook.common.k.g;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.common.e;
import com.facebook.imagepipeline.k.c;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class b {
    public final List<Uri> mBackupUris;
    public final com.facebook.imagepipeline.common.a mBytesRange;
    public final a mCacheChoice;
    public final com.facebook.imagepipeline.common.b mImageDecodeOptions;
    public final boolean mIsDiskCacheEnabled;
    public final boolean mIsMemoryCacheEnabled;
    public final boolean mIsResizedImageDiskCacheEnabled;
    public final boolean mLocalThumbnailPreviewsEnabled;
    public final EnumC1183b mLowestPermittedRequestLevel;
    public final d mPostprocessor;
    public final boolean mProgressiveRenderingEnabled;
    public final c mRequestListener;
    public final com.facebook.imagepipeline.common.c mRequestPriority;
    public final d mResizeOptions;
    public final e mRotationOptions;
    private File mSourceFile;
    public final Uri mSourceUri;
    public final int mSourceUriType;

    static {
        Covode.recordClassIndex(29206);
    }

    /* renamed from: com.facebook.imagepipeline.o.b$b  reason: collision with other inner class name */
    public enum EnumC1183b {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        static {
            Covode.recordClassIndex(29208);
        }

        public static EnumC1183b getMax(EnumC1183b bVar, EnumC1183b bVar2) {
            if (bVar.getValue() > bVar2.getValue()) {
                return bVar;
            }
            return bVar2;
        }

        private EnumC1183b(int i2) {
            this.mValue = i2;
        }
    }

    public boolean getAutoRotateEnabled() {
        return this.mRotationOptions.a();
    }

    public int getPreferredHeight() {
        d dVar = this.mResizeOptions;
        if (dVar != null) {
            return dVar.f47748b;
        }
        return 2048;
    }

    public int getPreferredWidth() {
        d dVar = this.mResizeOptions;
        if (dVar != null) {
            return dVar.f47747a;
        }
        return 2048;
    }

    public boolean isResizedImageDiskCacheActuallyEnabled() {
        if (!this.mIsResizedImageDiskCacheEnabled || this.mResizeOptions == null) {
            return false;
        }
        return true;
    }

    public enum a {
        SMALL,
        DEFAULT;

        static {
            Covode.recordClassIndex(29207);
        }
    }

    public synchronized File getSourceFile() {
        File file;
        MethodCollector.i(11502);
        if (this.mSourceFile == null) {
            this.mSourceFile = new File(this.mSourceUri.getPath());
        }
        file = this.mSourceFile;
        MethodCollector.o(11502);
        return file;
    }

    public int hashCode() {
        com.facebook.c.a.e eVar;
        d dVar = this.mPostprocessor;
        if (dVar != null) {
            eVar = dVar.getPostprocessorCacheKey();
        } else {
            eVar = null;
        }
        return Arrays.hashCode(new Object[]{this.mCacheChoice, this.mSourceUri, this.mSourceFile, this.mBytesRange, this.mImageDecodeOptions, this.mResizeOptions, this.mRotationOptions, eVar});
    }

    public String toString() {
        return h.a(this).a("uri", this.mSourceUri).a("cacheChoice", this.mCacheChoice).a("decodeOptions", this.mImageDecodeOptions).a("postprocessor", this.mPostprocessor).a("priority", this.mRequestPriority).a("resizeOptions", this.mResizeOptions).a("rotationOptions", this.mRotationOptions).a("bytesRange", this.mBytesRange).toString();
    }

    public static b fromFile(File file) {
        if (file == null) {
            return null;
        }
        return fromUri(Uri.fromFile(file));
    }

    public static b fromUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        return c.a(uri).a();
    }

    public static b fromUri(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return fromUri(Uri.parse(str));
    }

    public b(c cVar) {
        e eVar;
        boolean z;
        this.mCacheChoice = cVar.f48450g;
        Uri uri = cVar.f48444a;
        this.mSourceUri = uri;
        this.mBackupUris = cVar.f48445b;
        this.mSourceUriType = getSourceUriType(uri);
        this.mProgressiveRenderingEnabled = cVar.f48451h;
        this.mLocalThumbnailPreviewsEnabled = cVar.f48452i;
        this.mImageDecodeOptions = cVar.f48449f;
        this.mResizeOptions = cVar.f48447d;
        if (cVar.f48448e == null) {
            eVar = e.f47751b;
        } else {
            eVar = cVar.f48448e;
        }
        this.mRotationOptions = eVar;
        this.mBytesRange = cVar.p;
        this.mRequestPriority = cVar.f48453j;
        this.mLowestPermittedRequestLevel = cVar.f48446c;
        if (!cVar.f48455l || !g.b(cVar.f48444a)) {
            z = false;
        } else {
            z = true;
        }
        this.mIsDiskCacheEnabled = z;
        this.mIsResizedImageDiskCacheEnabled = cVar.f48456m;
        this.mIsMemoryCacheEnabled = cVar.n;
        this.mPostprocessor = cVar.f48454k;
        this.mRequestListener = cVar.o;
    }

    public boolean equals(Object obj) {
        com.facebook.c.a.e eVar;
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!h.a(this.mSourceUri, bVar.mSourceUri) || !h.a(this.mCacheChoice, bVar.mCacheChoice) || !h.a(this.mSourceFile, bVar.mSourceFile) || !h.a(this.mBytesRange, bVar.mBytesRange) || !h.a(this.mImageDecodeOptions, bVar.mImageDecodeOptions) || !h.a(this.mResizeOptions, bVar.mResizeOptions) || !h.a(this.mRotationOptions, bVar.mRotationOptions)) {
            return false;
        }
        d dVar = this.mPostprocessor;
        com.facebook.c.a.e eVar2 = null;
        if (dVar != null) {
            eVar = dVar.getPostprocessorCacheKey();
        } else {
            eVar = null;
        }
        d dVar2 = bVar.mPostprocessor;
        if (dVar2 != null) {
            eVar2 = dVar2.getPostprocessorCacheKey();
        }
        return h.a(eVar, eVar2);
    }

    private static int getSourceUriType(Uri uri) {
        String substring;
        String lowerCase;
        if (uri == null) {
            return -1;
        }
        if (g.b(uri)) {
            return 0;
        }
        if (g.c(uri)) {
            String path = uri.getPath();
            int lastIndexOf = path.lastIndexOf(46);
            String str = null;
            if (lastIndexOf >= 0 && lastIndexOf != path.length() - 1 && (substring = path.substring(lastIndexOf + 1)) != null && (str = com.facebook.common.f.b.f47087b.get((lowerCase = substring.toLowerCase(Locale.US)))) == null && (str = com.facebook.common.f.b.f47086a.getMimeTypeFromExtension(lowerCase)) == null) {
                str = com.facebook.common.f.a.f47085a.get(lowerCase);
            }
            if (com.facebook.common.f.a.a(str)) {
                return 2;
            }
            return 3;
        } else if (g.d(uri)) {
            return 4;
        } else {
            if (g.f(uri)) {
                return 5;
            }
            if (g.g(uri)) {
                return 6;
            }
            if ("data".equals(g.h(uri))) {
                return 7;
            }
            if ("android.resource".equals(g.h(uri))) {
                return 8;
            }
            return -1;
        }
    }
}
