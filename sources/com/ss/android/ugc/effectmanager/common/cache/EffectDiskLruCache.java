package com.ss.android.ugc.effectmanager.common.cache;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.download.DownloadListener;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.g;
import h.f.b.l;
import h.w;
import java.io.File;
import java.io.InputStream;
import java.util.regex.Pattern;

public final class EffectDiskLruCache implements ICache {
    private OldEffectDiskLruCache realEffectDiskLruCache;

    static {
        Covode.recordClassIndex(95267);
    }

    public EffectDiskLruCache(EffectConfiguration effectConfiguration) {
        this(effectConfiguration, 0, 2, null);
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final void clear() {
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.clear();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final void removePattern(Pattern pattern) {
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.removePattern(pattern);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final boolean has(String str) {
        l.c(str, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.has(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final InputStream queryToStream(String str) {
        l.c(str, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.queryToStream(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final String queryToValue(String str) {
        l.c(str, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.queryToValue(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final boolean remove(String str) {
        l.c(str, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.remove(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final void removePattern(String str) {
        l.c(str, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.removePattern(str);
        }
    }

    public final void removeEffect(Effect effect) {
        l.c(effect, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.removeEffect(effect);
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void readEffectInMemory(Effect effect) {
        String unzipPath;
        String name;
        l.c(effect, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null && (unzipPath = effect.getUnzipPath()) != null && (name = new File(unzipPath).getName()) != null) {
            oldEffectDiskLruCache.readKeyInMemory(name);
        }
    }

    public EffectDiskLruCache(EffectConfiguration effectConfiguration, long j2) {
        l.c(effectConfiguration, "");
        this.realEffectDiskLruCache = OldEffectDiskLruCache.getInstance(effectConfiguration);
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final long save(String str, InputStream inputStream) {
        l.c(str, "");
        l.c(inputStream, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.save(str, inputStream);
        }
        return 0;
    }

    public final void unzipEffectToDisk(Effect effect, MonitorTrace monitorTrace) {
        l.c(effect, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.unzipEffectToDisk(effect, monitorTrace);
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final long save(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.save(str, str2);
        }
        return 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectDiskLruCache(EffectConfiguration effectConfiguration, long j2, int i2, g gVar) {
        this(effectConfiguration, (i2 & 2) != 0 ? -1 : j2);
    }

    public final void writeEffectZipToDisk(Effect effect, InputStream inputStream, String str, long j2, DownloadListener downloadListener) {
        l.c(effect, "");
        l.c(inputStream, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.writeEffectZipToDisk(effect, inputStream, j2, downloadListener);
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
