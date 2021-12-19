package com.ss.ugc.effectplatform.algorithm;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.h.h;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.g;
import com.ss.ugc.effectplatform.task.aa;
import com.ss.ugc.effectplatform.util.n;
import com.ss.ugc.effectplatform.util.u;
import com.ss.ugc.effectplatform.util.v;
import d.a.d.a.f;
import d.a.e.b;
import h.f.b.l;
import h.m.p;
import h.w;
import java.util.List;

public class d {
    public static final a Companion = new a((byte) 0);
    private final com.ss.ugc.effectplatform.b.a algorithmModelCache;
    private final f buildInAssetsManager;
    private final h eventListener;

    static {
        Covode.recordClassIndex(102323);
    }

    public long getEffectHandle() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onModelFound(String str) {
        l.c(str, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102324);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean isTransRes(String str) {
        return p.b(str, "resource/trans?effectPath=", false);
    }

    /* access modifiers changed from: protected */
    public String getBuiltInResourceUrl(String str) {
        l.c(str, "");
        return "asset://model/".concat(String.valueOf(str));
    }

    public final String readAssetFileAsString(String str) {
        l.c(str, "");
        return this.buildInAssetsManager.b(str);
    }

    /* access modifiers changed from: protected */
    public boolean isExactBuiltInResource(String str) {
        l.c(str, "");
        return this.buildInAssetsManager.a("model/".concat(String.valueOf(str)));
    }

    public String findResourceUri(String str) {
        boolean z;
        l.c(str, "");
        g a2 = this.algorithmModelCache.a(n.a(str));
        if (a2 != null) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            StringBuilder sb = new StringBuilder("file://");
            if (a2 != null) {
                str2 = a2.f153664d;
            }
            return v.a(sb.append(str2).toString());
        } else if (isExactBuiltInResource(str)) {
            return getBuiltInResourceUrl(str);
        } else {
            return null;
        }
    }

    public final boolean isResourceAvailable(String str) {
        l.c(str, "");
        String findResourceUri = findResourceUri(str);
        if (findResourceUri == null || !(!l.a((Object) findResourceUri, (Object) "asset://md5_error")) || !(!l.a((Object) findResourceUri, (Object) "asset://not_found"))) {
            return false;
        }
        return true;
    }

    private final String findTransResUri(String str) {
        List<f> a2;
        String str2;
        String a3 = p.a(p.a(str, "resource/trans?effectPath=", "", false), "\"", "", false);
        if (p.c(a3, "/", false)) {
            a3 = a3.substring(0, a3.length() - 1);
            l.a((Object) a3, "");
        }
        int a4 = p.a((CharSequence) a3, "/");
        if (a3 != null) {
            String substring = a3.substring(0, a4);
            l.a((Object) substring, "");
            String substring2 = a3.substring(p.a((CharSequence) a3, "/") + 1, a3.length());
            l.a((Object) substring2, "");
            String str3 = substring + d.a.d.a.d.f156619a + substring2 + "_trans_";
            l.c(str3, "");
            if (!com.ss.ugc.effectplatform.l.a.f153643a.contains(str3) && (a2 = d.a.d.a.d.a(substring)) != null) {
                for (T t : a2) {
                    if (p.b(t.f156625a, substring2 + "_trans_", false) && (str2 = t.f156626b.f156633a) != null) {
                        return v.a("file://".concat(String.valueOf(str2)));
                    }
                }
            }
            return "asset://not_found";
        }
        throw new w("null cannot be cast to non-null type");
    }

    /* access modifiers changed from: protected */
    public void onModelNotFound(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        RuntimeException runtimeException = new RuntimeException("model not found neither in asset nor disk ".concat(String.valueOf(str2)));
        h hVar = this.eventListener;
        if (hVar != null) {
            hVar.onModelNotFound(null, runtimeException);
        }
    }

    public d(com.ss.ugc.effectplatform.b.a aVar, f fVar, h hVar) {
        l.c(aVar, "");
        l.c(fVar, "");
        this.algorithmModelCache = aVar;
        this.buildInAssetsManager = fVar;
        this.eventListener = hVar;
    }

    private final boolean checkModelMd5(String str, int i2, String str2) {
        ExtendedUrlModel extendedUrlModel;
        if (str2 != null && !isExactBuiltInResource(str)) {
            String a2 = n.a(str);
            String d2 = n.d(str2);
            com.ss.ugc.effectplatform.model.f a3 = aa.a.a().a(i2);
            if (a3 != null) {
                try {
                    extendedUrlModel = a3.a(a2);
                } catch (IllegalArgumentException e2) {
                    b.a("AlgorithmResourceFinder", "model info not found in model list", e2);
                    ModelInfo a4 = aa.a.a().a(i2, a2, true);
                    if (a4 != null) {
                        extendedUrlModel = a4.getFile_url();
                    }
                }
                if (extendedUrlModel != null) {
                    String uri = extendedUrlModel.getUri();
                    if (!u.a(d2, uri)) {
                        String str3 = str + " md5 = " + d2 + " expectedMd5 = " + uri;
                        b.a("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str + "], asset://md5_error\n" + str3);
                        onModelNotFound(a2, str3);
                        return true;
                    }
                }
            }
            b.a("AlgorithmResourceFinder", "expected model info not found in model list", null);
            return false;
        }
        return false;
    }

    public final String realFindResourceUri(int i2, String str, String str2) {
        l.c(str2, "");
        b.a("AlgorithmResourceFinder", "findResourceUri() called with nameStr = [" + str2 + ']');
        if (isTransRes(str2)) {
            return findTransResUri(str2);
        }
        String findResourceUri = findResourceUri(str2);
        try {
            if (checkModelMd5(str2, i2, findResourceUri)) {
                return "asset://md5_error";
            }
        } catch (RuntimeException e2) {
            b.a("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str2 + "], exception hanppens", e2);
        }
        if (findResourceUri == null) {
            b.a("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str2 + "], returned result: [asset://not_found]", null);
            return "asset://not_found";
        }
        b.a("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str2 + "], returned result: [" + findResourceUri + ']');
        onModelFound(str2);
        return findResourceUri;
    }
}
